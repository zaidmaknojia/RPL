package redact;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Redaction_Main {
    static boolean hadError = false;
    static boolean hadRuntimeError = false;
    private static final Interpreter interpreter = new Interpreter();


    public static void main(String[] args) throws IOException {
        if (args.length == 0)
        {
            System.out.println("\nWelcome to the Interactive Interpreter for Redaction.\n>The interactive interpreter currently does not support multi line if statements or functions.\n>Use `exit()` to exit scripting.\n");
            runPrompt();
        }
        else
            runFile(args[0].toString());

        /*
        Scanner s = new Scanner(System.in); //java scanner to allow for input BTW
        boolean continueLanguage = true;
        while(continueLanguage){
            System.out.print("Enter file path or type \"REDACT\" to enter scripting :: ");
            String filepath = s.next();
            if(filepath.equals("REDACT")) {
                System.out.println("Press ctrl+c to exit scripting. To use again, you will have to rerun the main file");
                runPrompt();
            } else
                runFile(filepath);

            System.out.print("Do you want to continue? Y or N :: ");
            String continuance = s.next().toUpperCase();

            if(continuance.equals("N") || continuance.equals("EXIT()"))
                continueLanguage = false;
        }
        */
    }

    public static void runFile(String path) {
        System.out.printf("\nOutput for \'%s\':\n\n",path);
        byte[] bytes = null;
        try {
            bytes = Files.readAllBytes(Paths.get(path));
        } catch (IOException e) {
            System.out.println("File not found. Make sure the directory is correct.");
        }

        run(new String(bytes, Charset.defaultCharset()));
        if (hadError) System.exit(65);
        if (hadRuntimeError) System.exit(70);

        System.out.println("Program Terminated.");
    }

    public static void runPrompt() throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        for (;;) {
            System.out.print("<redact> ::= ");
            String line = reader.readLine();
            if (line.toLowerCase().equals("exit()"))
            {
                System.out.println("Program terminated.");
                System.exit(0);
            } else if (line.equals("begone thot")){
                System.out.println("Thot has begone. Program Terminated.");
                System.exit(0);
            }
            if (line == null) break;
            run(line);
            hadError = false;
        }
    }

    public static void run(String s) {
        redact.Scanner scanner = new redact.Scanner(s);
        List<Token> tokens = scanner.scanTokens();
        Parser parser = new Parser(tokens);
        List<Stmt> statements = parser.parse();

        // Stop if there was a syntax error.
        if (hadError) return;
        interpreter.interpret(statements);
        //System.out.println(new AstPrinter().print(expression));
    }

    static void runtimeError(RuntimeError error) {
        System.err.println(error.getMessage() + "\n[line " + error.token.line + "]");
        hadRuntimeError = true;
    }

    public static void error(int line, String message) {
        report(line, "", message);
    }

    private static void report(int line, String where, String message) {
        System.err.println(
                "[line " + line + "] Error" + where + ": " + message);
        hadError = true;
    }

    static void error(Token token, String message) {
        if (token.type == TokenType.EOF) {
            report(token.line, " at end", message);
        } else {
            report(token.line, " at '" + token.lexeme + "'", message);
        }
    }
}





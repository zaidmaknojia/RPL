---
sidebarDepth: 2
---
# Language Features

Here are the main language features represented in Redaction:

## Tokens and lexing

- This is the initial point in the program where the source code is broken down into tokens.

## Abstract Syntax Trees (AST)

- This was our first major hurdle in the language design: we had to become familiar with grammars, syntax tree design, and traversal through a syntax tree.
- Here we also laid some foundational error checking, such as `Expression expected`.
- This sets the interpreter up for parsing through the tree and assigning meaning to each bit of syntax.

## Recursive Descent Parsing

- At this point, the interpreter would be able to recursively traverse through the AST and either assign meaning to the expressions or generate error checking paradigms.
- After this point, Redaction was a glorified calculator.

## Prefix and Infix Expressions

- This is how calculations are represented in Redaction.
- For example, `1+2` would compile down to `+ 1 2` in the AST. 

## Interpreting Code Using the Visitor Pattern
- The Visitor design pattern is deeply intertwined throughout the source code.
- Usually, programs are structured around either adding more methods to a class (trivial) or adding more classes that share the same methods (having an interface or superclass). However, when one needs to do *both* of these operations, it becomes a pain with conventional programming paradigms.
- The Visitor design pattern efficiently allows you to do both of these operations with ease, although it definitely took us a while to wrap our heads around it.

## Lexical Scope

- Demonstrated in Redaction by its ability to support scoping through complex nesting of functions, program control, and nested statements.

## Environment Chains for Storing Variables
- Redaction supports using environments at different nested levels of the program, whether they be if statments or functions, to both store new variables and check if previously defined variables are being used and/or redefined.

## Control Flow

- Demonstrated in Redaction by its statements and loops.

## Functions with Parameters

- Demonstrated by Redaction's ability to cope with parameters in the environment chains.

<br><br><br>

**Created by Zaid Maknojia and Harish Bommakanti**
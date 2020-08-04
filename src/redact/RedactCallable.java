package redact;

import java.util.List;

interface RedactCallable {
    int arity();
    Object call(Interpreter interpreter, List<Object> arguments);
}
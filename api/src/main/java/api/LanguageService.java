package api;

import io.helidon.webserver.Routing;
import io.helidon.webserver.ServerRequest;
import io.helidon.webserver.ServerResponse;
import io.helidon.webserver.Service;

public class LanguageService implements Service {

    @Override
    public void update(Routing.Rules rules) {
        rules
            .get("/", this::getDefaultMessageHandler);
    }

    private void getDefaultMessageHandler(
        ServerRequest request, 
        ServerResponse response
    ) {
        String langs = "{ " +
            "language: 'Abap', " +
            "language: 'Ada', " +
            "language: 'Arduino', " +
            "language: 'ArnoldC', " +
            "language: 'Assembly', " +
            "language: 'AutoIt', " +
            "language: 'Autohotkey', " +
            "language: 'Awk', " +
            "language: 'Bash', " +
            "language: 'Batch', " +
            "language: 'Befunge', " +
            "language: 'BrainFuck', " +
            "language: 'C, C++', " +
            "language: 'COBOL', " +
            "language: 'Chicken', " +
            "language: 'Clojure', " +
            "language: 'Coffee', " +
            "language: 'Crystal', " +
            "language: 'D', " +
            "language: 'Dart', " +
            "language: 'Deadfish', " +
            "language: 'Eiffel', " +
            "language: 'Elixir', " +
            "language: 'Elm', " +
            "language: 'F', " +
            "language: 'FORTRAN', " +
            "language: 'Go', " +
            "language: 'Groovy', " +
            "language: 'HTML + CSS', "  + 
            "language: 'Haskell', " +
            "language: 'Haxe', " +
            "language: 'HolyC', " +
            "language: 'Hy', " +
            "language: 'Java', " +
            "language: 'JavaScript', " +
            "language: 'Julia', " +
            "language: 'Kotlin', " +
            "language: 'LOLCODE', " +
            "language: 'Lisp', " +
            "language: 'Lua', " +
            "language: 'MATLAB', " +
            "language: 'Magik', " +
            "language: 'Malbolge', " +
            "language: 'Mcscript', " +
            "language: 'Nim', " +
            "language: 'Nix', " +
            "language: 'OCaml', " +
            "language: 'Objective', " +
            "language: 'Octave', " +
            "language: 'Omgrofl', " +
            "language: 'Ook', " +
            "language: 'PHP', " +
            "language: 'Pascal', " +
            "language: 'Perl', " +
            "language: 'Piet', " +
            "language: 'Pikalang', " +
            "language: 'Pony', " +
            "language: 'Powershell', " +
            "language: 'Prolog', " +
            "language: 'Python', " +
            "language: 'QBASIC', " +
            "language: 'R', " +
            "language: 'Racket', " +
            "language: 'ReasonML', " +
            "language: 'Rockstar', " +
            "language: 'Ruby', " +
            "language: 'Rust', " +
            "language: 'SAS', " +
            "language: 'SQL', " +
            "language: 'Scala', " +
            "language: 'Scilab', " +
            "language: 'Scratch', " +
            "language: 'Sed', " +
            "language: 'Shakespeare Programming Language, " +
            "language: 'Smalltalk', " +
            "language: 'Standard L, " +
            "language: 'Swift', " +
            "language: 'TCL', " +
            "language: 'Tex', " +
            "language: 'Trumpscript', " +
            "language: 'TypeScript', " +
            "language: 'V', " +
            "language: 'VBScript', " +
            "language: 'VHDL', " +
            "language: 'Vim', " +
            "language: 'VisualBasic', " +
            "language: 'Wasm'" +
        "}";
        
        response.status(200);
        response.send(langs);
    }
}

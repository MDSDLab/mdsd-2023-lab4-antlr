package main.codegen;

import main.data.WebtestInputTable;

// TODO: JS code generation
public class WebtestJsCodeGenerator extends WebtestCodeGenerator {
    public WebtestJsCodeGenerator(WebtestInputTable inputTable) {
        super("src\\main\\codegen\\stringtemplate\\JsGen.stg", "js", inputTable);
    }
}

package main.codegen;

import main.data.WebtestInputTable;

// TODO: HTML code generation
public class WebtestHtmlCodeGenerator extends WebtestCodeGenerator {
    public WebtestHtmlCodeGenerator(WebtestInputTable inputTable) {
        super("src\\main\\codegen\\stringtemplate\\HtmlGen.stg", "html", inputTable);
    }
}

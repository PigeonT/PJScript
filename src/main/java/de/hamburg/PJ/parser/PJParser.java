package de.hamburg.PJ.parser;

import de.hamburg.PJ.model.PJModel;

import java.util.List;

public final class PJParser {


    public void ast(List<PJModel> tokens) {
        for(PJModel m : tokens) {
            System.out.println(m);
        }
    }
}

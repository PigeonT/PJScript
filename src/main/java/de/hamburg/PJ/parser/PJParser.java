package de.hamburg.PJ.parser;

import de.hamburg.PJ.token.PJToken;

import java.util.List;

public final class PJParser {
    public void ast(List<PJToken> tokens) {
        for(PJToken m : tokens) {
            System.out.println(m);
        }
    }
}

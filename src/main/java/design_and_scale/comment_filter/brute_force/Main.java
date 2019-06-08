package design_and_scale.comment_filter.brute_force;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("in main");
        ContentPrincipal cp = new ContentPrincipal();
        List<String> badWords = Arrays.asList("fuck", "ass", "poop");
        for (String w: badWords) {
            cp.addBannedWord(w);
        }
        System.out.println(cp.getBannedWords());

        cp.ingestText();
    }
}


// TextScanner - loops through each word/sentence/document looking for matching regex from CP
// ContentPrincipal - defines 'inappropriate content'
// SampleText
package design_and_scale.comment_filter.brute_force;
import java.io.*;
import java.util.*;

public class ContentPrincipal {
    private ArrayList<String> bannedWords = new ArrayList<String>();
    private String commentsFilePath = "/Users/ty/src/scratch/src/main/java/design_and_scale/comment_filter/brute_force/comments.txt";

    public ArrayList<String> getBannedWords() {
        return this.bannedWords;
    }

    public void addBannedWord(String badWord) {
        bannedWords.add(badWord);
    }

    public void ingestText() throws IOException {
        File comments = new File(commentsFilePath);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(comments));
        String st;
        while ((st = bufferedReader.readLine()) != null) {
            checkForBadWords(st);
        }
        //call filter method
        //return clean words
    }

    private void checkForBadWords(String st) {
        if (getBannedWords().contains(st)) {
            System.out.println("bad word: " + st);
        }
        else {
            System.out.println("no bad words here: " + st);
        }

    }
}

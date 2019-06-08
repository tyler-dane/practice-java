package java_basics.recursion.anagram;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/** this class ... */ //todo comment
public class EnglishDictionary {

    private Set<String> wordsSet;

    public EnglishDictionary() throws IOException {
        Path path = Paths.get("english-words.txt");

        byte[] readBytes = Files.readAllBytes(path);

        String wordListContents = new String(readBytes, "UTF-8");

        String[] words = wordListContents.split("\n");

        wordsSet = new HashSet<>();

        Collections.addAll(wordsSet, words);
    }

    public boolean contains(String word)
    {
        return wordsSet.contains(word);
    }

    public static void main(String[] args) {
        //todo add stuff here
    }
}

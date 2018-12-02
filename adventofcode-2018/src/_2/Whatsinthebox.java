package _2;

import java.io.*;
import java.util.*;

public class Whatsinthebox {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Hugo\\IdeaProjects\\adventofcode-2018\\src\\_2\\puzzleinput.txt"));
        System.out.println("Checksum is : " + occurencesChecker(bufferedReader));
    }

    // Solves part one
    static long occurencesChecker(BufferedReader reader) throws IOException {
        String curr = "";
        int twos = 0, threes = 0;
        while((curr = reader.readLine()) != null){
            Map<Character, Integer> occurences = new HashMap<>();
            for(char c : curr.toCharArray()){
                occurences.merge(c, 1, (a,b) -> a+b);
            }
            Set<Integer> uniqueOccurences = new HashSet<>(occurences.values());
            if(uniqueOccurences.contains(2)) twos++;
            if(uniqueOccurences.contains(3)) threes++;
        }
        return twos*threes;
    }

    //Part two ..
}


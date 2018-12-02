package _2;

import java.io.*;
import java.util.*;

public class Whatsinthebox {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter puzzle..\n");
        BufferedReader reader = new BufferedReader(new FileReader(scanner.next()));
        System.out.println("Checksum is : " + occurencesChecker(reader));
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


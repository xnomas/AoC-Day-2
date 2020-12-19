package day2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws IOException {
        File input = new File("input.txt");
        int ctr = 0;

        Scanner sc = new Scanner(input);

        long start = System.currentTimeMillis();

        while(sc.hasNextLine()) {
            String line = sc.nextLine();

            String[] tokens = line.split(" ");
            String[] numbers = tokens[0].split("-");

            Password pass = new Password(Integer.parseInt(numbers[0]),
                    Integer.parseInt(numbers[1]),
                    tokens[1].charAt(0),
                    tokens[2]);

            if(check_passwd(pass)) {
                ctr++;
            }
        }
        long end = System.currentTimeMillis();
        double total_time = (end - start);

        System.out.println("Found " + ctr + " valid passwords, in " + total_time + " ms");
        sc.close();
    }

    public static boolean check_passwd(Password pass) {
        int len_1 = pass.getLen1(), len_2 = pass.getLen2(), occurs = 0;
        char delim = pass.getDelim();
        String passwd = pass.getPasswd();

        for(char ch : passwd.toCharArray()) {
            if(ch == delim) {
                occurs++;
            }
        }
        if(occurs >= len_1 && occurs <= len_2) {
            return true;
        }
        return false;
    }


}

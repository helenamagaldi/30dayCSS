import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) {
    boolean flag = true;

        for(int i=0;i<16;i++){
            if(i%3==0){
                System.out.print("Fizz");
                flag=false;
            }

            if(i%5==0){
                System.out.print("Buzz");
                flag=false;
            }

            if (flag)
                System.out.print(i);

            System.out.print(",");

            flag = true;

        }


    }

}

public class Solution {
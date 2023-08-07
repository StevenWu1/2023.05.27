import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int price[] = new int[n];
        int sortedPrice[] = new int[n];
        String name[] = new String[n];
        for (int i = 0; i < n; i++){
            price[i] = sc.nextInt();
            sortedPrice[i] = price[i];
            name[i] = sc.nextLine();
        }
        Arrays.sort(sortedPrice);
        if (n % 2 == 0){
            int priceF = sortedPrice[n/2 - 1];
            int priceS = sortedPrice[n/2];
            String first = "", second = "";
            for (int i = 0; i < n; i++){
                int current = price[i];
                if (current == priceF){
                    first = name[i];
                }
                if (current == priceS){
                    second = name[i];
                }
            }
            System.out.println(first.substring(1) + " and" + second);
        } else {
            int pricef = sortedPrice[n/2];
            String first = "";
            for (int i = 0; i < n; i++){
                int current = price[i];
                if (current == pricef){
                    first = name[i];
                }
            }
            System.out.println(first.substring(1));
        }
    }
}

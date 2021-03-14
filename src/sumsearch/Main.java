package sumsearch;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] ints = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(scanner.nextLine());
        Map<Integer,Integer> integerMap=new LinkedHashMap<>();
        for (int i = 0; i <ints.length ; i++) {
           if(!integerMap.containsKey(ints[i])){
               integerMap.put(n-ints[i],i);
           }else{
               System.out.println(integerMap.get(ints[i]));
               System.out.println(i);
               break;

           }
        }
    }
}

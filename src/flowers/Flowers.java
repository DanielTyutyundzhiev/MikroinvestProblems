package flowers;

import java.util.*;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int k= Integer.parseInt(scanner.nextLine());
        int[] c = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int minimumCost=getMinimumCost(k,c);
        System.out.println(minimumCost);


    }

    private static int getMinimumCost(int k, int[] c) {
        Arrays.sort(c);
        int previousPurchases=0;
        int minCost=0;
        int count=0;
        for (int i =c.length-1 ; i >=0; i--) {
            if(count==k) {
                previousPurchases++;
                count=0;
            }
            minCost+=(1+previousPurchases)*c[i];
            count++;

        }
        return minCost;


    }
}

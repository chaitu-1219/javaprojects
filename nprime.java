package xyz;

import java.util.*;
class nprime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i=2;
        while (i<=num){
            int dcount=0;
            int primechecker=2;
            while(primechecker<=(i/2)){
                if(i%primechecker==0){
                    dcount++;
                }
                primechecker++;
            }
            if(dcount==0){
                System.out.println(i+ " ");
            }
            i++;
    }
}
}
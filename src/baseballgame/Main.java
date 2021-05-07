package baseballgame;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args){
        int[] rdnum = new int[3];
        int[] innum = new int[3];
        int chkSt = 0;
        int chkBl;
        boolean rdchk;

        for(int i=0; i <3; i++){
            int dnum = (int)(Math.random()*10);
            rdnum[i] = dnum;
            if(i >=1){
                rdchk = true;
                while (rdchk){
                    int innumval = dnum;
                    if(IntStream.of(rdnum).anyMatch(x -> x == innumval)){
                        dnum = (int)(Math.random()*10);
                        continue;
                    }else {
                        rdnum[i] = dnum;
                        rdchk = false;
                    }
                }

            }
            System.out.println(rdnum[i]);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("-----Start-----");

        while(chkSt < 3) {
            chkSt = 0;
            chkBl = 0;
            for(int i = 0; i<3;i++){
                innum[i] = sc.nextInt();
            }
            for(int i = 0; i<3;i++){
                int innumval = innum[i];
                if(rdnum[i]==innum[i]){
                    chkSt +=1;
                }else if(IntStream.of(rdnum).anyMatch(x -> x == innumval)){
                    chkBl +=1;
                }
            }
            System.out.println(chkSt + " strike");
            System.out.println(chkBl + " ball");
        }

        sc.close();
    }
}

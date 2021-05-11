package lotto;

import java.util.stream.IntStream;

public class LottoRandom {
    public static void main(String[] args){
        int[] box = new int[6];
        boolean chk = true;
        for(int i = 0; i<6; i++){
            chk = true;
            while(chk){
                int a = (int)(Math.random()*45)+1;
                if(i==0){
                    box[i]=a;
                    chk=false;
                }else if(IntStream.of(box).anyMatch(x -> x == a)){
                    continue;
                }else{
                    box[i]=a;
                    chk=false;
                }
            }
        }
        for(int i : box){
            System.out.print(i+" ");
        }



    }
}

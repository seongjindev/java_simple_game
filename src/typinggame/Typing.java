package typinggame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Typing {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inputStreamReader);
        String[] wise = {"Rome is not built in a day"
                        ,"love what you have"
                        ,"It ain't over till it's over"
                        ,"Life is not fair, get used to it"
                        ,"Habit is second nature"} ;
        int idx = (int)(Math.random()*4)+0;
        System.out.println(wise[idx]);
        LocalTime st = LocalTime.now();
        String line = br.readLine();
        LocalTime ed = LocalTime.now();
        long diff = ChronoUnit.SECONDS.between(st,ed);
        int du = wise[idx].length()/(int)diff*60;
        if(wise[idx].equals(line)){
            System.out.println("success and typing/min = " + du);
        }else{
            System.out.println("fail");
        }


    }
}

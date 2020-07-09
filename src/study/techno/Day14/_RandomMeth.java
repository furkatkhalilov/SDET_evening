package study.techno.Day14;

import java.util.Random;

public class _RandomMeth {
    public static void main(String[] args) {

        for(int i= 0 ; i<100 ; i++){
            System.out.println(randomGenerator(10));

        }

    }

    public static int randomGenerator(int max){
        Random rnd = new Random();

        return rnd.nextInt(max);
    }
}

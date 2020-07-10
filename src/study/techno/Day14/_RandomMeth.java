package study.techno.Day14;

import java.util.ArrayList;
import java.util.Random;

public class _RandomMeth {
    public static void main(String[] args) {

        ArrayList<Integer> AllRandomNumbers = new ArrayList<>();

//        AllRandomNumbers.add(1);
//        AllRandomNumbers.add(2);
//        AllRandomNumbers.add(3);
        AllRandomNumbers.add(4);
//        AllRandomNumbers.add(5);
//        AllRandomNumbers.add(6);
//        AllRandomNumbers.add(7);
//        AllRandomNumbers.add(8);
//        AllRandomNumbers.add(9);

        int randomNumber = randomGenerator(12);

        System.out.println("random number in the first print "+randomNumber);

        if(!AllRandomNumbers.contains(randomNumber)){
            AllRandomNumbers.add(randomNumber);

        }else{
//            in the else java might create the same number
            randomNumber = randomGenerator(12);
        }
        System.out.println("random number in the second  print "+randomNumber);


        System.out.println(AllRandomNumbers);

    }

    public static int randomGenerator(int max){
        Random rnd = new Random();

        return rnd.nextInt(max);
    }
}

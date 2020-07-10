package study.techno.Day14;

import java.util.ArrayList;
import java.util.Random;

public class _RandomMeth {
    public static void main(String[] args) {

        ArrayList<Integer> AllRandomNumbers = new ArrayList<>();

//        To create a multiple random numbers we are using for loop just for testing
        for(int i = 0 ; i<5 ; i++){

            int randomNumber = randomGenerator(5);

            System.out.println("random number in the first print "+randomNumber);

            boolean isRandomDuplicate = true;

//            While isRandomDuplicate is true run this code this will help us to generate unique random number
            while(isRandomDuplicate){

                System.out.println("random number before the if " + randomNumber);

//                If random number is not in the arraylist then add random number in the list and make the isRandomDuplicate false
                if(!AllRandomNumbers.contains(randomNumber)){
                    AllRandomNumbers.add(randomNumber);
                    isRandomDuplicate=false;

//                    create the random number again if the random number in the list
                }else{

//                    In the else java might create the same number
                    randomNumber = randomGenerator(5);
                }
                System.out.println("random number after the if " + randomNumber);
            }

            System.out.println("random number in the last  print "+randomNumber);

            System.out.println(AllRandomNumbers);
        }
    }

    public static int randomGenerator(int max){
        Random rnd = new Random();

        return rnd.nextInt(max);
    }
}

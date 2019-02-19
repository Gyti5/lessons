package lt.baltictalents.lessons.api.utils;

import lombok.val;

import java.util.Random;

public class RandomGenerator {
    static public boolean generateRandomBoolean(){
        val random = new Random();
        if((random.nextInt((10-1)+1)+1)%2==1){
            return true;
        }
        return false;
    }
}

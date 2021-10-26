package JavaOOPSconcepts;

import org.junit.Test;

public class AT15_AbstractClass03 extends AT17_AbstractClass04 {


    //we know the logic for this below method
    @Test
    public void subNum(){
        int x=100;
        int y=20;
        System.out.println("sub of 2 number is : " +(x-y));

    }
    //we dont know the logic for this below method
    @Test
    public void divNum()
    {
        int x=100;
        int y=20;
        System.out.println("div of 2 number is : " +(x/y));
    }

}

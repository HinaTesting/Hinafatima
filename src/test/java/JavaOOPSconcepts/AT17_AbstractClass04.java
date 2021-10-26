package JavaOOPSconcepts;

import org.junit.Test;

public abstract class AT17_AbstractClass04 {

    //we know the logic for this below method
    @Test
    public void sumNum(){
        int x=10,y=20;
        //int z=20;
        System.out.println("addation of 2 number is : " +(x+y));

    }
    //we know the logic for this below method
   // @Test
    public abstract void subNum();
    //we dont know the logic for this below method
    //@Test
    public abstract void divNum();

}

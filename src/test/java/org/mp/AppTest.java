package org.mp;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {
    //negative test case
    @Test
   public void testLogin1(){
        App myapp = new App();
       Assert.assertEquals(0,myapp.userLogin("abc@gmail.com","abc1"));
   }

   //positive test case
   @Test
   public void testLogin2(){
       App myapp = new App();
       Assert.assertEquals(1,myapp.userLogin("abc@gmail.com","abc"));
   }
}

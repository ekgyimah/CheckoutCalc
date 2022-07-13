package com.company;

import org.junit.Assert;
import org.junit.Test;

public class TestClass {

    @Test
    public void testCheckoutPrice(){
        String[] items = new String[]{"B","A","B"};
        String result = Main.checkout(items);

        Assert.assertEquals("9500", result);
    }

    @Test
    public void testCheckoutPriceOnlyPromo(){
        String[] items = new String[]{"B","B","B","B","B","B","B"};
        String result = Main.checkout(items);

        Assert.assertEquals("16500", result);
    }

    @Test
    public void testCheckoutPrice4Promo(){
        String[] items = new String[]{"A","B","B","B","B"};
        String result = Main.checkout(items);

        Assert.assertEquals("14000", result);
    }

    @Test
    public void testCheckoutPrice3Promo(){
        String[] items = new String[]{"A","B","B","B","A","A"};
        String result = Main.checkout(items);

        Assert.assertEquals("20500", result);
    }

    @Test
    public void testCheckoutNoPromo(){
        String[] items = new String[]{"C","D"};
        String result = Main.checkout(items);

        Assert.assertEquals("3500", result);
    }

    @Test
    public void testCheckoutPrice3Items(){
//        String[] items = new String[]{"A","B","B","C","A","B","D","D","A","D","A"};
        String[] items = new String[]{"A","B","B","C"};
        String result = Main.checkout(items);

        Assert.assertEquals("11500", result);
    }

    @Test
    public void testCheckoutPriceAllItems(){
        String[] items = new String[]{"A","B","B","C","A","B","D","D","A","D","A"};
        String result = Main.checkout(items);

        Assert.assertEquals("32000", result);
    }

}

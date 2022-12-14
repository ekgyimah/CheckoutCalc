package com.company;

import java.util.*;

public class Main {
    public static String checkout(String[] items){
        Integer result = 0;
        Integer tempRes = 0;
        HashMap <String, Integer> promoItemMap = new HashMap<>();

        //Sort products
        List<String> sortedItems = Arrays.asList(items);
        sortedItems.sort(Comparator.naturalOrder());

        for (String item : sortedItems) {
            Product currentProduct = config().get(item); //Get checkout product

            if(!currentProduct.getSpecialPrice()){
                result += new Integer(currentProduct.getPrice());
            } else {
                if(promoItemMap.containsKey(currentProduct.getSKU())){
                    Integer currentNumberItem = promoItemMap.get(currentProduct.getSKU());
                    currentNumberItem++;
                    promoItemMap.put(currentProduct.getSKU(), currentNumberItem);

                    //Evaluate promo rule
                    if(currentNumberItem%currentProduct.getRule().getAmount() == 0){
                        tempRes = new Integer(currentProduct.getRule().getSpecialPromoDiscount())
                                * (currentNumberItem/currentProduct.getRule().getAmount());
                    } else {
                        tempRes += new Integer(currentProduct.getPrice());
                    }

                } else {
                    result += tempRes; //Add temp calculation to final result
                    promoItemMap.put(currentProduct.getSKU(), 1);
                    tempRes = new Integer(currentProduct.getPrice());
                }
            }
        }

        result += tempRes; //Add any temp calculation to final result
        return result.toString();
    }

    public static HashMap<String, Product> config(){

        Rule promoFor2 = new Rule(2, "4500");
        Rule promoFor3 = new Rule(3, "13000");

        Product A = new Product("A","5000", true, promoFor3);
        Product B = new Product("B", "3000", true, promoFor2);
        Product C = new Product("C", "2000", false, null);
        Product D = new Product("D", "1500", false, null);


        HashMap<String, Product> productMap = new HashMap<>();

        productMap.put(A.getSKU(), A);
        productMap.put(B.getSKU(), B);
        productMap.put(C.getSKU(), C);
        productMap.put(D.getSKU(), D);

        return productMap;
    }

}

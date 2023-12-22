package org.example;

public class Main {
    public static void main(String args[]){
        StringProcessor processor = new StringProcessor();

        boolean testing1 = processor.isStrongPassword("mng999vol&");
        System.out.println(testing1);

        int testing2 = processor.calculateDigits("Ala Too 65656");
        System.out.println(testing2);

        int testing3 = processor.calculateWords("ala too univer bishkek");
        System.out.println(testing3);

        double testing4 = processor.calculateExpression("1 + 12212");
        System.out.println(testing4);

    }
}

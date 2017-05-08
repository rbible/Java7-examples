package org.sewatech.java7.coin;

/**
 * @author alexis
 * @Message 类型自动赋值, 类型自动转换
 */
public class FormattedLiterals {

    public static void main(String[] args) {
        long val1 = 2365876245L;
        long val2 = 2_365_876_245L;

        int decimalValue = 229;
        System.out.println(decimalValue);

        int binaryValue = 0B011100101;
        System.out.println(binaryValue);

        int hexaValue = 0xe5;
        System.out.println(hexaValue);

        int octalValue = 0345;
        System.out.println(octalValue);

        long longval = 188;
        System.out.println(longval);
    }
}

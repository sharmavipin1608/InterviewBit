/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maths;

/**
 *
 * @author vipinsharma
 */
public class ReverseInteger {

    public static int reverse(int a) {
        double b = 0;
        int c;
        boolean neg = false;

        if (a < 0) {
            a = (-a);
            neg = true;

        }
        while (a > 0) {
            int mod = a % 10;
            b = b * 10;
            b += mod;
            a = a / 10;
        }

        if (neg) {
            b = (-b);
        }

        if (b > Integer.MAX_VALUE || b < Integer.MIN_VALUE) {
            return 0;
        } else {
            c = (int) b;
        }
        return c;
    }

    public static void main(String args[]) {
        //Integer.
        System.out.println(reverse(-2046467285));
    }
}

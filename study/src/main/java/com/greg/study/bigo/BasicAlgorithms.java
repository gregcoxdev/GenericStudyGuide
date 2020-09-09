package com.greg.study.bigo;

import java.math.BigInteger;

public class BasicAlgorithms {

    int n = 10;

    public int executeConstantAlgorithm() {
        return n;
    }

    public int executeLogarithmicAlgorithm() {
        int total = 0;
        for (int i = 1; i < n; i = i * 2) {
            total += i;
        }
        return total;
    }

    public int executeLinearAlgorithm() {
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += i;
        }
        return total;
    }

    public int executeNLogNAlgorithm() {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
            for(int j = 1; j < 8; j = j * 2) {
                total += j;
            }
        }
        return total;
    }

    public int executePolynomialAlgorithm() {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
            for(int j = 1; j <= n; j++) {
                total += j;
            }
        }
        return total;
    }

    public int executeExponentialAlgorithm() {
        int total = 0;
        for (int i = 1; i <= Math.pow(2, n); i++) {
            total += i;
        }
        return total;
    }

    public int executeFactorialAlgorithm() {
        int total = 0;
        for (int i = 1; i <= factorial(BigInteger.valueOf(n)).intValue(); i++) {
            total += i;
        }
        return total;
    }

    public static BigInteger factorial(BigInteger number) {
        int j = 0;
        BigInteger result = BigInteger.valueOf(1);

        for (long factor = 2; factor <= number.longValue(); factor++) {
            result = result.multiply(BigInteger.valueOf(factor));
        }

        return result;
    }

}

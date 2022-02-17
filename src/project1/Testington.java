package project1;

import java.math.BigInteger;

public class Testington {

    public static void main(String[] args) {
        BigInteger integerToBeTested = new BigInteger("531137992816767098689588206552468627329593117727031923199444138200403559860852242739162502265229285668889329486246501015346579337652707239409519978766587351943831270835393219031728127");
        int iterations = 20;

        RabinMiller rabinMiller = new RabinMiller();

        System.out.println(rabinMiller.calculate(integerToBeTested, iterations));


    }
}

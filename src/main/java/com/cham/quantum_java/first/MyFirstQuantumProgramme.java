package com.cham.quantum_java.first;

import com.gluonhq.strange.algorithm.Classic;

public class MyFirstQuantumProgramme {

    public static void main (String[] args) {
        System.out.println("Using Strange API to generate Qubits");
        int randomBit = Classic.randomBit();
        System.out.println("Generate one random bit : 0 or 1 = "+randomBit);
        int zeroCount = 0;
        int onesCount = 0;
        for (int i = 0; i < 100000; i++) {
            if (Classic.randomBit() > 0) {
                onesCount ++;
            } else {
                zeroCount ++;
            }
        }
        System.out.println("Out of 100,000 Qubits " + zeroCount + " are 0 and " + onesCount + " are 1s");
    }

}

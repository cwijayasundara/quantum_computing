package com.cham.quantum_java.first;

import com.gluonhq.strange.*;
import com.gluonhq.strange.gate.X;
import com.gluonhq.strange.local.SimpleQuantumExecutionEnvironment;

public class PauliXGate {

    private static QuantumExecutionEnvironment simulator = new SimpleQuantumExecutionEnvironment();
    private static Program program = new Program(1);
    private static Step step = new Step();

    public static void main(String[] args) {
        qubit0();
        qubit1();
    }

    private static void qubit0() {
        step.addGate(new X(0));
        program.addStep(step);
        Result result = simulator.runProgram(program);
        Qubit[] qubits = result.getQubits();
        Qubit zero = qubits[0];
        int value = zero.measure();
        System.out.println("Value = "+value);
    }

    private static void qubit1() {
        step.addGate(new X(1));
        program.addStep(step);
        Result result = simulator.runProgram(program);
        Qubit[] qubits = result.getQubits();
        Qubit one = qubits[0];
        int value = one.measure();
        System.out.println("Value = "+value);
    }

}

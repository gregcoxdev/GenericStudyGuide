package com.greg.study;

import com.greg.study.bigo.BasicAlgorithms;
import com.greg.study.commands.TimedCommand;

public class StudyGuideMain {

    public static void main(String[] args) {

        System.out.println("Starting tests.");

        // Create the class that we wish to invoke tests from.
        BasicAlgorithms basicAlgorithms = new BasicAlgorithms();

        TimedCommand<BasicAlgorithms> timedAlgorithmsCommand = new TimedCommand<>();

        // Constant algorithm test.
        System.out.println("Executing constant algorithm test.");
        timedAlgorithmsCommand.execute(basicAlgorithms, value -> basicAlgorithms.executeConstantAlgorithm());

        // Logarithmic algorithm test.
        System.out.println("Executing logarithmic algorithm test.");
        timedAlgorithmsCommand.execute(basicAlgorithms, value -> basicAlgorithms.executeLogarithmicAlgorithm());

        // Linear algorithm test.
        System.out.println("Executing linear algorithm test.");
        timedAlgorithmsCommand.execute(basicAlgorithms, value -> basicAlgorithms.executeLinearAlgorithm());

        // NLogN algorithm test.
        System.out.println("Executing NLogN algorithm test.");
        timedAlgorithmsCommand.execute(basicAlgorithms, value -> basicAlgorithms.executeNLogNAlgorithm());

        // Polynomial algorithm test.
        System.out.println("Executing polynomial algorithm test.");
        timedAlgorithmsCommand.execute(basicAlgorithms, value -> basicAlgorithms.executePolynomialAlgorithm());

        // Exponential algorithm test.
        System.out.println("Executing exponential algorithm test.");
        timedAlgorithmsCommand.execute(basicAlgorithms, value -> basicAlgorithms.executeExponentialAlgorithm());

        // Factorial algorithm test.
        System.out.println("Executing factorial algorithm test.");
        timedAlgorithmsCommand.execute(basicAlgorithms, value -> basicAlgorithms.executeFactorialAlgorithm());

    }

}
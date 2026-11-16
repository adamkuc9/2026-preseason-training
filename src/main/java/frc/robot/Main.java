// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.RobotBase;

/**
 * Do NOT add any static variables to this class, or any initialization at all. Unless you know what
 * you are doing, do not modify this file except to change the parameter class to the startRobot
 * call.
 */
public final class Main {
  private Main() {}

  /**
   * Main initialization function. Do not perform any initialization here.
   *
   * <p>If you change your main robot class, change the parameter type.
   */
  public static void main(String... args) {
    // RobotBase.startRobot(Robot::new);

    System.out.println("Hello world!");

    // Week 2:
    System.out.println("Adam");

    int x = 5;
    System.out.println(x);

    double topSpeed = 20.5;
    System.out.println(topSpeed);

    boolean canDoAutos = true;
    System.out.println(canDoAutos);

    String nameOfRobot = "Stella";
    System.out.println(nameOfRobot);

    double num1 = 10;
    double num2 = 3;

    System.out.println(num1 + num2);
    System.out.println(num1 - num2);
    System.out.println(num1 * num2);
    System.out.println(num1 / num2);

    // Robot math lab (week 2):

    double topSpeedMPS = 4.936;
    double mpstoMPH = 2.237;
    double topSpeedMPH = topSpeedMPS * mpstoMPH;
    System.out.println(topSpeedMPH);

    int autoSeconds = 20;
    int teleopSeconds = 140;
    int matchSeconds = autoSeconds + teleopSeconds;
    System.out.println("match time: " + matchSeconds / 60 + ":" + matchSeconds % 60);

    double wheelRadiusMeters = 0.0515507563;
    double wheelCircumferenceMeters = 2 * Math.PI * wheelRadiusMeters;

    double target = 45.0;
    double measured = 41.5;
    double tolerance = 5.0;
    double error = Math.abs(measured - target);
    boolean atSpeed = (error <= tolerance);
    System.out.println(error);
    System.out.println(atSpeed);


    double wheelDiameter = 4.0;
    boolean hasFuel = true;
    String robotName = "Savanna";
    int teamNumber = 3061;
    double average = 5.0 / 2.0;
    System.out.println(average);

  }

}

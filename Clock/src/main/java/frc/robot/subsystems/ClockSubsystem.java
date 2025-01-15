// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;


import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ClockSubsystem extends SubsystemBase {
  
  TalonFX motor1;
  TalonFX motor2;
  TalonFX motor3;
  TalonFX motor4;

  public ClockSubsystem() {
    //initialize necessary fields
    motor1 = new TalonFX(0);
    motor2 = new TalonFX(0);
    motor3 = new TalonFX(0);
    motor4 = new TalonFX(0);
  }

  ///////////Methods

  //SetPosition
  public void setPosition(double speed){
    motor1.set(speed);
    motor2.set(-speed);
    motor3.set(speed);
    motor4.set(-speed);
    //motor.setControl(new VoltageOut(position))
  }

  //GetPosition

  //SetSpeed

  //GetSpeed



  @Override
  public void periodic() {
    // No code needed here
  }
}
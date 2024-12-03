// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;


import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ClockSubsystem extends SubsystemBase {
  
  //Needs TalonFX motor

  public ClockSubsystem() {
    //initialize necessary fields
  }

  ///////////Methods

  //SetPosition
  //The method for setting position is:
  //        motor.setControl(new VoltageOut(yourPositionInRotations))

  //GetPosition

  //SetSpeed

  //GetSpeed



  @Override
  public void periodic() {
    // No code needed here
  }
}

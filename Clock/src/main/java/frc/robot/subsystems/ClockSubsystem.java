// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;


import com.ctre.phoenix6.configs.Slot0Configs;
import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.controls.PositionVoltage;
import com.ctre.phoenix6.controls.VoltageOut;
import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.signals.GravityTypeValue;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ClockSubsystem extends SubsystemBase {
  
  //Needs TalonFX motor
  TalonFX motor;

  TalonFXConfiguration config = new TalonFXConfiguration().withSlot0(
                                                    new Slot0Configs().withKP(1.5)
                                                                      .withKI(0.2)
                                                                      .withKD(0.1)
                                                                      .withKG(0.2)
                                                                      .withGravityType(GravityTypeValue.Arm_Cosine));
  public ClockSubsystem() {
    //initialize necessary fields
    motor = new TalonFX(6);
    motor.getConfigurator().apply(config);
  }

  ///////////Methods

  public void SetPosition(double position){
    motor.setControl(new PositionVoltage(position));
  }

  //GetPosition
  public double GetPosition(){
    return motor.getPosition().getValue();
  }

  public void SetSpeed(double speed){
    motor.set(speed);
  }
  //SetSpeed


  public double getSpeed(){
    return motor.get();
  }
  //GetSpeed



  @Override
  public void periodic() {
    // No code needed here
  }
}

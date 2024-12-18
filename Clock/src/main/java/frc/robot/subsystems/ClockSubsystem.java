// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ClockSubsystem extends SubsystemBase {

  public TalonFX clockMotor = new TalonFX(Constants.kMotorPort);

  /** Creates a new ExampleSubsystem. */
  public ClockSubsystem() {} 

  public void setSpeed(double speed){
    clockMotor.set(-speed);
  }
  
  public double getSpeed(){
    return clockMotor.get();
  }

  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
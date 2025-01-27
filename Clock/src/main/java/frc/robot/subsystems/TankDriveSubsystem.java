// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import frc.robot.Constants;
import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

/** Add your docs here. */
public class TankDriveSubsystem extends SubsystemBase {
  
  public TalonFX frontleftDriveMotor;
  public TalonFX frontrightDriveMotor;
  public TalonFX backleftDriveMotor;
  public TalonFX backrightDriveMotor;
  

  public TankDriveSubsystem() {

    frontleftDriveMotor = new TalonFX(Constants.tankdriveConstants.frontleftDriveMotorPort);
    backleftDriveMotor = new TalonFX (Constants.tankdriveConstants.backleftDriveMotorPort);
    frontrightDriveMotor = new TalonFX(Constants.tankdriveConstants.frontrightDriveMotorPort);
    backrightDriveMotor = new TalonFX (Constants.tankdriveConstants.backrightDriveMotorPort);
   
    

    
    
    
    frontleftDriveMotor.setInverted(true);
    backleftDriveMotor.setInverted(true);
    
    
  }

  public void setRightSpeed(double speed) {
    MathUtil.clamp(speed, -0.7,0.7);
    frontrightDriveMotor.set(speed);
    backrightDriveMotor.set(speed);
    
  }

  public void setLeftSpeed(double speed) {
    MathUtil.clamp(speed, -0.7,0.7);
    frontleftDriveMotor.set( speed);
    backleftDriveMotor.set(speed);
    
  }

  public void setSpeed(double leftSpeed, double rightSpeed) {
    this.setRightSpeed(rightSpeed);
    this.setLeftSpeed(leftSpeed);
  }

  public void setSpeed(double speed) {
    this.setRightSpeed(speed);
    this.setLeftSpeed(speed);
  }




  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}

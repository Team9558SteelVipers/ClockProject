// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Subsystem;
public class motorCommandDynOpp extends Command {

  Subsystem m_Subsystem;
  Supplier <Double> speed;
  public motorCommandDynOpp(Subsystem Subsystem, Supplier<Double> newSpeed) {
    m_Subsystem = Subsystem;
    speed = newSpeed;
    addRequirements(Subsystem);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    // Deadzone for joysticks
    if (Math.abs(speed.get())>0.05){
      // set motor speed of left side motors to joystick values
      m_Subsystem.setMotorSpeedDynOpp(speed.get());
    } else{
      
    }
}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}

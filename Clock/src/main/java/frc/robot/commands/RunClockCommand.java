// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.Constants;
import frc.robot.subsystems.ClockSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;



/** An example command that uses an example subsystem. */
public class RunClockCommand extends Command {
 
  private final ClockSubsystem m_subsystem;

public RunClockCommand(ClockSubsystem m_subsystem) {
  this.m_subsystem = m_subsystem;
   // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(m_subsystem);
}
  


  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
   m_subsystem.setMotorSpeed(Constants.setMotorSpeed);
   //m_subsystem.setClockPosition(Constants.clockPosition);
  }


  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}
  


  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    int setMotorSpeed = 0;
     m_subsystem.setMotorSpeed(setMotorSpeed);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }

  
}

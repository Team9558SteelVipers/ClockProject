// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
// let me save
package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystems.MotorSubsystem;
public class CommandStatic extends Command {

//private final MotorSubsystem m_Subsystem = new MotorSubsystem();
  double speed;
  MotorSubsystem m_MotorSubsystem;
  private final MotorSubsystem m_Subsystem = m_MotorSubsystem;
  public CommandStatic(MotorSubsystem Subsystem, Double newSpeed){
  m_MotorSubsystem = Subsystem;
    
    speed = newSpeed;
    addRequirements(Subsystem);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    // Takes in speed and sets all
    
    m_MotorSubsystem.setMotorSpeed(speed);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    
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
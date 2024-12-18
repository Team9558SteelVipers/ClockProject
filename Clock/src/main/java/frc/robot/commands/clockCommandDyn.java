// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ClockSubsystem;
public class clockCommandDyn extends Command {

  ClockSubsystem m_ClockSubsystem;
  Supplier <Double> speed;
  public clockCommandDyn(ClockSubsystem clockSubsystem, Supplier<Double> newSpeed) {
    m_ClockSubsystem = clockSubsystem;
    speed = newSpeed;
    addRequirements(clockSubsystem);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    // m_ClockSubsystem.setClockSpeedDyn(speed);
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

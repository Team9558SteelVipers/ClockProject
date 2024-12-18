// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ClockSubsystem;

public class PositionCommand extends Command {
  /** Creates a new positionCommand. */
  double targetPosition = 0;
  ClockSubsystem clock;
  public PositionCommand(ClockSubsystem clock, double defaultpos) {
    this.clock = clock;
    targetPosition = defaultpos;
    addRequirements(clock);
    // Use addRequirements() here to declare subsystem dependencies.
  }


  public void addTime(double rotations){
    targetPosition += rotations;
  }

  public void setTime(double rotations){
    targetPosition = rotations;
  }
  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    clock.SetPosition(targetPosition);
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

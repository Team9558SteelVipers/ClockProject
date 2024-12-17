// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;


import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.commands.SpeedCommand;
import frc.robot.subsystems.ClockSubsystem;





public class RobotContainer {


  //Initialize Subsystem

  ClockSubsystem clock = new ClockSubsystem();
  SpeedCommand speedCommand = new SpeedCommand(clock);

  //Initialize both commands

  //m_positionCommand
  //m_speedCommand


  public RobotContainer() {
    // Configure the trigger bindings
    configureBindings();
  }


  private void configureBindings() {
    clock.setDefaultCommand(speedCommand);
  }

  public Command getAutonomousCommand() {
    return null;
  }
}

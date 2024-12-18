// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;


import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.commands.PositionCommand;
import frc.robot.commands.SpeedCommand;
import frc.robot.subsystems.ClockSubsystem;





public class RobotContainer {


  //Initialize Subsystem

  ClockSubsystem clock = new ClockSubsystem();
  SpeedCommand speedCommand = new SpeedCommand(clock);
  PositionCommand positionCommand = new PositionCommand(clock, 0);
  CommandXboxController controller = new CommandXboxController(0);

  //Initialize both commands

  //m_positionCommand
  //m_speedCommand


  public RobotContainer() {
    // Configure the trigger bindings
    configureBindings();
  }


  private void configureBindings() {

    controller.a().onTrue(new InstantCommand(() -> {
      positionCommand.addTime(0.5);
    }));
    controller.b().onTrue(new InstantCommand(() -> {
      positionCommand.setTime(0);
    }));

    clock.setDefaultCommand(positionCommand);
  }

  public Command getAutonomousCommand() {
    return null;
  }
}

// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;


import frc.robot.commands.DynamicClockCommand;
import frc.robot.commands.RunClockCommand;
import frc.robot.subsystems.ClockSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final ClockSubsystem m_exampleSubsystem = new ClockSubsystem();
  
  private CommandXboxController m_controller = new CommandXboxController(Constants.controllerPort);

  private final DynamicClockCommand m_ClockCommand10 = new DynamicClockCommand(m_exampleSubsystem, 0.1);
   private final DynamicClockCommand m_ClockCommand35 = new DynamicClockCommand(m_exampleSubsystem, 0.2);
    private final DynamicClockCommand m_ClockCommand60 = new DynamicClockCommand(m_exampleSubsystem, 0.4);
     private final DynamicClockCommand m_ClockCommand100 = new DynamicClockCommand(m_exampleSubsystem, 1.0);
   //* */
   //* Use this to pass the autonomous command to the main {@link Robot} class.
   //*
   //* @return the command to run in autonomous
  // */
  public Command getAutonomousCommand() {
    // An example command will be run in autonomous
    return null;
  }
     
  public RobotContainer() {
    // Configure the trigger bindings
    configureBindings();
  }

  private void configureBindings() {
      m_controller.a().whileTrue(m_ClockCommand10);
      m_controller.b().whileTrue(m_ClockCommand35);
      m_controller.x().whileTrue(m_ClockCommand60);
      m_controller.y().whileTrue(m_ClockCommand100);

    
  }

   }



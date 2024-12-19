// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.commands.clockCommandDyn;
import frc.robot.commands.clockCommandStatic;
import frc.robot.commands.clockPosition;
import frc.robot.subsystems.ClockSubsystem;

import java.time.Clock;

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
  private final ClockSubsystem m_ClockSubsystem = new ClockSubsystem();
  CommandXboxController xcontroller = new CommandXboxController(0);
  private clockCommandDyn m_dynCommand = new clockCommandDyn(m_ClockSubsystem, xcontroller :: getRightX);
  private clockCommandStatic m_ClockCommandSp25 = new clockCommandStatic(m_ClockSubsystem,0.25);
  private clockCommandStatic m_ClockCommandSp50 = new clockCommandStatic(m_ClockSubsystem,0.5);
  private clockCommandStatic m_ClockCommandSp75 = new clockCommandStatic(m_ClockSubsystem,0.75);
  private clockCommandStatic m_ClockCommandSp100 = new clockCommandStatic(m_ClockSubsystem,1.0);
  private clockPosition m_ClockPosition = new clockPosition(m_ClockSubsystem);
  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the trigger bindings
    configureBindings();
  }

  private void configureBindings() {
    xcontroller.a().whileTrue(m_ClockCommandSp25);
    xcontroller.rightTrigger().whileTrue(m_ClockCommandSp100);
    xcontroller.leftTrigger().whileTrue(m_ClockPosition);
    m_ClockSubsystem.setDefaultCommand(m_dynCommand);
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An example command will be run in autonomous
    return null;
  }
}

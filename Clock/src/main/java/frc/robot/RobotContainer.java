// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.commands.CoralOuttake;
import frc.robot.commands.motorCommandDyn;
import frc.robot.commands.motorCommandDynOpp;
import frc.robot.commands.motorCommandStatic;
import frc.robot.subsystems.Subsystem;

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
  private final Subsystem m_Subsystem = new Subsystem();
  CommandXboxController xcontroller = new CommandXboxController(0); 
  private motorCommandDyn m_dynCommand = new motorCommandDyn(m_Subsystem, xcontroller :: getRightY);
  private motorCommandDynOpp m_dynCommandOpp = new motorCommandDynOpp(m_Subsystem, xcontroller :: getLeftY);
  private motorCommandStatic m_ClockCommandSp25 = new motorCommandStatic(m_Subsystem,0.25);
  private motorCommandStatic m_ClockCommandSp50 = new motorCommandStatic(m_Subsystem,0.5);
  private motorCommandStatic m_ClockCommandSp75 = new motorCommandStatic(m_Subsystem,0.75);
  private motorCommandStatic m_ClockCommandSp100 = new motorCommandStatic(m_Subsystem,1.0);
  private CoralOuttake m_CoralOuttake = new CoralOuttake(m_Subsystem);
  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the trigger bindings
    configureBindings();
  }

  private void configureBindings() {
    xcontroller.a().whileTrue(m_ClockCommandSp25);
    xcontroller.x().whileTrue(m_CoralOuttake);
    xcontroller.rightTrigger().whileTrue(m_ClockCommandSp50);
    m_Subsystem.setDefaultCommand(m_dynCommand);
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

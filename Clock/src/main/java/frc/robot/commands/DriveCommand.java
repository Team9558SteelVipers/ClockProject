// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.OI;
import frc.robot.subsystems.TankDriveSubsystem;

public class DriveCommand extends Command {
  

  private XboxController m_driverController;
  private TankDriveSubsystem m_tankdriveSusbsytem;

  public DriveCommand(TankDriveSubsystem tankDriveSubsystem, OI operatorInput) {

    m_tankdriveSusbsytem = tankDriveSubsystem;
    m_driverController = operatorInput.getDriverController();
    addRequirements(tankDriveSubsystem);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_tankdriveSusbsytem.setRightSpeed(m_driverController.getRightY());
    m_tankdriveSusbsytem.setLeftSpeed(m_driverController.getLeftY());


  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Command;

import java.util.function.Supplier;

import com.ctre.phoenix6.controls.PositionVoltage;
import com.ctre.phoenix6.hardware.TalonFX;



import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.Constants;

public class ClockSubsystem extends SubsystemBase{
    TalonFX clockMotor;
    public ClockSubsystem() {
        clockMotor = new TalonFX(Constants.clockMotorPort);
    }

    public void setClockSpeed(double speed) {
        clockMotor.set(speed);
    }

    public void setPosition(double position) {
        clockMotor.setControl(new PositionVoltage(position));
    }
    public void setClockSpeedDyn(double speed) {
        clockMotor.set(speed);
    }

}
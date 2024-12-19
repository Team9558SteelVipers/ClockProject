package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Command;

import java.util.function.Supplier;

import com.ctre.phoenix6.configs.Slot0Configs;
import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.controls.PositionVoltage;
import com.ctre.phoenix6.hardware.TalonFX;



import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.Constants;

public class ClockSubsystem extends SubsystemBase{
    TalonFX clockMotor;
    TalonFXConfiguration pidconfig = new TalonFXConfiguration().withSlot0(new Slot0Configs().withKP(1).withKI(0).withKD(0));
    public ClockSubsystem() {
        clockMotor = new TalonFX(Constants.clockMotorPort);
        clockMotor.getConfigurator().apply(pidconfig);
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
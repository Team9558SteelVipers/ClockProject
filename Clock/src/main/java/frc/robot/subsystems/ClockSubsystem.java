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
    TalonFX Motor1;
    TalonFX Motor2;
    TalonFX Motor3;
    TalonFX Motor4;
    TalonFX CoralMotor;
    TalonFXConfiguration pidconfig = new TalonFXConfiguration().withSlot0(new Slot0Configs().withKP(1).withKI(0).withKD(0));
    public ClockSubsystem() {
        Motor1 = new TalonFX(Constants.motorPort1);
        Motor2 = new TalonFX(Constants.motorPort2);
        Motor3 = new TalonFX(Constants.motorPort3);
        Motor4 = new TalonFX(Constants.motorPort4);
        CoralMotor = new TalonFX(Constants.motorPort5);
        Motor1.getConfigurator().apply(pidconfig);
        Motor2.getConfigurator().apply(pidconfig);
        Motor3.getConfigurator().apply(pidconfig);
        Motor4.getConfigurator().apply(pidconfig);
    }

    public void setMotorSpeed(double speed) {
        Motor1.set(speed);
        Motor2.set(speed);
        Motor3.set(-speed);
        Motor4.set(-speed);
    }
    public void outtakeCoral(){
      CoralMotor.set(0.3);
    }


    public void setClockSpeedDyn(double speed) {
        Motor1.set(speed);
        Motor2.set(speed);
    }
    public void setClockSpeedDynOpp(double speed) {
        Motor3.set(speed);
        Motor4.set(speed);
    }

}
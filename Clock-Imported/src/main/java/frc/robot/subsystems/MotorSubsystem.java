package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Command;

import java.util.function.Supplier;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix6.configs.Slot0Configs;
import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.controls.PositionVoltage;
import com.ctre.phoenix6.hardware.TalonFX;



import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.Constants;

public class MotorSubsystem extends SubsystemBase{
    TalonSRX FrontR;
    TalonSRX BackR;
    TalonSRX FrontL;
    TalonSRX BackL;
 
    // TalonFXConfiguration pidconfig = new TalonFXConfiguration().withSlot0(new Slot0Configs().withKP(1).withKI(0).withKD(0));
    public MotorSubsystem() {
        FrontR = new TalonSRX(Constants.MotorPortFR);
        BackR = new TalonSRX(Constants.MotorPortBR);
        FrontL = new TalonSRX(Constants.MotorPortFL);
        BackL = new TalonSRX(Constants.MotorPortBL);

        // Motor1.getConfigurator().apply(pidconfig);
        // Motor2.getConfigurator().apply(pidconfig);
        // Motor3.getConfigurator().apply(pidconfig);
        // Motor4.getConfigurator().apply(pidconfig);
    }

    public void setMotorSpeed(double speed) {
        FrontR.set(ControlMode.PercentOutput,speed);
        BackR.set(ControlMode.PercentOutput,speed);
        FrontL.set(ControlMode.PercentOutput,-speed);
        BackL.set(ControlMode.PercentOutput,-speed);
    }


    public void setMotorSpeedDyn(double speedright, double speedleft) {
        FrontR.set(ControlMode.PercentOutput,speedright);
        BackR.set(ControlMode.PercentOutput,speedright);
        FrontL.set(ControlMode.PercentOutput,-speedleft);
        BackL.set(ControlMode.PercentOutput,-speedleft);
    }
    

}
package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Command;

import java.util.function.Supplier;

import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.controls.PositionVoltage;
import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;



import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.math.MathUtil;
import frc.robot.Constants;

public class MotorSubsystem extends SubsystemBase{
  public TalonSRX frontleftDriveMotor;
  public TalonSRX frontrightDriveMotor;
  public TalonSRX backleftDriveMotor;
  public TalonSRX backrightDriveMotor;


    /*frontleftDriveMotor.@setInverted(true);
    backleftDriveMotor.@setInverted(true);
    **/
 
    // TalonSRXConfiguration pidconfig = new TalonSRXConfiguration().withSlot0(new Slot0Configs().withKP(1).withKI(0).withKD(0));
    public MotorSubsystem() {
        frontleftDriveMotor = new TalonSRX(Constants.MotorPortFL);
        frontrightDriveMotor = new TalonSRX(Constants.MotorPortFR);
        backleftDriveMotor = new TalonSRX(Constants.MotorPortBL);
        backrightDriveMotor = new TalonSRX(Constants.MotorPortBR);
   

        // MotorPortFL.getConfigurator().apply(pidconfig);
        // MotorPortFR.getConfigurator().apply(pidconfig);
        // MotorPortBL.getConfigurator().apply(pidconfig);
        // MotorPortBR.getConfigurator().apply(pidconfig);
    }

    public void setMotorSpeed(double speed) {
        frontleftDriveMotor.set(ControlMode.PercentOutput,-speed);
        frontrightDriveMotor.set(ControlMode.PercentOutput,speed);
        backleftDriveMotor.set(ControlMode.PercentOutput,-speed);
        backrightDriveMotor.set(ControlMode.PercentOutput,speed);
    }


    public void setMotorSpeedDyn(double speedright, double speedleft) {
        frontleftDriveMotor.set(ControlMode.PercentOutput,-speedleft);
        frontrightDriveMotor.set(ControlMode.PercentOutput,speedright);
        backleftDriveMotor.set(ControlMode.PercentOutput,-speedleft);
        backrightDriveMotor.set(ControlMode.PercentOutput,speedright);
    }
   

}



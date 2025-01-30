package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Command;

import java.util.function.Supplier;
import com.ctre.phoenix6.configs.Slot0Configs;
import com.ctre.phoenix6.controls.PositionVoltage;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;



import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.Constants;

public class CoralSubsystem extends SubsystemBase{
    TalonSRX CoralMotor;
    public CoralSubsystem() {
        TalonSRX CoralMotor = new TalonSRX(Constants.coralMotorPort);
    }

    public void outtakeCoral(){
      CoralMotor.set(ControlMode.PercentOutput, 0.3);
    }


}

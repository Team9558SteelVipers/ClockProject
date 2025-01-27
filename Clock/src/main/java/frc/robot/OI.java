package frc.robot;

import static frc.robot.Constants.oiConstants.*;

import edu.wpi.first.wpilibj.XboxController;

//A = 1
//B = 2
//X = 3
//Y = 4

public class OI {

   static XboxController driverController;
    static XboxController operatorController;

    public OI(){
        driverController = new XboxController(driverControllerPort);
        operatorController = new XboxController(operatorControllerPort);
        
        
    }

    public XboxController getDriverController() {
        return driverController;
    }

    public XboxController getOperatorController() {
        return operatorController;
    }
}

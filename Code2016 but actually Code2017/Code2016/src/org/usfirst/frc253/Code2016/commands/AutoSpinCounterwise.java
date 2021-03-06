package org.usfirst.frc253.Code2016.commands;

import org.usfirst.frc253.Code2016.Robot;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.interfaces.Gyro;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class AutoSpinCounterwise extends Command {

	private AnalogGyro gyro;
	
    public AutoSpinCounterwise(){
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.drivetraintank);
    	requires(Robot.sensorData);
    	gyro = Robot.sensorData.gyro;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	setTimeout(1.0);
    	gyro.reset();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double gyroAngle = gyro.getAngle();
    	SmartDashboard.putNumber("Gyroscope Angle", gyroAngle);
    	if(gyroAngle < -10){
    	Robot.drivetraintank.setLeft_Back(.35);
    	Robot.drivetraintank.setLeft(.35);
    	Robot.drivetraintank.setRight(-.35);
    	Robot.drivetraintank.setRight_Back(-.35);
    	} else {
    		Robot.drivetraintank.setLeft_Back(0);
        	Robot.drivetraintank.setLeft(0);
        	Robot.drivetraintank.setRight(0);
        	Robot.drivetraintank.setRight_Back(0);
    		
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.drivetraintank.setLeft_Back(0);
    	Robot.drivetraintank.setLeft(0);
    	Robot.drivetraintank.setRight(0);
    	Robot.drivetraintank.setRight_Back(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}

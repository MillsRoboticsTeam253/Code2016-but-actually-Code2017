//package org.usfirst.frc253.Code2017.commands;
//
//
//import com.ni.vision.NIVision;
//import com.ni.vision.NIVision.DrawMode;
//import com.ni.vision.NIVision.Image;
//import com.ni.vision.NIVision.ShapeMode;
//
//import edu.wpi.first.wpilibj.CameraServer;
//import edu.wpi.first.wpilibj.Timer;
//import edu.wpi.first.wpilibj.Ultrasonic;
//import edu.wpi.first.wpilibj.command.Command;
//import edu.wpi.first.wpilibj.interfaces.Accelerometer;
//import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
//import edu.wpi.first.wpilibj.vision.AxisCamera;
//
///**
// *
// */
//public class ShooterAutoCorrect extends Command {
//	
//	Ultrasonic ultra1;
//	Ultrasonic ultra2;
//	Ultrasonic ultra3;
//	Ultrasonic ultra4;
//    int session;
//    Image frame;
//    AxisCamera camera; //note: supposed to be USB camera, not Axis
//    public ShooterAutoCorrect() {
//    	
//    	ultra1 = new Ultrasonic(7,6);
//    	ultra2 = new Ultrasonic(9,8);
//    	ultra3 = new Ultrasonic(11,10);
//    	ultra4 = new Ultrasonic(13,12);
//    	ultra1.setAutomaticMode(true);
//    	ultra2.setAutomaticMode(true);
//    	ultra3.setAutomaticMode(true);
//    	ultra4.setAutomaticMode(true);
//    	
//    	// turns on automatic mode
//        // Use requires() here to declare subsystem dependencies
//        // eg. requires(chassis);
//    }
//
//    // Called just before this Command runs the first time
//    protected void initialize() {
//    }
//
//    // Called repeatedly when this Command is scheduled to run
//    protected void execute() {
//
//    	double range1 = ultra1.getRangeInches();
//    	double range2 = ultra2.getRangeInches();
//    	double range3 = ultra3.getRangeInches();
//    	double range4 = ultra4.getRangeInches();
// 		  
//    }
//
//    // Make this return true when this Command no longer needs to run execute()
//    protected boolean isFinished() {
//        return false;
//    }
//
//    // Called once after isFinished returns true
//    protected void end() {
//    }
//
//    // Called when another command which requires one or more of the same
//    // subsystems is scheduled to run
//    protected void interrupted() {
//    }
//}

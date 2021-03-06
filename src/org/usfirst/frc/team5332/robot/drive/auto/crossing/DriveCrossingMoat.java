package org.usfirst.frc.team5332.robot.drive.auto.crossing;

import org.usfirst.frc.team5332.robot.drive.base.DriveCommandLayer;

import utils.time.ToasterTimer;

public class DriveCrossingMoat extends DriveAutoCrossing{
	/*
	 * Set the drive time
	 * Set the drive speed
	 * Rinse
	 * Repeat
	 * 
	 * 
	 * 
	 * Also 3 and 0.75 are not the correct values so we should look into what the actual values are.
	 */
	
	public DriveCrossingMoat(){
		driveTime = 3.25;
		driveSpeed = -1;
	}

	public DriveCrossingMoat(ToasterTimer timer) {
		super(timer);
		driveTime = 3.25;
		driveSpeed = -1;

	}
}

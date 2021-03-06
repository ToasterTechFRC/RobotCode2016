package org.usfirst.frc.team5332.robot.intake.auto.complete;

import org.usfirst.frc.team5332.robot.intake.auto.IntakeAutoDown;
import org.usfirst.frc.team5332.robot.intake.auto.IntakeAutoNothing;
import org.usfirst.frc.team5332.robot.intake.auto.IntakeAutoNothingDown;
import org.usfirst.frc.team5332.robot.intake.auto.IntakeAutoUp;
import org.usfirst.frc.team5332.robot.intake.auto.queue.IntakeAutoQueue;
import org.usfirst.frc.team5332.robot.intake.base.IntakeCommandLayer;

public class IntakeCompleteCrossCheval extends IntakeCommandLayer {
	
	protected IntakeAutoQueue queue;
	
	@Override
	public void robotInit() {
		queue = new IntakeAutoQueue();
		queue.setChild(this.systemLayer);
		queue.robotInit();
		queue.addAutoLayer(new IntakeAutoUp());
		queue.addAutoLayer(new IntakeAutoNothing(3.7));
		queue.addAutoLayer(new IntakeAutoDown());
		queue.addAutoLayer(new IntakeAutoNothingDown(1.2));
		queue.addAutoLayer(new IntakeAutoUp());
		queue.addAutoLayer(new IntakeAutoNothing(15));

	}

	@Override
	public String getName() {
		return "CrossCheval";
	}

	@Override
	public void runPeriodic() {
		queue.runPeriodic();
	}

	@Override
	public boolean isFinished() {
		return queue.isFinished();
	}

}

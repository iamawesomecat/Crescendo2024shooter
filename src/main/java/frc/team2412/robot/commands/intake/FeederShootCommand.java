package frc.team2412.robot.commands.intake;

import edu.wpi.first.wpilibj2.command.Command;
import frc.team2412.robot.subsystems.IntakeSubsystem;

public class FeederShootCommand extends Command {
	private final IntakeSubsystem intakeSubsystem;

	public FeederShootCommand(IntakeSubsystem intakeSubsystem) {
		this.intakeSubsystem = intakeSubsystem;
		addRequirements(intakeSubsystem);
	}

	@Override
	public void initialize() {
		// needs to be reverted before merge
		// intakeSubsystem.feederShoot();
	}

	@Override
	public boolean isFinished() {
		return true;
	}
}

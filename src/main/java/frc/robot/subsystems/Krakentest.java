// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Krakentest extends SubsystemBase {
  /** Creates a new Krakentest. */
  TalonFX kraken;
  public Krakentest() {
    kraken = new TalonFX(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void runMotor(double speed) {
    kraken.set(speed);
  }
}

// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Blinkintest extends SubsystemBase {
  /** Creates a new Blinkintest. */
  Spark blinkin;
  public Blinkintest() {
    blinkin = new Spark(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void setColor(double colorTableValue) {
    blinkin.set(colorTableValue);
  }
}

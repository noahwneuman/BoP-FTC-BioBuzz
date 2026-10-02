package org.firstinspires.ftc.teamcode.autos;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.resources.DriveTrain;
@Autonomous
public class FiveWeekAuto extends LinearOpMode {
    DriveTrain d;
    ElapsedTime e;

    @Override
    public void runOpMode() throws InterruptedException {
        e = new ElapsedTime();
        d = new DriveTrain(hardwareMap);
        waitForStart();
        e.reset();
        while(e.seconds() < 0.05){
            d.bLeft.setPower(1);
            d.bRight.setPower(1);
            d.fLeft.setPower(1);
            d.fRight.setPower(1);

        }
        while(e.seconds() <= 0.07){
            d.bLeft.setPower(1);
            d.bRight.setPower(1);
            d.fLeft.setPower(-1);
            d.fRight.setPower(-1);
        }
        while(e.seconds() > 0.07){
            d.bLeft.setPower(0);
            d.bRight.setPower(0);
            d.fLeft.setPower(0);
            d.fRight.setPower(0);
        }
    }
}

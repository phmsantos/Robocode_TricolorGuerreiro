package ifpe;
import robocode.*;
import java.awt.*;

import robocode.Robot;
import robocode.ScannedRobotEvent;



// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * TricolorGuerreiro - a robot by Pedro H M Santos <phmsanttos@gmail.com>
 */
public class TricolorGuerreiro extends Robot
{
	/**
	 * run: TricolorGuerreiro's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

	 //setColors(Color.BLACK, Color.WHITE, Color.RED); // body,gun,radar
	 //setColors(Color.BLACK, Color.WHITE, Color.RED);
	 
		// Set colors
		setBodyColor(Color.black);
		setGunColor(Color.white);
		setRadarColor(Color.red);
		setBulletColor(Color.white);
		setScanColor(Color.black);

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			ahead(100);
			turnGunRight(360);
			back(100);
			turnGunRight(360);
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		fire(1);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		back(10);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		back(20);
	}	
}

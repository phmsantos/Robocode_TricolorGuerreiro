package ifpe;
import robocode.*;
import java.awt.*;

//import robocode.Robot;
import robocode.ScannedRobotEvent;



// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * TricolorGuerreiro - a robot by Pedro H M Santos <phmsanttos@gmail.com>
 */
public class TricolorGuerreiro extends AdvancedRobot
{
	/**
	 * run: TricolorGuerreiro's default behavior
	 */
	public void run() {
	 
		// Set colors
		setBodyColor(Color.black);
		setGunColor(Color.white);
		setRadarColor(Color.red);
		setBulletColor(Color.white);
		setScanColor(Color.black);

		while (true) {
			setTurnRight(50000);
			setMaxVelocity(6);
			ahead(50000);				
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		fire(2);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		turnRight(e.getBearing());
		//back(10);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		//turnGunRight(180);
		//back(100);
		turnLeft(210 - Math.abs(e.getBearing()));
	}	
	
 	public void onHitRobot(HitRobotEvent e) {
		back(20);
		//turnRadarRight(e.getBearing());
	}
	
	public void onWin(WinEvent e) {
		for (int i = 0; i < 50; i++) {
			turnRight(30);
			turnLeft(30);
		}
	}
}

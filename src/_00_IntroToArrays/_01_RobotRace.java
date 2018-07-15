package _00_IntroToArrays;

import java.awt.Color;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		boolean win = false;
		int winner = 0;
		// 2. create an array of 5 robots.
		Robot[] rob = new Robot[5];
		int x = 50;
		
	

		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < rob.length; i++) {

			// 4. make each robot start at the bottom of the screen, side by side, facing up
			rob[i] = new Robot();
			rob[i].setPenColor(Color.BLUE);
			rob[i].setWindowSize(500, 500);
			rob[i].setX(x);
			rob[i].setSpeed(10);
			rob[i].setY(500);
			x += 80;
		}
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		while (win == false) {
			for (int i = 0; i < rob.length; i++) {
				Random r = new Random();
				int ran = r.nextInt(50);
				rob[i].move(ran);
				rob[i].turn(2);
				if(rob[i].getY() < 0) {
					win = true;
					winner = i + 1;
				}
			}
		}

		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!
		if(win == true) {
			JOptionPane.showMessageDialog(null, "Robot " + winner + " WON!" );
		}
		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
		
	}

}

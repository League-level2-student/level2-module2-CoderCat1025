package _08_LeagueSnake;
/*
 * This class will be used to represent each part of the moving snake.
 * 
 * 1. Add x and y member variables.
 *    They will hold the corner location of each segment of the snake.
 *   
 * 
 * 2. Add a constructor with parameters to initialize each variable.
 */

public class Segment {
    int x;
    int y;
    
    public Segment(int x, int y) {
    	this.x = x;
    	this.y = y;
}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
}

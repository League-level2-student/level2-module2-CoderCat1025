package _08_LeagueSnake;

import java.util.ArrayList;

import processing.core.PApplet;

public class LeagueSnake extends PApplet {
	static final int WIDTH = 800;
	static final int HEIGHT = 800;

	/*
	 * Game variables
	 * 
	 * Put all the game variables here.
	 */
	Segment head;
	int foodX;
	int foodY;
	int direction = UP;
	int foodEaten = 0;
	ArrayList<Segment> tail = new ArrayList<>();



	/*
	 * Setup methods
	 * 
	 * These methods are called at the start of the game.
	 */
	@Override
	public void settings() {
		size(500, 500);
	}

	@Override
	public void setup() {
		head = new Segment(250, 250);
		frameRate(20);
		dropFood();
	}

	void dropFood() {
		// Set the food in a new random location
		foodX = ((int)random(50)*10);
		foodY = ((int)random(50)*10);
	}

	/*
	 * Draw Methods
	 * 
	 * These methods are used to draw the snake and its food
	 */

	@Override
	public void draw() {
		background(0, 0, 0);
		drawFood();
		move();
		drawSnake();
		eat();
	}

	void drawFood() {
		// Draw the food
		fill(255, 0, 0);
		rect(foodX, foodY, 10, 10);
	}

	void drawSnake() {
		// Draw the head of the snake followed by its tail
		fill(0, 255, 0);
		rect(head.getX(), head.getY(), 10, 10);
	}

	void drawTail() {
		// Draw each segment of the tail

	}

	/*
	 * Tail Management methods
	 * 
	 * These methods make sure the tail is the correct length.
	 */

	void manageTail() {
		// After drawing the tail, add a new segment at the "start" of the tail and
		// remove the one at the "end"
		// This produces the illusion of the snake tail moving.
		checkTailCollision();
		drawTail();
		tail.add(new Segment(head.getX(), head.getY()));
		tail.remove(0);

	}

	void checkTailCollision() {
		// If the snake crosses its own tail, shrink the tail back to one segment
for(int i = 0; i < tail.size(); i++) {
	if (head.getX() == tail.get(i).getX() && head.getY() == tail.get(i).getY()) {
		foodEaten = 1;
		tail.clear();
	}
}
	}

	/*
	 * Control methods
	 * 
	 * These methods are used to change what is happening to the snake
	 */

	@Override
	public void keyPressed() {
		// Set the direction of the snake according to the arrow keys pressed
		if(direction == RIGHT) {
			if(keyCode == LEFT) {}
			else {
			direction = keyCode;}}


			if(direction == LEFT) {
				if(keyCode == RIGHT) {}
				else {
				direction = keyCode;}}


				if(direction == UP) {
					if(keyCode == DOWN) {}
					else {
					direction = keyCode;}}


					if(direction == DOWN) {
						if(keyCode == UP) {}
						else {
						direction = keyCode;}}

	}

	void move() {
		// Change the location of the Snake head based on the direction it is moving.

		if (direction == UP) {
			head.setY(head.getY() - 10);
			checkBoundaries();


		} else if (direction == DOWN) {
			head.setY(head.getY() + 10);
			checkBoundaries();


		} else if (direction == LEFT) {
			head.setX(head.getX() - 10);
			checkBoundaries();


		} else if (direction == RIGHT) {
			head.setX(head.getX() + 10);
			checkBoundaries();


		}

	}

	void checkBoundaries() {
		// If the snake leaves the frame, make it reappear on the other side
		if (head.getX() > 500) {
			head.setX(0);
		}
		if (head.getX() < 0) {
			head.setX(500);
		}
		if(head.getY() > 500) {
			head.setY(0);
		}
		if(head.getY() < 0) {
			head.setY(500);
		}

	}

	void eat() {
		// When the snake eats the food, its tail should grow and more
		// food appear
		if (head.getX() == foodX && head.getY() == foodY) {
			foodEaten++;
			dropFood();
			drawFood();
		}

	}

	static public void main(String[] passedArgs) {
		PApplet.main(LeagueSnake.class.getName());
	}
}

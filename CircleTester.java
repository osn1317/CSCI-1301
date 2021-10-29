/*
* CircleTester.java
* Author: Owen Na
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from anywhere other than the authorized
* sources. I recognize that any unauthorized sharing, assistance,
* or plagiarism will be handled in accordance with both the
* University of Georgia's Academic Honesty Policy and the
* policies of this course. I recognize that my work is based on
* an assignment created by the Department of Computer
* Science at the University of Georgia. Any publishing or posting
* of source code at any time for this project is prohibited.
*/
// 
//*******************************************************
public class CircleTester {
	public static final double THRESHOLD = 0.000000001;

	public static void main(String[] args) {

		Circle circle1 = new Circle();
		Circle circle2 = new Circle();
		circle1.setName("Circle 1");
		circle1.setX(0.0);
		circle1.setY(0.0);
		circle1.setRadius(2);
		circle2.setName("Circle 2");
		circle2.setX(2.0);
		circle2.setY(1.0);
		circle2.setRadius(1);
		System.out.println("circle1=" + circle1);
		System.out.println("circle2=" + circle2);

		// If the method setRadius is implemented correctly,
		// a call to setRadius with a negative number
		// will not change the value of the circle's radius.
		//
		circle1.setRadius(-2.0);

		// This is a unit test. It is best to have tests output pass or fail instead of
		// just a bunch of values.
		// Notice how the double comparison is done
		if (Math.abs(2 - circle1.getRadius()) < THRESHOLD)
			System.out.println("PASSED: Set Radius");
		else
			System.out.println("FAILED: Set Radius");

		//
		// Reset the center of circle1 (-3.0,4.0)
		//
		circle1.setX(-3.0);
		circle1.setY(4.0);

		// print circle1 characteristics (center and radius), use a statement similar
		// to the previous println statements. Note that is not necessary to call
		// the method toString, why?
		System.out.println("");
		System.out.println(circle1);
		System.out.println("");

		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		// print circle2 characteristics (center and radius), use a statement similar to
		// the first and
		// second println statements
		System.out.println(circle2);
		System.out.println("");

		// print circle1 diameter, area and perimeter
		System.out.println(circle1.getName());
		System.out.println("diameter: " + circle1.diameter());
		System.out.println("area: " + circle1.area());
		System.out.println("perimeter: " + circle1.perimeter() + "\n");

		// print circle2 diameter, area and perimeter
		System.out.println(circle2.getName());
		System.out.println("diameter: " + circle2.diameter());
		System.out.println("area: " + circle2.area());
		System.out.println("perimeter: " + circle2.perimeter() + "\n");

		// display whether circle1 is a unit circle
		System.out.println("Is " + circle1.getName() + " a unit circle?: " + circle1.isUnitCircle());

		// display whether circle2 is a unit circle
		System.out.println("Is " + circle2.getName() + " a unit circle?: " + circle2.isUnitCircle());

		// your additional tests should be placed below here. Make sure to include at
		// least 3 test cases
		// for each method you write. It is best to write proper unit tests which print
		// pass, fail for each
		// test instead of just dumping values to the screen.
		System.out.println("");
		System.out.println(circle1.getName() + " has the same centers and radii as " + circle2.getName() + ":"
				+ circle1.equals(circle2));
		System.out.println("The distance between " + circle1.getName() + " and " + circle2.getName() + " is:"
				+ circle1.distance(circle2));
		System.out.println(
				circle1.getName() + " is smaller than " + circle2.getName() + ":" + circle1.isSmaller(circle2));
		System.out.println(circle1.getName() + " area compared to " + circle2.getName()
				+ " (1 means greater than, -1 means less than, and 0 means they equal):" + circle1.compareTo(circle2));
		System.out.println(
				circle1.getName() + " intersects " + circle2.getName() + ":" + circle1.intersects(circle2) + "\n");

		// Initialize new circles to be compared with the following methods
		Circle circleTest3 = new Circle();
		Circle circleTest4 = new Circle();
		Circle circleTest5 = new Circle();
		Circle circleTest6 = new Circle();
		circleTest3.setName("Circle 3");
		circleTest3.setX(2.5);
		circleTest3.setY(1.5);
		circleTest3.setRadius(1);
		circleTest4.setName("Circle 4");
		circleTest4.setX(3.5);
		circleTest4.setY(2.5);
		circleTest4.setRadius(2);
		circleTest5.setName("Circle 5");
		circleTest5.setX(2.0);
		circleTest5.setY(1.0);
		circleTest5.setRadius(0.5);
		circleTest6.setName("Circle 6");
		circleTest6.setX(2.5);
		circleTest6.setY(1.5);
		circleTest6.setRadius(1);
		System.out.println("circle3=" + circleTest3);
		System.out.println("circle4=" + circleTest4);
		System.out.println("circle5=" + circleTest5);
		System.out.println("circle6=" + circleTest6);

		// Test case 1
		System.out.println("");
		// Tests public boolean equals(Circle anotherCircle)
		System.out.println(circle1.getName() + " has the same centers and radii as " + circleTest3.getName() + ":"
				+ circle1.equals(circleTest3));
		// Tests public double distance(Circle anotherCircle)
		System.out.println("The distance between " + circle1.getName() + " and " + circleTest3.getName() + " is:"
				+ circle1.distance(circleTest3));
		// Tests public boolean isSmaller(Circle anotherCircle)
		System.out.println(
				circle1.getName() + " is smaller than " + circleTest3.getName() + ":" + circle1.isSmaller(circleTest3));
		// Tests public int compareTo(Circle anotherCircle)
		System.out.println(circle1.getName() + " area compared to " + circleTest3.getName()
				+ " (1 means greater than, -1 means less than, and 0 means they equal):"
				+ circle1.compareTo(circleTest3));
		// Tests public boolean intersects(Circle anotherCircle)
		System.out.println(
				circle1.getName() + " intersects " + circleTest3.getName() + ":" + circle1.intersects(circleTest3));

		// Test case 2
		System.out.println("");
		// Tests public boolean equals(Circle anotherCircle)
		System.out.println(circle1.getName() + " has the same centers and radii as " + circleTest4.getName() + ":"
				+ circle1.equals(circleTest4));
		// Tests public double distance(Circle anotherCircle)
		System.out.println("The distance between " + circle1.getName() + " and " + circleTest4.getName() + " is:"
				+ circle1.distance(circleTest4));
		// Tests public boolean isSmaller(Circle anotherCircle)
		System.out.println(
				circle1.getName() + " is smaller than " + circle2.getName() + ":" + circle1.isSmaller(circle2));
		// Tests public int compareTo(Circle anotherCircle)
		System.out.println(circle1.getName() + " area compared to " + circleTest4.getName()
				+ " (1 means greater than, -1 means less than, and 0 means they equal):"
				+ circle1.compareTo(circleTest4));
		// Tests public boolean intersects(Circle anotherCircle)
		System.out.println(
				circle1.getName() + " intersects " + circleTest4.getName() + ":" + circle1.intersects(circleTest4));

		// Test case 3
		System.out.println("");
		// Tests public boolean equals(Circle anotherCircle)
		System.out.println(circle2.getName() + " has the same centers and radii as " + circleTest4.getName() + ":"
				+ circle2.equals(circleTest4));
		// Tests public double distance(Circle anotherCircle)
		System.out.println("The distance between " + circle2.getName() + " and " + circleTest4.getName() + " is:"
				+ circle2.distance(circleTest4));
		// Tests public boolean isSmaller(Circle anotherCircle)
		System.out.println(
				circle2.getName() + " is smaller than " + circle2.getName() + ":" + circle2.isSmaller(circle2));
		// Tests public int compareTo(Circle anotherCircle)
		System.out.println(circle2.getName() + " area compared to " + circleTest4.getName()
				+ " (1 means greater than, -1 means less than, and 0 means they equal):"
				+ circle2.compareTo(circleTest4));
		// Tests public boolean intersects(Circle anotherCircle)
		System.out.println(
				circle2.getName() + " intersects " + circleTest4.getName() + ":" + circle2.intersects(circleTest4));

		// Test case 4
		System.out.println("");
		// Tests public boolean equals(Circle anotherCircle)
		System.out.println(circleTest5.getName() + " has the same centers and radii as " + circle2.getName() + ":"
				+ circleTest5.equals(circle2));
		// Tests public double distance(Circle anotherCircle)
		System.out.println("The distance between " + circleTest5.getName() + " and " + circle2.getName() + " is:"
				+ circleTest5.distance(circle2));
		// Tests public boolean isSmaller(Circle anotherCircle)
		System.out.println(
				circleTest5.getName() + " is smaller than " + circle2.getName() + ":" + circleTest5.isSmaller(circle2));
		// Tests public int compareTo(Circle anotherCircle)
		System.out.println(circleTest5.getName() + " area compared to " + circle2.getName()
				+ " (1 means greater than, -1 means less than, and 0 means they equal):"
				+ circleTest5.compareTo(circle2));
		// Tests public boolean intersects(Circle anotherCircle)
		System.out.println(
				circleTest5.getName() + " intersects " + circle2.getName() + ":" + circleTest5.intersects(circle2));

		// Test case 5
		System.out.println("");
		// Tests public boolean equals(Circle anotherCircle)
		System.out.println(circleTest6.getName() + " has the same centers and radii as " + circleTest3.getName() + ":"
				+ circleTest6.equals(circleTest3));
		// Tests public double distance(Circle anotherCircle)
		System.out.println("The distance between " + circleTest6.getName() + " and " + circleTest3.getName() + " is:"
				+ circleTest6.distance(circleTest3));
		// Tests public boolean isSmaller(Circle anotherCircle)
		System.out.println(circleTest6.getName() + " is smaller than " + circleTest3.getName() + ":"
				+ circleTest5.isSmaller(circleTest3));
		// Tests public int compareTo(Circle anotherCircle)
		System.out.println(circleTest6.getName() + " area compared to " + circleTest3.getName()
				+ " (1 means greater than, -1 means less than, and 0 means they equal):"
				+ circleTest6.compareTo(circleTest3));
		// Tests public boolean intersects(Circle anotherCircle)
		System.out.println(circleTest6.getName() + " intersects " + circleTest3.getName() + ":"
				+ circleTest6.intersects(circleTest3));

	}

}

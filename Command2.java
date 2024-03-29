package shape;

import java.util.Scanner;

public class Command2 {
	public static void main(String[] args) {
		String color="";
		float side=0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the Shape color : ");
		color = input.next();
		System.out.print("Enter the Square side : ");
		side = input.nextFloat();
		
		Square sq = new Square(side);
		
		sq.setColor(color);
		System.out.printf("Square: color = %s \n", sq.getColor());
		System.out.printf("Square: area = %.2f \n", sq.area());
		System.out.printf("Square: perimeter = %.2f \n", sq.perimeter());
	}
}

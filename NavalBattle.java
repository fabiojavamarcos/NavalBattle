package source;

import java.util.Scanner;
import java.lang.Math;

public class NavalBattle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the coordinates of your destroyer");
		int dx1, dx2, dy1, dy2 = 0;
		int hits = 0;
		int hitsD = 0;
		Scanner sc = new Scanner(System.in);
		
		// input destroyer position
		System.out.println("Enter the coordinates of your destroyer x1");
		dx1 = sc.nextInt();
		System.out.println("Enter the coordinates of your destroyer y1");
		dy1 = sc.nextInt();		
		System.out.println("Enter the coordinates of your destroyer x2");
		dx2 = sc.nextInt();
		System.out.println("Enter the coordinates of your destroyer y2");
		dy2 = sc.nextInt();
		
		String[][] battlefield = new String [10] [10];
		
		// initializing the battlefield
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				battlefield [i][j] = "0";
			}
		}
		
		// setting up the destroyer position
		battlefield [dx1][dy1] = "D";
		battlefield [dx2][dy2] = "D";
		
		int counter = 1;
		while (counter < 4) {
			System.out.println("Computer will fire !!!");
			
			// fire position
			int fireX = (int) ((Math.random() * 10));
			int fireY = (int) ((Math.random() * 10));
			
			// check hit/miss
			if (battlefield [fireX][fireY].equals("D")) {
				System.out.println("We got a hit !!!"+ fireX + "-" + fireY);
				hits++;
				hitsD++;
			}
			else {
				System.out.println("You missed hahahahah !!!"+ fireX + "-" + fireY);
			}
			if (hitsD == 2) {
				System.out.println("Oh No !!!");
			}
			//updating the fire position
			battlefield [fireX][fireY] = "X";
			
			System.out.println("number of hits !!!"+ hits);
			counter++;
		}
		//System.out.println("--------------Top Bottom Left Right");
		//printTopBottomLeftRight(battlefield);
		//System.out.println("--------------Bottom Up Right Left");
		//printBottonUpRightLeft(battlefield);
		//System.out.println("--------------Right Left Bottom Up ");
		//printLeftRightTopBottom(battlefield);
		//System.out.println("--------------Zig Zag ");
		//printTopBottomZigZag(battlefield);
		
		printBoard(battlefield);
		// update the code to have 3 fires
		
		// check if the destroyer was sunk
		
		// create a cruiser with 3 positions
		
		// check for repeated fire (same position)
		
	}
	public static void printBoard(String [][] battlefield) {
		for (int i=0; i<battlefield.length; i++) {
			for (int j=0; j<battlefield[i].length; j++) {
				System.out.print(battlefield[i][j]);
			}
			System.out.println("");
		}	
	}
	public static void printTopBottomLeftRight(String [][] battlefield) {
		for (int i=0; i<battlefield.length; i++) {
			for (int j=0; j<battlefield[i].length; j++) {
				System.out.println("row: "+i+ " col:"+j + " - "+ battlefield[i][j]);
			}
		}	
	}
	public static void printBottonUpRightLeft(String [][] battlefield) {
		for (int i=battlefield.length-1; i>=0 ; i--) {
			for (int j=battlefield[i].length-1; j>=0; j--) {
				System.out.println("row: "+i+ " col:"+j+ " - "+ battlefield[i][j]);
			}
		}	
	}
	public static void printTopBottomZigZag(String [][] battlefield) {
		for (int i=0; i<battlefield.length; i++) {
			if (i%2 ==0) {
				for (int j=battlefield[i].length-1; j>=0; j--) {
					System.out.println("row: "+i+ " col:"+j+ " - "+ battlefield[i][j]);
				}
			} else {
				for (int j=0; j<battlefield[i].length; j++) {
					System.out.println("row: "+i+ " col:"+j + " - "+ battlefield[i][j]);
				}
			}
		}	
	}
	public static void printLeftRightTopBottom(String [][] battlefield) {
		for (int j=0; j<battlefield[0].length; j++) { 
			for  (int i=0; i<battlefield.length; i++) {
				System.out.println("row: "+i+ " col:"+j + " - "+ battlefield[i][j]);
			}
		}	
	}
}

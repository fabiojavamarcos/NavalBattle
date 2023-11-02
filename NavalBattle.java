package source;

import java.util.Scanner;
import java.lang.Math;

public class NavalBattle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Enter the coordinates of your destroyer");
		int dx1, dx2, dy1, dy2 = 0;
		int cx1, cx2, cx3, cy1, cy2, cy3 = 0;
		
		int hitsD = 0;
		int hitsC = 0;
		boolean isSunkD = false;
		boolean isSunkC = false;
		//Scanner sc = new Scanner(System.in);
		
		/* input destroyer position
		System.out.println("Enter the coordinates of your destroyer x1");
		dx1 = sc.nextInt();
		System.out.println("Enter the coordinates of your destroyer y1");
		dy1 = sc.nextInt();		
		System.out.println("Enter the coordinates of your destroyer x2");
		dx2 = sc.nextInt();
		System.out.println("Enter the coordinates of your destroyer y2");
		dy2 = sc.nextInt();

		//input Cruiser position
		System.out.println("Enter the coordinates of your cruiser x1");
		cx1 = sc.nextInt();
		System.out.println("Enter the coordinates of your cruiser y1");
		cy1 = sc.nextInt();		
		System.out.println("Enter the coordinates of your cruiser x2");
		cx2 = sc.nextInt();
		System.out.println("Enter the coordinates of your cruiser y2");
		cy2 = sc.nextInt();
		System.out.println("Enter the coordinates of your cruiser x3");
		cx3 = sc.nextInt();
		System.out.println("Enter the coordinates of your cruiser y3");
		cy3 = sc.nextInt(); */

		dx1 = 0; dy1 = 0; dx2 = 0; dy2 = 1;
		cx1 = 2; cy1 = 0; cx2 = 2; cy2 = 1; cx3 = 2; cy3 = 2;
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
		
		battlefield [cx1][cy1] = "C";
		battlefield [cx2][cy2] = "C";
		battlefield [cx3][cy3] = "C";
		
		int counter = 1;
		while (counter < 100) {
			System.out.println("Computer will fire !!!");
			
			// fire position
			int fireX = (int) ((Math.random() * 10));
			int fireY = (int) ((Math.random() * 10));
			//int fireX = sc.nextInt();
			//int fireY = sc.nextInt();
			if (battlefield [fireX][fireY].equals("X")) {
				System.out.println("Fired in the same position");
			} 
			// check hit/miss
			if (battlefield [fireX][fireY].equals("D")) {
				System.out.println("We got a hit D!!!"+ fireX + "-" + fireY);
				
				if (!isSunkD) {
					hitsD++;
					if (hitsD == 2) {
						System.out.println("Oh No D is sunk !!!");
						isSunkD = true;
					}
				}	
			}
			else if (battlefield [fireX][fireY].equals("C")) {
				System.out.println("We got a hit C!!!"+ fireX + "-" + fireY);
				
				if (!isSunkC) {
					hitsC++;
					if (hitsC == 3) {
						System.out.println("Oh No C is sunk!!!");
						isSunkC = true;
					}
				}	
			} else {
				System.out.println("You missed hahahahah !!!"+ fireX + "-" + fireY);
			}
			
			//updating the fire position
			battlefield [fireX][fireY] = "X";
			
			
			counter++;
		}
		int hits = hitsD + hitsC;
		System.out.println("number of hits !!!"+ hits);
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

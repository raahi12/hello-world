import java.util.Scanner;
public class Head {

	public static void main(String[] args) 
	{
		String test;
		Scanner obj=new Scanner(System.in);
		System.out.println("Note: You should only input  capital alphabets and not numbers or other alphanumeric characters.");
		System.out.println("Enter any text");
		test =obj.nextLine();
		String[] piece=test.split("");
		for(int z=0;z<test.length();z++) 
		{
			if(piece[z].equals("A"))
			{
				for(int i=1;i<=7;i++) 
		 		{
		 			for(int j=1;j<=7;j++) {
		 				if(i==1||i==4) {
		 					System.out.printf("*");
		 				}
		 				else if(j==1||j==7) {
		 					System.out.printf("*");
		 				}
						else{System.out.printf(" ");}
		 			}
		 			System.out.println("");
		 		
		 		}
				System.out.println("");
			}
			else if(piece[z].equals("B")){
				for(int i=0;i<7;i++) {
					for(int j=0;j<7;j++) {
						if(i==0&&j<6){System.out.printf("*");}
						if(i==1||i==2||i==4||i==5){if(j==0||j==6){System.out.printf("*");}
						else{System.out.printf(" ");}}
						if(i==3&&j<6){System.out.printf("*");}
						if(i==6&&j<6){System.out.printf("*");}
						if(i==0&&j==6){System.out.printf(" ");}
						if(i==3&&j==6){System.out.printf(" ");}
						if(i==6&&j==6){System.out.printf(" ");}
						
					}
					System.out.println("");
				}
				System.out.println("");
				
			}
			else if(piece[z].equals("C")) {
				for(int i=1;i<=7;i++){
						for(int j=1;j<=7;j++){
							if(i==1){System.out.printf("*");}
							else if(i==7){System.out.printf("*");}
							else if(i!=1&&i!=7){
										if(j==1){System.out.printf("*");}
									}
							else{System.out.println("");}
						}
						System.out.println("");
					}
				System.out.println("");
				
			}
			else if(piece[z].equals("D")) {
				for(int i=1;i<=7;i++){
						for(int j=1;j<=7;j++){
								if(i==1&&j==7){System.out.printf(" ");}
								else if(i==7&&j==7){System.out.printf(" ");}
								else{
									if(j==1){System.out.printf("*");}
									else if(i==1&&j<=6){System.out.printf("*");}
									else if(i==7&&j<=6){System.out.printf("*");}
									else if(j==7&&i!=1&&i!=7){System.out.printf("*");}
									else {System.out.printf(" ");}
									}
							}
						System.out.println("");
				}
				System.out.println("");
			}
			else if(piece[z].equals("E")) {
				for(int i=1;i<=7;i++){
						for(int j=1;j<=7;j++){
								if(i==1){System.out.printf("*");}
								else if(i==4){System.out.printf("*");}
								else if(i==7){System.out.printf("*");}
								else if(j==1&&i!=1&&i!=4&&i!=7){System.out.printf("*");}
								else {System.out.printf(" ");}
							}
						System.out.println("");
					}
				System.out.println("");
			}
			else if(piece[z].equals("F")) {
				for(int i=1;i<=7;i++){
						for(int j=1;j<=7;j++){
								if(j==1){System.out.printf("*");}
								else if(i==1&&j!=1){System.out.printf("*");}
								else if(i==4&&j!=1){System.out.printf("*");}
								else{System.out.printf(" ");}
							}
							System.out.println("");
					}
				System.out.println("");
			}
			else if(piece[z].equals("G")) {
				for(int i=1;i<=7;i++){
						for(int j=1;j<=7;j++){
								if(j==1){System.out.printf("*");}
								else if(i==1&&j!=1){System.out.printf("*");}
								else if(i==7&&j<=3){System.out.printf("*");}
								else if(j==4||j==7){if(i>=4){System.out.printf("*");}}
								else if(i==4&&j>4){System.out.printf("*");}
								else {System.out.printf(" ");}
							}
							System.out.println("");
				}
				System.out.println("");
			}
			else if(piece[z].equals("H")) {
				for(int i=1;i<=7;i++){
						for(int j=1;j<=7;j++){
								if(j==1||j==7){System.out.printf("*");}
								else if(i==4&&j!=1&&j!=7){System.out.printf("*");}
								else{ System.out.print(" ");}
								}
								System.out.println("");
				}
				System.out.println("");
			}
			else if(piece[z].equals("I")) {
				for(int i=1;i<=7;i++){
						for(int j=1;j<=7;j++){
									if(i==1){System.out.printf("*");}
									else if(i==7){System.out.printf("*");}
									else if(j==4){System.out.printf("*");}
									else {System.out.printf(" ");}
}							
System.out.println("");
}
				System.out.println("");
			}
			else if(piece[z].equals("J")) {
				for(int i=1;i<=7;i++){
						for(int j=1;j<=7;j++){
									if(i>=4&&j==1){System.out.print("*");}
									else if(i==7&&j<=3){System.out.printf("*");}
									else if(i==1){System.out.printf("*");}
									else if(j==4&&i!=1){System.out.printf("*");}
									else {System.out.printf(" ");}
}
System.out.println("");
}
				System.out.println("");
			}
			else if(piece[z].equals("K")) {
				for(int i=1;i<=7;i++){
						for(int j=1;j<=7;j++){
									if(j==1){System.out.printf("*");}
									else if(j!=1&&i+j==6){System.out.printf("*");}
									else if(j>=3&&i-j==2){System.out.printf("*");}
									else {System.out.printf(" ");}
}								
System.out.println("");
}
				System.out.println("");
			}
			else if(piece[z].equals("L")) {
				for(int i=1;i<=7;i++){
						for(int j=1;j<=7;j++){
									if(j==1){System.out.printf("*");}
									else if(i==7&&j!=1){System.out.printf("*");}
									else {System.out.printf(" ");}
}								
System.out.println("");
}
				System.out.println("");
			}
			else if(piece[z].equals("M")) {
				for(int i=1;i<=7;i++){
						for(int j=1;j<=7;j++){
									if(j==1||j==7){System.out.printf("*");}
									else if(i<=4){
											if(i==j){System.out.printf("*");}
											else if(i+j==8){System.out.printf("*");}
											else {System.out.printf(" ");}
}
									else{System.out.printf(" ");}
}								
System.out.println("");
}
				System.out.println("");
			}
			else if(piece[z].equals("N")) {
				for(int i=1;i<=7;i++){
						for(int j=1;j<=7;j++){
									if(j==1||j==7||i==j){System.out.printf("*");}
									else {System.out.printf(" ");}
}								
System.out.println("");
}
				System.out.println("");
			}
			else if(piece[z].equals("O")) {
				for(int i=1;i<=7;i++){
						for(int j=1;j<=7;j++){
									if(j==1||j==7){System.out.print("*");}
									else if(j!=1||j!=7){
												if(i==1||i==7){System.out.printf("*");}
												else{System.out.printf(" ");}								
}
									else {System.out.print(" ");}
}								
System.out.println("");
}
				System.out.println("");
			}
			else if(piece[z].equals("P")) {
				for(int i=1;i<=7;i++){
						for(int j=1;j<=7;j++){
									if(j==1){System.out.print("*");}
									else if(j==7&&i<=4){System.out.print("*");}
									else if(i==1||i==4){if(j!=1||j!=7){System.out.printf("*");}
												else {System.out.print(" ");}											
}
									else {System.out.print(" ");}
}								
System.out.println("");
}
				System.out.println("");
			}
			else if(piece[z].equals("Q")) {
				for(int i=1;i<=7;i++){
						for(int j=1;j<=7;j++){
									if(i==1){
										if(j>=2&&j<=6){System.out.print("*");}
										else{System.out.print(" ");}
										}
									else if(i==7){
											if(j>=2&&j<=5){System.out.print("*");}
											else if(j==i){System.out.print("*");}
											else {System.out.print(" ");}	
										}
									else if(j==7){
											if(i>=2&&i<=5){System.out.print("*");}
											else {System.out.print(" ");}
										}
									else if(i==6&&j==6){System.out.print("*");}
									else if(j==1){
											if(i>=2&&i<=6){System.out.print("*");}
										}
									else {System.out.print(" ");}
}								
System.out.println("");
}
				System.out.println("");
			}
			else if(piece[z].equals("R")) {
				for(int i=1;i<=7;i++){
						for(int j=1;j<=7;j++){
									if(j==1){System.out.print("*");}
									else if(i==1&&j!=7){System.out.print("*");}
									else if(i==4&&j<=6){System.out.print("*");}
									else if(j==7){
											if(i==2||i==3||i==6||i==7){System.out.print("*");}
											else {System.out.print(" ");}
										}
									else if(j==6){
											if(i==5){System.out.print("*");}
											else {System.out.print(" ");}
}
									else {System.out.print(" ");}
}								
System.out.println("");
}
				System.out.println("");
			}
			else if(piece[z].equals("S")) {
				for(int i=1;i<=7;i++){
						for(int j=1;j<=7;j++){
									if(i==1||i==4||i==7){System.out.print("*");}
									else if(j==1){
											if(i==2||i==3){System.out.print("*");}
											else{System.out.print(" ");}
											}
									else if(j==7){
											if(i==5||i==6){System.out.print("*");}
											else{System.out.print(" ");}
											}
									else {System.out.print(" ");}
}								
System.out.println("");
}
				System.out.println("");
			}
			else if(piece[z].equals("T")) {
				for(int i=1;i<=7;i++){
						for(int j=1;j<=7;j++){
									if(i==1){System.out.print("*");}
									else if(j==4&&i!=1){System.out.print("*");}
									else {System.out.print(" ");}
}								
System.out.println("");
}
				System.out.println("");
			}
			else if(piece[z].equals("U")) {
				for(int i=1;i<=7;i++){
						for(int j=1;j<=7;j++){
									if(j==1||j==7){System.out.print("*");}
									else if(i==7){
											if(j!=1&&j!=7){System.out.print("*");}
											else {System.out.print(" ");}
											}
									else {System.out.print(" ");}
}								
System.out.println("");
}
				System.out.println("");
			}
			else if(piece[z].equals("V")) {
				for(int i=1;i<=7;i++){
						for(int j=1;j<=7;j++){
									if(j==1||j==7){
											if(i<4){System.out.print("*");}
											else if(i==4){System.out.print("*");}
											else {System.out.print(" ");}
											}
									else if(i>4){
											if(i+j==11||i-j==3){System.out.print("*");}
											else {System.out.print(" ");}
										}
									else {System.out.print(" ");}
}								
System.out.println("");
}
				System.out.println("");
			}
			else if(piece[z].equals("W")){
				for(int i=1;i<=7;i++){
						for(int j=1;j<=7;j++){
									if(j==1||j==7){System.out.print("*");}
									else if(i>=4){
											if(i+j==8&&j!=1){System.out.print("*");}
											else if(i==j&&j!=7){System.out.print("*");}
											else {System.out.print(" ");}
											}
									else {System.out.print(" ");}
}								
System.out.println("");
}
				System.out.println("");
			}
			else if(piece[z].equals("X")) {
				for(int i=1;i<=7;i++){
						for(int j=1;j<=7;j++){
									if(i==j){System.out.print("*");}
									else if(i+j==8&&i!=4){System.out.print("*");}
									else {System.out.print(" ");}
}								
System.out.println("");
}
				System.out.println("");
			}
			else if(piece[z].equals("Y")) {
				for(int i=1;i<=7;i++){
						for(int j=1;j<=7;j++){
									if(i<=4){
											if(i==j){System.out.print("*");}
											else if(i+j==8&&i!=4){System.out.print("*");}
											else {System.out.print(" ");}
										}
									else if(i>4&&j==4){System.out.print("*");}
									else {System.out.print(" ");}
}								
System.out.println("");
}
				System.out.println("");
			}
			else if(piece[z].equals("Z")) {
				for(int i=1;i<=7;i++){
						for(int j=1;j<=7;j++){
									if(i==1||i==7){System.out.print("*");}
									else if(i+j==8){if(j!=1&&j!=7){System.out.print("*");}}
									else {System.out.print(" ");}
}								
System.out.println("");
}
				System.out.println("");
			}
			else {
				System.out.println("");
				System.out.println("Sorry the text you entered could not be produced here since you did not follow the rules");
				System.out.println("");
			}
		}
		
		obj.close();	
	}	
}

 

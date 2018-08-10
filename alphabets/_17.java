class _17{
public static void main(String args[]){
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
}
}
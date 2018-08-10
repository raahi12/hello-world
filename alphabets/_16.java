class _16{
public static void main(String args[]){
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
}
}
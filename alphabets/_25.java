class _25{
public static void main(String args[]){
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
}
}
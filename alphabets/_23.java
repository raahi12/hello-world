class _23{
public static void main(String args[]){
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
}
}
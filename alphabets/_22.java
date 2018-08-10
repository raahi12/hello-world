class _22{
public static void main(String args[]){
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
}
}
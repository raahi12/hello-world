class _18{
public static void main(String args[]){
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
}
}
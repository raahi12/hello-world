class _19{
public static void main(String args[]){
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
}
}
class _4{
public static void main(String args[]){
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
}
}
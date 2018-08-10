class _7{
public static void main(String args[]){
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
}
}
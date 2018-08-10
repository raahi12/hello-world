class _11{
public static void main(String args[]){
			for(int i=1;i<=7;i++){
						for(int j=1;j<=7;j++){
									if(j==1){System.out.printf("*");}
									else if(j!=1&&i+j==6){System.out.printf("*");}
									else if(j>=3&&i-j==2){System.out.printf("*");}
									else {System.out.printf(" ");}
}								
System.out.println("");
}
}
}
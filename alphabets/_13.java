class _13{
public static void main(String args[]){
			for(int i=1;i<=7;i++){
						for(int j=1;j<=7;j++){
									if(j==1||j==7){System.out.printf("*");}
									else if(i<=4){
											if(i==j){System.out.printf("*");}
											else if(i+j==8){System.out.printf("*");}
											else {System.out.printf(" ");}
}
									else{System.out.printf(" ");}
}								
System.out.println("");
}
}
}
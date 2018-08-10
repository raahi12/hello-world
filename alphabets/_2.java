class _2{
public static void main(String args[]){
for(int i=0;i<7;i++) {
					for(int j=0;j<7;j++) {
						if(i==0&&j<6){System.out.printf("*");}
						if(i==1||i==2||i==4||i==5){if(j==0||j==6){System.out.printf("*");}
else{System.out.printf(" ");}}
						if(i==3&&j<6){System.out.printf("*");}
						if(i==6&&j<6){System.out.printf("*");}
						if(i==0&&j==6){System.out.printf(" ");}
						if(i==3&&j==6){System.out.printf(" ");}
						if(i==6&&j==6){System.out.printf(" ");}
						
					}
					System.out.println("");
				}
	}
}
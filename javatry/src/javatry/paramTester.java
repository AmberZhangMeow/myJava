package javatry;

public class paramTester {
   public int memberVariable=0;
   public static void main(String args[]){
	   int param1=0;
	   paramTester param2=new paramTester();
	   paramTester param3=new paramTester();
	   int []param4={0};
	   changeParameter(param1,param2,param3,param4);
	   System.out.println("param1="+param1);
	   System.out.println("param2.memberVariable="+param2.memberVariable);
	   System.out.println("param3.memeberVariable="+param3.memberVariable);
	   System.out.println("param4[0]="+param4[0]);  
   }
   public static void changeParameter(int param1,paramTester param2,paramTester param3,int[] param4){
	   param1=1;
	   param2.memberVariable=1;
	   param3=new paramTester();
	   param3.memberVariable=1;
	   param4[0]=1;
   }
} 

package javatry;

public class Scope {
int x;
int y;
static int z;
void method(int x){
	int y=1;
	int z=1;
	this.x=x+1;
	this.y=y+1;
	Scope.z=z+1;
	System.out.println("x="+x);
	System.out.println("y="+y);
	System.out.println("z="+z);
	System.out.println("this.x="+this.x);
	System.out.println("this.y="+this.y);
	System.out.println("Scope.z="+Scope.z);
}
	 public static void main(String args[]){
		 Scope obj=new Scope();
		 obj.method(1);
	 }
}

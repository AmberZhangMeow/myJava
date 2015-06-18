package javatry;

public class java1 {
private static int number=0;
private int id=0;
private String name;
public java1(String name){
	this.name=name;
	number++;
	id=number;}
public void speak(String word){
	String showNumber="目前共有"+number+"个娃娃!";
    String showId="我的ID是"+id;
    System.out.println(name+":"+showNumber);
    System.out.println(name+":"+showId);
    System.out.println(name+":"+word);
    }
public static void main(String args[]){
	java1 doll1=new java1("贝贝");
	java1 doll2=new java1("晶晶");
    doll1.speak("大家好！");
	doll2.speak("大家好！");
}
}

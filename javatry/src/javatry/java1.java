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
	String showNumber="Ŀǰ����"+number+"������!";
    String showId="�ҵ�ID��"+id;
    System.out.println(name+":"+showNumber);
    System.out.println(name+":"+showId);
    System.out.println(name+":"+word);
    }
public static void main(String args[]){
	java1 doll1=new java1("����");
	java1 doll2=new java1("����");
    doll1.speak("��Һã�");
	doll2.speak("��Һã�");
}
}

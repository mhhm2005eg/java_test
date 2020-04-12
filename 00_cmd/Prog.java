
class Prog {
public static void main(String[] args){
     System.out.println("Hello World");
	 for (int i = 7; i < 10 ; i ++) System.out.println(i);
	 A NewA = new A("Medhat");
	 NewA.print();
 }
}

class A {
	A(String name1){name = name1;}
	void print(){System.out.println(name);}
	String name;
}


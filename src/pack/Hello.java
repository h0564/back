package pack;
import java.io.*;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;


//5��27��
public class Hello {  
	
	
	public static void main(String[] args){
		System.out.println("123");
	}
}


/*
//5��26��
public class Hello {  
	static String HexaToBinary(int n) {
		String s = Integer.toBinaryString(n);
		while(s.length() < 32) {
			s = "0" + s;
		}
		StringBuffer s1 = new StringBuffer( s );

		for (int i = 0; i < 7; i++) {
			s1.insert( (7-i) * 4, " ");
		}
		return s1.toString();
	}
	public static void main(String[] args){
		int num = 0x3b12cd59;
		System.out.println(num);
		System.out.println(num & 0x000000ff);
		System.out.println((num & 0x0000ff00)>>8);
		System.out.println((num & 0x00ff0000)>>16);
		System.out.println("===================");
		int a = 0x0000004a;
		System.out.println(HexaToBinary(a));
		System.out.println(HexaToBinary(0x0000000));
		System.out.println(HexaToBinary(a | 0x00000010));
	}
}
*/




/*
//5��26��
public class Hello {
	static String HexaToBinary(int n) {
		String s = Integer.toBinaryString(n);
		while(s.length() < 32) {
			s = "0" + s;
		}
		StringBuffer s1 = new StringBuffer( s );

		for (int i = 0; i < 7; i++) {
			s1.insert( (7-i) * 4, " ");
		}
		return s1.toString();
	}

	public static void main(String[] args) {
		int num = 0x3b12cd59;

		System.out.println(HexaToBinary(num));
		
		//int a = 0xff;
		int a = 0x000000ff;
		System.out.println(HexaToBinary(a));
		
		System.out.println("===================");
		int c = num & a;
		System.out.println(HexaToBinary(c));
		
		System.out.println("===================");
		int d = num & 0x00ffff00;
		System.out.println(HexaToBinary(d));
		
		System.out.println("===================");
		System.out.println("===================");
		System.out.println(HexaToBinary(num));
		int e = num | 0x000000ff; //�տ��ִ� ���� ���������͸� ����
		System.out.println(HexaToBinary(0x000000ff));
		System.out.println(HexaToBinary(e));
		
		System.out.println("===================");
		System.out.println("===================");
		// shift bit ����
		int bb = 4;
		int f = num << bb; //���������� ���� �и�
		System.out.println(HexaToBinary(num));
		System.out.println(HexaToBinary(f));
	}
}
*/






/*
//5��26�� 
//�����������α׷� << �ݷ���(LinkedList)
class Book{
	String name;
	String author;
	String publisher;
	int price; //��Ŭ�� >�ҽ� > ���ʷ���Ʈ ��¡�ʵ� (������ �ڵ�����)
	
	
	public Book(String name, String author, String publisher, int price) {
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}
	void info() {
		System.out.println( 
				name + " " +
				author + " " +
				publisher + " " +
				price
		);
	}
	
}
public class Hello {  
	
	
	public static void main(String[] args){
		//Book book = new Book();
		LinkedList<Book> mm = new LinkedList<Book>();
		
		//Create = C
		mm.add(new Book("�ڹٸ� �����" , "ȫ�浿" , "�������ǻ�1",1000));
		mm.add(new Book("���� �ڴ¹�" , "������" , "�������ǻ�2",1500));
		mm.add(new Book("������" , "�̼���" , "�������ǻ�3",2000));
		mm.add(new Book("�����������" , "��������" , "�������ǻ�4",2500));
		System.out.println(mm.size());
		
		
		// Read = R
		for (Book book : mm) {
			book.info();
				}
		System.out.println("==================");
		Book bk = mm.get(2);
		bk.info();
		System.out.println("==================");
		
		// Update = U
		mm.set(1, new Book("���� �Ͼ�¹�" , "������" , "�������ǻ�5",5000));
		for (Book book : mm) {
			book.info();
				}
		System.out.println("==================");
		
		// Delete == D
		mm.remove(3);
		for (Book book : mm) {
			book.info();
				}
		System.out.println("==================");
		
		
	}
}
*/





/*
//5��26��
class Lion extends Thread{
	static int num = 0;
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
		}
		System.out.println(num + "Lion Thread�� �����");
	}
}
class Tiger extends Thread{
	public void run() {
		System.out.println("Tiger Run");
		for (int i = 0; i < 5; i++) {
			System.out.println("���Ӵ��");
			try {
				Thread.sleep(0);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println(i + "�� ������ ���ӵ�..");
			
			Thread t = new Lion();
			t.start();
			Lion.num++;
		}
		System.out.println("Tiger ������ ����");
	}
}
class Test{
	static int num = 100;
}
public class Hello {  
	
	
	public static void main(String[] args){
		System.out.println(Test.num);
		System.out.println("Hello start");
		Thread t = new Tiger();
		t.start();
		
		new Scanner(System.in).nextInt(); //���α׷��� ����Ǵ°� �������� ����
		System.out.println("Hello end");
	}
}
*/




/*
//5�� 26��
class Tiger extends Thread{
	public void run() {
		System.out.println("ȣ���̰� ���");
		Thread t = new Lion();
		t.start();
		new Scanner(System.in).nextInt();
		System.out.println("Tiger end");
	}
}

class Lion extends Thread{
	public void run() {
		System.out.println("���ڰ� ���");
		new Scanner(System.in).nextInt();
		System.out.println("Lion end");
	}
}
public class Hello {  
	
	
	public static void main(String[] args){
		
		System.out.println("start");
		Thread t = new Tiger();
		t.start();
		new Scanner(System.in).nextInt();
		System.out.println("Hello end");
	}
}
*/





/*
//5�� 26��
public class Hello {  
	
	
	public static void main(String[] args){
		for (int i = 0; i < 3; i++) {
			System.out.println("���� �Է��ϼ���");
			int num = new Scanner(System.in).nextInt();
			if(num == 999) {
				System.out.println("���α׷� ����");
				break;
			}
			System.out.println(num * 11);
		}
	}
}
*/




/*
//5�� 25��
public class Hello {  
	
	
	public static void main(String[] args){
		//Ű����κ��� �Է��� �ް� �ʹ�.
		Scanner sc = new Scanner(System.in);
		System.out.println(1000);
		//���� �ȹް� �����Ű�� �ڵ� (�Ʒ� �ڵ� �ָ�)
		new Scanner(System.in).nextInt(); //Ű����κ��� �Է��� ��ٸ��� �Լ�
		System.out.println(2000);
	}
}
*/




/*
//5�� 25��
public class Hello {  
	
	
	public static void main(String[] args){
		//Ű����κ��� �Է��� �ް� �ʹ�.
		Scanner sc = new Scanner(System.in);
		System.out.println(1000);
		sc.nextInt(); //Ű����κ��� �Է��� ��ٸ��� �Լ�
		System.out.println(2000);
	}
}
*/






/*
//5��25��
class Tiger extends Thread{
	public void run() { 
		for (int i = 0; i < 10; i++) {
			System.out.println("ȣ����"+i);
			//thread.sleep(0) : ������ ª�� ����� 
			try {Thread.sleep(0);} catch (Exception e) {	}
		}
	}
}
public class Hello {  
	
	
	public static void main(String[] args){
		System.out.println("���ν���");
		Thread t = new Tiger();
		t.start(); //t��� ������ �۵�
		for (int i = 0; i < 10; i++) {
			System.out.println("�ڳ���"+i);
			//thread.sleep(0) : ������ ª�� ����� 
			try {Thread.sleep(0);} catch (Exception e) {	}
		}
		System.out.println("���� ����");
	}
}
*/




/*
//5��25��
//ǥ�� Ŭ���� Thread�� ��ӹްԵ�
class Tiger extends Thread{
	public void run() { //------------------
		System.out.println("������ ����");
		System.out.println("Tiger run call");
		System.out.println("������ ����");
	}
}
public class Hello {  
	
	
	public static void main(String[] args){
		System.out.println("���ν���");
		Thread t = new Tiger();
		//t��� �����带 �������� �۵�
		//"�ü��"�� ���� ������ �Լ��� ����
		t.start(); //----------------
		try {Thread.sleep(1000);} catch (Exception e) {	}
		System.out.println("���� ��");
	}
}
*/






/*
//5��25��
class A{
	void start() {
		System.out.println("start call");
		run();
	}
	void run() {
		System.out.println("A run call");
	}
}
class B extends A{
	void run() {
		System.out.println("������ ����");
		System.out.println("B run call");
		System.out.println("������ ����");
	}
}
public class Hello {  
	
	
	public static void main(String[] args){
		System.out.println(1);
		A a = new B();
		a.start();
	}
}
*/






//5��25�� <> : �����̳ʶ�� ǥ���ϰ������ ���Ǵ� �ڹٹ���
// Tiger<T> : Tiger��� Ŭ������ ����ϰ� ��������
//����ϰ� ���� Ÿ���� �����̳ʿ� ����ؼ� ����ض�
//���� <T>�� IntŸ��
/*
class Tiger<T>{ //���׸� ����
	T data;
	//��Ŭ�� �ҽ� > ���ʷ���Ʈ ��Ʈ �ص� ��Ʈ
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}

public class Hello {  
	
	
	public static void main(String[] args){
		Tiger<Integer> tiger = new Tiger<Integer>();
		tiger.setData(10);
		System.out.println(tiger.getData());
		
		Tiger<String> tiger2 = new Tiger<String>();
		tiger2.setData("����");
		System.out.println(tiger2.getData());
		
		Tiger<Float> tiger3 = new Tiger<Float>();
		tiger3.setData(3.14f);
		System.out.println(tiger3.getData());
		
		Tiger<Boolean> tiger4 = new Tiger<Boolean>();
		tiger4.setData(5>5);
		System.out.println(tiger4.getData());
		
		String s;
	}
}
*/





/*
//5��25��
class Tiger{
	int data;
	//��Ŭ�� �ҽ� > ���ʷ���Ʈ ��Ʈ �ص� ��Ʈ
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
}
class Lion{
	String data;
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
}
public class Hello {  
	
	
	public static void main(String[] args){
		Tiger tiger = new Tiger();
		tiger.setData(10);
		System.out.println(tiger.getData());
		
		
		Lion lion = new Lion();
		lion.setData("ȣ����");
		System.out.println(lion.getData());
	}
}
*/





/*
//5��25�� , ���ڷ��̼� ����
class Ŀ��{
	int num = 30;
	int ����() {
		System.out.println("Ŀ�� �ֹ�");
		return num;
	}
}
class ���� extends Ŀ��{
	Ŀ�� a;
	int num = 20;
	����(Ŀ�� a){
		this.a = a;
	}
	int ����() {
		System.out.println("���� �ֹ�");
		return num + a.����();
	}
}
class ���� extends Ŀ��{
	Ŀ�� a;
	int num = 10;
	����(Ŀ�� a){
		this.a = a;
	}
	int ����() {
		System.out.println("���� �ֹ�");
		return num + a.����();
	}
}
public class Hello {  
	
	
	public static void main(String[] args){
		//A a;
		//a = new A();   / A a = new A(); �Ѵ� �Ȱ���
		Ŀ�� �մ� = new Ŀ��(); //1
		�մ� = new ����(�մ�);   //�����Ǵ°� �����ϱ�
		�մ� = new ����(�մ�);
		�մ� = new ����(�մ�);
		System.out.println(�մ�.����());
		
	}
}
*/





/*
//5��25��
class AA{}
class BB extends AA{}
class CC extends AA{}
public class Hello {  
	
	
	public static void main(String[] args){
		AA tttt1 = new BB(); //ttt1�� �ڽ��� bb���ȴ�
		tttt1 = new CC(); //ttt1�� �ڽ��� cc�� ����
		tttt1 = new BB();
	}
}
*/



/*
//5��25��
class A{
	int num = 30;
	int run() {
		System.out.println("A run");
		return num;
	}
}
class B extends A{
	A a;
	int num = 20;
	B(A a){
		this.a = a;
	}
	int run() {
		System.out.println("B run");
		return num + a.run();
	}
}
class C extends A{
	A a;
	int num = 10;
	C(A a){
		this.a = a;
	}
	int run() {
		System.out.println("C run");
		return num + a.run();
	}
}
public class Hello {  
	
	
	public static void main(String[] args){
		//A a;
		//a = new A();   / A a = new A(); �Ѵ� �Ȱ���
		A a = new A(); //1
		a.run();
		a = new B(a);	//2	
		a.run();
		//System.out.println(a.run());
		a = new C(a);
		System.out.println(a.run());
	}
}
*/






/*
//5��24��
//������ �ð�
class A{
	void greenColor() {
		
	}
}

//1. ���� �������̵��� �Ϸ��� �ߴ�.
//2. ��Ÿ������ �Լ��̸� �߸�����
//3. �׸��� ���� ��Ÿ�� ��������
//4. @ + Ctrl+Space - ��Ÿ Ȯ�ΰ���
class B extends A{
	@Override
	void greenColor() {
		
	}
}
public class Hello { 
	
	

	public static void main(String[] args){
		
	}
}
*/






/*
//5��24��
public class Hello {  
	
	
	public static void main(String[] args){
		System.out.println(1);
		try {
			Reader r = new FileReader("sample.txt");
			
			while(true) {
				int readData = r.read();
				//read����� ������ ��� �а� ������ ������ "-1"��������
				if(readData == -1) {
					System.out.println("���� �������");
					break;
				}
				System.out.println((char)readData);
				
				
			}
			
			
			
			r.close();
		} catch (Exception e) {
			
		}
		System.out.println(2);
	}
}
*/





/*
//5��24��
public class Hello {  
	
	
	public static void main(String[] args){
		//File �Է� ���
		System.out.println(1);
		//���ο� ������ ������̴�.
		try {
			Writer w = new FileWriter("test.txt");
			
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 8; j++) {
					if( (i + j) % 2 == 0) {
					w.write("O ");	//¦��
					}else {
					w.write("X ");	//Ȧ��
					}
				}
				
				w.write("\n");
			}
			
			w.close(); //�׻� close�� ������� �����߻����� ����
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(2);
		
	}
}
*/





/*
//5��24��
public class Hello {  
	
	
	public static void main(String[] args){
		//File �Է� ���
		System.out.println(1);
		//���ο� ������ ������̴�.
		try {
			Writer w = new FileWriter("test.txt");
			
			w.write("apple");
			w.write("\n");
			w.write("����ȭ");
			
			w.close(); //�׻� close�� ������� �����߻����� ����
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(2);
		
	}
}
*/




/*
//5��24��
class Apple{
	private static Apple ins = null;
	//������ = ��ü�� �����ɶ� ������ ��µǴ� �Լ�
	//������,�ʵ�,�޽����� ���� prive�� �ɸ��� �ۿ��� ���Ұ�
	private Apple(){}
			
	static Apple getIns() {
		System.out.println("Test");
		
		if(ins == null) {
			
			ins = new Apple();
		}
		
		return ins;
	}
	void m1() {
		System.out.println("�Լ� ȣ��");
	}
	
}

class Banana{}
public class Hello {  
	
	
	public static void main(String[] args){
		//	Apple a1 = new Apple();
		//	Apple a2 = new Apple();
		Apple a1 = Apple.getIns();
		Apple a2 = Apple.getIns();
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		a1.m1();
		a2.m1();
		
		// ==�� �ΰ��� ��ü�� ���������� ����°��̴�
		if(a1 == a2) {
			System.out.println("O");
		}else {
			System.out.println("X");
		}
		// System.out.println(a1 == a2 ? "O" : "X"); ���׿���
		
		Banana b1 = new Banana();
		Banana b2 = new Banana();
		System.out.println(b1 == b2 ? "O" : "X");
		
		a2.m1();
	}
}
*/







/*
//5��24��
class Apple{
	private int num;
	
	//�����̺��� Ŭ���� �ܺο��� ���¹��
	//setter �Լ� , getter �Լ�
	void setNum(int num) {
		this.num = num;
	}
	
	int getNum() {
		return num;
	}
	
}
public class Hello {  
	
	
	public static void main(String[] args){
		Apple apple = new Apple();
		// apple.num = 10; ����
		apple.setNum(999);
		System.out.println(apple.getNum());
		
	}
}
*/






/*
//5��24��
class Apple{
	// ��ü�� �ܺο��� ���� ���ϰ��ϴ°��� ����������
	private int a; //���� Ŭ���� ���� ������ ���డ��
	public int b;
	
	void m1() {
		a = 10;
		b = 20;
	}
}
public class Hello {  
	
	
	public static void main(String[] args){
		Apple apple = new Apple();
		//private = �Ʒ� ������ Ŭ���� �ܺο��� ���Ұ�
		// apple.a = 10; ����
		apple.b = 23;
	}
}
*/





/*
//5��21��
public class Hello {  
	
	//������ ���ڸ� �ް������
	public static void main(String[] args){
		//import java.util.Random; �ʿ�
		Random rn = new Random();
		int num = rn.nextInt();
		System.out.println(num);
		
		for (int i = 0; i < 10; i++) {
			System.out.println(rn.nextInt());
		}
		System.out.println("===========");
		for (int i = 0; i < 10; i++) {
			System.out.print(rn.nextInt(100)+" ");
		}System.out.println();
	}
}
*/




/*
//5��21��
public class Hello {  
	
	
	public static void main(String[] args){
	
		
		//for �� ���� ���̺��̴� ��� 1������
		for (int i = 0; i <5; i++) {}
		
		//for �� ���� ���̺��̴� ��� 2������
		for (int i = 1; i <=5; i++) {}
		
		//for �� ���� ���̺��̴� ��� 3������ (3 * n+1)
		for (int i = -3; i <=+3; i++) {}
	}
}
*/






/*
//5��21��
public class Hello {  
	
	
	public static void main(String[] args){
		//Ư�� �����͸� ã�Ƽ� �����ϰ�ʹ�.
		LinkedList<Integer> mm = new LinkedList<Integer>();
		for (int i = 0; i <10; i++) {
			mm.add(i * 2);
		}
		mm.add(101);
		mm.add(102);
		mm.add(103);
		
		System.out.println(mm);
		
		
		//¦���� �����غ���
		for (int i = 0; i < mm.size();) {
			int num = mm.get(i);
			if(num % 2 == 0) {
				mm.remove(i);
			}else {
				 i++;
			}
				
		}
		System.out.println(mm);
	}
}
*/





/*
//5��21��
public class Hello {  
	
	
	public static void main(String[] args){
		//Ư�� �����͸� ã�Ƽ� �����ϰ�ʹ�.
		LinkedList<Integer> mm = new LinkedList<Integer>();
		for (int i = 0; i <10; i++) {
			mm.add(i * 10+i);
		}
		System.out.println(mm);
		
		for (int i = 0; i < mm.size(); i++) {
			if(mm.get(i) == 55) {
				mm.remove(i);
				break;
			}
		}
		System.out.println(mm);
	}
}
*/






/*
//5��21��
public class Hello {  
	
	
	public static void main(String[] args){
		LinkedList<Integer> mm = new LinkedList<Integer>();
		for (int i = 0; i <10; i++) {
			mm.add(i * 10+i);
		}
		System.out.println(mm);
		
		//Ư�� �����͸� ã�°��� �˻��̶�� �Ѵ�.(search:read)
		
		for (int i = 0; i < mm.size(); i++) {
			Integer num = mm.get(i);
			//44�� �ִ��� ����� ����
			if(num == 99) {
				System.out.println(i + "��°���� ã�Ҵ�");
				break;
			}
			
			if(i == mm.size() -1) {
				System.out.println("��ã�Ҵ�");
			}
		}
		System.out.println("ȣ����");
	}
}
*/







//5��21��


/*
public class Hello {  
	
	
	public static void main(String[] args){
	LinkedList<Integer> mm = new LinkedList<Integer>(); //mm�̶�� ��ü�� crud�� �����Ҽ��մ�
	//int s = mm.size();
	System.out.println(mm.size());
	
	//"Creat"RUD
	mm.add(100);
	System.out.println(mm.size()+"��");
	
	for (int i = 0; i < 10; i++) {
		mm.add(i * 10 + i);
	}
	System.out.println(mm.size()+"��");
	
	//C"Read"UD
	//���1 �ܼ��ϰ� ���������� Ȱ�뼺�̾���.
	System.out.println(mm);
	
	//���2 Ȱ������� ����.
	for (int i = 0; i <mm.size(); i++) {
		System.out.print(mm.get(i)+" ");
	}System.out.println();
	
	//���3 for each : for ���� ��������
	for (Integer item : mm) {
		System.out.print(item+" ");
	}System.out.println();
	
	//�÷����� forEach������Ҽ��ִ�.
	//�׷��� �迭�� ����Ҽ��ִ�.
	int[]ar = {10,20,30,40};
	for (int data : ar) {
		System.out.print("ȣ����" + data + " ");
	}System.out.println();
	
	//get���� �����̳� �� n��° ������ ���
	System.out.println(mm.get(5));
	
	//CR"Update"D : ����
	mm.set(5, 2021);
	System.out.println(mm);
	
	//CRU"Delete" : ����
	mm.remove(4);
	System.out.println(mm);
	
	
	}
}
*/





/*
//5��21��
public class Hello {  
	
	
	public static void main(String[] args){
		//crud������ ����Ҽ��ִ� ��� ������ "�ݷ���"�̶��Ѵ�
		//������ �����ϴ� ���� "crud" �Ʒ� �Լ� ����
		//�����͸� ����ִ°��� insert(add)
		//�����͸� �����ϴ� ���� remove(erase,delete)
		//�����͸� ���� update
		//������ �о���°� reading
		//create
		//�ݷ��� - 
		//linkdlist - �ڷᱸ��
		
		//�����̳� �ȿ� ������ ������"������ ���ǵ�"�� ����
		// �����̳� = <����Ʈ>
	}
}
*/




/*
//5��20��
public class Hello {  
	
	
	public static void main(String[] args){
		// int - ǥ��Ÿ�� , num - ���� , = - ���Կ����� , 10 - ���ͷ�
		int num = 10;
		char ch = '��';
		String s = "����ȭ";
		
		//1.���� ������ �̸��� �ߺ��Ǹ� �ȵ�
		//2.���ڸ� �����Ҽ� ������ ù���ڴ¾ȵȴ�.
		int apple = 10;
		int apple1234 = 20;
	//�ȵǴ�Ÿ��(2)	int 9apple = 10;
		
		//3. $ , _ �� ������ ���Ư������ ���Ұ�
		
		//4.�ѱ��� ����Ҽ� ������,���Ѵ�.
		int ��� = 10;
		System.out.println(���);
		
		
		//5. 1�ܾ��̻��� ������ �Ͼ��
		//�Ϲ������� �ܾ��� ù���ڸ� �����ϰ� �빮�ڸ� ���
		//int applenumber = 10;(ī�� ǥ���)
		int appleNumberCountry = 10;
		
		
	}
}
*/




/*
//5��20��
public class Hello {  
	static String HexaToBinary(int n) {
		String s = Integer.toBinaryString(n);
		Integer.toBinaryString(n);
		System.out.println(s.length());
		while(s.length() < 32) {
			s = "0"+s;
		}
		//System.out.println(s);
		// 0011,1011,0001,0010,1100,1101,0101,1001
		
		StringBuffer s1 = new StringBuffer(s);
		System.out.println("s1 : " + s1);
		
		for (int i = 0; i < 7; i++) {
			s1.insert((7-i)*4," ");
		}
		//s1.insert(28," ");
		//s1.insert(24," ");
		//s1.insert(20," ");
		//s1.insert(16," ");
		//s1.insert(12," ");
		//s1.insert(8," ");
		//s1.insert(4," ");
		
		System.out.println("s1 :" + s1);
		
		
		return s1.toString(); 
	}
	
	public static void main(String[] args){
		int num = 0x3b12cd59;
		System.out.println(Integer.toBinaryString(num));
		// 111011000100101100110101011001
		//0011 1011 0001 0010 1100 1101 0101 1001
		
		System.out.println(HexaToBinary(num));
		num = 0xab;
		System.out.println(HexaToBinary(num));
		
	}
}
*/





/*
//5��20��
public class Hello {  
	
	
	public static void main(String[] args){
		int num1 = 100; // 10������ ��
		System.out.println(num1);
		
		int num2 = 0x100; //16������ �ؼ��� 10�����ε�
		int num5 = 0x2a9;
		int num3 = 0x63ce7bcd;
		//2������ȯ 0110(6) 0011(3) 1100(c) 1110(e) 0111(7)
		//1011(b) 1100(c) 1101(d)
		System.out.println(num2);
		System.out.println(num3);
		
		
		//16������ 2������ ����ϴ¹�
		String s = Integer.toBinaryString(num3);
		System.out.println(s);
		
		int num4 = 0xab;
		String s1 = Integer.toBinaryString(num4);
		System.out.println(s1);
		//s1����� 1010 1011�̴�(���� 0������)
	}
}
*/






/*
//5��20��
public class Hello {  
	
	
	public static void main(String[] args){
		//���ڸ� ǥ���ϴµ� ���Ǵ� ������ ������ 10���ΰ���
		//�츮�� 10���� ü��������Ѵٰ��Ѵ�.
		
		
		//���ڸ� ǥ���ϴµ� ���Ǵ� ������ ������ 16�����
		//�츮�� 16���� ü���� ����Ѵٰ� �Ѵ�.
		
		//���ڸ� ǥ���ϴµ� ���Ǵ� ������ ������ 2�����
		//�츮�� 2���� ü���� ����Ѵٰ� �Ѵ�.
		
		// ���ڸ� ǥ���ϴµ� ���Ǵ� ������ ������ 8�����
		//�츮�� 8���� ü���� ����Ѵٰ� �Ѵ�.
		
		//A 10,B 11,C12,D13,E14,F15
		//11101011000010(2����>16���� ��ȯ)
		//11 1010 1100 0010
		//3		a  	c	2
		
		// 10101011011010(2���� > 16���� ��ȯ)
		// 10 1010 1101 1010
		// 2   A    D    A
		
		//B93E (16���� > 2���� ��ȯ)
		//1011 1001 0011 1110
	}
}
*/






/*
//5��20��
class Tiger{
	
}
public class Hello {  
	
	
	public static void main(String[] args){
		//s1�̶�� ��ü�� �ֹι�ȣ�� �����ش�
		String s1 = "ȣ����1";
		System.out.println(s1.hashCode());
		
		String s2 = "ȣ����2";
		System.out.println(s2.hashCode());
		
		Tiger t = new Tiger();
		System.out.println(t.hashCode());
		
	}
}
*/






/*
//5��20��//�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڿ����������
class Tiger{
	int num3;
	void m3() {}
}
class Lion extends Tiger{
	int num2;
	void m2() {}
}
class Cat extends Lion{
	int num1;
	void m1() {}
}
public class Hello {  
	
	
	public static void main(String[] args){
		//class String extends Object
		String s;
		Math m;
		Thread t;
		
		Tiger t2;
		Lion lion;
		Cat cat;
	}
}
*/






/*
//5��19��~5��20��
public class Hello {  
	
	
	public static void main(String[] args){
		String s = "����ȭ�����Ǿ����ϴ�";
		char ch = s.charAt(3);
		System.out.println(ch);
		//1
		System.out.println(s.charAt(3));
		
		//2  (-1�� ��ã�Ҵ�.)
		System.out.println(s.indexOf("������"));
		
		if(s.indexOf("ȭ����")== -1) {
			System.out.println("��ã�Ҵ�");
		}else {
			System.out.println("ã�Ҵ�");
		}
		
		//3
		System.out.println(s.length());
		
		//4
		System.out.println(s.replace("����", "����������"));
		
		//5
		System.out.println(s.substring(3));
		
		//6 3������ 5���տ����� ©����
		System.out.println(s.substring(3,5));
		
		//7
		String s1 = "Apple";
		//String java.lang.String.toLowerCase()
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		//���� �����Ͱ� ���ŵǴ°��� �ƴϴ�(���� ������ ����)
		String s2 = s1.toUpperCase();
		System.out.println("s2��"+s2);
		
		
		
		
		for (int i = 0; i < 5; i++) {
			System.out.print(i+ " ");
		}System.out.println();//�ٹٲ޸� �Ͼ��
		
		System.out.println("ȣ����3");
		
		//8 trim : �հ����� �����̽� ������ �����Ѵ�.
		//���� ���̿��մ� �����̽��� �ش���׾���.
		String s3 = " A p p l e ";
		System.out.print(s3);
		System.out.println(1000);
		System.out.print(s3.trim());
		System.out.println(2000);
	}
}
*/



/*
//5��18��
public class Hello {  
	
	
	public static void main(String[] args){
		int a = 100;      		//����
		String b = "200";		//���ڿ�
		System.out.println(a+100);
		System.out.println(b+100);
		
		//���1 ���� >>���ڿ�
		int n1 = 123;
		String s1 = Integer.toString(n1);
		System.out.println(s1+456);
		
		//���2 ���� >>���ڿ�
		int n2 = 456;
		String s2 = ""+n2;
		System.out.println(s2+n2);
		
		
		//(����ó�� ����)���ڿ� >> ����
		String s3 = "999";
		int n3 = Integer.parseInt(s3);
		System.out.println(n3+1);
	}
}
*/




/*
//5��18��
public class Hello {  
	static int m1() {
		System.out.println("ȣ����");
		return 100;
	}
	
	static void m2(int a , int b) {
		System.out.println("ȣ����");
		
		
		if(a>b) {
			System.out.println("�ڳ���");
		}else {
			//�Լ� �۵��� �ߴܽ�Ŵ
			return;
		}
		
		System.out.println("������");
	}
	
	static void m3(int a , int b) {
		try {
			System.out.println("�޹���");
			if(a>b) {
				System.out.println("����");
			}else {
				return;
			}
		} catch (Exception e) {
			
		}finally {
			System.out.println("��踻");
		}
		
	}
	
	public static void main(String[] args){
		m2(10,3);
		System.out.println("======");
		m2(3,10);
		System.out.println("======");
		m3(10,3);
		System.out.println("======");
		m3(3,10);
	}
}
*/






/*
//5��18��
public class Hello {  
	
	
	public static void main(String[] args){
		System.out.println("ȣ����");
		
		//Unhandled exception=����ϰ� ���� ����� tryĳġ�� ����ض�
		
		for (int i = 0; i < 6; i++) {
			System.out.println("ȣ����"+i);
			try {Thread.sleep(3000);} catch (Exception e) {}
		}
		
		
		
		
		System.out.println("ȣ����2");
	}
}
*/






/*
//5��18��
class Tiger{
	void f1() {
		System.out.println("�Լ�1����");
		
		//���α׷��Ӵ� �ͼ��� �߻���ų���մ�
		try {
			throw new Exception();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	//throws Exception : �ͼ���ó����
	//�Լ��� ȣ���ѻ���� �ذ��ϼ���.
	void f2() throws Exception{
		System.out.println("�Լ�2����");
		throw new Exception();
		
		
	}
}
public class Hello {  
	
	
	public static void main(String[] args){
		Tiger t = new Tiger();
		t.f1();
		System.out.println("ȣ����");
		
		//Unhandled exception
		try {
			t.f2();
		} catch (Exception e) {
			// TODO: handle exception
		}
			
		System.out.println("ȣ���̸�����");
	}
}
*/





/*
//5��18��
public class Hello {  
	
	
	public static void main(String[] args){
		//ex1)
		//�ͼ���(���ܰ� �߻�)
		//���� �߻��Ҽ��ִ�.�׷��� ���α׷��� �Լ� �����Ű��
		System.out.println("ȣ����1");
		
		// java.lang.ArithmeticException
		//�ͼ��� �߻��� ���α׷��� �ߴܵ�
		
		//�ͼ����� �߻��ϸ� catch�� �Ѿ��
		//�׷��� ������ catch�� ����������
		try {
			System.out.println(4/0);
		} catch (Exception e) {
			//���α׷��� �ߴܵ��� ����.
			System.out.println("catch ����");
			//�߻��� �ͼ����� Ȯ���ϰ� ������
			e.printStackTrace();
		}
	
		System.out.println("ȣ����2");
		
		//ex2)
		
		try {
			int[] ar = new int[10];
			ar[0] = 10;
			
			// java.lang.ArrayIndexOutOfBoundsException
			ar[10] = 20;
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		System.out.println("ȣ����3");
		
		
		
		// ex)3
		String s1 = "����ȭ�����Ǿ���";
		System.out.println(s1.length());
		
		String s2 = null;
		
		try {
			System.out.println(s2.length());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		System.out.println("ȣ����4");
	}
}
*/





/*
//5��18��
public class Hello {  
	
	
	public static void main(String[] args){
		int a =10;
		a++;
		System.out.println(a);
		++a;
		System.out.println(a);
		System.out.println("======");
		// �ٸ����� ����
		int b= 10;
		int c ;
		c=b++;//���� >> ����
		System.out.println(c);
		System.out.println("========");
		
		
		int d= 10;
		int e ;
		e=++d;; //���� >>����
		System.out.println(e);
		
	}
}
*/





/*
//5��18��
class Baduk{
	AI ai;
	Baduk(AI ai){
		this.ai = ai;
		System.out.println("�뱹����");
	}
	 void play() {
		 ai.play();
	 }
	 void end() {
		 ai.end();
		 System.out.println("��Ⱑ����");
	 }
	
}

//abstract class AI{
//	abstract void play();
//}
interface AI{
	void play();
	void end();
}

class Alphago implements AI{
	public void play() {
		System.out.println("�ΰ������� ���İ��");
	}
	public void end() {
		System.out.println("���İ� ������� ���");
	}
}
class Betaago implements AI{
	public void play() {
		System.out.println("�ΰ������� ��Ÿ���");
	}
	public void end() {
		System.out.println("��Ÿ�� ������� ���");
	}
}



public class Hello {  
	
	
	public static void main(String[] args){
		Baduk baduk1 = new Baduk(new Alphago());
		baduk1.play();
		baduk1.end();
		System.out.println("==========");
		Baduk baduk2 = new Baduk(new Betaago());
		baduk2.play();
		baduk2.end();
	}
}
*/








/*
//5��18��
class Baduk{
	Baduk(){
		System.out.println("�뱹����");
	}
	 void play(AI ai) {
		 ai.play();
	 }
	 void end(AI ai) {
		 ai.end();
		 System.out.println("��Ⱑ����");
	 }
	
}

//abstract class AI{
//	abstract void play();
//}
interface AI{
	void play();
	void end();
}

class Alphago implements AI{
	public void play() {
		System.out.println("�ΰ������� ���İ��");
	}
	public void end() {
		System.out.println("���İ� ������� ���");
	}
}
class Betaago implements AI{
	public void play() {
		System.out.println("�ΰ������� ��Ÿ���");
	}
	public void end() {
		System.out.println("��Ÿ�� ������� ���");
	}
}



public class Hello {  
	
	
	public static void main(String[] args){
		Baduk baduk = new Baduk();
		baduk.play(new Alphago());
		baduk.end(new Alphago());
		System.out.println("==========");
		baduk.play(new Betaago());
		baduk.end(new Betaago());
	}
}
*/





/*
//5��18��
class Baduk{
	Baduk(){
		System.out.println("�뱹����");
	}
	 void play(AI ai) {
		 ai.play();
	 }
	
}

//abstract class AI{
//	abstract void play();
//}
interface AI{
	void play();
}

class Alphago implements AI{
	public void play() {
		System.out.println("�ΰ������� ���İ��");
	}
}
class Betaago implements AI{
	public void play() {
		System.out.println("�ΰ������� ��Ÿ���");
	}
}
class Gammago implements AI{
	public void play() {
		System.out.println("�ΰ������� �������");
	}
}


public class Hello {  
	
	
	public static void main(String[] args){
		Baduk baduk = new Baduk();
		baduk.play(new Alphago());
		baduk.play(new Betaago());
		baduk.play(new Gammago());
	}
}
*/




/*
// 5��18��
class Baduk{
	Baduk(){
		System.out.println("�뱹����");
	}
	 void play(AI ai) {
		 ai.play();
	 }
	
}

class AI{
	void play() {
		
	}
}
class Alphago extends AI{
	void play() {
		System.out.println("�ΰ������� ���İ��");
	}
}
class Betaago extends AI{
	void play() {
		System.out.println("�ΰ������� ��Ÿ���");
	}
}
class Gammago extends AI{
	void play() {
		System.out.println("�ΰ������� �������");
	}
}
public class Hello {  
	
	
	public static void main(String[] args){
		Baduk baduk = new Baduk();
		baduk.play(new Alphago());
		baduk.play(new Betaago());
		baduk.play(new Gammago());
	}
}
*/





/*
//5�� 18��
class Baduk{
	Baduk(){
		System.out.println("�뱹����");
	}
	 void play(Alphago alphago) {
		 alphago.play();
	 }
	 void play(Betaago betaago) {
		 betaago.play();
	 }
}

class Alphago{
	void play() {
		System.out.println("�ΰ������� ���İ��");
	}
}
class Betaago{
	void play() {
		System.out.println("�ΰ������� ��Ÿ���");
	}
}
public class Hello {  
	
	
	public static void main(String[] args){
		Baduk baduk = new Baduk();
		baduk.play(new Alphago());
		baduk.play(new Betaago());
	}
}
*/



/*
 //5��18��
class Baduk{
	Baduk(){
		System.out.println("�뱹������");
	}
	
	void play() {
		System.out.println("�ΰ������� ���İ�");
	}
}


public class Hello {  
	
	
	public static void main(String[] args){
		Baduk baduk = new Baduk();
		
	}
}
*/



/*
//5��17��
public class Hello {  
	
	
	public static void main(String[] args){
		
		
		
		
		int a= 15,b=10;
		int c ;
		
		
		//if else ���� ���ö��� ���Թ޴� ������ �������� �ݵ�� Ȯ��
		//�����ϴٸ� ���׿��� �̿�
		if(a>b) {
			c=1000;
		}else {
			c=2000;
		}
			System.out.println(c);
			
			//�������ڵ� ���׿���
		c = a>b ? 1000 :2000;
		
		// =============
		if(a>b) {
			System.out.println("ȣ����");
		}else {
			System.out.println("�ڳ���");
		}
		
		//�����ڵ�
		System.out.println(a>b ? "ȣ����" : "�ڳ���");
		
	}
}
*/




/*
//5��17��
public class Hello {  
	
	public static void main(String[] args){
		int a = 3, b=4;
		System.out.println(a+ " " +b);
		int temp; //�ӽ� ����
		temp = a;//temp = 3;
		a=b;//a=4;
		b=temp;//b=3;
		System.out.println(a+ " " +b);
		
	}
}
*/






/*
//5��17��
class Tiger{   //�� Ŭ���� ������ ���Ⱑ ������ //�Ѹ���� ��ӺҰ� #3
	final int num = 10; //num�� ���� �޴°� 10�� ������ #1
	final float pipipi = 3.141592f;
	
	final void m1() { //����Ŭ������ m1�� �������̵� �Ҽ����� #2
		
	}
}

class Lion extends Tiger{
	//void m1() {}
		
	}


public class Hello {  
	
	public static void main(String[] args){
		Tiger t = new Tiger();
	    
	}
}
*/



/*
//5��17��
class A{
	void m1() {
		System.out.println(1);
	}
}
interface B{
	void m2();
}

interface C{
	void m3();
}

class D extends A implements B,C{
	public void m2() {
		System.out.println(2);
	}
	public void m3() {
		System.out.println(3);
	}
}



public class Hello {  
	
	public static void main(String[] args){
		D t1 = new D();
		t1.m1();
		t1.m2();
		t1.m3();
		A t2 = new D();
		t2.m1();
		B t3 = new D();
		t3.m2();
		C t4 = new D();
		t4.m3();
		
		String s;
	}
}
*/





/*
//5��17��
//1�� ���(��ȣ)
//���� ��� �̼���
abstract class A{
	abstract void m1();
	
}
//2�����(��ȣ) 
//���� �������̽�(���) �����Ǳ⶧��
interface B{
	 void m1();
}

public class Hello {  
	
	public static void main(String[] args){
		
		
	}
}
*/




/*
//5�� 17��
//abstract class A{
	//ǥ�ر԰�
//	abstract void m1();
//	abstract void m2();
//	abstract void m3();
//}

//class B extends A{
//	void m1() {
		
//	}
//	void m2() {
		
//	}
//	void m3() {
		
//	}
//}

//1������
interface A{
	//ǥ�ر԰�
	 void m1();
	 void m2();
	 void m3();
}

//2������
//public�� �ٿ����Ѵ�
class B implements A{
	public void m1() {
		System.out.println(1);
	}
	public void m2() {
		System.out.println(2);
	}
	public void m3() {
		System.out.println(3);
	}
}

class C implements A{
	public void m1() {
		System.out.println(4);
	}
	public void m2() {
		System.out.println(5);
	}
	public void m3() {
		System.out.println(6);
	}
}
public class Hello {  
	
	public static void main(String[] args){
		A a1 = new B();
		A a2 = new C();
		
		a1.m1();
		a1.m2();
		a1.m3();
		a2.m1();
		a2.m2();
		a2.m3();
	}
}
*/








/*
//5��17��
abstract class A{
	//�߻�Ŭ���� , �߻��Լ�
	//�̿ϼ��Ȱ��� �߻��̶�� �Ѵ�
	//
	abstract void m1();
}
class B extends A{
	void m1() {
		
	}
}
public class Hello {  
	
	public static void main(String[] args){
		//A a = new A(); //���Ұ�, A�� �ڵ���ü�� �ο���������
		A a = new B();
	}
}
*/



/*
//5�� 17��
//1.abstract ���� �Լ��� �ڵ屸���� ����.
//2.abstract ���� �Լ��� �����ϴ� Ŭ������ ab�� �ٿ�����
//3.��ӹ��� �ڽ��� �ݵ�� �θ� ab�� �����ؾ���
abstract class ��������{
	void Į�����(){
		System.out.println("����Į ����");
	}
	abstract void ���и����();
}

class ��������1 extends ��������{
     void ���и����() {
    	 System.out.println("����� ����");
     }
}

class ���� extends ��������{
	 void ���и����() {
    	 System.out.println("�������� ����");
     }
}
public class Hello {  
	
	public static void main(String[] args){
	    �������� t = new ��������1();
	    t.Į�����();
	    t.���и����();
	  
	}
}
*/




/*
//5��17��
abstract class A{
	void m1() {
		System.out.println(1);
	}
	void m2() {
		System.out.println(2);
	}
	//���Ͼ��� �ڵ� 
	//���� �ֻ�(���)�Լ� �Դϴ�
	abstract void m3();
}
class B extends A{
	void m2() {
		System.out.println(3);
	}
	//�θ�Ŭ�������� abstact�� ������ �����ִ� ���� �Լ��� ��������
	void m3() {
		System.out.println(4);
	}
}

public class Hello {  
	public static void main(String[] args){
		A a = new B();
		a.m1();
		a.m2();
		a.m3();
	}
}
*/




/*
//5��17��
class Tiger{
	void m1() {
		System.out.println(1);
	}
	void m2() {
		Tiger t = new Tiger();
		t.m1();
		// t.m2(); �ڱⰡ �ڽ��� ȣ���ϴ°� ���������� �� (���ѷ���)

	}
}
//����ƽ �ȿ��� ����ƽ�� ��밡��
public class Hello {  
	void m3() {
		System.out.println("���");
	}
	static void m4() {
		System.out.println("�ȳ�");
	}
	public static void main(String[] args){
		Tiger t = new Tiger();
		t.m1();
		t.m2();
		
		Hello h = new Hello();
		h.m3();
		m4();
	}
}
*/





/*
//5��17��
public class Hello {  
	int a;
	static int b;
	Hello(){
		
	}
	void m1() {
		
	}
	static void m2() {
		
	}
	// static �Լ��ȿ��� ����ƽ������ ����ƽ �Լ��� ��밡��
	public static void main(String[] args){
		//m1();
		m2();
		//a=10;
		b= 10;
	}
}
*/



/*
//5��17��
class Tiger{
	Tiger(){
		a++;
		b++;
	}
	static int a = 0;
	int b = 0;
		
	
	
}
//static int a =������ �����ϴ� �޸�
//int b;	= ������������� �޸�

//class Tiger{
//	static int a;
//	int b;			
//}
public class Hello {  
	public static void main(String[] args){
		System.out.println(Tiger.a);
		Tiger t1 = new Tiger();
		System.out.println(t1.a + " " + t1.b);
		Tiger t2 = new Tiger();
		System.out.println(t2.a + " " + t2.b);
		Tiger t3 = new Tiger();
		System.out.println(t3.a + " " + t3.b);
		
		System.out.println(Tiger.a);
	}
}
*/



/*
//5��14��
//static = ������Ŵ(����)
//��ü�������� �ʰ� ��밡��
class Tiger{
	static void m1() {
		System.out.println(1);
	}
	void m2() {
		System.out.println(2);
	}
}
public class Hello {  
	public static void main(String[] args){
	Tiger.m1();
	Tiger a = new Tiger();
	a.m1();
	a.m2();
	
	System.out.println(Integer.MAX_VALUE);
	}
}
*/





/*
//5��14�� 
class Animal{
	void cry() {
		
	}
}
	class Dog extends Animal{
		void cry() {
			System.out.println("�۸�");
		}
	
	}
	class Cat extends Animal{
		void cry() {
			System.out.println("�߿�");
		}
	
	}
	class Snake extends Animal{
		void cry() {
			System.out.println("����~~");
		}
	
	}
	class Bear extends Animal{
		void cry() {
			System.out.println("����");
		}
	}
	
	class Zoo{
		void sound(Dog dog) {
			dog.cry();
		}
		void sound(Cat cat) {
			cat.cry();
		}
		void sound(Snake snake) {
			snake.cry();
		}
		void sound(Bear bear) {
			bear.cry();
		}
		void sound(Animal ani) {
			ani.cry();
		}
	}
public class Hello {  
	public static void main(String[] args){
		Zoo zoo = new Zoo();
		zoo.sound(new Dog());
		zoo.sound(new Cat());
		zoo.sound(new Snake());
		zoo.sound(new Bear());
		
	}
}
*/





/*
class Tiger{
	void cry() {
		System.out.println("����");
	}
}

class Lion{
	void m1() {
		System.out.println(1);
	}
	void m2(int num,String str) {
		System.out.println(2);
	}
	//Tiger t = new Tiger()
	void m3(Tiger t) {
		t.cry();
	}
}
public class Hello {  
	public static void main(String[] args){
		Lion t = new Lion();
		t.m1();
		t.m2(2, "");
		String s1 = "������";
		t.m2(2, new String("�ھ˶�"));
		System.out.println("============");
		t.m3(new Tiger());
	}
}
*/





/*
//5��14��
class Animal{
	//�پ��� ����� �Ͼ���ֵ��� ��ĳ���� �ϴ°���
	//���⼺�̶��Ѵ�
	void cry() {
		System.out.println("...");
	}
}
class Dog extends Animal{
	void cry() {
		System.out.println("�۸ۡ�");
	}
}

class Cat extends Animal{
	void cry() {
		System.out.println("�߿�");
	}
	
}

class Snake extends Animal{
	void cry() {
		System.out.println("����~");
	}
	
}
public class Hello {  
	public static void main(String[] args){
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal snake = new Snake();
		
		dog.cry();
		cat.cry();
		snake.cry();
			
	}
}
*/







/*
//5�� 14��
class A{
	void m1() {
		System.out.println(1);
	}
	void m3() {
		System.out.println(4);
	}
}
class B extends A{
	
	void m1() {
		System.out.println(2);
		m2();
		m3();
	}
	void m2() {
		System.out.println(3);
	}
}

public class Hello {  
	public static void main(String[] args){
		A a = new B(); 
		a.m1(); 
		
	}
}
*/





/*
 //5�� 14��
//��Ӱ��迡�� ��ĳ������ ����Ҷ�
//�θ��Լ��̸��̶� �ڽ��Լ��̸� �����Ҷ�
//�̰��� �Լ� �������̵��̶�� �Ѵ�
class A{
	void m1() {
		System.out.println(1);
	}
}
class B extends A{
	//�������̵� �Լ�
	void m1() {
		System.out.println(2);
	}
}
//��ĳ���õ� ��ü(1)�� �Լ�(2)�� ȣ��ɶ� �ݵ�� �ڽĿ��� ȣ��� �Լ��� �ִ��� Ȯ���Ѵ�
public class Hello {  
	public static void main(String[] args){
		A a = new B(); //1
		a.m1(); //2
	}
}
*/




/*
//5��14��
//������(�پ��� ������ ����� �Ͼ�� �ִ�)
class A{
	void m1() {
		System.out.println(1);
	}
	void m2() {
		System.out.println(888);
	}
}
class B extends A{
	void m1() {
		System.out.println(2);
	}
	void m3() {
		System.out.println(999);
	}
}
//��ü�� ��ĳ�������� �����ȴ�.
//�Լ��� ȣ��Ǹ� ������ ���� Ȯ��
//�׸��� ������ �̸��� �Լ��� �ڽ��� ������ �ڽ� �Լ� ����
//���ٸ� �θ� �Լ� ����
public class Hello {  
	public static void main(String[] args){
		
		//A a1 =new A();
		//a1.m1();
		
		//B a2=new B();
		//a2.m1();
		//System.out.println("========");
		
		A a3=new B(); //�θ� = �ڽ� == "��ĳ����" �������θ� �������� �ڽ�
		a3.m2();
		//a3.m3(); //�����ڵ�
		a3.m1();
	}
}
*/






/*
//5��14��
class T1{
	T1(){
		System.out.println("�θ����");
	}
	T1(int a , int b){
		System.out.println("�θ����");
	}
}

class T2 extends T1{
	T2(){
		//�ڵ� ������ �����Ǿ��ִ� ����
		//super();
		//super(); ���� �ڵ��ۼ��� ������ �������
		System.out.println("�ڽĻ���");
	}
	T2(int a){
		System.out.println("�ڻ�1");
	}
}
public class Hello {  
	public static void main(String[] args){
		T2 t = new T2();
		System.out.println("==========");
		T2 tt = new T2(100);
	}
}
*/








 //5�� 14��
/*
class T1{
	T1(){
		System.out.println("�θ����");
	}
}

class T2 extends T1{
	T2(){
		//�ڵ� ������ �����Ǿ��ִ� ����
		super();
		System.out.println("�ڽĻ���");
	}
}
public class Hello {  
	public static void main(String[] args){
		T2 t = new T2();
	}
}
*/







/*
//5��14��

//�θ� (Base class)
class Tiger{
	void m2() {
		System.out.println("tIGER ���");
	}
	void m3() {
		System.out.println("�θ�� ���");
	}
}

//�ڽ�(sub class)
//�ڽ� ������ ȣ��� �ڽĸ��� ȣ�� �� �θ� ������ ȣ��
class Lion extends Tiger{
	void m1() {
		System.out.println("Lion���");
	}
	void m3() {
		System.out.println("3�� ���");
	}
	void m4() {
		m3();
		super.m2(); //�θ� Ŭ������ �Լ� ���
		System.out.println("4�� ���");
	}
}
public class Hello {  
	public static void main(String[] args){
		Lion l = new Lion();
		
		l.m4();
		
	}
}
*/





/*
//5�� 13��
class Tiger{ //�θ�
	void m1() {
		System.out.println("�� �׸�");
	}
}

class Lion extends Tiger{ //�ڽ�
	void m2() {
	System.out.println("�𷡽ð� �׸�");
	}
}


public class Hello {  
	public static void main(String[] args){
		String a = "����";//ù�ڰ� �빮�ڷ� �����ϴ°��� "ǥ��Ŭ����" ex String
		System.out.println(a);
		System.out.println("========");
		
		Lion my = new Lion();
		
		my.m2();
		my.m1();
		
	
	}
}
*/





/*
//5�� 13��
class Lion{
	int num; //������ �� �ʵ�
	int fuel; //������ �� �ʵ�
	
	Lion(){
		
	}
	
	Lion(int num , int fuel){
		this.num = num;
		this.fuel = fuel;
	}
	
	void display() {
		System.out.println(this.num+ " " +this.fuel);
	}
}
public class Hello {  
	public static void main(String[] args){
		Lion t =new Lion(777,888);
		t.display();
		
	}
}
*/





/*
//5��13��
class Tiger{
	int a; 
	int b;
	
	void m1(int a,int b) {
		System.out.println(1);
		this.a = a*10;
		this.b = b*20;
	}
	void show() {
		System.out.println(this.a+" "+this.b); //1�� ���� �Ѵ� ����
		System.out.println(a+" "+b); //2�� ���� �Ѵ� ����
	}
}
public class Hello {  
	public static void main(String[] args){
		Tiger t1 = new Tiger();
		
		t1.m1(20,30);
		t1.show();
		
	}
}
*/







/*
//5�� 13�� (�ڽ������ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�) 
class Tiger{
	void m1() {
		System.out.println(1);
	}
	void m2() {
		m1();
		System.out.println(2);
	}
	void m3() {
		m2();
		System.out.println(3);
	}
	void m4() {
		m5();
	}
	void m5() {
		m4();
	}
}
public class Hello {  
	public static void main(String[] args){
		Tiger t = new Tiger();
		//t.m1();
		t.m5();
		
		
		
	}
}
*/





/*
//5��13��
class Tiger{
	int a; int b;
	
	Tiger(int x,int y){
		a=10;
		b=20;
	}
	
	void show(){
		System.out.println(a+b);
	}
	
	
}
public class Hello {  
	public static void main(String[] args){
		Tiger t = new Tiger(5,6);
		t.show();
		
		
		
		
		
	}
}
*/





/*
//5��13��
class Tiger{
	//�μ� �����̾��� �����ڸ� "����Ʈ������"��� �Ѵ� (����!)
	Tiger(){
		System.out.println("1���");
	}
	Tiger(int a){
		System.out.println("2���");
	}
	
	
}


public class Hello {  
	public static void main(String[] args){
		Tiger t1 = new Tiger(); //���� �����ڸ� ȣ���ϴ� �ڵ�

		
		
		
	}
}
*/







/*
//5��13��
class Tiger{
	//����ڰ� �����ڸ� ������ ������ ��ǻ�Ͱ� �ڵ����� ������ ��������
	//����ڰ� ������ ����ų� or ��ǻ�Ͱ� ����ų� ���� �ϳ�
	//�����ڵ� �����ε尡 ������ 
	Tiger(){
		System.out.println(1);
	}
	
	Tiger(int a){
		System.out.println(2);
	}
	Tiger(int a,int b){
		System.out.println(3);
	}
}
public class Hello {  
	public static void main(String[] args){
		Tiger t = new Tiger();
		Tiger t2 = new Tiger(20,40);
	
		
		
		
	}
}
*/







/*
//5�� 13��
class Tiger{
	//������
	//�Լ�
	//�Լ� ()�ȿ��� "�μ�"
	
	//�Լ��̸��� �����ϰ� �۸��Ҽ��մ� �����
	//���޵Ǵ� �μ��� ������ �ٸ��ų�
	//�μ��� ������ ���ٰ� �ϴ��� �޴� Ÿ��(int,float)�� �ٸ��� �����Լ���밡��			
	//�̰��� �����ε�or�����ε�(�Լ� ������) ��� �Ѵ�
	
	//�����ϰ� �̸� ����Ҽ� �ִ� 1��° ����
	//���޵Ǵ� �μ��� ������ �޶����
	
	//�μ� ���ް����� ������ ���޵Ǵ� Ÿ���� �ٸ��� ���� 2��° ����
	void m1() {
		System.out.println("m1���");
	}
	
	
	void m1(int a) {
		System.out.println("m2���");
	}
	
	void m1(int a,int b) {
		System.out.println("m3���");
	}
	void m1(String a) {
		System.out.println("m4���");
	}
}

public class Hello {  
	public static void main(String[] args){
		Tiger t = new Tiger();
		t.m1();
		t.m1(15);
		t.m1(12,23);
		t.m1("dd");
		
		
		
		
	}
}
*/





/*
//5�� 13��
class Airplane {
	
	int a,b;
	int fuel;
	
	Airplane(int x , int y , int f){
		a=x;
		b=y;
		fuel = f;
	}
	
	void m1() {
		System.out.println(a+" "+b+ " " + "�� ������� �����"+fuel);
	}
	
	
}
public class Hello {  
	public static void main(String[] args){
		
		Airplane t1 = new Airplane (10,20,100); // 10,20
	
		t1.m1();
		
		Airplane t2 = new Airplane (30,40,200);  // 30,40
		t2.m1();
		
		Airplane t3 = new Airplane (50,60,20);
		t3.m1();
	}
}
*/


/*
//5��13��
class Tiger {
	
	int a=10, b=20;
	Tiger(){
		a=30;
		b=40;
		System.out.println("������ ��");
		
	}
	void m1() {
		System.out.println(a+" "+b);
	}
	
	
}
public class Hello {  
	public static void main(String[] args){
		
		Tiger t = new Tiger ();
	
		
		
		
		
	}
}
*/



//5��13��
/*
class Tiger {
	//�����ڸ� ����ϴ� ����
	//�ʵ� �Ǵ� ������� �ʱ�ȭ �������� ����
	int a, b;
	Tiger(){
		a=10;
		b=20;
		System.out.println("������ ��");
		
	}
	void m1() {
		System.out.println(a+" "+b);
	}
	
	
}
public class Hello {  
	public static void main(String[] args){
		
		Tiger t = new Tiger ();
		t.m1();
		System.out.println(t.a + " "+  t.b);
		
		
		
		
	}
}
*/


/*
//5��13�� 
//������(������ �Լ��� ���Ӹ�)
//1.�����ڴ� �Լ��̱� ������ �Լ� ����� ������
//2. ������ �Լ��� �۸���� �������ִ�(�ݵ�� Ŭ���� �̸��� ����)
//3.�����ڴ� ���ϰ� ����������(void ������ ����ϸ� �ȵ�)
//4.�����ڴ� �Լ���� �ߴµ� ����ȣ���� �Ǵ°� �ϸ�
//5.��ü�� �����ɶ� �ڵ� ȣ���
//6.�����ڴ� ����ڰ� ���Ƿ� ȣ��Ұ�
class Tiger{
	Tiger(){
		System.out.println("������ ȣ��");
	}
}

public class Hello {  
	public static void main(String[] args){
		
		Tiger t = new Tiger();
		
		System.out.println(1);
		System.out.println(2);
		
		Tiger t1 = new Tiger();
		System.out.println(3);
	}
}
*/




/*
//5��12�� return ����
class Long{
	void m1() {
		System.out.println("m1 ȣ��");
	}
	
	int m2() {
		System.out.println("m2 ȣ��");
		return 2021;
	}
	float m3(int a ,int b) {
		System.out.println(a+b);
		return 3.14f;
	}
}
public class Hello 
{
	public static void main(String[] args) 
	{
		Long l = new Long();
		
		
		l.m2();
		
	
	
		
		
		
		
		
	}
}
*/





/*
//5��12�� return
class Tiger{
	//void = ���� 
	// m1�� ���ϰ��� ����.
	void m1() {
		
	}
	
	// ���ϰ��� �ִ�.
	//�� ����(int)�� ���ϵ˴ϴ�.
	int m2() {
		System.out.println("m2ȣ��");
		return 100;
		
	}
	
	int m3() {
		System.out.println("m3ȣ��");
		return 3*4;
		
	}
	
}
public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t =new Tiger();
		
		int num = t.m2();
		System.out.println(num);
		
		System.out.println("=====");
		
		num = t.m3();
		num = t.m2();
		System.out.println(num);
		System.out.println("=====");
		System.out.println(t.m2());
		
		
		
		
	}
}
*/



/*
//5��12��
class Long{
	void a1(int b,String str) {
		
	}
void a2(int a,int b) {
		int sum = 1;
		for (int i = 0; i <b; i++) {
			sum = sum *a;
		}
	}
}
public class Hello 
{
	public static void main(String[] args) 
	{
		Long t1 = new Long();
		t1.a2(20, 30);
		
		
		
	
		

	}
}
*/

/*
//5�� 12��
class King{
	void q1() {
		System.out.println("q1 �޼ҵ� ȣ��");
	}
	//int num ==50
	void q2(int num) {
		System.out.println(num);
	}
	//int a = 20 , int b = 60
	void q3(int a,int b) {
	System.out.println(a+ " " +b);
	System.out.println(a+b);
	
	}
	void q4(int a,int b,int c , int d) {
		System.out.println(a+d);
		System.out.println(b+c);
		
		}
}
public class Hello 
{
	public static void main(String[] args) 
	{
		King qq = new King();
		qq.q1();
		qq.q2(50);
		qq.q2(200);
		System.out.println("=====");
		qq.q3(20,60);
		qq.q4(10,20,30,50);
		
	}
}
*/


/*
//5��12��
class Lion{
	void qwe() {
		System.out.println("qwe �޼ҵ尡 ȣ��ƴ�.");
	}
	void asd() {
		System.out.println("asd �޼ҵ尡 ȣ��ƴ�.");
	}
	void zxc() {
		System.out.println("zxc �޼ҵ尡 ȣ��ƴ�.");
	}
	
		
	
}
public class Hello 
{
	public static void main(String[] args) 
	{
		Lion l1 = new Lion();
		l1.qwe();
		
		for (int i = 0; i < 4; i++) {
			l1.qwe();
		}
		System.out.println("============");
		
		l1.qwe();
		l1.asd();
		l1.zxc();
		
		
		
		
		
	}
	
}
*/



/*
//5��12��
class Fuck{
	//�޽�� �����
	void eatA(){
		System.out.println("���� ���δ�.");
		System.out.println("����� �ִ´�.");
		System.out.println("������ �ִ´�.");
		System.out.println("���ְ� �Դ´�.");

	}
	void eatB(){
		System.out.println("���� ���δ�.");
		System.out.println("���̽�ũ���� �ִ´�.");
		System.out.println("���� �ִ´�.");
		System.out.println("���� ������ �Դ´�.");

	}
}
public class Hello 
{
	public static void main(String[] args) 
	{
		Fuck f1 = new Fuck();
		
		System.out.println("��ħ�Ļ�"); 
		f1.eatB(); //�޽�� ȣ��� (); �������� �ٿ�����
		System.out.println("���ɽĻ�");
		
		System.out.println("�߽�");
		
		
		
		//�޽�� System.out.println("���������");
		//�޽�� System.out.println("���հ�");
		//�޽�� System.out.println("�Դ´� ");
		//�޽�� �̸� = �Դ�
		//�޽�� �̸��� �θ��� == ȣ���Ѵ�
	}
	}
	*/








/*
//5��12��
class Tiger
{
	int a=10 , b , c=20; //�ʵ�
}


public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t1 = new Tiger(); //t1�� ȣ����
		System.out.println(t1.a + " "+ t1.b + " "+ t1.c);
		
		Tiger t2 = new Tiger(); //t2�� ȣ����
		System.out.println(t1.a + " "+ t1.b + " "+ t1.c);
		
		System.out.println(t1); //��ü�� �ֹε�Ϲ�ȣ ���
		System.out.println(t2);
	}
}
*/


/*
//5�� 12��
class Airplane
{
	
	int num; // ����
	int ct;
}


public class Hello 
{
	public static void main(String[] args) 
	{
		//Ŭ�����̸� ��ü = ���弼�� Ŭ�����̸�();
		//��ü�̸� a1 ����
		Airplane a1 = new Airplane();
		a1.num = 10;
		a1.ct = 20;
		
		System.out.println(a1.num);
		System.out.println(a1.ct);
		System.out.println(a1.ct+ " "+a1.num);
	}
}
*/



/*
//5��12��
//ù�ڴ� �빮�ڷ� �۸��ϴ°��� �Ϲ��� ���
class Airplane //Ŭ����(���赵)�� �̸� ���ϱ�
{
	//{} ���̿� �ִ� ������ �Ѱ���.
	// �йи� (���.)
	//1. �ʵ� or ����ʵ�
	//2. ������ or ���������
	//3. �޼ҵ� (�Լ�) or ����޼ҵ�
}



public class Hello 
{
	public static void main(String[] args) 
	{
		
		
		
		
	}
}
*/






/*
 //5��11��
public class Hello 
{
	public static void main(String[] args) 
	{
		int[] ar = {4, 5, 6, 7, 8, 9, 2, 3, 5, 7 };
		System.out.println(ar.length);
		System.out.println("---------------------------");
		// 4�� �ݺ�
		for (int i = 0; i < ar.length/2; i++) 
		{
			//System.out.println( ar[i] + ar[8-1-i]    );
			System.out.println( ar[i] + ar[ar.length-1-i]    );
		}
	}
}
*/








/*
 5��11��
public class Hello 
{

	public static void main(String[] args)

	{
		int a [] = new int [13];
		System.out.println(a.length); // ��� ������ �������ֳ� ����.length
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(i);
			a[i] = i * 10 + 1
					;
		}
		System.out.println("==========");
		for (int i = 0; i < a.length; i++) 
		{
		System.out.println(a[1]);	
		}
		
		
	}
}
*/





/*
 5��11��
public class Hello 
{

	public static void main(String[] args)

	{
		int[] a = new int[10]; //��� 1
		
		int[] b = new int[] {10, 20, 30, 88, 99}; // 0, 1, 2, 3, 4 ���2
		
		int[] c = {11, 22, 33, 44, 55}; //0 , 1, 2, 3, 4 ���3
		
		System.out.println(c[4] - 20);
	}
}
*/



/*
 5��11��
public class Hello 
{

	public static void main(String[] args)

	{
		int a =30 , b=40;
		
		int t1 , t2 ,t3 ,t4 , t5,t6,t7,t8,t9,t10 ;
		// array , �ؿ� ������ ����
		int[] arr = new int [10];
		
		arr [0] = 10;
		arr [4] = 20;
		arr [7] = arr [0] + arr [4];
		
		System.out.println(arr[4]);
	}
}

*/





/*
5��11��
public class Hello 
{

	public static void main(String[] args)

	{
		int num = 15;
		int a = 10;
		//������ case �ڿ� ���Ұ�
		switch(a)
		{
		case 10:	
			System.out.println("�ڳ���1");
			System.out.println("�ڳ���2");
			break;
			
		
		case 20:
			System.out.println("����");
			break;
			
		case 30:
			System.out.println("������");
			break;
			
			default:
				System.out.println("else");
				break;
			
		}
		
		System.out.println("Ż��");
		
		
		
	}
}
*/





/*
//ex 5��11��
//for�� �ݺ�Ƚ���� �˶� ���°�
//while�� �ݺ�Ƚ���� �𸦶� ���°�
public class Hello 
{

	public static void main(String[] args)

	{
	    int num = 11;
	    while(true)
	    {
	    	System.out.println(num);
	    	if(num ==1)
	    	{
	    		System.out.println("Ż������");
	    		break;
	    	}
	    	if(num % 2 ==0)
	    	{
	    		num = num / 2;
	    	}
	    	else
	    	{
	    		num = num *3 +1;
	    	}
	    }
		System.out.println("Ż��Ϸ�");
		
		
		
		
		
		
	}
}
*/




/*
//ex 5��11��
public class Hello 
{

	public static void main(String[] args)

	{
		int num = 0;
		while(num<5)
		{
			System.out.println(num);
			num++;
		}
		System.out.println("ȣ����");
		
		
		
		
		
		
		
		
	}
}
*/






/*
//ex 5��11�� 
public class Hello 
{

	public static void main(String[] args)

	{
		int num = 0;
		while(true)
		{
			num++;
			System.out.println(num);
			if(num == 10)
			{
				System.out.println("Ż������");
				break; //�Ｎ���� �ݺ��� Ż��
			}
		}
		
         	System.out.println("ȣ����");
		
		
		
		
	}	
}
*/




/*
//ex 5��11��
public class Hello 
{

	public static void main(String[] args)

	{
		int a= 65;
		
		for (int i = 0; i < 26; i++) 
		{
			int num = '��' + i;
			
			System.out.println((int)num);
		}
		
	}
}
*/






/*
//ex 5��11��
public class Hello 
{

	public static void main(String[] args)

	{
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) 
		{
			sum = sum + i;
	
				
		}
		System.out.println(sum);
		System.out.println("=========");
		
		for (int i = 0; i < 8; i++)
		{
			//System.out.println(i);
			if(i == 5)
			{
				System.out.println(i+"5���½��ϴ�");
			}
			else
			{
				System.out.println(i+"5���ƴմϴ�");
			}
		}
		System.out.println("=========");
		for (int i = 0; i < 8; i++)
		{
			//System.out.println(i);
			if(i % 2 == 0)
			{
				System.out.println(i+"¦��");
			}
			else
			{
				System.out.println(i+"Ȧ��");
			}
		}
		
		
		
	}
}
*/





/*
//ex 5��11��
public class Hello 
{

	public static void main(String[] args)

	{  
		{
			int num = 10;
		}
		
		
		{
			int num = 20;
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("ȣ");
		}
		for (int i = 0; i < 4; i++) {
			System.out.println("��");
		}
	}
}
*/










/*
//ex 5��11��
public class Hello 
{

	public static void main(String[] args)

	{  
		int num =20;
		System.out.println(num);
		num = num+1;
		System.out.println(num);
		num++; // ������ ������ �Ѵ�. num = num+1;
		System.out.println(num);
		
		++num;
		System.out.println(num);
		
		//i++ : i= i+1
		for (int i = 0; i < 7; i++) 
		{
			System.out.println(i+"ȣ����");
		}
	}
}
*/





/*
//ex 5��11��
public class Hello 
{

	public static void main(String[] args)

	{  
		System.out.println(10);
		System.out.println(10+20);
		System.out.println(10+10+"ȣ����");
		System.out.println("ȣ����"+10+10);
		
		int num = 19;
		for(int a = 0 ; a < 10; a=a+1) //*�� ���꿡�� �켱���� ���� (��Ģ����)
		{
		//System.out.println(a + "ȣ����");
		System.out.println(num + " * " +a +" = "+a*num);
		}
		
		
		
		
		
		
	}
}
*/









/*
//ex 5��11��
public class Hello 
{

	public static void main(String[] args)

	{  
		for (int i =30; i>21; i=i-1)
		{
			System.out.println(i);
		}
		
		System.out.println("����");
		
		
		
		
	}
	
	}
*/



/*
//ex11)
public class Hello 
{

	public static void main(String[] args)

	{  
		//4���߿� �ݵ�� �Ѱ��� �����ϰ� ������..
		//n���߿� �ݵ�� �Ѱ��� �����ϰ� ������..
		int jumsu = 70;
	if(jumsu >= 90)
	{
		System.out.println("�ſ���");
	}
	else if(jumsu >=80)
	{
		System.out.println("���");
	}
	else if(jumsu >=70)
	{
		System.out.println("����");
	}
	else
	{
		System.out.println("������");
	}
		
		
		
		
		
		
	}
	}
*/

/*
//ex11)�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
public class Hello 
{

	public static void main(String[] args)

	{  
		int n = 100;
		if(n % 2 == 0)
		{
			System.out.println("¦��");
			
		}
		if(n%2==1)
		{
			System.out.println("Ȧ��");
		}
		System.out.println("----------");
		
		System.out.println("ȣ����");
		if(n % 2 == 0)
		{
			System.out.println("¦��");
		}
		else
		{
			System.out.println("Ȧ��");
		}
		System.out.println("������");
		
		System.out.println("----------");
		//����3
		int num = 1190211; //����
		
		
		
		//int num = 	190211; //����
		if(num /1000000 == 1)
		{
			System.out.println("����");
		}
		else
		{
			System.out.println("����");
		}
		
		
		
		
		
		}
	}
*/






/*
//ex11)
public class Hello 
{

	public static void main(String[] args)

	{  
		//if ��� , for ��� , while ��� , switch ��� 4�� ��� 
		//1.4�� ����� �������� () {}
		//2.��� �ȿ� ��� ��밡��
		System.out.println(1);
		int num = 10;
		if(num > 7)
		{
			System.out.println(2);
				//if(num * 2 == 20)
			if(num * 2 == 30)	
				{
			System.out.println(3);
			
		}
				System.out.println(4);
		System.out.println(5);
	}
	System.out.println("============");
	
	//int num2 = 51;
	//int num2 = 50;
	int num2 = 52;
	if(num2 % 2 == 0)
	{
		System.out.println("¦���ƴ�??");
		
		if(num % 5 == 0)
		{
			System.out.println("5�ǹ��?");
		}
	}
	System.out.println("������");
	
	System.out.println("============");
	System.out.println(1);
	if(true)
	{
		
	}
	
	
	}
}
*/



/*
//ex11)
public class Hello 
{

	public static void main(String[] args)

	{  
		//if ��� , for ��� , while ��� , switch ��� 4�� ��� 
		
		//if 1
		System.out.println(1);
		if(false)
		{
			System.out.println("ȣ����1");
			System.out.println("ȣ����2");
			System.out.println("ȣ����3");
		}
		System.out.println(2);
		System.out.println("============");
		System.out.println(1);
		//if 2
		if(true)
		{
			System.out.println("ȣ����1");
			System.out.println("ȣ����2");
			System.out.println("ȣ����3");
		}
		System.out.println(2);
		
		System.out.println(4);
		//if 3 
		if(4>3)
		{
			System.out.println("�ڳ���");
			
		}
		System.out.println(5);
		System.out.println("============");
		
		//if 4
		if(4>3 && 100 <5)
		{
		System.out.println("������");	
		}
		System.out.println(6);
		
		//if 5
		if (4 > 3||  100 < 5)
		{
			System.out.println("�߼���");	
		}
		System.out.println(6);
	}
	
}
*/



/*
//ex10)
public class Hello 
{

	public static void main(String[] args)

	{          //           ����     key      �� or ����.(�Ѱ��� true�� ���̶�� ����)
		System.out.println(false||false); //false
		System.out.println(false||true); //true
		System.out.println(true||false); //true
 		System.out.println(true||true); //true
		System.out.println("========");
		
		  //                         ����     key      �� and ����.(��� true�϶� ���̶�� ����)
				System.out.println(false&&false);//false
				System.out.println(false&&true);//false
				System.out.println(true&&false);//false
				System.out.println(true&&true);//true
				System.out.println("========");
				
				int level = 50;
				int key = 2;
				
				System.out.println(level < 60 || key != 0);
				System.out.println(level < 60 && key != 0);
				System.out.println("========");
				
				
				System.out.println(!(5>2)); // !�� �� ���������ڷ� �Ѵ�
		
	}
}
*/

/*
//ex9)
public class Hello 
{

	public static void main(String[] args)

	{
		// float(4) , double(8) , boolean(1) (4)4����Ʈ �޸� 32��Ʈ 8x4
		
		int a = 30;
		float b = 30.1f; //�Ҽ����� �� �� �ݵ�� f�� �ٿ����� 
		System.out.println(a);
		System.out.println(b);
		
		
	}
}
*/



/*
//ex8)
public class Hello 
{

	public static void main(String[] args)

	{
		//char (�޸�2��) , float(4) , double(8) , boolean(1)
		//char ����� ��밡��(2�踦 ���)
		char d = 'A'; //d������ �����δ� 65�� �ڵ� ����(�ƽ�Ű�ڵ�)
		System.out.println((int)Character.MAX_VALUE);
		System.out.println((int)Character.MIN_VALUE);
		System.out.println("==========");
		int f =88;
		char e = 70;
		System.out.println(e);
		
		System.out.println((int)d); //���� ������ �ִ� Ÿ��(�޸𸮰�)�� int ���ڷ� ����Ѵ� Ÿ��ĳ����
		System.out.println((char)f);//"" 88�� �ش�Ǵ� ���� ���� ����Ѵ� Ÿ��ĳ����
	}
}
*/



/*
//ex7)
public class Hello 
{

	public static void main(String[] args)

	{
		byte shit = 127; //�޸� 1���ּ���
		
		short a = 256;//�޸� 2���ּ���
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		
		int b = 246; //�޸� 4���ּ��� //integer
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		
		long c = 24615677; //�޸� 8���ּ���
		System.out.println(Long.MAX_VALUE);
		System.out.println();//���� ȿ��
		System.out.println(Long.MIN_VALUE);
		System.out.println();
		
		System.out.println(c);
		
	}
	
	
	
	
	}
*/

/*
//ex6)
public class Hello 
{

	public static void main(String[] args)

	{
		byte fuck; //byte Ÿ�� fuck ���� ����
		fuck = 10; // fuck�� 10 ���� ����
		
		byte shit = 20; //byte Ÿ�� shit ������ 20 �ʱ�ȭ
		
		System.out.println(fuck);
		System.out.println(shit);
		
		fuck = 30;
		shit = 40;
		
		System.out.println(fuck);
		System.out.println(shit);
		System.out.println(shit+fuck);
		System.out.println(2*2*2);
		System.out.println("========");
		
		fuck = -128;//�޸� 1���ּ��� ���� ��ȿ���� -128 ~ +127
		System.out.println(fuck);
		System.out.println("=========");
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		
		
	}
}
*/



/*
//ex6)
public class Hello 
{

	public static void main(String[] args)

	{
		 byte fuck; // �޸�1�� ��û �� ���� �̸��� fuck��� ����
      fuck = 100; //fuck ������ 100�� ���� 
      System.out.println(fuck*2);
      System.out.println(fuck*fuck);
      System.out.println(fuck!=101);
      System.out.println(fuck*2 <= 100);
		
    fuck = 30; // ���⼭���� 30���� ����� (100�� �ʱ�ȭ��)  
    System.out.println(fuck);
    System.out.println(fuck==30);
		
	}
}
*/


/*
//ex5)
public class Hello 
{

	public static void main(String[] args)

	{
		//�񱳿��� �� 6�� ����
		//syso (ctrl + space)
		System.out.println(3+5 > 5+4); //Ů�ϱ�?
		System.out.println(3+5 < 5+4); //�۽��ϱ�?
		System.out.println(3+5 >= 5+2); //ũ�ų� ����?
		System.out.println(10 <= 5); //�۰ų� ����?
		System.out.println(10 == 10); //���� ����?
		System.out.println(11 != 10); //���� �ʽ��ϱ�?
		System.out.println("==========="); 
//���� �켱���� : 1.������� 2.�񱳿���
		System.out.println(0 >= 4%1);


	}

}
 */


/*
//ex4)
public class Hello 
{

	public static void main(String[] args)

	{

		System.out.println('��');	// ���ڸ� ���

		System.out.println(123454654);	//���ڸ� ���

		System.out.println("======");//���й�
		//�������
		System.out.println(13+3);	
		System.out.println(13-3);	
		System.out.println(13/3); //��	
		System.out.println(13%3); // ������	
		System.out.println("������");	

		// '��' : ���ڸ� ���ڹڿ� ������ ����
		// "�ϴ�" : �������ڸ� �������ִ�. ���ڿ�



	}
}
 */







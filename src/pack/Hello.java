package pack;
import java.io.*;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;


//5월27일
public class Hello {  
	
	
	public static void main(String[] args){
		System.out.println("123");
	}
}


/*
//5월26일
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
//5월26일
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
		int e = num | 0x000000ff; //앞에있는 것은 원본데이터를 떨굼
		System.out.println(HexaToBinary(0x000000ff));
		System.out.println(HexaToBinary(e));
		
		System.out.println("===================");
		System.out.println("===================");
		// shift bit 연산
		int bb = 4;
		int f = num << bb; //오른쪽으로 값이 밀림
		System.out.println(HexaToBinary(num));
		System.out.println(HexaToBinary(f));
	}
}
*/






/*
//5월26일 
//도서관리프로그램 << 콜렉션(LinkedList)
class Book{
	String name;
	String author;
	String publisher;
	int price; //우클릭 >소스 > 제너레이트 유징필드 (생성자 자동생성)
	
	
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
		mm.add(new Book("자바를 배우자" , "홍길동" , "열심출판사1",1000));
		mm.add(new Book("늦잠 자는법" , "게으름" , "열심출판사2",1500));
		mm.add(new Book("빅데이터" , "이순신" , "열심출판사3",2000));
		mm.add(new Book("남을돕고살자" , "을지문덕" , "열심출판사4",2500));
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
		mm.set(1, new Book("일찍 일어나는법" , "일찍이" , "열심출판사5",5000));
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
//5월26일
class Lion extends Thread{
	static int num = 0;
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
		}
		System.out.println(num + "Lion Thread가 종료됨");
	}
}
class Tiger extends Thread{
	public void run() {
		System.out.println("Tiger Run");
		for (int i = 0; i < 5; i++) {
			System.out.println("접속대기");
			try {
				Thread.sleep(0);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println(i + "번 유저가 접속됨..");
			
			Thread t = new Lion();
			t.start();
			Lion.num++;
		}
		System.out.println("Tiger 쓰레드 종료");
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
		
		new Scanner(System.in).nextInt(); //프로그램이 종료되는걸 막기위해 선언
		System.out.println("Hello end");
	}
}
*/




/*
//5월 26일
class Tiger extends Thread{
	public void run() {
		System.out.println("호랑이가 출력");
		Thread t = new Lion();
		t.start();
		new Scanner(System.in).nextInt();
		System.out.println("Tiger end");
	}
}

class Lion extends Thread{
	public void run() {
		System.out.println("사자가 출력");
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
//5월 26일
public class Hello {  
	
	
	public static void main(String[] args){
		for (int i = 0; i < 3; i++) {
			System.out.println("숫자 입력하세요");
			int num = new Scanner(System.in).nextInt();
			if(num == 999) {
				System.out.println("프로그램 종료");
				break;
			}
			System.out.println(num * 11);
		}
	}
}
*/




/*
//5월 25일
public class Hello {  
	
	
	public static void main(String[] args){
		//키보드로부터 입력을 받고 싶다.
		Scanner sc = new Scanner(System.in);
		System.out.println(1000);
		//변수 안받고 실행시키는 코드 (아래 코드 주목)
		new Scanner(System.in).nextInt(); //키보드로부터 입력을 기다리는 함수
		System.out.println(2000);
	}
}
*/




/*
//5월 25일
public class Hello {  
	
	
	public static void main(String[] args){
		//키보드로부터 입력을 받고 싶다.
		Scanner sc = new Scanner(System.in);
		System.out.println(1000);
		sc.nextInt(); //키보드로부터 입력을 기다리는 함수
		System.out.println(2000);
	}
}
*/






/*
//5월25일
class Tiger extends Thread{
	public void run() { 
		for (int i = 0; i < 10; i++) {
			System.out.println("호랑이"+i);
			//thread.sleep(0) : 가능한 짧게 쉬어라 
			try {Thread.sleep(0);} catch (Exception e) {	}
		}
	}
}
public class Hello {  
	
	
	public static void main(String[] args){
		System.out.println("메인시작");
		Thread t = new Tiger();
		t.start(); //t라는 스레드 작동
		for (int i = 0; i < 10; i++) {
			System.out.println("코끼리"+i);
			//thread.sleep(0) : 가능한 짧게 쉬어라 
			try {Thread.sleep(0);} catch (Exception e) {	}
		}
		System.out.println("메인 종료");
	}
}
*/




/*
//5월25일
//표준 클래스 Thread를 상속받게됨
class Tiger extends Thread{
	public void run() { //------------------
		System.out.println("스레드 시작");
		System.out.println("Tiger run call");
		System.out.println("스레드 종료");
	}
}
public class Hello {  
	
	
	public static void main(String[] args){
		System.out.println("메인시작");
		Thread t = new Tiger();
		//t라는 스레드를 이제부터 작동
		//"운영체제"가 먼저 선택한 함수를 실행
		t.start(); //----------------
		try {Thread.sleep(1000);} catch (Exception e) {	}
		System.out.println("메인 끝");
	}
}
*/






/*
//5월25일
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
		System.out.println("스레드 시작");
		System.out.println("B run call");
		System.out.println("스레드 종료");
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






//5월25일 <> : 컨테이너라는 표현하고싶을때 사용되는 자바문법
// Tiger<T> : Tiger라는 클래스를 사용하고 싶을때는
//사용하고 싶은 타입을 컨테이너에 명시해서 사용해라
//현재 <T>는 Int타입
/*
class Tiger<T>{ //제네릭 문법
	T data;
	//우클릭 소스 > 제너레이트 게트 앤드 세트
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
		tiger2.setData("으으");
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
//5월25일
class Tiger{
	int data;
	//우클릭 소스 > 제너레이트 게트 앤드 세트
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
		lion.setData("호랑이");
		System.out.println(lion.getData());
	}
}
*/





/*
//5월25일 , 데코레이션 패턴
class 커피{
	int num = 30;
	int 가격() {
		System.out.println("커피 주문");
		return num;
	}
}
class 설탕 extends 커피{
	커피 a;
	int num = 20;
	설탕(커피 a){
		this.a = a;
	}
	int 가격() {
		System.out.println("설탕 주문");
		return num + a.가격();
	}
}
class 프림 extends 커피{
	커피 a;
	int num = 10;
	프림(커피 a){
		this.a = a;
	}
	int 가격() {
		System.out.println("프림 주문");
		return num + a.가격();
	}
}
public class Hello {  
	
	
	public static void main(String[] args){
		//A a;
		//a = new A();   / A a = new A(); 둘다 똑같음
		커피 손님 = new 커피(); //1
		손님 = new 설탕(손님);   //누적되는거 이해하기
		손님 = new 프림(손님);
		손님 = new 설탕(손님);
		System.out.println(손님.가격());
		
	}
}
*/





/*
//5월25일
class AA{}
class BB extends AA{}
class CC extends AA{}
public class Hello {  
	
	
	public static void main(String[] args){
		AA tttt1 = new BB(); //ttt1의 자식은 bb가된다
		tttt1 = new CC(); //ttt1의 자식은 cc로 변경
		tttt1 = new BB();
	}
}
*/



/*
//5월25일
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
		//a = new A();   / A a = new A(); 둘다 똑같음
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
//5월24일
//자투리 시간
class A{
	void greenColor() {
		
	}
}

//1. 나는 오버라이딩을 하려고 했다.
//2. 오타가나서 함수이름 잘못적음
//3. 그리고 나는 오타를 인지못함
//4. @ + Ctrl+Space - 오타 확인가능
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
//5월24일
public class Hello {  
	
	
	public static void main(String[] args){
		System.out.println(1);
		try {
			Reader r = new FileReader("sample.txt");
			
			while(true) {
				int readData = r.read();
				//read명령은 파일을 모두 읽고 읽을게 없을시 "-1"값을가짐
				if(readData == -1) {
					System.out.println("파일 모두읽음");
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
//5월24일
public class Hello {  
	
	
	public static void main(String[] args){
		//File 입력 출력
		System.out.println(1);
		//새로운 파일을 만들것이다.
		try {
			Writer w = new FileWriter("test.txt");
			
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 8; j++) {
					if( (i + j) % 2 == 0) {
					w.write("O ");	//짝수
					}else {
					w.write("X ");	//홀수
					}
				}
				
				w.write("\n");
			}
			
			w.close(); //항상 close를 해줘야함 오류발생원인 제거
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(2);
		
	}
}
*/





/*
//5월24일
public class Hello {  
	
	
	public static void main(String[] args){
		//File 입력 출력
		System.out.println(1);
		//새로운 파일을 만들것이다.
		try {
			Writer w = new FileWriter("test.txt");
			
			w.write("apple");
			w.write("\n");
			w.write("무귱화");
			
			w.close(); //항상 close를 해줘야함 오류발생원인 제거
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(2);
		
	}
}
*/




/*
//5월24일
class Apple{
	private static Apple ins = null;
	//생성자 = 객체가 생성될때 무조건 출력되는 함수
	//생선자,필드,메쏘드든지 간에 prive만 걸리면 밖에서 사용불가
	private Apple(){}
			
	static Apple getIns() {
		System.out.println("Test");
		
		if(ins == null) {
			
			ins = new Apple();
		}
		
		return ins;
	}
	void m1() {
		System.out.println("함수 호출");
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
		
		// ==은 두개의 객체가 동일한지를 물어보는것이다
		if(a1 == a2) {
			System.out.println("O");
		}else {
			System.out.println("X");
		}
		// System.out.println(a1 == a2 ? "O" : "X"); 삼항연산
		
		Banana b1 = new Banana();
		Banana b2 = new Banana();
		System.out.println(b1 == b2 ? "O" : "X");
		
		a2.m1();
	}
}
*/







/*
//5월24일
class Apple{
	private int num;
	
	//프라이빗을 클래스 외부에서 쓰는방법
	//setter 함수 , getter 함수
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
		// apple.num = 10; 오류
		apple.setNum(999);
		System.out.println(apple.getNum());
		
	}
}
*/






/*
//5월24일
class Apple{
	// 객체를 외부에서 쓰지 못하게하는것을 데이터은닉
	private int a; //여기 클래스 내부 에서만 실행가능
	public int b;
	
	void m1() {
		a = 10;
		b = 20;
	}
}
public class Hello {  
	
	
	public static void main(String[] args){
		Apple apple = new Apple();
		//private = 아래 변수는 클래스 외부에서 사용불가
		// apple.a = 10; 오류
		apple.b = 23;
	}
}
*/





/*
//5월21일
public class Hello {  
	
	//랜덤한 숫자를 받고싶을때
	public static void main(String[] args){
		//import java.util.Random; 필요
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
//5월21일
public class Hello {  
	
	
	public static void main(String[] args){
	
		
		//for 문 가장 많이보이는 방식 1번형식
		for (int i = 0; i <5; i++) {}
		
		//for 문 가장 많이보이는 방식 2번형식
		for (int i = 1; i <=5; i++) {}
		
		//for 문 가장 많이보이는 방식 3번형식 (3 * n+1)
		for (int i = -3; i <=+3; i++) {}
	}
}
*/






/*
//5월21일
public class Hello {  
	
	
	public static void main(String[] args){
		//특정 데이터를 찾아서 제고하고싶다.
		LinkedList<Integer> mm = new LinkedList<Integer>();
		for (int i = 0; i <10; i++) {
			mm.add(i * 2);
		}
		mm.add(101);
		mm.add(102);
		mm.add(103);
		
		System.out.println(mm);
		
		
		//짝수만 제거해보자
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
//5월21일
public class Hello {  
	
	
	public static void main(String[] args){
		//특정 데이터를 찾아서 제고하고싶다.
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
//5월21일
public class Hello {  
	
	
	public static void main(String[] args){
		LinkedList<Integer> mm = new LinkedList<Integer>();
		for (int i = 0; i <10; i++) {
			mm.add(i * 10+i);
		}
		System.out.println(mm);
		
		//특정 데이터를 찾는것을 검색이라고 한다.(search:read)
		
		for (int i = 0; i < mm.size(); i++) {
			Integer num = mm.get(i);
			//44가 있는지 물어보는 문장
			if(num == 99) {
				System.out.println(i + "번째에서 찾았다");
				break;
			}
			
			if(i == mm.size() -1) {
				System.out.println("못찾았다");
			}
		}
		System.out.println("호랑이");
	}
}
*/







//5월21일


/*
public class Hello {  
	
	
	public static void main(String[] args){
	LinkedList<Integer> mm = new LinkedList<Integer>(); //mm이라는 객체로 crud를 진행할수잇다
	//int s = mm.size();
	System.out.println(mm.size());
	
	//"Creat"RUD
	mm.add(100);
	System.out.println(mm.size()+"개");
	
	for (int i = 0; i < 10; i++) {
		mm.add(i * 10 + i);
	}
	System.out.println(mm.size()+"개");
	
	//C"Read"UD
	//방법1 단순하게 보긴하지만 활용성이없다.
	System.out.println(mm);
	
	//방법2 활용범위가 높다.
	for (int i = 0; i <mm.size(); i++) {
		System.out.print(mm.get(i)+" ");
	}System.out.println();
	
	//방법3 for each : for 문의 간략형식
	for (Integer item : mm) {
		System.out.print(item+" ");
	}System.out.println();
	
	//컬렉션은 forEach를사용할수있다.
	//그런데 배열도 사용할수있다.
	int[]ar = {10,20,30,40};
	for (int data : ar) {
		System.out.print("호랑이" + data + " ");
	}System.out.println();
	
	//get사용법 컨테이너 내 n번째 데이터 출력
	System.out.println(mm.get(5));
	
	//CR"Update"D : 수정
	mm.set(5, 2021);
	System.out.println(mm);
	
	//CRU"Delete" : 삭제
	mm.remove(4);
	System.out.println(mm);
	
	
	}
}
*/





/*
//5월21일
public class Hello {  
	
	
	public static void main(String[] args){
		//crud내에서 사용할수있는 기능 모음을 "콜렉션"이라한다
		//데이터 관리하는 과정 "crud" 아래 함수 약자
		//데이터를 집어넣는과정 insert(add)
		//데이터를 삭제하는 과정 remove(erase,delete)
		//데이터를 갱신 update
		//데이터 읽어오는것 reading
		//create
		//콜렉션 - 
		//linkdlist - 자료구조
		
		//컨테이너 안에 물건은 무조건"동일한 물건들"만 가능
		// 컨테이너 = <야쿠르트>
	}
}
*/




/*
//5월20일
public class Hello {  
	
	
	public static void main(String[] args){
		// int - 표준타입 , num - 변수 , = - 대입연산자 , 10 - 리터럴
		int num = 10;
		char ch = '한';
		String s = "무궁화";
		
		//1.변수 생성시 이름은 중복되면 안됨
		//2.숫자를 조합할수 있지만 첫글자는안된다.
		int apple = 10;
		int apple1234 = 20;
	//안되는타입(2)	int 9apple = 10;
		
		//3. $ , _ 를 제외한 모든특수문자 사용불가
		
		//4.한글을 사용할수 있지만,피한다.
		int 사과 = 10;
		System.out.println(사과);
		
		
		//5. 1단어이상의 조합이 일어날때
		//일반적으로 단어의 첫글자를 제외하고 대문자를 사용
		//int applenumber = 10;(카멜 표기법)
		int appleNumberCountry = 10;
		
		
	}
}
*/




/*
//5월20일
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
//5월20일
public class Hello {  
	
	
	public static void main(String[] args){
		int num1 = 100; // 10진수로 들어감
		System.out.println(num1);
		
		int num2 = 0x100; //16진수로 해석후 10진수로들어감
		int num5 = 0x2a9;
		int num3 = 0x63ce7bcd;
		//2진수변환 0110(6) 0011(3) 1100(c) 1110(e) 0111(7)
		//1011(b) 1100(c) 1101(d)
		System.out.println(num2);
		System.out.println(num3);
		
		
		//16진수를 2진수로 출력하는법
		String s = Integer.toBinaryString(num3);
		System.out.println(s);
		
		int num4 = 0xab;
		String s1 = Integer.toBinaryString(num4);
		System.out.println(s1);
		//s1결과는 1010 1011이다(앞의 0은생략)
	}
}
*/






/*
//5월20일
public class Hello {  
	
	
	public static void main(String[] args){
		//숫자를 표현하는데 사용되는 문자의 개수가 10개인것을
		//우리는 10진수 체제를사용한다고한다.
		
		
		//숫자를 표현하는데 사용되는 문자의 개수가 16개라면
		//우리는 16진수 체제를 사용한다고 한다.
		
		//숫자를 표현하는데 사용되는 문자의 개수가 2개라면
		//우리는 2진수 체제를 사용한다고 한다.
		
		// 숫자를 표현하는데 사용되는 문자의 개수가 8개라면
		//우리는 8진수 체제를 사용한다고 한다.
		
		//A 10,B 11,C12,D13,E14,F15
		//11101011000010(2진수>16진수 변환)
		//11 1010 1100 0010
		//3		a  	c	2
		
		// 10101011011010(2진수 > 16진수 변환)
		// 10 1010 1101 1010
		// 2   A    D    A
		
		//B93E (16진수 > 2진수 변환)
		//1011 1001 0011 1110
	}
}
*/






/*
//5월20일
class Tiger{
	
}
public class Hello {  
	
	
	public static void main(String[] args){
		//s1이라는 객체의 주민번호를 보여준다
		String s1 = "호랑이1";
		System.out.println(s1.hashCode());
		
		String s2 = "호랑이2";
		System.out.println(s2.hashCode());
		
		Tiger t = new Tiger();
		System.out.println(t.hashCode());
		
	}
}
*/






/*
//5월20일//★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★여기까지했음
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
//5월19일~5월20일
public class Hello {  
	
	
	public static void main(String[] args){
		String s = "무궁화꽃이피었습니다";
		char ch = s.charAt(3);
		System.out.println(ch);
		//1
		System.out.println(s.charAt(3));
		
		//2  (-1은 못찾았다.)
		System.out.println(s.indexOf("었습다"));
		
		if(s.indexOf("화꽃이")== -1) {
			System.out.println("못찾았다");
		}else {
			System.out.println("찾았다");
		}
		
		//3
		System.out.println(s.length());
		
		//4
		System.out.println(s.replace("꽃이", "나무가가가"));
		
		//5
		System.out.println(s.substring(3));
		
		//6 3번부터 5번앞에까지 짤라줘
		System.out.println(s.substring(3,5));
		
		//7
		String s1 = "Apple";
		//String java.lang.String.toLowerCase()
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		//원본 데이터가 갱신되는것이 아니다(원본 데이터 유지)
		String s2 = s1.toUpperCase();
		System.out.println("s2는"+s2);
		
		
		
		
		for (int i = 0; i < 5; i++) {
			System.out.print(i+ " ");
		}System.out.println();//줄바꿈만 일어난다
		
		System.out.println("호랑이3");
		
		//8 trim : 앞과뒤의 스페이스 공백을 제거한다.
		//문자 사이에잇는 스페이스는 해당사항없다.
		String s3 = " A p p l e ";
		System.out.print(s3);
		System.out.println(1000);
		System.out.print(s3.trim());
		System.out.println(2000);
	}
}
*/



/*
//5월18일
public class Hello {  
	
	
	public static void main(String[] args){
		int a = 100;      		//숫자
		String b = "200";		//문자열
		System.out.println(a+100);
		System.out.println(b+100);
		
		//방법1 숫자 >>문자열
		int n1 = 123;
		String s1 = Integer.toString(n1);
		System.out.println(s1+456);
		
		//방법2 숫자 >>문자열
		int n2 = 456;
		String s2 = ""+n2;
		System.out.println(s2+n2);
		
		
		//(숫자처럼 생긴)문자열 >> 숫자
		String s3 = "999";
		int n3 = Integer.parseInt(s3);
		System.out.println(n3+1);
	}
}
*/




/*
//5월18일
public class Hello {  
	static int m1() {
		System.out.println("호랑이");
		return 100;
	}
	
	static void m2(int a , int b) {
		System.out.println("호랑이");
		
		
		if(a>b) {
			System.out.println("코끼리");
		}else {
			//함수 작동을 중단시킴
			return;
		}
		
		System.out.println("독수리");
	}
	
	static void m3(int a , int b) {
		try {
			System.out.println("앵무새");
			if(a>b) {
				System.out.println("염소");
			}else {
				return;
			}
		} catch (Exception e) {
			
		}finally {
			System.out.println("얼룩말");
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
//5월18일
public class Hello {  
	
	
	public static void main(String[] args){
		System.out.println("호랑이");
		
		//Unhandled exception=사용하고 싶은 사람은 try캐치를 사용해라
		
		for (int i = 0; i < 6; i++) {
			System.out.println("호랑이"+i);
			try {Thread.sleep(3000);} catch (Exception e) {}
		}
		
		
		
		
		System.out.println("호랑이2");
	}
}
*/






/*
//5월18일
class Tiger{
	void f1() {
		System.out.println("함수1번콜");
		
		//프로그래머는 익셉션 발생시킬수잇다
		try {
			throw new Exception();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	//throws Exception : 익셉션처리는
	//함수를 호출한사람이 해결하세요.
	void f2() throws Exception{
		System.out.println("함수2번콜");
		throw new Exception();
		
		
	}
}
public class Hello {  
	
	
	public static void main(String[] args){
		Tiger t = new Tiger();
		t.f1();
		System.out.println("호랑이");
		
		//Unhandled exception
		try {
			t.f2();
		} catch (Exception e) {
			// TODO: handle exception
		}
			
		System.out.println("호랑이마지막");
	}
}
*/





/*
//5월18일
public class Hello {  
	
	
	public static void main(String[] args){
		//ex1)
		//익셉션(예외가 발생)
		//문제 발생할수있다.그래도 프로그램은 게속 진행시키자
		System.out.println("호랑이1");
		
		// java.lang.ArithmeticException
		//익셉션 발생시 프로그램이 중단됨
		
		//익셉션이 발생하면 catch로 넘어가고
		//그렇지 않으면 catch를 지나가세요
		try {
			System.out.println(4/0);
		} catch (Exception e) {
			//프로그램이 중단되지 않음.
			System.out.println("catch 들어옴");
			//발생한 익셉션을 확인하고 싶을때
			e.printStackTrace();
		}
	
		System.out.println("호랑이2");
		
		//ex2)
		
		try {
			int[] ar = new int[10];
			ar[0] = 10;
			
			// java.lang.ArrayIndexOutOfBoundsException
			ar[10] = 20;
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		System.out.println("호랑이3");
		
		
		
		// ex)3
		String s1 = "무궁화꽃이피었다";
		System.out.println(s1.length());
		
		String s2 = null;
		
		try {
			System.out.println(s2.length());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		System.out.println("호랑이4");
	}
}
*/





/*
//5월18일
public class Hello {  
	
	
	public static void main(String[] args){
		int a =10;
		a++;
		System.out.println(a);
		++a;
		System.out.println(a);
		System.out.println("======");
		// 다른종류 문제
		int b= 10;
		int c ;
		c=b++;//대입 >> 증가
		System.out.println(c);
		System.out.println("========");
		
		
		int d= 10;
		int e ;
		e=++d;; //증가 >>대입
		System.out.println(e);
		
	}
}
*/





/*
//5월18일
class Baduk{
	AI ai;
	Baduk(AI ai){
		this.ai = ai;
		System.out.println("대국시작");
	}
	 void play() {
		 ai.play();
	 }
	 void end() {
		 ai.end();
		 System.out.println("경기가종료");
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
		System.out.println("인공지능은 알파고다");
	}
	public void end() {
		System.out.println("알파고가 경기점수 계산");
	}
}
class Betaago implements AI{
	public void play() {
		System.out.println("인공지능은 베타고다");
	}
	public void end() {
		System.out.println("베타고가 경기점수 계산");
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
//5월18일
class Baduk{
	Baduk(){
		System.out.println("대국시작");
	}
	 void play(AI ai) {
		 ai.play();
	 }
	 void end(AI ai) {
		 ai.end();
		 System.out.println("경기가종료");
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
		System.out.println("인공지능은 알파고다");
	}
	public void end() {
		System.out.println("알파고가 경기점수 계산");
	}
}
class Betaago implements AI{
	public void play() {
		System.out.println("인공지능은 베타고다");
	}
	public void end() {
		System.out.println("베타고가 경기점수 계산");
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
//5월18일
class Baduk{
	Baduk(){
		System.out.println("대국시작");
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
		System.out.println("인공지능은 알파고다");
	}
}
class Betaago implements AI{
	public void play() {
		System.out.println("인공지능은 베타고다");
	}
}
class Gammago implements AI{
	public void play() {
		System.out.println("인공지능은 감마고다");
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
// 5월18일
class Baduk{
	Baduk(){
		System.out.println("대국시작");
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
		System.out.println("인공지능은 알파고다");
	}
}
class Betaago extends AI{
	void play() {
		System.out.println("인공지능은 베타고다");
	}
}
class Gammago extends AI{
	void play() {
		System.out.println("인공지능은 감마고다");
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
//5월 18일
class Baduk{
	Baduk(){
		System.out.println("대국시작");
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
		System.out.println("인공지능은 알파고다");
	}
}
class Betaago{
	void play() {
		System.out.println("인공지능은 베타고다");
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
 //5월18일
class Baduk{
	Baduk(){
		System.out.println("대국을시작");
	}
	
	void play() {
		System.out.println("인공지능은 알파고");
	}
}


public class Hello {  
	
	
	public static void main(String[] args){
		Baduk baduk = new Baduk();
		
	}
}
*/



/*
//5월17일
public class Hello {  
	
	
	public static void main(String[] args){
		
		
		
		
		int a= 15,b=10;
		int c ;
		
		
		//if else 문이 나올때는 대입받는 변수가 동일한지 반드시 확인
		//동일하다면 삼항연산 이용
		if(a>b) {
			c=1000;
		}else {
			c=2000;
		}
			System.out.println(c);
			
			//동일한코드 삼항연산
		c = a>b ? 1000 :2000;
		
		// =============
		if(a>b) {
			System.out.println("호랑이");
		}else {
			System.out.println("코끼리");
		}
		
		//동일코드
		System.out.println(a>b ? "호랑이" : "코끼리");
		
	}
}
*/




/*
//5월17일
public class Hello {  
	
	public static void main(String[] args){
		int a = 3, b=4;
		System.out.println(a+ " " +b);
		int temp; //임시 변수
		temp = a;//temp = 3;
		a=b;//a=4;
		b=temp;//b=3;
		System.out.println(a+ " " +b);
		
	}
}
*/






/*
//5월17일
class Tiger{   //이 클래스 제작은 여기가 마지막 //한마디로 상속불가 #3
	final int num = 10; //num이 대입 받는건 10이 마지막 #1
	final float pipipi = 3.141592f;
	
	final void m1() { //서브클래스는 m1을 오버라이딩 할수없다 #2
		
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
//5월17일
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
//5월17일
//1번 방식(비선호)
//다중 상속 미성립
abstract class A{
	abstract void m1();
	
}
//2번방식(선호) 
//다중 인터페이스(상속) 성립되기때문
interface B{
	 void m1();
}

public class Hello {  
	
	public static void main(String[] args){
		
		
	}
}
*/




/*
//5월 17일
//abstract class A{
	//표준규격
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

//1번수정
interface A{
	//표준규격
	 void m1();
	 void m2();
	 void m3();
}

//2번수정
//public를 붙여야한다
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
//5월17일
abstract class A{
	//추상클래스 , 추상함수
	//미완성된것을 추상이라고 한다
	//
	abstract void m1();
}
class B extends A{
	void m1() {
		
	}
}
public class Hello {  
	
	public static void main(String[] args){
		//A a = new A(); //사용불가, A의 코드자체가 부여되지않음
		A a = new B();
	}
}
*/



/*
//5월 17일
//1.abstract 붙은 함수는 코드구현이 없다.
//2.abstract 붙은 함수를 포함하는 클래스도 ab를 붙여야함
//3.상속받은 자식은 반드시 부모 ab를 구현해야함
abstract class 대장장이{
	void 칼만들기(){
		System.out.println("멎진칼 만듬");
	}
	abstract void 방패만들기();
}

class 방패장인1 extends 대장장이{
     void 방패만들기() {
    	 System.out.println("쇠방패 만듬");
     }
}

class 거지 extends 대장장이{
	 void 방패만들기() {
    	 System.out.println("억지방패 만듬");
     }
}
public class Hello {  
	
	public static void main(String[] args){
	    대장장이 t = new 방패장인1();
	    t.칼만들기();
	    t.방패만들기();
	  
	}
}
*/




/*
//5월17일
abstract class A{
	void m1() {
		System.out.println(1);
	}
	void m2() {
		System.out.println(2);
	}
	//할일없는 코드 
	//저는 주상(백수)함수 입니다
	abstract void m3();
}
class B extends A{
	void m2() {
		System.out.println(3);
	}
	//부모클래스에서 abstact가 있으면 값이있는 동일 함수를 만들어야함
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
//5월17일
class Tiger{
	void m1() {
		System.out.println(1);
	}
	void m2() {
		Tiger t = new Tiger();
		t.m1();
		// t.m2(); 자기가 자신을 호출하는걸 재귀혈수라고 함 (무한루프)

	}
}
//스태틱 안에선 스태틱만 사용가능
public class Hello {  
	void m3() {
		System.out.println("비밀");
	}
	static void m4() {
		System.out.println("안녕");
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
//5월17일
public class Hello {  
	int a;
	static int b;
	Hello(){
		
	}
	void m1() {
		
	}
	static void m2() {
		
	}
	// static 함수안에선 스태틱변수와 스태틱 함수만 사용가능
	public static void main(String[] args){
		//m1();
		m2();
		//a=10;
		b= 10;
	}
}
*/



/*
//5월17일
class Tiger{
	Tiger(){
		a++;
		b++;
	}
	static int a = 0;
	int b = 0;
		
	
	
}
//static int a =실제로 존재하는 메모리
//int b;	= 만들어지지않은 메모리

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
//5월14일
//static = 고정시킴(정적)
//객체생성하지 않고 사용가능
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
//5월14일 
class Animal{
	void cry() {
		
	}
}
	class Dog extends Animal{
		void cry() {
			System.out.println("멍멍");
		}
	
	}
	class Cat extends Animal{
		void cry() {
			System.out.println("야옹");
		}
	
	}
	class Snake extends Animal{
		void cry() {
			System.out.println("쉭쉭~~");
		}
	
	}
	class Bear extends Animal{
		void cry() {
			System.out.println("우우웅");
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
		System.out.println("어흥");
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
		String s1 = "독수리";
		t.m2(2, new String("코알라"));
		System.out.println("============");
		t.m3(new Tiger());
	}
}
*/





/*
//5월14일
class Animal{
	//다양한 결과가 일어날수있도록 업캐스팅 하는것을
	//다향성이라한다
	void cry() {
		System.out.println("...");
	}
}
class Dog extends Animal{
	void cry() {
		System.out.println("멍멍★");
	}
}

class Cat extends Animal{
	void cry() {
		System.out.println("야옹");
	}
	
}

class Snake extends Animal{
	void cry() {
		System.out.println("쉭쉭~");
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
//5월 14일
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
 //5월 14일
//상속관계에서 업캐스팅을 사용할때
//부모함수이름이랑 자식함수이름 동일할때
//이것은 함수 오버라이딩이라고 한다
class A{
	void m1() {
		System.out.println(1);
	}
}
class B extends A{
	//오버라이딩 함수
	void m1() {
		System.out.println(2);
	}
}
//업캐스팅된 객체(1)는 함수(2)가 호출될때 반드시 자식에게 호출된 함수가 있는지 확인한다
public class Hello {  
	public static void main(String[] args){
		A a = new B(); //1
		a.m1(); //2
	}
}
*/




/*
//5월14일
//다형성(다양한 형태의 결과가 일어날수 있다)
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
//객체가 업캐스팅으로 생성된다.
//함수가 호출되면 무조건 집을 확인
//그리고 동일한 이름의 함수가 자식이 있으면 자식 함수 실행
//없다면 부모 함수 실행
public class Hello {  
	public static void main(String[] args){
		
		//A a1 =new A();
		//a1.m1();
		
		//B a2=new B();
		//a2.m1();
		//System.out.println("========");
		
		A a3=new B(); //부모 = 자식 == "업캐스팅" 왼쪽은부모 오른쪽은 자식
		a3.m2();
		//a3.m3(); //에러코드
		a3.m1();
	}
}
*/






/*
//5월14일
class T1{
	T1(){
		System.out.println("부모생성");
	}
	T1(int a , int b){
		System.out.println("부모생성");
	}
}

class T2 extends T1{
	T2(){
		//코드 한줄이 생략되어있는 상태
		//super();
		//super(); 위에 코드작성시 무조건 오류출력
		System.out.println("자식생성");
	}
	T2(int a){
		System.out.println("자생1");
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








 //5월 14일
/*
class T1{
	T1(){
		System.out.println("부모생성");
	}
}

class T2 extends T1{
	T2(){
		//코드 한줄이 생략되어있는 상태
		super();
		System.out.println("자식생성");
	}
}
public class Hello {  
	public static void main(String[] args){
		T2 t = new T2();
	}
}
*/







/*
//5월14일

//부모 (Base class)
class Tiger{
	void m2() {
		System.out.println("tIGER 출력");
	}
	void m3() {
		System.out.println("부모번 출력");
	}
}

//자식(sub class)
//자식 생성자 호출시 자식먼저 호출 후 부모 생성자 호출
class Lion extends Tiger{
	void m1() {
		System.out.println("Lion출력");
	}
	void m3() {
		System.out.println("3번 출력");
	}
	void m4() {
		m3();
		super.m2(); //부모 클래스의 함수 출력
		System.out.println("4번 출력");
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
//5월 13일
class Tiger{ //부모
	void m1() {
		System.out.println("별 그림");
	}
}

class Lion extends Tiger{ //자식
	void m2() {
	System.out.println("모래시계 그림");
	}
}


public class Hello {  
	public static void main(String[] args){
		String a = "사자";//첫자가 대문자로 시작하는것은 "표준클래스" ex String
		System.out.println(a);
		System.out.println("========");
		
		Lion my = new Lion();
		
		my.m2();
		my.m1();
		
	
	}
}
*/





/*
//5월 13일
class Lion{
	int num; //생성자 내 필드
	int fuel; //생성자 내 필드
	
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
//5월13일
class Tiger{
	int a; 
	int b;
	
	void m1(int a,int b) {
		System.out.println(1);
		this.a = a*10;
		this.b = b*20;
	}
	void show() {
		System.out.println(this.a+" "+this.b); //1번 형식 둘다 동일
		System.out.println(a+" "+b); //2번 형식 둘다 동일
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
//5월 13일 (자습범위★★★★★★★★★★★★★★★★★★★) 
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
//5월13일
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
//5월13일
class Tiger{
	//인수 전달이없는 생성자를 "디폴트생성자"라고 한다 (주의!)
	Tiger(){
		System.out.println("1출력");
	}
	Tiger(int a){
		System.out.println("2출력");
	}
	
	
}


public class Hello {  
	public static void main(String[] args){
		Tiger t1 = new Tiger(); //위에 생성자를 호출하는 코드

		
		
		
	}
}
*/







/*
//5월13일
class Tiger{
	//사용자가 생성자를 만들지 않으면 컴퓨터가 자동으로 생성자 만들어버림
	//사용자가 생성자 만들거나 or 컴퓨터가 만들거나 둘중 하나
	//생성자도 오버로드가 가능함 
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
//5월 13일
class Tiger{
	//생성자
	//함수
	//함수 ()안에는 "인수"
	
	//함수이름을 동일하게 작명할수잇는 방법은
	//전달되는 인수의 개수가 다르거나
	//인수의 개수가 같다고 하더라도 받는 타입(int,float)이 다르면 동일함수사용가능			
	//이것을 오버로드or오버로딩(함수 재정의) 라고 한다
	
	//동일하게 이름 사용할수 있는 1번째 조건
	//전달되는 인수의 개수가 달라야함
	
	//인수 전달개수가 같더라도 전달되는 타입이 다르면 성립 2번째 조건
	void m1() {
		System.out.println("m1출력");
	}
	
	
	void m1(int a) {
		System.out.println("m2출력");
	}
	
	void m1(int a,int b) {
		System.out.println("m3출력");
	}
	void m1(String a) {
		System.out.println("m4출력");
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
//5월 13일
class Airplane {
	
	int a,b;
	int fuel;
	
	Airplane(int x , int y , int f){
		a=x;
		b=y;
		fuel = f;
	}
	
	void m1() {
		System.out.println(a+" "+b+ " " + "이 비행기의 연료는"+fuel);
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
//5월13일
class Tiger {
	
	int a=10, b=20;
	Tiger(){
		a=30;
		b=40;
		System.out.println("생선자 콜");
		
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



//5월13일
/*
class Tiger {
	//생성자를 사용하는 목적
	//필드 또는 멤버변수 초기화 목적으로 사용됨
	int a, b;
	Tiger(){
		a=10;
		b=20;
		System.out.println("생선자 콜");
		
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
//5월13일 
//생성자(생성자 함수의 줄임말)
//1.생성자는 함수이기 때문에 함수 만들듯 만들면됨
//2. 생성자 함수는 작명법이 정해져있다(반드시 클래스 이름과 동일)
//3.생성자는 리턴값 가질수없음(void 조차도 사용하면 안됨)
//4.생성자는 함수라고 했는데 언제호출이 되는가 하면
//5.객체가 생성될때 자동 호출됨
//6.생성자는 사용자가 임의로 호출불가
class Tiger{
	Tiger(){
		System.out.println("생성자 호출");
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
//5월12일 return 응용
class Long{
	void m1() {
		System.out.println("m1 호출");
	}
	
	int m2() {
		System.out.println("m2 호출");
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
//5월12일 return
class Tiger{
	//void = 없다 
	// m1은 리턴값이 없다.
	void m1() {
		
	}
	
	// 리턴값이 있다.
	//곧 정수(int)가 리턴됩니다.
	int m2() {
		System.out.println("m2호출");
		return 100;
		
	}
	
	int m3() {
		System.out.println("m3호출");
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
//5월12일
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
//5월 12일
class King{
	void q1() {
		System.out.println("q1 메소드 호출");
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
//5월12일
class Lion{
	void qwe() {
		System.out.println("qwe 메소드가 호출됐다.");
	}
	void asd() {
		System.out.println("asd 메소드가 호출됐다.");
	}
	void zxc() {
		System.out.println("zxc 메소드가 호출됐다.");
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
//5월12일
class Fuck{
	//메쏘드 만든다
	void eatA(){
		System.out.println("물을 끓인다.");
		System.out.println("라면을 넣는다.");
		System.out.println("스프를 넣는다.");
		System.out.println("맛있게 먹는다.");

	}
	void eatB(){
		System.out.println("물을 녹인다.");
		System.out.println("아이스크림을 넣는다.");
		System.out.println("콩을 넣는다.");
		System.out.println("존나 맛없게 먹는다.");

	}
}
public class Hello 
{
	public static void main(String[] args) 
	{
		Fuck f1 = new Fuck();
		
		System.out.println("아침식사"); 
		f1.eatB(); //메쏘드 호출시 (); 마지막에 붙여야함
		System.out.println("점심식사");
		
		System.out.println("야식");
		
		
		
		//메쏘드 System.out.println("라면을끓임");
		//메쏘드 System.out.println("맛잇게");
		//메쏘드 System.out.println("먹는다 ");
		//메쏘드 이름 = 먹다
		//메쏘드 이름을 부르면 == 호출한다
	}
	}
	*/








/*
//5월12일
class Tiger
{
	int a=10 , b , c=20; //필드
}


public class Hello 
{
	public static void main(String[] args) 
	{
		Tiger t1 = new Tiger(); //t1의 호랑이
		System.out.println(t1.a + " "+ t1.b + " "+ t1.c);
		
		Tiger t2 = new Tiger(); //t2의 호랑이
		System.out.println(t1.a + " "+ t1.b + " "+ t1.c);
		
		System.out.println(t1); //객체의 주민등록번호 출력
		System.out.println(t2);
	}
}
*/


/*
//5월 12일
class Airplane
{
	
	int num; // 핋드
	int ct;
}


public class Hello 
{
	public static void main(String[] args) 
	{
		//클래스이름 객체 = 만드세요 클래스이름();
		//객체이름 a1 설정
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
//5월12일
//첫자는 대문자로 작명하는것이 암묵적 약속
class Airplane //클래스(설계도)의 이름 정하기
{
	//{} 사이에 있는 모든것은 한가족.
	// 패밀리 (멤버.)
	//1. 필드 or 멤버필드
	//2. 생성자 or 멤버생성자
	//3. 메소드 (함수) or 멤버메소드
}



public class Hello 
{
	public static void main(String[] args) 
	{
		
		
		
		
	}
}
*/






/*
 //5월11일
public class Hello 
{
	public static void main(String[] args) 
	{
		int[] ar = {4, 5, 6, 7, 8, 9, 2, 3, 5, 7 };
		System.out.println(ar.length);
		System.out.println("---------------------------");
		// 4번 반복
		for (int i = 0; i < ar.length/2; i++) 
		{
			//System.out.println( ar[i] + ar[8-1-i]    );
			System.out.println( ar[i] + ar[ar.length-1-i]    );
		}
	}
}
*/








/*
 5월11일
public class Hello 
{

	public static void main(String[] args)

	{
		int a [] = new int [13];
		System.out.println(a.length); // 몇개의 변수를 가지고있냐 변수.length
		
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
 5월11일
public class Hello 
{

	public static void main(String[] args)

	{
		int[] a = new int[10]; //방법 1
		
		int[] b = new int[] {10, 20, 30, 88, 99}; // 0, 1, 2, 3, 4 방법2
		
		int[] c = {11, 22, 33, 44, 55}; //0 , 1, 2, 3, 4 방법3
		
		System.out.println(c[4] - 20);
	}
}
*/



/*
 5월11일
public class Hello 
{

	public static void main(String[] args)

	{
		int a =30 , b=40;
		
		int t1 , t2 ,t3 ,t4 , t5,t6,t7,t8,t9,t10 ;
		// array , 밑에 문장이 정석
		int[] arr = new int [10];
		
		arr [0] = 10;
		arr [4] = 20;
		arr [7] = arr [0] + arr [4];
		
		System.out.println(arr[4]);
	}
}

*/





/*
5월11일
public class Hello 
{

	public static void main(String[] args)

	{
		int num = 15;
		int a = 10;
		//변수가 case 뒤에 사용불가
		switch(a)
		{
		case 10:	
			System.out.println("코끼리1");
			System.out.println("코끼리2");
			break;
			
		
		case 20:
			System.out.println("수수");
			break;
			
		case 30:
			System.out.println("독수리");
			break;
			
			default:
				System.out.println("else");
				break;
			
		}
		
		System.out.println("탈출");
		
		
		
	}
}
*/





/*
//ex 5월11일
//for문 반복횟수를 알때 쓰는거
//while문 반복횟수를 모를때 쓰는거
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
	    		System.out.println("탈출직전");
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
		System.out.println("탈출완료");
		
		
		
		
		
		
	}
}
*/




/*
//ex 5월11일
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
		System.out.println("호랑이");
		
		
		
		
		
		
		
		
	}
}
*/






/*
//ex 5월11일 
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
				System.out.println("탈출직전");
				break; //즉석에서 반복문 탈출
			}
		}
		
         	System.out.println("호랑이");
		
		
		
		
	}	
}
*/




/*
//ex 5월11일
public class Hello 
{

	public static void main(String[] args)

	{
		int a= 65;
		
		for (int i = 0; i < 26; i++) 
		{
			int num = '한' + i;
			
			System.out.println((int)num);
		}
		
	}
}
*/






/*
//ex 5월11일
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
				System.out.println(i+"5가맞습니다");
			}
			else
			{
				System.out.println(i+"5가아닙니다");
			}
		}
		System.out.println("=========");
		for (int i = 0; i < 8; i++)
		{
			//System.out.println(i);
			if(i % 2 == 0)
			{
				System.out.println(i+"짝수");
			}
			else
			{
				System.out.println(i+"홀수");
			}
		}
		
		
		
	}
}
*/





/*
//ex 5월11일
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
			System.out.println("호");
		}
		for (int i = 0; i < 4; i++) {
			System.out.println("랑");
		}
	}
}
*/










/*
//ex 5월11일
public class Hello 
{

	public static void main(String[] args)

	{  
		int num =20;
		System.out.println(num);
		num = num+1;
		System.out.println(num);
		num++; // 동일한 역할을 한다. num = num+1;
		System.out.println(num);
		
		++num;
		System.out.println(num);
		
		//i++ : i= i+1
		for (int i = 0; i < 7; i++) 
		{
			System.out.println(i+"호랑이");
		}
	}
}
*/





/*
//ex 5월11일
public class Hello 
{

	public static void main(String[] args)

	{  
		System.out.println(10);
		System.out.println(10+20);
		System.out.println(10+10+"호랑이");
		System.out.println("호랑이"+10+10);
		
		int num = 19;
		for(int a = 0 ; a < 10; a=a+1) //*는 연산에서 우선순위 높음 (사칙연산)
		{
		//System.out.println(a + "호랑이");
		System.out.println(num + " * " +a +" = "+a*num);
		}
		
		
		
		
		
		
	}
}
*/









/*
//ex 5월11일
public class Hello 
{

	public static void main(String[] args)

	{  
		for (int i =30; i>21; i=i-1)
		{
			System.out.println(i);
		}
		
		System.out.println("만족");
		
		
		
		
	}
	
	}
*/



/*
//ex11)
public class Hello 
{

	public static void main(String[] args)

	{  
		//4개중에 반드시 한개만 선택하고 싶을때..
		//n개중에 반드시 한개만 선택하고 싶을때..
		int jumsu = 70;
	if(jumsu >= 90)
	{
		System.out.println("매우우수");
	}
	else if(jumsu >=80)
	{
		System.out.println("우수");
	}
	else if(jumsu >=70)
	{
		System.out.println("별로");
	}
	else
	{
		System.out.println("쓰레기");
	}
		
		
		
		
		
		
	}
	}
*/

/*
//ex11)★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
public class Hello 
{

	public static void main(String[] args)

	{  
		int n = 100;
		if(n % 2 == 0)
		{
			System.out.println("짝수");
			
		}
		if(n%2==1)
		{
			System.out.println("홀수");
		}
		System.out.println("----------");
		
		System.out.println("호랑이");
		if(n % 2 == 0)
		{
			System.out.println("짝수");
		}
		else
		{
			System.out.println("홀수");
		}
		System.out.println("독수리");
		
		System.out.println("----------");
		//예제3
		int num = 1190211; //남자
		
		
		
		//int num = 	190211; //여자
		if(num /1000000 == 1)
		{
			System.out.println("남자");
		}
		else
		{
			System.out.println("여자");
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
		//if 제어문 , for 제어문 , while 제어문 , switch 제어문 4대 제어문 
		//1.4대 제어문의 공통점은 () {}
		//2.제어문 안에 제어문 사용가능
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
		System.out.println("짝수아님??");
		
		if(num % 5 == 0)
		{
			System.out.println("5의배수?");
		}
	}
	System.out.println("독수리");
	
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
		//if 제어문 , for 제어문 , while 제어문 , switch 제어문 4대 제어문 
		
		//if 1
		System.out.println(1);
		if(false)
		{
			System.out.println("호랑이1");
			System.out.println("호랑이2");
			System.out.println("호랑이3");
		}
		System.out.println(2);
		System.out.println("============");
		System.out.println(1);
		//if 2
		if(true)
		{
			System.out.println("호랑이1");
			System.out.println("호랑이2");
			System.out.println("호랑이3");
		}
		System.out.println(2);
		
		System.out.println(4);
		//if 3 
		if(4>3)
		{
			System.out.println("코끼리");
			
		}
		System.out.println(5);
		System.out.println("============");
		
		//if 4
		if(4>3 && 100 <5)
		{
		System.out.println("독수리");	
		}
		System.out.println(6);
		
		//if 5
		if (4 > 3||  100 < 5)
		{
			System.out.println("닭수리");	
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

	{          //           레벨     key      논리 or 연산.(한개라도 true면 참이라고 해줌)
		System.out.println(false||false); //false
		System.out.println(false||true); //true
		System.out.println(true||false); //true
 		System.out.println(true||true); //true
		System.out.println("========");
		
		  //                         레벨     key      논리 and 연산.(모두 true일때 참이라고 해줌)
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
				
				
				System.out.println(!(5>2)); // !를 논리 부정연산자로 한다
		
	}
}
*/

/*
//ex9)
public class Hello 
{

	public static void main(String[] args)

	{
		// float(4) , double(8) , boolean(1) (4)4바이트 메모리 32비트 8x4
		
		int a = 30;
		float b = 30.1f; //소수점이 들어갈 때 반드시 f를 붙여야함 
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
		//char (메모리2개) , float(4) , double(8) , boolean(1)
		//char 양수만 사용가능(2배를 사용)
		char d = 'A'; //d변수는 실제로는 65번 코드 가짐(아스키코드)
		System.out.println((int)Character.MAX_VALUE);
		System.out.println((int)Character.MIN_VALUE);
		System.out.println("==========");
		int f =88;
		char e = 70;
		System.out.println(e);
		
		System.out.println((int)d); //원래 가지고 있는 타입(메모리값)을 int 숫자로 출력한다 타입캐스팅
		System.out.println((char)f);//"" 88에 해당되는 문자 값을 출력한다 타입캐스팅
	}
}
*/



/*
//ex7)
public class Hello 
{

	public static void main(String[] args)

	{
		byte shit = 127; //메모리 1개주세요
		
		short a = 256;//메모리 2개주세요
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		
		int b = 246; //메모리 4개주세요 //integer
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		
		long c = 24615677; //메모리 8개주세요
		System.out.println(Long.MAX_VALUE);
		System.out.println();//공백 효과
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
		byte fuck; //byte 타입 fuck 변수 선언
		fuck = 10; // fuck에 10 숫자 대입
		
		byte shit = 20; //byte 타입 shit 변수에 20 초기화
		
		System.out.println(fuck);
		System.out.println(shit);
		
		fuck = 30;
		shit = 40;
		
		System.out.println(fuck);
		System.out.println(shit);
		System.out.println(shit+fuck);
		System.out.println(2*2*2);
		System.out.println("========");
		
		fuck = -128;//메모리 1개주세요 숫자 유효범위 -128 ~ +127
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
		 byte fuck; // 메모리1개 요청 후 변수 이름을 fuck라고 저장
      fuck = 100; //fuck 변수에 100을 삽입 
      System.out.println(fuck*2);
      System.out.println(fuck*fuck);
      System.out.println(fuck!=101);
      System.out.println(fuck*2 <= 100);
		
    fuck = 30; // 여기서부터 30으로 저장됨 (100은 초기화됨)  
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
		//비교연산 총 6개 존재
		//syso (ctrl + space)
		System.out.println(3+5 > 5+4); //큽니까?
		System.out.println(3+5 < 5+4); //작습니까?
		System.out.println(3+5 >= 5+2); //크거나 같냐?
		System.out.println(10 <= 5); //작거나 같냐?
		System.out.println(10 == 10); //둘이 같냐?
		System.out.println(11 != 10); //같지 않습니까?
		System.out.println("==========="); 
//연산 우선순위 : 1.산술연산 2.비교연산
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

		System.out.println('윤');	// 문자를 출력

		System.out.println(123454654);	//숫자를 출력

		System.out.println("======");//구분법
		//산술연산
		System.out.println(13+3);	
		System.out.println(13-3);	
		System.out.println(13/3); //몫	
		System.out.println(13%3); // 나머지	
		System.out.println("윤재은");	

		// '한' : 글자를 한자박에 못넣음 문자
		// "하늘" : 여러글자를 넣을수있다. 문자열



	}
}
 */







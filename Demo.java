public class Demo{
static int x;
int y;
public static void m2 () {
	int y=10;
	System.out.println(y);
}
public static void m1() {
	int y=20;
	System.out.println(y);
	m2();
}
public static void main(String[] args){
	int y=45;
	System.out.println("Surbhi");
	System.out.println(x);
	System.out.println(y);
	m1();
	Demo obj = new Demo();
	System.out.println(obj.y);
}
}
	
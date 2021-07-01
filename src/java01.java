import java.util.Scanner;

public class java01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner(System.in);
		String name;
		int age;
        boolean bool;
        byte a;
        short b;
        long c;
        float d;
        double f;
        
		System.out.print("당신의 이름은? ");
        name = myInput.nextLine();
        System.out.printf("당신의 이름은 %s 입니다.\n", name);
        
        System.out.print("당신의 나이는? ");
        age = myInput.nextInt();
        System.out.printf("당신의 나이는 %d 입니다.\n", age);
        
        System.out.print("boolean 값을 입력하세요 : ");
        bool = myInput.nextBoolean();
        System.out.printf("입력한 boolean 값은 %s입니다.\n", bool);
        
        System.out.print("byte 값을 입력하세요 : ");
        a = myInput.nextByte();
        System.out.printf("입력한 byte 값은 %s입니다.\n", a);
        
        System.out.print("short 값을 입력하세요 : ");
        b = myInput.nextShort();
        System.out.printf("입력한 short 값은 %d입니다.\n", b);
        
        System.out.print("long 값을 입력하세요 : ");
        c = myInput.nextLong();
        System.out.printf("입력한 long 값은 %d입니다.\n", c);
        
        System.out.print("float 값을 입력하세요 : ");
        d = myInput.nextFloat();
        System.out.printf("입력한 float 값은 %s입니다.\n", d);  
        
        System.out.print("double 값을 입력하세요 : ");
        f = myInput.nextDouble();
        System.out.printf("입력한 double 값은 %s입니다.\n", f);  
        
		myInput.close();
	}

}

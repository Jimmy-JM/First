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
        
		System.out.print("����� �̸���? ");
        name = myInput.nextLine();
        System.out.printf("����� �̸��� %s �Դϴ�.\n", name);
        
        System.out.print("����� ���̴�? ");
        age = myInput.nextInt();
        System.out.printf("����� ���̴� %d �Դϴ�.\n", age);
        
        System.out.print("boolean ���� �Է��ϼ��� : ");
        bool = myInput.nextBoolean();
        System.out.printf("�Է��� boolean ���� %s�Դϴ�.\n", bool);
        
        System.out.print("byte ���� �Է��ϼ��� : ");
        a = myInput.nextByte();
        System.out.printf("�Է��� byte ���� %s�Դϴ�.\n", a);
        
        System.out.print("short ���� �Է��ϼ��� : ");
        b = myInput.nextShort();
        System.out.printf("�Է��� short ���� %d�Դϴ�.\n", b);
        
        System.out.print("long ���� �Է��ϼ��� : ");
        c = myInput.nextLong();
        System.out.printf("�Է��� long ���� %d�Դϴ�.\n", c);
        
        System.out.print("float ���� �Է��ϼ��� : ");
        d = myInput.nextFloat();
        System.out.printf("�Է��� float ���� %s�Դϴ�.\n", d);  
        
        System.out.print("double ���� �Է��ϼ��� : ");
        f = myInput.nextDouble();
        System.out.printf("�Է��� double ���� %s�Դϴ�.\n", f);  
        
		myInput.close();
	}

}

import java.util.*;

public class A1113330_0421_1{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
    String checkEmail = "[a-z0-9]+@([a-z]+.[a-z]+)+";
        
    System.out.println("請輸入你的Email：");
        
    String Email = sc.next();
        
    if(!Email.matches(checkEmail)){
    System.out.println("請輸入正確的Email格式：");
    Email = sc.next();
    }
  }
}
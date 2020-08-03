package haen;
import java.util.Scanner;
public class babo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] titles = new String[10];
		String[] bodies = new String [10];
		int lastIndex = 0;
		while(true) {
			System.out.println("명령어를 입력해주세요");
			String s = sc.nextLine();
			
			
			if(s.equals("exit")) {
				System.out.println("프로그램 종료");
				break;
			}
		
		else if (s.equals("help")) {
			System.out.println("exit : 프로그램 종료");
			
		}
		else if (s.equals("add")) {
			System.out.println("제목을 입력하세요");
			titles[lastIndex] = sc.nextLine();
			System.out.println("내용을 입력하세요");
			bodies[lastIndex] = sc.nextLine();
			
			lastIndex++;
		}
		else if (s.equals("list")) {
			for(int i = 0; i < lastIndex; i++ ) {
			System.out.println("제목 : " + titles[i]);
			System.out.println("내용 : " + bodies[i]);
			System.out.println("-------------------");
			}
		}
		else{
			System.out.println("올바른 명령어가 아닙니다");
			}	
		
		}
	}
}

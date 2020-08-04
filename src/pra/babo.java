package pra;

import java.util.Scanner;

public class babo {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] titles = new String[10]; // 게시물 제목
		String[] bodies = new String [10]; // 게시물 내용
		int lastIndex = 0; // 게시물 수
		int [] ids = new int[10]; // 게시물 번호
		int lastId = 0; //마지막 게시물 번호
		while(true) {
			System.out.println("명령어를 입력해주세요");
			String s = sc.nextLine();
			
			
			if(s.equals("exit")) {
				System.out.println("프로그램 종료");
				break;
			}
		
		else if (s.equals("help")) {
			System.out.println("exit : 프로그램 종료");
			System.out.println("add : 게시물 추가");
			System.out.println("list : 게시물 목록 불러오기");
		}
		else if (s.equals("add")) {
			lastId++; //게시물 번호 자동 증가
			int id = lastId;
			ids [lastIndex] = id;
			
			System.out.println("제목을 입력하세요");
			titles[lastIndex] = sc.nextLine();
			System.out.println("내용을 입력하세요");
			bodies[lastIndex] = sc.nextLine();
			
			lastIndex++;
		}
		else if (s.equals("list")) {
			for(int i = 0; i < lastIndex; i++ ) {
			System.out.println("번호 : " + ids[i]);
			System.out.println("제목 : " + titles[i]);
			System.out.println("내용 : " + bodies[i]);
			System.out.println("-------------------");
			}
		}
		else if (s.equals("update")){
			System.out.println("수정할 게시물 번호를 입력해주세요");
			String target = sc.nextLine();
			int targetNo = Integer.parseInt(target);
			int targetIndex = -1; //찾는게 없을 때 -1
			
				for(int i = 0; i <lastIndex; i++) {
					if(ids[i] == targetNo) {
						targetIndex = i;
					}
			}
				if(targetIndex == - 1) {
					System.out.println("없는 게시물입니다");
				}else
				System.out.println("수정할 제목을 입력해주세요");
				String title = sc.nextLine();
				System.out.println("수정할 내용을 입력해주세요");
				String body = sc.nextLine();
				titles[targetIndex] = title;
				bodies[targetIndex] = body;
		}
		else if (s.equals("delete")){
			System.out.println("삭제할 게시물 번호를 선택해주세요");
			String delTarget = sc.nextLine();
			int delTargetNo = Integer.parseInt(delTarget);
			int delTargetIndex = -1;
			for(int i = 0; i <lastIndex; i++) {
				if(ids[i] == delTargetNo) {
					delTargetIndex = i;
				}
		}
			if(delTargetIndex == - 1) {
				System.out.println("없는 게시물입니다");
			}else {
				
			}
			
		}
		else{
			System.out.println("올바른 명령어가 아닙니다");
			}	
		}
	}
}

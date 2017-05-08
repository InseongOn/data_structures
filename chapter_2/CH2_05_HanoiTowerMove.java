package chapter_2;

import java.util.Scanner;

public class CH2_05_HanoiTowerMove {

	static int cnt = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("원반의 갯수를 입력하세요 : ");
		int num = Integer.parseInt(scan.nextLine());
		
		hanoiTowerMove(num, 'A', 'B', 'C');
		
		System.out.printf("\n총 움직인 횟수 : %d", cnt);
	}

	public static void hanoiTowerMove(int num, char from, char by, char to) {

		cnt++;
		
		if(num == 1){
			System.out.printf("원반 1을 %c에서 %c로 이동\n", from, to);
		}else{
			hanoiTowerMove(num-1, from, to, by);
			System.out.printf("원반 %d을 %c에서 %c로 이동\n",num, from, to);
			hanoiTowerMove(num-1, by, from, to);
		}
	}
}

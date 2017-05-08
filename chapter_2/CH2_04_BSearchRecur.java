package chapter_2;

import java.util.Scanner;

public class CH2_04_BSearchRecur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
//		int[] ar = makeArray(20);
		
		System.out.print("찾고 싶은 숫자를 입력하세요(피보나치 수열 20까지의 범위 중) : ");
		int target = Integer.parseInt(scan.nextLine());
		
		int result = bSearchRecur(makeArray(20), 0, 19, target);
		
		if(result < 0){
			System.out.println("못 찾았다!! 숫자를 다시 확인해봐!!");
		}else{
			System.out.println("찾았다!!");
		}
	}
	
	public static int[] makeArray(int n){
		int[] ar = new int[n];
		
		for (int i = 0; i < n; i++) {
			ar[i] = fibo(i+1);
		}
		return ar;
	}

	public static int fibo(int num) {

		if (num == 1) {
			return 0;
		} else if (num == 2) {
			return 1;
		} else {
			return fibo(num - 1) + fibo(num - 2);
		}
	}

	public static int bSearchRecur(int[] ar, int first, int last, int target) {

		int mid = 0;
		
		if(first > last){
			return -1;
		}
		
		mid = (first + last) / 2;
		
		if(ar[mid] == target){
			return mid;
		}else if(target < ar[mid]){
			return bSearchRecur(ar, first, mid-1, target);
		}else{
			return bSearchRecur(ar, mid+1, last, target);
		}
	}
}

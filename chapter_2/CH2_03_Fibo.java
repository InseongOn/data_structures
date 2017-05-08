package chapter_2;

public class CH2_03_Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i < 15; i++){
			System.out.printf("%d ", fibo(i));
		}
	}

	public static int fibo(int num){
		
		if(num == 1){
			return 0;
		}else if(num == 2){
			return 1;
		}else{
			return fibo(num - 1) + fibo(num - 2);
		}
	}
}

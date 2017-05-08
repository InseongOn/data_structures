package chapter_2;

public class CH2_01_Recursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		recursive(3);
	}

	public static void recursive(int num){
		
		if(num > 0){
			System.out.printf("Recursive call!! %d\n", num);
			recursive(--num);
		}
	}
}

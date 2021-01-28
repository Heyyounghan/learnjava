import java.util.Scanner;

public class Loop_04 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		//int i = sc.nextInt();

		/*for (int j=0; j<i; j++) {
			//짝수만 출력
			//if (j%2!=0) {
				System.out.println(j++);
			//}
		}*/
		/*j++의 예제가 대부분인데 꼭 1씩 증가가 아니라 배수와 같이 증감식을
		 * 작성해 배수로 만들어줘도 된다. 
		 */
		for(int j=0; j<100;j=j+2) {
			System.out.println("j="+j);
		}

	}

}

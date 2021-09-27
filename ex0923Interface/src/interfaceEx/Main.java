package interfaceEx;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		입출력 담당
//		정답 횟수 체크, 5문제를 제시할 수 있게

		Scanner sc = new Scanner(System.in);
		GameDummy p1 = new GameDummy();
//		PlusGame p1 = new PlusGame();
		int count = 0;

		for (int i = 0; i < 3; i++) {
			p1.makeRandom(); // 2. 난수 생성 기능
			// 3. 문제 출력
			System.out.print(p1.getQuizMsg());
			int answer = sc.nextInt();

			// 4. 한 문제당 기회는 3번

			if (p1.checkAnswer(answer))
				count++;
			else
				System.out.println("오답입니다~");

		}

		System.out.println("정답의 개수는 " + count + "개 입니다!");
		System.out.println("modified modified modified");
	}

}

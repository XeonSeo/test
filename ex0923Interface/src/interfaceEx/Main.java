package interfaceEx;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		����� ���
//		���� Ƚ�� üũ, 5������ ������ �� �ְ�

		Scanner sc = new Scanner(System.in);
		GameDummy p1 = new GameDummy();
//		PlusGame p1 = new PlusGame();
		int count = 0;

		for (int i = 0; i < 3; i++) {
			p1.makeRandom(); // 2. ���� ���� ���
			// 3. ���� ���
			System.out.print(p1.getQuizMsg());
			int answer = sc.nextInt();

			// 4. �� ������ ��ȸ�� 3��

			if (p1.checkAnswer(answer))
				count++;
			else
				System.out.println("�����Դϴ�~");

		}

		System.out.println("������ ������ " + count + "�� �Դϴ�!");
		System.out.println("modified modified modified");
	}

}

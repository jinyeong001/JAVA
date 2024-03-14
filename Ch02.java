
public class Ch02 {

	public static void main(String[] args) {
		// 01 진수
		// 진수(진법): 정수를 표현할 떄 사용되는 수 표현방법
		// Java는 기본적으로 10진수를 사용, 정수 리터럴 작성할 때는 10진수가 기본적으로 사용된다.

		// 02 서식문자를 사용한 진수 표현법
		System.out.printf("2진수 : %d\n", 0b10101101); // 2진수
		System.out.printf("10진수 : %d\n", 173); // 10진수
		System.out.printf("8진수 : %d\n", 0255); // 8진수
		System.out.printf("16진수 : %d\n", 0xAD); // 16진수

		// ==> 컴퓨터는 내부적으로 모든 값을 이진(binary) 데이터로 저장하고 있다.
		// 우리가 보는 것은 다양한 진법의 리터럴을 통해 그 값을 해석 == 형식 지정자(서식문자)에 맞게 표현되었다.

		// 03 이진 데이터(2진수)의 양수 표현 방식

		// 컴퓨터는 10진수 데이터를 2진수 데이터로 변환하여 저장되는데
		// 이 때 2진수로 변환된 데이터 하나를 담는 최소 공간단위 == 비트(bit)

		// 0 1 1 1 1 1 1 1
		// 128 64 32 16 8 4 2 1

		// 10진수 -> 2진수
		//
		// 1 -> 1 1비트가 사용됨.
		// 2 -> 10 2비트가 사용됨.
		// 3 -> 11 2비트가 사용됨.
		// 4 -> 100 3비트가 사용됨.
		// 5 -> 101 3비트가 사용됨.
		// 8 -> 1000 4비트가 사용됨.
		// 31 -> 11111 5비트가 사용됨.
		// 44 -> 101100 6비트가 사용됨.
		// 112 -> 1110000 7비트가 사용됨.
		// 255 -> 1111110 7비트가 사용됨.
		// 256 -> 1111111 7비트가 사용됨.

		// 10진수를 2진수로 변환하는 문제

		// 10 -> 1010
		// 12 -> 1100
		// 160 -> 10100000
		// 31 -> 11111
		// 127 -> 1111111

		// 2진수를 10진수로 변환하는 문제
		// 1100001 -> 97
		// 01011101 -> 93
		// 00001011 -> 11
		// 11111110 -> 255

		// 04 이진 데이터(2진수)의 음수 표현 방식
		// CPU는 가산회로에 의해서 데이터에 대한 덧셈여산이 가능하다? O
		// CPU는 감산기(감산회로)에 의해서 데이터에 대한 뺄셈연산을 할 수 있다? X
		// CPU는 애초에 가연산에 특화되어있는 명령 처리 장지

		// 컴퓨터는 보수 개념을 사용해서 뺼셈을처리

		// 보수 : 각 자리의 숫자의 합이 일정한 수가 되게 하는 수
		// 어느 수에 대한 반전, 뒤집는 개념

		// 0 1 1 1 1 1 1 1 = 64 + 32 + 16 + 8 + 4 + 2 + 1
		// +1 64 32 16 8 4 2 1

		// 1 1 1 1 1 1 1 1 = -128 +64 + 32 + 16 + 8 + 4 + 2 + 1
		// -1 64 32 16 8 4 2 1

		// 1byte = 8bit

	}

}

package chapter2;

public class TypeInference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var i = 10;
		var j = 10.0;
		var str = "hello";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test";
		// str = 3; str
		// str 변수는 String형으로 먼저 사용되었기 떄문에 정수 값을 넣을 수 없음
	}

}

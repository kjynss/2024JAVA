package jmk.sec01.exam21;

public class StringTrimExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tel1 = " 02";
		String tel2 = "123  " ;
		String tel3 = "  1234  ";
		
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		//trim() : 앞뒤 공백 제거, 중간 공백 남음
		System.out.println(tel);
	}

}

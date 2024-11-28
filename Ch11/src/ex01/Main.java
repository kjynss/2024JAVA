package ex01;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		Member m1 = new Member(92);
		Member m2 = new Member(92);
		
		HashMap < Member, String> student = new HashMap<Member, String>();
		student.put(m1,  "Donggeun Lee");
		System.out.println("Name is " + student.get(m1));
	}

}

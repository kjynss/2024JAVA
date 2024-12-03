package jmk.sec01.exam04;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
	
	public int hashCode() {
		return id.hashCode();
	}
}

package ex022;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Button().SetOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void OnClick() {
				System.out.println("Make a phone call!");
			}
		}).Touch();
		//callButton.Touch();
		
		
		// Button messageButton = new Button();
		new Button().SetOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void OnClick() {
				System.out.println("Send a message!!");
			}
		}).Touch();;
	}

}

package ex021;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button callButton = new Button();
		callButton.SetOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void OnClick() {
				System.out.println("Make a phone call!");
			}
		});
		callButton.Touch();
		
		
		Button messageButton = new Button();
		messageButton.SetOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void OnClick() {
				System.out.println("Send a message!!");
			}
		});
		messageButton.Touch();
	}

}

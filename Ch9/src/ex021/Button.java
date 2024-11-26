package ex021;

public class Button {
	public interface OnClickListener {
		void OnClick();
	}
	
	OnClickListener listener;
	
	public void SetOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	public void Touch() {
		if(listener != null) {
			listener.OnClick();
		}
	}
}

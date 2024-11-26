package ex022;

public class Button {
	public interface OnClickListener {
		void OnClick();
	}
	
	OnClickListener listener;
	
	public Button SetOnClickListener(OnClickListener listener) {
		this.listener = listener;
		return this;
	}
	
	public void Touch() {
		if(listener != null) {
			listener.OnClick();
		}
	}
}

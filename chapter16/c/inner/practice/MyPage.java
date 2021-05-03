package c.inner.practice;

public class MyPage{
	public static void main(String[] args){
		MyPage mp = new MyPage();
		mp.setUI();
		mp.pressKey();
		
	}
	
	InputBox input;

	public void setUI(){
		input = new InputBox();
		KeyEventListener kel = new KeyEventListener(){
			public void onKeyDown(){
				System.out.println("Key Down");
			}
			public void onKeyUp(){
				System.out.println("Key Up");
			}
		};

		input.setKeyListener(kel);
	}

	public void pressKey(){
		input.listenerCalled(InputBox.KEY_DOWN);
		input.listenerCalled(InputBox.KEY_UP);
	}
}
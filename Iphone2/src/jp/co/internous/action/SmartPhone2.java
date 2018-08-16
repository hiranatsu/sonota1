package jp.co.internous.action;

public class SmartPhone2 implements Mp3Player2 {

	@Override
	public void play() {
		System.out.println("再生");

	}

	@Override
	public void stop() {
		System.out.println("停止");

	}

	@Override
	public void next() {
		System.out.println("次へ");
	}

	@Override
	public void back() {
		System.out.println("戻る");
	}

}

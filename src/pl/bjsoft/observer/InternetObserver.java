package pl.bjsoft.observer;

public class InternetObserver extends Observer {

	public InternetObserver(Subject subject) {
		this._subject = subject;
		this._subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("InternetObserver: " + _subject.getNews());
	}

}

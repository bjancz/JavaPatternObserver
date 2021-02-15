package pl.bjsoft.observer;

public class NewspaperObserver extends Observer {

	public NewspaperObserver(Subject subject) {
		this._subject = subject;
		this._subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("NewspaperObserver: " + _subject.getNews());
	}

}

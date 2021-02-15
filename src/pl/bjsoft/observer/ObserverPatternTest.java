package pl.bjsoft.observer;

public class ObserverPatternTest {

	public static void main(String[] args) {
		Subject subject = new Subject();

		new InternetObserver(subject);
		new NewspaperObserver(subject);


		subject.setNews(" Trump fired");

	}
}

package com.dp.observer;

public class Test {

	public static void main(String[] args) {
		ObservableImpl observable = new ObservableImpl();
		Observer o1 = new ObserverImpl1();
		Observer o2 = new ObserverImpl2();
		Observer o3 = new ObserverImpl1();
		observable.subscribe(o1);
		observable.subscribe(o2);
		observable.setState(22);
		observable.subscribe(new Observer() {

			@Override
			public void update(int state) {
				System.out.println("********Inner function********");

			}
		});
		observable.subscribe(obs -> System.out.println("*************Anonymous class************"));
		observable.setState(44);
	}

}

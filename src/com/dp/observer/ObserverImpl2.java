package com.dp.observer;

public class ObserverImpl2 implements Observer {

	private int counter;

	@Override
	public void update(int state) {
//		int state = ((ObservableImpl) observable).getState();
		if (state % 2 == 0)
			++counter;
		System.out.println("******* ObserverImple2 ********");
		System.out.println("Novelle mise à jour : state = " + state);
		System.out.println("Résultat de calcul : " + (state % 2 == 0 ? "Pair" : "Impaire"));
		System.out.println("Le compteur est : " + counter);
		System.out.println("*******************************");

	}

}

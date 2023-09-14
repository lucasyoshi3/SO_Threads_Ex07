package controller;

import java.util.Random;

import javax.swing.JTextField;

public class CacaNiquelThread extends Thread  {
	private JTextField num;
	
	public CacaNiquelThread(JTextField num) {
		this.num=num;
	}
	
	@Override
	public void run() {
		jogar();
	}

	private void jogar() {
		Random random=new Random();
		String numero;
		for(int i=1;i<random.nextInt(150);i++) {
			numero=Integer.toString(random.nextInt(6)+1);
			num.setText(numero);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}

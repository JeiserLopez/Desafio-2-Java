package controllers;

import java.util.Calendar;
import java.util.Date;

public class ReservasController {
	

	public double calcularValorReserva(Calendar inicio, Calendar fin) {
		// TODO Auto-generated method stub
		int dias = -1;
		int diario = 180;
		int valor;
		
		while(inicio.before(fin) || inicio.equals(fin)) {
			dias++;
			inicio.add(Calendar.DATE, 1);
		}
		
		return dias * diario;
		
	}

}

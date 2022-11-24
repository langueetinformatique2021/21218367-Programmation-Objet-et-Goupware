package devoirTD7;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class Calendar2 extends GregorianCalendar{
	
	private boolean cours;
	
	public Calendar2() {
		Date date = new Date();
		this.setTime(date);	
	}
	
	/** affiche la date et l’heure de la création de l’objet */
	public void creation() {
		if (this.get(Calendar.DAY_OF_WEEK) ==4) {
			if (this.get(Calendar.HOUR_OF_DAY)>9 && this.get(Calendar.HOUR_OF_DAY)<12 && this.get(Calendar.MINUTE)>30) {
				cours = true;
			}else {
				cours = false;
			}
		}else {
			cours = false;
		}
		
		System.out.println("start TIME : " + this.getTime());
		System.out.println("created in the class : " + cours);
	}
	
	/** affiche la date et l’heure courante */
	public void afficher() {
		Date date = new Date();
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(date);	
		System.out.println("TIME: " + calendar.getTime());
	}
	
	/** affiche le nombre de secondes depuis la création de l’objet */
	public void duree() {
		Date date = new Date();
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(date);	
		long nbSeconde = (calendar.getTimeInMillis()- this.getTimeInMillis()) / 1000;
		System.out.println("nbSeconde " + nbSeconde);
		
		
	}

}

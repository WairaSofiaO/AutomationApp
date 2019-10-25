package com.accenture.automatizacion.questions;

import com.accenture.automatizacion.userinterfaces.TrivagoHomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ObtainedResult implements Question<Boolean> {
	

	@Override
	public Boolean answeredBy(Actor actor) {
		
		String hotelName = Text.of(TrivagoHomePage.HOTEL_NAME).viewedBy(actor).asString();
		String hotelPrice = Text.of(TrivagoHomePage.HOTEL_PRICE).viewedBy(actor).asString();
		String hotelPunctuation = Text.of(TrivagoHomePage.HOTEL_PUNCTUATION).viewedBy(actor).asString();
		
		System.out.println("The Cheapest Room Information \n"
					+"Nombre: "+hotelName+"\n"
					+"Precio: "+hotelPrice+"\n"
					);
		//System.out.println(hotelPunctuation);
		 
		if (hotelPunctuation.equals("/")) {
			System.out.println("Puntuacion no disponible: "+0);
			//float hotelPunctuationFloat = Float.parseFloat(hotelPunctuation);
		}else {
			float hotelPunctuationFloat = Float.parseFloat(hotelPunctuation);
			if(hotelPunctuationFloat>=7.5) {
				System.out.println("Puntuación: Buena "
						+ hotelPunctuationFloat);
				//return true;
			} else if(hotelPunctuationFloat>=8.0){
				System.out.println("Puntuación: Muy Buena " 
						+ hotelPunctuationFloat);
				//return true;
			} else if (hotelPunctuationFloat>=8.5) {
				System.out.println("Puntuación: Excelente "
						 + hotelPunctuationFloat);
				//return true;
			} else {
				//return false;
				System.out.println("La puntuación es menor que 7.5 o buena");
				return false;
			}
			
		}
		return true;
		
	}

	public static ObtainedResult successfully() {
		// TODO Auto-generated method stub
		return new ObtainedResult();
	}

}

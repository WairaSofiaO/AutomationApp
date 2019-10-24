package com.accenture.automatizacion.questions;

import com.accenture.automatizacion.userinterfaces.TrivagoHomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ObtainedResult implements Question<Boolean>{
	
	public static Question<Boolean> equals() {
		return new ObtainedResult();
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		
		//String hotelName = Text.of(TrivagoHomePage.HOTEL_NAME).viewedBy(actor).asString();
		String hotelPrice = Text.of(TrivagoHomePage.HOTEL_PRICE).viewedBy(actor).asString();
		//Double hotelPunctuation = Text.of(TrivagoHomePage.HOTEL_PRICE).viewedBy(actor).asDouble();
		//String hotelPunctuation = Text.of(TrivagoHomePage.HOTEL_PUNCTUATION).viewedBy(actor).as
		
		System.out.println(hotelPrice);
		
		/*
		System.out.println(
				"The Cheapest Room Information \n"
				+"Name: "+hotelName+"\n"
				+"Price: "+hotelPrice+"\n"
				+"Punctuation: "+hotelPunctuation+"\n"
		);
		*/
		
		
		//hotelPunctuation.equals(7.5);
		/*
		if(hotelPunctuation>=7.5) {
			System.out.println("Puntuación Buena");	
			
		} else if(hotelPunctuation>=8.0){
			System.out.println("Puntuación Muy Buena");
		} else if (hotelPunctuation>=8.5) {
			System.out.println("Puntuación Excelente");
		} else {
			//Exception
		}
		*/
		//return hotelPunctuation.equals(7.5);
		return true;
		
		
	}

	public static ObtainedResult at() {
		// TODO Auto-generated method stub
		return new ObtainedResult();
	}//Tipo de dato a devolver

}

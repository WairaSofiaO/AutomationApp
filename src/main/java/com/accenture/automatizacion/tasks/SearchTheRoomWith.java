package com.accenture.automatizacion.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.accenture.automatizacion.userinterfaces.TrivagoHomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SearchTheRoomWith implements Task {
		
	public SearchTheRoomWith() {
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		TrivagoHomePage.MORE_FILTERS.resolveFor(actor).click();
		actor.wasAbleTo(
				Click.on(TrivagoHomePage.ROOM_AMENITIES),
				Click.on(TrivagoHomePage.SATELLITAL_TV),
				Click.on(TrivagoHomePage.READY)
				);
		
		//TrivagoHomePage.PUNCTUATION_FILTER.resolveFor(actor).click();
		//actor.wasAbleTo(Click.on(TrivagoHomePage.PUNCTUATION_GOOD));		
	}

	public static SearchTheRoomWith SatellitTv() {
		return instrumented(SearchTheRoomWith.class);
	}
/*
	public static SearchTheRoomWith GoodOrMorePunctuation() {
		return instrumented(SearchTheRoomWith.class);
	}
*/

}

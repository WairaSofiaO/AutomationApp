package com.accenture.automatizacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import org.openqa.selenium.Keys;

import com.accenture.automatizacion.questions.ObtainedResult;
import com.accenture.automatizacion.userinterfaces.TrivagoHomePage;

public class SearchAHotel implements Task {
	private String city;
	
	public SearchAHotel(String city) {
		this.city = city;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.wasAbleTo(
				Click.on(TrivagoHomePage.CITY),
				Enter.theValue(city).into(TrivagoHomePage.CITY).thenHit(Keys.ENTER),
				Click.on(TrivagoHomePage.DATE_OF_CHECK_IN),
				Click.on(TrivagoHomePage.DATE_OF_CHECK_OUT)
				);
		TrivagoHomePage.DOUBLE_ROOM.resolveFor(actor).click();
		
		/*
		TrivagoHomePage.MORE_FILTERS.resolveFor(actor).click();
		
		actor.wasAbleTo(
				Click.on(TrivagoHomePage.ROOM_AMENITIES),
				Click.on(TrivagoHomePage.SATELLITAL_TV),
				Click.on(TrivagoHomePage.READY),
				Click.on(TrivagoHomePage.ORDER_BY),
				Click.on(TrivagoHomePage.JUST_PRICE)
				
				);
		*/
		
		/*
		actor.wasAbleTo(
				Click.on(TrivagoHomePage.CHECK_IN),
				Click.on(TrivagoHomePage.DATE_OF_CHECK_IN)
				);
		
		//TrivagoHomePage.DATE_OF_CHECK_IN.resolveFor(actor);
		//TrivagoHomePage.DATE_OF_CHECK_IN.resolveFor(actor);
			
		boolean b1= driver.findElement(By.id("Check_In")).isDisplayed();
		System.out.println(b1);
		
		TrivagoHomePage.DATE_OF_CHECK_IN.resolveFor(actor);
		//WaitUntil.the(TrivagoHomePage.DATE_OF_CHECK_IN, IsVisible());
				//Click.on(TrivagoHomePage.DATE_OF_CHECK_IN)
		*/		
				
	}

	public static SearchAHotel at(String city) {
		// TODO Auto-generated method stub
		return instrumented(SearchAHotel.class, city);
	}

}

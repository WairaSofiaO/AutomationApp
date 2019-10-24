package com.accenture.automatizacion.tasks;

import net.serenitybdd.screenplay.Actor;
//import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.accenture.automatizacion.userinterfaces.TrivagoHomePage;

import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.pages.PageObject;

public class OpenTheBrowser implements Task {
	
	
	PageObject trivagoHomePage;
	
	public OpenTheBrowser(PageObject trivagoHomePage) {
		this.trivagoHomePage = trivagoHomePage;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		
		actor.wasAbleTo(Open.browserOn(trivagoHomePage));
		
	}
	//Este metodo instancia la clase en el stepdefinition
	//este es un performable, y se substituye por el OpenTheBrowser que tambien
	//es un performable
	public static OpenTheBrowser on (TrivagoHomePage trivagoHomePage) {
		return Tasks.instrumented(OpenTheBrowser.class, trivagoHomePage);
	}

}

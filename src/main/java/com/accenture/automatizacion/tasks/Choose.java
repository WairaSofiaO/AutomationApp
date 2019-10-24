package com.accenture.automatizacion.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.accenture.automatizacion.questions.ObtainedResult;
import com.accenture.automatizacion.userinterfaces.TrivagoHomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Choose implements Task {
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(TrivagoHomePage.ORDER_BY),
				Click.on(TrivagoHomePage.JUST_PRICE)
				);
		actor.asksFor(ObtainedResult.at());//Imprimo valores
	}
	 
	public static Choose TheCheapestRoom() {
		return instrumented(Choose.class);
	}


}

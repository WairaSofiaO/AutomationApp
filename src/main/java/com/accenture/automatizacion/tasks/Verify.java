package com.accenture.automatizacion.tasks;

import com.accenture.automatizacion.questions.ObtainedResult;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Consequence;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Verify implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		//Question: Imprimo y comparo valores
		//actor.asksFor(ObtainedResult.successfully());
		
	}

	public static Verify Punctuation() {
		return instrumented(Verify.class);
	}

}

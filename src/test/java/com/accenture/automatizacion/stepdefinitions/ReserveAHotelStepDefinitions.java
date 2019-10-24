package com.accenture.automatizacion.stepdefinitions;

import java.nio.channels.SeekableByteChannel;

import org.openqa.selenium.WebDriver;

import com.accenture.automatizacion.tasks.SearchTheRoomWith;
import com.accenture.automatizacion.tasks.Verify;
import com.accenture.automatizacion.tasks.OpenTheBrowser;
import com.accenture.automatizacion.tasks.SearchAHotel;
import com.accenture.automatizacion.questions.ObtainedResult;
import com.accenture.automatizacion.tasks.Choose;
import com.accenture.automatizacion.userinterfaces.TrivagoHomePage;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ReserveAHotelStepDefinitions {
	
	//Instanciar Interfaces
	private TrivagoHomePage trivagoHomePage;
	//Instanciar Actor
	private Actor Sofia = Actor.named("Sofia");
	//Instanciar el WebDriver
	@Managed(driver = "chrome") 
	public WebDriver driver;
		
	
	@Before
	public void setUp() {
		Sofia.can(BrowseTheWeb.with(driver));
	}
	
	//Snippets		
	@Given("^the actor looks for (.*) and the date on which her wants to stay$")
	public void the_actor_looks_for_Medellin_and_the_date_on_which_her_wants_to_stay(String city) {
	    Sofia.wasAbleTo(
	    		OpenTheBrowser.on(trivagoHomePage),
	    		SearchAHotel.at(city)
	    		);   
	}

	@Given("^the actor wants her room with amenities and a higher score range of Good$")
	public void theActorWantsHerRoomWithAmenitiesAndAHigherScoreRangeOfGood() {
		Sofia.wasAbleTo(
				SearchTheRoomWith.SatellitTv()
				//SearchTheRoomWith.GoodOrMorePunctuation()
				);
	}
	
	@When("^the actor wants to choose the cheapest room$")
	public void theActorWantsToChooseTheCheapestRoom(){
	    Sofia.attemptsTo(Choose.TheCheapestRoom());
	    
	}

	@Then("^To verify the condition of the hotel: excellent, very good or good$")
	public void toVerifyTheConditionOfTheHotelExcellentVeryGoodOrGood(){
	   // Sofia.should(Seet);(Verify.Punctuation());
		//Sofia.should(seeThat(ObtainedResult.at()));
	    
	}

}

package com.accenture.automatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.trivago.com.co")
public class TrivagoHomePage extends PageObject {
	public static final Target CITY = Target.the("City").locatedBy("//*[@id=\"querytext\"]");
	public static final Target CITY_SEARCH = Target.the("City_Search").locatedBy("//*[@id='suggestion-65524/200']");
	public static final Target CHECK_IN = Target.the("Check_In").locatedBy("//*[@key='checkInButton']");
	//public static final Target DATE_OF_CHECK_IN = Target.the("Date_Of_Check_In").locatedBy("//*[@datetime='2019-11-25']/span[contains(text(),'25')]");
	
	public static final Target DATE_OF_CHECK_IN = Target.the("Date_Of_Check_In").locatedBy("//*[@datetime='2019-11-25'][1]");
	public static final Target CHECK_OUT = Target.the("Check_Out").locatedBy("//*[@id='suggestion-65524/200']");
	public static final Target DATE_OF_CHECK_OUT = Target.the("Date_Of_Check_Out").locatedBy("//*[@datetime='2019-11-27'][1]");
	public static final Target SEARCH_HOTEL = Target.the("Search_Hotel").locatedBy("//*[@data-qa='search-button']");
	public static final Target DOUBLE_ROOM = Target.the("Double_Room").locatedBy("//*[@class='roomtype-btn__wrap']/span[contains(text(),'Doble')]");
	public static final Target PUNCTUATION_FILTER = Target.the("Punctuation_Filter").locatedBy("//*[@data-qa='rating-filter']/button[@type='button']");
	public static final Target PUNCTUATION_GOOD = Target.the("Punctuation_Good").locatedBy("//*[@id=\"page_wrapper\"]/section[1]/div/div/ul/li[3]/button");
	public static final Target MORE_FILTERS = Target.the("More_Filters").locatedBy("//*[@title='Elegir'][1]");
	public static final Target ROOM_AMENITIES = Target.the("Room_Amenities").locatedBy("//*[contains(text(),'Comodidades en habitación')][1]");
	public static final Target SATELLITAL_TV = Target.the("Satellital_Tv").locatedBy("//*[@for='92/300-8']");
	public static final Target READY = Target.the("Ready").locatedBy("//*[@type='button' and text()='Listo']");
	public static final Target ORDER_BY = Target.the("Order_Bt").locatedBy("//*[@id='mf-select-sortby']");
	public static final Target JUST_PRICE = Target.the("Just_Price").locatedBy("//*[@id='mf-select-sortby']/option[@value='2']");
	public static final Target HOTEL_PRICE = Target.the("Hotel_Price").locatedBy("//div/strong[@class='item__best-price price_min item__best-price--perstay' and @data-log-id='1'][1]");
	public static final Target HOTEL_NAME = Target.the("Hotel_Name").locatedBy("//*[@itemprop='name'][1]");
	public static final Target HOTEL_PUNCTUATION = Target.the("Hotel_Punctuation").locatedBy("//*[@class='item-components__pillValue--8c9e4 item-components__value-sm--e53d7 item-components__pillValue--8c9e4'][1]");
	//public static final Target HOTEL_PUNCTUATION = Target.the("Hotel_Punctuation").locatedBy("//*[@class='details-paragraph details-paragraph--rating']/em[1]");
	////*[@class="item-components__pillValue--8c9e4 item-components__value-sm--e53d7 item-components__pillValue--8c9e4"][1]
	//public static final Target HOTEL_NAME = Target.the("Hotel_Name").locatedBy("//*[@itemprop='name'][1]");
	
	
	
	
	//*[@itemprop='name'][1]
	
	
	
	//public static final Target READY = Target.the("Ready").locatedBy("//*[@type='button' and text()='Listo']");
	//*[@id="mf-select-sortby" ]
	//*[@id="92/300-8"]
	//*[@data-qa="rating-filter"]/button[@title='Todo']
	//*[contains(text(),'Comodidades en habitación')][1]
	
	//*[@class="roomtype-btn__wrap"]/span[contains(text(),'Individual')]
	//public By CHECK_IN = Target.the("Check_In_Button").locatedBy("//*[@key='checkInButton']");
	
}

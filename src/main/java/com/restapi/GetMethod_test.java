package com.restapi;


import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import files.PayLoad;

public class GetMethod_test {


	// given - when all the inputs are given 
	//when - submit the method, -resource , api method
	//then - validate the response


	/***
	 * First, open the url in your browser(steps may vary depends on the browser),
	 *  then click on the lock icon on the navigation bar, then click on Certificate Information. 
	 *  Now go to Details tab, there you will see a Copy to File button. 
	 *  Clicking on this will give you a certificate export wizard where you need to select certificate format
	 *   as DER encoded binary X.509. Give a file name say mycertificate.cer and save the file.
	 * 
	 * command to impot the certificate
	 * keytool -importcert -alias reqres -file C:\Users\PRAAMBI\Desktop\reqres.cer -keystore cacerts –storepass changeit
	 * @param args
	 * C:\Users\PRAAMBI\Desktop\APKs\reqres2.cer
	 */

	public static void main(String[] args) {

		RestAssured.baseURI= "https://reqres.in/";
		String response = 	given().log().all().header("Content-Type","application/json")
				.body(PayLoad.addEmployee())
				.when().post("api/users")
				.then().log().all().assertThat().statusCode(200).header("charset", "UTF-8").extract().response().asString();




		System.out.println(response);

		JsonPath json = new JsonPath(response);  // parsing the String response to Json
		String job = json.getString("job");

		System.out.println(job);



	}

}

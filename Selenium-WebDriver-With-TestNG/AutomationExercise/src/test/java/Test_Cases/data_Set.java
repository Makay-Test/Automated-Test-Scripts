package Test_Cases;

import org.testng.annotations.DataProvider;

public class data_Set {
	
	@DataProvider (name = "activeAccounts")
	public static Object[][] dataSet1() {
		
		return new Object [][] {
			{"Testname1","Tesname2","Testname3"},
			{"Testpass1","Testpass2","Testpass3"},
			{"test123@yopmail.com","test125@yopmail.com","test124@yopmail.com"}
		};
	}
}

//String allProducts [] = {
//		"//div[@class='productinfo text-center']//child::p[text()='Blue Top']",
//		"//div[@class='productinfo text-center']//child::p[text()='Men Tshirt']",
//		"//div[@class='productinfo text-center']//child::p[text()='Sleeveless Dress']",
//		"//div[@class='productinfo text-center']//child::p[text()='Stylish Dress']",
//		"//div[@class='productinfo text-center']//child::p[text()='Winter Top']",
//		"//div[@class='productinfo text-center']//child::p[text()='Summer White Top']",
//		"//div[@class='productinfo text-center']//child::p[text()='Madame Top For Women']",
//		"//div[@class='productinfo text-center']//child::p[text()='Fancy Green Top']",
//		"//div[@class='productinfo text-center']//child::p[text()='Sleeves Printed Top - White']",
//		"//div[@class='productinfo text-center']//child::p[text()='Half Sleeves Top Schiffli Detailing - Pink']",
//		"//div[@class='productinfo text-center']//child::p[text()='Frozen Tops For Kids']",
//		"//div[@class='productinfo text-center']//child::p[text()='Full Sleeves Top Cherry - Pink']",
//		"//div[@class='productinfo text-center']//child::p[text()='Printed Off Shoulder Top - White']",
//		"//div[@class='productinfo text-center']//child::p[text()='Sleeves Top and Short - Blue & Pink']",
//		"//div[@class='productinfo text-center']//child::p[text()='Blue Cotton Indie Mickey Dress']",
//		"//div[@class='productinfo text-center']//child::p[text()='Long Maxi Tulle Fancy Dress Up Outfits -Pink']",
//		"//div[@class='productinfo text-center']//child::p[text()='Sleeveless Unicorn Print Fit & Flare Net Dress - Multi']",
//		"//div[@class='productinfo text-center']//child::p[text()='Colour Blocked Shirt – Sky Blue']",
//		"//div[@class='productinfo text-center']//child::p[text()='Pure Cotton V-Neck T-Shirt']",
//		"//div[@class='productinfo text-center']//child::p[text()='Green Side Placket Detail T-Shirt']",
//		"//div[@class='productinfo text-center']//child::p[text()='Premium Polo T-Shirts']",
//		"//div[@class='productinfo text-center']//child::p[text()='Pure Cotton Neon Green Tshirt']",
//		"//div[@class='productinfo text-center']//child::p[text()='Soft Stretch Jeans']",
//		"//div[@class='productinfo text-center']//child::p[text()='Regular Fit Straight Jeans']",
//		"//div[@class='productinfo text-center']//child::p[text()='Grunt Blue Slim Fit Jeans']",
//		"//div[@class='productinfo text-center']//child::p[text()='Rose Pink Embroidered Maxi Dress']",
//		"//div[@class='productinfo text-center']//child::p[text()='Cotton Silk Hand Block Print Saree']",
//		"//div[@class='productinfo text-center']//child::p[text()='Rust Red Linen Saree']",
//		"//div[@class='productinfo text-center']//child::p[text()='Beautiful Peacock Blue Cotton Linen Saree']",
//		"//div[@class='productinfo text-center']//child::p[text()='Lace Top For Women']",
//		"//div[@class='productinfo text-center']//child::p[text()='GRAPHIC DESIGN MEN T SHIRT - BLUE']"};
package fourSquare;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fi.foyt.foursquare.api.FoursquareApi;
import fi.foyt.foursquare.api.FoursquareApiException;
import fi.foyt.foursquare.api.entities.Category;
import fi.foyt.foursquare.api.entities.CompactVenue;
import fi.foyt.foursquare.api.entities.VenuesSearchResult;


public class CategoryRetrievalUtility {
		private final Map<String,List<String>> CATEGORY;
		
		public CategoryRetrievalUtility(){
			
			this.CATEGORY = new HashMap<String,List<String>>();
			
			List<String> subCategory1=new ArrayList<String>();
			List<String> subCategory2=new ArrayList<String>();
			List<String> subCategory3=new ArrayList<String>();
			List<String> subCategory4=new ArrayList<String>();
			List<String> subCategory5=new ArrayList<String>();
			List<String> subCategory6=new ArrayList<String>();
			List<String> subCategory7=new ArrayList<String>();
			List<String> subCategory8=new ArrayList<String>();
			List<String> subCategory9=new ArrayList<String>();
			
	
			subCategory1.add("Aquarium");
			subCategory1.add("Arcade");
			subCategory1.add("Art Gallery");
			subCategory1.add("Bowling Alley");
			subCategory1.add("Casino");
			subCategory1.add("Comedy Club");
			subCategory1.add("Concert Hall");
			subCategory1.add("General Entertainment");
			subCategory1.add("Historic Site");
			subCategory1.add("Movie Theater");
			subCategory1.add("Indie Movie Theater");
			subCategory1.add("Multiplex");
			subCategory1.add("Museum");
			subCategory1.add("Art Museum");
			subCategory1.add("History Museum");
			subCategory1.add("Planetarium");
			subCategory1.add("Science Museum");
			subCategory1.add("Music Venue");
			subCategory1.add("Jazz Club");
			subCategory1.add("Piano Bar");
			subCategory1.add("Rock Club");
			subCategory1.add("Performing Arts Venue");
			subCategory1.add("Dance Studio");
			subCategory1.add("Indie Theater");
			subCategory1.add("Opera House");
			subCategory1.add("Theater");
			subCategory1.add("Pool Hall");
			subCategory1.add("Racetrack");
			subCategory1.add("Stadium");
			subCategory1.add("Baseball Stadium");
			subCategory1.add("Basketball Stadium");
			subCategory1.add("Cricket Ground");
			subCategory1.add("Football Stadium");
			subCategory1.add("Hockey Arena");
			subCategory1.add("Soccer Stadium");
			subCategory1.add("Tennis");
			CATEGORY.put("Arts & Entertainment", subCategory1);
			
			
			subCategory2.add("College Academic Building");
			subCategory2.add("College Arts Building");
			subCategory2.add("College Communications Building");
			subCategory2.add("College Engineering Building");
			subCategory2.add("College History Building");
			subCategory2.add("College Math Building");
			subCategory2.add("College Science Building");
			subCategory2.add("College Technology Building");
			subCategory2.add("College Administrative Building");
			subCategory2.add("College Auditorium");
			subCategory2.add("College Bookstore");
			subCategory2.add("College Cafeteria");
			subCategory2.add("College Classroom");
			subCategory2.add("College Gym");
			subCategory2.add("College Lab");
			subCategory2.add("College Library");
			subCategory2.add("College Quad");
			subCategory2.add("College Rec Center");
			subCategory2.add("College Residence Hall");
			subCategory2.add("College Stadium");
			subCategory2.add("College Baseball Diamond");
			subCategory2.add("College Basketball Court");
			subCategory2.add("College Cricket Pitch");
			subCategory2.add("College Football Field");
			subCategory2.add("College Hockey Rink");
			subCategory2.add("College Soccer Field");
			subCategory2.add("College Tennis Court");
			subCategory2.add("College Track");
			subCategory2.add("College Theater");
			subCategory2.add("Community College");
			subCategory2.add("Fraternity House");
			subCategory2.add("General College & University");
			subCategory2.add("Law School");
			subCategory2.add("Medical School");
			subCategory2.add("Sorority House");
			subCategory2.add("Student Center");
			subCategory2.add("Trade School");
			subCategory2.add("University");			
			CATEGORY.put("College & University", subCategory2);
			
			
			subCategory3.add("Afghan Restaurants");
			subCategory3.add("African Restaurant");
			subCategory3.add("American Restaurant");
			subCategory3.add("Arepa Restaurant");
			subCategory3.add("Argentinian Restaurant");
			subCategory3.add("Asian Restaurant");
			subCategory3.add("Australian Restaurant");
			subCategory3.add("BBQ Joint");
			subCategory3.add("Bagel Shop");
			subCategory3.add("Bakery");
			subCategory3.add("Brazilian Restaurant");
			subCategory3.add("Breakfast Spot");
			subCategory3.add("Burger Joint");
			subCategory3.add("Burrito Place");
			subCategory3.add("Caf?");
			subCategory3.add("Cajun / Creole Restaurants");
			subCategory3.add("Caribbean Restaurant");
			subCategory3.add("Chinese Restaurant");
			subCategory3.add("Coffee Shop");
			subCategory3.add("Cuban Restaurant");
			subCategory3.add("Cupcake Shop");
			subCategory3.add("Delis / Bodegas");
			subCategory3.add("Dessert Shop");
			subCategory3.add("Dim Sum Restaurant");
			subCategory3.add("Diner");
			subCategory3.add("Distillery");
			subCategory3.add("Donut Shop");
			subCategory3.add("Dumpling Restaurant");
			subCategory3.add("Eastern European Restaurant");
			subCategory3.add("Ethiopian Restaurant");
			subCategory3.add("Falafel Restaurant");
			subCategory3.add("Fast Food Restaurant");
			subCategory3.add("Filipino Restaurant");
			subCategory3.add("Fish & Chips Shop");
			subCategory3.add("Food Truck");
			subCategory3.add("French Restaurant");
			subCategory3.add("Fried Chicken Joint");
			subCategory3.add("Gastropub");
			subCategory3.add("German Restaurant");
			subCategory3.add("Gluten-free Restaurant");
			subCategory3.add("Greek Restaurant");
			subCategory3.add("Hot Dog Joint");
			subCategory3.add("Ice Cream Shop");
			subCategory3.add("Indian Restaurant");
			subCategory3.add("Indonesian Restaurant");
			subCategory3.add("Italian Restaurant");
			subCategory3.add("Japanese Restaurant");
			subCategory3.add("Juice Bar");
			subCategory3.add("Korean Restaurant");
			subCategory3.add("Latin American Restaurant");
			subCategory3.add("Mac & Cheese Joint");
			subCategory3.add("Malaysian Restaurant");
			subCategory3.add("Mediterranean Restaurant");
			subCategory3.add("Mexican Restaurant");
			subCategory3.add("Middle Eastern Restaurant");
			subCategory3.add("Molecular Gastronomy Restaurant");
			subCategory3.add("Mongolian Restaurant");
			subCategory3.add("Moroccan Restaurant");
			subCategory3.add("New American Restaurant");
			subCategory3.add("Peruvian Restaurant");
			subCategory3.add("Pizza Place");
			subCategory3.add("Portuguese Restaurant");
			subCategory3.add("Ramen / Noodle House");
			subCategory3.add("Restaurant");
			subCategory3.add("Salad Place");
			subCategory3.add("Sandwich Place");
			subCategory3.add("Scandinavian Restaurant");
			subCategory3.add("Seafood Restaurant");
			subCategory3.add("Snack Place");
			subCategory3.add("Soup Place");
			subCategory3.add("South American Restaurant");
			subCategory3.add("Southern / Soul Food Restaurant");
			subCategory3.add("Spanish Restaurant");
			subCategory3.add("Paella Restaurant");
			subCategory3.add("Steakhouse");
			subCategory3.add("Sushi Restaurant");
			subCategory3.add("Taco Place");
			subCategory3.add("Tapas Restaurant");
			subCategory3.add("Swiss Restaurant");
			subCategory3.add("Tea Room");
			subCategory3.add("Thai Restaurant");
			subCategory3.add("Turkish Restaurant");
			subCategory3.add("Vegetarian / Vegan Restaurant");
			subCategory3.add("Vietnamese Restaurant");
			subCategory3.add("Winery");
			subCategory3.add("Wings Joint");
			
			CATEGORY.put("Food", subCategory3);
			
			subCategory4.add("Animal Shelter");
			subCategory4.add("Auditorium");
			subCategory4.add("Building");
			subCategory4.add("Convention Center");
			subCategory4.add("Meeting Room");
			subCategory4.add("Event Space");
			subCategory4.add("Factory");
			subCategory4.add("Fair");
			subCategory4.add("Funeral Home");
			subCategory4.add("Government Building");
			subCategory4.add("Capitol Building");
			subCategory4.add("City Hall");
			subCategory4.add("Courthouse");
			subCategory4.add("Fire Station");
			subCategory4.add("Monument / Landmark");
			subCategory4.add("Police Station");
			subCategory4.add("Library");
			subCategory4.add("Medical Center");
			subCategory4.add("Dentist's Office");
			subCategory4.add("Doctor's Office");
			subCategory4.add("Emergency Room");
			subCategory4.add("Hospital");
			subCategory4.add("Laboratory");
			subCategory4.add("Optical Shop");
			subCategory4.add("Veterinarian");
			subCategory4.add("Military Base");
			subCategory4.add("Non-Profits");
			subCategory4.add("Office");
			subCategory4.add("Cafeteria");
			subCategory4.add("Campaign Offices");
			subCategory4.add("Conference Room");
			subCategory4.add("Coworking Space");
			subCategory4.add("Tech Startup");
			subCategory4.add("Parking");
			subCategory4.add("Post Office");
			subCategory4.add("Radio Stations");
			subCategory4.add("School");
			subCategory4.add("Elementary School");
			subCategory4.add("High School");
			subCategory4.add("Middle School");
			subCategory4.add("Music School");
			subCategory4.add("Nursery School");
			subCategory4.add("Spiritual Centers");
			subCategory4.add("Church");
			subCategory4.add("Mosque");
			subCategory4.add("Shrine");
			subCategory4.add("Synagogue");
			subCategory4.add("Temple");
			
			CATEGORY.put("Professional & Other Places", subCategory4);
			
			subCategory5.add("Bar");
			subCategory5.add("Beer Garden");
			subCategory5.add("Cocktail Bar");
			subCategory5.add("Dive Bar");
			subCategory5.add("Gay Bar");
			subCategory5.add("Hookah Bar");
			subCategory5.add("Hotel Bar");
			subCategory5.add("Karaoke Bar");
			subCategory5.add("Lounge");
			subCategory5.add("Nightclub");
			subCategory5.add("Other Nightlife");
			subCategory5.add("Pub");
			subCategory5.add("Sake Bar");
			subCategory5.add("Speakeasy");
			subCategory5.add("Sports Bar");
			subCategory5.add("Strip Club");
			subCategory5.add("Whisky Bar");
			subCategory5.add("Wine Bar");
			
			CATEGORY.put("Nightlife Spot", subCategory5);
			
			subCategory6.add("Athletics & Sports");
			subCategory6.add("Beach");
			subCategory6.add("Bridge");
			subCategory6.add("Campground");
			subCategory6.add("Cemetery");
			subCategory6.add("Dog Run");
			subCategory6.add("Farm");
			subCategory6.add("Field");
			subCategory6.add("Garden");
			subCategory6.add("Harbor / Marina");
			subCategory6.add("Hiking Trail");
			subCategory6.add("Hot Spring");
			subCategory6.add("Lake");
			subCategory6.add("Lighthouse");
			subCategory6.add("Mountain");
			subCategory6.add("Neighborhood");
			subCategory6.add("Other Great Outdoors");
			subCategory6.add("Park");
			subCategory6.add("Playground");
			subCategory6.add("Plaza");
			subCategory6.add("Pool");
			subCategory6.add("River");
			subCategory6.add("Rock Climbing Spots");
			subCategory6.add("Scenic Lookout");
			subCategory6.add("Sculpture Garden");
			subCategory6.add("Stable");
			subCategory6.add("Vineyard");
			subCategory6.add("Plane");
			subCategory6.add("Volcanos");
			subCategory6.add("Well");
			subCategory6.add("Apres Ski Bar");
			subCategory6.add("Ski Chairlift");
			subCategory6.add("Ski Chalet");
			subCategory6.add("Ski Lodge");
			subCategory6.add("Ski Trail");
			subCategory6.add("Baseball Field");
			subCategory6.add("Basketball Court");
			subCategory6.add("Golf Course");
			subCategory6.add("Hockey Field");
			subCategory6.add("Paintball Fields");
			subCategory6.add("Skate Park");
			subCategory6.add("Skating Rink");
			subCategory6.add("Tennis Court");
			subCategory6.add("Volleyball Court");
			
			CATEGORY.put("Parks & Outdoors", subCategory6);
			
			subCategory7.add("Antique Shop");
			subCategory7.add("Arts & Crafts Store");
			subCategory7.add("Automotive Shop");
			subCategory7.add("Bank");
			subCategory7.add("Bike Shop");
			subCategory7.add("Board Shop");
			subCategory7.add("Bookstore");
			subCategory7.add("Bridal Shop");
			subCategory7.add("Bagel Shop");
			subCategory7.add("Candy Store");
			subCategory7.add("Car Dealership");
			subCategory7.add("Car Wash");
			subCategory7.add("Clothing Store");
			subCategory7.add("Boutique");
			subCategory7.add("Kids Store");
			subCategory7.add("Lingerie Store");
			subCategory7.add("Men's Store");
			subCategory7.add("Shoe Store");
			subCategory7.add("Women's Store");
			subCategory7.add("Convenience Store");
			subCategory7.add("Cosmetics Shop");
			subCategory7.add("Credit Unions");
			subCategory7.add("Daycare");
			subCategory7.add("Department Store");
			subCategory7.add("Design Studio");
			subCategory7.add("Drugstore / Pharmacy");
			subCategory7.add("EV Charging Stations");
			subCategory7.add("Electronics Store");
			subCategory7.add("Financial or Legal Services");
			subCategory7.add("Flea Market");
			subCategory7.add("Flower Shop");
			subCategory7.add("Food & Drink Shop");
			subCategory7.add("Brewery");
			subCategory7.add("Butcher");
			subCategory7.add("Cheese Shop");
			subCategory7.add("Farmers Market");
			subCategory7.add("Fish Market");
			subCategory7.add("Food Court");
			subCategory7.add("Gourmet Shop");
			subCategory7.add("Grocery Store");
			subCategory7.add("Liquor Store");
			subCategory7.add("Wine Shop");
			subCategory7.add("Furniture / Home Store");
			subCategory7.add("Gaming Cafe");
			subCategory7.add("Garden Center");
			subCategory7.add("Gas Station / Garage");
			subCategory7.add("Gift Shop");
			subCategory7.add("Gym / Fitness Center");
			subCategory7.add("Climbing Gyms");
			subCategory7.add("Gym Pool");
			subCategory7.add("Gym");
			subCategory7.add("Martial Arts Dojo");
			subCategory7.add("Track");
			subCategory7.add("Yoga Studio");
			subCategory7.add("Hardware Store");
			subCategory7.add("Hobby Shop");
			subCategory7.add("Internet Cafe");
			subCategory7.add("Jewelry Store");
			subCategory7.add("Laundry Service");
			subCategory7.add("Mall");
			subCategory7.add("Miscellaneous Shop");
			subCategory7.add("Mobile Phone Shop");
			subCategory7.add("Motorcycle Shops");
			subCategory7.add("Music Store");
			subCategory7.add("Nail Salon");
			subCategory7.add("Newsstand");
			subCategory7.add("Paper / Office Supplies Store");
			subCategory7.add("Pet Services");
			subCategory7.add("Pet Store");
			subCategory7.add("Photography Lab");
			subCategory7.add("Real Estate Offices");
			subCategory7.add("Record Shop");
			subCategory7.add("Recycling Facility");
			subCategory7.add("Salon / Barbershop");
			subCategory7.add("Smoke Shop");
			subCategory7.add("Spas / Massages");
			subCategory7.add("Sporting Goods Shop");
			subCategory7.add("Storage Facility");
			subCategory7.add("Tailor Shops");
			subCategory7.add("Tanning Salon");
			subCategory7.add("Tattoo Parlor");
			subCategory7.add("Thrift / Vintage Store");
			subCategory7.add("Toy / Game Store");
			subCategory7.add("Travel Agency");
			subCategory7.add("Video Game Store");
			subCategory7.add("Video Store");
			
			CATEGORY.put("Shops & Service", subCategory7);
			
			subCategory8.add("Airport");
			subCategory8.add("Bike Rental / Bike Share");
			subCategory8.add("Bus Station");
			subCategory8.add("Embassies / Consulates");
			subCategory8.add("Ferry");
			subCategory8.add("General Travel");
			subCategory8.add("Hotel");
			subCategory8.add("Light Rail");
			subCategory8.add("Moving Target");
			subCategory8.add("Rental Car Location");
			subCategory8.add("Rest Area");
			subCategory8.add("Road");
			subCategory8.add("Subway");
			subCategory8.add("Tourist Information Center");
			subCategory8.add("Train Station");
			subCategory8.add("Travel Lounge");
			subCategory8.add("Platform");
			subCategory8.add("Train");
			subCategory8.add("Roof Deck");
			subCategory8.add("Resort");
			subCategory8.add("Motel");
			subCategory8.add("Hotel Pool");
			subCategory8.add("Hostel");
			subCategory8.add("Boarding House");
			subCategory8.add("Bed & Breakfast");
			subCategory8.add("Airport Food Court");
			subCategory8.add("Boat or Ferry");
			subCategory8.add("Plane");
			subCategory8.add("Airport Terminal");
			subCategory8.add("Travel Lounge");
			subCategory8.add("Hostel");
			subCategory8.add("Airport Gate");
			subCategory8.add("Airport Lounge");
			subCategory8.add("Airport Tram");
			subCategory8.add("Bus Line");
			subCategory8.add("Pier");
			subCategory8.add("Taxi");
			CATEGORY.put("Travel & Transport", subCategory8);
			
			
			subCategory9.add("Assisted Living");
			subCategory9.add("Home (private)");
			subCategory9.add("Housing Development");
			subCategory9.add("Residential Buildings (Apartments / Condos)");
			CATEGORY.put("Residence", subCategory9);
			
			
		}
	
		public String getCategory(String subCategory){
			String category="";
			for(String subCategoryList : CATEGORY.keySet()){
				System.out.println("DENTRO getCategory: "+subCategoryList +" ..... " +subCategory);
				for(String subList : CATEGORY.get(subCategoryList)){
					if(subList.equals(subCategory))
						category=subCategoryList + "......" +subCategory;
				}
			}
			return category;
		}
}

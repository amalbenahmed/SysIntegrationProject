package Integration;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonValue;

public  class FilmReader  {

	public static final String JSON_FILE="C:/Users/Hp/Desktop/Projet Intégration/Film.txt";
	
	public static void main(String[] args) throws IOException {
		
		InputStream fis= new FileInputStream(JSON_FILE);
		
		//creation un objet Json Reader
		JsonReader jsonReader= Json.createReader(fis);
		
		//get object JSON from JSON Reader
		JsonObject jsonObject= jsonReader.readObject();
		//fermer la resource de IO de JSON Reader
		jsonReader.close();
		fis.close();
		//get data from Json Object et creer Film
		Film f= new Film();
		// title
		f.setTitle(jsonObject.getString("Title"));
		// summary
		f.setSummary(jsonObject.getString("Summary"));
		// Year
		f.setYear(jsonObject.getInt("Year"));
		// Director
		JsonObject jsonObjectName = jsonObject.getJsonObject("Name");
		Name dir = new Name();
		dir.setFirst_name(jsonObjectName.getString("First Name"));
		dir.setLast_name(jsonObjectName.getString("Last Name"));
		f.setDirector(dir);

		//actors reading an objet
		JsonArray jsonArray= jsonObject.getJsonArray("actors");
		
	//	int index=0;
		System.out.println(f);

		Name[] act = new Name[jsonArray.size()];
		for(JsonValue value: jsonArray ){

			System.out.print(value.toString());
		}
		f.setActors(act);
		System.out.println(f);
	}

	
	
	
	
	
	
	}
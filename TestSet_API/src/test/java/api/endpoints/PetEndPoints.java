package api.endpoints;



import java.io.File;
import java.util.List;

import api.payloads.Pet;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;





public class PetEndPoints {
	

	
	
	public static Response CreateNewPet(Pet payload)
	
	{
		
		
		Response response=RestAssured.given()
		 .accept(ContentType.JSON)
		 .contentType(ContentType.JSON)
         .body(payload)
         .urlEncodingEnabled(false)
         .relaxedHTTPSValidation()
        
         
         .when()
         .post(BaseRoutes.PostNewPet_url);
		 
		
		return response;          
         
		
	}
	
	
	
	public static Response UploadPetImage(long l)
	{
		
		
		
       File imageFile = new File("C:\\EclipseWorkplace\\TestSet_API\\TestData\\pexels-pixabay-257540.jpg"); // Replace with the actual path to your image file

       Response response =RestAssured.given()
            .pathParam("petId", l)
            .multiPart("file", imageFile, "image/jpeg") // "image/jpeg" is the MIME type, adjust if needed
            .contentType("multipart/form-data") // Explicitly set content type for file uploads
            .when()
            .post(BaseRoutes.PostPetImage_url)  ;
	return response;  
         
		
	}
	
	
	public static Response PutPet(Pet payload)
	{
		Response response=RestAssured.given()
         .contentType(ContentType.JSON)
         .body(payload)
         
         .when()
         .put(BaseRoutes.PutPet_url);
		
		return response;          
         
		
	}
	
	public static Response GetPetByid(long l)
	{
		Response response=RestAssured.given()
         
         .pathParam("petId",l)
         
         .when()
         .get(BaseRoutes.GetPetByid_url);
		
		return response;          
         
		
	}
	
	public static Response GetPetByStatus(String status)
	{
		Response response=RestAssured.given()
         
         .queryParam("status",status)
         
         .when()
         .get(BaseRoutes.GetPetByStatus_url);
		
		return response;          
         
		
	}
	
	public static Response DeletePetByid(int Petid)
	{
		Response response=RestAssured.given()
         
         .pathParam("petId",Petid)
         
         .when()
         .delete(BaseRoutes.DeletePetByid_url);
		
		return response;  
	
	}

}

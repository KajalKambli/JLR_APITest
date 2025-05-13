package api.endpoints;

public class BaseRoutes {
	
	public static String BaseUrl="https://petstore.swagger.io/v2";
	
	public static String PostNewPet_url=BaseUrl+"/pet";	
	public static String PostPetImage_url=BaseUrl+"/pet/{petId}/uploadImage";	
	public static String PutPet_url=BaseUrl+"/pet";	
	public static String GetPetByid_url=BaseUrl+"/pet/{petId}";	
	public static String GetPetByStatus_url=BaseUrl+"/pet/findByStatus";
	public static String DeletePetByid_url=BaseUrl+"/pet/{petId}";	
	
	
	
	

}

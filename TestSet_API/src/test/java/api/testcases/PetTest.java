package api.testcases;


import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;


import api.endpoints.PetEndPoints;
import api.payloads.Pet;
import api.payloads.Pet.Category;
import api.payloads.Pet.Tag;
import io.restassured.response.Response;

public class PetTest {
	
	
	Faker faker;
	
	Pet PetPayload;
	
     Pet.Tag tag;
	
    Pet.Category  category;
	

	@BeforeClass
	public void Generatefakedata()
	
	{
		
		faker=new Faker();
		
		PetPayload =new Pet();
		
		
		
    
		PetPayload.setId(faker.idNumber().hashCode());
		PetPayload.setName(faker.name().name());
		PetPayload.setStatus(faker.name().name());
		PetPayload.setPhotoUrls(Arrays.asList("animal"));
		
		tag=new Tag();
		tag.setId(1);
        tag.setName("Animal");
        PetPayload.setTags(Arrays.asList(tag));
        
        
        
        category =new Category();       
        category.setId(1);
        category.setName("Animal");
        PetPayload.setCategory(category);
       
        System.out.println(PetPayload.toString()+"Kajal");
	}
	
	
	@Test(priority=1)
	public void TestPostNewPet()
	{
		
		Response response=PetEndPoints.CreateNewPet(PetPayload);
		
		
		response.then().log().all();
		
		Assert.assertEquals(response.getStatusCode(), 200);
		
		
		
		
		
		
	}
		
	
	@Test(priority=2)
	public void TestUploadPetImage()
	{
		
		Response response=PetEndPoints.UploadPetImage(this.PetPayload.getId());
		
		response.then().log().all();
		
		Assert.assertEquals(response.getStatusCode(), 200);
		
		
		
		
	}
	
	@Test(priority=3)
	public void TestPutPet() {
		
		Response response=PetEndPoints.PutPet(PetPayload);
		
		response.then().log().all();
		
		Assert.assertEquals(response.getStatusCode(), 200);
		
		
		
		
	}
		
	
	@Test(priority=4)
	public void TestGetPetByid() {
		
		Response response=PetEndPoints.GetPetByid(this.PetPayload.getId());
		
		response.then().log().all();
		
		Assert.assertEquals(response.getStatusCode(), 200);
		
		
		
		
	}
	
	@Test(priority=5)
	public void TestGetPetByStatus() {
		
		Response response=PetEndPoints.GetPetByStatus(this.PetPayload.getStatus());
		
		response.then().log().all();
		
		Assert.assertEquals(response.getStatusCode(), 200);
		
		
		
		
	}
	
//	@Test
//	public void TestDeletePetByid() {
//		
//		Response response=PetEndPoints.DeletePetByid(this.PetPayload.getId());
//		
//		response.then().log().all();
//		
//		Assert.assertEquals(response.getStatusCode(), 200);
		
		
		
		
	//}
		
	
	
		
	
	
	}


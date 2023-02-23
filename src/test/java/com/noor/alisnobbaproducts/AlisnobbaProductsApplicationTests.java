package com.noor.alisnobbaproducts;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.noor.alisnobbaproducts.Model.Products;

// @SpringBootTest
class AlisnobbaProductsApplicationTests {

//Need a pojo with ID (Long), productName(String), shortDescription(String), longDescription(String),

	@Test
	void contextLoads() {
	}
	@Test
	void getAndSetID(){
		Products cut = new Products();
		Long myId = 1L;
		cut.setId(myId);
		assertEquals(myId, cut.getId());
	}

	@Test
	void getAndSetProductName(){
		Products cut = new Products();
		String myProductName = "chocolate pudding";
		cut.setProductName(myProductName);
		assertEquals(myProductName, cut.getProductName());
	}

	@Test
	void getAndSetShortDescription(){
		Products cut = new Products();
		String myShortDescription = "This better be the best pudding you ever ate!";
		cut.setShortDescription(myShortDescription);
		assertEquals(myShortDescription, cut.getShortDescription());
	}

	@Test
	void getAndSetLongDescription(){
		Products cut = new Products();
		String myLongDescription = "Marc Guibert of Lindeth Howe Country House Hotel in England's Lake District has handcrafted each of these delicious desserts especially for Alisnobba’s highly pampered customers, the chocolate pudding — made from high-end chocolate, gold, caviar, and, why not, a two-carat diamond — aims to be the world's most expensive dessert. It's also served in an edible replica of a Faberge egg.";
		cut.setLongDescription(myLongDescription);
		assertEquals(myLongDescription, cut.getLongDescription());
	}

	@Test
	void getAndSetImageLink(){
		Products cut = new Products();
		String myImageLink = "https://raw.githubusercontent.com/jeff-lent/Alisnobba/main/Capstone/GoldenToilet.jpg";
		cut.setImageLink(myImageLink);
		assertEquals(myImageLink, cut.getImageLink());
	}

	@Test
	void getAndSetPrice(){
		Products cut = new Products();
		Long myPrice = 228578528L;
		cut.setPrice(myPrice);
		assertEquals(myPrice, cut.getPrice());
	}
}

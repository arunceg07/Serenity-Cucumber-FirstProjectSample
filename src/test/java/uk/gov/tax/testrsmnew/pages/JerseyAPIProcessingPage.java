package uk.gov.tax.testrsmnew.pages;


import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;
import org.json.JSONException;
import org.json.JSONObject;
import uk.gov.tax.testrsmnew.data.TestLeaf_TestData.Employee;
import uk.gov.tax.testrsmnew.data.TestLeaf_TestData.PetDetails;

import javax.ws.rs.core.MediaType;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.Properties;
import java.util.stream.Stream;


public class JerseyAPIProcessingPage {

    public void regResinGetRequest() {

////        Response Response = RestAssured.get("https://reqres.in/api/users/2");
////        Response Response = RestAssured.get("https://www.google.com/");
//
//        Client client = Client.create();
//        int output;
//        String input="null";
//        String url;
//        File fileName;
//        WebResource webResource = Client.create().resource("https://reqres.in/api/users/2");
////        input = fileToString(fileName);
////        input = input.replaceAll("","");
////        ClientResponse response = webResource.type("application/json").put(ClientResponse.class,input);
//        ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);
//        output= response.getStatus();
//        System.out.println("output"+output);

//        Client client = Client.create();
//        WebResource webResource = client.resource("https://reqres.in/api/users?page=2");
//        client.addFilter(new HTTPBasicAuthFilter("",""));
//        webResource.setProperty("Header","<Header>calculated when request is sent<Host></Host><User-Agent>PostmanRuntime/7.31.1</User-Agent><Accept></Accept>*/*<Accept-Encoding>gzip, deflate, br</Accept-Encoding><Connection>keep-alive</Connection></Header>");
//        webResource.setProperty("Body","");
//        ClientResponse response = webResource.accept("application/json")
//                .get(ClientResponse.class);

//        WebResource resource= Client.create().resource("https://reqres.in/api/users?page=2");
//        ClientResponse response=  resource.type(MediaType.APPLICATION_JSON_TYPE).accept(MediaType.APPLICATION_JSON_TYPE).get(ClientResponse.class);

        Client client = Client.create();

        WebResource webResource = client
                .resource("https://dummy.restapiexample.com/api/v1/employees");

        ClientResponse response = webResource.accept("application/json")
                .get(ClientResponse.class);
        String output = response.getEntity(String.class);
        System.out.println("output"+output);
        response.toString();
        System.out.println("response.toString()"+response.toString());
        System.out.println("response.getStatus()"+response.getStatus());
    }

//    public void regResinBDDGetRequest() {
//        RestAssured.baseURI = "https://reqres.in/api/";
//        ValidatableResponse Response = RestAssured.given().param("","").header("","").when()
//                .get("/users/2").then().statusCode(200);
//    }

    public void regResinPostRequest() {
        Client client = Client.create();

//        Path filePath = Path.of("c:/temp/demo.txt");
//        Path filePath = Paths.get("C:/Users/Arun Kumar Devarajan/IdeaProjects/Serenity-Cucumber-FirstVersion/src/test/resources/testdata/ingestion/Sample_Post_First_Json.txt");
        Path filePath = Paths.get("C:/Users/Arun Kumar Devarajan/IdeaProjects/Serenity-Cucumber-FirstVersion/src/test/resources/testdata/ingestion/Sample_Post_Second_Json.txt");
        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream = Files.lines(filePath, StandardCharsets.UTF_8)) {

            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        } catch (IOException e) {
            //handle exception
        }

        String fileContent = contentBuilder.toString();

        fileContent = fileContent.replaceAll("\r\n"," ");
        System.out.println("contentBuilder.toString()"+fileContent);

        WebResource webResource = client
                .resource("https://petstore.swagger.io/v2/store/order");

//        String input = "{\"singer\":\"Metallica\",\"title\":\"Fade To Black\"}";
//        String input = "{\n" +
//                "  \"id\": 12345,\n" +
//                "  \"petId\": 0,\n" +
//                "  \"quantity\": 0,\n" +
//                "  \"shipDate\": \"2023-03-13T04:34:16.029Z\",\n" +
//                "  \"status\": \"placed\",\n" +
//                "  \"complete\": true\n" +
//                "}";
//
//        System.out.println("input"+input);

//        ClientResponse response = webResource.type("application/json")
//                .post(ClientResponse.class, input);

        ClientResponse response = webResource.type("application/json")
                .post(ClientResponse.class, fileContent);

//        if (response.getStatus() != 201) {
//            throw new RuntimeException("Failed : HTTP error code : "
//                    + response.getStatus());
//        }

        System.out.println("Output from Server .... \n");
        String output = response.getEntity(String.class);
        System.out.println("response.getEntity(String.class)"+output);
        response.toString();
        System.out.println("response.toString()"+response.toString());
        System.out.println("response.getStatus()"+response.getStatus());

    }

    public void regResinUpdatePostRequest() {

// Handling Employee Pojo for Sample_Post_Third_Json.txt File and invoke as Jason and update Jason Data in Sample_Post_Generated_Third_Json.json

//        ObjectMapper mapper = new ObjectMapper();
//                try {
//                    File jsonInputFile = new File("C:/Users/Arun Kumar Devarajan/IdeaProjects/Serenity-Cucumber-FirstVersion/src/test/resources/testdata/ingestion/Sample_Post_Third_Json.txt");
//                    Employee emp = mapper.readValue(jsonInputFile, Employee.class);
//                    System.out.println("Final before update"+emp);
//                    emp.setEmpId(1018);
//                    System.out.println("Final after update"+emp);
//                    mapper.writeValue(new File("C:\\Users\\Arun Kumar Devarajan\\IdeaProjects\\Serenity-Cucumber-FirstVersion\\src\\test\\resources\\CreationJSON\\Sample_Post_Generated_Third_Json.json"),emp);
//
//                } catch (IOException e) {
//           e.printStackTrace();
//                }

        // Handling Pet Pojo for Sample_Post_Fouth_Json_Pet.txt File and invoke as Jason and update Jason Data in Sample_Post_Fouth_Json_Pet.json

        ObjectMapper mapper = new ObjectMapper();
        try {
            File jsonInputFile = new File("C:/Users/Arun Kumar Devarajan/IdeaProjects/Serenity-Cucumber-FirstVersion/src/test/resources/testdata/ingestion/Sample_Post_Fouth_Json_Pet.txt");
            PetDetails pet = mapper.readValue(jsonInputFile, PetDetails.class);
            System.out.println("Final before update"+pet);
            pet.setId(1236);
            pet.setPetId(140530);
            pet.setStatus("Active-1403");
            pet.setQuantity(1404);
            System.out.println("Final after update"+pet);
            mapper.writeValue(new File("C:\\Users\\Arun Kumar Devarajan\\IdeaProjects\\Serenity-Cucumber-FirstVersion\\src\\test\\resources\\CreationJSON\\Sample_Post_Fouth_Json_Pet.json"),pet);

        } catch (IOException e) {
e.printStackTrace();
        }
        File jsonFile = new File("C:\\Users\\Arun Kumar Devarajan\\IdeaProjects\\Serenity-Cucumber-FirstVersion\\src\\test\\resources\\CreationJSON\\Sample_Post_Fouth_Json_Pet.json");
        Client client = Client.create();
        WebResource webResource = client
                .resource("https://petstore.swagger.io/v2/store/order");
        ClientResponse response = webResource.type("application/json")
                .post(ClientResponse.class, jsonFile);

        System.out.println("Output from Server .... \n");
        String output = response.getEntity(String.class);
        System.out.println("response.getEntity(String.class) for PET-->"+output);
        response.toString();
        System.out.println("response.toString() for PET-->"+response.toString());
        System.out.println("response.getStatus() for PET-->"+response.getStatus());
            }


    public void regResinPropConfigFileRead() {
        String result = "";
        InputStream inputStream;
        Properties prop = new Properties();
        String propFileName = "C:/Users/Arun Kumar Devarajan/IdeaProjects/Serenity-Cucumber-FirstVersion/src/test/resources/testdata/ingestion/Sample_Post_Third_Json.txt";
        inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
        try {
            prop.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Date time = new Date(System.currentTimeMillis());
        String id = prop.getProperty("id");
        String shipDate = prop.getProperty("shipDate");
        String status = prop.getProperty("status");
        String petId = prop.getProperty("petId");
        System.out.println("Property Util Read Values of the Input File");
        System.out.println("id-->"+id);
        System.out.println("shipDate-->"+shipDate);
        System.out.println("status-->"+status);
        System.out.println("petId-->"+petId);
        try {
            inputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
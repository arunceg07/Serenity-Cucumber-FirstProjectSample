package uk.gov.tax.testleafnew.pages;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import uk.gov.tax.testleafnew.data.TestLeaf_TestData.Travelerinformation;

import java.io.File;
import java.io.IOException;

public class JerseyXMLProcessingPage {
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

//        ObjectMapper mapper = new ObjectMapper();
        XmlMapper mapper = new XmlMapper();
        try {
            File xmlInputFile = new File("C:/Users/Arun Kumar Devarajan/IdeaProjects/Serenity-Cucumber-FirstVersion/src/test/resources/testdata/ingestionxmls/Sample_Post_First_xml.txt");
            Travelerinformation travelerinformation = mapper.readValue(xmlInputFile, Travelerinformation.class);
            System.out.println("Final before update"+ travelerinformation);
            travelerinformation.setId(142026);
            travelerinformation.setEmail("alpag@mail.com");
            System.out.println("Final after update"+ travelerinformation);
            mapper.writeValue(new File("C:\\Users\\Arun Kumar Devarajan\\IdeaProjects\\Serenity-Cucumber-FirstVersion\\src\\test\\resources\\CreationXML\\Sample_Post_First_xml_generated.xml"), travelerinformation);

        } catch (IOException e) {
            e.printStackTrace();
        }
        File xmlFile = new File("C:\\Users\\Arun Kumar Devarajan\\IdeaProjects\\Serenity-Cucumber-FirstVersion\\src\\test\\resources\\CreationXML\\Sample_Post_First_xml_generated.xml");
        Client client = Client.create();
        WebResource webResource = client
                .resource("http://restapi.adequateshop.com/api/Traveler/1222");
        ClientResponse response = webResource.type("application/xml")
                .post(ClientResponse.class, xmlFile);

        System.out.println("Output from Server .... \n");
        String output = response.getEntity(String.class);
        System.out.println("response.getEntity(String.class) for PET-->"+output);
        response.toString();
        System.out.println("response.toString() for PET-->"+response.toString());
        System.out.println("response.getStatus() for PET-->"+response.getStatus());
    }
}

package uk.gov.tax.testleafnew.pages;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.juneau.serializer.SerializeException;
import org.apache.juneau.xml.XmlSerializer;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;
import uk.gov.tax.testleafnew.data.TestLeaf_TestData.Product;
import uk.gov.tax.testleafnew.data.TestLeaf_TestData.Travelerinformation;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class RestAssuredXMLProcessingPage {

    public void BDDPostXMLRequest() throws SerializeException, IOException {
//        File XMLInputFile = new File("C:/Users/Arun Kumar Devarajan/IdeaProjects/Serenity-Cucumber-FirstVersion/src/test/resources/testdata/ingestion/Sample_Post_Fouth_Json_Pet.txt");
        XmlSerializer xmls = XmlSerializer.DEFAULT_NS_SQ_READABLE;
//        String sellername[] = {"amazon", "Flipkart"};
//        Product prod = new Product(
//                "Arun",
//                101,
//                "yellow",
//                sellername
//        );

        Travelerinformation travelerinformation = new Travelerinformation();

        String XML = xmls.serializeToString(travelerinformation);
        System.out.println("XML-->Final after update"+XML);
        travelerinformation.setId(123);
        travelerinformation.setName("Arun");
        travelerinformation.setEmail("aqq@mail.com");
        travelerinformation.setAdderes("addres");
        travelerinformation.setCreatedat("223122T012121");
        System.out.println("travelerinformation.toString()"+travelerinformation.toString());

         XML = xmls.serialize(travelerinformation).toString();
        System.out.println("XML-->Final after update new name"+XML);

        String XML1 = "<?xml version=\"1.0\"?>";
        String XML2 = "<Travelerinformation>";
        String XML3 = "</Travelerinformation>";

        String finalXML = XML1+XML2+XML.toString()+XML3;

        System.out.println("XML-->Final Concatenation XML"+finalXML);

        // Create a serializer that writes UTF-8 files.
//        WriterSerializer s = XmlSerializer
//                .create()
//                .fileCharset(Charset.forName("UTF-8"))
//                .build();

//        WriterSerializer s = XmlSerializer
//                .create()
//                .set(WSERIALIZER_fileCharset, "UTF-8")
//                .build();
//        // Use it to read a UTF-8 encoded file.
//        s.serialize(new File("C:\\Users\\Arun Kumar Devarajan\\IdeaProjects\\Serenity-Cucumber-FirstVersion\\src\\test\\resources\\CreationXML\\Sample_Post_First_XML_Prod.xml"),prod.toString());

//        PetDetails pet  = xmls.serialize(XMLInputFile);
//
        RestAssured.baseURI = "http://restapi.adequateshop.com/api";
//        ValidatableResponse Response = RestAssured.given().param("", "").header("", "").when()
//                .get("/users/2").then().statusCode(200);
        RestAssured.given().header("Content-Type", "application/xml").when().body(finalXML).post("/Traveler/1222").then().assertThat().log().all().statusCode(201);
        System.out.println("Rest API for XML dropped");

//        System.out.println("response.toString() for XML apache.juneau-->"+response.toString());
//        System.out.println("response.getStatusCode() for XML apache.juneau--->"+response.getStatusCode());
//        System.out.println("response.toString() for XML apache.juneau--->"+response.toString());
//        System.out.println("response.prettyPrint() for XML apache.juneau-->"+response.prettyPrint());
    }

    public void RESTASSUREDDocBuildUpdatePostRequest() {

// Handling readily available xml file with Doc builder of RESTASSURED

        File xmlFile = new File("C:\\Users\\Arun Kumar Devarajan\\IdeaProjects\\Serenity-Cucumber-FirstVersion\\src\\test\\resources\\CreationXML\\Sample_Post_Second_xml_created.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        try {
            dBuilder= dbFactory.newDocumentBuilder();

            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();

            Element root = doc.getDocumentElement();
            root.getElementsByTagName("email").item(0).setTextContent("docbuilder@mail.com");
            root.getElementsByTagName("name").item(0).setTextContent("arunkumar");

            //saving the file in generated location
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
//            String generatedFilePath = "C:/Users/Arun Kumar Devarajan/IdeaProjects/Serenity-Cucumber-FirstVersion/src/test/resources/CreationDocBuilderXML/sample.xml";

            File file = new File(System.getProperty("user.dir") + "/src/test/resources/CreationDocBuilderXML/"+"sample.xml");

            System.out.println("pathname-->"+System.getProperty("user.dir") + "/src/test/resources/CreationDocBuilderXML/"+"sample.xml");

            transformer.transform(new DOMSource(doc), new StreamResult(file.toURI().getPath()));
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        } catch (TransformerConfigurationException e) {
            throw new RuntimeException(e);
        } catch (TransformerException e) {
            throw new RuntimeException(e);
        }


       File generatedxmlFile = new File("C:\\Users\\Arun Kumar Devarajan\\IdeaProjects\\Serenity-Cucumber-FirstVersion\\src\\test\\resources\\CreationDocBuilderXML\\sample.xml");
        RestAssured.baseURI = "http://restapi.adequateshop.com/api";
        RestAssured.given().header("Content-Type", "application/xml").when().body(generatedxmlFile).post("/Traveler/1222").then().assertThat().log().all().statusCode(201);
        System.out.println("Rest API for XML dropped");

    }

}

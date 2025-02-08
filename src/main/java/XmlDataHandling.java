import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class XmlDataHandling {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        File xmlFile = new File(System.getProperty("user.dir")+"/XML/xmlFile.xml");

        //Parsing xml file
        DocumentBuilder docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document xmlDocument = docBuilder.parse(xmlFile);//interface document javaAPI
        //Get document element
        Element rootElement = xmlDocument.getDocumentElement();//First Element EmployeeData
        System.out.println(rootElement);//[EmployeeData: null]
        //To get only the Name
        String rootElementNodeName = rootElement.getNodeName();
        System.out.println(rootElementNodeName);


    }
}

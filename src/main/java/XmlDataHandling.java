import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
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
        //Get root Element of the XML file
        Element rootElement = xmlDocument.getDocumentElement();//First Element EmployeeData
        System.out.println(rootElement);//[EmployeeData: null]
        //To get only the Name
        String rootElementNodeName = rootElement.getNodeName();
        System.out.println(rootElementNodeName);
       if (rootElement.hasChildNodes()){
           NodeList nodeList = rootElement.getChildNodes();//checking if child note exist
           int rootChildCount = nodeList.getLength();
           for (int i = 0; i < rootChildCount; i++) {
               if(nodeList.item(i).getNodeType()==Node.ELEMENT_NODE){
                   System.out.println("------------"+nodeList.item(i).getNodeName()+"-------");
               }

           }
       }
    }
    public static void nodeType(){
        System.out.println(Node.DOCUMENT_NODE);//9
        System.out.println(Node.ELEMENT_NODE);//1
        System.out.println(Node.TEXT_NODE);//3
        System.out.println(Node.ATTRIBUTE_NODE);//2
        System.out.println(Node.COMMENT_NODE);//8
    }
}

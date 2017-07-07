import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class xmlparse1 {
    public static void main(String args[]) throws Exception {

        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        Document doc = docBuilder.parse("C:\\Users\\Ujjwal\\Downloads\\xmlexamp\\src\\test.xml");
        Node company = doc.getFirstChild();
        System.out.println(company);
        doc.getDocumentElement().normalize();
        //System.out.println(company);

        System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

        NodeList nList = doc.getElementsByTagName("staff");
        System.out.print(nList.getLength());
        System.out.print("\n********************************************\n");
        System.out.print(company.getNodeName());


        for (int temp = 0; temp < nList.getLength(); temp++) {

            Node nNode = nList.item(temp);
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                Element eElement = (Element) nNode;

                System.out.println("Staff id : " + eElement.getAttribute("id"));
//        System.out.println("First Name : " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
                System.out.println("Name : " + eElement.getElementsByTagName("name").item(0).getTextContent());
                System.out.println("Age : " + eElement.getElementsByTagName("age").item(0).getTextContent());
                System.out.println("Salary : " + eElement.getElementsByTagName("salary").item(0).getTextContent());

            }
        }
    }
}

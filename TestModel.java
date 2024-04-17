/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testapplication;

import java.io.File;
import java.io.FileReader;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


/**
 *
 * @author cyrus
 */
public class TestModel {
    ArrayList <Question> theQuestions;
    int questionCounter;
    
    public void chooseFile(boolean which){
        questionCounter = 0;
        theQuestions = new ArrayList<>();
        if (which) { //json
            try {
                String fileName = System.getProperty("user.dir") + "/src/testapplication/text.json";
                Object obj = new JSONParser().parse(new FileReader(fileName));
                JSONObject jo = (JSONObject) obj;
                JSONObject test = (JSONObject) jo.get("test");
                JSONArray questions = (JSONArray) test.get("questions");
                JSONObject answer = (JSONObject) jo.get("result");

                for (int i = 0; i < questions.size(); i++) {
                    JSONObject questionObj = (JSONObject) questions.get(i);
                    String questionText = (String) questionObj.get("qs");
                    JSONArray optionsArray = (JSONArray) questionObj.get("options");
                    
                    ArrayList<String> options = new ArrayList<>();
                    for (int j = 0; j < optionsArray.size(); j++) {
                        options.add((String) optionsArray.get(j));
                    }
                    
                    Question question = new Question(questionText, options);
                    theQuestions.add(question);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }else{//xml
            try {
                String projectDirectory = System.getProperty("user.dir");
                String filePath = projectDirectory + "//src//testapplication//text.xml";
                File xmlFile = new File(filePath);

                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                org.w3c.dom.Document doc = dBuilder.parse(xmlFile);
                doc.getDocumentElement().normalize();

                NodeList nList = doc.getElementsByTagName("question");

                for (int i = 0; i < nList.getLength(); i++) {
                    Node nNode = nList.item(i);

                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element eElement = (Element) nNode;
                        String questionText = eElement.getElementsByTagName("qs").item(0).getTextContent();
                        String result = eElement.getElementsByTagName("qs").item(0).getTextContent();
                        ArrayList<String> options = new ArrayList<>();
                        NodeList optionList = eElement.getElementsByTagName("option");
                        for (int j = 0; j < optionList.getLength(); j++) {
                            options.add(optionList.item(j).getTextContent());
                        }

                        Question question = new Question(questionText, options);
                        theQuestions.add(question);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    boolean foundQuestion(){
        if(theQuestions.size()>0){
            return true;
        }return false;
    }
    public Question getTheQuestion(){
        return theQuestions.get(questionCounter);
    }
    public int getQuestionCount(){
        return theQuestions.size();
    }
    public int getCurrentQuestionCount(){
        return questionCounter;
    }
    public void nextQuestion(){
        if(questionCounter < theQuestions.size()){
            questionCounter++;
        }
    }
    public void prevQuestion(){
        if (questionCounter > 0) {
            questionCounter--;
        }
    }
    public void saveCurrentState(Question currentQuestion, String selectedOption) {
        System.out.println("Saving state for question: " + currentQuestion.getQs() + " with selected option: " + selectedOption);
    }
    public Question loadQuestion(int index) {
        return theQuestions.get(index);
    }
}

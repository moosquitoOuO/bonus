/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testapplication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author cyrus
 */
public class TestController {
    private final TestView theView;
    private final TestModel theModel;

    public TestController(TestView theView, TestModel theModel) {
        this.theView = theView;
        this.theModel = theModel;
        this.theView.addPrevListener(new PrevButtonListener());
        this.theView.addNextListener(new NextButtonListener());
        this.theView.addConfirmedListener(new ConfirmedButtonListener());
        this.theView.XMLListener(new XMLButtonListener());
        this.theView.JSONListener(new JSONButtonListener());
    }
    
    public void setUpDisplay(){
        try{
            if(theModel.foundQuestion()){
                Question c = theModel.getTheQuestion();
                theView.setQuestion(c.getQs());
                theView.setOptions(c.getOptions());
                theView.disablePrev(theModel.getCurrentQuestionCount() == 0);
                theView.disableNext(theModel.getCurrentQuestionCount() >= theModel.getQuestionCount() - 1);
                
            }else{
                theView.setQuestion("???");
                theView.setOptions("????","????","????","????");
            }
        }catch(Error ex){
            System.out.println(ex);
            theView.displayErrorMessage("Error");
        }
    }
    class PrevButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            theView.clearSelections();
            String selectedOption = theView.getSelectedOption();
            theModel.saveCurrentState(theModel.getTheQuestion(), selectedOption);
            if(theModel.getCurrentQuestionCount()==0+1){
                theView.disablePrev(true);
            }else{
                theView.disablePrev(false);
            }
            try{
                Question prevQuestion = theModel.loadQuestion(theModel.getCurrentQuestionCount());
                theModel.prevQuestion();
            }catch(Exception ex){
                System.out.println(ex);
                theView.displayErrorMessage("Error: there is a problem in previous question");
            }
            setUpDisplay();
            theView.clearSelections();
        }
    }
    class NextButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            theView.clearSelections();
            String selectedOption = theView.getSelectedOption();
            theModel.saveCurrentState(theModel.getTheQuestion(), selectedOption);
            if(theModel.getCurrentQuestionCount()>=theModel.getQuestionCount()-2){
                theView.disableNext(true);
            }else{
                theView.disableNext(false);
            }
            try{
                Question nextQuestion = theModel.loadQuestion(theModel.getCurrentQuestionCount());
                theModel.nextQuestion();
            }catch(Exception ex){
                System.out.println(ex);
                theView.displayErrorMessage("Error: there is a problem in next question");
            }
            setUpDisplay();
            theView.clearSelections();
        }
    }
    class ConfirmedButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            
        }
    }
    class XMLButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {            
            System.out.println("user choose xml");
            theModel.chooseFile(false);
            setUpDisplay();
        }
    }
    class JSONButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("user choose json");
            theModel.chooseFile(true);
            setUpDisplay();
        }
    }
    
}

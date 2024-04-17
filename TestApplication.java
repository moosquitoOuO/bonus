/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testapplication;

/**
 *
 * @author cyrus
 */
public class TestApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TestView theView = new TestView();
        TestModel theModel = new TestModel();
        TestController theController;
        theController = new TestController(theView, theModel);
        theView.setVisible(true);
        // TODO code application logic here
    }
    
}

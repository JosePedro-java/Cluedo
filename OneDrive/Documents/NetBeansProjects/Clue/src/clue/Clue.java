/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clue;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author senho
 */
public class Clue extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        //hello
        //from netbeans
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        system.out.print("Teste 1 dois roger man");
    }
     
    
    
    system.out.print("Teste 2 dois jose girl");
    
}

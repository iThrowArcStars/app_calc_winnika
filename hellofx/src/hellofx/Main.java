package hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("hellofx.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 600, 300));
        primaryStage.show();
    }
    public static enum METHODTYPE {
        METHOD1,
        METHOD2,
        METHOD3,
        MENU
    }

private METHODTYPE methTyp = METHODTYPE.METHOD1;
public static int currentValue = weightSpin11.getValue();

    public static void tab(METHODTYPE methodtype) {
        switch(methodtype) {
            case METHOD1:
                
            case METHOD2:

            case METHOD3:

            case MENU:
                
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
    public static void method1() {

    }
    public static void method2() {

    }
    public static void method3() {

    }
}
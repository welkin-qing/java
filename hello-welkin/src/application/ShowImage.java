package application;

import java.awt.GridLayout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ShowImage extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a pane to hold the image views
    Pane pane = new HBox(10);
    pane.setPadding(new Insets(5,5,5,5));
    //pane.setLayout(new GridLayout(2, 0, 5, 5)); 
    Image image1 = new Image("image/121.jpg");
    Image image2 = new Image("image/123.jpg");
    Image image3 = new Image("image/122.jpg");
    //Image image4 = new Image("image/4.jpg");
    ImageView imageView1 = new ImageView(image1);
    imageView1.setFitHeight(150);
    imageView1.setFitWidth(100);
    //pane.getChildren().add(new ImageView(image1));
    pane.getChildren().add(imageView1);
    //imageView2.setFitHeight(100);
    //imageView2.setFitWidth(100);
    
    ImageView imageView2 = new ImageView(image2);
    imageView2.setFitHeight(150);
    imageView2.setFitWidth(100);
    pane.getChildren().add(imageView2);   

    ImageView imageView3 = new ImageView(image3);
    //imageView3.setRotate(90);
    imageView3.setFitHeight(150);
    imageView3.setFitWidth(100);
    pane.getChildren().add(imageView3);     
    
    /*ImageView imageView4 = new ImageView(image4);
    imageView4.setFitHeight(100);
    imageView4.setFitWidth(100);
    pane.getChildren().add(imageView4); */
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane);
    primaryStage.setTitle("ShowImage"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
    //primaryStage.f
  }
  public static void main(String[] args) {
	    launch(args);
	  }
}



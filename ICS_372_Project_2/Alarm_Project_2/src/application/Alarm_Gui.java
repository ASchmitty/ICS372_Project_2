package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;


public class Alarm_Gui extends Application {
	//Creating Variables
	private Button numPadone = new Button("1");
	private Button numPadtwo = new Button("2");
	private Button numPadthree = new Button("3");
	private Button numPadfour = new Button("4");
	private Button numPadfive = new Button("5");
	private Button numPadsix = new Button("6");
	private Button numPadseven = new Button("7");
	private Button numPadeight = new Button("8");
	private Button numPadnine = new Button("9");
	private Button numPadzero = new Button("0");
	private Button stayBtn = new Button("Stay");
	private Button awayBtn = new Button("Away");
	private Button cancelBtn = new Button("Cancel");
	private Button motionBtn = new Button("Motion Dector");
	private TextArea textArea = new TextArea("Ready");
	Canvas canvas = new Canvas(400, 400);
	
	@Override
	public void start(Stage primaryStage) {
		GridPane pane = new GridPane();
		pane.setMinSize(400, 100);
//		pane.add(canvas,1,1);
		pane.add(numPadone,0,0);
		pane.add(numPadtwo,1,0);
		pane.add(numPadthree,2,0);
		pane.add(numPadfour,0,1);
		pane.add(numPadfive,0,1);
//		pane.add(canvas,1,0);88888
//		pane.add(canvas,1,0);
//		pane.add(canvas,1,0);
//		pane.add(canvas,1,0);
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Project 2");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

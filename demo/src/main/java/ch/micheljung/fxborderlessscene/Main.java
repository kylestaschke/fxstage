package ch.micheljung.fxborderlessscene;

import ch.micheljung.fxwindow.FxStage;
import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main {
  public static void main(String[] args) {
    DemoApplication.launch(DemoApplication.class, args);
  }

  public static class DemoApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
      FxStage.configure(primaryStage)
        .withContent(new StackPane(new Label("FxStage")))
        .apply();
    }
  }
}

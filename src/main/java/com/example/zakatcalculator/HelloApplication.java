package com.example.zakatcalculator;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        GridPane gridPane= new GridPane();
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        Button b1;
        b1= new Button("Calculate");

        Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
        l1= new Label("GoldInGrams");
        l2= new Label("SilverInGrams");
        l3= new Label("Rate\\Gram");
        l4= new Label("Rate\\Gram");
          l5= new Label("Gold Value");
        l6= new Label("Silver Value");
        l7= new Label("Male tijarat ");
        l8= new Label("cash");
        l9= new Label("DEbt/loan");
        l10= new Label("net worth");
        l11= new Label("Zakat due");

        TextField t1, t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
        t1= new TextField();
        t2= new TextField();
        t3= new TextField();
        t4= new TextField();
        t5= new TextField();
        t6= new TextField();
        t7= new TextField();
        t8= new TextField();
        t9= new TextField();
        t10= new TextField();
        t11= new TextField();
         gridPane.add(l7,15,10);
         gridPane.add(l8,15,12);
         gridPane.add(l9,15,14);
         gridPane.add(l10,15,16);
         gridPane.add(l11,15,18);
         gridPane.add(t7,17,10);
         gridPane.add(t8,17,12);
         gridPane.add(t9,17,14);
         gridPane.add(t10,17,16);
         gridPane.add(t11,17,18);
         gridPane.add(l5,15,4);
         gridPane.add(l6,15,8);
         gridPane.add(t5,17,4);
        gridPane.add(t6,17,8);
        gridPane.add(l3,8,4);
        gridPane.add(l4,8,8);
        gridPane.add(l1,1,4);
        gridPane.add(l2,1,8);
        gridPane.add(t1,5,4);
        gridPane.add(t2,5,8);
        gridPane.add(t3,12,4);
        gridPane.add(t4,12,8);
        gridPane.add(b1,8,20);

        stage.setHeight(700);
        stage.setWidth(1000);
        Scene scene= new Scene(gridPane);
        stage.setScene(scene);
        stage.setTitle("zakat");
        stage.show();

        EventHandler<MouseEvent> mouseEventEventHandler= new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if(mouseEvent.getSource()==b1){
                    int Goldvalue = Integer.parseInt(t1.getText())*Integer.parseInt(t3.getText());
                    t5.setText(String.valueOf(Goldvalue));
                    int SilverValue=Integer.parseInt(t2.getText())*Integer.parseInt(t4.getText());
                    t6.setText(String.valueOf(Goldvalue));
                    int Maletijarat = Integer.parseInt(t7.getText());
                    int cash=Integer.parseInt(t8.getText());
                    int Loan=Integer.parseInt(t9.getText());
                    t10.setText(String.valueOf(Goldvalue+SilverValue+Maletijarat+cash+Loan));
                    int ZakatableAmount=Goldvalue+SilverValue+Maletijarat+cash-Loan;
                    Double Tola=11.663;
                   Double  SevenPointFiveTolaGoldInGrams= Tola*7.5;
                   Double  ValueOfSevenPointFiveTolaGold=SevenPointFiveTolaGoldInGrams*Integer.parseInt(t3.getText());
                   if(ZakatableAmount>ValueOfSevenPointFiveTolaGold){
                       Double ZakatDue= ((2.5)*ZakatableAmount)/100;
                       t11.setText(String.valueOf(ZakatDue));
                   }
                   else
                       t11.setText(String.valueOf(0));
                }

            }
        };
        b1.setOnMouseClicked(mouseEventEventHandler);




    }

    public static void main(String[] args) {
        launch();
    }
}
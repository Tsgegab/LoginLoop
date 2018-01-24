package com.company;

import java.util.Scanner;

import javafx .application.Application;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import javax.swing.*;

public class Main extends Application {

    public void start (Stage primaryStage ) {

        int weight ;
        int height ;

        String input1 = JOptionPane.showInputDialog(null,"Enter the weight of a person");

        weight = Integer.parseInt(input1);

        String input2 = JOptionPane.showInputDialog(null,"Enter the height of a person");

        height = Integer.parseInt(input2);

        if((weight>50) && (height>60)){
            System.out.println("It is True," + "Your height is : " + height + " and  Your weight is: " + weight);

        } else {
            System.out.println("It is false, " + "You enterd wrong height and weight, please enter agian");
        }
    }

}







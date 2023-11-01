package anonymous;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//class MyActionListener implements ActionListener {
//  @Override
//  public void actionPerformed(ActionEvent e) {
//    System.out.println("Button was clicked");
//  }
//}

public class PressButton {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Click This");
    JButton button = new JButton("Press Me");

//    button.addActionListener(new MyActionListener());
//    button.addActionListener(new ActionListener() {
//      // anonymous inner class
//      // can have constructor params (if base type is a class)
//      // can have fields, methods, overriding methods, etc.
//      // LIMITATION: this is the only place in the code you can instantiate it
//      // because it has no name
//      // BENEFIT: IF the behavior is what your reader really cares about,
//      // then that behavior is RIGHT HERE!!!
//      public void actionPerformed(ActionEvent e) {
//        System.out.println("Button was clicked");
//      }
//    });

///*
//    button.addActionListener(
//      // context demands an object that implements an *interface*
//      // and that interface has EXACTLY ONE abstract method
//      // and all you care about (all you want to provide) is an imlementation
//      // of that single abstract method...
//      */
///*new ActionListener() {
//      public void actionPerformed*//*
//(ActionEvent e) -> {
//        System.out.println("Button was clicked");
//      }
//    */
///*}*//*
//);
//*/

//    button.addActionListener((ActionEvent e) -> {
//      System.out.println("Button was clicked");
//    });
//    button.addActionListener((e) -> { // must have parens if zero or more than one param (e, f) ->
//    button.addActionListener((@SomeAnnotation ActionEvent e) -> { // annotations attach to the TYPE
//    button.addActionListener((@SomeAnnotation var e) -> { // annotations attach to the TYPE, var is a valid placeholder
   // cannot mix/match untyped / var / explicitly typed formal params
//    button.addActionListener(e -> {
//      System.out.println("Button was clicked");
//    });
    button.addActionListener(e -> System.out.println("Button was clicked"));

    frame.getContentPane().setLayout(new BorderLayout());
    frame.getContentPane().add(button, BorderLayout.CENTER);
    // set size???
//    frame.setBounds(10, 10, 150, 80);
    frame.pack();
    frame.setVisible(true);
  }
}

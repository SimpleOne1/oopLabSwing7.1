package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class ButtonEventListener implements ActionListener {
    ArrayList<JRadioButton> buttonsList=new ArrayList<JRadioButton>();
    private JTextField input=new JTextField("",5);
    private JComboBox<String> list=new JComboBox<String>();

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        //JOptionPane.showMessageDialog(null,input);
        if(buttonsList.get(0).isSelected())
        {
            changeNoun(input.getText());
            JOptionPane.showMessageDialog(null,input);
        }
        else if(buttonsList.get(1).isSelected()){
            addBy(input.getText());
            JOptionPane.showMessageDialog(null,input);
        }
        else {
            changeAdverb(input.getText());
            JOptionPane.showMessageDialog(null,input);
        }

    }
    private void changeNoun(String text)//String text
    {
       // String text=textArea.toString();//comment
        String[] words = text.split("\\s");
        if(words[0].charAt((words[0].length()-1))=='а'){
            text="Она "+words[1]+" "+words[2];
        }
        if(words[0].charAt((words[0].length()-1))=='o'){
            text="Оно "+words[1]+" "+words[2];
        }
        if(words[0].charAt((words[0].length()-1))!='а'){
            text="Он "+words[1]+" "+words[2];
        }
        this.input.setText(text.toString());
    }
    private void changeAdverb(String text){
        String words[]=text.split("\\s");
        String a=words[0]+" "+words[1]+" "+list.getSelectedItem();
        this.input.setText(a.toString());
    }
    private void addBy(String text){
        String[] words=text.split("\\s");
        words[1]=words[1]+"бы";
        text=words[0]+" "+words[1]+" "+words[2];
        this.input.setText(text.toString());
    }
    public ButtonEventListener(ArrayList<JRadioButton> buttonList,JTextField input,JComboBox<String> list)
    {
        this.buttonsList=buttonList;
        this.input=input;
        this.list=list;
    }
}

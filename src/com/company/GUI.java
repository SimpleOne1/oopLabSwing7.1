package com.company;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
public class GUI extends JFrame{
    private JLabel label=new JLabel("Введите предложение вида : Сущиствительное+глагол в прошедшев времени+наречие.");
    private JTextField input=new JTextField("",5);
    private JRadioButton radioButton1=new JRadioButton("Заменить существительное местоимением");
    private JRadioButton radioButton2=new JRadioButton("Вставить после глагола бы");
    private JRadioButton radioButton3=new JRadioButton("Заменить наречие другим,выбраным из списка");
    String []arr={"Cлово 1","Cлово 2","Cлово 3"};
    private JComboBox<String> list=new JComboBox<String>(arr);
    private JButton buttonClean=new JButton("Очистить");
    private JButton buttonResult=new JButton("Получить результат");
    public GUI()
    {
        super("Тест на робота");

        this.setBounds(100,100,600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ButtonGroup buttonGroup=new ButtonGroup();
        ArrayList<JRadioButton> buttonsList=new ArrayList<JRadioButton>();
        Container container=this.getContentPane();
        container.setLayout(new GridLayout(5,5,1,1));
        buttonsList.add(radioButton1);
        buttonsList.add(radioButton2);
        buttonsList.add(radioButton3);
        container.add(label);
        container.add(input);
        container.add(list);
        container.add(radioButton1);
        container.add(radioButton2);
        container.add(radioButton3);
        //container.add(buttonClean);
        container.add(buttonResult);
        buttonGroup.add(radioButton1);
        radioButton1.setSelected(true);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);
        buttonResult.addActionListener(new ButtonEventListener(buttonsList,input,list));
        this.pack();
    }

}

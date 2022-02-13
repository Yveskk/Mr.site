package exercicedejava;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ExerciceDeJava extends JFrame implements ActionListener {

    JLabel nom, prenom, afficher;
    JButton bouton;
    JTextField nomT, prenomT;

    public ExerciceDeJava() {
        setSize(1000, 3405);
        getContentPane().setLayout(new GridLayout(8,8));
        JPanel a = new JPanel();
        JPanel b = new JPanel();
        JPanel c = new JPanel();
        getContentPane().add(a);
        getContentPane().add(b);
        getContentPane().add(c);
       
        bouton = new JButton("bouton");
        nom = new JLabel("Nom");
        prenom = new JLabel("Prenom");
        nomT = new JTextField(5);
        prenomT = new JTextField(50);
        afficher= new JLabel("Yves");
        a.add(nom);
        a.add(nomT);
        a.add(prenom);
        a.add(prenomT);
        b.add(bouton);
        c.add(afficher);
        bouton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        afficher.setText(nomT.getText() + " " + prenomT.getText());
    }

    public static void main(String[] arg){
    ExerciceDeJava exo=new ExerciceDeJava();
    exo.setVisible(true);
    }
}

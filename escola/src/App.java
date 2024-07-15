import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class App extends JFrame {
    static JLabel nameLabel = new JLabel("Nome");
    static JTextField Name = new JTextField(20);

    static JLabel turmaLabel = new JLabel("Turma: ");
    static JRadioButton Button_Java = new JRadioButton ("Java");
    static JRadioButton Button_PHP= new JRadioButton ("PHP");
    static JRadioButton Button_C = new JRadioButton ("C#");

    static JLabel turmaLabel_1 = new JLabel("                                                                                                                                                                                         ");

    static JLabel NoteLabelOne = new JLabel("Nota 1");
    static JTextField Note_1 = new JTextField(45);

    static JLabel NoteLabelTwo = new JLabel("Nota 2");
    static JTextField Note_2 = new JTextField(45);

    static JLabel NoteLabelTree = new JLabel("Nota 3");
    static JTextField Note_3 = new JTextField(45);

    static JButton Calcular = new JButton("Calcular");

    static JLabel DesignJLabel = new JLabel("---------------------------------------------------------------------------------------------------------------------------------------------------------------");

    static JLabel labelDescriptionName = new JLabel("Nome : ");
    static JLabel DescriptionName = new JLabel();
    static JLabel labelDescriptionIdade = new JLabel("Idade : ");
    static JLabel DescriptionIdade = new JLabel();
    static JLabel labelDescriptionTurma = new JLabel("Turma : ");
    static JLabel DescriptionTurma = new JLabel();

    static JLabel labelDescriptionNota1 = new JLabel("Nota 1 : ");
    static JLabel DescriptionNota1 = new JLabel();
    static JLabel labelDescriptionNota2 = new JLabel("Nota 2 : ");
    static JLabel DescriptionNota2 = new JLabel();
    static JLabel labelDescriptionNota3= new JLabel("Nota 3 : ");
    static JLabel DescriptionNota3 = new JLabel();
    static JLabel labelDescriptionMedia = new JLabel("Media : ");
    static JLabel DescriptionMedia = new JLabel();
    static JLabel labelDescriptionSituacao = new JLabel("Situação : ");
    static JLabel DescriptionSituacao = new JLabel();

    public static void main (String [] args){
        App Windows = new App();
        Windows.setTitle("Escola Senac");
        Windows.setSize(600,500 );
        Windows.setLayout(new FlowLayout());
        JPanel Painel = new JPanel();
        Painel.setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 20));

        ButtonGroup group = new ButtonGroup();
        group.add(Button_Java );
        group.add(Button_PHP);
        group.add(Button_C);

        Windows.add(nameLabel);
        Windows.add(Name);

        Windows.add(turmaLabel);
        Windows.add(Button_Java);
        Windows.add(Button_PHP);
        Windows.add(Button_C);

        Windows.add(turmaLabel_1);


        Windows.add(NoteLabelOne);
        Windows.add(Note_1);
        Windows.add(NoteLabelTwo);
        Windows.add(Note_2);
        Windows.add(NoteLabelTree);
        Windows.add(Note_3);

        Windows.add(DesignJLabel);


        Windows.add(labelDescriptionName);
        Windows.add(DescriptionName);
        Windows.add(labelDescriptionIdade);
        Windows.add(DescriptionIdade);

        Windows.add(labelDescriptionTurma);
        Windows.add(DescriptionTurma);
        Windows.add(labelDescriptionNota1);
        Windows.add(DescriptionNota1);

        Windows.add(labelDescriptionNota2);
        Windows.add(DescriptionNota2);
        Windows.add(labelDescriptionNota3);
        Windows.add(DescriptionNota3);

        Windows.add(labelDescriptionMedia);
        Windows.add(DescriptionMedia);
        Windows.add(labelDescriptionSituacao);
        Windows.add(DescriptionSituacao);

        Windows.add(Calcular);


        Windows.setVisible(true);


        Calcular.addActionListener( new ActionListener() {
            public void actionPerformed (ActionEvent e)  {
                buttonCalcular(e);
            }
        });

    }
    public static void buttonCalcular (ActionEvent e) {
        float N1 = Float.parseFloat(Note_1.getText());
        float N2 = Float.parseFloat(Note_2.getText());
        float N3 = Float.parseFloat(Note_3.getText());

        Calculo.calcular(N1, N2, N3, Button_Java, Button_PHP, Button_C, DescriptionSituacao);

    }
}

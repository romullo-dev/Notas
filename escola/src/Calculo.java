import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Calculo {
  public static void calcular (float N1, float N2, float N3, JRadioButton Button_Java,JRadioButton Button_PHP, JRadioButton Button_C, JLabel DescriptionSituacao){
    float M = (N1 + N2 + N3)/3;

    if (Button_Java.isSelected()) {
      int A = 5;
      Calculo.Condicional(M, A, DescriptionSituacao);

    } else if (Button_PHP.isSelected()) {
      int A = 8;
      Calculo.Condicional(M, A, DescriptionSituacao);

    } else if (Button_C.isSelected()) {
      int A = 7;
      Calculo.Condicional(M, A, DescriptionSituacao);
    }

  }

  public static void Condicional (float M,int A,JLabel DescriptionSituacao) {
    if (M < A) {
      DescriptionSituacao.setText("REPROVADO");
    } else {
      DescriptionSituacao.setText("APROVADO");
    }
  }
}

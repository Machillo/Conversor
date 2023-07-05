import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Conversor {
    public static void main(String[] args) throws Exception {

        Object[] options1 = { "Convertir Monedas", "Conversor de Temperatura", "Salir" };
        int choice = JOptionPane.showOptionDialog(null,
                "¿Que quieres hacer?",
                "Convertir",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                options1,
                options1[0]);

        if (choice == 2) {
            JOptionPane.showMessageDialog(null,
                    "Programa Cerrado");
            System.exit(0);
        }

        if (choice == 0) {
            DecimalFormat FormatDecimal = new DecimalFormat("#,##");
            boolean continueProgram = true;
            while (continueProgram) {
                String[] options = { "Colones a Euros",
                        "Colones a Dólares",
                        "Colobnes a Libras Esterlinas",
                        "Colones a Yen",
                        "Colones a Won" };

                String change = (String) JOptionPane.showInputDialog(null,
                        "Elija una opción:",
                        "Conversor de Moneda",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        options,
                        options[0]);

                String input = JOptionPane.showInputDialog("Ingrese la cantidad en Colones costarricenses: ");
                double colones;

                try {
                    colones = Double.parseDouble(input);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor no válido.");
                    return;
                }

                if (change.equals("Colones a Dólares")) {
                    double dollars = colones / 542.46;
                    JOptionPane.showMessageDialog(null,
                            colones + " colones costarricenses son " + FormatDecimal.format(dollars) + " dólares.");
                } else if (change.equals("Colones a Euros")) {
                    double euros = colones / 588.85;
                    JOptionPane.showMessageDialog(null,
                            colones + " colones costarricenses son " + FormatDecimal.format(euros) + " euros.");
                } else if (change.equals("Colones a Libras Esterlinas")) {
                    double pounds = colones / 689.08;
                    JOptionPane.showMessageDialog(null, colones + " colones costarricenses "
                            + FormatDecimal.format(pounds) + " libras esterlinas.");
                } else if (change.equals("Colones a Yen")) {
                    double yen = colones / 3.75;
                    JOptionPane.showMessageDialog(null,
                            colones + " colones costarricenses " + FormatDecimal.format(yen) + " yenes japoneses.");
                } else if (change.equals("Colones a Won")) {
                    double won = colones / 0.42;
                    JOptionPane.showMessageDialog(null,
                            colones + " colones costarricenses " + FormatDecimal.format(won) + " wones surcoreanos.");
                }

                int confirm = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando el programa?", "Confirmar",
                        JOptionPane.YES_NO_CANCEL_OPTION);
                if (confirm == JOptionPane.NO_OPTION || confirm == JOptionPane.CANCEL_OPTION) {
                    continueProgram = false;
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");
                }
            }

        }
        if (choice == 1) {

            Boolean continueProgram = true;
            while (continueProgram) {

                String[] options2 = { "Celsius a Fahrenheit", "Fahrenheit a Celsius" };
                int option = JOptionPane.showOptionDialog(null, "Elige una opción de conversión:",
                        "Convertidor de Temperatura", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                        null, options2, options2[0]);

                String valorStr = JOptionPane.showInputDialog("Ingresa el valor a convertir: ");

                double valor = 0;
                try {
                    valor = Double.parseDouble(valorStr);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor no válido");
                    System.exit(0);
                }

                double result = 0;
                if (option == 0) {
                    result = (valor * 9 / 5) + 32;
                    JOptionPane.showMessageDialog(null,
                            valor + " grados Celsius son " + result + " grados Fahrenheit");
                } else if (option == 1) {
                    result = (valor - 32) * 5 / 9;
                    JOptionPane.showMessageDialog(null,
                            valor + " grados Fahrenheit son " + result + " grados Celsius");
                }

                int continue1 = JOptionPane.showConfirmDialog(null, "¿Deseas continuar usando el programa?", "",
                        JOptionPane.YES_NO_CANCEL_OPTION);
                if (continue1 == JOptionPane.NO_OPTION || continue1 == JOptionPane.CANCEL_OPTION) {
                    continueProgram = false;
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");

                }
            }

        }

    }
}
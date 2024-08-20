import javax.swing.*;
import java.util.Random;

public class Principal {

    public static void main (String[] args)
    {
        //Ejercicio 1
        //Ejemplo A
        JOptionPane.showMessageDialog(null,"Es un mensaje Simple de Información");
        JOptionPane.showMessageDialog(null, "Este es un mensaje de Advertencia",
                "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);

        //Ejemplo B
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para multiplicarlo por 2"));

        //Ejemplo C
        Object color = JOptionPane.showInputDialog(null,"Seleccione Un Color",
                "COLORES", JOptionPane.QUESTION_MESSAGE, null,
                new Object[] { "Seleccione","Amarillo", "Azul", "Rojo" },"Seleccione");

        //Ejercicio 2
        JOptionPane.showMessageDialog(null,"Hola, Mundo!");

        //Ejercicio 3
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        JOptionPane.showMessageDialog(null, "Hola, " + nombre);

        int codigo = JOptionPane.showConfirmDialog(null, "¿querés hacer una donación?", "Donar",
                JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (codigo==JOptionPane.YES_OPTION)
        {
            System.out.println("QUe bueno, ahora te paso el Alias");
        }
        else if (codigo==JOptionPane.NO_OPTION)
        {
            System.out.println("Bueno, mañana te pregunto de nuevo");
        }

        //Ejercicio 4
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para ser sumado"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero para ser sumado"));
        int suma = numero1 + numero2;
        JOptionPane.showMessageDialog(null, "La suma de los dos números es " + suma);

        //Ejercicio 5
        String[] colores = {"Amarillo", "Azul", "Rojo"};
        Random random = new Random();
        int posicionRandom = random.nextInt(3); //de 0 a 2
        //asigno posicion en array
        String colorRandom = colores[posicionRandom];

        Object adivinaColor = JOptionPane.showInputDialog(null,"Adiviná el Color",
                "COLORES", JOptionPane.QUESTION_MESSAGE, null,
                new Object[] { "Seleccione","Amarillo", "Azul", "Rojo" },"Seleccione");

        //convierto Object clase generica a String
        String colorElegido = adivinaColor.toString();

        //comparo Strings
        if (colorRandom.equals(colorElegido))
        {
            JOptionPane.showMessageDialog(null, "Adivinaste!");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Perdiste. Había elegido el " + colorRandom);
        }
    }
}

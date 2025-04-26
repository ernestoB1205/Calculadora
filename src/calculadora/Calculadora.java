/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import javax.swing.*;              
import java.awt.*;                
import java.awt.event.*;          
import java.util.ArrayList;       

public class Calculadora extends JFrame {
    
    private JTextField campo1, campo2, campoResultado;

    private JButton botonSumar, botonDividir, botonMostrar;

    private ArrayList<Double> resultados;

    public static void main(String[] args) {
       
    }
    /**
     * Constructor de la ventana principal.
     */
    public CalculadoraGUI() {
        super("Calculadora Simple");

        resultados = new ArrayList<>();

        // Tamaño y comportamiento básico de la ventana
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 5, 5)); // 5 filas, 2 columnas, espacio de 5 px

        // Crear campos de texto
        campo1 = new JTextField();
        campo2 = new JTextField();
        campoResultado = new JTextField();
        campoResultado.setEditable(false); // Solo lectura

        // Crear botones
        botonSumar = new JButton("Sumar");
        botonDividir = new JButton("Dividir");
        botonMostrar = new JButton("Mostrar Resultados");

        // Asignar acciones a los botones
        botonSumar.addActionListener(e -> sumar());
        botonDividir.addActionListener(e -> dividir());
        botonMostrar.addActionListener(e -> mostrarResultados());

        // Agregar componentes a la ventana (en orden)
        add(new JLabel("Número 1:"));
        add(campo1);
        add(new JLabel("Número 2:"));
        add(campo2);
        add(botonSumar);
        add(botonDividir);
        add(new JLabel("Resultado:"));
        add(campoResultado);
        add(botonMostrar);

        setLocationRelativeTo(null); // Centra la ventana en la pantalla
        setVisible(true);            // Muestra la ventana
    }
    /**
     * Método para realizar la suma de dos números ingresados.
     */
    private void sumar() {
        try {
            // Leer y convertir los textos a números
            double a = Double.parseDouble(campo1.getText());
            double b = Double.parseDouble(campo2.getText());

            // Calcular la suma
            double resultado = a + b;

            // Guardar resultado y mostrar
            resultados.add(resultado);
            campoResultado.setText(String.valueOf(resultado));

        } catch (NumberFormatException e) {
            mostrarError("Ingrese números válidos.");
        }
    }

    /**
     * Método para realizar la división de dos números con manejo de errores.
     */
    private void dividir() {
        try {
            double a = Double.parseDouble(campo1.getText());
            double b = Double.parseDouble(campo2.getText());

            // Validar que no se divide por cero
            if (b == 0) throw new ArithmeticException("División por cero.");

            double resultado = a / b;

            resultados.add(resultado);
            campoResultado.setText(String.valueOf(resultado));

        } catch (NumberFormatException e) {
            mostrarError("Ingrese números válidos.", "Entrada inválida");
        } catch (ArithmeticException e) {
            mostrarError(e.getMessage());
        }
    }
     /**
     * Muestra todos los resultados almacenados en una ventana emergente.
     */
    private void mostrarResultados() {
        StringBuilder mensaje = new StringBuilder("Resultados guardados:\n");
        for (double r : resultados) {
            mensaje.append(r).append("\n");
        }

        JOptionPane.showMessageDialog(this, mensaje.toString());
    }

    /**
     * Muestra un mensaje de error con un cuadro de diálogo.
     * @param mensaje Texto del error a mostrar
     */
     // Versión original (1 parámetro)
    private void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

    // Versión sobrecargada (2 parámetros)
    private void mostrarError(String mensaje, String titulo) {
        JOptionPane.showMessageDialog(this, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String[] args) {
        new CalculadoraGUI();
    }
}

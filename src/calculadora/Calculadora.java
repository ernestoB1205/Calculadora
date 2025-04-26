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
}

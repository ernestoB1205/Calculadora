/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import javax.swing.*;     // Librería para componentes gráficos (ventanas, botones, etc.)         
import java.awt.*;          //Librería para layouts y colores
import java.awt.event.*;     //Librería para manejo de eventos (clics, acciones)     
import java.util.ArrayList;    // Colección para guardar los resultados.   

public class Calculadora extends JFrame {

    // Campos de texto para ingresar números y mostrar el resultado
    private JTextField campo1, campo2, campoResultado;
    // Botones para realizar operaciones
    private JButton botonSumar, botonDividir, botonMostrar;
    // Lista para almacenar los resultados de las operaciones
    private ArrayList<Double> resultados;

    public static void main(String[] args) {
       
    }
    
}

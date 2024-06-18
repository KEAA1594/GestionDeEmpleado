package com.examen.gestiondeempleados;

import com.examen.gestiondeempleados.view.inicio;

/************************************************
 *     Kevin Eduardo Andrade Arellano           *
 ************************************************
 * Actividades              *  Fecha de termino *
 ************************************************
 * 1.- Formulario para      *                   *
 * ingreso de nuevos        *                   *
 * empleados                *                   *
 ************************************************
 * 2.- Listar empleados     *                   *
 ************************************************
 * 3.- Calculo y muestra de *                   *
 * empleado salario promedio*                   *
 ************************************************
 * 4.- Muestra de salario   *                   *
 * mas alto y mas bajo      *                   *
 ************************************************
 * 5.- Buscar empleado      *                   *
 ************************************************/
public class GestionDeEmpleados {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }
}

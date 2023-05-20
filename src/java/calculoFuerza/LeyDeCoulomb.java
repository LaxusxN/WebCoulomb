/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculoFuerza;

/**
 *
 * @author kalu
 */
public class LeyDeCoulomb {
    

    private double k; // Constante de Coulomb
    private double q1; // Carga 1
    private double q2; // Carga 2
    private double r; // Distancia entre las cargas

    public LeyDeCoulomb(double k, double q1, double q2, double r) {
        this.k = k;
        this.q1 = q1;
        this.q2 = q2;
        this.r = r;
    }

    public double calcularFuerza() {
        double fuerza = k * q1 * q2 / (r * r);
        return fuerza;
    }

    public void setK(double k) {
        this.k = k;
    }

    public void setQ1(double q1) {
        this.q1 = q1;
    }

    public void setQ2(double q2) {
        this.q2 = q2;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getK() {
        return k;
    }

    public double getQ1() {
        
        return q1;
    }

    public double getQ2() {
        return q2;
    }

    public double getR() {
        return r;
    }


}

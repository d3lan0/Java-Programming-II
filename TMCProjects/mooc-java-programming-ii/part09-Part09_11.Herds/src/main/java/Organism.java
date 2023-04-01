/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author theo.higgins
 */
public class Organism implements Movable {

    private int xAxis;
    private int yAxis;

    public Organism(int xAxis, int yAxis) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }

    @Override
    public void move(int dx, int dy) {
        this.xAxis = this.xAxis + dx;
        this.yAxis = this.yAxis + dy;
    }

    @Override
    public String toString() {
        return "x: " + this.xAxis + "; y: " + this.yAxis;
    }

}

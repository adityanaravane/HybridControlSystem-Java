/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

public class VariableSizeVector {
    private double[] vector;

    public VariableSizeVector(int size) {
        vector = new double[] {};
        for (i=0; i<=size; i++) {
            vector = new double[]{vector.clone(), 0};
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Catalano.Genetic.SwarmIntelligence;

/**
 *
 * @author Diego Catalano
 */
public interface IObjectiveFunction {
    double Compute(double[] location);
}
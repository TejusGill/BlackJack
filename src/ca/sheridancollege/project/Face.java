/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *@author  Tejus Singh
 * date 20 Nov,2020
 * @author gillt
 */
public enum Face {
    Ace(1), DEUCE(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN (7), EIGHT(8),
    NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13);
    
    public final int value;

    private Face(int value ) {
        this.value = value;
    }
    public int getValue(){
        return value;
    }
}

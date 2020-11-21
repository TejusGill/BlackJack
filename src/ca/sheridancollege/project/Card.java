/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author dancye
 */
public  class Card {
     
    //default modifier for child classes
    private final Face faces;
    private final Suit suits;

    public Card(Face faces, Suit suits) {
        this.faces = faces;
        this.suits = suits;
    }

    public Face getFaces() {
        return faces;
    }

    public Suit getSuits() {
        return suits;
    }
    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    @Override
    public String toString(){
          return faces + " of " + suits;
    }

}

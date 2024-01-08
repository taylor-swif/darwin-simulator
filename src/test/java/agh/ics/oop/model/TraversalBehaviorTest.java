package agh.ics.oop.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TraversalBehaviorTest {

    @Test
    void geneBehavior() {
        Animal animal = new Animal(new Vector2d(0,0), 30, 4, 1);
        int genomeLength = animal.getGenome().getLength();

        for (int i = 0; i < 2 * genomeLength - 1; i++){
            System.out.println(animal.activeGene);
            animal.performGeneBehavior();
        }
    }
}
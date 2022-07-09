package StructurePattern.TemplatePattern;

/**
 * @ author PanLong
 * @ since  2021-07-11 23:05
 */
public class Football extends Game{
    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }
}

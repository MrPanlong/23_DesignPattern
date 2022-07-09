package StructurePattern.TemplatePattern;

/**
 * @ author PanLong
 * @ since  2021-07-11 23:04
 */
public class Cricket extends Game{
    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }
}

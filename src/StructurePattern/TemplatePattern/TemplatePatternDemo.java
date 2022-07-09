package StructurePattern.TemplatePattern;

/**
 * @ author PanLong
 * @ since  2021-07-11 23:06
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println("=================");
        game = new Football();
        game.play();
    }
}

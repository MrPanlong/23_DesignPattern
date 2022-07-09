package BuilderPattern.Builder;

public class SxAirShipBuilder implements AirShipBuilder{
    @Override
    public Engine builderEngine() {
        System.out.println("构建Java发动机");
        return new Engine();
    }

    @Override
    public OrbitalModule builderOrbitalModule() {
        System.out.println("构建轨道舱");
        return new OrbitalModule();

    }

    @Override
    public EscapeTower builderEscapeTower() {
        System.out.println("构建逃逸塔");
        return new EscapeTower();
    }
}

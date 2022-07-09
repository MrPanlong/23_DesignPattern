package BuilderPattern.Builder;

public class SxAirShipDirector implements  AirShipDirector {
    private AirShipBuilder builder;
    public SxAirShipDirector(AirShipBuilder builder){
        this.builder = builder;
    }
    @Override
    public AirShip directorAirShip() {
        Engine e =builder.builderEngine();
        OrbitalModule o = builder.builderOrbitalModule();
        EscapeTower et = builder.builderEscapeTower();

        AirShip ship = new AirShip();
        ship.setEngine(e);
        ship.setOrbitalModule(o);
        ship.setEscapeTower(et);
        return ship;
    }
}

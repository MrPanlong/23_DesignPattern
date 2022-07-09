package BuilderPattern.Builder;

public class Client {
    public static void main(String[] args) {
        AirShipDirector director = new SxAirShipDirector(new SxAirShipBuilder());
        AirShip ship =  director.directorAirShip();
        System.out.println(ship.getEngine().getName());
        ship.launch();
    }
}

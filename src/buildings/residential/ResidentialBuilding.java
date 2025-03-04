package buildings.residential;
import buildings.Building;
import game.City;
import utill.Constants;

public abstract class ResidentialBuilding extends Building{
    protected int capacity;
    protected int happiness;

    public ResidentialBuilding(String name, int cost) {
        super(name, cost, Constants.RESIDENTIAL_MAINTENANCE);
        this.capacity = 100;
        this.happiness = 100;
    }

    @Override
    public int calculateRevenue() {
        return capacity;
    }
    @Override
    public void calculateEffect(City city) {
        city.addPopulation(capacity);
        city.addHappiness(happiness);
    }


    public int getCapacity() {
        return capacity;
    }
}

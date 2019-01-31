package nl.tue.buildingsmart.express.population;

import java.util.HashMap;

public interface ModelPopulationFinishedCallback {

    public void loadFinished(HashMap<Integer, EntityInstance> instances);

}

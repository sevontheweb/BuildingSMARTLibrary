package nl.tue.buildingsmart.express.population;

public interface EntityInstanceVisitor {

    public void visit(Integer id, EntityInstance instance);

}

package com.courses.capacitacionesflypass.sesion2.j.designpattern.creacionales;

// Producto
class House {
    private String foundation;
    private String structure;
    private String roof;
    private String interior;

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    @Override
    public String toString() {
        return "House{" +
                "foundation='" + foundation + '\'' +
                ", structure='" + structure + '\'' +
                ", roof='" + roof + '\'' +
                ", interior='" + interior + '\'' +
                '}';
    }
}

// Builder
abstract class HouseBuilder {
    protected House house;

    public House getHouse() {
        return house;
    }

    public void createNewHouse() {
        house = new House();
    }

    public abstract void buildFoundation();
    public abstract void buildStructure();
    public abstract void buildRoof();
    public abstract void buildInterior();
}

// Concrete Builder
class ConcreteHouseBuilder extends HouseBuilder {

    @Override
    public void buildFoundation() {
        house.setFoundation("Concrete foundation");
        System.out.println("ConcreteHouseBuilder: Foundation complete.");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Concrete structure");
        System.out.println("ConcreteHouseBuilder: Structure complete.");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Concrete roof");
        System.out.println("ConcreteHouseBuilder: Roof complete.");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Concrete interior");
        System.out.println("ConcreteHouseBuilder: Interior complete.");
    }
}

// Director
class ConstructionEngineer {
    private HouseBuilder houseBuilder;

    public ConstructionEngineer(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse() {
        houseBuilder.createNewHouse();
        houseBuilder.buildFoundation();
        houseBuilder.buildStructure();
        houseBuilder.buildRoof();
        houseBuilder.buildInterior();
        return houseBuilder.getHouse();
    }
}

// Cliente
public class BuilderExample {
    public static void main(String[] args) {
        HouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();
        ConstructionEngineer engineer = new ConstructionEngineer(concreteHouseBuilder);

        House house = engineer.constructHouse();
        System.out.println("House constructed: " + house);
    }
}

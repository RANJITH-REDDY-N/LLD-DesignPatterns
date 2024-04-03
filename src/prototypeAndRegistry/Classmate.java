package prototypeAndRegistry;

public class Classmate implements Prototype<Classmate>{
    private String modelName;
    private String type; // Ruled or Blank
    private String size; // 15x10 -> 15 cm in length, 10 cm in width
    private double cost;
    private String frontPageDesignName;
    private String backPageInfoDesignName;

    public Classmate(){}

    public Classmate(String modelName, String type, String size, double cost)
    {
        this.modelName = modelName;
        this.type = type;
        this.size = size;
        this.cost = cost;
    }
    /*
     * This acts like a copy constructor
     */
    public Classmate(Classmate classmate) {
        this.modelName = classmate.modelName;
        this.type = classmate.type;
        this.size = classmate.size;
        this.cost = classmate.cost;
        this.frontPageDesignName = classmate.frontPageDesignName;
        this.backPageInfoDesignName = classmate.backPageInfoDesignName;
    }

    @Override
    public Classmate clone() {
        return new Classmate(this);
    }

    @Override
    public String toString() {
        return "Classmate{" +
                "modelName='" + modelName + '\'' +
                ", type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", cost=" + cost +
                ", frontPageDesignName='" + frontPageDesignName + '\'' +
                ", backPageInfoDesignName='" + backPageInfoDesignName + '\'' +
                '}';
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getFrontPageDesignName() {
        return frontPageDesignName;
    }

    public void setFrontPageDesignName(String frontPageDesignName) {
        this.frontPageDesignName = frontPageDesignName;
    }

    public String getBackPageInfoDesignName() {
        return backPageInfoDesignName;
    }

    public void setBackPageInfoDesignName(String backPageInfoDesignName) {
        this.backPageInfoDesignName = backPageInfoDesignName;
    }
}

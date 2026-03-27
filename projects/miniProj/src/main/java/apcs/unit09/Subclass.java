package apcs.unit09;

public class Subclass extends Superclass {
    private int subData;

    public Subclass() {
        super(); // calls the default contructor in the superclass
                //must be the first line in constructor
                 // if you do not explicitly call the superclass constructor, the JRE will
                 // automatically call the superclass default constructor
        subData = 0;
    }

    public Subclass(int pri, int pro, int pub, int subData){
        super(pri, pro, pub);
        this.subData = subData;
    }

    public void setSubData(int subData){
        this.subData = subData;
    }

    public String toString(){
        return super.toString() + "\nsubData: " + this.subData;
    }
}

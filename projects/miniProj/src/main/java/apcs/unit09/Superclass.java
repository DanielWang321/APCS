package apcs.unit09;

public class Superclass {
    private int pri;
    protected int pro;
    public int pub;

    //if we dont define constructor, JRE will provide default contructor
    //however, as soon as we do define any constructor, the default is no longer provided
    //if dont initialize instance data, JRE will provide defualt values
        //as long as they are primitive (Reference types would be null)

    public Superclass(){
        this.pri = 0;
        this.pro = 0;
        this.pub = 0;
    }

    public Superclass(int pri, int pro, int pub){
        this.pri = pri;
        this.pro = pro;
        this.pub = pub;
    }

    public void setPri(int pri){
        this.pri = pri;
    }

    public String toString(){
        return "pri: " + this.pri + "\npro: " + this.pro + "\npub: " + this.pub;
    }
}

package apcs.unit04;

public class MixedNumber implements Comparable<MixedNumber> {
    //composition - HAS-A relationship
    //one class has as its instance data, an instance of another class tpe
    //MixedNumber HAS-A RationalNumber
    private int whole;
    private RationalNumber frac; 

    public MixedNumber(RationalNumber r){
        whole = r.getP()/r.getQ();
        frac = new RationalNumber(r.getP()%r.getQ(), r.getQ());

    }
    public RationalNumber toRational(){
        return new RationalNumber(this.whole * this.frac.getQ() + this.frac.getP(), this.frac.getQ());
    }

    public int compareTo(MixedNumber other){
        return this.toRational().compareTo(other.toRational());
    }

    public MixedNumber add(MixedNumber other){
        RationalNumber sum = this.toRational().sum(other.toRational());
        return new MixedNumber(sum);
    }

    public String toString(){
        //whole 0
        //numerator 0
        if (whole == 0){
            return frac.toString();
        }
        if(frac.getP()==0){
            return whole + "";
        }
        return whole + " " + frac.abs().toString();
    }
}

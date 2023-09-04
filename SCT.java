public class SCT {
    private double Adj, hypo, opp, sine, cos, tan;

    public SCT(double adj, double hypo, double opp){
        this.Adj = adj;
        this.hypo = hypo;
        this.opp  = opp;
    }

    public void Sine(){
        sine = opp / hypo;
    }

    public void Cosine(){
        cos = Adj / hypo;
    }

    public void Tangent(){
        tan = opp / Adj;
    }

    public double getAdjacent(){
        return Adj;
    }

    public double getHypotenuse(){
        return hypo;
    }

    public double getOpposite(){
        return opp;
    }

    public double getSine(){
        return sine;
    }

    public double getCosine(){
        return cos;
    }

    public double gettangent(){
        return tan;
    }
}

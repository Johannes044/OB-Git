package uppgift_4;

public class Mul extends Biexp {

    public Mul(Expr left, Expr right){
        super(left, right);
    }

    @Override
    protected String getOp() {
        return "*";
    }

}

package uppgift_4;

public class Add extends Biexp{
    public Add(Expr left, Expr right){
        super(left,right);
    }

    @Override
    protected String getOp() {
        return "+";
    }
}

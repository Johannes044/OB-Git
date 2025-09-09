package uppgift_4;

public abstract class Biexp {
     protected Expr left, right;

    public Biexp(Expr left, Expr right) {
        this.left = left;
        this.right = right;
    }

    protected abstract String getOp(); // varje subklass väljer operator

    @Override
    public String toString() {
        return left.toString() + " " + getOp() + " " + right.toString();
    }
}

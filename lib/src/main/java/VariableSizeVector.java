import java.util.logging.ErrorManager;

public class VariableSizeVector {
    private struct vector;

    public VariableSizeVector(int size) {
        this.vector = new double[] {};
        for (i=0; i<=size; i++) {
            this.vector = new double[]{this.vector.clone(), 0};
        }
    }

    public double[] get(){
        return this.vector;
    }

    public void setValue(int index, double value) {
        if (this.vector.length < index) {
            throw new Exception("Trying to add a number out of scope");
        }

        this.vector[whereToPut] = value;
    }


}

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.logging.ErrorManager;

public class VariableSizeVector {
    private ArrayList<Double> vector;
    private ArrayList<String> indexes;

    public VariableSizeVector(int size, String[] indexNames) {
        if (indexNames.length != size) {
            throw new Exception("Amount of IndexNames does not match array size");
        }
        this.vector = new ArrayList<Double>();
        this.indexes = new ArrayList<String>();
        for(i=0; i<=size; i++) {
            this.vector.add(0);
            this.indexes.add(indexNames[i]);
        }
        

    }

    public ArrayList<Double> get(){
        return this.vector;
    }

    public void setValues(int index, double[] value) {
        if (this.vector.size() < index) {
            throw new Exception("Trying to add a number out of scope");
        }
        if (this.vector.size() != value.length) {
            throw new Exception("Not Enough Values");
        }



    }


}

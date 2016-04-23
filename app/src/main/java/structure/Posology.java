package structure;

import java.io.Serializable;
import java.util.PriorityQueue;

/**
 * Created by Rui on 23-Apr-16.
 */
public class Posology implements Serializable {
    PriorityQueue medicationQueue;

    public Posology(){
        this.medicationQueue = new <Medication>PriorityQueue();
    }

    public boolean insertMedication(Medication medication) {
        return this.medicationQueue.add(medication);
    }

    public PriorityQueue getPosology(){
        return this.medicationQueue;
    }
}

package structure;

import android.graphics.Bitmap;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Rui on 23-Apr-16.
 */
public class Medication implements Serializable {
    private String name;
    private int dosage; // cada comprimido
    private int dose; // quantidade de cada toma
    private Date nextDose;
    private int frequency;
    private int quantity;
    private Bitmap img;

    public Medication(String name, int dosage, int dose, Date nextDose, int frequency, int quantity, Bitmap img) {
        this.name = name;
        this.dosage = dosage;
        this.dose = dose;
        this.nextDose = nextDose;
        this.frequency = frequency;
        this.quantity = quantity;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public int getDosage() {
        return dosage;
    }

    public void setDosage(int dosage) {
        this.dosage = dosage;
    }

    public Bitmap getImg() {
        return img;
    }

    public void setImg(Bitmap img) {
        this.img = img;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getNextDose() {
        return nextDose;
    }

    public void setNextDose(Date nextDose) {
        this.nextDose = nextDose;
    }

    public int getDose() {
        return dose;
    }

    public void setDose(int dose) {
        this.dose = dose;
    }

    public void setName(String name) {
        this.name = name;
    }
}

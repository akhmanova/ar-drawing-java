package com.googlecreativelab.drawar;

import java.io.Serializable;
import java.util.ArrayList;

import javax.vecmath.Vector3f;

/**
 * Created by van on 25.03.18.
 */

public class Stroke implements Serializable {
    ArrayList<Vector3f> pointsArray;
    float color;

    public ArrayList<Vector3f> getPointsArray() {
        return pointsArray;
    }

    public void setPointsArray(ArrayList<Vector3f> pointsArray) {
        this.pointsArray = pointsArray;
    }

    public Stroke(ArrayList<Vector3f> pointsArray, float color) {
        this.pointsArray = pointsArray;
        this.color = color;
    }

    public float getColor() {
        return color;
    }

    public void setColor(float color) {
        this.color = color;
    }
}

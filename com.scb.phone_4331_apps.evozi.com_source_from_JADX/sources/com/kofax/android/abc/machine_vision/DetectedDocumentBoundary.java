package com.kofax.android.abc.machine_vision;

import android.graphics.Point;
import java.util.Vector;

public class DetectedDocumentBoundary {
    protected boolean m_AreAllEdgesConfident;
    protected double m_Area;
    protected DetectedBoundaryType m_BoundaryType;
    protected Vector<Point> m_Corners;
    protected boolean[] m_IsEdgeConfident;

    public enum DetectedBoundaryType {
        NOT_FOUND,
        PARTIAL_OBJECT,
        WHOLE_OBJECT
    }

    public DetectedBoundaryType BoundaryType() {
        return this.m_BoundaryType;
    }

    public Vector<Point> Corners() {
        return this.m_Corners;
    }

    public boolean[] IsEdgeConfident() {
        return this.m_IsEdgeConfident;
    }

    public boolean AreAllEdgesConfident() {
        return this.m_AreAllEdgesConfident;
    }

    public double area() {
        return this.m_Area;
    }
}

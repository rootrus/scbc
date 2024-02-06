package com.kofax.android.abc.machine_vision;

import android.graphics.Point;
import android.graphics.Rect;
import java.util.Vector;

public class DetectedReferenceFeature {
    protected int m_DPI;
    protected int m_Direction;
    protected DetectedFeatureType m_FeatureType;
    protected Vector<Point> m_ProjectedCorners;
    protected Rect m_Region;
    protected Vector<Vector<Point>> m_TextLineCorners;
    protected Vector<String> m_Values;

    public enum DetectedFeatureType {
        NOT_FOUND,
        UNKNOWN,
        PERSONAL_CHECK,
        BUSINESS_CHECK,
        PASSPORT,
        TBD_OTHER_TYPES
    }

    public int Direction() {
        return this.m_Direction;
    }

    public int DPI() {
        return this.m_DPI;
    }

    public DetectedFeatureType Featuretype() {
        return this.m_FeatureType;
    }

    public Vector<Vector<Point>> TextLineCorners() {
        return this.m_TextLineCorners;
    }

    public Rect Region() {
        return this.m_Region;
    }

    public Vector<String> Values() {
        return this.m_Values;
    }

    public Vector<Point> ProjectedCorners() {
        return this.m_ProjectedCorners;
    }
}

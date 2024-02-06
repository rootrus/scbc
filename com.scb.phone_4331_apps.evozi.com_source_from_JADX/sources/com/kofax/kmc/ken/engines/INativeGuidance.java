package com.kofax.kmc.ken.engines;

import android.graphics.Rect;

public interface INativeGuidance {
    double getHorizontalMovementGuidance(Rect rect, double d);

    double getTurnGuidance(double d);

    double getVerticalMovementGuidance(Rect rect, double d);

    double getZoomGuidance(Rect rect, double d, double d2);
}

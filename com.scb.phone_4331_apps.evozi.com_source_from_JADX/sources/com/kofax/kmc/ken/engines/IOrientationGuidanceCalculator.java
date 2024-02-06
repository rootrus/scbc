package com.kofax.kmc.ken.engines;

import android.graphics.Rect;
import com.kofax.kmc.ken.engines.data.BoundingTetragon;
import com.kofax.kmc.ken.engines.data.OrientationGuidance;

interface IOrientationGuidanceCalculator {
    OrientationGuidance calculate(Rect rect, BoundingTetragon boundingTetragon);
}

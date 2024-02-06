package com.kofax.kmc.ken.engines;

import android.graphics.Rect;
import com.kofax.kmc.ken.engines.data.BoundingTetragon;

interface IBoundingRectCalculator {
    Rect calculate(BoundingTetragon boundingTetragon);
}

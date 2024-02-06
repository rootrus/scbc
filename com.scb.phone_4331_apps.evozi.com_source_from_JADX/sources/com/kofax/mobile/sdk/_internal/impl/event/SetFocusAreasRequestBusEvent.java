package com.kofax.mobile.sdk._internal.impl.event;

import android.graphics.Rect;
import java.util.List;

public final class SetFocusAreasRequestBusEvent {
    public final List<Rect> areas;
    public final int height;
    public final int width;

    public SetFocusAreasRequestBusEvent(List<Rect> list, int i, int i2) {
        this.areas = list;
        this.width = i;
        this.height = i2;
    }
}

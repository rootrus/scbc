package com.kofax.mobile.sdk._internal.impl.event;

import android.view.SurfaceView;

public final class SurfaceChangedEvent {
    public final boolean hasSurface;
    public final SurfaceView view;

    public SurfaceChangedEvent(boolean z, SurfaceView surfaceView) {
        this.hasSurface = z;
        this.view = surfaceView;
    }
}

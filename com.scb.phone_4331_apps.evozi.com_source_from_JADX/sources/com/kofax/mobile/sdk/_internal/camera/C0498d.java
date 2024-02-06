package com.kofax.mobile.sdk._internal.camera;

import android.graphics.Point;
import com.kofax.kmc.kui.uicontrols.data.Flash;
import java.util.List;

/* renamed from: com.kofax.mobile.sdk._internal.camera.d */
public interface C0498d {
    /* renamed from: a */
    void mo11148a(Flash flash);

    /* renamed from: a */
    void mo11149a(C0496b bVar);

    /* renamed from: bh */
    Flash mo11150bh();

    /* renamed from: bi */
    C0496b mo11151bi();

    /* renamed from: bj */
    Point mo11152bj();

    /* renamed from: bk */
    Point mo11153bk();

    /* renamed from: c */
    void mo11154c(Point point);

    /* renamed from: d */
    void mo11155d(Point point);

    List<C7889a> getFocusAreas();

    int getMaxNumFocusAreas();

    int getPictureFormat();

    int getPreviewFormat();

    List<Flash> getSupportedFlashModes();

    List<C0496b> getSupportedFocusModes();

    List<Point> getSupportedPictureSizes();

    List<Point> getSupportedPreviewSizes();

    void setFocusAreas(List<C7889a> list);
}

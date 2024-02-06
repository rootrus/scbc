package com.kofax.mobile.sdk._internal.camera;

import android.graphics.Point;
import android.view.SurfaceHolder;
import com.kofax.kmc.kui.uicontrols.data.CameraType;
import com.kofax.kmc.kui.uicontrols.data.Flash;
import java.util.List;

/* renamed from: com.kofax.mobile.sdk._internal.camera.e */
public interface C0499e extends C0498d {
    /* renamed from: a */
    void mo11165a(CameraType cameraType);

    /* renamed from: a */
    void mo11148a(Flash flash);

    /* renamed from: a */
    void mo11149a(C0496b bVar);

    /* renamed from: a */
    void mo11166a(C0497c cVar);

    /* renamed from: a */
    void mo11167a(C0501g gVar);

    /* renamed from: a */
    void mo11168a(C0505k kVar);

    /* renamed from: a */
    void mo11169a(C0508p pVar, byte[] bArr);

    /* renamed from: a */
    void mo11170a(C0510s sVar, C0507o oVar);

    /* renamed from: bh */
    Flash mo11150bh();

    /* renamed from: bi */
    C0496b mo11151bi();

    /* renamed from: bj */
    Point mo11152bj();

    /* renamed from: bk */
    Point mo11153bk();

    /* renamed from: bl */
    boolean mo11171bl();

    /* renamed from: bm */
    boolean mo11172bm();

    /* renamed from: c */
    void mo11154c(Point point);

    void cancelAutoFocus();

    void close();

    /* renamed from: d */
    void mo11155d(Point point);

    List<C7889a> getFocusAreas();

    int getMaxNumFocusAreas();

    int getOrientation();

    int getPictureFormat();

    int getPreviewFormat();

    List<Flash> getSupportedFlashModes();

    List<C0496b> getSupportedFocusModes();

    List<Point> getSupportedPictureSizes();

    List<Point> getSupportedPreviewSizes();

    void open();

    void setDisplayOrientation(int i);

    void setFocusAreas(List<C7889a> list);

    void setPreviewDisplay(SurfaceHolder surfaceHolder);

    void startPreview();

    void stopPreview();
}

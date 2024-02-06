package com.kofax.mobile.sdk._internal.impl.camera;

import android.graphics.Point;
import android.hardware.Camera;
import android.os.Build;
import android.view.SurfaceHolder;
import com.kofax.kmc.kui.uicontrols.Utility;
import com.kofax.kmc.kui.uicontrols.data.CameraType;
import com.kofax.kmc.kui.uicontrols.data.Flash;
import com.kofax.mobile.sdk._internal.C0767k;
import com.kofax.mobile.sdk._internal.camera.C0496b;
import com.kofax.mobile.sdk._internal.camera.C0497c;
import com.kofax.mobile.sdk._internal.camera.C0498d;
import com.kofax.mobile.sdk._internal.camera.C0499e;
import com.kofax.mobile.sdk._internal.camera.C0501g;
import com.kofax.mobile.sdk._internal.camera.C0505k;
import com.kofax.mobile.sdk._internal.camera.C0506n;
import com.kofax.mobile.sdk._internal.camera.C0507o;
import com.kofax.mobile.sdk._internal.camera.C0508p;
import com.kofax.mobile.sdk._internal.camera.C0510s;
import com.kofax.mobile.sdk._internal.camera.C7889a;
import com.kofax.mobile.sdk._internal.dagger.C0519a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.List;
import p040o.HmlPinActivity;

@C0519a
/* renamed from: com.kofax.mobile.sdk._internal.impl.camera.p */
public final class C0625p implements C0499e, C0506n {

    /* renamed from: AS */
    private WeakReference<SurfaceHolder> f1501AS;
    /* access modifiers changed from: private */

    /* renamed from: Bj */
    public Camera f1502Bj;

    /* renamed from: Bk */
    private Camera.Parameters f1503Bk;

    /* renamed from: Bl */
    private final Camera.CameraInfo f1504Bl;

    /* renamed from: Bm */
    private boolean f1505Bm;

    /* renamed from: Bn */
    private int[] f1506Bn;
    /* access modifiers changed from: private */

    /* renamed from: Bo */
    public Point f1507Bo;

    /* renamed from: Bp */
    private final C0631b f1508Bp;

    /* renamed from: com.kofax.mobile.sdk._internal.impl.camera.p$b */
    public interface C0631b {
        void getCameraInfo(int i, Camera.CameraInfo cameraInfo);

        Camera open();

        Camera open(int i);
    }

    /* renamed from: com.kofax.mobile.sdk._internal.impl.camera.p$a */
    static class C0630a implements C0631b {
        private C0630a() {
        }

        public Camera open() {
            return Camera.open();
        }

        public Camera open(int i) {
            return Camera.open(i);
        }

        public void getCameraInfo(int i, Camera.CameraInfo cameraInfo) {
            Camera.getCameraInfo(i, cameraInfo);
        }
    }

    public C0625p(C0631b bVar) {
        this.f1505Bm = false;
        this.f1506Bn = null;
        this.f1507Bo = null;
        if (bVar == null) {
            this.f1508Bp = new C0630a();
        } else {
            this.f1508Bp = bVar;
        }
        this.f1504Bl = new Camera.CameraInfo();
    }

    @HmlPinActivity
    public C0625p() {
        this((C0631b) null);
    }

    /* renamed from: bl */
    public final boolean mo11171bl() {
        return this.f1505Bm;
    }

    public final void open() {
        m1396j(m1393b(CameraType.BACK_CAMERA));
    }

    /* renamed from: a */
    public final void mo11165a(CameraType cameraType) {
        m1396j(m1393b(cameraType));
    }

    /* renamed from: j */
    private void m1396j(int i) {
        if (this.f1502Bj == null) {
            Camera open = this.f1508Bp.open(i);
            this.f1502Bj = open;
            if (open == null) {
                this.f1502Bj = this.f1508Bp.open(i);
            }
            Camera camera = this.f1502Bj;
            if (camera != null) {
                this.f1503Bk = camera.getParameters();
                this.f1505Bm = true;
                return;
            }
            throw new RuntimeException("camera == null");
        }
    }

    public final void close() {
        if (this.f1505Bm) {
            try {
                this.f1502Bj.release();
            } finally {
                this.f1502Bj = null;
                this.f1505Bm = false;
                this.f1506Bn = null;
                this.f1507Bo = null;
            }
        }
    }

    public final void startPreview() {
        this.f1502Bj.startPreview();
    }

    public final void stopPreview() {
        this.f1502Bj.stopPreview();
    }

    /* renamed from: a */
    public final void mo11169a(final C0508p pVar, byte[] bArr) {
        this.f1502Bj.setPreviewCallbackWithBuffer(pVar == null ? null : new Camera.PreviewCallback() {
            public void onPreviewFrame(byte[] bArr, Camera camera) {
                if (camera == C0625p.this.f1502Bj) {
                    if (C0625p.this.f1507Bo == null) {
                        Camera.Size previewSize = camera.getParameters().getPreviewSize();
                        Point unused = C0625p.this.f1507Bo = new Point(previewSize.width, previewSize.height);
                    }
                    pVar.onPreviewFrame(bArr, C0625p.this.f1507Bo.x, C0625p.this.f1507Bo.y);
                }
                C0625p.this.f1502Bj.addCallbackBuffer(bArr);
            }
        });
        this.f1502Bj.addCallbackBuffer(bArr);
    }

    /* renamed from: a */
    public final void mo11168a(final C0505k kVar) {
        try {
            this.f1502Bj.autoFocus(new Camera.AutoFocusCallback() {
                public void onAutoFocus(boolean z, Camera camera) {
                    if (camera == C0625p.this.f1502Bj) {
                        kVar.mo11197k(z);
                    }
                }
            });
        } catch (Exception e) {
            C0767k.m1821e("CAMERA FAIL", "", (Throwable) e);
            if (kVar != null) {
                kVar.mo11197k(false);
            }
        }
    }

    public final void cancelAutoFocus() {
        this.f1502Bj.cancelAutoFocus();
    }

    /* renamed from: a */
    public final void mo11166a(final C0497c cVar) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f1502Bj.setAutoFocusMoveCallback(new Camera.AutoFocusMoveCallback() {
                public void onAutoFocusMoving(boolean z, Camera camera) {
                    if (cVar != null && camera == C0625p.this.f1502Bj) {
                        cVar.mo11147j(z);
                    }
                }
            });
        }
    }

    public final void setDisplayOrientation(int i) {
        this.f1502Bj.setDisplayOrientation(i);
    }

    /* renamed from: a */
    public final void mo11167a(final C0501g gVar) {
        this.f1502Bj.setErrorCallback(new Camera.ErrorCallback() {
            public void onError(int i, Camera camera) {
                if (camera == C0625p.this.f1502Bj) {
                    gVar.onError(i);
                }
            }
        });
    }

    public final void setPreviewDisplay(SurfaceHolder surfaceHolder) {
        try {
            this.f1501AS = new WeakReference<>(surfaceHolder);
            this.f1502Bj.setPreviewDisplay(surfaceHolder);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: bk */
    public final Point mo11153bk() {
        return new C0634q(this.f1503Bk).mo11153bk();
    }

    public final List<Point> getSupportedPreviewSizes() {
        return new C0634q(this.f1503Bk).getSupportedPreviewSizes();
    }

    /* renamed from: bh */
    public final Flash mo11150bh() {
        return mo11560jR().mo11150bh();
    }

    /* renamed from: a */
    public final void mo11148a(Flash flash) {
        C0498d jR = mo11560jR();
        jR.mo11148a(flash);
        mo11559h(jR);
    }

    public final List<C7889a> getFocusAreas() {
        return mo11560jR().getFocusAreas();
    }

    public final void setFocusAreas(List<C7889a> list) {
        C0498d jR = mo11560jR();
        jR.setFocusAreas(list);
        mo11559h(jR);
    }

    /* renamed from: bi */
    public final C0496b mo11151bi() {
        return mo11560jR().mo11151bi();
    }

    /* renamed from: a */
    public final void mo11149a(C0496b bVar) {
        C0498d jR = mo11560jR();
        jR.mo11149a(bVar);
        mo11559h(jR);
    }

    public final int getMaxNumFocusAreas() {
        return mo11560jR().getMaxNumFocusAreas();
    }

    public final int getPictureFormat() {
        return mo11560jR().getPictureFormat();
    }

    /* renamed from: bj */
    public final Point mo11152bj() {
        return mo11560jR().mo11152bj();
    }

    /* renamed from: c */
    public final void mo11154c(Point point) {
        C0498d jR = mo11560jR();
        jR.mo11154c(point);
        mo11559h(jR);
    }

    public final int getPreviewFormat() {
        return mo11560jR().getPreviewFormat();
    }

    public final List<Flash> getSupportedFlashModes() {
        return mo11560jR().getSupportedFlashModes();
    }

    public final List<C0496b> getSupportedFocusModes() {
        return mo11560jR().getSupportedFocusModes();
    }

    public final List<Point> getSupportedPictureSizes() {
        return mo11560jR().getSupportedPictureSizes();
    }

    /* renamed from: d */
    public final void mo11155d(Point point) {
        this.f1507Bo = point;
        C0634q qVar = new C0634q(this.f1503Bk);
        qVar.mo11155d(point);
        mo11559h(qVar);
    }

    /* renamed from: h */
    public final void mo11559h(C0498d dVar) {
        if (dVar instanceof C0634q) {
            Camera.Parameters parameters = this.f1502Bj.getParameters();
            parameters.unflatten(((C0634q) dVar).flatten());
            mo11558b(parameters);
            m1392a(parameters);
            this.f1502Bj.setParameters(parameters);
            return;
        }
        throw new IllegalArgumentException("Parameters constructed elsewhere.  Unsupported.");
    }

    /* renamed from: a */
    private void m1392a(Camera.Parameters parameters) {
        if (Build.MODEL.equalsIgnoreCase(Utility.ASUS_Z00XS) && parameters.getExposureCompensation() != 2) {
            parameters.setExposureCompensation(2);
        } else if (Build.MODEL.equalsIgnoreCase(Utility.ASUS_ZENFONE_2E) && parameters.getExposureCompensation() != 2) {
            parameters.setExposureCompensation(2);
        }
    }

    /* renamed from: b */
    public final void mo11558b(Camera.Parameters parameters) {
        if (this.f1506Bn == null) {
            m1395c(parameters);
        }
        int[] iArr = this.f1506Bn;
        if (iArr.length > 0) {
            parameters.setPreviewFpsRange(iArr[0], iArr[1]);
        }
    }

    /* renamed from: a */
    public final void mo11170a(final C0510s sVar, final C0507o oVar) {
        C06285 r0;
        C06296 r3;
        this.f1502Bj.setPreviewCallbackWithBuffer((Camera.PreviewCallback) null);
        this.f1502Bj.setPreviewCallback((Camera.PreviewCallback) null);
        this.f1502Bj.addCallbackBuffer((byte[]) null);
        if (sVar == null) {
            r0 = null;
        } else {
            r0 = new Camera.ShutterCallback() {
                public void onShutter() {
                    C0510s sVar = sVar;
                    if (sVar != null) {
                        sVar.onShutter();
                    }
                }
            };
        }
        if (oVar == null) {
            r3 = null;
        } else {
            r3 = new Camera.PictureCallback() {
                public void onPictureTaken(byte[] bArr, Camera camera) {
                    if (oVar != null && camera == C0625p.this.f1502Bj) {
                        int pictureFormat = camera.getParameters().getPictureFormat();
                        Camera.Size pictureSize = camera.getParameters().getPictureSize();
                        oVar.mo11199b(bArr, pictureFormat, pictureSize.width, pictureSize.height);
                    }
                }
            };
        }
        this.f1502Bj.takePicture(r0, (Camera.PictureCallback) null, (Camera.PictureCallback) null, r3);
    }

    /* renamed from: jR */
    public final C0498d mo11560jR() {
        if (this.f1503Bk == null) {
            this.f1503Bk = this.f1502Bj.getParameters();
        }
        return new C0634q(this.f1503Bk);
    }

    /* renamed from: bm */
    public final boolean mo11172bm() {
        return this.f1504Bl.facing == 1;
    }

    public final int getOrientation() {
        return this.f1504Bl.orientation;
    }

    /* renamed from: e */
    public final Camera.Size mo11198e(Point point) {
        return new Camera.Size(this.f1502Bj, point.x, point.y);
    }

    /* renamed from: c */
    private void m1395c(Camera.Parameters parameters) {
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        if (m1398l(supportedPreviewFpsRange)) {
            this.f1506Bn = new int[0];
        } else {
            m1399m(supportedPreviewFpsRange);
        }
    }

    /* renamed from: l */
    private boolean m1398l(List<int[]> list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: m */
    private void m1399m(List<int[]> list) {
        if (m1397jS()) {
            m1400n(list);
        }
        if (this.f1506Bn == null) {
            this.f1506Bn = list.get(list.size() - 1);
        }
    }

    /* renamed from: n */
    private void m1400n(List<int[]> list) {
        for (int[] next : list) {
            if (next[1] > next[0]) {
                this.f1506Bn = next;
                return;
            }
        }
    }

    /* renamed from: jS */
    private boolean m1397jS() {
        return Utility.IS_NEXUS_5 || Utility.IS_NEXUS_6 || Utility.IS_LG_G4 || (Utility.IS_NEXUS_7 && mo11172bm()) || Utility.IS_GOOGLE_PIXEL;
    }

    /* renamed from: b */
    private int m1393b(CameraType cameraType) {
        for (int i = 0; i < Camera.getNumberOfCameras(); i++) {
            this.f1508Bp.getCameraInfo(i, this.f1504Bl);
            if (this.f1504Bl.facing == cameraType.ordinal()) {
                return i;
            }
        }
        return -1;
    }
}

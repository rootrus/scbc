package com.kofax.mobile.sdk._internal.impl.camera;

import android.graphics.Point;
import android.hardware.Camera;
import android.media.MediaRecorder;
import android.os.Build;
import android.view.SurfaceHolder;
import com.kofax.kmc.kui.uicontrols.data.CameraType;
import com.kofax.kmc.kui.uicontrols.data.Flash;
import com.kofax.mobile.sdk._internal.C0767k;
import com.kofax.mobile.sdk._internal.camera.C0496b;
import com.kofax.mobile.sdk._internal.camera.C0497c;
import com.kofax.mobile.sdk._internal.camera.C0498d;
import com.kofax.mobile.sdk._internal.camera.C0499e;
import com.kofax.mobile.sdk._internal.camera.C0501g;
import com.kofax.mobile.sdk._internal.camera.C0502h;
import com.kofax.mobile.sdk._internal.camera.C0505k;
import com.kofax.mobile.sdk._internal.camera.C0507o;
import com.kofax.mobile.sdk._internal.camera.C0508p;
import com.kofax.mobile.sdk._internal.camera.C0510s;
import com.kofax.mobile.sdk._internal.camera.C0512u;
import com.kofax.mobile.sdk._internal.camera.C7889a;
import com.kofax.mobile.sdk._internal.camera.IVideoResourceProvider;
import com.kofax.mobile.sdk._internal.dagger.C7896d;
import java.io.File;
import java.io.IOException;
import java.util.List;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.camera.ad */
public final class C0548ad implements C0499e {
    /* access modifiers changed from: private */

    /* renamed from: Bj */
    public Camera f1247Bj;

    /* renamed from: Bk */
    private Camera.Parameters f1248Bk;

    /* renamed from: Bl */
    private final Camera.CameraInfo f1249Bl;

    /* renamed from: Bm */
    private boolean f1250Bm = false;

    /* renamed from: Cx */
    private final C0502h f1251Cx;

    /* renamed from: Cz */
    private SurfaceHolder f1252Cz;
    /* access modifiers changed from: private */

    /* renamed from: Dd */
    public final C0512u f1253Dd;

    /* renamed from: De */
    private MediaRecorder f1254De;

    /* renamed from: Df */
    private File f1255Df;

    /* renamed from: Dg */
    private boolean f1256Dg;

    /* renamed from: a */
    private void m1099a(C7896d dVar) {
    }

    @HmlPinActivity
    public C0548ad(C0512u uVar, IVideoResourceProvider iVideoResourceProvider) {
        C0502h fileProvider = iVideoResourceProvider.getFileProvider();
        if (fileProvider != null) {
            this.f1251Cx = fileProvider;
            if (uVar != null) {
                this.f1253Dd = uVar;
                this.f1249Bl = new Camera.CameraInfo();
                return;
            }
            throw new IllegalArgumentException("eventsRecorder cannot be null");
        }
        throw new IllegalArgumentException("fileProvider cannot be null");
    }

    /* renamed from: bl */
    public final boolean mo11171bl() {
        return this.f1250Bm;
    }

    /* renamed from: bm */
    public final boolean mo11172bm() {
        return this.f1249Bl.facing == 1;
    }

    public final int getOrientation() {
        return this.f1249Bl.orientation;
    }

    public final void open() {
        m1102j(m1100b(CameraType.BACK_CAMERA));
    }

    /* renamed from: a */
    public final void mo11165a(CameraType cameraType) {
        m1102j(m1100b(cameraType));
    }

    /* renamed from: j */
    private void m1102j(int i) {
        if (this.f1247Bj == null) {
            Camera open = Camera.open(i);
            this.f1247Bj = open;
            if (open == null) {
                this.f1247Bj = Camera.open(i);
            }
            Camera camera = this.f1247Bj;
            if (camera != null) {
                this.f1248Bk = camera.getParameters();
                this.f1250Bm = true;
                return;
            }
            throw new RuntimeException("camera == null");
        }
    }

    public final void close() {
        if (this.f1250Bm) {
            try {
                this.f1247Bj.release();
            } finally {
                this.f1247Bj = null;
                this.f1250Bm = false;
            }
        }
    }

    public final void startPreview() {
        if (!this.f1256Dg) {
            try {
                this.f1247Bj.startPreview();
                this.f1247Bj.unlock();
                MediaRecorder mediaRecorder = new MediaRecorder();
                this.f1254De = mediaRecorder;
                mediaRecorder.setCamera(this.f1247Bj);
                this.f1254De.setVideoSource(0);
                this.f1254De.setOutputFormat(2);
                this.f1254De.setVideoFrameRate(24);
                this.f1254De.setVideoEncodingBitRate(3000000);
                this.f1254De.setVideoEncoder(2);
                this.f1254De.setVideoSize(1920, 1080);
                this.f1254De.setOrientationHint(mo11172bm() ? getOrientation() : 90);
                File bn = this.f1251Cx.mo11182bn();
                this.f1255Df = bn;
                this.f1254De.setOutputFile(bn.getAbsolutePath());
                this.f1254De.setPreviewDisplay(this.f1252Cz.getSurface());
                this.f1254De.prepare();
                this.f1254De.start();
                this.f1253Dd.start();
                this.f1247Bj.reconnect();
                this.f1256Dg = true;
            } catch (IllegalStateException e) {
                throw new RuntimeException(e);
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            } catch (Throwable th) {
                this.f1256Dg = true;
                throw th;
            }
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0029 */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0031 A[Catch:{ all -> 0x0027 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void stopPreview() {
        /*
            r2 = this;
            boolean r0 = r2.f1256Dg
            if (r0 == 0) goto L_0x003c
            r0 = 0
            android.media.MediaRecorder r1 = r2.f1254De     // Catch:{ RuntimeException -> 0x0029 }
            r1.stop()     // Catch:{ RuntimeException -> 0x0029 }
            android.media.MediaRecorder r1 = r2.f1254De     // Catch:{ RuntimeException -> 0x0029 }
            r1.reset()     // Catch:{ RuntimeException -> 0x0029 }
            android.media.MediaRecorder r1 = r2.f1254De     // Catch:{ RuntimeException -> 0x0029 }
            r1.release()     // Catch:{ RuntimeException -> 0x0029 }
            r1 = 0
            r2.f1254De = r1     // Catch:{ RuntimeException -> 0x0029 }
            com.kofax.mobile.sdk._internal.camera.u r1 = r2.f1253Dd     // Catch:{ RuntimeException -> 0x0029 }
            r1.stop()     // Catch:{ RuntimeException -> 0x0029 }
            android.hardware.Camera r1 = r2.f1247Bj     // Catch:{ RuntimeException -> 0x0029 }
            r1.lock()     // Catch:{ RuntimeException -> 0x0029 }
            android.hardware.Camera r1 = r2.f1247Bj     // Catch:{ RuntimeException -> 0x0029 }
            r1.stopPreview()     // Catch:{ RuntimeException -> 0x0029 }
            goto L_0x0036
        L_0x0027:
            r1 = move-exception
            goto L_0x0039
        L_0x0029:
            java.io.File r1 = r2.f1255Df     // Catch:{ all -> 0x0027 }
            boolean r1 = r1.exists()     // Catch:{ all -> 0x0027 }
            if (r1 == 0) goto L_0x0036
            java.io.File r1 = r2.f1255Df     // Catch:{ all -> 0x0027 }
            r1.delete()     // Catch:{ all -> 0x0027 }
        L_0x0036:
            r2.f1256Dg = r0
            return
        L_0x0039:
            r2.f1256Dg = r0
            throw r1
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk._internal.impl.camera.C0548ad.stopPreview():void");
    }

    /* renamed from: a */
    public final void mo11169a(final C0508p pVar, byte[] bArr) {
        this.f1247Bj.setPreviewCallbackWithBuffer(pVar == null ? null : new Camera.PreviewCallback() {
            public void onPreviewFrame(byte[] bArr, Camera camera) {
                if (camera == C0548ad.this.f1247Bj) {
                    Camera.Size previewSize = camera.getParameters().getPreviewSize();
                    pVar.onPreviewFrame(bArr, previewSize.width, previewSize.height);
                }
                C0548ad.this.f1247Bj.addCallbackBuffer(bArr);
            }
        });
        this.f1247Bj.addCallbackBuffer(bArr);
    }

    /* renamed from: a */
    public final void mo11168a(C0505k kVar) {
        this.f1253Dd.mo11209c(kVar);
        C05532 r0 = new Camera.AutoFocusCallback() {
            public void onAutoFocus(boolean z, Camera camera) {
                if (camera == C0548ad.this.f1247Bj) {
                    C0548ad.this.f1253Dd.mo11211k(z);
                }
            }
        };
        try {
            this.f1247Bj.autoFocus(r0);
        } catch (Exception e) {
            C0767k.m1821e("CAMERA FAIL", "", (Throwable) e);
            if (kVar != null) {
                kVar.mo11197k(false);
            }
            this.f1247Bj.cancelAutoFocus();
            try {
                this.f1247Bj.setPreviewDisplay(this.f1252Cz);
                this.f1247Bj.autoFocus(r0);
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final void cancelAutoFocus() {
        this.f1247Bj.cancelAutoFocus();
    }

    /* renamed from: a */
    public final void mo11166a(C0497c cVar) {
        this.f1253Dd.mo11208a(cVar);
        if (Build.VERSION.SDK_INT >= 16) {
            this.f1247Bj.setAutoFocusMoveCallback(new Camera.AutoFocusMoveCallback() {
                public void onAutoFocusMoving(boolean z, Camera camera) {
                    if (camera == C0548ad.this.f1247Bj) {
                        C0548ad.this.f1253Dd.mo11210j(z);
                    }
                }
            });
        }
    }

    public final void setDisplayOrientation(int i) {
        this.f1247Bj.setDisplayOrientation(i);
    }

    /* renamed from: a */
    public final void mo11167a(final C0501g gVar) {
        this.f1247Bj.setErrorCallback(new Camera.ErrorCallback() {
            public void onError(int i, Camera camera) {
                if (camera == C0548ad.this.f1247Bj) {
                    gVar.onError(i);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo11170a(final C0510s sVar, final C0507o oVar) {
        this.f1247Bj.takePicture(new Camera.ShutterCallback() {
            public void onShutter() {
                sVar.onShutter();
            }
        }, (Camera.PictureCallback) null, (Camera.PictureCallback) null, new Camera.PictureCallback() {
            public void onPictureTaken(byte[] bArr, Camera camera) {
                if (camera == C0548ad.this.f1247Bj) {
                    Camera.Parameters parameters = camera.getParameters();
                    Camera.Size pictureSize = parameters.getPictureSize();
                    oVar.mo11199b(bArr, parameters.getPictureFormat(), pictureSize.width, pictureSize.height);
                }
            }
        });
    }

    public final void setPreviewDisplay(SurfaceHolder surfaceHolder) {
        this.f1252Cz = surfaceHolder;
    }

    /* renamed from: bk */
    public final Point mo11153bk() {
        return mo11428jR().mo11153bk();
    }

    /* renamed from: d */
    public final void mo11155d(Point point) {
        if (!point.equals(mo11153bk())) {
            if (this.f1256Dg) {
                stopPreview();
            }
            C0498d jR = mo11428jR();
            jR.mo11155d(point);
            mo11427h(jR);
            if (this.f1256Dg) {
                startPreview();
            }
        }
    }

    public final List<Point> getSupportedPreviewSizes() {
        return mo11428jR().getSupportedPreviewSizes();
    }

    /* renamed from: bh */
    public final Flash mo11150bh() {
        return Flash.OFF;
    }

    /* renamed from: a */
    public final void mo11148a(Flash flash) {
        if (this.f1254De != null) {
            C0767k.m1794F("Error!! cannot set parameters that requires restart during recording");
            return;
        }
        C0498d jR = mo11428jR();
        jR.mo11148a(flash);
        mo11427h(jR);
    }

    public final List<C7889a> getFocusAreas() {
        return mo11428jR().getFocusAreas();
    }

    public final void setFocusAreas(List<C7889a> list) {
        C0498d jR = mo11428jR();
        jR.setFocusAreas(list);
        mo11427h(jR);
    }

    /* renamed from: bi */
    public final C0496b mo11151bi() {
        return mo11428jR().mo11151bi();
    }

    /* renamed from: a */
    public final void mo11149a(C0496b bVar) {
        if (this.f1254De != null) {
            C0767k.m1794F("Error!! cannot set parameters that requires restart during recording");
            return;
        }
        C0498d jR = mo11428jR();
        jR.mo11149a(bVar);
        mo11427h(jR);
    }

    public final int getMaxNumFocusAreas() {
        return mo11428jR().getMaxNumFocusAreas();
    }

    public final int getPictureFormat() {
        return mo11428jR().getPictureFormat();
    }

    /* renamed from: bj */
    public final Point mo11152bj() {
        return mo11428jR().mo11152bj();
    }

    /* renamed from: c */
    public final void mo11154c(Point point) {
        C0498d jR = mo11428jR();
        jR.mo11154c(point);
        mo11427h(jR);
    }

    public final int getPreviewFormat() {
        return mo11428jR().getPreviewFormat();
    }

    public final List<Flash> getSupportedFlashModes() {
        return mo11428jR().getSupportedFlashModes();
    }

    public final List<C0496b> getSupportedFocusModes() {
        return mo11428jR().getSupportedFocusModes();
    }

    public final List<Point> getSupportedPictureSizes() {
        return mo11428jR().getSupportedPictureSizes();
    }

    /* renamed from: h */
    public final void mo11427h(C0498d dVar) {
        if (dVar instanceof C0555ae) {
            Camera.Parameters parameters = this.f1247Bj.getParameters();
            parameters.unflatten(((C0555ae) dVar).flatten());
            this.f1247Bj.setParameters(parameters);
            return;
        }
        throw new IllegalArgumentException("Parameters constructed elsewhere.  Unsupported.");
    }

    /* renamed from: jR */
    public final C0498d mo11428jR() {
        if (this.f1248Bk == null) {
            this.f1248Bk = this.f1247Bj.getParameters();
        }
        return new C0555ae(this.f1248Bk);
    }

    /* renamed from: b */
    private int m1100b(CameraType cameraType) {
        for (int i = 0; i < Camera.getNumberOfCameras(); i++) {
            Camera.getCameraInfo(i, this.f1249Bl);
            if (this.f1249Bl.facing == cameraType.ordinal()) {
                return i;
            }
        }
        return -1;
    }
}

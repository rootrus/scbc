package com.kofax.mobile.sdk._internal.impl.camera;

import android.graphics.Point;
import android.hardware.Camera;
import android.os.Build;
import com.kofax.kmc.kui.uicontrols.Utility;
import com.kofax.kmc.kui.uicontrols.data.Flash;
import com.kofax.mobile.sdk._internal.C0767k;
import com.kofax.mobile.sdk._internal.camera.C0496b;
import com.kofax.mobile.sdk._internal.camera.C0498d;
import com.kofax.mobile.sdk._internal.camera.C7889a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.kofax.mobile.sdk._internal.impl.camera.q */
public class C0634q implements C0498d {

    /* renamed from: Bx */
    protected final Camera.Parameters f1521Bx;

    public int getPreviewFormat() {
        return 17;
    }

    public C0634q(Camera.Parameters parameters) {
        this.f1521Bx = parameters;
    }

    public String flatten() {
        return this.f1521Bx.flatten();
    }

    /* renamed from: bh */
    public Flash mo11150bh() {
        Flash flash = Flash.AUTO;
        String flashMode = this.f1521Bx.getFlashMode();
        if (flashMode.equalsIgnoreCase("auto")) {
            return Flash.AUTO;
        }
        if (flashMode.equalsIgnoreCase("on")) {
            return Flash.ON;
        }
        if (flashMode.equalsIgnoreCase("off")) {
            return Flash.OFF;
        }
        return flashMode.equalsIgnoreCase("torch") ? Flash.TORCH : flash;
    }

    public List<C7889a> getFocusAreas() {
        List<Camera.Area> focusAreas = this.f1521Bx.getFocusAreas();
        ArrayList arrayList = new ArrayList();
        for (Camera.Area next : focusAreas) {
            arrayList.add(new C7889a(next.rect, next.weight));
        }
        return arrayList;
    }

    /* renamed from: bi */
    public C0496b mo11151bi() {
        C0496b bVar = C0496b.AUTO;
        try {
            String focusMode = this.f1521Bx.getFocusMode();
            if (focusMode.equals("auto")) {
                return C0496b.AUTO;
            }
            if (focusMode.equals("infinity")) {
                return C0496b.INFINITY;
            }
            if (focusMode.equalsIgnoreCase("fixed")) {
                return C0496b.FIXED;
            }
            return focusMode.equalsIgnoreCase("edof") ? C0496b.EDOF : bVar;
        } catch (Exception unused) {
            return bVar;
        }
    }

    public int getMaxNumFocusAreas() {
        try {
            return this.f1521Bx.getMaxNumFocusAreas();
        } catch (Exception unused) {
            return 0;
        }
    }

    public int getPictureFormat() {
        return this.f1521Bx.getPictureFormat();
    }

    /* renamed from: bj */
    public Point mo11152bj() {
        Camera.Size pictureSize = this.f1521Bx.getPictureSize();
        return new Point(pictureSize.width, pictureSize.height);
    }

    /* renamed from: bk */
    public Point mo11153bk() {
        Camera.Size previewSize = this.f1521Bx.getPreviewSize();
        return new Point(previewSize.width, previewSize.height);
    }

    public List<Flash> getSupportedFlashModes() {
        ArrayList arrayList = new ArrayList();
        try {
            List<String> supportedFlashModes = this.f1521Bx.getSupportedFlashModes();
            if (supportedFlashModes == null) {
                return null;
            }
            for (String next : supportedFlashModes) {
                if (next.equalsIgnoreCase("auto")) {
                    arrayList.add(Flash.AUTO);
                } else if (next.equalsIgnoreCase("off")) {
                    arrayList.add(Flash.OFF);
                } else if (next.equalsIgnoreCase("on")) {
                    arrayList.add(Flash.ON);
                } else if (next.equalsIgnoreCase("torch")) {
                    arrayList.add(Flash.TORCH);
                }
            }
            if (Utility.HTC_THUNDERBOLT.equalsIgnoreCase(Build.MODEL)) {
                if (arrayList.contains(Flash.TORCH)) {
                    arrayList.remove(Flash.TORCH);
                }
            } else if (Utility.IS_MOTOROLA_TC70) {
                if (arrayList.contains(Flash.ON)) {
                    arrayList.remove(Flash.ON);
                }
                if (arrayList.contains(Flash.AUTO)) {
                    arrayList.remove(Flash.AUTO);
                }
            }
            if (arrayList.contains(Flash.TORCH)) {
                arrayList.add(Flash.AUTOTORCH);
            }
            return arrayList;
        } catch (Exception e) {
            C0767k.m1821e("DeviceCamera", "getSupportedFlashModes exception", (Throwable) e);
        }
    }

    public List<C0496b> getSupportedFocusModes() {
        ArrayList arrayList = new ArrayList();
        try {
            for (String next : this.f1521Bx.getSupportedFocusModes()) {
                if (next.equalsIgnoreCase("auto")) {
                    arrayList.add(C0496b.AUTO);
                    arrayList.add(C0496b.DELAYED);
                } else if (next.equalsIgnoreCase("infinity")) {
                    arrayList.add(C0496b.INFINITY);
                } else if (next.equalsIgnoreCase("fixed")) {
                    arrayList.add(C0496b.FIXED);
                } else if (next.equalsIgnoreCase("edof")) {
                    arrayList.add(C0496b.EDOF);
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    public List<Point> getSupportedPictureSizes() {
        ArrayList arrayList = new ArrayList();
        try {
            for (Camera.Size next : this.f1521Bx.getSupportedPictureSizes()) {
                arrayList.add(new Point(next.width, next.height));
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    public List<Point> getSupportedPreviewSizes() {
        ArrayList arrayList = new ArrayList();
        try {
            for (Camera.Size next : this.f1521Bx.getSupportedPreviewSizes()) {
                arrayList.add(new Point(next.width, next.height));
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo11148a(Flash flash) {
        if (flash != null) {
            int i = C06351.f1522Ba[flash.ordinal()];
            this.f1521Bx.setFlashMode(i != 1 ? i != 2 ? i != 3 ? "auto" : "torch" : "on" : "off");
            return;
        }
        throw null;
    }

    public void setFocusAreas(List<C7889a> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            arrayList = null;
        } else {
            for (C7889a next : list) {
                arrayList.add(new Camera.Area(next.getRect(), next.getWeight()));
            }
        }
        this.f1521Bx.setFocusAreas(arrayList);
    }

    /* renamed from: com.kofax.mobile.sdk._internal.impl.camera.q$1 */
    static /* synthetic */ class C06351 {

        /* renamed from: Ba */
        static final /* synthetic */ int[] f1522Ba;

        /* renamed from: By */
        static final /* synthetic */ int[] f1523By;

        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0063 */
        static {
            /*
                com.kofax.mobile.sdk._internal.camera.b[] r0 = com.kofax.mobile.sdk._internal.camera.C0496b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1523By = r0
                r1 = 1
                com.kofax.mobile.sdk._internal.camera.b r2 = com.kofax.mobile.sdk._internal.camera.C0496b.INFINITY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f1523By     // Catch:{ NoSuchFieldError -> 0x001d }
                com.kofax.mobile.sdk._internal.camera.b r3 = com.kofax.mobile.sdk._internal.camera.C0496b.FIXED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f1523By     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.kofax.mobile.sdk._internal.camera.b r4 = com.kofax.mobile.sdk._internal.camera.C0496b.EDOF     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f1523By     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.kofax.mobile.sdk._internal.camera.b r5 = com.kofax.mobile.sdk._internal.camera.C0496b.DELAYED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r4 = f1523By     // Catch:{ NoSuchFieldError -> 0x003e }
                com.kofax.mobile.sdk._internal.camera.b r5 = com.kofax.mobile.sdk._internal.camera.C0496b.AUTO     // Catch:{ NoSuchFieldError -> 0x003e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r6 = 5
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                com.kofax.kmc.kui.uicontrols.data.Flash[] r4 = com.kofax.kmc.kui.uicontrols.data.Flash.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f1522Ba = r4
                com.kofax.kmc.kui.uicontrols.data.Flash r5 = com.kofax.kmc.kui.uicontrols.data.Flash.OFF     // Catch:{ NoSuchFieldError -> 0x004f }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r1 = f1522Ba     // Catch:{ NoSuchFieldError -> 0x0059 }
                com.kofax.kmc.kui.uicontrols.data.Flash r4 = com.kofax.kmc.kui.uicontrols.data.Flash.ON     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r0 = f1522Ba     // Catch:{ NoSuchFieldError -> 0x0063 }
                com.kofax.kmc.kui.uicontrols.data.Flash r1 = com.kofax.kmc.kui.uicontrols.data.Flash.TORCH     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                int[] r0 = f1522Ba     // Catch:{ NoSuchFieldError -> 0x006d }
                com.kofax.kmc.kui.uicontrols.data.Flash r1 = com.kofax.kmc.kui.uicontrols.data.Flash.AUTO     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk._internal.impl.camera.C0634q.C06351.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo11149a(C0496b bVar) {
        int i = C06351.f1523By[bVar.ordinal()];
        this.f1521Bx.setFocusMode(i != 1 ? i != 2 ? i != 3 ? "auto" : "edof" : "fixed" : "infinity");
    }

    /* renamed from: c */
    public void mo11154c(Point point) {
        this.f1521Bx.setPictureSize(point.x, point.y);
    }

    /* renamed from: d */
    public void mo11155d(Point point) {
        this.f1521Bx.setPreviewSize(point.x, point.y);
    }
}

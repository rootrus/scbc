package com.kofax.mobile.sdk._internal.impl.camera;

import android.graphics.Point;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.SurfaceHolder;
import com.kofax.kmc.kui.uicontrols.data.CameraType;
import com.kofax.kmc.kui.uicontrols.data.Flash;
import com.kofax.mobile.sdk._internal.C0767k;
import com.kofax.mobile.sdk._internal.camera.C0496b;
import com.kofax.mobile.sdk._internal.camera.C0497c;
import com.kofax.mobile.sdk._internal.camera.C0499e;
import com.kofax.mobile.sdk._internal.camera.C0501g;
import com.kofax.mobile.sdk._internal.camera.C0505k;
import com.kofax.mobile.sdk._internal.camera.C0507o;
import com.kofax.mobile.sdk._internal.camera.C0508p;
import com.kofax.mobile.sdk._internal.camera.C0510s;
import com.kofax.mobile.sdk._internal.camera.C7889a;
import java.lang.Thread;
import java.util.List;

/* renamed from: com.kofax.mobile.sdk._internal.impl.camera.z */
public class C0637z implements C0499e {
    /* access modifiers changed from: private */

    /* renamed from: BH */
    public static final Object f1525BH = new Object();
    private static final String TAG = C0637z.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: BG */
    public final C0499e f1526BG;
    /* access modifiers changed from: private */

    /* renamed from: BI */
    public RuntimeException f1527BI;

    /* renamed from: BJ */
    private Handler f1528BJ;
    /* access modifiers changed from: private */

    /* renamed from: BK */
    public Handler f1529BK;

    /* renamed from: BL */
    private final Thread.UncaughtExceptionHandler f1530BL = new Thread.UncaughtExceptionHandler() {
        public void uncaughtException(Thread thread, Throwable th) {
            if (th.getClass().isInstance(RuntimeException.class)) {
                RuntimeException unused = C0637z.this.f1527BI = (RuntimeException) th;
            } else {
                RuntimeException unused2 = C0637z.this.f1527BI = new RuntimeException(th);
            }
        }
    };

    public C0637z(C0499e eVar) {
        this.f1526BG = eVar;
    }

    public void open() {
        mo11165a(CameraType.BACK_CAMERA);
    }

    /* renamed from: a */
    public void mo11165a(final CameraType cameraType) {
        if (!this.f1526BG.mo11171bl()) {
            HandlerThread handlerThread = new HandlerThread("Camera Wrapper Handler Thread");
            handlerThread.start();
            Looper looper = handlerThread.getLooper();
            this.f1528BJ = new Handler(looper);
            this.f1529BK = new Handler(Looper.myLooper());
            looper.getThread().setUncaughtExceptionHandler(this.f1530BL);
            mo11572b((Runnable) new Runnable() {
                public void run() {
                    C0637z.this.f1526BG.mo11165a(cameraType);
                }
            });
            return;
        }
        throw new RuntimeException("Camera is already open.");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: b */
    public void mo11572b(final java.lang.Runnable r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.Object r0 = f1525BH     // Catch:{ InterruptedException -> 0x001d, all -> 0x0018 }
            monitor-enter(r0)     // Catch:{ InterruptedException -> 0x001d, all -> 0x0018 }
            android.os.Handler r1 = r3.f1528BJ     // Catch:{ all -> 0x0015 }
            com.kofax.mobile.sdk._internal.impl.camera.z$19 r2 = new com.kofax.mobile.sdk._internal.impl.camera.z$19     // Catch:{ all -> 0x0015 }
            r2.<init>(r4)     // Catch:{ all -> 0x0015 }
            r1.post(r2)     // Catch:{ all -> 0x0015 }
            java.lang.Object r4 = f1525BH     // Catch:{ all -> 0x0015 }
            r4.wait()     // Catch:{ all -> 0x0015 }
            monitor-exit(r0)
            goto L_0x001d
        L_0x0015:
            r4 = move-exception
            monitor-exit(r0)
            throw r4     // Catch:{ InterruptedException -> 0x001d, all -> 0x0018 }
        L_0x0018:
            r4 = move-exception
            r3.m1434ka()     // Catch:{ all -> 0x0022 }
            throw r4     // Catch:{ all -> 0x0022 }
        L_0x001d:
            r3.m1434ka()     // Catch:{ all -> 0x0022 }
            monitor-exit(r3)
            return
        L_0x0022:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk._internal.impl.camera.C0637z.mo11572b(java.lang.Runnable):void");
    }

    public void execute(Runnable runnable) {
        synchronized (this) {
            if (!this.f1526BG.mo11171bl()) {
                C0767k.m1820e(TAG, "Camera is not open");
            } else {
                mo11572b(runnable);
            }
        }
    }

    /* renamed from: ka */
    private void m1434ka() {
        try {
            if (this.f1527BI != null) {
                this.f1528BJ.getLooper().quit();
                this.f1528BJ = null;
                throw this.f1527BI;
            }
        } finally {
            this.f1527BI = null;
        }
    }

    public void close() {
        if (this.f1526BG.mo11171bl()) {
            execute(new Runnable() {
                public void run() {
                    C0637z.this.f1526BG.close();
                }
            });
            this.f1528BJ.getLooper().quit();
            this.f1528BJ = null;
        }
    }

    /* renamed from: bl */
    public boolean mo11171bl() {
        return this.f1526BG.mo11171bl();
    }

    /* renamed from: bm */
    public boolean mo11172bm() {
        return this.f1526BG.mo11172bm();
    }

    public int getOrientation() {
        return this.f1526BG.getOrientation();
    }

    public void startPreview() {
        execute(new Runnable() {
            public void run() {
                C0637z.this.f1526BG.startPreview();
            }
        });
    }

    public void stopPreview() {
        execute(new Runnable() {
            public void run() {
                C0637z.this.f1526BG.stopPreview();
            }
        });
    }

    /* renamed from: a */
    public void mo11169a(final C0508p pVar, final byte[] bArr) {
        final C065123 r2;
        if (pVar == null) {
            r2 = null;
        } else {
            r2 = new C0508p() {
                public void onPreviewFrame(byte[] bArr, int i, int i2) {
                    C0508p pVar = pVar;
                    if (pVar != null) {
                        pVar.onPreviewFrame(bArr, i, i2);
                    }
                }
            };
        }
        execute(new Runnable() {
            public void run() {
                C0637z.this.f1526BG.mo11169a(r2, bArr);
            }
        });
    }

    /* renamed from: a */
    public void mo11168a(final C0505k kVar) {
        final C066325 r2;
        if (kVar == null) {
            r2 = null;
        } else {
            r2 = new C0505k() {
                /* renamed from: k */
                public void mo11197k(final boolean z) {
                    if (kVar != null) {
                        C0637z.this.f1529BK.post(new Runnable() {
                            public void run() {
                                kVar.mo11197k(z);
                            }
                        });
                    }
                }
            };
        }
        execute(new Runnable() {
            public void run() {
                C0637z.this.f1526BG.mo11168a(r2);
            }
        });
    }

    public void cancelAutoFocus() {
        execute(new Runnable() {
            public void run() {
                C0637z.this.f1526BG.cancelAutoFocus();
            }
        });
    }

    /* renamed from: a */
    public void mo11166a(final C0497c cVar) {
        final C06654 r2;
        if (cVar == null) {
            r2 = null;
        } else {
            r2 = new C0497c() {
                /* renamed from: j */
                public void mo11147j(final boolean z) {
                    if (cVar != null) {
                        C0637z.this.f1529BK.post(new Runnable() {
                            public void run() {
                                cVar.mo11147j(z);
                            }
                        });
                    }
                }
            };
        }
        execute(new Runnable() {
            public void run() {
                C0637z.this.f1526BG.mo11166a(r2);
            }
        });
    }

    public void setDisplayOrientation(final int i) {
        execute(new Runnable() {
            public void run() {
                C0637z.this.f1526BG.setDisplayOrientation(i);
            }
        });
    }

    /* renamed from: a */
    public void mo11167a(final C0501g gVar) {
        final C06557 r2;
        if (gVar == null) {
            r2 = null;
        } else {
            r2 = new C0501g() {
                public void onError(final int i) {
                    if (gVar != null) {
                        C0637z.this.f1529BK.post(new Runnable() {
                            public void run() {
                                gVar.onError(i);
                            }
                        });
                    }
                }
            };
        }
        execute(new Runnable() {
            public void run() {
                C0637z.this.f1526BG.mo11167a(r2);
            }
        });
    }

    /* renamed from: a */
    public void mo11170a(final C0510s sVar, final C0507o oVar) {
        final C06589 r1;
        final C063910 r0 = null;
        if (oVar == null) {
            r1 = null;
        } else {
            r1 = new C0507o() {
                /* renamed from: b */
                public void mo11199b(byte[] bArr, int i, int i2, int i3) {
                    if (oVar != null) {
                        final byte[] bArr2 = bArr;
                        final int i4 = i;
                        final int i5 = i2;
                        final int i6 = i3;
                        C0637z.this.f1529BK.post(new Runnable() {
                            public void run() {
                                oVar.mo11199b(bArr2, i4, i5, i6);
                            }
                        });
                    }
                }
            };
        }
        if (sVar != null) {
            r0 = new C0510s() {
                public void onShutter() {
                    if (sVar != null) {
                        C0637z.this.f1529BK.post(new Runnable() {
                            public void run() {
                                sVar.onShutter();
                            }
                        });
                    }
                }
            };
        }
        execute(new Runnable() {
            public void run() {
                C0637z.this.f1526BG.mo11170a(r0, r1);
            }
        });
    }

    public void setPreviewDisplay(final SurfaceHolder surfaceHolder) {
        execute(new Runnable() {
            public void run() {
                C0637z.this.f1526BG.setPreviewDisplay(surfaceHolder);
            }
        });
    }

    /* renamed from: bk */
    public Point mo11153bk() {
        return this.f1526BG.mo11153bk();
    }

    public List<Point> getSupportedPreviewSizes() {
        return this.f1526BG.getSupportedPreviewSizes();
    }

    /* renamed from: bh */
    public Flash mo11150bh() {
        return this.f1526BG.mo11150bh();
    }

    /* renamed from: a */
    public void mo11148a(final Flash flash) {
        execute(new Runnable() {
            public void run() {
                C0637z.this.f1526BG.mo11148a(flash);
            }
        });
    }

    public List<C7889a> getFocusAreas() {
        return this.f1526BG.getFocusAreas();
    }

    public void setFocusAreas(final List<C7889a> list) {
        execute(new Runnable() {
            public void run() {
                C0637z.this.f1526BG.setFocusAreas(list);
            }
        });
    }

    /* renamed from: bi */
    public C0496b mo11151bi() {
        return this.f1526BG.mo11151bi();
    }

    /* renamed from: a */
    public void mo11149a(final C0496b bVar) {
        execute(new Runnable() {
            public void run() {
                C0637z.this.f1526BG.mo11149a(bVar);
            }
        });
    }

    public int getMaxNumFocusAreas() {
        return this.f1526BG.getMaxNumFocusAreas();
    }

    public int getPictureFormat() {
        return this.f1526BG.getPictureFormat();
    }

    /* renamed from: bj */
    public Point mo11152bj() {
        return this.f1526BG.mo11152bj();
    }

    /* renamed from: c */
    public void mo11154c(final Point point) {
        execute(new Runnable() {
            public void run() {
                C0637z.this.f1526BG.mo11154c(point);
            }
        });
    }

    public int getPreviewFormat() {
        return this.f1526BG.getPreviewFormat();
    }

    public List<Flash> getSupportedFlashModes() {
        return this.f1526BG.getSupportedFlashModes();
    }

    public List<C0496b> getSupportedFocusModes() {
        return this.f1526BG.getSupportedFocusModes();
    }

    public List<Point> getSupportedPictureSizes() {
        return this.f1526BG.getSupportedPictureSizes();
    }

    /* renamed from: d */
    public void mo11155d(final Point point) {
        execute(new Runnable() {
            public void run() {
                C0637z.this.f1526BG.mo11155d(point);
            }
        });
    }
}

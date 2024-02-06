package com.kofax.mobile.sdk._internal.impl.camera;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.util.GmsVersion;
import com.kofax.kmc.kui.uicontrols.Utility;
import com.kofax.mobile.sdk._internal.C0767k;
import com.kofax.mobile.sdk._internal.camera.C0498d;
import com.kofax.mobile.sdk._internal.camera.C0499e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.camera.f */
public final class C0577f {
    private static final String TAG = C0577f.class.getSimpleName();

    /* renamed from: Ad */
    private final Context f1326Ad;

    /* renamed from: Ae */
    private Point f1327Ae;

    /* renamed from: Af */
    private int f1328Af;

    /* renamed from: Ag */
    private long f1329Ag;

    /* renamed from: Ah */
    private Point f1330Ah;

    /* renamed from: Ai */
    private Point f1331Ai;

    /* renamed from: Aj */
    private Point f1332Aj;

    /* renamed from: Ak */
    private Point f1333Ak;

    /* renamed from: Al */
    private boolean f1334Al;

    /* renamed from: Am */
    private Point f1335Am;

    /* renamed from: An */
    private Integer f1336An = 2100000;

    /* renamed from: Ao */
    private Integer f1337Ao = 610000;

    /* renamed from: Ap */
    private Integer f1338Ap = Integer.valueOf(GmsVersion.VERSION_HALLOUMI);

    /* renamed from: Aq */
    private Integer f1339Aq = Integer.valueOf(GmsVersion.VERSION_ORLA);

    /* renamed from: Ar */
    private Integer f1340Ar = 3000000;

    /* renamed from: As */
    private Integer f1341As = Integer.valueOf(GmsVersion.VERSION_SAGA);

    /* renamed from: At */
    private final float f1342At = 4.2f;

    /* renamed from: Au */
    private boolean f1343Au = false;

    /* renamed from: Av */
    private List<Point> f1344Av;

    /* renamed from: Aw */
    private List<Point> f1345Aw;

    @HmlPinActivity
    public C0577f(Context context) {
        this.f1326Ad = context;
        this.f1329Ag = Utility.getDeviceRatio(context);
    }

    /* renamed from: a */
    public final void mo11461a(C0499e eVar, int i, int i2) {
        try {
            m1198b(eVar);
            this.f1327Ae = new Point(i, i2);
            this.f1328Af = eVar.getPreviewFormat();
            Point bk = eVar.mo11153bk();
            this.f1330Ah = new Point(bk.x, bk.y);
            Point bj = eVar.mo11152bj();
            this.f1331Ai = new Point(bj.x, bj.y);
        } catch (Exception e) {
            C0767k.m1801b(TAG, "initializeConfiguration:");
            m1199c(e);
        }
    }

    /* renamed from: b */
    private void m1198b(C0499e eVar) {
        if (this.f1343Au != eVar.mo11172bm()) {
            List<Point> list = this.f1345Aw;
            if (list != null) {
                list.clear();
                this.f1345Aw = null;
            }
            List<Point> list2 = this.f1344Av;
            if (list2 != null) {
                list2.clear();
                this.f1344Av = null;
            }
            this.f1343Au = eVar.mo11172bm();
        }
        if (Utility.IS_AMAZON_FIRE && !this.f1343Au) {
            this.f1339Aq = Integer.valueOf(GmsVersion.VERSION_QUESO);
            this.f1341As = Integer.valueOf(GmsVersion.VERSION_SAGA);
        }
    }

    /* renamed from: jn */
    public final boolean mo11476jn() {
        return this.f1334Al;
    }

    /* renamed from: q */
    public final void mo11481q(boolean z) {
        this.f1334Al = z;
    }

    public final int getPreviewFormat() {
        return this.f1328Af;
    }

    /* renamed from: f */
    public final void mo11471f(Point point) {
        if (point == null) {
            this.f1332Aj = null;
        } else {
            mo11468e(point.x, point.y);
        }
    }

    /* renamed from: e */
    public final void mo11468e(int i, int i2) {
        this.f1332Aj = new Point(i, i2);
        this.f1330Ah = null;
    }

    /* renamed from: jo */
    public final Point mo11477jo() {
        return this.f1332Aj;
    }

    /* renamed from: bk */
    public final Point mo11464bk() {
        Point point = this.f1330Ah;
        if (point == null) {
            point = this.f1332Aj;
        }
        if (point == null) {
            return null;
        }
        return new Point(point.x, point.y);
    }

    /* renamed from: g */
    public final void mo11474g(Point point) {
        if (point == null) {
            this.f1333Ak = null;
        } else {
            mo11470f(point.x, point.y);
        }
    }

    /* renamed from: f */
    public final void mo11470f(int i, int i2) {
        this.f1333Ak = new Point(i, i2);
        this.f1331Ai = null;
    }

    /* renamed from: b */
    public final Point mo11462b(C0498d dVar) {
        return m1197b(dVar, true);
    }

    /* renamed from: c */
    public final Point mo11465c(C0498d dVar) {
        return m1195a(dVar, true);
    }

    /* renamed from: jp */
    public final Point mo11478jp() {
        return this.f1333Ak;
    }

    /* renamed from: bj */
    public final Point mo11463bj() {
        Point point = this.f1331Ai;
        if (point == null) {
            point = this.f1333Ak;
        }
        if (point == null) {
            return null;
        }
        return new Point(point.x, point.y);
    }

    /* renamed from: g */
    public final void mo11473g(int i, int i2) {
        this.f1335Am = new Point(i, i2);
        this.f1330Ah = null;
    }

    /* renamed from: c */
    public final void mo11466c(C0499e eVar) {
        if (eVar != null) {
            try {
                m1201e(eVar);
                m1200d((C0498d) eVar);
            } catch (Exception e) {
                C0767k.m1801b(TAG, "applyConfiguration:");
                m1199c(e);
            }
        }
    }

    /* renamed from: d */
    private void m1200d(C0498d dVar) {
        C0767k.m1801b(TAG, "==== applyPreferredPreviewSize ====");
        Point a = m1195a(dVar, false);
        try {
            C0767k.m1801b(TAG, String.format("  Selected Size: %dx%d", new Object[]{Integer.valueOf(a.x), Integer.valueOf(a.y)}));
            this.f1330Ah = new Point(a.x, a.y);
            dVar.mo11155d(a);
            if (this.f1334Al) {
                Point a2 = m1193a(a, dVar);
                C0767k.m1814d(TAG, String.format("  Is video capture, forcing picture Size: %dx%d", new Object[]{Integer.valueOf(a2.x), Integer.valueOf(a2.y)}));
                dVar.mo11154c(a2);
            }
        } catch (Exception e) {
            m1199c(e);
        }
        C0767k.m1801b(TAG, "==== end applyPreferredPreviewSize ====");
    }

    /* renamed from: e */
    private void m1201e(C0498d dVar) {
        C0767k.m1801b(TAG, "==== applyPreferredPictureSize ====");
        try {
            Point b = m1197b(dVar, false);
            this.f1331Ai = new Point(b.x, b.y);
            dVar.mo11154c(b);
        } catch (Exception e) {
            m1199c(e);
        }
        C0767k.m1801b(TAG, "==== end applyPreferredPictureSize ====");
    }

    /* renamed from: a */
    private Point m1195a(C0498d dVar, boolean z) {
        Point point;
        Point point2;
        int i;
        int i2;
        C0767k.m1801b(TAG, "==== getCalculatedPreviewSize ====");
        try {
            double d = this.f1334Al ? 0.3d : 0.1d;
            Point bk = dVar.mo11153bk();
            List<Point> f = mo11469f(dVar);
            boolean z2 = false;
            C0767k.m1801b(TAG, String.format("  Screen resolution: %dx%d", new Object[]{Integer.valueOf(mo11479jq().x), Integer.valueOf(mo11479jq().y)}));
            if (Utility.IS_DROID_X && !this.f1343Au) {
                C0767k.m1814d(TAG, String.format("  Device DroidX -- Forced resolution %dx%d", new Object[]{Integer.valueOf(bk.x), Integer.valueOf(bk.y)}));
            } else if (this.f1332Aj == null || z) {
                Point jq = mo11479jq();
                boolean z3 = f.get(0).x > f.get(0).y;
                if (jq.x > jq.y) {
                    z2 = true;
                }
                if (z3 == z2) {
                    i = jq.x;
                    i2 = jq.y;
                } else {
                    i = jq.y;
                    i2 = jq.x;
                }
                int i3 = i2;
                int i4 = i;
                double d2 = ((double) i4) / ((double) i3);
                String str = TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("  Target Size: ");
                sb.append(i4);
                sb.append("x");
                sb.append(i3);
                C0767k.m1801b(str, sb.toString());
                String str2 = TAG;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("  Target Aspect Ratio: ");
                sb2.append(d2);
                C0767k.m1801b(str2, sb2.toString());
                int i5 = i4;
                point2 = bk;
                int i6 = i3;
                int a = m1190a(d2, (List<Double>) null, d, 0.01d, this.f1336An, this.f1337Ao, this.f1338Ap, f);
                if (a == -1) {
                    C0767k.m1814d(TAG, "  Not matches found for target ratio.");
                    a = m1191a(i5, i6, this.f1335Am, f);
                }
                if (a >= 0) {
                    point = f.get(a);
                    return point;
                }
                C0767k.m1814d(TAG, "  Failed to find suitable preview Size.");
                point = point2;
                return point;
            } else {
                bk.x = Math.max(this.f1332Aj.x, this.f1332Aj.y);
                bk.y = Math.min(this.f1332Aj.x, this.f1332Aj.y);
                C0767k.m1801b(TAG, String.format("  Client set Size: %dx%d", new Object[]{Integer.valueOf(bk.x), Integer.valueOf(bk.y)}));
            }
            point2 = bk;
            point = point2;
            return point;
        } finally {
            C0767k.m1801b(TAG, "==== end getCalculatedPreviewSize ====");
        }
    }

    /* renamed from: b */
    private Point m1197b(C0498d dVar, boolean z) {
        String str;
        String str2;
        int i;
        try {
            Point bj = dVar.mo11152bj();
            C0767k.m1801b(TAG, "==== getCalculatedPictureSize ====");
            C0767k.m1801b(TAG, String.format("  Screen resolution: %dx%d", new Object[]{Integer.valueOf(mo11479jq().x), Integer.valueOf(mo11479jq().y)}));
            List<Point> g = mo11472g(dVar);
            List<Point> f = mo11469f(dVar);
            HashSet hashSet = new HashSet();
            for (Point next : f) {
                hashSet.add(Double.valueOf(((double) next.x) / ((double) next.y)));
            }
            if (this.f1333Ak != null && !z) {
                bj.x = this.f1333Ak.x;
                bj.y = this.f1333Ak.y;
                C0767k.m1801b(TAG, String.format("  Client set Size: %dx%d", new Object[]{Integer.valueOf(bj.x), Integer.valueOf(bj.y)}));
            } else if (!Utility.IS_MOTOROLA_TC70 || this.f1343Au) {
                try {
                    Point a = m1195a(dVar, z);
                    int i2 = a.x;
                    int i3 = a.y;
                    ArrayList arrayList = new ArrayList();
                    double d = (double) i2;
                    double d2 = (double) i3;
                    arrayList.add(Double.valueOf(d / d2));
                    arrayList.add(Double.valueOf(d2 / d));
                    Collections.sort(arrayList);
                    double doubleValue = ((Double) (g.get(0).x / g.get(0).y <= 0 ? arrayList.get(0) : arrayList.get(1))).doubleValue();
                    String str3 = TAG;
                    StringBuilder sb = new StringBuilder();
                    sb.append("  Target Aspect Ratio: ");
                    sb.append(doubleValue);
                    C0767k.m1801b(str3, sb.toString());
                    double d3 = doubleValue;
                    int a2 = m1190a(doubleValue, new ArrayList(hashSet), 0.1d, 0.01d, this.f1339Aq, this.f1340Ar, this.f1341As, g);
                    if (a2 == -1) {
                        str2 = "==== end getCalculatedPictureSize ====";
                        i = -1;
                        try {
                            a2 = m1190a(0.0d, (List<Double>) null, 2.147483647E9d, 0.0d, this.f1339Aq, this.f1340Ar, this.f1341As, g);
                        } catch (Exception e) {
                            e = e;
                            try {
                                m1199c(e);
                                String str4 = TAG;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("  Selected Size: ");
                                sb2.append(bj.x);
                                sb2.append("x");
                                sb2.append(bj.y);
                                C0767k.m1801b(str4, sb2.toString());
                                C0767k.m1801b(TAG, str2);
                                return bj;
                            } catch (Throwable th) {
                                th = th;
                                str = str2;
                                C0767k.m1801b(TAG, str);
                                throw th;
                            }
                        }
                    } else {
                        str2 = "==== end getCalculatedPictureSize ====";
                        i = -1;
                    }
                    if (a2 == i) {
                        a2 = m1190a(d3, (List<Double>) null, 0.1d, 0.0d, this.f1339Aq, this.f1340Ar, (Integer) null, g);
                    }
                    if (a2 == i) {
                        a2 = m1190a(0.0d, (List<Double>) null, 2.147483647E9d, 0.0d, this.f1339Aq, this.f1340Ar, (Integer) null, g);
                    }
                    if (a2 == i) {
                        a2 = m1192a((Integer) null, (Integer) null, g);
                    }
                    if (a2 >= 0) {
                        Point point = g.get(a2);
                        bj.x = point.x;
                        bj.y = point.y;
                    } else {
                        C0767k.m1814d(TAG, "  Failed to find suitable picture Size.");
                    }
                } catch (Exception e2) {
                    e = e2;
                    str2 = "==== end getCalculatedPictureSize ====";
                    m1199c(e);
                    String str42 = TAG;
                    StringBuilder sb22 = new StringBuilder();
                    sb22.append("  Selected Size: ");
                    sb22.append(bj.x);
                    sb22.append("x");
                    sb22.append(bj.y);
                    C0767k.m1801b(str42, sb22.toString());
                    C0767k.m1801b(TAG, str2);
                    return bj;
                }
                String str422 = TAG;
                StringBuilder sb222 = new StringBuilder();
                sb222.append("  Selected Size: ");
                sb222.append(bj.x);
                sb222.append("x");
                sb222.append(bj.y);
                C0767k.m1801b(str422, sb222.toString());
                C0767k.m1801b(TAG, str2);
                return bj;
            } else {
                bj.x = 1920;
                bj.y = 1080;
            }
            str2 = "==== end getCalculatedPictureSize ====";
            String str4222 = TAG;
            StringBuilder sb2222 = new StringBuilder();
            sb2222.append("  Selected Size: ");
            sb2222.append(bj.x);
            sb2222.append("x");
            sb2222.append(bj.y);
            C0767k.m1801b(str4222, sb2222.toString());
            C0767k.m1801b(TAG, str2);
            return bj;
        } catch (Throwable th2) {
            th = th2;
            str = "==== end getCalculatedPictureSize ====";
            C0767k.m1801b(TAG, str);
            throw th;
        }
    }

    /* renamed from: a */
    private Point m1193a(Point point, C0498d dVar) {
        Point point2 = point;
        double d = 1000.0d;
        long round = Math.round((((double) point2.x) * 1000.0d) / ((double) point2.y));
        C0767k.m1801b(TAG, String.format("  findPictureSizeOfRatio: %d -> %dx%d", new Object[]{Long.valueOf(round), Integer.valueOf(point2.x), Integer.valueOf(point2.y)}));
        try {
            List<Point> g = mo11472g(dVar);
            if (g.contains(point2)) {
                C0767k.m1801b(TAG, String.format("    found: %d -> %dx%d", new Object[]{Long.valueOf(round), Integer.valueOf(point2.x), Integer.valueOf(point2.y)}));
                return point2;
            }
            for (Point next : g) {
                long round2 = Math.round((((double) next.x) * d) / ((double) next.y));
                String str = TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("    Considering Size: ");
                sb.append(next.x);
                sb.append("x");
                sb.append(next.y);
                sb.append(", ");
                sb.append(round2);
                C0767k.m1801b(str, sb.toString());
                if (round == round2) {
                    C0767k.m1801b(TAG, String.format("    found: %d -> %dx%d", new Object[]{Long.valueOf(round2), Integer.valueOf(next.x), Integer.valueOf(next.y)}));
                    return next;
                }
                d = 1000.0d;
            }
            C0767k.m1820e(TAG, "    Could not find picture Size of same aspect ratio");
            return null;
        } catch (Exception e) {
            m1199c(e);
            return null;
        }
    }

    /* renamed from: a */
    private int m1190a(double d, List<Double> list, double d2, double d3, Integer num, Integer num2, Integer num3, List<Point> list2) {
        List<Point> list3 = list2;
        ArrayList<Point> arrayList = new ArrayList<>();
        int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        Integer valueOf = num == null ? (num2 == null || num3 == null) ? Integer.valueOf(Api.BaseClientBuilder.API_PRIORITY_OTHER) : Integer.valueOf(num2.intValue() + ((num3.intValue() - num2.intValue()) / 2)) : num;
        int i2 = -1;
        for (int i3 = 0; i3 < list2.size(); i3++) {
            Point point = list3.get(i3);
            long j = (long) (point.x * point.y);
            if ((num2 == null || j >= ((long) num2.intValue())) && (num3 == null || j <= ((long) num3.intValue()))) {
                double d4 = ((double) point.x) / ((double) point.y);
                if (Math.abs(d4 - d) <= d2) {
                    int abs = (int) Math.abs(j - ((long) valueOf.intValue()));
                    if (abs < i) {
                        i2 = i3;
                        i = abs;
                    }
                } else if (list != null && i2 < 0) {
                    for (Double doubleValue : list) {
                        if (Math.abs(d4 - doubleValue.doubleValue()) <= d3) {
                            arrayList.add(point);
                        }
                    }
                }
            }
        }
        if (i2 < 0 && !arrayList.isEmpty()) {
            for (Point point2 : arrayList) {
                int abs2 = (int) Math.abs(((long) (point2.x * point2.y)) - ((long) valueOf.intValue()));
                long round = Math.round((((double) point2.x) * 1000.0d) / ((double) point2.y));
                if (abs2 < i && round == this.f1329Ag) {
                    i2 = list3.indexOf(point2);
                    i = abs2;
                }
            }
        }
        return i2;
    }

    /* renamed from: a */
    private int m1192a(Integer num, Integer num2, List<Point> list) {
        long j = 0;
        int i = -1;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Point point = list.get(i2);
            long j2 = (long) (point.x * point.y);
            if ((num == null || j2 >= ((long) num.intValue())) && ((num2 == null || j2 <= ((long) num2.intValue())) && j2 > j)) {
                i = i2;
                j = j2;
            }
        }
        return i;
    }

    /* renamed from: a */
    private int m1191a(int i, int i2, Point point, List<Point> list) {
        int i3;
        int abs;
        while (true) {
            if (list == null || list.size() <= 0) {
                i3 = -1;
            } else {
                int i4 = 99999;
                i3 = -1;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    Point point2 = list.get(i5);
                    if ((point == null || (point.x <= point2.x && point.y <= point2.y)) && (abs = Math.abs(point2.x - i) + Math.abs(point2.y - i2)) < i4) {
                        i3 = i5;
                        i4 = abs;
                    }
                }
            }
            if (i3 != -1 || point == null) {
                return i3;
            }
            point = null;
        }
        return i3;
    }

    /* renamed from: c */
    private void m1199c(Exception exc) {
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("  Encountered exception: ");
        sb.append(exc.toString());
        C0767k.m1801b(str, sb.toString());
        String str2 = TAG;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("  Detail: ");
        sb2.append(exc.getMessage());
        C0767k.m1801b(str2, sb2.toString());
        C0767k.m1801b(TAG, "  Trace: ");
        for (StackTraceElement obj : exc.getStackTrace()) {
            String str3 = TAG;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("    ");
            sb3.append(obj.toString());
            C0767k.m1801b(str3, sb3.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: jq */
    public final Point mo11479jq() {
        Point point = this.f1327Ae;
        if (point != null) {
            return point;
        }
        Display defaultDisplay = ((WindowManager) this.f1326Ad.getSystemService("window")).getDefaultDisplay();
        if (Build.VERSION.SDK_INT >= 13) {
            return m1196b(defaultDisplay);
        }
        return m1194a(defaultDisplay);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo11467d(long j) {
        this.f1329Ag = j;
    }

    /* renamed from: a */
    private Point m1194a(Display display) {
        return new Point(display.getWidth(), display.getHeight());
    }

    /* renamed from: b */
    private Point m1196b(Display display) {
        Point point = new Point(0, 0);
        display.getSize(point);
        return point;
    }

    /* renamed from: f */
    public final List<Point> mo11469f(C0498d dVar) {
        if (this.f1344Av == null) {
            C0767k.m1801b(TAG, "==== getSupportedPreviewSizes ====");
            List<Point> supportedPreviewSizes = dVar.getSupportedPreviewSizes();
            this.f1344Av = supportedPreviewSizes;
            int i = mo11479jq().x;
            int i2 = mo11479jq().y;
            C0767k.m1801b(TAG, "  Supported Sizes: ");
            for (Point next : supportedPreviewSizes) {
                C0767k.m1801b(TAG, String.format("    %dx%d", new Object[]{Integer.valueOf(next.x), Integer.valueOf(next.y)}));
            }
            if (m1202jr()) {
                mo11480js();
            } else {
                Iterator<Point> it = this.f1344Av.iterator();
                while (it.hasNext()) {
                    Point next2 = it.next();
                    if (((float) (next2.x * next2.y)) / ((float) (i * i2)) > 4.2f) {
                        C0767k.m1814d(TAG, String.format("    Removing: %dx%d (too big for Size of ImageCaptureView) ", new Object[]{Integer.valueOf(next2.x), Integer.valueOf(next2.y)}));
                        it.remove();
                    } else if (m1193a(next2, dVar) == null) {
                        C0767k.m1814d(TAG, String.format("    Removing %dx%d (no corresponding picture resolution)", new Object[]{Integer.valueOf(next2.x), Integer.valueOf(next2.y)}));
                        it.remove();
                    }
                }
            }
            C0767k.m1801b(TAG, "  Supported Sizes After Matching: ");
            for (Point next3 : this.f1344Av) {
                C0767k.m1801b(TAG, String.format("    %dx%d", new Object[]{Integer.valueOf(next3.x), Integer.valueOf(next3.y)}));
            }
            C0767k.m1801b(TAG, "==== end getSupportedPreviewSizes ====");
        }
        return this.f1344Av;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final List<Point> mo11472g(C0498d dVar) {
        if (this.f1345Aw == null) {
            C0767k.m1801b(TAG, "==== getSupportedPictureSizes ====");
            this.f1345Aw = dVar.getSupportedPictureSizes();
            C0767k.m1801b(TAG, "  Supported Sizes: ");
            for (Point next : this.f1345Aw) {
                String str = TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("    ");
                sb.append(next.x);
                sb.append("x");
                sb.append(next.y);
                C0767k.m1801b(str, sb.toString());
            }
            if (m1202jr()) {
                Point point = this.f1345Aw.get(0);
                if (Utility.IS_NEXUS_7) {
                    point.set(1024, 768);
                } else {
                    point.set(1280, 960);
                }
                this.f1345Aw.clear();
                this.f1345Aw.add(point);
                C0767k.m1814d(TAG, String.format("  Device requires forced picture size: %dx%d", new Object[]{Integer.valueOf(point.x), Integer.valueOf(point.y)}));
            }
            C0767k.m1801b(TAG, "==== end getSupportedPictureSizes ====");
        }
        return this.f1345Aw;
    }

    /* renamed from: jr */
    private boolean m1202jr() {
        if (this.f1343Au) {
            return Utility.IS_NEXUS_7 || Utility.IS_NEXUS_4;
        }
        return Utility.IS_NEXUS_10;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: js */
    public final void mo11480js() {
        Point point = new Point(640, C0608h.f1447Az);
        this.f1344Av.clear();
        this.f1344Av.add(point);
        C0767k.m1814d(TAG, String.format("   Device requires forced preview size: %dx%d", new Object[]{Integer.valueOf(point.x), Integer.valueOf(point.y)}));
    }
}

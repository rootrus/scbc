package com.kofax.mobile.sdk._internal.impl.camera;

import com.kofax.mobile.sdk._internal.C0767k;
import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk._internal.camera.C0497c;
import com.kofax.mobile.sdk._internal.camera.C0502h;
import com.kofax.mobile.sdk._internal.camera.C0505k;
import com.kofax.mobile.sdk._internal.camera.C0511t;
import com.kofax.mobile.sdk._internal.camera.IVideoResourceProvider;
import com.kofax.mobile.sdk._internal.dagger.C0519a;
import com.kofax.mobile.sdk._internal.dagger.C7896d;
import com.kofax.mobile.sdk._internal.impl.camera.C0559ai;
import com.kofax.mobile.sdk._internal.impl.event.C0698u;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p040o.FragmentBuilder_BindEasycashReviewFragment;
import p040o.HmlPinActivity;

@C0519a
/* renamed from: com.kofax.mobile.sdk._internal.impl.camera.am */
public class C0564am implements C0511t {

    /* renamed from: DA */
    private C0505k f1288DA = null;

    /* renamed from: DB */
    private boolean f1289DB;

    /* renamed from: DC */
    private List<C0568a> f1290DC = new ArrayList();

    /* renamed from: DD */
    private Map<C0559ai.C0560a, C0568a> f1291DD = new HashMap();

    /* renamed from: DE */
    private List<C0568a> f1292DE = new ArrayList();

    /* renamed from: Dy */
    private C0502h f1293Dy;

    /* renamed from: Dz */
    private C0497c f1294Dz = null;
    private IBus _bus;

    @FragmentBuilder_BindEasycashReviewFragment
    /* renamed from: ko */
    public C0698u mo11442ko() {
        return new C0698u(!this.f1289DB);
    }

    @HmlPinActivity
    public C0564am(IBus iBus, IVideoResourceProvider iVideoResourceProvider) {
        if (iBus != null) {
            this._bus = iBus;
            C0502h fileProvider = iVideoResourceProvider.getFileProvider();
            this.f1293Dy = fileProvider;
            if (fileProvider == null || !fileProvider.exists()) {
                throw new IllegalArgumentException("dataFileProvider and the file it provides cannot be null");
            }
            this._bus.register(this);
            return;
        }
        throw new IllegalArgumentException("bus cannot be null");
    }

    /* renamed from: a */
    private void m1152a(C7896d dVar) {
        this._bus.unregister(this);
    }

    /* renamed from: a */
    public void mo11204a(C0497c cVar) {
        this.f1294Dz = cVar;
    }

    /* renamed from: c */
    public void mo11206c(C0505k kVar) {
        this.f1288DA = kVar;
    }

    /* renamed from: c */
    public void mo11205c(long j) {
        this.f1289DB = true;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1293Dy.getPath());
        sb.append(".data");
        try {
            InputStream open = this.f1293Dy.open(sb.toString());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                this.f1290DC.add(new C0568a(readLine));
            }
            Collections.sort(this.f1290DC, new Comparator<C0568a>() {
                /* renamed from: a */
                public int compare(C0568a aVar, C0568a aVar2) {
                    return Long.valueOf(aVar.f1300DJ).compareTo(Long.valueOf(aVar2.f1300DJ));
                }
            });
            open.close();
        } catch (Exception e) {
            C0767k.m1820e("VideoPlayerEventsPlayer", e.getMessage());
        }
        this._bus.post(mo11442ko());
    }

    public void stop() {
        this.f1289DB = false;
        this._bus.post(mo11442ko());
    }

    /* renamed from: com.kofax.mobile.sdk._internal.impl.camera.am$3 */
    static /* synthetic */ class C05673 {

        /* renamed from: DG */
        static final /* synthetic */ int[] f1297DG;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.kofax.mobile.sdk._internal.impl.camera.ai$a[] r0 = com.kofax.mobile.sdk._internal.impl.camera.C0559ai.C0560a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1297DG = r0
                com.kofax.mobile.sdk._internal.impl.camera.ai$a r1 = com.kofax.mobile.sdk._internal.impl.camera.C0559ai.C0560a.AutoFocus     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1297DG     // Catch:{ NoSuchFieldError -> 0x001d }
                com.kofax.mobile.sdk._internal.impl.camera.ai$a r1 = com.kofax.mobile.sdk._internal.impl.camera.C0559ai.C0560a.AutoFocusMove     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1297DG     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.kofax.mobile.sdk._internal.impl.camera.ai$a r1 = com.kofax.mobile.sdk._internal.impl.camera.C0559ai.C0560a.LevelChangedEvent     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f1297DG     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.kofax.mobile.sdk._internal.impl.camera.ai$a r1 = com.kofax.mobile.sdk._internal.impl.camera.C0559ai.C0560a.StabilityChangedEvent     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk._internal.impl.camera.C0564am.C05673.<clinit>():void");
        }
    }

    /* renamed from: a */
    private void m1153a(C0568a aVar) {
        int i = C05673.f1297DG[aVar.f1298DH.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this._bus.post(C0559ai.m1136ae(aVar.f1299DI));
                } else if (i == 4) {
                    this._bus.post(C0559ai.m1137af(aVar.f1299DI));
                }
            } else if (this.f1294Dz != null) {
                this.f1294Dz.mo11147j(C0559ai.m1135ad(aVar.f1299DI));
            }
        } else if (this.f1288DA != null) {
            this.f1288DA.mo11197k(C0559ai.m1134ac(aVar.f1299DI));
        }
    }

    /* renamed from: a */
    public void mo11203a(long j, int i) {
        this.f1291DD.clear();
        this.f1292DE.clear();
        for (C0568a next : this.f1290DC) {
            if (next.f1300DJ > j) {
                break;
            } else if (next.cycle != i) {
                this.f1291DD.put(next.f1298DH, next);
                next.cycle = i;
            }
        }
        this.f1292DE.addAll(this.f1291DD.values());
        Collections.sort(this.f1292DE, new Comparator<C0568a>() {
            /* renamed from: a */
            public int compare(C0568a aVar, C0568a aVar2) {
                return -aVar.f1298DH.name().compareTo(aVar2.f1298DH.name());
            }
        });
        for (C0568a a : this.f1292DE) {
            m1153a(a);
        }
    }

    /* renamed from: com.kofax.mobile.sdk._internal.impl.camera.am$a */
    static class C0568a {

        /* renamed from: DH */
        final C0559ai.C0560a f1298DH;

        /* renamed from: DI */
        final String f1299DI;

        /* renamed from: DJ */
        final long f1300DJ;
        int cycle = -1;

        C0568a(String str) {
            this.f1299DI = str;
            this.f1298DH = C0559ai.m1133ab(str);
            this.f1300DJ = C0559ai.m1132aa(str);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf(this.f1300DJ));
            sb.append(", ");
            sb.append(this.f1298DH.name());
            sb.append(", ");
            sb.append(this.f1299DI);
            return sb.toString();
        }
    }
}

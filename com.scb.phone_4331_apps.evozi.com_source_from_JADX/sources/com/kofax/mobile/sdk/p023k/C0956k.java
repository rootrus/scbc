package com.kofax.mobile.sdk.p023k;

import java.util.ArrayDeque;
import java.util.Iterator;

/* renamed from: com.kofax.mobile.sdk.k.k */
public class C0956k {

    /* renamed from: GB */
    private static final int f2321GB = 5;

    /* renamed from: GC */
    private static final int f2322GC = 2;

    /* renamed from: GD */
    private static final int f2323GD = 10;

    /* renamed from: GE */
    private final ArrayDeque<Double> f2324GE = new ArrayDeque<>(10);

    /* renamed from: GF */
    private int f2325GF = 0;

    /* renamed from: GG */
    private int f2326GG = 5;

    /* renamed from: GH */
    private boolean f2327GH = false;
    private int stability = 0;

    /* renamed from: l */
    public void mo12355l(int i, int i2) {
        while (this.f2324GE.size() > 9) {
            this.f2324GE.removeFirst();
        }
        this.f2324GE.addLast(Double.valueOf((double) i2));
        int lv = m2488lv();
        this.stability = lv;
        int m = m2489m(lv);
        this.f2325GF = m;
        boolean z = this.stability > i || m < 100 - i;
        boolean z2 = this.f2327GH;
        int i3 = 2;
        if (z == z2) {
            if (!z2) {
                i3 = 5;
            }
            this.f2326GG = i3;
            return;
        }
        int i4 = this.f2326GG - 1;
        this.f2326GG = i4;
        if (i4 == 0) {
            this.f2327GH = z;
            if (!z) {
                i3 = 5;
            }
            this.f2326GG = i3;
        }
    }

    /* renamed from: lv */
    private int m2488lv() {
        if (this.f2324GE.size() == 0) {
            return 0;
        }
        double d = 0.0d;
        Iterator<Double> it = this.f2324GE.iterator();
        while (it.hasNext()) {
            d += it.next().doubleValue();
        }
        return (int) (d / ((double) this.f2324GE.size()));
    }

    /* renamed from: m */
    private int m2489m(int i) {
        if (this.f2324GE.size() == 0) {
            return 0;
        }
        double d = 0.0d;
        Iterator<Double> it = this.f2324GE.iterator();
        while (it.hasNext()) {
            Double next = it.next();
            double d2 = (double) i;
            d += (next.doubleValue() - d2) * (next.doubleValue() - d2);
        }
        return (int) Math.sqrt(d / ((double) this.f2324GE.size()));
    }

    /* renamed from: kJ */
    public boolean mo12354kJ() {
        return this.f2327GH;
    }

    /* renamed from: lw */
    public int mo12356lw() {
        return this.stability;
    }

    /* renamed from: lx */
    public int mo12357lx() {
        return this.f2325GF;
    }
}

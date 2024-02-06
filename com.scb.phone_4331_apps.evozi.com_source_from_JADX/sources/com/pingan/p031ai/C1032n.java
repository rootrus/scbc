package com.pingan.p031ai;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.pingan.ai.n */
public final class C1032n {

    /* renamed from: a */
    public int[] f2517a;

    /* renamed from: b */
    public List<Integer> f2518b;

    /* renamed from: c */
    public boolean f2519c;

    public C1032n() {
        mo12650d();
    }

    /* renamed from: a */
    public final void mo12645a(int i) {
        mo12650d();
        if (i == 2003) {
            int[] iArr = this.f2517a;
            iArr[0] = iArr[0] + 1;
        } else if (i == 2019) {
            int[] iArr2 = this.f2517a;
            iArr2[1] = iArr2[1] + 1;
        } else if (i == 2020) {
            int[] iArr3 = this.f2517a;
            iArr3[2] = iArr3[2] + 1;
        } else if (i == 2018) {
            int[] iArr4 = this.f2517a;
            iArr4[3] = iArr4[3] + 1;
        } else if (i == 3003) {
            int[] iArr5 = this.f2517a;
            iArr5[4] = iArr5[4] + 1;
        } else if (i == 3001) {
            int[] iArr6 = this.f2517a;
            iArr6[5] = iArr6[5] + 1;
        } else if (i == 3004) {
            int[] iArr7 = this.f2517a;
            iArr7[6] = iArr7[6] + 1;
        }
    }

    /* renamed from: b */
    public final String mo12648b() {
        if (this.f2519c) {
            return "scene3";
        }
        List<Integer> list = this.f2518b;
        return (list == null || list.isEmpty()) ? "scene1" : "scene2";
    }

    /* renamed from: c */
    public final String mo12649c() {
        mo12650d();
        StringBuilder sb = new StringBuilder();
        sb.append("2003-");
        sb.append(this.f2517a[0]);
        sb.append("&2019-");
        sb.append(this.f2517a[1]);
        sb.append("&2020-");
        sb.append(this.f2517a[2]);
        sb.append("&2018-");
        sb.append(this.f2517a[3]);
        sb.append("&3003-");
        sb.append(this.f2517a[4]);
        sb.append("&3001-");
        sb.append(this.f2517a[5]);
        sb.append("&3004-");
        sb.append(this.f2517a[6]);
        return sb.toString();
    }

    /* renamed from: d */
    public final void mo12650d() {
        if (this.f2517a == null) {
            this.f2517a = new int[10];
            for (int i = 0; i < 10; i++) {
                this.f2517a[i] = 0;
            }
        }
    }

    /* renamed from: e */
    public final void mo12651e() {
        this.f2517a = null;
        this.f2519c = false;
        List<Integer> list = this.f2518b;
        if (list != null) {
            list.clear();
        }
    }

    /* renamed from: a */
    public final void mo12646a(List<Integer> list) {
        if (this.f2518b == null) {
            this.f2518b = new ArrayList();
        }
        this.f2518b.clear();
        if (list != null && !list.isEmpty()) {
            this.f2518b.addAll(list);
        }
    }

    /* renamed from: a */
    public final void mo12647a(boolean z) {
        this.f2519c = z;
    }

    /* renamed from: a */
    public final int mo12644a() {
        List<Integer> list = this.f2518b;
        if (list == null) {
            return 0;
        }
        return list.size() + (this.f2519c ? 1 : 0);
    }
}

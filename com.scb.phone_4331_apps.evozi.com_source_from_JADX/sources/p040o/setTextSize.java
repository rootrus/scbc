package p040o;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p040o.AppCompatCheckedTextView;

/* renamed from: o.setTextSize */
public class setTextSize implements AppCompatCheckedTextView.write {
    public setCheckMarkDrawable IconCompatParcelizer = null;
    public final C1134xe5b94a38 MediaBrowserCompat$CustomActionResultReceiver;
    public float MediaBrowserCompat$ItemReceiver = BitmapDescriptorFactory.HUE_RED;
    public boolean read = false;

    public setTextSize(AppCompatAutoCompleteTextView appCompatAutoCompleteTextView) {
        this.MediaBrowserCompat$CustomActionResultReceiver = new C1134xe5b94a38(this, appCompatAutoCompleteTextView);
    }

    /* access modifiers changed from: package-private */
    public final boolean write() {
        setCheckMarkDrawable setcheckmarkdrawable = this.IconCompatParcelizer;
        return setcheckmarkdrawable != null && (setcheckmarkdrawable.write == setCheckMarkDrawable$MediaBrowserCompat$ItemReceiver.UNRESTRICTED || this.MediaBrowserCompat$ItemReceiver >= BitmapDescriptorFactory.HUE_RED);
    }

    public final setTextSize IconCompatParcelizer(setCheckMarkDrawable setcheckmarkdrawable, setCheckMarkDrawable setcheckmarkdrawable2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            }
            this.MediaBrowserCompat$ItemReceiver = (float) i;
        }
        if (!z) {
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(setcheckmarkdrawable, -1.0f);
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(setcheckmarkdrawable2, 1.0f);
        } else {
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(setcheckmarkdrawable, 1.0f);
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(setcheckmarkdrawable2, -1.0f);
        }
        return this;
    }

    public final setTextSize read(setCheckMarkDrawable setcheckmarkdrawable, setCheckMarkDrawable setcheckmarkdrawable2, setCheckMarkDrawable setcheckmarkdrawable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            }
            this.MediaBrowserCompat$ItemReceiver = (float) i;
        }
        if (!z) {
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(setcheckmarkdrawable, -1.0f);
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(setcheckmarkdrawable2, 1.0f);
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(setcheckmarkdrawable3, 1.0f);
        } else {
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(setcheckmarkdrawable, 1.0f);
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(setcheckmarkdrawable2, -1.0f);
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(setcheckmarkdrawable3, -1.0f);
        }
        return this;
    }

    public final setTextSize IconCompatParcelizer(setCheckMarkDrawable setcheckmarkdrawable, setCheckMarkDrawable setcheckmarkdrawable2, setCheckMarkDrawable setcheckmarkdrawable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            }
            this.MediaBrowserCompat$ItemReceiver = (float) i;
        }
        if (!z) {
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(setcheckmarkdrawable, -1.0f);
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(setcheckmarkdrawable2, 1.0f);
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(setcheckmarkdrawable3, -1.0f);
        } else {
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(setcheckmarkdrawable, 1.0f);
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(setcheckmarkdrawable2, -1.0f);
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(setcheckmarkdrawable3, 1.0f);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public final setTextSize MediaBrowserCompat$CustomActionResultReceiver(setCheckMarkDrawable setcheckmarkdrawable, setCheckMarkDrawable setcheckmarkdrawable2, int i, float f, setCheckMarkDrawable setcheckmarkdrawable3, setCheckMarkDrawable setcheckmarkdrawable4, int i2) {
        if (setcheckmarkdrawable2 == setcheckmarkdrawable3) {
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(setcheckmarkdrawable, 1.0f);
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(setcheckmarkdrawable4, 1.0f);
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(setcheckmarkdrawable2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(setcheckmarkdrawable, 1.0f);
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(setcheckmarkdrawable2, -1.0f);
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(setcheckmarkdrawable3, -1.0f);
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(setcheckmarkdrawable4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.MediaBrowserCompat$ItemReceiver = (float) ((-i) + i2);
            }
        } else if (f <= BitmapDescriptorFactory.HUE_RED) {
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(setcheckmarkdrawable, -1.0f);
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(setcheckmarkdrawable2, 1.0f);
            this.MediaBrowserCompat$ItemReceiver = (float) i;
        } else if (f >= 1.0f) {
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(setcheckmarkdrawable3, -1.0f);
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(setcheckmarkdrawable4, 1.0f);
            this.MediaBrowserCompat$ItemReceiver = (float) i2;
        } else {
            float f2 = 1.0f - f;
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(setcheckmarkdrawable, f2);
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(setcheckmarkdrawable2, -f2);
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(setcheckmarkdrawable3, -1.0f * f);
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(setcheckmarkdrawable4, f);
            if (i > 0 || i2 > 0) {
                this.MediaBrowserCompat$ItemReceiver = (((float) (-i)) * f2) + (((float) i2) * f);
            }
        }
        return this;
    }

    public final setTextSize write(AppCompatCheckedTextView appCompatCheckedTextView, int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(appCompatCheckedTextView.MediaBrowserCompat$ItemReceiver(i, "ep"), 1.0f);
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(appCompatCheckedTextView.MediaBrowserCompat$ItemReceiver(i, "em"), -1.0f);
        return this;
    }

    public final setTextSize MediaBrowserCompat$ItemReceiver(setCheckMarkDrawable setcheckmarkdrawable, setCheckMarkDrawable setcheckmarkdrawable2, setCheckMarkDrawable setcheckmarkdrawable3, setCheckMarkDrawable setcheckmarkdrawable4, float f) {
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(setcheckmarkdrawable, -1.0f);
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(setcheckmarkdrawable2, 1.0f);
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(setcheckmarkdrawable3, f);
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(setcheckmarkdrawable4, -f);
        return this;
    }

    public final setTextSize IconCompatParcelizer(setCheckMarkDrawable setcheckmarkdrawable, setCheckMarkDrawable setcheckmarkdrawable2, setCheckMarkDrawable setcheckmarkdrawable3, setCheckMarkDrawable setcheckmarkdrawable4, float f) {
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(setcheckmarkdrawable3, 0.5f);
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(setcheckmarkdrawable4, 0.5f);
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(setcheckmarkdrawable, -0.5f);
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(setcheckmarkdrawable2, -0.5f);
        this.MediaBrowserCompat$ItemReceiver = -f;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
        if (r14.MediaMetadataCompat > 1) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0063, code lost:
        if (r14.MediaMetadataCompat > 1) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0081, code lost:
        if (r14.MediaMetadataCompat > 1) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x008c, code lost:
        if (r14.MediaMetadataCompat > 1) goto L_0x0083;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00a0 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean MediaBrowserCompat$ItemReceiver(p040o.AppCompatCheckedTextView r17) {
        /*
            r16 = this;
            r0 = r16
            o.AlertController$RecycleListView$MediaBrowserCompat$SearchResultReceiver r1 = r0.MediaBrowserCompat$CustomActionResultReceiver
            int r2 = r1.MediaBrowserCompat$SearchResultReceiver
            r3 = 0
            r4 = 0
            r6 = r3
            r8 = r4
            r9 = r8
            r7 = 0
            r10 = 0
            r11 = 0
        L_0x000e:
            r12 = -1
            r13 = 1
            if (r2 == r12) goto L_0x00a8
            int r12 = r1.MediaBrowserCompat$CustomActionResultReceiver
            if (r7 >= r12) goto L_0x00a8
            float[] r12 = r1.read
            r12 = r12[r2]
            o.AppCompatAutoCompleteTextView r14 = r1.IconCompatParcelizer
            o.setCheckMarkDrawable[] r14 = r14.MediaBrowserCompat$ItemReceiver
            int[] r15 = r1.write
            r15 = r15[r2]
            r14 = r14[r15]
            int r15 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r15 >= 0) goto L_0x0039
            r15 = -1165815185(0xffffffffba83126f, float:-0.001)
            int r15 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r15 <= 0) goto L_0x004a
            float[] r12 = r1.read
            r12[r2] = r4
            o.setTextSize r12 = r1.RatingCompat
            r14.IconCompatParcelizer(r12)
            goto L_0x0049
        L_0x0039:
            r15 = 981668463(0x3a83126f, float:0.001)
            int r15 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r15 >= 0) goto L_0x004a
            float[] r12 = r1.read
            r12[r2] = r4
            o.setTextSize r12 = r1.RatingCompat
            r14.IconCompatParcelizer(r12)
        L_0x0049:
            r12 = r4
        L_0x004a:
            int r15 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r15 == 0) goto L_0x00a0
            o.setCheckMarkDrawable$MediaBrowserCompat$ItemReceiver r15 = r14.write
            o.setCheckMarkDrawable$MediaBrowserCompat$ItemReceiver r5 = p040o.setCheckMarkDrawable$MediaBrowserCompat$ItemReceiver.UNRESTRICTED
            if (r15 != r5) goto L_0x0077
            if (r3 != 0) goto L_0x005d
            int r3 = r14.MediaMetadataCompat
            if (r3 <= r13) goto L_0x005b
        L_0x005a:
            r13 = 0
        L_0x005b:
            r11 = r13
            goto L_0x0066
        L_0x005d:
            int r5 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r5 <= 0) goto L_0x0069
            int r3 = r14.MediaMetadataCompat
            if (r3 <= r13) goto L_0x005b
            goto L_0x005a
        L_0x0066:
            r9 = r12
        L_0x0067:
            r3 = r14
            goto L_0x00a0
        L_0x0069:
            if (r11 != 0) goto L_0x00a0
            int r5 = r14.MediaMetadataCompat
            if (r5 <= r13) goto L_0x0071
            r5 = 0
            goto L_0x0072
        L_0x0071:
            r5 = r13
        L_0x0072:
            if (r5 == 0) goto L_0x00a0
            r9 = r12
            r11 = r13
            goto L_0x0067
        L_0x0077:
            if (r3 != 0) goto L_0x00a0
            int r5 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x00a0
            if (r6 != 0) goto L_0x0086
            int r5 = r14.MediaMetadataCompat
            if (r5 <= r13) goto L_0x0084
        L_0x0083:
            r13 = 0
        L_0x0084:
            r10 = r13
            goto L_0x008f
        L_0x0086:
            int r5 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r5 <= 0) goto L_0x0092
            int r5 = r14.MediaMetadataCompat
            if (r5 <= r13) goto L_0x0084
            goto L_0x0083
        L_0x008f:
            r8 = r12
        L_0x0090:
            r6 = r14
            goto L_0x00a0
        L_0x0092:
            if (r10 != 0) goto L_0x00a0
            int r5 = r14.MediaMetadataCompat
            if (r5 <= r13) goto L_0x009a
            r5 = 0
            goto L_0x009b
        L_0x009a:
            r5 = r13
        L_0x009b:
            if (r5 == 0) goto L_0x00a0
            r8 = r12
            r10 = r13
            goto L_0x0090
        L_0x00a0:
            int[] r5 = r1.MediaBrowserCompat$ItemReceiver
            r2 = r5[r2]
            int r7 = r7 + 1
            goto L_0x000e
        L_0x00a8:
            if (r3 == 0) goto L_0x00ab
            goto L_0x00ac
        L_0x00ab:
            r3 = r6
        L_0x00ac:
            if (r3 != 0) goto L_0x00b0
            r5 = r13
            goto L_0x00b4
        L_0x00b0:
            r0.IconCompatParcelizer(r3)
            r5 = 0
        L_0x00b4:
            o.AlertController$RecycleListView$MediaBrowserCompat$SearchResultReceiver r1 = r0.MediaBrowserCompat$CustomActionResultReceiver
            int r1 = r1.MediaBrowserCompat$CustomActionResultReceiver
            if (r1 != 0) goto L_0x00bc
            r0.read = r13
        L_0x00bc:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setTextSize.MediaBrowserCompat$ItemReceiver(o.AppCompatCheckedTextView):boolean");
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(setCheckMarkDrawable setcheckmarkdrawable) {
        setCheckMarkDrawable setcheckmarkdrawable2 = this.IconCompatParcelizer;
        if (setcheckmarkdrawable2 != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(setcheckmarkdrawable2, -1.0f);
            this.IconCompatParcelizer = null;
        }
        float f = -this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(setcheckmarkdrawable, true);
        this.IconCompatParcelizer = setcheckmarkdrawable;
        if (f != 1.0f) {
            this.MediaBrowserCompat$ItemReceiver /= f;
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(f);
        }
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
        return this.IconCompatParcelizer == null && this.MediaBrowserCompat$ItemReceiver == BitmapDescriptorFactory.HUE_RED && this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver == 0;
    }

    public final setCheckMarkDrawable write(boolean[] zArr) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(zArr, (setCheckMarkDrawable) null);
    }

    public final void IconCompatParcelizer() {
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer();
        this.IconCompatParcelizer = null;
        this.MediaBrowserCompat$ItemReceiver = BitmapDescriptorFactory.HUE_RED;
    }

    public final void read(AppCompatCheckedTextView.write write) {
        if (write instanceof setTextSize) {
            setTextSize settextsize = (setTextSize) write;
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer();
            for (int i = 0; i < settextsize.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver; i++) {
                this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(settextsize.MediaBrowserCompat$CustomActionResultReceiver.write(i), settextsize.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(i), true);
            }
        }
    }

    public void write(setCheckMarkDrawable setcheckmarkdrawable) {
        float f;
        if (setcheckmarkdrawable.MediaBrowserCompat$MediaItem != 1) {
            if (setcheckmarkdrawable.MediaBrowserCompat$MediaItem == 2) {
                f = 1000.0f;
            } else if (setcheckmarkdrawable.MediaBrowserCompat$MediaItem == 3) {
                f = 1000000.0f;
            } else if (setcheckmarkdrawable.MediaBrowserCompat$MediaItem == 4) {
                f = 1.0E9f;
            } else if (setcheckmarkdrawable.MediaBrowserCompat$MediaItem == 5) {
                f = 1.0E12f;
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(setcheckmarkdrawable, f);
        }
        f = 1.0f;
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(setcheckmarkdrawable, f);
    }

    public final setCheckMarkDrawable read() {
        return this.IconCompatParcelizer;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r9 = this;
            o.setCheckMarkDrawable r0 = r9.IconCompatParcelizer
            if (r0 != 0) goto L_0x0007
            java.lang.String r0 = "0"
            goto L_0x0015
        L_0x0007:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            o.setCheckMarkDrawable r1 = r9.IconCompatParcelizer
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0015:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r9.MediaBrowserCompat$ItemReceiver
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0042
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r9.MediaBrowserCompat$ItemReceiver
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r4
            goto L_0x0043
        L_0x0042:
            r1 = r3
        L_0x0043:
            o.AlertController$RecycleListView$MediaBrowserCompat$SearchResultReceiver r5 = r9.MediaBrowserCompat$CustomActionResultReceiver
            int r5 = r5.MediaBrowserCompat$CustomActionResultReceiver
        L_0x0047:
            if (r3 >= r5) goto L_0x00cf
            o.AlertController$RecycleListView$MediaBrowserCompat$SearchResultReceiver r6 = r9.MediaBrowserCompat$CustomActionResultReceiver
            o.setCheckMarkDrawable r6 = r6.write(r3)
            if (r6 == 0) goto L_0x00cb
            o.AlertController$RecycleListView$MediaBrowserCompat$SearchResultReceiver r7 = r9.MediaBrowserCompat$CustomActionResultReceiver
            float r7 = r7.IconCompatParcelizer(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 == 0) goto L_0x00cb
            java.lang.String r6 = r6.toString()
            if (r1 != 0) goto L_0x0077
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x009d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x009c
        L_0x0077:
            if (r8 <= 0) goto L_0x008b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x009d
        L_0x008b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x009c:
            float r7 = -r7
        L_0x009d:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00b3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            goto L_0x00ca
        L_0x00b3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L_0x00ca:
            r1 = r4
        L_0x00cb:
            int r3 = r3 + 1
            goto L_0x0047
        L_0x00cf:
            if (r1 != 0) goto L_0x00e2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00e2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setTextSize.toString():java.lang.String");
    }
}

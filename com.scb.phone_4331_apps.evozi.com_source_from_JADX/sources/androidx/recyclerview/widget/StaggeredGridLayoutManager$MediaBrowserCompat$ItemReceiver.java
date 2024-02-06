package androidx.recyclerview.widget;

import android.view.View;
import java.util.ArrayList;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

class StaggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver {
    ArrayList<View> IconCompatParcelizer = new ArrayList<>();
    final int MediaBrowserCompat$CustomActionResultReceiver;
    int MediaBrowserCompat$ItemReceiver = PKIFailureInfo.systemUnavail;
    final /* synthetic */ StaggeredGridLayoutManager MediaDescriptionCompat;
    int read = 0;
    int write = PKIFailureInfo.systemUnavail;

    StaggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.MediaDescriptionCompat = staggeredGridLayoutManager;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
    }

    /* access modifiers changed from: package-private */
    public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        int i2 = this.write;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.IconCompatParcelizer.size() == 0) {
            return i;
        }
        read();
        return this.write;
    }

    /* access modifiers changed from: package-private */
    public final void read() {
        View view = this.IconCompatParcelizer.get(0);
        view.getLayoutParams();
        this.write = this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(view);
    }

    /* access modifiers changed from: package-private */
    public final int write(int i) {
        int i2 = this.MediaBrowserCompat$ItemReceiver;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.IconCompatParcelizer.size() == 0) {
            return i;
        }
        MediaBrowserCompat$ItemReceiver();
        return this.MediaBrowserCompat$ItemReceiver;
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver() {
        ArrayList<View> arrayList = this.IconCompatParcelizer;
        View view = arrayList.get(arrayList.size() - 1);
        view.getLayoutParams();
        this.MediaBrowserCompat$ItemReceiver = this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(view);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0031, code lost:
        if (r4 != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void write() {
        /*
            r6 = this;
            java.util.ArrayList<android.view.View> r0 = r6.IconCompatParcelizer
            int r0 = r0.size()
            java.util.ArrayList<android.view.View> r1 = r6.IconCompatParcelizer
            int r2 = r0 + -1
            java.lang.Object r1 = r1.remove(r2)
            android.view.View r1 = (android.view.View) r1
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$IconCompatParcelizer r2 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.IconCompatParcelizer) r2
            r3 = 0
            r2.MediaBrowserCompat$CustomActionResultReceiver = r3
            androidx.recyclerview.widget.RecyclerView$setContentView r3 = r2.MediaBrowserCompat$SearchResultReceiver
            int r3 = r3.read
            r3 = r3 & 8
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0025
            r3 = r5
            goto L_0x0026
        L_0x0025:
            r3 = r4
        L_0x0026:
            if (r3 != 0) goto L_0x0033
            androidx.recyclerview.widget.RecyclerView$setContentView r2 = r2.MediaBrowserCompat$SearchResultReceiver
            int r2 = r2.read
            r2 = r2 & 2
            if (r2 == 0) goto L_0x0031
            r4 = r5
        L_0x0031:
            if (r4 == 0) goto L_0x0040
        L_0x0033:
            int r2 = r6.read
            androidx.recyclerview.widget.StaggeredGridLayoutManager r3 = r6.MediaDescriptionCompat
            o.setContentId r3 = r3.MediaBrowserCompat$CustomActionResultReceiver
            int r1 = r3.read(r1)
            int r2 = r2 - r1
            r6.read = r2
        L_0x0040:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r5) goto L_0x0046
            r6.write = r1
        L_0x0046:
            r6.MediaBrowserCompat$ItemReceiver = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver.write():void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        if (r1 != false) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaDescriptionCompat() {
        /*
            r6 = this;
            java.util.ArrayList<android.view.View> r0 = r6.IconCompatParcelizer
            r1 = 0
            java.lang.Object r0 = r0.remove(r1)
            android.view.View r0 = (android.view.View) r0
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$IconCompatParcelizer r2 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.IconCompatParcelizer) r2
            r3 = 0
            r2.MediaBrowserCompat$CustomActionResultReceiver = r3
            java.util.ArrayList<android.view.View> r3 = r6.IconCompatParcelizer
            int r3 = r3.size()
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != 0) goto L_0x001e
            r6.MediaBrowserCompat$ItemReceiver = r4
        L_0x001e:
            androidx.recyclerview.widget.RecyclerView$setContentView r3 = r2.MediaBrowserCompat$SearchResultReceiver
            int r3 = r3.read
            r3 = r3 & 8
            r5 = 1
            if (r3 == 0) goto L_0x0029
            r3 = r5
            goto L_0x002a
        L_0x0029:
            r3 = r1
        L_0x002a:
            if (r3 != 0) goto L_0x0037
            androidx.recyclerview.widget.RecyclerView$setContentView r2 = r2.MediaBrowserCompat$SearchResultReceiver
            int r2 = r2.read
            r2 = r2 & 2
            if (r2 == 0) goto L_0x0035
            r1 = r5
        L_0x0035:
            if (r1 == 0) goto L_0x0044
        L_0x0037:
            int r1 = r6.read
            androidx.recyclerview.widget.StaggeredGridLayoutManager r2 = r6.MediaDescriptionCompat
            o.setContentId r2 = r2.MediaBrowserCompat$CustomActionResultReceiver
            int r0 = r2.read(r0)
            int r1 = r1 - r0
            r6.read = r1
        L_0x0044:
            r6.write = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat():void");
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(int i) {
        int i2 = this.write;
        if (i2 != Integer.MIN_VALUE) {
            this.write = i2 + i;
        }
        int i3 = this.MediaBrowserCompat$ItemReceiver;
        if (i3 != Integer.MIN_VALUE) {
            this.MediaBrowserCompat$ItemReceiver = i3 + i;
        }
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver() {
        if (this.MediaDescriptionCompat.write) {
            return write(this.IconCompatParcelizer.size() - 1, -1, true);
        }
        return write(0, this.IconCompatParcelizer.size(), true);
    }

    public final int IconCompatParcelizer() {
        if (this.MediaDescriptionCompat.write) {
            return write(0, this.IconCompatParcelizer.size(), true);
        }
        return write(this.IconCompatParcelizer.size() - 1, -1, true);
    }

    private int write(int i, int i2, boolean z) {
        int MediaDescriptionCompat2 = this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat();
        int MediaBrowserCompat$ItemReceiver2 = this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = this.IconCompatParcelizer.get(i);
            int MediaBrowserCompat$ItemReceiver3 = this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(view);
            int IconCompatParcelizer2 = this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(view);
            boolean z2 = false;
            boolean z3 = MediaBrowserCompat$ItemReceiver3 <= MediaBrowserCompat$ItemReceiver2;
            if (IconCompatParcelizer2 >= MediaDescriptionCompat2) {
                z2 = true;
            }
            if (z3 && z2 && (MediaBrowserCompat$ItemReceiver3 < MediaDescriptionCompat2 || IconCompatParcelizer2 > MediaBrowserCompat$ItemReceiver2)) {
                return StaggeredGridLayoutManager.MediaMetadataCompat(view);
            }
            i += i3;
        }
        return -1;
    }

    public final View write(int i, int i2) {
        View view = null;
        if (i2 != -1) {
            int size = this.IconCompatParcelizer.size() - 1;
            while (size >= 0) {
                View view2 = this.IconCompatParcelizer.get(size);
                if ((this.MediaDescriptionCompat.write && StaggeredGridLayoutManager.MediaMetadataCompat(view2) >= i) || ((!this.MediaDescriptionCompat.write && StaggeredGridLayoutManager.MediaMetadataCompat(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
        } else {
            int size2 = this.IconCompatParcelizer.size();
            int i3 = 0;
            while (i3 < size2) {
                View view3 = this.IconCompatParcelizer.get(i3);
                if ((this.MediaDescriptionCompat.write && StaggeredGridLayoutManager.MediaMetadataCompat(view3) <= i) || ((!this.MediaDescriptionCompat.write && StaggeredGridLayoutManager.MediaMetadataCompat(view3) >= i) || !view3.hasFocusable())) {
                    break;
                }
                i3++;
                view = view3;
            }
        }
        return view;
    }
}

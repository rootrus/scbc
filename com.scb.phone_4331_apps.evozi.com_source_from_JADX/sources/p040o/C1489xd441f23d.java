package p040o;

/* renamed from: o.setFitsSystemWindows$MediaBrowserCompat$CustomActionResultReceiver */
class C1489xd441f23d {
    int IconCompatParcelizer;
    int MediaBrowserCompat$CustomActionResultReceiver;
    int MediaBrowserCompat$ItemReceiver = 0;
    int read;
    int write;

    C1489xd441f23d() {
    }

    /* access modifiers changed from: package-private */
    public final boolean MediaBrowserCompat$ItemReceiver() {
        int i = this.MediaBrowserCompat$ItemReceiver;
        int i2 = 2;
        if ((i & 7) != 0) {
            int i3 = this.write;
            int i4 = this.read;
            if ((i & (i3 > i4 ? 1 : i3 == i4 ? 2 : 4)) == 0) {
                return false;
            }
        }
        int i5 = this.MediaBrowserCompat$ItemReceiver;
        if ((i5 & 112) != 0) {
            int i6 = this.write;
            int i7 = this.IconCompatParcelizer;
            if ((i5 & ((i6 > i7 ? 1 : i6 == i7 ? 2 : 4) << 4)) == 0) {
                return false;
            }
        }
        int i8 = this.MediaBrowserCompat$ItemReceiver;
        if ((i8 & 1792) != 0) {
            int i9 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int i10 = this.read;
            if ((i8 & ((i9 > i10 ? 1 : i9 == i10 ? 2 : 4) << 8)) == 0) {
                return false;
            }
        }
        int i11 = this.MediaBrowserCompat$ItemReceiver;
        if ((i11 & 28672) != 0) {
            int i12 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int i13 = this.IconCompatParcelizer;
            if (i12 > i13) {
                i2 = 1;
            } else if (i12 != i13) {
                i2 = 4;
            }
            if ((i11 & (i2 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}

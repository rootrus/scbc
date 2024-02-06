package p040o;

/* renamed from: o.setDesignInformation */
public final class setDesignInformation implements CheckExtractActivity {
    private Object IconCompatParcelizer = null;
    private int MediaBrowserCompat$CustomActionResultReceiver = -1;
    private int MediaBrowserCompat$ItemReceiver = -1;
    private int read = 0;
    final CheckExtractActivity write;

    public setDesignInformation(CheckExtractActivity checkExtractActivity) {
        this.write = checkExtractActivity;
    }

    public final void read() {
        int i = this.read;
        if (i != 0) {
            if (i == 1) {
                this.write.read(this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver);
            } else if (i == 2) {
                this.write.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver);
            } else if (i == 3) {
                this.write.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver, this.IconCompatParcelizer);
            }
            this.IconCompatParcelizer = null;
            this.read = 0;
        }
    }

    public final void read(int i, int i2) {
        int i3;
        if (this.read == 1 && i >= (i3 = this.MediaBrowserCompat$CustomActionResultReceiver)) {
            int i4 = this.MediaBrowserCompat$ItemReceiver;
            if (i <= i3 + i4) {
                this.MediaBrowserCompat$ItemReceiver = i4 + i2;
                this.MediaBrowserCompat$CustomActionResultReceiver = Math.min(i, i3);
                return;
            }
        }
        read();
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
        this.MediaBrowserCompat$ItemReceiver = i2;
        this.read = 1;
    }

    public final void MediaBrowserCompat$ItemReceiver(int i, int i2) {
        int i3;
        if (this.read != 2 || (i3 = this.MediaBrowserCompat$CustomActionResultReceiver) < i || i3 > i + i2) {
            read();
            this.MediaBrowserCompat$CustomActionResultReceiver = i;
            this.MediaBrowserCompat$ItemReceiver = i2;
            this.read = 2;
            return;
        }
        this.MediaBrowserCompat$ItemReceiver += i2;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
    }

    public final void IconCompatParcelizer(int i, int i2) {
        read();
        this.write.IconCompatParcelizer(i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r5.MediaBrowserCompat$CustomActionResultReceiver;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaBrowserCompat$CustomActionResultReceiver(int r6, int r7, java.lang.Object r8) {
        /*
            r5 = this;
            int r0 = r5.read
            r1 = 3
            if (r0 != r1) goto L_0x0024
            int r0 = r5.MediaBrowserCompat$CustomActionResultReceiver
            int r2 = r5.MediaBrowserCompat$ItemReceiver
            int r2 = r2 + r0
            if (r6 > r2) goto L_0x0024
            int r3 = r6 + r7
            if (r3 < r0) goto L_0x0024
            java.lang.Object r4 = r5.IconCompatParcelizer
            if (r4 != r8) goto L_0x0024
            int r6 = java.lang.Math.min(r6, r0)
            r5.MediaBrowserCompat$CustomActionResultReceiver = r6
            int r6 = java.lang.Math.max(r2, r3)
            int r7 = r5.MediaBrowserCompat$CustomActionResultReceiver
            int r6 = r6 - r7
            r5.MediaBrowserCompat$ItemReceiver = r6
            return
        L_0x0024:
            r5.read()
            r5.MediaBrowserCompat$CustomActionResultReceiver = r6
            r5.MediaBrowserCompat$ItemReceiver = r7
            r5.IconCompatParcelizer = r8
            r5.read = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setDesignInformation.MediaBrowserCompat$CustomActionResultReceiver(int, int, java.lang.Object):void");
    }
}

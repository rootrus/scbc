package p040o;

import p040o.GoogleApiClient;

/* renamed from: o.getZEnd */
public final class getZEnd {
    public static final getZEnd MediaBrowserCompat$CustomActionResultReceiver = new getZEnd();
    public final int IconCompatParcelizer = 929;
    public final int[] MediaBrowserCompat$ItemReceiver = new int[929];
    public final GoogleApiClient.Builder.IconCompatParcelizer MediaBrowserCompat$MediaItem;
    public final GoogleApiClient.Builder.IconCompatParcelizer read;
    public final int[] write = new int[929];

    private getZEnd() {
        int i = 1;
        for (int i2 = 0; i2 < 929; i2++) {
            this.MediaBrowserCompat$ItemReceiver[i2] = i;
            i = (i * 3) % 929;
        }
        for (int i3 = 0; i3 < 928; i3++) {
            this.write[this.MediaBrowserCompat$ItemReceiver[i3]] = i3;
        }
        this.MediaBrowserCompat$MediaItem = new GoogleApiClient.Builder.IconCompatParcelizer(this, new int[]{0});
        this.read = new GoogleApiClient.Builder.IconCompatParcelizer(this, new int[]{1});
    }

    public final GoogleApiClient.Builder.IconCompatParcelizer write(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.MediaBrowserCompat$MediaItem;
        } else {
            int[] iArr = new int[(i + 1)];
            iArr[0] = i2;
            return new GoogleApiClient.Builder.IconCompatParcelizer(this, iArr);
        }
    }

    public final int MediaBrowserCompat$ItemReceiver(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.MediaBrowserCompat$ItemReceiver;
        int[] iArr2 = this.write;
        return iArr[(iArr2[i] + iArr2[i2]) % 928];
    }
}

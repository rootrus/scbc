package p040o;

/* renamed from: o.rsnScriptSetVarObj */
public final class rsnScriptSetVarObj {
    public static final rsnScriptSetVarObj IconCompatParcelizer = new rsnScriptSetVarObj(4201, 4096, 1);
    public static final rsnScriptSetVarObj MediaBrowserCompat$CustomActionResultReceiver = new rsnScriptSetVarObj(67, 64, 1);
    public static final rsnScriptSetVarObj MediaBrowserCompat$ItemReceiver = new rsnScriptSetVarObj(1033, 1024, 1);
    public static final rsnScriptSetVarObj MediaBrowserCompat$MediaItem = MediaBrowserCompat$CustomActionResultReceiver;
    public static final rsnScriptSetVarObj MediaBrowserCompat$SearchResultReceiver;
    public static final rsnScriptSetVarObj MediaDescriptionCompat = new rsnScriptSetVarObj(285, 256, 0);
    public static final rsnScriptSetVarObj read = new rsnScriptSetVarObj(19, 16, 1);
    public static final rsnScriptSetVarObj write;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final int f2623x50fd9e4a;
    public final int MediaMetadataCompat;
    public final setVariable$MediaBrowserCompat$CustomActionResultReceiver MediaSessionCompat$QueueItem;
    public final setVariable$MediaBrowserCompat$CustomActionResultReceiver MediaSessionCompat$ResultReceiverWrapper;
    public final int[] MediaSessionCompat$Token;
    private final int ParcelableVolumeInfo;
    public final int[] RatingCompat;

    public static int read(int i, int i2) {
        return i ^ i2;
    }

    static {
        rsnScriptSetVarObj rsnscriptsetvarobj = new rsnScriptSetVarObj(301, 256, 1);
        MediaBrowserCompat$SearchResultReceiver = rsnscriptsetvarobj;
        write = rsnscriptsetvarobj;
    }

    private rsnScriptSetVarObj(int i, int i2, int i3) {
        this.ParcelableVolumeInfo = i;
        this.f2623x50fd9e4a = i2;
        this.MediaMetadataCompat = i3;
        this.RatingCompat = new int[i2];
        this.MediaSessionCompat$Token = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.RatingCompat[i5] = i4;
            i4 <<= 1;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.MediaSessionCompat$Token[this.RatingCompat[i6]] = i6;
        }
        this.MediaSessionCompat$QueueItem = new setVariable$MediaBrowserCompat$CustomActionResultReceiver(this, new int[]{0});
        this.MediaSessionCompat$ResultReceiverWrapper = new setVariable$MediaBrowserCompat$CustomActionResultReceiver(this, new int[]{1});
    }

    public final setVariable$MediaBrowserCompat$CustomActionResultReceiver write(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.MediaSessionCompat$QueueItem;
        } else {
            int[] iArr = new int[(i + 1)];
            iArr[0] = i2;
            return new setVariable$MediaBrowserCompat$CustomActionResultReceiver(this, iArr);
        }
    }

    public final int IconCompatParcelizer(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.RatingCompat;
        int[] iArr2 = this.MediaSessionCompat$Token;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f2623x50fd9e4a - 1)];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GF(0x");
        sb.append(Integer.toHexString(this.ParcelableVolumeInfo));
        sb.append(',');
        sb.append(this.f2623x50fd9e4a);
        sb.append(')');
        return sb.toString();
    }
}

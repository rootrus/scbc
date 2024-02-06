package p040o;

import p040o.zzfy;

/* renamed from: o.CryptoService */
public final /* synthetic */ class CryptoService {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    public static final /* synthetic */ int[] MediaBrowserCompat$CustomActionResultReceiver;

    static {
        int[] iArr = new int[zzfy.zzd.values().length];
        IconCompatParcelizer = iArr;
        iArr[zzfy.zzd.SUBMITTED.ordinal()] = 1;
        IconCompatParcelizer[zzfy.zzd.RESUBMIT.ordinal()] = 2;
        IconCompatParcelizer[zzfy.zzd.INITIAL.ordinal()] = 3;
        IconCompatParcelizer[zzfy.zzd.UNKNOWN.ordinal()] = 4;
        int[] iArr2 = new int[zzwd.values().length];
        MediaBrowserCompat$CustomActionResultReceiver = iArr2;
        iArr2[zzwd.CAMERA.ordinal()] = 1;
        MediaBrowserCompat$CustomActionResultReceiver[zzwd.FILE_STORAGE.ordinal()] = 2;
        MediaBrowserCompat$CustomActionResultReceiver[zzwd.GALLERY.ordinal()] = 3;
    }
}

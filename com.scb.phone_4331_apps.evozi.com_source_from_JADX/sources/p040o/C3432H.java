package p040o;

import p040o.access$2300;

/* renamed from: o.H */
public final /* synthetic */ class C3432H implements FundFactSheetActivity {
    private final /* synthetic */ setImageBitmapInternal write;

    public /* synthetic */ C3432H(setImageBitmapInternal setimagebitmapinternal) {
        this.write = setimagebitmapinternal;
    }

    public final Object invoke(Object obj) {
        setImageBitmapInternal setimagebitmapinternal = this.write;
        setimagebitmapinternal.MediaBrowserCompat$ItemReceiver(setimagebitmapinternal.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver((Throwable) obj, access$2300.write.JUST_DISMISS));
        C3328E e = new C3328E(setimagebitmapinternal);
        if (setimagebitmapinternal.RatingCompat != null) {
            e.IconCompatParcelizer(setimagebitmapinternal.RatingCompat);
        }
        setimagebitmapinternal.MediaBrowserCompat$SearchResultReceiver = String.valueOf(setimagebitmapinternal.MediaBrowserCompat$MediaItem);
        setimagebitmapinternal.write = setimagebitmapinternal.MediaMetadataCompat;
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}

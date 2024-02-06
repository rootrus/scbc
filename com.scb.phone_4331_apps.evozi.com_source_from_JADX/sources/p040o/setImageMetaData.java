package p040o;

/* renamed from: o.setImageMetaData */
public final /* synthetic */ class setImageMetaData implements FundFactSheetActivity {
    private final /* synthetic */ setImageBitmapInternal read;

    public /* synthetic */ setImageMetaData(setImageBitmapInternal setimagebitmapinternal) {
        this.read = setimagebitmapinternal;
    }

    public final Object invoke(Object obj) {
        setImageBitmapInternal setimagebitmapinternal = this.read;
        boolean z = true;
        if (setimagebitmapinternal.RatingCompat != null) {
            setimagebitmapinternal.RatingCompat.aj_();
        }
        setImageCreateDateTime setimagecreatedatetime = setImageCreateDateTime.MediaBrowserCompat$ItemReceiver;
        if (setimagebitmapinternal.RatingCompat == null) {
            z = false;
        }
        if (z) {
            setimagecreatedatetime.IconCompatParcelizer(setimagebitmapinternal.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}

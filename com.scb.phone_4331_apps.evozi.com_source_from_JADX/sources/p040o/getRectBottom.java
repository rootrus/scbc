package p040o;

/* renamed from: o.getRectBottom */
public final /* synthetic */ class getRectBottom implements FundFactSheetActivity {
    private final /* synthetic */ setMicrData read;

    public /* synthetic */ getRectBottom(setMicrData setmicrdata) {
        this.read = setmicrdata;
    }

    public final Object invoke(Object obj) {
        setMicrData setmicrdata = this.read;
        getMaxUserProperties getmaxuserproperties = (getMaxUserProperties) obj;
        setmicrdata.MediaDescriptionCompat = getmaxuserproperties;
        boolean z = true;
        if (setmicrdata.RatingCompat != null) {
            setmicrdata.RatingCompat.aj_();
        }
        getBooleanResourceValue read2 = setmicrdata.MediaMetadataCompat.read(getmaxuserproperties);
        setmicrdata.MediaBrowserCompat$SearchResultReceiver = read2;
        toFinalOpString tofinalopstring = new toFinalOpString(setmicrdata, read2.write.get(0).IconCompatParcelizer, read2);
        if (setmicrdata.RatingCompat == null) {
            z = false;
        }
        if (z) {
            tofinalopstring.IconCompatParcelizer(setmicrdata.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}

package p040o;

/* renamed from: o.setError */
public final /* synthetic */ class setError implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ setErrorEnabled write;

    public /* synthetic */ setError(setErrorEnabled seterrorenabled) {
        this.write = seterrorenabled;
    }

    public final Object write(Object obj) {
        setErrorEnabled seterrorenabled = this.write;
        getPlacePhotos getplacephotos = (getPlacePhotos) obj;
        if (getplacephotos != getPlacePhotos.INITIAL) {
            return DebitCardResetOtpActivity.just(getplacephotos);
        }
        C6897xeb950f47 hmlSetNTBPinSuccessActivity$MediaBrowserCompat$ItemReceiver$MediaBrowserCompat$CustomActionResultReceiver = seterrorenabled.read;
        return hmlSetNTBPinSuccessActivity$MediaBrowserCompat$ItemReceiver$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(new onEviction(hmlSetNTBPinSuccessActivity$MediaBrowserCompat$ItemReceiver$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(), "0")).flatMap(setBoxBackgroundMode.read);
    }
}

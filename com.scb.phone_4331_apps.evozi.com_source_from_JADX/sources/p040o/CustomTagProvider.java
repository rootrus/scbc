package p040o;

/* renamed from: o.CustomTagProvider */
public final /* synthetic */ class CustomTagProvider implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ OnCompleteListener read;

    public /* synthetic */ CustomTagProvider(OnCompleteListener onCompleteListener, String str) {
        this.read = onCompleteListener;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final Object write(Object obj) {
        return DebitCardResetOtpActivity.create(new CustomVariableProvider(this.read, this.MediaBrowserCompat$CustomActionResultReceiver, ((PlaceBuffer) obj).read));
    }
}

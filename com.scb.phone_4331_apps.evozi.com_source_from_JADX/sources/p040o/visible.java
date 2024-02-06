package p040o;

/* renamed from: o.visible */
public final /* synthetic */ class visible implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ setUserPropertyInternal read;

    public /* synthetic */ visible(setUserPropertyInternal setuserpropertyinternal) {
        this.read = setuserpropertyinternal;
    }

    public final Object write(Object obj) {
        return DebitCardResetOtpActivity.just(this.read.MediaSessionCompat$QueueItem);
    }
}

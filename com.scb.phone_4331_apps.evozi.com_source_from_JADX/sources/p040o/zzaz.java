package p040o;

import retrofit2.Response;

/* renamed from: o.zzaz */
public final /* synthetic */ class zzaz implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ setTapText MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ String write;

    public /* synthetic */ zzaz(setTapText settaptext, String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = settaptext;
        this.write = str;
    }

    public final Object write(Object obj) {
        return DebitCardResetOtpActivity.create(new canConstantState(this.MediaBrowserCompat$CustomActionResultReceiver, this.write, (Response) obj));
    }
}

package p040o;

import p040o.CustomAdvertisingIdClient;

/* renamed from: o.CustomAdvertisingIdClient$b$MediaBrowserCompat$CustomActionResultReceiver */
public final class C9701x28a40384 extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ CustomAdvertisingIdClient.C3280b read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9701x28a40384(CustomAdvertisingIdClient.C3280b bVar) {
        super(1);
        this.read = bVar;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        onGetStartedClick.write((Object) th, "e");
        CustomAdvertisingIdClient.C3280b.IconCompatParcelizer(this.read);
        CustomAdvertisingIdClient.C3280b.MediaBrowserCompat$ItemReceiver(this.read, th);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}

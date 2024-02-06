package retrofit2;

import p040o.CheckEligibilityActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;

/* renamed from: retrofit2.KotlinExtensions$awaitResponse$$inlined$suspendCancellableCoroutine$lambda$1 */
final class C7578xc95e9eb1 extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ Call $this_awaitResponse$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7578xc95e9eb1(Call call) {
        super(1);
        this.$this_awaitResponse$inlined = call;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }

    public final void invoke(Throwable th) {
        this.$this_awaitResponse$inlined.cancel();
    }
}

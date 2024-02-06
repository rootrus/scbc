package retrofit2;

import p040o.CheckEligibilityActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;

/* renamed from: retrofit2.KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$2 */
final class C7577x19835f11 extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ Call $this_await$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7577x19835f11(Call call) {
        super(1);
        this.$this_await$inlined = call;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }

    public final void invoke(Throwable th) {
        this.$this_await$inlined.cancel();
    }
}

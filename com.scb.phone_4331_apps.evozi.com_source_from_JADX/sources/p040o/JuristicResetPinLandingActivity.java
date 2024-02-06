package p040o;

import java.util.Iterator;

/* renamed from: o.JuristicResetPinLandingActivity */
public class JuristicResetPinLandingActivity extends JuristicOtpActivity {
    public static final <T> BaseJuristicPinActivity_ViewBinding<T> read(Iterator<? extends T> it) {
        onGetStartedClick.write((Object) it, "$this$asSequence");
        BaseJuristicPinActivity_ViewBinding juristicResetPinLandingActivity$MediaBrowserCompat$ItemReceiver = new JuristicResetPinLandingActivity$MediaBrowserCompat$ItemReceiver(it);
        onGetStartedClick.write((Object) juristicResetPinLandingActivity$MediaBrowserCompat$ItemReceiver, "$this$constrainOnce");
        return new ScbsOnboardingTcActivity<>(juristicResetPinLandingActivity$MediaBrowserCompat$ItemReceiver);
    }

    /* renamed from: o.JuristicResetPinLandingActivity$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<T, T> {
        private /* synthetic */ FundActionsSuccessActivity write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(FundActionsSuccessActivity fundActionsSuccessActivity) {
            super(1);
            this.write = fundActionsSuccessActivity;
        }

        public final T invoke(T t) {
            onGetStartedClick.write((Object) t, "it");
            return this.write.invoke();
        }
    }
}

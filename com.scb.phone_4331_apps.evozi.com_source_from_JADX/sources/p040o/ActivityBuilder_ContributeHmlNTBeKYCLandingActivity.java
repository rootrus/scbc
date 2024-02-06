package p040o;

import com.scb.phone.view.fragment.prelogin.quickpromptpay.p054di.SetupQuickPromptPayModule;
import p040o.AppMeasurement;
import p040o.MapConstraints;

/* renamed from: o.ActivityBuilder_ContributeHmlNTBeKYCLandingActivity */
public final class ActivityBuilder_ContributeHmlNTBeKYCLandingActivity implements OPRStatusRewardsLandingActivity_ViewBinding<C4443fz> {
    public static C4443fz IconCompatParcelizer(SetupQuickPromptPayModule setupQuickPromptPayModule, RegularImmutableBiMap regularImmutableBiMap, MapConstraints.ConstrainedMultimap.C36372 r2, AppMeasurement.OnEventListener onEventListener) {
        C4443fz write = setupQuickPromptPayModule.write(regularImmutableBiMap, r2, onEventListener);
        if (write != null) {
            return write;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [o.HmlReviewDocumentActivity, com.scb.phone.view.fragment.prelogin.quickpromptpay.di.SetupQuickPromptPayModule] */
    public final /* synthetic */ Object get() {
        ? r0 = 0;
        C4443fz write = r0.write((RegularImmutableBiMap) r0.get(), (MapConstraints.ConstrainedMultimap.C36372) r0.get(), (AppMeasurement.OnEventListener) r0.get());
        if (write != null) {
            return write;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

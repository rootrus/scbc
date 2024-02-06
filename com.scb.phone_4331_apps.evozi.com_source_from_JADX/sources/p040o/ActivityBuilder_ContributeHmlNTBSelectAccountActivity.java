package p040o;

import com.scb.phone.view.fragment.prelogin.quickbalance.p053di.SetupQuickBalanceModule;
import p040o.AppMeasurement;
import p040o.MapConstraints;

/* renamed from: o.ActivityBuilder_ContributeHmlNTBSelectAccountActivity */
public final class ActivityBuilder_ContributeHmlNTBSelectAccountActivity implements OPRStatusRewardsLandingActivity_ViewBinding<C4433fn> {
    public static C4433fn read(SetupQuickBalanceModule setupQuickBalanceModule, RegularImmutableBiMap regularImmutableBiMap, MapConstraints.ConstrainedMultimap.C36372 r2, AppMeasurement.Param param) {
        C4433fn write = setupQuickBalanceModule.write(regularImmutableBiMap, r2, param);
        if (write != null) {
            return write;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [o.HmlReviewDocumentActivity, com.scb.phone.view.fragment.prelogin.quickbalance.di.SetupQuickBalanceModule] */
    public final /* synthetic */ Object get() {
        ? r0 = 0;
        C4433fn write = r0.write((RegularImmutableBiMap) r0.get(), (MapConstraints.ConstrainedMultimap.C36372) r0.get(), (AppMeasurement.Param) r0.get());
        if (write != null) {
            return write;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

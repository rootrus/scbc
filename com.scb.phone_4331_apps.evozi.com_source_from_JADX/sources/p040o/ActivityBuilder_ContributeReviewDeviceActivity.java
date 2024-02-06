package p040o;

import com.scb.phone.view.fragment.sme.gifting.p056di.ReceiveFragmentModule;
import p040o.C4027ai;

/* renamed from: o.ActivityBuilder_ContributeReviewDeviceActivity */
public final class ActivityBuilder_ContributeReviewDeviceActivity implements OPRStatusRewardsLandingActivity_ViewBinding<C4027ai.C40281> {
    public static C4027ai.C40281 write(ReceiveFragmentModule receiveFragmentModule, pattern pattern, toIntArray tointarray, RegularImmutableBiMap regularImmutableBiMap) {
        C4027ai.C40281 IconCompatParcelizer = receiveFragmentModule.IconCompatParcelizer(pattern, tointarray, regularImmutableBiMap);
        if (IconCompatParcelizer != null) {
            return IconCompatParcelizer;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [o.HmlReviewDocumentActivity, com.scb.phone.view.fragment.sme.gifting.di.ReceiveFragmentModule] */
    public final /* synthetic */ Object get() {
        ? r0 = 0;
        C4027ai.C40281 IconCompatParcelizer = r0.IconCompatParcelizer((pattern) r0.get(), (toIntArray) r0.get(), (RegularImmutableBiMap) r0.get());
        if (IconCompatParcelizer != null) {
            return IconCompatParcelizer;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

package p040o;

import com.scb.phone.view.fragment.sme.gifting.p056di.SentFragmentModule;
import p040o.C4027ai;

/* renamed from: o.ActivityBuilder_ContributeRiskAssessmentSuccessActivity */
public final class ActivityBuilder_ContributeRiskAssessmentSuccessActivity implements OPRStatusRewardsLandingActivity_ViewBinding<C4027ai.C40281> {
    public static C4027ai.C40281 MediaBrowserCompat$ItemReceiver(SentFragmentModule sentFragmentModule, getOrientation getorientation, toIntArray tointarray, RegularImmutableBiMap regularImmutableBiMap) {
        C4027ai.C40281 read = sentFragmentModule.read(getorientation, tointarray, regularImmutableBiMap);
        if (read != null) {
            return read;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [o.HmlReviewDocumentActivity, com.scb.phone.view.fragment.sme.gifting.di.SentFragmentModule] */
    public final /* synthetic */ Object get() {
        ? r0 = 0;
        C4027ai.C40281 read = r0.read((getOrientation) r0.get(), (toIntArray) r0.get(), (RegularImmutableBiMap) r0.get());
        if (read != null) {
            return read;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

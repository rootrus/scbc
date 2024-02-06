package p040o;

import com.scb.phone.view.fragment.ntb.selectaccount.p052di.ProductTermConditionFragmentModule;
import p040o.ByteStreams;
import p040o.Iterables;

/* renamed from: o.ActivityBuilder_ContributeHmlNTBConsentActivity */
public final class ActivityBuilder_ContributeHmlNTBConsentActivity implements OPRStatusRewardsLandingActivity_ViewBinding<C4199cn> {
    public static C4199cn write(ProductTermConditionFragmentModule productTermConditionFragmentModule, RegularImmutableBiMap regularImmutableBiMap, ByteStreams.ByteArrayDataOutputStream byteArrayDataOutputStream, logEventInternalNoInterceptor logeventinternalnointerceptor, Iterables.C352212 r4) {
        C4199cn MediaBrowserCompat$CustomActionResultReceiver = productTermConditionFragmentModule.MediaBrowserCompat$CustomActionResultReceiver(regularImmutableBiMap, byteArrayDataOutputStream, logeventinternalnointerceptor, r4);
        if (MediaBrowserCompat$CustomActionResultReceiver != null) {
            return MediaBrowserCompat$CustomActionResultReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [o.HmlReviewDocumentActivity, com.scb.phone.view.fragment.ntb.selectaccount.di.ProductTermConditionFragmentModule] */
    public final /* synthetic */ Object get() {
        ? r0 = 0;
        return write(r0, (RegularImmutableBiMap) r0.get(), (ByteStreams.ByteArrayDataOutputStream) r0.get(), (logEventInternalNoInterceptor) r0.get(), (Iterables.C352212) r0.get());
    }
}

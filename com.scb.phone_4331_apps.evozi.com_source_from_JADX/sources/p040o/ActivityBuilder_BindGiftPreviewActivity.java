package p040o;

import com.scb.phone.view.fragment.hml.p050di.HmlNTBAccountConsentFragmentModule;
import p040o.ByteStreams;
import p040o.Iterables;

/* renamed from: o.ActivityBuilder_BindGiftPreviewActivity */
public final class ActivityBuilder_BindGiftPreviewActivity implements OPRStatusRewardsLandingActivity_ViewBinding<C4199cn> {
    public static C4199cn MediaBrowserCompat$ItemReceiver(HmlNTBAccountConsentFragmentModule hmlNTBAccountConsentFragmentModule, RegularImmutableBiMap regularImmutableBiMap, ByteStreams.ByteArrayDataOutputStream byteArrayDataOutputStream, logEventInternalNoInterceptor logeventinternalnointerceptor, Iterables.C352212 r4) {
        C4199cn IconCompatParcelizer = hmlNTBAccountConsentFragmentModule.IconCompatParcelizer(regularImmutableBiMap, byteArrayDataOutputStream, logeventinternalnointerceptor, r4);
        if (IconCompatParcelizer != null) {
            return IconCompatParcelizer;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [o.HmlReviewDocumentActivity, com.scb.phone.view.fragment.hml.di.HmlNTBAccountConsentFragmentModule] */
    public final /* synthetic */ Object get() {
        ? r0 = 0;
        return MediaBrowserCompat$ItemReceiver(r0, (RegularImmutableBiMap) r0.get(), (ByteStreams.ByteArrayDataOutputStream) r0.get(), (logEventInternalNoInterceptor) r0.get(), (Iterables.C352212) r0.get());
    }
}

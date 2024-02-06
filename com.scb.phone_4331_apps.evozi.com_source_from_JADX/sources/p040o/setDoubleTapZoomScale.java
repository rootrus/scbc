package p040o;

import com.scb.phone.view.activity.hml.p047di.HmlNTBPinConsentPresenterModule;

/* renamed from: o.setDoubleTapZoomScale */
public final class setDoubleTapZoomScale implements OPRStatusRewardsLandingActivity_ViewBinding<isUserLoggedIn> {
    public static isUserLoggedIn MediaBrowserCompat$ItemReceiver(HmlNTBPinConsentPresenterModule hmlNTBPinConsentPresenterModule, removeAllNodes removeallnodes, RegularImmutableBiMap regularImmutableBiMap, NavigationMenuView navigationMenuView) {
        isUserLoggedIn IconCompatParcelizer = hmlNTBPinConsentPresenterModule.IconCompatParcelizer(removeallnodes, regularImmutableBiMap, navigationMenuView);
        if (IconCompatParcelizer != null) {
            return IconCompatParcelizer;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.scb.phone.view.activity.hml.di.HmlNTBPinConsentPresenterModule, o.HmlReviewDocumentActivity] */
    public final /* synthetic */ Object get() {
        ? r0 = 0;
        isUserLoggedIn IconCompatParcelizer = r0.IconCompatParcelizer((removeAllNodes) r0.get(), (RegularImmutableBiMap) r0.get(), (NavigationMenuView) r0.get());
        if (IconCompatParcelizer != null) {
            return IconCompatParcelizer;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

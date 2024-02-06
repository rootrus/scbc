package p040o;

import com.scb.phone.view.activity.closeaccount.p046di.CloseAccountEligibilityModule;

/* renamed from: o.lr */
public final class C7239lr implements OPRStatusRewardsLandingActivity_ViewBinding<getFirstPassTexelWidthUniform> {
    public static getFirstPassTexelWidthUniform read(CloseAccountEligibilityModule closeAccountEligibilityModule, RegularImmutableBiMap regularImmutableBiMap, DynamiteClearcutLogger dynamiteClearcutLogger, setBarcodeFormats setbarcodeformats, PeekingIterator peekingIterator) {
        getFirstPassTexelWidthUniform IconCompatParcelizer = closeAccountEligibilityModule.IconCompatParcelizer(regularImmutableBiMap, dynamiteClearcutLogger, setbarcodeformats, peekingIterator);
        if (IconCompatParcelizer != null) {
            return IconCompatParcelizer;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [o.HmlReviewDocumentActivity, com.scb.phone.view.activity.closeaccount.di.CloseAccountEligibilityModule] */
    public final /* synthetic */ Object get() {
        ? r0 = 0;
        return read(r0, (RegularImmutableBiMap) r0.get(), (DynamiteClearcutLogger) r0.get(), (setBarcodeFormats) r0.get(), (PeekingIterator) r0.get());
    }
}

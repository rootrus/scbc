package p040o;

import java.util.Iterator;

/* renamed from: o.ScbsOnboardingProductCatalogActivity_ViewBinding */
public final class ScbsOnboardingProductCatalogActivity_ViewBinding<T, K> implements BaseJuristicPinActivity_ViewBinding<T> {
    private final BaseJuristicPinActivity_ViewBinding<T> IconCompatParcelizer;
    private final FundFactSheetActivity<T, K> MediaBrowserCompat$ItemReceiver;

    public ScbsOnboardingProductCatalogActivity_ViewBinding(BaseJuristicPinActivity_ViewBinding<? extends T> baseJuristicPinActivity_ViewBinding, FundFactSheetActivity<? super T, ? extends K> fundFactSheetActivity) {
        onGetStartedClick.write((Object) baseJuristicPinActivity_ViewBinding, "source");
        onGetStartedClick.write((Object) fundFactSheetActivity, "keySelector");
        this.IconCompatParcelizer = baseJuristicPinActivity_ViewBinding;
        this.MediaBrowserCompat$ItemReceiver = fundFactSheetActivity;
    }

    public final Iterator<T> read() {
        return new ScbsOnboardingProductCatalogActivity<>(this.IconCompatParcelizer.read(), this.MediaBrowserCompat$ItemReceiver);
    }
}

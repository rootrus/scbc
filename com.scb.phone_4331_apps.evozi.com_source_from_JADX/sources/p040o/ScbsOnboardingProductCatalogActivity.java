package p040o;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: o.ScbsOnboardingProductCatalogActivity */
final class ScbsOnboardingProductCatalogActivity<T, K> extends HmlBusinessHelpActivity<T> {
    private final Iterator<T> IconCompatParcelizer;
    private final FundFactSheetActivity<T, K> MediaBrowserCompat$ItemReceiver;
    private final HashSet<K> read = new HashSet<>();

    public ScbsOnboardingProductCatalogActivity(Iterator<? extends T> it, FundFactSheetActivity<? super T, ? extends K> fundFactSheetActivity) {
        onGetStartedClick.write((Object) it, "source");
        onGetStartedClick.write((Object) fundFactSheetActivity, "keySelector");
        this.IconCompatParcelizer = it;
        this.MediaBrowserCompat$ItemReceiver = fundFactSheetActivity;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        while (this.IconCompatParcelizer.hasNext()) {
            T next = this.IconCompatParcelizer.next();
            if (this.read.add(this.MediaBrowserCompat$ItemReceiver.invoke(next))) {
                IconCompatParcelizer(next);
                return;
            }
        }
        MediaBrowserCompat$ItemReceiver();
    }
}

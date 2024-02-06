package p040o;

import android.content.SharedPreferences;
import com.scb.phone.data.p033di.DataModule;

/* renamed from: o.ViewOverlayApi14$OverlayViewGroup */
public final class ViewOverlayApi14$OverlayViewGroup implements OPRStatusRewardsLandingActivity_ViewBinding<readObjectNoData$MediaBrowserCompat$ItemReceiver> {
    private final DataModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<SharedPreferences> read;

    private ViewOverlayApi14$OverlayViewGroup(DataModule dataModule, HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = dataModule;
        this.read = hmlReviewDocumentActivity;
    }

    public static ViewOverlayApi14$OverlayViewGroup read(DataModule dataModule, HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity) {
        return new ViewOverlayApi14$OverlayViewGroup(dataModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        readObjectNoData$MediaBrowserCompat$ItemReceiver write = this.MediaBrowserCompat$ItemReceiver.write(this.read.get());
        if (write != null) {
            return write;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

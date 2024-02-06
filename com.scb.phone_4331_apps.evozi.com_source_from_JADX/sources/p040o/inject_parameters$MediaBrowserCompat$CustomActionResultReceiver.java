package p040o;

import java.util.List;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.inject_parameters$MediaBrowserCompat$CustomActionResultReceiver */
public final class inject_parameters$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<onStreetViewPanoramaCameraChange> {
    final /* synthetic */ inject_parameters write;

    public inject_parameters$MediaBrowserCompat$CustomActionResultReceiver(inject_parameters inject_parameters) {
        this.write = inject_parameters;
    }

    public final /* synthetic */ void onNext(Object obj) {
        onStreetViewPanoramaCameraChange onstreetviewpanoramacamerachange = (onStreetViewPanoramaCameraChange) obj;
        onGetStartedClick.write((Object) onstreetviewpanoramacamerachange, "giftsList");
        inject_parameters.read(this.write);
        List<setUserNavigationEnabled> list = onstreetviewpanoramacamerachange.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.IconCompatParcelizer((Object) list, "giftsList.giftMoneyItemList");
        boolean z = true;
        if (!list.isEmpty()) {
            inject_parameters inject_parameters = this.write;
            writeUInt64NoTag.IconCompatParcelizer inject_parameters_mediabrowsercompat_customactionresultreceiver_mediabrowsercompat_itemreceiver = new C7174x83797601(this, onstreetviewpanoramacamerachange);
            if (inject_parameters.RatingCompat == null) {
                z = false;
            }
            if (z) {
                inject_parameters_mediabrowsercompat_customactionresultreceiver_mediabrowsercompat_itemreceiver.IconCompatParcelizer(inject_parameters.RatingCompat);
                return;
            }
            return;
        }
        this.write.MediaBrowserCompat$ItemReceiver(Iterables$3$MediaBrowserCompat$MediaItem.error_default_title, access$2300.write.NAVIGATE_BACK);
    }

    public final void onError(Throwable th) {
        onGetStartedClick.write((Object) th, "e");
        this.write.MediaBrowserCompat$ItemReceiver(this.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
    }
}

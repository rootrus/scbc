package p040o;

import java.util.List;
import p040o.AutoValue_CrashlyticsReport_Session_OperatingSystem;
import p040o.ServerProjectProvider;
import p040o.writeUInt64NoTag;

/* renamed from: o.inject_parameters$MediaBrowserCompat$CustomActionResultReceiver$MediaBrowserCompat$ItemReceiver */
final class C7174x83797601<V> implements writeUInt64NoTag.IconCompatParcelizer<ServerProjectProvider.C12918> {
    private /* synthetic */ inject_parameters$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer;
    private /* synthetic */ onStreetViewPanoramaCameraChange write;

    C7174x83797601(inject_parameters$MediaBrowserCompat$CustomActionResultReceiver inject_parameters_mediabrowsercompat_customactionresultreceiver, onStreetViewPanoramaCameraChange onstreetviewpanoramacamerachange) {
        this.IconCompatParcelizer = inject_parameters_mediabrowsercompat_customactionresultreceiver;
        this.write = onstreetviewpanoramacamerachange;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        List<AutoValue_CrashlyticsReport_Session_OperatingSystem.C30991> MediaBrowserCompat$ItemReceiver = this.IconCompatParcelizer.write.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.write.MediaBrowserCompat$ItemReceiver, "money");
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "giftSelectionDisplayMapp…tsList.giftMoneyItemList)");
        ((ServerProjectProvider.C12918) obj).MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver);
    }
}

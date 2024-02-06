package p040o;

import p040o.Futures;
import p040o.getTransit;
import p040o.writeUInt64NoTag;

/* renamed from: o.removeAppStatsThresholdListener */
public final /* synthetic */ class removeAppStatsThresholdListener implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Futures.C34051 write;

    public /* synthetic */ removeAppStatsThresholdListener(Futures.C34051 r1) {
        this.write = r1;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getTransit.IconCompatParcelizer) obj).MediaBrowserCompat$ItemReceiver(this.write.AlertController$RecycleListView, this.write.IconCompatParcelizer, this.write.MediaMetadataCompat);
    }
}

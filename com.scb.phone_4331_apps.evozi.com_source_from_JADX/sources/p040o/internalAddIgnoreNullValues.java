package p040o;

import p040o.immediateFailedCheckedFuture;
import p040o.proxyGetICheckDetector;
import p040o.writeUInt64NoTag;

/* renamed from: o.internalAddIgnoreNullValues */
public final /* synthetic */ class internalAddIgnoreNullValues implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ DefaultHeartBeatInfo$$Lambda$1 write;

    public /* synthetic */ internalAddIgnoreNullValues(DefaultHeartBeatInfo$$Lambda$1 defaultHeartBeatInfo$$Lambda$1) {
        this.write = defaultHeartBeatInfo$$Lambda$1;
    }

    public final void IconCompatParcelizer(Object obj) {
        privateKeyEquivalence privatekeyequivalence = this.write.MediaBrowserCompat$ItemReceiver;
        immediateFailedCheckedFuture.read IconCompatParcelizer = immediateFailedCheckedFuture.IconCompatParcelizer();
        IconCompatParcelizer.read = privatekeyequivalence.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.bond_decline_terms_alert_title);
        IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = privatekeyequivalence.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.bond_decline_terms_alert_description);
        IconCompatParcelizer.IconCompatParcelizer = privatekeyequivalence.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.bond_decline_terms_alert_positive_button);
        IconCompatParcelizer.MediaBrowserCompat$ItemReceiver = privatekeyequivalence.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.bond_terms_alert_negative_button);
        ((proxyGetICheckDetector.IconCompatParcelizer) obj).IconCompatParcelizer(new immediateFailedCheckedFuture(IconCompatParcelizer, (byte) 0));
    }
}

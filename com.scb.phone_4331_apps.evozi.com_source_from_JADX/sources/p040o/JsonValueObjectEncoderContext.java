package p040o;

import p040o.immediateFailedCheckedFuture;
import p040o.proxyGetICheckDetector;
import p040o.writeUInt64NoTag;

/* renamed from: o.JsonValueObjectEncoderContext */
public final /* synthetic */ class JsonValueObjectEncoderContext implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ DefaultHeartBeatInfo$$Lambda$1 MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ JsonValueObjectEncoderContext(DefaultHeartBeatInfo$$Lambda$1 defaultHeartBeatInfo$$Lambda$1) {
        this.MediaBrowserCompat$CustomActionResultReceiver = defaultHeartBeatInfo$$Lambda$1;
    }

    public final void IconCompatParcelizer(Object obj) {
        privateKeyEquivalence privatekeyequivalence = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
        immediateFailedCheckedFuture.read IconCompatParcelizer = immediateFailedCheckedFuture.IconCompatParcelizer();
        IconCompatParcelizer.read = privatekeyequivalence.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.bond_accept_terms_alert_title);
        IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = privatekeyequivalence.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.bond_accept_terms_alert_description);
        IconCompatParcelizer.IconCompatParcelizer = privatekeyequivalence.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.bond_accept_terms_alert_positive_button);
        IconCompatParcelizer.MediaBrowserCompat$ItemReceiver = privatekeyequivalence.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.bond_terms_alert_negative_button);
        ((proxyGetICheckDetector.IconCompatParcelizer) obj).MediaBrowserCompat$ItemReceiver(new immediateFailedCheckedFuture(IconCompatParcelizer, (byte) 0));
    }
}

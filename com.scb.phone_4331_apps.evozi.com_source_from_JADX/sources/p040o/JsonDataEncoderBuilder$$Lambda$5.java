package p040o;

import p040o.DefaultHeartBeatInfo$$Lambda$1;
import p040o.proxyGetICheckDetector;
import p040o.writeUInt64NoTag;

/* renamed from: o.JsonDataEncoderBuilder$$Lambda$5 */
public final /* synthetic */ class JsonDataEncoderBuilder$$Lambda$5 implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ DefaultHeartBeatInfo$$Lambda$1.C33182 IconCompatParcelizer;
    private final /* synthetic */ zzvk MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ JsonDataEncoderBuilder$$Lambda$5(DefaultHeartBeatInfo$$Lambda$1.C33182 r1, zzvk zzvk) {
        this.IconCompatParcelizer = r1;
        this.MediaBrowserCompat$CustomActionResultReceiver = zzvk;
    }

    public final void IconCompatParcelizer(Object obj) {
        DefaultHeartBeatInfo$$Lambda$1.C33182 r0 = this.IconCompatParcelizer;
        zzvk zzvk = this.MediaBrowserCompat$CustomActionResultReceiver;
        privateKeyEquivalence MediaBrowserCompat$CustomActionResultReceiver2 = DefaultHeartBeatInfo$$Lambda$1.this.MediaBrowserCompat$ItemReceiver;
        getIdManager$MediaBrowserCompat$CustomActionResultReceiver getidmanager_mediabrowsercompat_customactionresultreceiver = new getIdManager$MediaBrowserCompat$CustomActionResultReceiver();
        getidmanager_mediabrowsercompat_customactionresultreceiver.write = MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.bond_terms_and_conditions_title);
        getidmanager_mediabrowsercompat_customactionresultreceiver.read = "BOND_TERMS_CONDITIONS_TAG";
        getidmanager_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver = zzvk.write;
        getidmanager_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer = true;
        ((proxyGetICheckDetector.IconCompatParcelizer) obj).read(new getIdManager(getidmanager_mediabrowsercompat_customactionresultreceiver, (byte) 0));
    }
}

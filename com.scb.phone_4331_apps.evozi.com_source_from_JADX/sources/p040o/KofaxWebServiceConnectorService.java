package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.KofaxWebServiceConnectorService */
public final class KofaxWebServiceConnectorService extends writeUInt64NoTag<KtaJsonPassport> {

    /* renamed from: o.KofaxWebServiceConnectorService$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<KtaJsonPassport> {
        public static final read MediaBrowserCompat$CustomActionResultReceiver = new read();

        read() {
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((KtaJsonPassport) obj).IconCompatParcelizer();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public KofaxWebServiceConnectorService(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
    }
}

package p040o;

import p040o.setTvRemark;
import p040o.withRegisteredFid;
import p040o.writeUInt64NoTag;

/* renamed from: o.fetchAuthTokenFromServer */
public final /* synthetic */ class fetchAuthTokenFromServer implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ withRegisteredFid.read IconCompatParcelizer;
    private final /* synthetic */ setTvRemark.read read;

    public /* synthetic */ fetchAuthTokenFromServer(withRegisteredFid.read read2, setTvRemark.read read3) {
        this.IconCompatParcelizer = read2;
        this.read = read3;
    }

    public final void IconCompatParcelizer(Object obj) {
        withRegisteredFid.read read2 = this.IconCompatParcelizer;
        setTvRemark.read read3 = this.read;
        proxyGetICheckDeserializerRtti$MediaBrowserCompat$ItemReceiver proxygeticheckdeserializerrtti_mediabrowsercompat_itemreceiver = (proxyGetICheckDeserializerRtti$MediaBrowserCompat$ItemReceiver) obj;
        proxygeticheckdeserializerrtti_mediabrowsercompat_itemreceiver.aj_();
        proxygeticheckdeserializerrtti_mediabrowsercompat_itemreceiver.read(read3.RatingCompat, read3.MediaBrowserCompat$CustomActionResultReceiver, new triggerOnStateReached(read2, read3));
    }
}

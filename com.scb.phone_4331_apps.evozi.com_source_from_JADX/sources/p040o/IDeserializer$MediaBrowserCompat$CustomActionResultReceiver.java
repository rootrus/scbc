package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.IDeserializer$MediaBrowserCompat$CustomActionResultReceiver */
public final class IDeserializer$MediaBrowserCompat$CustomActionResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<C1242x22fefaeb> {
    private /* synthetic */ IDeserializer read;

    public IDeserializer$MediaBrowserCompat$CustomActionResultReceiver(IDeserializer iDeserializer) {
        this.read = iDeserializer;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        C1242x22fefaeb onDeviceIdExtractor$a$1$MediaBrowserCompat$CustomActionResultReceiver = (C1242x22fefaeb) obj;
        toLongArray tolongarray = this.read.write;
        String str = this.read.IconCompatParcelizer;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTermsAndConditionsType");
        }
        onDeviceIdExtractor$a$1$MediaBrowserCompat$CustomActionResultReceiver.read(toLongArray.MediaBrowserCompat$CustomActionResultReceiver(tolongarray, (String) null, str, (String) null, (String) null, true, false, (String) null, 72));
    }
}

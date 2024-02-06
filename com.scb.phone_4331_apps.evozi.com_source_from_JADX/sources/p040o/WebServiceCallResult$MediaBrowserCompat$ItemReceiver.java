package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.WebServiceCallResult$MediaBrowserCompat$ItemReceiver */
public final class WebServiceCallResult$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<proxyGetOnDeviceExceptionResponseDeserializer> {
    private /* synthetic */ onUncaughtException IconCompatParcelizer;

    public WebServiceCallResult$MediaBrowserCompat$ItemReceiver(onUncaughtException onuncaughtexception) {
        this.IconCompatParcelizer = onuncaughtexception;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((proxyGetOnDeviceExceptionResponseDeserializer) obj).write(this.IconCompatParcelizer);
    }
}

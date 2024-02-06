package p040o;

import p040o.getIIdDeserializerOnDevice;
import p040o.onNotNowClick;
import p040o.writeUInt64NoTag;

/* renamed from: o.typeToString$MediaSessionCompat$Token */
final class typeToString$MediaSessionCompat$Token<V> implements writeUInt64NoTag.IconCompatParcelizer<getIIdDeserializerOnDevice.IconCompatParcelizer> {
    private /* synthetic */ onNotNowClick.read IconCompatParcelizer;
    private /* synthetic */ typeToString MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ onNotNowClick.read read;
    private /* synthetic */ onNotNowClick.read write;

    typeToString$MediaSessionCompat$Token(typeToString typetostring, onNotNowClick.read read2, onNotNowClick.read read3, onNotNowClick.read read4) {
        this.MediaBrowserCompat$ItemReceiver = typetostring;
        this.read = read2;
        this.IconCompatParcelizer = read3;
        this.write = read4;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        String str;
        processInstanceComponents processinstancecomponents;
        processInstanceComponents processinstancecomponents2;
        getIIdDeserializerOnDevice.IconCompatParcelizer iconCompatParcelizer = (getIIdDeserializerOnDevice.IconCompatParcelizer) obj;
        ComponentFactory componentFactory = typeToString.MediaBrowserCompat$SearchResultReceiver(this.MediaBrowserCompat$ItemReceiver).MediaBrowserCompat$SearchResultReceiver;
        String str2 = null;
        if (componentFactory == null || (processinstancecomponents2 = componentFactory.MediaBrowserCompat$CustomActionResultReceiver) == null) {
            str = null;
        } else {
            str = processinstancecomponents2.MediaBrowserCompat$ItemReceiver;
        }
        String str3 = (String) this.read.MediaBrowserCompat$ItemReceiver;
        expectedSize unused = this.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$QueueItem;
        String write2 = expectedSize.write((Double) this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver);
        String str4 = (String) this.write.MediaBrowserCompat$ItemReceiver;
        ComponentFactory componentFactory2 = typeToString.MediaBrowserCompat$SearchResultReceiver(this.MediaBrowserCompat$ItemReceiver).MediaBrowserCompat$SearchResultReceiver;
        if (!(componentFactory2 == null || (processinstancecomponents = componentFactory2.MediaBrowserCompat$CustomActionResultReceiver) == null)) {
            str2 = processinstancecomponents.MediaDescriptionCompat;
        }
        iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(str, str3, write2, str4, getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(str2, this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver));
    }
}

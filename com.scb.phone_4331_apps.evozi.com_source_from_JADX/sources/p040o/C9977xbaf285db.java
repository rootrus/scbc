package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getObject$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
final class C9977xbaf285db<V> implements writeUInt64NoTag.IconCompatParcelizer<QuickExtractorAgentListener> {
    private /* synthetic */ getObject MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ onMarkerClick read;

    C9977xbaf285db(getObject getobject, onMarkerClick onmarkerclick) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getobject;
        this.read = onmarkerclick;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        QuickExtractorAgentListener quickExtractorAgentListener = (QuickExtractorAgentListener) obj;
        quickExtractorAgentListener.aj_();
        quickExtractorAgentListener.write(this.read, getObject.write(this.MediaBrowserCompat$CustomActionResultReceiver));
    }
}

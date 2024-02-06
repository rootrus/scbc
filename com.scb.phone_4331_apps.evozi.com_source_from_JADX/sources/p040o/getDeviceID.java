package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getDeviceID */
public final /* synthetic */ class getDeviceID implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ removeOnTaskCompletedListener MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ String read;
    private final /* synthetic */ String write;

    public /* synthetic */ getDeviceID(removeOnTaskCompletedListener removeontaskcompletedlistener, String str, String str2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = removeontaskcompletedlistener;
        this.write = str;
        this.read = str2;
    }

    public final void IconCompatParcelizer(Object obj) {
        removeOnTaskCompletedListener removeontaskcompletedlistener = this.MediaBrowserCompat$CustomActionResultReceiver;
        String str = this.write;
        String str2 = this.read;
        IIdExtractionListener iIdExtractionListener = (IIdExtractionListener) obj;
        iIdExtractionListener.MediaBrowserCompat$CustomActionResultReceiver(true);
        iIdExtractionListener.write(str, str2, removeontaskcompletedlistener.MediaBrowserCompat$ItemReceiver, removeontaskcompletedlistener.read);
    }
}

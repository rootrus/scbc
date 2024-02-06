package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.countRows */
public final /* synthetic */ class countRows implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ removeOnTaskCompletedListener read;

    public /* synthetic */ countRows(removeOnTaskCompletedListener removeontaskcompletedlistener) {
        this.read = removeontaskcompletedlistener;
    }

    public final void IconCompatParcelizer(Object obj) {
        removeOnTaskCompletedListener removeontaskcompletedlistener = this.read;
        ((IIdExtractionListener) obj).MediaBrowserCompat$CustomActionResultReceiver(removeontaskcompletedlistener.MediaMetadataCompat && removeontaskcompletedlistener.MediaBrowserCompat$SearchResultReceiver);
    }
}

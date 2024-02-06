package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.removeImageClassificationCompletedEventListener */
public final /* synthetic */ class removeImageClassificationCompletedEventListener implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ addImageOutEventListener MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ removeImageClassificationCompletedEventListener(addImageOutEventListener addimageouteventlistener) {
        this.MediaBrowserCompat$ItemReceiver = addimageouteventlistener;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((C1162x44a04885) obj).MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.write);
    }
}

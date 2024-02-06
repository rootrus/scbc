package p040o;

import okhttp3.internal.cache.DiskLruCache;
import p040o.writeUInt64NoTag;

/* renamed from: o.doCleanup  reason: case insensitive filesystem */
public final /* synthetic */ class C10894doCleanup implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ addImageOutEventListener IconCompatParcelizer;

    public /* synthetic */ C10894doCleanup(addImageOutEventListener addimageouteventlistener) {
        this.IconCompatParcelizer = addimageouteventlistener;
    }

    public final void IconCompatParcelizer(Object obj) {
        addImageOutEventListener addimageouteventlistener = this.IconCompatParcelizer;
        C1162x44a04885 checkExtractActivity_MembersInjector$MediaSessionCompat$ResultReceiverWrapper = (C1162x44a04885) obj;
        if (addimageouteventlistener.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer == null || !DiskLruCache.VERSION_1.equals(addimageouteventlistener.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer)) {
            checkExtractActivity_MembersInjector$MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$CustomActionResultReceiver(addimageouteventlistener.MediaBrowserCompat$ItemReceiver, false);
        } else {
            checkExtractActivity_MembersInjector$MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$CustomActionResultReceiver(addimageouteventlistener.MediaBrowserCompat$ItemReceiver, true);
        }
    }
}

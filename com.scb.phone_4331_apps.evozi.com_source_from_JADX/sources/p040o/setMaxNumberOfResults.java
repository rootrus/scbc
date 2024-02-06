package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.setMaxNumberOfResults */
public final /* synthetic */ class setMaxNumberOfResults implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ addImageOutEventListener write;

    public /* synthetic */ setMaxNumberOfResults(addImageOutEventListener addimageouteventlistener) {
        this.write = addimageouteventlistener;
    }

    public final void IconCompatParcelizer(Object obj) {
        addImageOutEventListener addimageouteventlistener = this.write;
        C1162x44a04885 checkExtractActivity_MembersInjector$MediaSessionCompat$ResultReceiverWrapper = (C1162x44a04885) obj;
        checkExtractActivity_MembersInjector$MediaSessionCompat$ResultReceiverWrapper.read();
        checkExtractActivity_MembersInjector$MediaSessionCompat$ResultReceiverWrapper.IconCompatParcelizer(addimageouteventlistener.MediaBrowserCompat$ItemReceiver());
    }
}

package p040o;

import p040o.C10829Sizeof;
import p040o.writeUInt64NoTag;

/* renamed from: o.setCheckType */
public final /* synthetic */ class setCheckType implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ discardOldLogFiles$MediaBrowserCompat$ItemReceiver IconCompatParcelizer;
    private final /* synthetic */ C10829Sizeof.SizeOfNewObject MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ String write;

    public /* synthetic */ setCheckType(C10829Sizeof.SizeOfNewObject sizeOfNewObject, discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver, String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = sizeOfNewObject;
        this.IconCompatParcelizer = discardoldlogfiles_mediabrowsercompat_itemreceiver;
        this.write = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver = this.IconCompatParcelizer;
        String str = this.write;
        getPiggybackDocument getpiggybackdocument = (getPiggybackDocument) obj;
        String[] split = discardoldlogfiles_mediabrowsercompat_itemreceiver.ListMenuItemView.split("\n");
        setCurrentSession write2 = setCurrentSession.write();
        write2.MediaBrowserCompat$MediaItem = str.equalsIgnoreCase("en") ? split[0] : split[1];
        write2.MediaMetadataCompat = discardoldlogfiles_mediabrowsercompat_itemreceiver.MediaSessionCompat$ResultReceiverWrapper;
        write2.IconCompatParcelizer = discardoldlogfiles_mediabrowsercompat_itemreceiver.MediaBrowserCompat$SearchResultReceiver;
        write2.write = discardoldlogfiles_mediabrowsercompat_itemreceiver.MediaDescriptionCompat;
        write2.MediaBrowserCompat$ItemReceiver = discardoldlogfiles_mediabrowsercompat_itemreceiver.IconCompatParcelizer;
        write2.MediaBrowserCompat$SearchResultReceiver = discardoldlogfiles_mediabrowsercompat_itemreceiver.MediaSessionCompat$Token;
        write2.MediaDescriptionCompat = discardoldlogfiles_mediabrowsercompat_itemreceiver.setShortcut;
        write2.RatingCompat = discardoldlogfiles_mediabrowsercompat_itemreceiver.ParcelableVolumeInfo;
        write2.read = true;
        getpiggybackdocument.read(write2);
    }
}

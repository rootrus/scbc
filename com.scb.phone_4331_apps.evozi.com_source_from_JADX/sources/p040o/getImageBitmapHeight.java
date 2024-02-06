package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.writeUInt64NoTag;

/* renamed from: o.getImageBitmapHeight */
public final /* synthetic */ class getImageBitmapHeight implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setBasicSettingsProfileUsed$MediaBrowserCompat$ItemReceiver IconCompatParcelizer;
    private final /* synthetic */ sha1 MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ setEventInterceptor write;

    public /* synthetic */ getImageBitmapHeight(setBasicSettingsProfileUsed$MediaBrowserCompat$ItemReceiver setbasicsettingsprofileused_mediabrowsercompat_itemreceiver, sha1 sha1, setEventInterceptor seteventinterceptor) {
        this.IconCompatParcelizer = setbasicsettingsprofileused_mediabrowsercompat_itemreceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = sha1;
        this.write = seteventinterceptor;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckExtractActivity_MembersInjector.setPadding) obj).IconCompatParcelizer(this.IconCompatParcelizer.read.IconCompatParcelizer.write(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver, this.write.MediaMetadataCompat.read));
    }
}

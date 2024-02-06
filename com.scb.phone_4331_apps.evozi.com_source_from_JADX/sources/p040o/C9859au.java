package p040o;

import p040o.SingletonImmutableMap;
import p040o.writeUInt64NoTag;

/* renamed from: o.au */
public final /* synthetic */ class C9859au implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ clearGlobalBitmap$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ AddPlaceRequest MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ getOsBuildVersionString write;

    public /* synthetic */ C9859au(clearGlobalBitmap$MediaBrowserCompat$CustomActionResultReceiver clearglobalbitmap_mediabrowsercompat_customactionresultreceiver, getOsBuildVersionString getosbuildversionstring, AddPlaceRequest addPlaceRequest) {
        this.MediaBrowserCompat$CustomActionResultReceiver = clearglobalbitmap_mediabrowsercompat_customactionresultreceiver;
        this.write = getosbuildversionstring;
        this.MediaBrowserCompat$ItemReceiver = addPlaceRequest;
    }

    public final void IconCompatParcelizer(Object obj) {
        clearGlobalBitmap$MediaBrowserCompat$CustomActionResultReceiver clearglobalbitmap_mediabrowsercompat_customactionresultreceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        getOsBuildVersionString getosbuildversionstring = this.write;
        AddPlaceRequest addPlaceRequest = this.MediaBrowserCompat$ItemReceiver;
        String str = getosbuildversionstring.PlaybackStateCompat$CustomAction;
        String str2 = getosbuildversionstring.AlertController$RecycleListView;
        SingletonImmutableMap.Values unused = clearglobalbitmap_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver.setBackgroundResource;
        ((C6397xabb2c88d) obj).IconCompatParcelizer(str, str2, SingletonImmutableMap.Values.write(addPlaceRequest.MediaMetadataCompat, "O"));
    }
}

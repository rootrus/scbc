package p040o;

import com.google.android.gms.common.internal.ImagesContract;
import p040o.RegularImmutableMap;
import p040o.writeUInt64NoTag;

/* renamed from: o.setOcrBufferSize$MediaBrowserCompat$CustomActionResultReceiver */
public final class setOcrBufferSize$MediaBrowserCompat$CustomActionResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<getPersonalNumber> {
    private /* synthetic */ setOcrBufferSize MediaBrowserCompat$CustomActionResultReceiver;

    public setOcrBufferSize$MediaBrowserCompat$CustomActionResultReceiver(setOcrBufferSize setocrbuffersize) {
        this.MediaBrowserCompat$CustomActionResultReceiver = setocrbuffersize;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        RegularImmutableMap.KeySet MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
        int i = Iterables$3$MediaBrowserCompat$MediaItem.terms_and_conditions_title;
        String str = setOcrBufferSize.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver).write;
        onGetStartedClick.write((Object) str, ImagesContract.URL);
        setCurrentSession write = setCurrentSession.write();
        write.MediaBrowserCompat$MediaItem = MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.getString(i);
        write.MediaMetadataCompat = str;
        onGetStartedClick.IconCompatParcelizer((Object) write, "StaticTileDisplay.create…     .withWebViewUrl(url)");
        ((getPersonalNumber) obj).MediaBrowserCompat$CustomActionResultReceiver(write);
    }
}

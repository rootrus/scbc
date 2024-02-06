package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.Image;
import p040o.writeUInt64NoTag;

/* renamed from: o.Image$OutputColor$write$MediaBrowserCompat$ItemReceiver */
final class Image$OutputColor$write$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<CheckExtractActivity_MembersInjector.MediaMetadataCompat> {
    private /* synthetic */ Image.OutputColor.write write;

    Image$OutputColor$write$MediaBrowserCompat$ItemReceiver(Image.OutputColor.write write2) {
        this.write = write2;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((CheckExtractActivity_MembersInjector.MediaMetadataCompat) obj).MediaBrowserCompat$CustomActionResultReceiver(Image.OutputColor.this.MediaDescriptionCompat.IconCompatParcelizer());
    }
}

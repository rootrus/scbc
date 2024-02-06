package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.BarcodeView */
public final /* synthetic */ class BarcodeView implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getStringValues IconCompatParcelizer;
    private final /* synthetic */ nonNull MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ BarcodeView(getStringValues getstringvalues, nonNull nonnull) {
        this.IconCompatParcelizer = getstringvalues;
        this.MediaBrowserCompat$CustomActionResultReceiver = nonnull;
    }

    public final void IconCompatParcelizer(Object obj) {
        getStringValues getstringvalues = this.IconCompatParcelizer;
        ((C6909xbc088368) obj).write(getstringvalues.MediaBrowserCompat$CustomActionResultReceiver.read(getstringvalues.IconCompatParcelizer.getString(Iterables$3$MediaBrowserCompat$MediaItem.error_default_title), this.MediaBrowserCompat$CustomActionResultReceiver.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver, access$2300.write.JUST_DISMISS));
    }
}

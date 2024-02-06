package p040o;

import java.util.List;
import p040o.Image;
import p040o.writeUInt64NoTag;

/* renamed from: o.Image$BitmapDataObject$MediaBrowserCompat$MediaItem */
public final class Image$BitmapDataObject$MediaBrowserCompat$MediaItem<V> implements writeUInt64NoTag.IconCompatParcelizer<CreditCard> {
    private /* synthetic */ Image.BitmapDataObject read;

    public Image$BitmapDataObject$MediaBrowserCompat$MediaItem(Image.BitmapDataObject bitmapDataObject) {
        this.read = bitmapDataObject;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        CreditCard creditCard = (CreditCard) obj;
        List<String> MediaBrowserCompat$CustomActionResultReceiver = this.read.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(this.read.write);
        List MediaBrowserCompat$CustomActionResultReceiver2 = Image.BitmapDataObject.MediaBrowserCompat$ItemReceiver(Image.BitmapDataObject.read(this.read).MediaBrowserCompat$SearchResultReceiver);
        creditCard.read(MediaBrowserCompat$CustomActionResultReceiver);
        creditCard.write((List<String>) MediaBrowserCompat$CustomActionResultReceiver2);
        creditCard.MediaBrowserCompat$CustomActionResultReceiver(Image.BitmapDataObject.read(this.read), -1, -1);
    }
}

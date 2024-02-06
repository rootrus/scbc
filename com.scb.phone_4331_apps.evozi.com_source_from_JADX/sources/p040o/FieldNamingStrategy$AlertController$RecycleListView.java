package p040o;

import p040o.getFirstName;
import p040o.writeUInt64NoTag;

/* renamed from: o.FieldNamingStrategy$AlertController$RecycleListView */
final class FieldNamingStrategy$AlertController$RecycleListView<V> implements writeUInt64NoTag.IconCompatParcelizer<getFirstName.MediaDescriptionCompat> {
    private /* synthetic */ Component$$Lambda$2 IconCompatParcelizer;
    private /* synthetic */ FieldNamingStrategy read;

    FieldNamingStrategy$AlertController$RecycleListView(FieldNamingStrategy fieldNamingStrategy, Component$$Lambda$2 component$$Lambda$2) {
        this.read = fieldNamingStrategy;
        this.IconCompatParcelizer = component$$Lambda$2;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        this.read.MediaBrowserCompat$SearchResultReceiver = this.IconCompatParcelizer;
        this.read.read.addAll(this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver);
        ((getFirstName.MediaDescriptionCompat) obj).IconCompatParcelizer(this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver);
    }
}

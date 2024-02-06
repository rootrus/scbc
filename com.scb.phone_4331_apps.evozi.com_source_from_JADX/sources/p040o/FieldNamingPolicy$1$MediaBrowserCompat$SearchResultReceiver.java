package p040o;

import p040o.getFirstName;
import p040o.writeUInt64NoTag;

/* renamed from: o.FieldNamingPolicy$1$MediaBrowserCompat$SearchResultReceiver */
public final class FieldNamingPolicy$1$MediaBrowserCompat$SearchResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<getFirstName.write> {
    private /* synthetic */ intoSet write;

    public FieldNamingPolicy$1$MediaBrowserCompat$SearchResultReceiver(intoSet intoset) {
        this.write = intoset;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        getFirstName.write write2 = (getFirstName.write) obj;
        String read = this.write.read();
        if (read != null) {
            write2.MediaDescriptionCompat(read);
        }
    }
}

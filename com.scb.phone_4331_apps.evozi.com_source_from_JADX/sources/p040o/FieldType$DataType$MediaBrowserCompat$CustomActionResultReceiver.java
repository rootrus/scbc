package p040o;

import p040o.FieldType;
import p040o.writeUInt64NoTag;

/* renamed from: o.FieldType$DataType$MediaBrowserCompat$CustomActionResultReceiver */
final class FieldType$DataType$MediaBrowserCompat$CustomActionResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<SizeDouble> {
    private /* synthetic */ FieldType.DataType MediaBrowserCompat$ItemReceiver;

    FieldType$DataType$MediaBrowserCompat$CustomActionResultReceiver(FieldType.DataType dataType) {
        this.MediaBrowserCompat$ItemReceiver = dataType;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((SizeDouble) obj).write(FieldType.DataType.read(this.MediaBrowserCompat$ItemReceiver));
    }
}

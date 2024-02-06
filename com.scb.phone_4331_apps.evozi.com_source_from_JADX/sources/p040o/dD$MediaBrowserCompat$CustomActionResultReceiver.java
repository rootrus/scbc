package p040o;

import p040o.fromDataField;
import p040o.writeUInt64NoTag;

/* renamed from: o.dD$MediaBrowserCompat$CustomActionResultReceiver */
final class dD$MediaBrowserCompat$CustomActionResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<fromDataField.read> {
    private /* synthetic */ setFilename read;
    private /* synthetic */ boolean write;

    dD$MediaBrowserCompat$CustomActionResultReceiver(setFilename setfilename, boolean z) {
        this.read = setfilename;
        this.write = z;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        fromDataField.read read2 = (fromDataField.read) obj;
        read2.aj_();
        read2.read(this.read, this.write);
    }
}

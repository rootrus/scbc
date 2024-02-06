package p040o;

import p040o.readVersion;
import p040o.writeUInt64NoTag;

/* renamed from: o.eD$MediaBrowserCompat$CustomActionResultReceiver */
public final class eD$MediaBrowserCompat$CustomActionResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<readVersion.read> {
    private /* synthetic */ standardStartAndWait write;

    public eD$MediaBrowserCompat$CustomActionResultReceiver(standardStartAndWait standardstartandwait) {
        this.write = standardstartandwait;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((readVersion.read) obj).MediaBrowserCompat$ItemReceiver(this.write);
    }
}

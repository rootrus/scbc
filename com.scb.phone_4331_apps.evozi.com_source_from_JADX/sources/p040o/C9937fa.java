package p040o;

import p040o.C4429fk;
import p040o.writeUInt64NoTag;

/* renamed from: o.fa */
public final /* synthetic */ class C9937fa implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4429fk.read MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ C9937fa(C4429fk.read read) {
        this.MediaBrowserCompat$CustomActionResultReceiver = read;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4429fk.read read = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((getBelowMinRearImageSize$MediaBrowserCompat$ItemReceiver) obj).write(read.read, C4429fk.this.read != read.read.MediaBrowserCompat$CustomActionResultReceiver);
    }
}

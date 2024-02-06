package p040o;

import p040o.CheckExtractor_MembersInjector;
import p040o.access$2300;
import p040o.writeToFileBuffer;
import p040o.writeUInt64NoTag;

/* renamed from: o.writeImageToFileBuffer */
public final /* synthetic */ class writeImageToFileBuffer implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ writeToFileBuffer.read MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ Throwable read;

    public /* synthetic */ writeImageToFileBuffer(writeToFileBuffer.read read2, Throwable th) {
        this.MediaBrowserCompat$CustomActionResultReceiver = read2;
        this.read = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        writeToFileBuffer.read read2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((CheckExtractor_MembersInjector.read) obj).MediaBrowserCompat$CustomActionResultReceiver(writeToFileBuffer.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.read, access$2300.write.JUST_DISMISS));
    }
}

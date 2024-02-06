package p040o;

import p040o.Publisher;
import p040o.RttiJsonCheck;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.ValueEncoderContext */
public final /* synthetic */ class ValueEncoderContext implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Publisher.C37443 MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ Throwable write;

    public /* synthetic */ ValueEncoderContext(Publisher.C37443 r1, Throwable th) {
        this.MediaBrowserCompat$CustomActionResultReceiver = r1;
        this.write = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        Publisher.C37443 r0 = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((RttiJsonCheck.C1257a) obj).write(Publisher.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.write, access$2300.write.NAVIGATE_BACK));
    }
}

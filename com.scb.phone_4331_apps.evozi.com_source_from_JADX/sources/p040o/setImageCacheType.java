package p040o;

import p040o.LevelnessEvent;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.setImageCacheType */
public final /* synthetic */ class setImageCacheType implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable read;
    private final /* synthetic */ LevelnessEvent.C35632 write;

    public /* synthetic */ setImageCacheType(LevelnessEvent.C35632 r1, Throwable th) {
        this.write = r1;
        this.read = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        LevelnessEvent.C35632 r0 = this.write;
        ((PassportParameters_MembersInjector) obj).write(LevelnessEvent.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.read, access$2300.write.NAVIGATE_BACK));
    }
}

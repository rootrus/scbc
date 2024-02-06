package p040o;

import p040o.access$2300;
import p040o.newParameterizedTypeWithOwner;
import p040o.writeUInt64NoTag;

/* renamed from: o.getRawType */
public final /* synthetic */ class getRawType implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ newParameterizedTypeWithOwner.write IconCompatParcelizer;
    private final /* synthetic */ Throwable read;

    public /* synthetic */ getRawType(newParameterizedTypeWithOwner.write write, Throwable th) {
        this.IconCompatParcelizer = write;
        this.read = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        newParameterizedTypeWithOwner.write write = this.IconCompatParcelizer;
        ((IdCaptureBackActivity) obj).write(newParameterizedTypeWithOwner.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.read, access$2300.write.JUST_DISMISS));
    }
}

package p040o;

import p040o.access$2300;
import p040o.getSteadyMessage;
import p040o.writeUInt64NoTag;

/* renamed from: o.setRotateMessage */
public final /* synthetic */ class setRotateMessage implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getSteadyMessage.C46683 MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ Throwable read;

    public /* synthetic */ setRotateMessage(getSteadyMessage.C46683 r1, Throwable th) {
        this.MediaBrowserCompat$CustomActionResultReceiver = r1;
        this.read = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        getSteadyMessage.C46683 r0 = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((getMicrAmount$MediaBrowserCompat$SearchResultReceiver) obj).write(getSteadyMessage.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.read, access$2300.write.JUST_DISMISS));
    }
}

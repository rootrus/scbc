package p040o;

import p040o.IdParameters;
import p040o.access$2300;
import p040o.buildUnexpectedTypeError;
import p040o.writeUInt64NoTag;

/* renamed from: o.getOverrideField */
public final /* synthetic */ class getOverrideField implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ buildUnexpectedTypeError.read MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ Throwable read;

    public /* synthetic */ getOverrideField(buildUnexpectedTypeError.read read2, Throwable th) {
        this.MediaBrowserCompat$ItemReceiver = read2;
        this.read = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        buildUnexpectedTypeError.read read2 = this.MediaBrowserCompat$ItemReceiver;
        IdParameters.IdState idState = (IdParameters.IdState) obj;
        idState.MediaBrowserCompat$CustomActionResultReceiver(buildUnexpectedTypeError.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.read, access$2300.write.JUST_DISMISS));
        idState.read(buildUnexpectedTypeError.this.MediaBrowserCompat$CustomActionResultReceiver());
    }
}

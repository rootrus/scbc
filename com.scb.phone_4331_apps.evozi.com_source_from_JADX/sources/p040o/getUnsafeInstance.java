package p040o;

import p040o.IdParameters;
import p040o.writeUInt64NoTag;

/* renamed from: o.getUnsafeInstance */
public final /* synthetic */ class getUnsafeInstance implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ buildUnexpectedTypeError read;

    public /* synthetic */ getUnsafeInstance(buildUnexpectedTypeError buildunexpectedtypeerror) {
        this.read = buildunexpectedtypeerror;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((IdParameters.IdState) obj).MediaBrowserCompat$ItemReceiver(!this.read.MediaBrowserCompat$CustomActionResultReceiver());
    }
}

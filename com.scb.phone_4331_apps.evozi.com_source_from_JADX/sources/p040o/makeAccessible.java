package p040o;

import p040o.IdParameters;
import p040o.buildUnexpectedTypeError;
import p040o.writeUInt64NoTag;

/* renamed from: o.makeAccessible */
public final /* synthetic */ class makeAccessible implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ buildUnexpectedTypeError.read read;

    public /* synthetic */ makeAccessible(buildUnexpectedTypeError.read read2) {
        this.read = read2;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((IdParameters.IdState) obj).read(buildUnexpectedTypeError.this.MediaBrowserCompat$CustomActionResultReceiver());
    }
}

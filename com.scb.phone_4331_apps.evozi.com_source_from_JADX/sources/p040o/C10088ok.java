package p040o;

import p040o.getDocumentFramingError;
import p040o.writeUInt64NoTag;

/* renamed from: o.ok */
public final /* synthetic */ class C10088ok implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getUuidUtf8Bytes read;

    public /* synthetic */ C10088ok(getUuidUtf8Bytes getuuidutf8bytes) {
        this.read = getuuidutf8bytes;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getDocumentFramingError.RatingCompat) obj).IconCompatParcelizer(this.read);
    }
}

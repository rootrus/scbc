package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.FormatException */
public final /* synthetic */ class FormatException implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ nonNull read;

    public /* synthetic */ FormatException(nonNull nonnull) {
        this.read = nonnull;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((C6909xbc088368) obj).write(this.read);
    }
}

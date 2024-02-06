package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.writeUInt64NoTag;

/* renamed from: o.getRectRight */
public final /* synthetic */ class getRectRight implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ double read;

    public /* synthetic */ getRectRight(double d) {
        this.read = d;
    }

    public final void IconCompatParcelizer(Object obj) {
        setMicrData.read(this.read, (CheckExtractActivity_MembersInjector.RatingCompat) obj);
    }
}

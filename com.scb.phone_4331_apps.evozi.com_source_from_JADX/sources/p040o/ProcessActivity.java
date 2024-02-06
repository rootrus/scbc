package p040o;

import p040o.C7501tI;
import p040o.writeUInt64NoTag;

/* renamed from: o.ProcessActivity */
public final /* synthetic */ class ProcessActivity implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C7501tI.read read;

    public /* synthetic */ ProcessActivity(C7501tI.read read2) {
        this.read = read2;
    }

    public final void IconCompatParcelizer(Object obj) {
        C7501tI.read read2 = this.read;
        ((isUndefined) obj).IconCompatParcelizer(C7501tI.this.MediaDescriptionCompat, read2.read);
    }
}

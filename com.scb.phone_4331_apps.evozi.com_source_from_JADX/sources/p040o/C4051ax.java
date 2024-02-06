package p040o;

import p040o.CheckWorkflowActivity;
import p040o.writeUInt64NoTag;

/* renamed from: o.ax */
public final /* synthetic */ class C4051ax implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setCropLineStyle read;

    public /* synthetic */ C4051ax(setCropLineStyle setcroplinestyle) {
        this.read = setcroplinestyle;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckWorkflowActivity.C64001) obj).read(this.read.MediaSessionCompat$ResultReceiverWrapper);
    }
}

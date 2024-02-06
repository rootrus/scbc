package p040o;

import p040o.C4131c;
import p040o.writeUInt64NoTag;

/* renamed from: o.setTorchButtonChecked */
public final /* synthetic */ class setTorchButtonChecked implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4131c.C41333.write MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ setTorchButtonChecked(C4131c.C41333.write write) {
        this.MediaBrowserCompat$CustomActionResultReceiver = write;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckWorkflowActivity) obj).read(C4131c.C41333.this.write);
    }
}

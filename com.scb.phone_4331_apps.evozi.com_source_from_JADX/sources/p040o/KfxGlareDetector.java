package p040o;

import java.util.List;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.writeUInt64NoTag;

/* renamed from: o.KfxGlareDetector */
public final /* synthetic */ class KfxGlareDetector implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ KfxGlareDetector(List list) {
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckExtractActivity_MembersInjector.setGroupDividerEnabled) obj).write(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}

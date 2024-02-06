package p040o;

import java.util.LinkedList;
import p040o.CrashlyticsCore;
import p040o.ExecutorUtils;
import p040o.writeUInt64NoTag;

/* renamed from: o.getGuidingLine */
public final /* synthetic */ class getGuidingLine implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ LinkedList MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ ExecutorUtils.C33371 MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getGuidingLine(ExecutorUtils.C33371 r1, LinkedList linkedList) {
        this.MediaBrowserCompat$ItemReceiver = r1;
        this.MediaBrowserCompat$CustomActionResultReceiver = linkedList;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckParameters_Factory) obj).write(this.MediaBrowserCompat$ItemReceiver, (CrashlyticsCore.C32462) this.MediaBrowserCompat$CustomActionResultReceiver.getFirst());
    }
}

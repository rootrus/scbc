package p040o;

import java.util.ArrayList;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.writeUInt64NoTag;

/* renamed from: o.getIpOperationsFilePath */
public final /* synthetic */ class getIpOperationsFilePath implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ ArrayList write;

    public /* synthetic */ getIpOperationsFilePath(ArrayList arrayList) {
        this.write = arrayList;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckExtractActivity_MembersInjector.setExpandedFormat) obj).MediaBrowserCompat$CustomActionResultReceiver(this.write);
    }
}

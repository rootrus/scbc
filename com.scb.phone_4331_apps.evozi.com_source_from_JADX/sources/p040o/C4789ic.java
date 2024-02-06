package p040o;

import java.util.List;
import p040o.CheckParameters_MembersInjector;
import p040o.startCenterMessage;
import p040o.writeUInt64NoTag;

/* renamed from: o.ic */
public final /* synthetic */ class C4789ic implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ startCenterMessage.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ List read;

    public /* synthetic */ C4789ic(startCenterMessage.IconCompatParcelizer iconCompatParcelizer, List list) {
        this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer;
        this.read = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        startCenterMessage.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver;
        List list = this.read;
        toShortArray unused = startCenterMessage.this.read;
        ((CheckParameters_MembersInjector.IconCompatParcelizer) obj).MediaBrowserCompat$ItemReceiver(toShortArray.MediaBrowserCompat$ItemReceiver(list, new setCenterMsg(startCenterMessage.this.read)));
    }
}

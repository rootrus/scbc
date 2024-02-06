package p040o;

import p040o.XVrsBlur;
import p040o.writeUInt64NoTag;

/* renamed from: o.XVrsBlur$IconCompatParcelizer$MediaBrowserCompat$ItemReceiver */
final class XVrsBlur$IconCompatParcelizer$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<IdWorkflowActivity_MembersInjector> {
    private /* synthetic */ onUpgrade MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ XVrsBlur.IconCompatParcelizer write;

    XVrsBlur$IconCompatParcelizer$MediaBrowserCompat$ItemReceiver(XVrsBlur.IconCompatParcelizer iconCompatParcelizer, onUpgrade onupgrade) {
        this.write = iconCompatParcelizer;
        this.MediaBrowserCompat$ItemReceiver = onupgrade;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        IdWorkflowActivity_MembersInjector idWorkflowActivity_MembersInjector = (IdWorkflowActivity_MembersInjector) obj;
        idWorkflowActivity_MembersInjector.aj_();
        FirebaseApiNotAvailableException MediaBrowserCompat$CustomActionResultReceiver = XVrsBlur.this.read.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver);
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$CustomActionResultReceiver, "cardTransactionDTO");
        idWorkflowActivity_MembersInjector.read(MediaBrowserCompat$CustomActionResultReceiver);
    }
}

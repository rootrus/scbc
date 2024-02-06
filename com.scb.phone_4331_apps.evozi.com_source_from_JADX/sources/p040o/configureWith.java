package p040o;

import p040o.C7039x355e6121;
import p040o.RttiJsonCheck;
import p040o.writeUInt64NoTag;

/* renamed from: o.configureWith */
public final /* synthetic */ class configureWith implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Service MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ lambda$component$0 read;
    private final /* synthetic */ C7039x355e6121.read write;

    public /* synthetic */ configureWith(lambda$component$0 lambda_component_0, Service service, C7039x355e6121.read read2) {
        this.read = lambda_component_0;
        this.MediaBrowserCompat$CustomActionResultReceiver = service;
        this.write = read2;
    }

    public final void IconCompatParcelizer(Object obj) {
        lambda$component$0 lambda_component_0 = this.read;
        ((RttiJsonCheck.C12561) obj).write(lambda_component_0.write.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, lambda_component_0.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.write(), lambda_component_0.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.AppCompatDelegateImpl$ListMenuDecorView().MediaSessionCompat$ResultReceiverWrapper > 0, this.write));
    }
}

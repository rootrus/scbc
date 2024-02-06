package p040o;

import p040o.TouchPointInstructionActivity;
import p040o.withUnregisteredFid;
import p040o.writeUInt64NoTag;

/* renamed from: o.FirebaseInstallationsApi */
public final /* synthetic */ class FirebaseInstallationsApi implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ withUnregisteredFid.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ TouchPointInstructionActivity.write MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ FirebaseInstallationsApi(withUnregisteredFid.IconCompatParcelizer iconCompatParcelizer, TouchPointInstructionActivity.write write) {
        this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer;
        this.MediaBrowserCompat$ItemReceiver = write;
    }

    public final void IconCompatParcelizer(Object obj) {
        withUnregisteredFid.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((C1422x86f1bdff) obj).IconCompatParcelizer(withUnregisteredFid.this.write.MediaBrowserCompat$CustomActionResultReceiver(withUnregisteredFid.this.IconCompatParcelizer, this.MediaBrowserCompat$ItemReceiver));
    }
}

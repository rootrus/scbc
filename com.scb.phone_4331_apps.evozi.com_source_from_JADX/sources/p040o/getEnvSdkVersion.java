package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getEnvSdkVersion */
public final /* synthetic */ class getEnvSdkVersion implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Boolean read;

    public /* synthetic */ getEnvSdkVersion(Boolean bool) {
        this.read = bool;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckWorkflowActivity_MembersInjector) obj).MediaBrowserCompat$CustomActionResultReceiver(this.read.booleanValue());
    }
}

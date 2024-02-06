package p040o;

import p040o.access$2300;
import p040o.getEnvTimeZone;
import p040o.writeUInt64NoTag;

/* renamed from: o.getEnvOsVersion */
public final /* synthetic */ class getEnvOsVersion implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable IconCompatParcelizer;
    private final /* synthetic */ getEnvTimeZone.write read;

    public /* synthetic */ getEnvOsVersion(getEnvTimeZone.write write, Throwable th) {
        this.read = write;
        this.IconCompatParcelizer = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        getEnvTimeZone.write write = this.read;
        ((CheckWorkflowActivity_MembersInjector) obj).IconCompatParcelizer(getEnvTimeZone.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer, access$2300.write.JUST_DISMISS));
    }
}

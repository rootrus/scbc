package p040o;

import p040o.AutoValue_CrashlyticsReport_Session_OperatingSystem;
import p040o.CheckParameters_MembersInjector;
import p040o.writeUInt64NoTag;

/* renamed from: o.captureImage */
public final /* synthetic */ class captureImage implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ AutoValue_CrashlyticsReport_Session_OperatingSystem.Builder read;

    public /* synthetic */ captureImage(AutoValue_CrashlyticsReport_Session_OperatingSystem.Builder builder) {
        this.read = builder;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckParameters_MembersInjector.read) obj).write(this.read);
    }
}

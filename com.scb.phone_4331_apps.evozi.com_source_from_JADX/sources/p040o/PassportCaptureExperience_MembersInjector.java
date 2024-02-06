package p040o;

import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.PassportCaptureExperience_MembersInjector */
public final /* synthetic */ class PassportCaptureExperience_MembersInjector implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List read;

    public /* synthetic */ PassportCaptureExperience_MembersInjector(List list) {
        this.read = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckParameters) obj).MediaBrowserCompat$CustomActionResultReceiver(this.read);
    }
}

package p040o;

import java.util.List;
import p040o.C10881getCAR;
import p040o.writeUInt64NoTag;

/* renamed from: o.SessionSettingsData */
public final /* synthetic */ class SessionSettingsData implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List read;

    public /* synthetic */ SessionSettingsData(List list) {
        this.read = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((C10881getCAR.IconCompatParcelizer) obj).IconCompatParcelizer(((addDelayedShutdownHook) this.read.get(0)).MediaBrowserCompat$CustomActionResultReceiver);
    }
}

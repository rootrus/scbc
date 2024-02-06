package p040o;

import p040o.RttiJsonCheck;
import p040o.writeUInt64NoTag;

/* renamed from: o.getUnityVersion */
public final /* synthetic */ class getUnityVersion implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Service IconCompatParcelizer;

    public /* synthetic */ getUnityVersion(Service service) {
        this.IconCompatParcelizer = service;
    }

    public final void IconCompatParcelizer(Object obj) {
        DefaultHeartBeatInfo.read(this.IconCompatParcelizer, (RttiJsonCheck.C7042b) obj);
    }
}

package p040o;

import p040o.C3970aH;
import p040o.CheckCaptureModule;
import p040o.writeUInt64NoTag;

/* renamed from: o.SelfieCaptureExperience_MembersInjector */
public final /* synthetic */ class SelfieCaptureExperience_MembersInjector implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C3970aH.write read;

    public /* synthetic */ SelfieCaptureExperience_MembersInjector(C3970aH.write write) {
        this.read = write;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckCaptureModule.RttiExceptionResponseDeserializer) obj).IconCompatParcelizer(this.read.read);
    }
}

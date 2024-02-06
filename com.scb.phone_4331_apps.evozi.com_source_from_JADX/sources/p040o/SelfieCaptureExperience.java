package p040o;

import p040o.CheckCaptureModule;
import p040o.writeUInt64NoTag;

/* renamed from: o.SelfieCaptureExperience */
public final /* synthetic */ class SelfieCaptureExperience implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getGeoDataClient IconCompatParcelizer;

    public /* synthetic */ SelfieCaptureExperience(getGeoDataClient getgeodataclient) {
        this.IconCompatParcelizer = getgeodataclient;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckCaptureModule.RttiExceptionResponseDeserializer) obj).read(this.IconCompatParcelizer);
    }
}

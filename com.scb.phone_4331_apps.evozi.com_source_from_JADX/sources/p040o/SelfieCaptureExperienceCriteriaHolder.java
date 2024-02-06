package p040o;

import p040o.CheckCaptureModule;
import p040o.writeUInt64NoTag;

/* renamed from: o.SelfieCaptureExperienceCriteriaHolder */
public final /* synthetic */ class SelfieCaptureExperienceCriteriaHolder implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getGeoDataClient read;

    public /* synthetic */ SelfieCaptureExperienceCriteriaHolder(getGeoDataClient getgeodataclient) {
        this.read = getgeodataclient;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckCaptureModule.RttiExceptionResponseDeserializer) obj).MediaBrowserCompat$ItemReceiver(this.read);
    }
}

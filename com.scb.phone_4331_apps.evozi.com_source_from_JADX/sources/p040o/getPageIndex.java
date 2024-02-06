package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.getPageIndex */
public final /* synthetic */ class getPageIndex implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ CaptureGuidance read;
    private final /* synthetic */ standardStartAndWait write;

    public /* synthetic */ getPageIndex(CaptureGuidance captureGuidance, standardStartAndWait standardstartandwait) {
        this.read = captureGuidance;
        this.write = standardstartandwait;
    }

    public final void IconCompatParcelizer(Object obj) {
        CaptureGuidance captureGuidance = this.read;
        standardStartAndWait standardstartandwait = this.write;
        proxyGetIIdExtractionServerRtti proxygetiidextractionserverrtti = (proxyGetIIdExtractionServerRtti) obj;
        if (!standardstartandwait.MediaBrowserCompat$SearchResultReceiver.equalsIgnoreCase("")) {
            proxygetiidextractionserverrtti.RatingCompat(standardstartandwait.MediaBrowserCompat$SearchResultReceiver);
        } else {
            proxygetiidextractionserverrtti.write(captureGuidance.MediaBrowserCompat$CustomActionResultReceiver.read(standardstartandwait.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer, standardstartandwait.MediaBrowserCompat$CustomActionResultReceiver.read, access$2300.write.JUST_DISMISS));
        }
    }
}

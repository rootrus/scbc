package p040o;

import p040o.Report;
import p040o.ReportUploader;

/* renamed from: o.buildAppDataFrom$MediaBrowserCompat$CustomActionResultReceiver */
public final class buildAppDataFrom$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<PlaceBufferResponse> {
    final /* synthetic */ buildAppDataFrom IconCompatParcelizer;
    final boolean MediaBrowserCompat$ItemReceiver;

    public final /* synthetic */ void onNext(Object obj) {
        PlaceBufferResponse placeBufferResponse = (PlaceBufferResponse) obj;
        boolean unused = this.IconCompatParcelizer.IconCompatParcelizer = false;
        boolean z = true;
        if (placeBufferResponse.MediaBrowserCompat$CustomActionResultReceiver == null && placeBufferResponse.IconCompatParcelizer == null) {
            buildAppDataFrom buildappdatafrom = this.IconCompatParcelizer;
            DataTransportCrashlyticsReportSender$$Lambda$1 dataTransportCrashlyticsReportSender$$Lambda$1 = DataTransportCrashlyticsReportSender$$Lambda$1.MediaBrowserCompat$ItemReceiver;
            if (buildappdatafrom.RatingCompat == null) {
                z = false;
            }
            if (z) {
                dataTransportCrashlyticsReportSender$$Lambda$1.IconCompatParcelizer(buildappdatafrom.RatingCompat);
                return;
            }
            return;
        }
        buildAppDataFrom buildappdatafrom2 = this.IconCompatParcelizer;
        ReportUploader.HandlingExceptionCheck handlingExceptionCheck = new ReportUploader.HandlingExceptionCheck(this, placeBufferResponse);
        if (buildappdatafrom2.RatingCompat == null) {
            z = false;
        }
        if (z) {
            handlingExceptionCheck.IconCompatParcelizer(buildappdatafrom2.RatingCompat);
        }
    }

    public buildAppDataFrom$MediaBrowserCompat$CustomActionResultReceiver(buildAppDataFrom buildappdatafrom, boolean z) {
        this.IconCompatParcelizer = buildappdatafrom;
        this.MediaBrowserCompat$ItemReceiver = z;
    }

    public final void onComplete() {
        buildAppDataFrom.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer);
        buildAppDataFrom.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer);
    }

    public final void onError(Throwable th) {
        boolean unused = this.IconCompatParcelizer.IconCompatParcelizer = false;
        boolean z = true;
        if ((this.IconCompatParcelizer.RatingCompat != null) && !this.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver(th)) {
            buildAppDataFrom.IconCompatParcelizer(this.IconCompatParcelizer);
            buildAppDataFrom buildappdatafrom = this.IconCompatParcelizer;
            Report.Type type = Report.Type.MediaBrowserCompat$CustomActionResultReceiver;
            if (buildappdatafrom.RatingCompat == null) {
                z = false;
            }
            if (z) {
                type.IconCompatParcelizer(buildappdatafrom.RatingCompat);
            }
        }
    }
}

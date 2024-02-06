package p040o;

import p040o.CrashlyticsController;
import p040o.PassportCaptureModule_GetUriRttiFactory;
import p040o.writeUInt64NoTag;

/* renamed from: o.getIsDocumentClassIndexFieldString$MediaSessionCompat$Token */
final class getIsDocumentClassIndexFieldString$MediaSessionCompat$Token<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportCaptureModule_GetUriRttiFactory.read> {
    private /* synthetic */ CrashlyticsController.SendReportRunnable MediaBrowserCompat$CustomActionResultReceiver;

    getIsDocumentClassIndexFieldString$MediaSessionCompat$Token(CrashlyticsController.SendReportRunnable sendReportRunnable) {
        this.MediaBrowserCompat$CustomActionResultReceiver = sendReportRunnable;
    }

    public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((PassportCaptureModule_GetUriRttiFactory.read) obj).IconCompatParcelizer((getLogFileDir) this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}

package p040o;

import p040o.CrashlyticsCore;
import p040o.writeUInt64NoTag;

/* renamed from: o.GetIndexFields */
public final /* synthetic */ class GetIndexFields implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getProfile MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ CrashlyticsCore.C32441 write;

    public /* synthetic */ GetIndexFields(getProfile getprofile, CrashlyticsCore.C32441 r2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getprofile;
        this.write = r2;
    }

    public final void IconCompatParcelizer(Object obj) {
        String str;
        String str2;
        getProfile getprofile = this.MediaBrowserCompat$CustomActionResultReceiver;
        CrashlyticsCore.C32441 r1 = this.write;
        CheckCaptureModule_GetIJsonExactionHelperKtaFactory checkCaptureModule_GetIJsonExactionHelperKtaFactory = (CheckCaptureModule_GetIJsonExactionHelperKtaFactory) obj;
        entry entry = getprofile.read;
        int i = getprofile.IconCompatParcelizer;
        String str3 = r1.MediaSessionCompat$ResultReceiverWrapper;
        String str4 = r1.f2693x50fd9e4a;
        String string = entry.MediaBrowserCompat$CustomActionResultReceiver.getString(i == 0 ? Iterables$3$MediaBrowserCompat$MediaItem.assessment_new_customer_title : Iterables$3$MediaBrowserCompat$MediaItem.assessment_expired_dialog_title);
        String string2 = entry.MediaBrowserCompat$CustomActionResultReceiver.getString(i == 0 ? Iterables$3$MediaBrowserCompat$MediaItem.assessment_new_customer_text : Iterables$3$MediaBrowserCompat$MediaItem.assessment_expired_dialog_text);
        if (i == 0) {
            str = "";
        } else {
            str = entry.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.assessment_expired_dialog_previous_title);
        }
        if (i == 0) {
            str2 = "";
        } else {
            str2 = String.format(entry.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.assessment_expired_dialog_previous_text), new Object[]{str3, str4});
        }
        checkCaptureModule_GetIJsonExactionHelperKtaFactory.MediaBrowserCompat$ItemReceiver(new buildReportData(string, string2, str, str2, entry.MediaBrowserCompat$CustomActionResultReceiver.getString(i == 0 ? Iterables$3$MediaBrowserCompat$MediaItem.assessment_new_customer_start : Iterables$3$MediaBrowserCompat$MediaItem.assessment_expired_dialog_confirm), entry.MediaBrowserCompat$CustomActionResultReceiver.getString(i == 0 ? Iterables$3$MediaBrowserCompat$MediaItem.assessment_new_customer_not_now : Iterables$3$MediaBrowserCompat$MediaItem.assessment_expired_dialog_retake)));
    }
}

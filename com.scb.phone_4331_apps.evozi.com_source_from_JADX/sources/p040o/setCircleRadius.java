package p040o;

import com.scb.phone.view.activity.mwpartner.MwBusinessDetailsActivity;
import p040o.AutoCrashlyticsReportEncoder;
import p040o.getFrontException;

/* renamed from: o.setCircleRadius */
public final /* synthetic */ class setCircleRadius implements EmailVerificationDeepLinkActivity {
    private final /* synthetic */ MwBusinessDetailsActivity MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ setCircleRadius(MwBusinessDetailsActivity mwBusinessDetailsActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = mwBusinessDetailsActivity;
    }

    public final Object read(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean z;
        MwBusinessDetailsActivity mwBusinessDetailsActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        isSupportFragmentClass issupportfragmentclass = (isSupportFragmentClass) obj;
        isSupportFragmentClass issupportfragmentclass2 = (isSupportFragmentClass) obj2;
        isSupportFragmentClass issupportfragmentclass3 = (isSupportFragmentClass) obj3;
        isSupportFragmentClass issupportfragmentclass4 = (isSupportFragmentClass) obj4;
        isSupportFragmentClass issupportfragmentclass5 = (isSupportFragmentClass) obj5;
        if (((Boolean) obj6).booleanValue()) {
            getFrontException.read read = mwBusinessDetailsActivity.MediaSessionCompat$Token;
            T t = issupportfragmentclass.MediaBrowserCompat$ItemReceiver(createRangeIndex.MediaBrowserCompat$CustomActionResultReceiver).IconCompatParcelizer;
            T t2 = null;
            if (t == null) {
                t = null;
            }
            String str = (String) t;
            T t3 = issupportfragmentclass2.MediaBrowserCompat$ItemReceiver(createRangeIndex.MediaBrowserCompat$CustomActionResultReceiver).IconCompatParcelizer;
            if (t3 == null) {
                t3 = null;
            }
            String str2 = (String) t3;
            T t4 = issupportfragmentclass3.IconCompatParcelizer;
            if (t4 == null) {
                t4 = null;
            }
            AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadFileEncoder crashlyticsReportFilesPayloadFileEncoder = (AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadFileEncoder) t4;
            T t5 = issupportfragmentclass4.IconCompatParcelizer;
            if (t5 == null) {
                t5 = null;
            }
            getNdkPayload getndkpayload = (getNdkPayload) t5;
            T t6 = issupportfragmentclass5.IconCompatParcelizer;
            if (t6 != null) {
                t2 = t6;
            }
            if (read.read(str, str2, crashlyticsReportFilesPayloadFileEncoder, getndkpayload, (AutoCrashlyticsReportEncoder.CrashlyticsReportEncoder) t2)) {
                z = true;
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}

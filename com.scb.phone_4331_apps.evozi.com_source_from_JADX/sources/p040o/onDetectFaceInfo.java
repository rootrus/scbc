package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.activity.mwpartner.MwBusinessDetailsActivity;
import p040o.AutoCrashlyticsReportEncoder;

/* renamed from: o.onDetectFaceInfo */
public final /* synthetic */ class onDetectFaceInfo implements DialogInterface.OnClickListener {
    private final /* synthetic */ MwBusinessDetailsActivity MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ AutoCrashlyticsReportEncoder.CrashlyticsReportSessionOperatingSystemEncoder read;

    public /* synthetic */ onDetectFaceInfo(MwBusinessDetailsActivity mwBusinessDetailsActivity, AutoCrashlyticsReportEncoder.CrashlyticsReportSessionOperatingSystemEncoder crashlyticsReportSessionOperatingSystemEncoder) {
        this.MediaBrowserCompat$ItemReceiver = mwBusinessDetailsActivity;
        this.read = crashlyticsReportSessionOperatingSystemEncoder;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        MwBusinessDetailsActivity mwBusinessDetailsActivity = this.MediaBrowserCompat$ItemReceiver;
        mwBusinessDetailsActivity.MediaSessionCompat$Token.write(this.read);
    }
}

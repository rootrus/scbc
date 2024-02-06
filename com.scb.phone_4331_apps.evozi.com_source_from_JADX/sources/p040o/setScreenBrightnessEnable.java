package p040o;

import com.scb.phone.view.activity.mwpartner.MwBusinessDetailsActivity;
import p040o.AutoCrashlyticsReportEncoder;

/* renamed from: o.setScreenBrightnessEnable */
public final /* synthetic */ class setScreenBrightnessEnable implements getRangeIndex$MediaBrowserCompat$ItemReceiver {
    private final /* synthetic */ MwBusinessDetailsActivity write;

    public /* synthetic */ setScreenBrightnessEnable(MwBusinessDetailsActivity mwBusinessDetailsActivity) {
        this.write = mwBusinessDetailsActivity;
    }

    public final void write(Object obj) {
        MwBusinessDetailsActivity mwBusinessDetailsActivity = this.write;
        AutoCrashlyticsReportEncoder.CrashlyticsReportEncoder crashlyticsReportEncoder = (AutoCrashlyticsReportEncoder.CrashlyticsReportEncoder) obj;
        mwBusinessDetailsActivity.MediaSessionCompat$Token.MediaBrowserCompat$CustomActionResultReceiver(crashlyticsReportEncoder);
        mwBusinessDetailsActivity.MediaDescriptionCompat.onNext(isSupportFragmentClass.read(crashlyticsReportEncoder));
    }
}

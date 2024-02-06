package p040o;

import android.content.SharedPreferences;
import java.util.Arrays;
import java.util.List;
import p040o.AutoCrashlyticsReportEncoder;

/* renamed from: o.shouldSendSdkHeartBeat */
public final class shouldSendSdkHeartBeat extends getRuntimeTypeIfMoreSpecific {
    private static final String MediaBrowserCompat$ItemReceiver = "KEY_QR_PAYMENT_COACH_MARKS";
    private static final List<AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder> read = Arrays.asList(new AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder[]{new AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder("coachmark_qr_payment", Iterables$3$MediaBrowserCompat$ItemReceiver.coachmark_qr_payment)});

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public shouldSendSdkHeartBeat(SharedPreferences sharedPreferences) {
        super(sharedPreferences, MediaBrowserCompat$ItemReceiver, read);
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
    }
}

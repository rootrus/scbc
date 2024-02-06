package p040o;

import android.content.SharedPreferences;
import java.util.Arrays;
import java.util.List;
import p040o.AutoCrashlyticsReportEncoder;

/* renamed from: o.isRepeatingSequence */
public final class isRepeatingSequence extends getRuntimeTypeIfMoreSpecific {
    private static final List<AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder> IconCompatParcelizer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public isRepeatingSequence(SharedPreferences sharedPreferences) {
        super(sharedPreferences, "KEY_SERVICE_AT_BANKING_COACH_MARKS", IconCompatParcelizer);
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
    }

    static {
        AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder[] crashlyticsReportSessionEventApplicationEncoderArr = {new AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder("coachmark_service_at_banking_1", Iterables$3$MediaBrowserCompat$ItemReceiver.coachmark_service_at_banking_agent_1), new AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder("coachmark_service_at_banking_2", Iterables$3$MediaBrowserCompat$ItemReceiver.coachmark_service_at_banking_agent_2)};
        onGetStartedClick.write((Object) crashlyticsReportSessionEventApplicationEncoderArr, "elements");
        onGetStartedClick.write((Object) crashlyticsReportSessionEventApplicationEncoderArr, "$this$asList");
        List<AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder> asList = Arrays.asList(crashlyticsReportSessionEventApplicationEncoderArr);
        onGetStartedClick.IconCompatParcelizer((Object) asList, "ArraysUtilJVM.asList(this)");
        IconCompatParcelizer = asList;
    }
}

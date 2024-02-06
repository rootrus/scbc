package p040o;

import android.content.SharedPreferences;
import com.scb.phone.data.network.service.LimitService;
import java.util.Arrays;
import java.util.List;
import p040o.AutoCrashlyticsReportEncoder;

/* renamed from: o.ny */
public final class C5080ny extends getRuntimeTypeIfMoreSpecific {
    private static final String IconCompatParcelizer = "KEY_SEEN_REMITTANCE_COACH_MARKS";
    private static final List<AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder> read = Arrays.asList(new AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder[]{new AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder("coachmark_remittance_1", Iterables$3$MediaBrowserCompat$ItemReceiver.coachmark_remittance_1), new AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder("coachmark_remittance_2", Iterables$3$MediaBrowserCompat$ItemReceiver.coachmark_remittance_2), new AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder("coachmark_remittance_3", Iterables$3$MediaBrowserCompat$ItemReceiver.coachmark_remittance_3)});

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C5080ny(SharedPreferences sharedPreferences) {
        super(sharedPreferences, IconCompatParcelizer, read);
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
    }

    /* renamed from: o.ny$write */
    public static final class write {
        public LimitService MediaBrowserCompat$ItemReceiver;

        private write() {
        }

        @HmlPinActivity
        public write(LimitService limitService) {
            this.MediaBrowserCompat$ItemReceiver = limitService;
        }
    }
}

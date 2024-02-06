package p040o;

import android.content.SharedPreferences;
import java.util.Arrays;
import java.util.List;
import p040o.AutoCrashlyticsReportEncoder;

/* renamed from: o.nativeGetRow */
public class nativeGetRow extends getRuntimeTypeIfMoreSpecific {
    private static final List<AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder> read = Arrays.asList(new AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder[]{new AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder("debitcard_coach_mark_1", Iterables$3$MediaBrowserCompat$ItemReceiver.debitcard_coach_mark_1), new AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder("debitcard_coach_mark_2", Iterables$3$MediaBrowserCompat$ItemReceiver.debitcard_coach_mark_2), new AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder("debitcard_coach_mark_3", Iterables$3$MediaBrowserCompat$ItemReceiver.debitcard_coach_mark_3), new AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder("debitcard_coach_mark_4", Iterables$3$MediaBrowserCompat$ItemReceiver.debitcard_coach_mark_4)});

    @HmlPinActivity
    public nativeGetRow(SharedPreferences sharedPreferences) {
        super(sharedPreferences, "KEY_DEBIT_CARD_COACH_MARKS", read);
    }
}

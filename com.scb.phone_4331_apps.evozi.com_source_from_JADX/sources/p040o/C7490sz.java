package p040o;

import android.content.SharedPreferences;
import java.util.Arrays;
import java.util.List;
import p040o.AutoCrashlyticsReportEncoder;

/* renamed from: o.sz */
public final class C7490sz extends getRuntimeTypeIfMoreSpecific {
    private static final List<AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder> IconCompatParcelizer = Arrays.asList(new AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder[]{new AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder("coachmark_billsearch_history", Iterables$3$MediaBrowserCompat$ItemReceiver.coachmark_history_bill_payment), new AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder("coachmark_billsearch_1", Iterables$3$MediaBrowserCompat$ItemReceiver.coachmark_billpayment1), new AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder("coachmark_billsearch_2", Iterables$3$MediaBrowserCompat$ItemReceiver.coachmark_billpayment2)});
    private static final String MediaBrowserCompat$ItemReceiver = "KEY_SEEN_BILL_SEARCH_COACH_MARKS";
    private static final String read = "BILL_PAYMENT_HISTORY_COACH_MARK_DONE_KEY";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C7490sz(SharedPreferences sharedPreferences) {
        super(sharedPreferences, MediaBrowserCompat$ItemReceiver, IconCompatParcelizer);
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
    }

    public final List<Integer> MediaBrowserCompat$CustomActionResultReceiver() {
        List<Integer> MediaBrowserCompat$CustomActionResultReceiver = super.MediaBrowserCompat$CustomActionResultReceiver();
        if (this.write.getBoolean(read, false)) {
            onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$CustomActionResultReceiver, "list");
            if (!MediaBrowserCompat$CustomActionResultReceiver.isEmpty()) {
                MediaBrowserCompat$CustomActionResultReceiver.remove(0);
            }
        }
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$CustomActionResultReceiver, "list");
        return MediaBrowserCompat$CustomActionResultReceiver;
    }
}

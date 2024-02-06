package p040o;

import com.scb.phone.view.activity.loan.LoanInputActivity;
import p040o.AppStatistics;
import p040o.Futures;

/* renamed from: o.rollThreshold */
public final /* synthetic */ class rollThreshold implements Runnable {
    private final /* synthetic */ LoanInputActivity IconCompatParcelizer;
    private final /* synthetic */ Futures.C34051 MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ rollThreshold(LoanInputActivity loanInputActivity, Futures.C34051 r2) {
        this.IconCompatParcelizer = loanInputActivity;
        this.MediaBrowserCompat$ItemReceiver = r2;
    }

    public final void run() {
        LoanInputActivity loanInputActivity = this.IconCompatParcelizer;
        Futures.C34051 r1 = this.MediaBrowserCompat$ItemReceiver;
        removeDataStoreInitializedListener removedatastoreinitializedlistener = loanInputActivity.loanInputPresenter;
        String str = r1.AppCompatDialogFragment;
        removedatastoreinitializedlistener.MediaBrowserCompat$MediaItem = str;
        AppStatistics.AppStatsExportFormat appStatsExportFormat = new AppStatistics.AppStatsExportFormat(removedatastoreinitializedlistener, str);
        if (removedatastoreinitializedlistener.RatingCompat != null) {
            appStatsExportFormat.IconCompatParcelizer(removedatastoreinitializedlistener.RatingCompat);
        }
    }
}

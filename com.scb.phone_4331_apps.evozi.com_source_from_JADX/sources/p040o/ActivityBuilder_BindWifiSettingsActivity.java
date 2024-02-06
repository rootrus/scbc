package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.investment.scbs.open.SuitabilityQuestionsPart2Fragment;

/* renamed from: o.ActivityBuilder_BindWifiSettingsActivity */
public final /* synthetic */ class ActivityBuilder_BindWifiSettingsActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ SuitabilityQuestionsPart2Fragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ ActivityBuilder_BindWifiSettingsActivity(SuitabilityQuestionsPart2Fragment suitabilityQuestionsPart2Fragment) {
        this.MediaBrowserCompat$ItemReceiver = suitabilityQuestionsPart2Fragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.MediaBrowserCompat$ItemReceiver.presenter.IconCompatParcelizer();
    }
}

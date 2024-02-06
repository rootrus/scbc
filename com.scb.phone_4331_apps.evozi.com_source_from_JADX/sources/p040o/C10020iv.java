package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.activity.bond.BondTermsAndConditionsActivity;

/* renamed from: o.iv */
public final /* synthetic */ class C10020iv implements DialogInterface.OnClickListener {
    private final /* synthetic */ BondTermsAndConditionsActivity MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ C10020iv(BondTermsAndConditionsActivity bondTermsAndConditionsActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = bondTermsAndConditionsActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DefaultHeartBeatInfo$$Lambda$1 defaultHeartBeatInfo$$Lambda$1 = this.MediaBrowserCompat$CustomActionResultReceiver.bondTermsAndConditionsPresenter;
        EventHandler eventHandler = EventHandler.read;
        if (defaultHeartBeatInfo$$Lambda$1.RatingCompat != null) {
            eventHandler.IconCompatParcelizer(defaultHeartBeatInfo$$Lambda$1.RatingCompat);
        }
    }
}

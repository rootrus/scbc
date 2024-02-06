package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.activity.bond.BondTermsAndConditionsActivity;

/* renamed from: o.it */
public final /* synthetic */ class C10019it implements DialogInterface.OnClickListener {
    private final /* synthetic */ BondTermsAndConditionsActivity write;

    public /* synthetic */ C10019it(BondTermsAndConditionsActivity bondTermsAndConditionsActivity) {
        this.write = bondTermsAndConditionsActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DefaultHeartBeatInfo$$Lambda$1 defaultHeartBeatInfo$$Lambda$1 = this.write.bondTermsAndConditionsPresenter;
        boolean z = true;
        if (defaultHeartBeatInfo$$Lambda$1.write != null) {
            internalAdd internaladd = new internalAdd(defaultHeartBeatInfo$$Lambda$1);
            if (defaultHeartBeatInfo$$Lambda$1.RatingCompat == null) {
                z = false;
            }
            if (z) {
                internaladd.IconCompatParcelizer(defaultHeartBeatInfo$$Lambda$1.RatingCompat);
                return;
            }
            return;
        }
        EventHandler eventHandler = EventHandler.read;
        if (defaultHeartBeatInfo$$Lambda$1.RatingCompat == null) {
            z = false;
        }
        if (z) {
            eventHandler.IconCompatParcelizer(defaultHeartBeatInfo$$Lambda$1.RatingCompat);
        }
    }
}

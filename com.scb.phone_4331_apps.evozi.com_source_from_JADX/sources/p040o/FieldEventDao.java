package p040o;

import com.scb.phone.view.activity.debitcard.reset.DebitCardResetPinActivity;
import p040o.TaskRunner;

/* renamed from: o.FieldEventDao */
public final /* synthetic */ class FieldEventDao implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ TaskRunner.C3843b.C38441 MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ FieldEventDao(TaskRunner.C3843b.C38441 r1) {
        this.MediaBrowserCompat$ItemReceiver = r1;
    }

    public final void IconCompatParcelizer(Object obj) {
        TaskRunner.C3843b.C38441 r0 = this.MediaBrowserCompat$ItemReceiver;
        getInstanceType getinstancetype = new getInstanceType(r0, (DebitCardResetPinActivity.read) obj);
        if (r0.RatingCompat != null) {
            getinstancetype.IconCompatParcelizer(r0.RatingCompat);
        }
    }
}

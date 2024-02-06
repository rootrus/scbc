package p040o;

import com.scb.phone.view.adapter.sme.gifting.C5784x1db42caa;
import com.scb.phone.view.fragment.sme.gifting.GiftRecipientFromFavouriteFragment;
import p040o.CrashlyticsReport;

/* renamed from: o.ActivityBuilder_ContributeRemittanceLandingActivity */
public final /* synthetic */ class ActivityBuilder_ContributeRemittanceLandingActivity implements C5784x1db42caa {
    private final /* synthetic */ GiftRecipientFromFavouriteFragment read;

    public /* synthetic */ ActivityBuilder_ContributeRemittanceLandingActivity(GiftRecipientFromFavouriteFragment giftRecipientFromFavouriteFragment) {
        this.read = giftRecipientFromFavouriteFragment;
    }

    public final void read(CrashlyticsReport.Session.Event.Application.Builder builder) {
        startCenterMessage startcentermessage = this.read.selectRecipientFromFavouritePresenter;
        boolean z = true;
        if (startcentermessage.RatingCompat != null) {
            C4792ie ieVar = new C4792ie(startcentermessage, builder);
            if (startcentermessage.RatingCompat == null) {
                z = false;
            }
            if (z) {
                ieVar.IconCompatParcelizer(startcentermessage.RatingCompat);
            }
        }
    }
}

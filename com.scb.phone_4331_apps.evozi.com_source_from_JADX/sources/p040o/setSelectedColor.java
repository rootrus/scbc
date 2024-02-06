package p040o;

import com.scb.phone.R;
import com.scb.phone.view.activity.transferandpay.CardlessATMActivity;

/* renamed from: o.setSelectedColor */
public final /* synthetic */ class setSelectedColor implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ CardlessATMActivity read;

    public /* synthetic */ setSelectedColor(CardlessATMActivity cardlessATMActivity) {
        this.read = cardlessATMActivity;
    }

    public final void IconCompatParcelizer(Object obj) {
        this.read.write(this.read, R.id.root_view, this.read.getString(R.string.cancel_confirm_succes), getOversizeImage.SUCCESS);
    }
}

package p040o;

import android.content.Intent;
import com.scb.phone.view.fragment.transferandpay.BaseTransferAndPayTabFragment;

/* renamed from: o.ActivityBuilder_ContributesHmlBusinessURLInformationActivity */
public final /* synthetic */ class ActivityBuilder_ContributesHmlBusinessURLInformationActivity implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ BaseTransferAndPayTabFragment read;

    public /* synthetic */ ActivityBuilder_ContributesHmlBusinessURLInformationActivity(BaseTransferAndPayTabFragment baseTransferAndPayTabFragment) {
        this.read = baseTransferAndPayTabFragment;
    }

    public final void IconCompatParcelizer(Object obj) {
        this.read.write((Intent) obj);
    }
}

package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.fragment.hml.HmlBusinessOwnerETBPersonalInfoFragment;

/* renamed from: o.writeDouble */
public final /* synthetic */ class writeDouble implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ HmlBusinessOwnerETBPersonalInfoFragment.read IconCompatParcelizer;

    public /* synthetic */ writeDouble(HmlBusinessOwnerETBPersonalInfoFragment.read read) {
        this.IconCompatParcelizer = read;
    }

    public final Object write(Object obj) {
        return DebitCardResetOtpActivity.just(save.MediaBrowserCompat$CustomActionResultReceiver((SingleDataEntity) obj));
    }
}

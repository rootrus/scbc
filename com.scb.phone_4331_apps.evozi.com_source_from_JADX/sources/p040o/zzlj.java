package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.CreditCardBilledDetailActivity;

/* renamed from: o.zzlj */
public final /* synthetic */ class zzlj implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ CreditCardBilledDetailActivity.IconCompatParcelizer read;

    public /* synthetic */ zzlj(CreditCardBilledDetailActivity.IconCompatParcelizer iconCompatParcelizer) {
        this.read = iconCompatParcelizer;
    }

    public final Object write(Object obj) {
        return this.read.write.IconCompatParcelizer((PINMessageException) ((SingleDataEntity) obj).getData());
    }
}

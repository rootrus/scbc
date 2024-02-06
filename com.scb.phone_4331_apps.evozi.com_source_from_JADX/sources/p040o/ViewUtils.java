package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.custom.hml.HmlCommonCustomDialog;

/* renamed from: o.ViewUtils */
public final /* synthetic */ class ViewUtils implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ HmlCommonCustomDialog.IconCompatParcelizer IconCompatParcelizer;

    public /* synthetic */ ViewUtils(HmlCommonCustomDialog.IconCompatParcelizer iconCompatParcelizer) {
        this.IconCompatParcelizer = iconCompatParcelizer;
    }

    public final Object write(Object obj) {
        return setTransactionId.read((percentDecode) ((SingleDataEntity) obj).getData());
    }
}

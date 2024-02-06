package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.custom.hml.HmlCommonCustomDialog;

/* renamed from: o.getRemoteCreator */
public final /* synthetic */ class getRemoteCreator implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ HmlCommonCustomDialog.IconCompatParcelizer write;

    public /* synthetic */ getRemoteCreator(HmlCommonCustomDialog.IconCompatParcelizer iconCompatParcelizer) {
        this.write = iconCompatParcelizer;
    }

    public final Object write(Object obj) {
        return setTransactionId.read((percentDecode) ((SingleDataEntity) obj).getData());
    }
}

package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.CreditCardBilledDetailActivity;

/* renamed from: o.toArray */
public final /* synthetic */ class toArray implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ CreditCardBilledDetailActivity.IconCompatParcelizer MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ toArray(CreditCardBilledDetailActivity.IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer;
    }

    public final Object write(Object obj) {
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        return new getAmbientEnabled(this.MediaBrowserCompat$ItemReceiver.write.IconCompatParcelizer((PINMessageException) singleDataEntity.getData()), singleDataEntity.getStatus().write().equals("1036"), ((PINMessageException) singleDataEntity.getData()).setCheckable.equalsIgnoreCase("CC_ACTIVATION"), singleDataEntity.getStatus().IconCompatParcelizer());
    }
}

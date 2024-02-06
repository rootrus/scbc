package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.data.network.service.BankingAgentService;

/* renamed from: o.zaaw */
public final class zaaw {
    public final BankingAgentService write;

    /* renamed from: o.zaaw$read */
    public static final class read<T, R> implements DirectDebitDeepLinkActivity<T, R> {
        public static final read MediaBrowserCompat$CustomActionResultReceiver = new read();

        read() {
        }

        public final /* synthetic */ Object write(Object obj) {
            SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
            onGetStartedClick.write((Object) singleDataEntity, "it");
            return ((OnTouch) singleDataEntity.getData()).IconCompatParcelizer;
        }
    }

    @HmlPinActivity
    public zaaw(BankingAgentService bankingAgentService) {
        onGetStartedClick.write((Object) bankingAgentService, "bankingAgentService");
        this.write = bankingAgentService;
    }
}

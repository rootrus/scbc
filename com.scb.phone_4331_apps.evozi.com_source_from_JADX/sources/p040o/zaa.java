package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.zaa */
public final class zaa implements OPRStatusRewardsLandingActivity_ViewBinding<onNextTutorialButtonClick> {
    private static final zaa MediaBrowserCompat$ItemReceiver = new zaa();

    public static zaa read() {
        return MediaBrowserCompat$ItemReceiver;
    }

    public final /* synthetic */ Object get() {
        return new onNextTutorialButtonClick();
    }

    /* renamed from: o.zaa$zaa  reason: collision with other inner class name */
    public final /* synthetic */ class C10818zaa implements DirectDebitDeepLinkActivity {
        public static final /* synthetic */ C10818zaa IconCompatParcelizer = new C10818zaa();

        private /* synthetic */ C10818zaa() {
        }

        public final Object write(Object obj) {
            SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
            if (singleDataEntity != null) {
                return (drawTextWithFont) singleDataEntity.getData();
            }
            return null;
        }
    }
}

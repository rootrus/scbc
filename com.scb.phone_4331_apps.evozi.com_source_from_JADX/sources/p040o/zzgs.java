package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.data.network.service.common.SlipPlatformService;
import p039io.beid.beidk.definitions.BeIDParams;
import p040o.AbstractMultimap;

/* renamed from: o.zzgs */
public final class zzgs implements AbstractMultimap.SortedAsMap {
    private final SlipPlatformService MediaBrowserCompat$CustomActionResultReceiver;
    final AccountChangeEventsResponse MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.zzgs$IconCompatParcelizer */
    static final class IconCompatParcelizer<T, R> implements DirectDebitDeepLinkActivity<T, R> {
        private /* synthetic */ zzgs IconCompatParcelizer;

        IconCompatParcelizer(zzgs zzgs) {
            this.IconCompatParcelizer = zzgs;
        }

        public final /* synthetic */ Object write(Object obj) {
            SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
            onGetStartedClick.write((Object) singleDataEntity, "entity");
            return this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver((removeLottieOnCompositionLoadedListener) singleDataEntity.getData());
        }
    }

    @HmlPinActivity
    public zzgs(SlipPlatformService slipPlatformService, AccountChangeEventsResponse accountChangeEventsResponse) {
        onGetStartedClick.write((Object) slipPlatformService, "slipPlatformService");
        onGetStartedClick.write((Object) accountChangeEventsResponse, "mapper");
        this.MediaBrowserCompat$CustomActionResultReceiver = slipPlatformService;
        this.MediaBrowserCompat$ItemReceiver = accountChangeEventsResponse;
    }

    public final BScanCNotificationDeepLinkActivity<isClickable> IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, "refId");
        BScanCNotificationDeepLinkActivity<SingleDataEntity<removeLottieOnCompositionLoadedListener>> thirdPartySlip = this.MediaBrowserCompat$CustomActionResultReceiver.getThirdPartySlip(str);
        DirectDebitDeepLinkActivity iconCompatParcelizer = new IconCompatParcelizer(this);
        HmlLatestPersonalInformationDeepLinkActivity.write(iconCompatParcelizer, "mapper is null");
        onCopy oncopy = new onCopy(thirdPartySlip, iconCompatParcelizer);
        onGetStartedClick.IconCompatParcelizer((Object) oncopy, "slipPlatformService.getT…ta(entity.data)\n        }");
        return oncopy;
    }

    public final BScanCNotificationDeepLinkActivity<isClickable> write(String str, requestLocationUpdates requestlocationupdates) {
        onGetStartedClick.write((Object) str, BeIDParams.BEID_TRANSACTION_ID);
        onGetStartedClick.write((Object) requestlocationupdates, "function");
        BScanCNotificationDeepLinkActivity<SingleDataEntity<removeLottieOnCompositionLoadedListener>> postThirdPartySlipGenerate = this.MediaBrowserCompat$CustomActionResultReceiver.postThirdPartySlipGenerate(new removeAnimatorListener(str, requestlocationupdates.function));
        DirectDebitDeepLinkActivity zzgs_mediabrowsercompat_customactionresultreceiver = new zzgs$MediaBrowserCompat$CustomActionResultReceiver(this);
        HmlLatestPersonalInformationDeepLinkActivity.write(zzgs_mediabrowsercompat_customactionresultreceiver, "mapper is null");
        onCopy oncopy = new onCopy(postThirdPartySlipGenerate, zzgs_mediabrowsercompat_customactionresultreceiver);
        onGetStartedClick.IconCompatParcelizer((Object) oncopy, "slipPlatformService.post…ta(entity.data)\n        }");
        return oncopy;
    }
}

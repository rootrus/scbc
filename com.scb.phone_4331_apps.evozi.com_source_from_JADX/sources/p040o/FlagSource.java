package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.FlagSource */
public final /* synthetic */ class FlagSource implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ FragmentBuilder_BindSummaryFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ FlagSource(FragmentBuilder_BindSummaryFragment fragmentBuilder_BindSummaryFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindSummaryFragment;
    }

    public final Object write(Object obj) {
        AdvertisingIdClient advertisingIdClient = (AdvertisingIdClient) ((SingleDataEntity) obj).getData();
        onGetStartedClick.write((Object) advertisingIdClient, "securitiesSummaryEntity");
        return DebitCardResetOtpActivity.just(new isStreetNamesEnabled(advertisingIdClient.IconCompatParcelizer));
    }
}

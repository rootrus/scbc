package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.getGenericType */
public final /* synthetic */ class getGenericType implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ zzjv MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getGenericType(zzjv zzjv) {
        this.MediaBrowserCompat$CustomActionResultReceiver = zzjv;
    }

    public final void IconCompatParcelizer(Object obj) {
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        FragmentBuilder_BindPurchaseDepositFragment fragmentBuilder_BindPurchaseDepositFragment = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
        OECF_sRGB oECF_sRGB = new OECF_sRGB();
        oECF_sRGB.MediaBrowserCompat$SearchResultReceiver = ((getMatrix) singleDataEntity.getData()).write;
        oECF_sRGB.Keep = ((getMatrix) singleDataEntity.getData()).read;
        fragmentBuilder_BindPurchaseDepositFragment.MediaBrowserCompat$CustomActionResultReceiver(oECF_sRGB);
    }
}

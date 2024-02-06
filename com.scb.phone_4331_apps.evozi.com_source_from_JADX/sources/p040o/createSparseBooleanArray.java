package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.fragment.cardmanagement.SelectPurchaseFragment$MediaBrowserCompat$ItemReceiver;
import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.createSparseBooleanArray */
public final /* synthetic */ class createSparseBooleanArray implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ SelectPurchaseFragment$MediaBrowserCompat$ItemReceiver IconCompatParcelizer;

    public /* synthetic */ createSparseBooleanArray(SelectPurchaseFragment$MediaBrowserCompat$ItemReceiver selectPurchaseFragment$MediaBrowserCompat$ItemReceiver) {
        this.IconCompatParcelizer = selectPurchaseFragment$MediaBrowserCompat$ItemReceiver;
    }

    public final Object write(Object obj) {
        asActivity asactivity = this.IconCompatParcelizer.read;
        setImageAssetDelegate setimageassetdelegate = (setImageAssetDelegate) ((SingleDataEntity) obj).getData();
        onGetStartedClick.write((Object) setimageassetdelegate, "data");
        C10149xd4f8c014 setonstreetviewpanoramacamerachangelistener_mediabrowsercompat_customactionresultreceiver = new C10149xd4f8c014((byte) 0);
        setonstreetviewpanoramacamerachangelistener_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver = FragmentBuilder_BindSummaryFragment.write(setimageassetdelegate.MediaBrowserCompat$ItemReceiver, (OffsetDateTime) null);
        setonstreetviewpanoramacamerachangelistener_mediabrowsercompat_customactionresultreceiver.write = setimageassetdelegate.IconCompatParcelizer;
        setonstreetviewpanoramacamerachangelistener_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver = setimageassetdelegate.MediaBrowserCompat$CustomActionResultReceiver;
        setonstreetviewpanoramacamerachangelistener_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer = setimageassetdelegate.read;
        setOnStreetViewPanoramaCameraChangeListener setonstreetviewpanoramacamerachangelistener = new setOnStreetViewPanoramaCameraChangeListener(setonstreetviewpanoramacamerachangelistener_mediabrowsercompat_customactionresultreceiver, (byte) 0);
        onGetStartedClick.IconCompatParcelizer((Object) setonstreetviewpanoramacamerachangelistener, "DealsBuyConfirmation.new…\n                .build()");
        return setonstreetviewpanoramacamerachangelistener;
    }
}

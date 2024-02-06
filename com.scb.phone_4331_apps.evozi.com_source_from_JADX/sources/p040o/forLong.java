package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.fragment.remittance.C6150x69d72700;
import org.threeten.p041bp.OffsetDateTime;
import scb.yek.GetKey$MediaBrowserCompat$CustomActionResultReceiver;

/* renamed from: o.forLong */
public final /* synthetic */ class forLong implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ C6150x69d72700 read;

    public /* synthetic */ forLong(C6150x69d72700 remittanceCountrySelectionFragment$MediaBrowserCompat$ItemReceiver) {
        this.read = remittanceCountrySelectionFragment$MediaBrowserCompat$ItemReceiver;
    }

    public final Object write(Object obj) {
        getMinApkVersion getminapkversion = this.read.MediaSessionCompat$ResultReceiverWrapper;
        applyMasks applymasks = (applyMasks) ((SingleDataEntity) obj).getData();
        OffsetDateTime offsetDateTime = null;
        if (applymasks.MediaBrowserCompat$ItemReceiver != null) {
            offsetDateTime = FragmentBuilder_BindSummaryFragment.write(applymasks.MediaBrowserCompat$ItemReceiver, (OffsetDateTime) null);
        }
        return DebitCardResetOtpActivity.just(new GetKey$MediaBrowserCompat$CustomActionResultReceiver(offsetDateTime));
    }
}

package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.fragment.remittance.C6150x69d72700;
import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.forBase64 */
public final /* synthetic */ class forBase64 implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ C6150x69d72700 read;

    public /* synthetic */ forBase64(C6150x69d72700 remittanceCountrySelectionFragment$MediaBrowserCompat$ItemReceiver) {
        this.read = remittanceCountrySelectionFragment$MediaBrowserCompat$ItemReceiver;
    }

    public final Object write(Object obj) {
        FirstPartyScopes firstPartyScopes = this.read.MediaDescriptionCompat;
        getTypeFilter gettypefilter = new getTypeFilter();
        gettypefilter.read = FragmentBuilder_BindSummaryFragment.write(((getMatteType) ((SingleDataEntity) obj).getData()).MediaBrowserCompat$ItemReceiver, (OffsetDateTime) null);
        return DebitCardResetOtpActivity.just(gettypefilter);
    }
}

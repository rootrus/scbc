package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.fragment.hml.HmlBusinessOwnerETBPersonalInfoFragment;
import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.writeDoubleArray */
public final /* synthetic */ class writeDoubleArray implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ HmlBusinessOwnerETBPersonalInfoFragment.read read;

    public /* synthetic */ writeDoubleArray(HmlBusinessOwnerETBPersonalInfoFragment.read read2) {
        this.read = read2;
    }

    public final Object write(Object obj) {
        getHintPickerIntent gethintpickerintent = this.read.write;
        done done = (done) ((SingleDataEntity) obj).getData();
        setSessionTimeoutDuration MediaBrowserCompat$CustomActionResultReceiver = setSessionTimeoutDuration.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver.write = done.read;
        MediaBrowserCompat$CustomActionResultReceiver.read = FragmentBuilder_BindSummaryFragment.write(done.write, (OffsetDateTime) null);
        return DebitCardResetOtpActivity.just(MediaBrowserCompat$CustomActionResultReceiver);
    }
}

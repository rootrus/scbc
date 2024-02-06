package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.fragment.hml.businessowner.C6016xc8f96b6e;
import p040o.DeepLinkEntry;

/* renamed from: o.creator */
public final /* synthetic */ class creator implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ C6016xc8f96b6e IconCompatParcelizer;

    public /* synthetic */ creator(C6016xc8f96b6e hmlBusinessOwnerOutcomePendingFragment$MediaBrowserCompat$CustomActionResultReceiver) {
        this.IconCompatParcelizer = hmlBusinessOwnerOutcomePendingFragment$MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final Object write(Object obj) {
        return DebitCardResetOtpActivity.just(this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer((DeepLinkEntry.Type) ((SingleDataEntity) obj).getData()));
    }
}

package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.fragment.transferandpay.AnyTransferHistoryFragment;

/* renamed from: o.setWindow */
public final /* synthetic */ class setWindow implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ AnyTransferHistoryFragment.IconCompatParcelizer MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ setWindow(AnyTransferHistoryFragment.IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer;
    }

    public final Object write(Object obj) {
        PolystarShapeParser polystarShapeParser = (PolystarShapeParser) ((SingleDataEntity) obj).getData();
        return DebitCardResetOtpActivity.just(new setBoundsBias(polystarShapeParser.MediaBrowserCompat$CustomActionResultReceiver, polystarShapeParser.write, polystarShapeParser.MediaBrowserCompat$MediaItem, polystarShapeParser.read, polystarShapeParser.MediaDescriptionCompat, polystarShapeParser.RatingCompat));
    }
}

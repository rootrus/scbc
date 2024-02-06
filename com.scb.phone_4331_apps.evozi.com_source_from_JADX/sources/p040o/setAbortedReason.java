package p040o;

import com.scb.phone.presentation.presenter.investment.accountdetail.ScbsAccountDetailPresenter;
import p040o.getMicrAmount;
import p040o.writeUInt64NoTag;

/* renamed from: o.setAbortedReason */
public final /* synthetic */ class setAbortedReason implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ populateBinaryImageData MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ setAbortedReason(populateBinaryImageData populatebinaryimagedata) {
        this.MediaBrowserCompat$ItemReceiver = populatebinaryimagedata;
    }

    public final void IconCompatParcelizer(Object obj) {
        ScbsAccountDetailPresenter.read(this.MediaBrowserCompat$ItemReceiver, (getMicrAmount.read) obj);
    }
}

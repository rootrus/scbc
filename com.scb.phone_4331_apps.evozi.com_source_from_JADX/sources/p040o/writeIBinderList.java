package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.fragment.hml.C5985x82597580;

/* renamed from: o.writeIBinderList */
public final /* synthetic */ class writeIBinderList implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ C5985x82597580 write;

    public /* synthetic */ writeIBinderList(C5985x82597580 hmlDocumentUploadFragment$MediaBrowserCompat$CustomActionResultReceiver) {
        this.write = hmlDocumentUploadFragment$MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final Object write(Object obj) {
        String str;
        LPaint lPaint = (LPaint) ((SingleDataEntity) obj).getData();
        if (lPaint == null || (str = lPaint.MediaBrowserCompat$CustomActionResultReceiver) == null) {
            str = "";
        }
        return DebitCardResetOtpActivity.just(new DenominatorAmountAdapter$BubbleViewHolder(str));
    }
}

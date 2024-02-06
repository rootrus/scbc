package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.zzbm */
public final /* synthetic */ class zzbm implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ BankingAgentReviewActivity IconCompatParcelizer;

    public /* synthetic */ zzbm(BankingAgentReviewActivity bankingAgentReviewActivity) {
        this.IconCompatParcelizer = bankingAgentReviewActivity;
    }

    public final Object write(Object obj) {
        return this.IconCompatParcelizer.MediaMetadataCompat.read(((jsonToColor) ((SingleDataEntity) obj).getData()).read);
    }
}

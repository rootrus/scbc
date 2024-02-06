package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import java.util.List;
import java.util.Objects;

/* renamed from: o.startTransition */
public final /* synthetic */ class startTransition implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ BankingAgentReviewActivity read;

    public /* synthetic */ startTransition(BankingAgentReviewActivity bankingAgentReviewActivity) {
        this.read = bankingAgentReviewActivity;
    }

    public final void IconCompatParcelizer(Object obj) {
        BankingAgentReviewActivity bankingAgentReviewActivity = this.read;
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        synchronized (bankingAgentReviewActivity) {
            bankingAgentReviewActivity.ParcelableVolumeInfo.read = (List) Objects.requireNonNull(((isAnchorPointIdentity) singleDataEntity.getData()).IconCompatParcelizer);
            bankingAgentReviewActivity.MediaSessionCompat$Token.write(bankingAgentReviewActivity.ParcelableVolumeInfo);
        }
    }
}

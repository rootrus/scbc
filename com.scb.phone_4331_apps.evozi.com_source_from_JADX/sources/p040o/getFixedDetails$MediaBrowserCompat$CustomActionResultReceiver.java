package p040o;

import java.util.concurrent.Callable;
import p040o.AbstractMultimap;

/* renamed from: o.getFixedDetails$MediaBrowserCompat$CustomActionResultReceiver */
public final class getFixedDetails$MediaBrowserCompat$CustomActionResultReceiver implements Callable {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ BankingAgentReviewActivity read;

    private getFixedDetails$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public /* synthetic */ getFixedDetails$MediaBrowserCompat$CustomActionResultReceiver(BankingAgentReviewActivity bankingAgentReviewActivity, String str) {
        this.read = bankingAgentReviewActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final Object call() {
        BankingAgentReviewActivity bankingAgentReviewActivity = this.read;
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        AbstractMultimap.AsMap.AsMapEntries asMapEntries = AbstractMultimap.AsMap.AsMapEntries.LOADING;
        bankingAgentReviewActivity.MediaBrowserCompat$ItemReceiver = asMapEntries;
        return bankingAgentReviewActivity.write.MediaBrowserCompat$CustomActionResultReceiver(bankingAgentReviewActivity.ParcelableVolumeInfo, str, asMapEntries, bankingAgentReviewActivity.IconCompatParcelizer, bankingAgentReviewActivity.MediaBrowserCompat$MediaItem, bankingAgentReviewActivity.MediaBrowserCompat$CustomActionResultReceiver);
    }
}

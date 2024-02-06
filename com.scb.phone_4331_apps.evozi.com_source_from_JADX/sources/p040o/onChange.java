package p040o;

/* renamed from: o.onChange */
public final /* synthetic */ class onChange implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ BankingAgentReviewActivity read;

    public /* synthetic */ onChange(BankingAgentReviewActivity bankingAgentReviewActivity) {
        this.read = bankingAgentReviewActivity;
    }

    public final Object write(Object obj) {
        BankingAgentReviewActivity bankingAgentReviewActivity = this.read;
        return bankingAgentReviewActivity.write.read((PlacePhotoMetadataResult) obj, AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(bankingAgentReviewActivity.RatingCompat.MediaBrowserCompat$MediaItem.getString("com.scb.phone.pref.key.LANGUAGE", "th"), "th"));
    }
}

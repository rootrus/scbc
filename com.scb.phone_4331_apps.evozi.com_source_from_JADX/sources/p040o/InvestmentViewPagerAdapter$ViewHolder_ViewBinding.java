package p040o;

@Deprecated
/* renamed from: o.InvestmentViewPagerAdapter$ViewHolder_ViewBinding */
public final class InvestmentViewPagerAdapter$ViewHolder_ViewBinding {
    public String read;
    public String write;

    public InvestmentViewPagerAdapter$ViewHolder_ViewBinding() {
    }

    public static onGiftsSendButtonClick write() {
        onGiftsSendButtonClick ongiftssendbuttonclick = new onGiftsSendButtonClick();
        GiftPreviewActivity_ViewBinding giftPreviewActivity_ViewBinding = new GiftPreviewActivity_ViewBinding("http", 80, new GiftSelectionActivity());
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(giftPreviewActivity_ViewBinding, "Scheme");
        ongiftssendbuttonclick.IconCompatParcelizer.put(giftPreviewActivity_ViewBinding.IconCompatParcelizer, giftPreviewActivity_ViewBinding);
        GiftPreviewActivity_ViewBinding giftPreviewActivity_ViewBinding2 = new GiftPreviewActivity_ViewBinding("https", 443, GiftingMoneyReviewActivity.MediaBrowserCompat$ItemReceiver());
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(giftPreviewActivity_ViewBinding2, "Scheme");
        ongiftssendbuttonclick.IconCompatParcelizer.put(giftPreviewActivity_ViewBinding2.IconCompatParcelizer, giftPreviewActivity_ViewBinding2);
        return ongiftssendbuttonclick;
    }

    public InvestmentViewPagerAdapter$ViewHolder_ViewBinding(String str, String str2) {
        this.write = str;
        this.read = str2;
    }
}

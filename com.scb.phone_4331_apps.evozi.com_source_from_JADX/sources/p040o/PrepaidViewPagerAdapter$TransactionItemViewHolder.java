package p040o;

import java.util.Date;

/* renamed from: o.PrepaidViewPagerAdapter$TransactionItemViewHolder */
public final class PrepaidViewPagerAdapter$TransactionItemViewHolder extends MerchantWalletViewPagerAdapter$ItemViewHolder implements EDonationConsentActivity {
    private boolean RatingCompat;
    int[] read;

    public PrepaidViewPagerAdapter$TransactionItemViewHolder(String str, String str2) {
        super(str, str2);
    }

    public final int[] read() {
        return this.read;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int[] iArr) {
        this.read = iArr;
    }

    public final void MediaBrowserCompat$MediaItem() {
        this.RatingCompat = true;
    }

    public final boolean MediaBrowserCompat$ItemReceiver(Date date) {
        return this.RatingCompat || super.MediaBrowserCompat$ItemReceiver(date);
    }

    public final Object clone() throws CloneNotSupportedException {
        PrepaidViewPagerAdapter$TransactionItemViewHolder prepaidViewPagerAdapter$TransactionItemViewHolder = (PrepaidViewPagerAdapter$TransactionItemViewHolder) super.clone();
        int[] iArr = this.read;
        if (iArr != null) {
            prepaidViewPagerAdapter$TransactionItemViewHolder.read = (int[]) iArr.clone();
        }
        return prepaidViewPagerAdapter$TransactionItemViewHolder;
    }
}

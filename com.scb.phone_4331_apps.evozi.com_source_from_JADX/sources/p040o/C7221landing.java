package p040o;

import android.view.ViewGroup;
import com.scb.phone.view.adapter.creditcard.CreditCardDetailViewPagerAdapter;

/* renamed from: o.landing */
public final /* synthetic */ class C7221landing implements Runnable {
    private final /* synthetic */ CreditCardDetailViewPagerAdapter read;
    private final /* synthetic */ CreditCardDetailViewPagerAdapter.CreditCardItemViewHolder write;

    public /* synthetic */ C7221landing(CreditCardDetailViewPagerAdapter creditCardDetailViewPagerAdapter, CreditCardDetailViewPagerAdapter.CreditCardItemViewHolder creditCardItemViewHolder) {
        this.read = creditCardDetailViewPagerAdapter;
        this.write = creditCardItemViewHolder;
    }

    public final void run() {
        CreditCardDetailViewPagerAdapter creditCardDetailViewPagerAdapter = this.read;
        CreditCardDetailViewPagerAdapter.CreditCardItemViewHolder creditCardItemViewHolder = this.write;
        ViewGroup.LayoutParams layoutParams = creditCardItemViewHolder.blockContainer.getLayoutParams();
        creditCardDetailViewPagerAdapter.IconCompatParcelizer = layoutParams;
        layoutParams.height = creditCardItemViewHolder.creditCardImageView.getHeight();
        creditCardDetailViewPagerAdapter.IconCompatParcelizer.width = creditCardItemViewHolder.creditCardImageView.getWidth();
        creditCardItemViewHolder.blockContainer.setLayoutParams(creditCardDetailViewPagerAdapter.IconCompatParcelizer);
        creditCardItemViewHolder.blockContainer.requestLayout();
    }
}

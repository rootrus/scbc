package com.scb.phone.view.adapter.easycash.viewholder;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.view.custom.easycash.CustomCreditCardPageSelector;
import java.util.List;
import p040o.FundFactSheetActivity;
import p040o.onGetStartedClick;

public final class AccountDebitSelectorViewHolder extends RecyclerView.setContentView {
    @BindView
    public CustomCreditCardPageSelector cardSelector;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountDebitSelectorViewHolder(View view) {
        super(view);
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        ButterKnife.IconCompatParcelizer(this, view);
    }

    public static final class read implements ViewPager.MediaMetadataCompat {
        private /* synthetic */ FundFactSheetActivity MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ AccountDebitSelectorViewHolder read;
        private /* synthetic */ List write;

        public final void onPageScrollStateChanged(int i) {
        }

        public final void onPageScrolled(int i, float f, int i2) {
        }

        public read(List list, AccountDebitSelectorViewHolder accountDebitSelectorViewHolder, FundFactSheetActivity fundFactSheetActivity) {
            this.write = list;
            this.read = accountDebitSelectorViewHolder;
            this.MediaBrowserCompat$CustomActionResultReceiver = fundFactSheetActivity;
        }

        public final void onPageSelected(int i) {
            CustomCreditCardPageSelector customCreditCardPageSelector = this.read.cardSelector;
            if (customCreditCardPageSelector == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("cardSelector");
            }
            customCreditCardPageSelector.setSelectedCard(i);
            this.MediaBrowserCompat$CustomActionResultReceiver.invoke(this.write.get(i));
        }
    }
}

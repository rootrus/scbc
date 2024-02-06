package com.scb.phone.view.adapter.investment.scbs;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.CloseAccountService;
import p040o.NativeSessionFile;
import p040o.TabParser$TabParserException;
import p040o.onStart;
import p040o.setLastBaselineToBottomHeight;

public final class LandingAccountsAdapter extends TabParser$TabParserException<NativeSessionFile> {

    public class AccountViewHolder_ViewBinding implements Unbinder {
        private AccountViewHolder IconCompatParcelizer;

        public AccountViewHolder_ViewBinding(AccountViewHolder accountViewHolder, View view) {
            this.IconCompatParcelizer = accountViewHolder;
            accountViewHolder.typeLabelText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_card_type_text, "field 'typeLabelText'", TextView.class);
            accountViewHolder.quantityText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_quantity_text, "field 'quantityText'", TextView.class);
            accountViewHolder.accountText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_card_account_text, "field 'accountText'", TextView.class);
            accountViewHolder.amountText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_total_amount_text, "field 'amountText'", TextView.class);
            accountViewHolder.totalTitleText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.total_title, "field 'totalTitleText'", TextView.class);
            accountViewHolder.cashTitleText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cash_title, "field 'cashTitleText'", TextView.class);
            accountViewHolder.percentageText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_total_percentage_text, "field 'percentageText'", TextView.class);
            accountViewHolder.cashText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_cash_value_text, "field 'cashText'", TextView.class);
            accountViewHolder.disclaimerText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_investment_disclaimer, "field 'disclaimerText'", TextView.class);
            accountViewHolder.itemColor = onStart.IconCompatParcelizer(view, R.id.vw_item_color_view, "field 'itemColor'");
            accountViewHolder.marketArrow = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_market_value_arrow, "field 'marketArrow'", ImageView.class);
            accountViewHolder.cashLayout = onStart.IconCompatParcelizer(view, R.id.vw_investment_cash_layout, "field 'cashLayout'");
            accountViewHolder.nextArrow = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_right_arrow_image, "field 'nextArrow'", ImageView.class);
            accountViewHolder.itemButton = onStart.IconCompatParcelizer(view, R.id.cs_account_item_layout, "field 'itemButton'");
        }

        public final void read() {
            AccountViewHolder accountViewHolder = this.IconCompatParcelizer;
            if (accountViewHolder != null) {
                this.IconCompatParcelizer = null;
                accountViewHolder.typeLabelText = null;
                accountViewHolder.quantityText = null;
                accountViewHolder.accountText = null;
                accountViewHolder.amountText = null;
                accountViewHolder.totalTitleText = null;
                accountViewHolder.cashTitleText = null;
                accountViewHolder.percentageText = null;
                accountViewHolder.cashText = null;
                accountViewHolder.disclaimerText = null;
                accountViewHolder.itemColor = null;
                accountViewHolder.marketArrow = null;
                accountViewHolder.cashLayout = null;
                accountViewHolder.nextArrow = null;
                accountViewHolder.itemButton = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public LandingAccountsAdapter(Context context, View view, View view2) {
        super(context, view, view2);
    }

    public final TabParser$TabParserException<NativeSessionFile>.CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver(ViewGroup viewGroup) {
        return new AccountViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f91842131494411, viewGroup, false));
    }

    public final void write(TabParser$TabParserException<NativeSessionFile>.CustomActionResultReceiver customActionResultReceiver, int i) {
        AccountViewHolder accountViewHolder = (AccountViewHolder) customActionResultReceiver;
        Context context = this.MediaBrowserCompat$ItemReceiver;
        NativeSessionFile nativeSessionFile = (NativeSessionFile) this.write.get(i);
        accountViewHolder.totalTitleText.setText(nativeSessionFile.MediaSessionCompat$ResultReceiverWrapper);
        accountViewHolder.cashTitleText.setText(nativeSessionFile.MediaMetadataCompat);
        accountViewHolder.typeLabelText.setText(nativeSessionFile.MediaDescriptionCompat);
        accountViewHolder.quantityText.setText(nativeSessionFile.f2763x50fd9e4a);
        int i2 = 8;
        if (nativeSessionFile.MediaBrowserCompat$ItemReceiver != null) {
            accountViewHolder.accountText.setText(nativeSessionFile.MediaBrowserCompat$ItemReceiver);
        } else {
            accountViewHolder.accountText.setVisibility(8);
            int applyDimension = (int) TypedValue.applyDimension(1, 13.0f, context.getResources().getDisplayMetrics());
            accountViewHolder.typeLabelText.setPadding(0, 0, 0, applyDimension);
            accountViewHolder.quantityText.setPadding(0, 0, 0, applyDimension);
        }
        accountViewHolder.amountText.setText(nativeSessionFile.ParcelableVolumeInfo);
        if (nativeSessionFile.MediaSessionCompat$Token != null) {
            accountViewHolder.percentageText.setText(nativeSessionFile.MediaSessionCompat$Token);
            accountViewHolder.percentageText.setTextColor(setLastBaselineToBottomHeight.read(context, nativeSessionFile.MediaSessionCompat$QueueItem));
        } else {
            accountViewHolder.percentageText.setVisibility(8);
        }
        accountViewHolder.cashText.setText(nativeSessionFile.read);
        accountViewHolder.marketArrow.setImageResource(nativeSessionFile.write);
        accountViewHolder.itemColor.setBackgroundColor(Color.parseColor(nativeSessionFile.MediaBrowserCompat$SearchResultReceiver));
        if (nativeSessionFile.MediaBrowserCompat$MediaItem != null && !nativeSessionFile.MediaBrowserCompat$MediaItem.isEmpty()) {
            accountViewHolder.disclaimerText.setVisibility(0);
            accountViewHolder.disclaimerText.setText(nativeSessionFile.MediaBrowserCompat$MediaItem);
        }
        if (nativeSessionFile.read != null) {
            accountViewHolder.cashText.setText(nativeSessionFile.read);
        } else {
            accountViewHolder.cashLayout.setVisibility(8);
        }
        ImageView imageView = accountViewHolder.nextArrow;
        if (nativeSessionFile.RatingCompat) {
            i2 = 0;
        }
        imageView.setVisibility(i2);
        if (nativeSessionFile.RatingCompat) {
            accountViewHolder.itemButton.setOnClickListener(new CloseAccountService(accountViewHolder, nativeSessionFile));
        }
    }

    public class AccountViewHolder extends TabParser$TabParserException<NativeSessionFile>.CustomActionResultReceiver {
        @BindView
        TextView accountText;
        @BindView
        TextView amountText;
        @BindView
        View cashLayout;
        @BindView
        TextView cashText;
        @BindView
        TextView cashTitleText;
        @BindView
        TextView disclaimerText;
        @BindView
        View itemButton;
        @BindView
        View itemColor;
        @BindView
        ImageView marketArrow;
        @BindView
        ImageView nextArrow;
        @BindView
        TextView percentageText;
        @BindView
        TextView quantityText;
        @BindView
        TextView totalTitleText;
        @BindView
        TextView typeLabelText;

        public AccountViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}

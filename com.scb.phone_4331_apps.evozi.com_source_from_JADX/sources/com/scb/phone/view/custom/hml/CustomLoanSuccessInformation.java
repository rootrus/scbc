package com.scb.phone.view.custom.hml;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.custom.tierpricing.TierPricingSimplePromotionView;
import com.squareup.picasso.Picasso;
import org.bouncycastle.i18n.MessageBundle;
import p040o.CrashlyticsReport;
import p040o.FragmentBuilder_BindEkycFragment;
import p040o.FragmentBuilder_BindFundDetailSummaryFragment;
import p040o.onGetStartedClick;

public final class CustomLoanSuccessInformation extends LinearLayout {
    @BindView
    public TextView amountTitle;
    @BindView
    public ImageView counterIcon;
    @BindView
    public TextView installmentTitle;
    @BindView
    public TextView loanAmount;
    @BindView
    public TextView loanRepayment;
    @BindView
    public TierPricingSimplePromotionView promotion;

    public final void setCounterIcon(ImageView imageView) {
        onGetStartedClick.write((Object) imageView, "<set-?>");
        this.counterIcon = imageView;
    }

    public final void setAmountTitle(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.amountTitle = textView;
    }

    public final void setLoanAmount(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.loanAmount = textView;
    }

    public final void setInstallmentTitle(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.installmentTitle = textView;
    }

    public final void setLoanRepayment(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.loanRepayment = textView;
    }

    public final void setPromotion(TierPricingSimplePromotionView tierPricingSimplePromotionView) {
        onGetStartedClick.write((Object) tierPricingSimplePromotionView, "<set-?>");
        this.promotion = tierPricingSimplePromotionView;
    }

    public CustomLoanSuccessInformation(Context context) {
        super(context);
        ButterKnife.IconCompatParcelizer(this, LayoutInflater.from(getContext()).inflate(R.layout.f84122131493638, this, true));
    }

    public CustomLoanSuccessInformation(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ButterKnife.IconCompatParcelizer(this, LayoutInflater.from(getContext()).inflate(R.layout.f84122131493638, this, true));
    }

    public CustomLoanSuccessInformation(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ButterKnife.IconCompatParcelizer(this, LayoutInflater.from(getContext()).inflate(R.layout.f84122131493638, this, true));
    }

    public final void setIcon(String str) {
        onGetStartedClick.write((Object) str, "iconUrl");
        ImageView imageView = this.counterIcon;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("counterIcon");
        }
        imageView.setVisibility(0);
        FragmentBuilder_BindFundDetailSummaryFragment MediaBrowserCompat$CustomActionResultReceiver = Picasso.read().write(str).IconCompatParcelizer((int) R.drawable.ic_offer_icon_placeholder).MediaBrowserCompat$CustomActionResultReceiver((int) R.drawable.ic_offer_icon_placeholder);
        ImageView imageView2 = this.counterIcon;
        if (imageView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("counterIcon");
        }
        MediaBrowserCompat$CustomActionResultReceiver.read(imageView2, (FragmentBuilder_BindEkycFragment) null);
    }

    public final void setAmountTitle(String str) {
        onGetStartedClick.write((Object) str, MessageBundle.TITLE_ENTRY);
        TextView textView = this.amountTitle;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("amountTitle");
        }
        textView.setText(str);
    }

    public final void setAmount(String str) {
        onGetStartedClick.write((Object) str, "amount");
        TextView textView = this.loanAmount;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("loanAmount");
        }
        textView.setText(str);
    }

    public final void setRepaymentTitle(String str) {
        onGetStartedClick.write((Object) str, MessageBundle.TITLE_ENTRY);
        TextView textView = this.installmentTitle;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("installmentTitle");
        }
        textView.setText(str);
    }

    public final void setRepayment(String str) {
        onGetStartedClick.write((Object) str, "repayment");
        TextView textView = this.loanRepayment;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("loanRepayment");
        }
        textView.setText(str);
    }

    public final void setPromotion(CrashlyticsReport.FilesPayload.Builder builder) {
        onGetStartedClick.write((Object) builder, "promo");
        TierPricingSimplePromotionView tierPricingSimplePromotionView = this.promotion;
        if (tierPricingSimplePromotionView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("promotion");
        }
        tierPricingSimplePromotionView.setDisplay(builder);
    }
}

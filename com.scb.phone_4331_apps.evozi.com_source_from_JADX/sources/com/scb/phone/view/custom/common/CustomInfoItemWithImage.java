package com.scb.phone.view.custom.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.onGetStartedClick;
import p040o.setLastBaselineToBottomHeight;
import p040o.verifyMoneyGift;
import p040o.verifyMoneyGift$MediaBrowserCompat$CustomActionResultReceiver;

public final class CustomInfoItemWithImage extends ConstraintLayout {
    @BindView
    public ImageView ivLeftImage;
    @BindView
    public TextView tvRightText;

    public final void setIvLeftImage(ImageView imageView) {
        onGetStartedClick.write((Object) imageView, "<set-?>");
        this.ivLeftImage = imageView;
    }

    public final void setTvRightText(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.tvRightText = textView;
    }

    private /* synthetic */ CustomInfoItemWithImage(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomInfoItemWithImage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        onGetStartedClick.write((Object) context, "context");
    }

    public /* synthetic */ CustomInfoItemWithImage(Context context, verifyMoneyGift verifymoneygift, String str) {
        this(context, verifymoneygift, str, R.layout.f82112131493437);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private CustomInfoItemWithImage(Context context, verifyMoneyGift verifymoneygift, String str, int i) {
        this(context);
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) verifymoneygift, "imagePath");
        onGetStartedClick.write((Object) str, "text");
        LayoutInflater.from(getContext()).inflate(R.layout.f82112131493437, this, true);
        ButterKnife.IconCompatParcelizer(this);
        if (verifymoneygift instanceof verifyMoneyGift.IconCompatParcelizer) {
            getContext();
            ImageView imageView = this.ivLeftImage;
            if (imageView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivLeftImage");
            }
            FragmentBuilder_BindDepositSelectorFragment.read((int) R.drawable.bankicon_place_holder, imageView, ((verifyMoneyGift.IconCompatParcelizer) verifymoneygift).read);
        } else if (verifymoneygift instanceof verifyMoneyGift$MediaBrowserCompat$CustomActionResultReceiver) {
            ImageView imageView2 = this.ivLeftImage;
            if (imageView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivLeftImage");
            }
            imageView2.setImageDrawable(setLastBaselineToBottomHeight.write(getContext(), R.drawable.ic_url_link_circle));
        }
        TextView textView = this.tvRightText;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRightText");
        }
        textView.setText(str);
    }
}

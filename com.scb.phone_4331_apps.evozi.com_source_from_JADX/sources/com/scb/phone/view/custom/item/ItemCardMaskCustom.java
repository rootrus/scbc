package com.scb.phone.view.custom.item;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.components.ItemCustom;
import kotlin.TypeCastException;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.HmlPinActivity;
import p040o.onGetStartedClick;
import p040o.removeAllReports;
import p040o.setLastBaselineToBottomHeight;

public final class ItemCardMaskCustom extends ItemCustom<removeAllReports> {
    @BindView
    public ImageView cardImage;
    @BindView
    public LinearLayout layoutCardNumber;
    @BindView
    public TextView tvCardNumber2nd;
    @BindView
    public TextView tvCardNumberEnd;
    @BindView
    public TextView tvCardNumberFront;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public ItemCardMaskCustom(Context context) {
        super(context);
        onGetStartedClick.write((Object) context, "context");
    }

    public final void setCardImage(ImageView imageView) {
        onGetStartedClick.write((Object) imageView, "<set-?>");
        this.cardImage = imageView;
    }

    public final void setLayoutCardNumber(LinearLayout linearLayout) {
        onGetStartedClick.write((Object) linearLayout, "<set-?>");
        this.layoutCardNumber = linearLayout;
    }

    public final void setTvCardNumberFront(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.tvCardNumberFront = textView;
    }

    public final void setTvCardNumber2nd(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.tvCardNumber2nd = textView;
    }

    public final void setTvCardNumberEnd(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.tvCardNumberEnd = textView;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        onGetStartedClick.write((Object) context, "context");
        Object systemService = context.getSystemService("layout_inflater");
        if (systemService != null) {
            ((LayoutInflater) systemService).inflate(R.layout.f81432131493369, this, true);
            ButterKnife.IconCompatParcelizer(this);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater");
    }

    public final void setUpWithDisplay(removeAllReports removeallreports) {
        onGetStartedClick.write((Object) removeallreports, "display");
        if (TextUtils.isEmpty(removeallreports.MediaBrowserCompat$CustomActionResultReceiver)) {
            LinearLayout linearLayout = this.layoutCardNumber;
            if (linearLayout == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutCardNumber");
            }
            linearLayout.setVisibility(8);
        } else {
            LinearLayout linearLayout2 = this.layoutCardNumber;
            if (linearLayout2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutCardNumber");
            }
            linearLayout2.setVisibility(0);
            TextView textView = this.tvCardNumberFront;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvCardNumberFront");
            }
            textView.setText(removeallreports.MediaBrowserCompat$CustomActionResultReceiver.substring(0, 4));
            TextView textView2 = this.tvCardNumber2nd;
            if (textView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvCardNumber2nd");
            }
            textView2.setText(removeallreports.MediaBrowserCompat$CustomActionResultReceiver.substring(4, 6));
            TextView textView3 = this.tvCardNumberEnd;
            if (textView3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvCardNumberEnd");
            }
            String str = removeallreports.MediaBrowserCompat$CustomActionResultReceiver;
            textView3.setText(str.substring(str.length() - 4));
        }
        getContext();
        Drawable write = setLastBaselineToBottomHeight.write(getContext(), R.drawable.default_card);
        ImageView imageView = this.cardImage;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("cardImage");
        }
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(write, imageView, removeallreports.IconCompatParcelizer);
        ImageView imageView2 = this.cardImage;
        if (imageView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("cardImage");
        }
        imageView2.setContentDescription(removeallreports.MediaBrowserCompat$ItemReceiver);
    }
}

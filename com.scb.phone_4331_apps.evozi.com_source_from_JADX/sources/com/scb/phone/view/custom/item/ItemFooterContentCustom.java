package com.scb.phone.view.custom.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.components.ItemCustom;
import com.squareup.picasso.Picasso;
import p040o.FragmentBuilder_BindEkycFragment;
import p040o.FragmentBuilder_BindFundDetailSummaryFragment;
import p040o.getChequeStatusReceiveDetail;
import p040o.onGetStartedClick;
import p040o.sanitizeAttribute;

public final class ItemFooterContentCustom extends ItemCustom<sanitizeAttribute> {
    @BindView
    public ImageView ivImage;
    @BindView
    public TextView textView;
    @BindView
    public TextView tvRemark;

    public final void setTextView(TextView textView2) {
        onGetStartedClick.write((Object) textView2, "<set-?>");
        this.textView = textView2;
    }

    public final void setTvRemark(TextView textView2) {
        onGetStartedClick.write((Object) textView2, "<set-?>");
        this.tvRemark = textView2;
    }

    public final void setIvImage(ImageView imageView) {
        onGetStartedClick.write((Object) imageView, "<set-?>");
        this.ivImage = imageView;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ItemFooterContentCustom(Context context) {
        super(context);
        onGetStartedClick.write((Object) context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ItemFooterContentCustom(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        onGetStartedClick.write((Object) context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ItemFooterContentCustom(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        onGetStartedClick.write((Object) context, "context");
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        LayoutInflater.from(context).inflate(R.layout.f90602131494287, this, true);
        ButterKnife.IconCompatParcelizer(this);
    }

    public final void setUpWithDisplay(sanitizeAttribute sanitizeattribute) {
        onGetStartedClick.write((Object) sanitizeattribute, "display");
        int i = getChequeStatusReceiveDetail.MediaBrowserCompat$CustomActionResultReceiver[sanitizeattribute.MediaBrowserCompat$ItemReceiver.ordinal()];
        boolean z = true;
        if (i != 1) {
            if (i == 2) {
                if (sanitizeattribute.IconCompatParcelizer.length() <= 0) {
                    z = false;
                }
                if (z) {
                    TextView textView2 = this.tvRemark;
                    if (textView2 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRemark");
                    }
                    textView2.setText(sanitizeattribute.IconCompatParcelizer);
                    TextView textView3 = this.tvRemark;
                    if (textView3 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRemark");
                    }
                    textView3.setVisibility(0);
                    return;
                }
                return;
            } else if (i == 3) {
                if (sanitizeattribute.MediaBrowserCompat$CustomActionResultReceiver.length() <= 0) {
                    z = false;
                }
                if (z) {
                    FragmentBuilder_BindFundDetailSummaryFragment IconCompatParcelizer = Picasso.read().write(sanitizeattribute.MediaBrowserCompat$CustomActionResultReceiver).IconCompatParcelizer((int) R.drawable.default_card_without_logo);
                    ImageView imageView = this.ivImage;
                    if (imageView == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivImage");
                    }
                    IconCompatParcelizer.read(imageView, (FragmentBuilder_BindEkycFragment) null);
                    ImageView imageView2 = this.ivImage;
                    if (imageView2 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivImage");
                    }
                    imageView2.setVisibility(0);
                    return;
                }
                return;
            }
        }
        if (sanitizeattribute.IconCompatParcelizer.length() <= 0) {
            z = false;
        }
        if (z) {
            TextView textView4 = this.textView;
            if (textView4 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("textView");
            }
            textView4.setText(sanitizeattribute.IconCompatParcelizer);
            TextView textView5 = this.textView;
            if (textView5 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("textView");
            }
            textView5.setVisibility(0);
        }
    }
}

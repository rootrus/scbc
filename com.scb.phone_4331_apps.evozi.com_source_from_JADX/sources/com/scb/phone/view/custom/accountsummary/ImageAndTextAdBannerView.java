package com.scb.phone.view.custom.accountsummary;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.squareup.picasso.Picasso;
import p040o.FragmentBuilder_BindEkycFragment;
import p040o.FragmentBuilder_BindFundDetailSummaryFragment;
import p040o.immediateFuture;
import p040o.onGetStartedClick;

public final class ImageAndTextAdBannerView extends BaseAdBannerView {
    @BindView
    public ImageView bannerImage;
    @BindView
    public ImageView closeButton;
    @BindView
    public TextView descriptionText;
    @BindView
    public TextView linkText;
    @BindView
    public TextView titleText;

    public ImageAndTextAdBannerView(Context context) {
        this(context, (AttributeSet) null, 6, (byte) 0);
    }

    public ImageAndTextAdBannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, (byte) 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ ImageAndTextAdBannerView(Context context, AttributeSet attributeSet, int i, byte b) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImageAndTextAdBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        onGetStartedClick.write((Object) context, "context");
    }

    public final void setBannerImage(ImageView imageView) {
        onGetStartedClick.write((Object) imageView, "<set-?>");
        this.bannerImage = imageView;
    }

    public final void setCloseButton(ImageView imageView) {
        onGetStartedClick.write((Object) imageView, "<set-?>");
        this.closeButton = imageView;
    }

    public final void setLinkText(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.linkText = textView;
    }

    public final void setTitleText(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.titleText = textView;
    }

    public final void setDescriptionText(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.descriptionText = textView;
    }

    public final void read(Context context) {
        onGetStartedClick.write((Object) context, "context");
        ButterKnife.IconCompatParcelizer(this, FrameLayout.inflate(getContext(), R.layout.f82282131493454, this));
    }

    public final View write() {
        ImageView imageView = this.closeButton;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("closeButton");
        }
        return imageView;
    }

    public final View MediaBrowserCompat$CustomActionResultReceiver() {
        TextView textView = this.linkText;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("linkText");
        }
        return textView;
    }

    public final void MediaBrowserCompat$ItemReceiver(immediateFuture immediatefuture) {
        if (immediatefuture != null) {
            FragmentBuilder_BindFundDetailSummaryFragment write = Picasso.read().write(immediatefuture.RatingCompat);
            ImageView imageView = this.bannerImage;
            if (imageView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("bannerImage");
            }
            write.read(imageView, (FragmentBuilder_BindEkycFragment) null);
            TextView textView = this.linkText;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("linkText");
            }
            textView.setText(immediatefuture.write);
            TextView textView2 = this.titleText;
            if (textView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("titleText");
            }
            textView2.setText(immediatefuture.MediaDescriptionCompat);
            TextView textView3 = this.descriptionText;
            if (textView3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("descriptionText");
            }
            textView3.setText(immediatefuture.read);
            TextView textView4 = this.descriptionText;
            if (textView4 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("descriptionText");
            }
            textView4.setVisibility(immediatefuture.read != null ? 0 : 8);
        }
    }
}

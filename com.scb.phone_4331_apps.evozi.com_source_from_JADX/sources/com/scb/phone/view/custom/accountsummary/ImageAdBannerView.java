package com.scb.phone.view.custom.accountsummary;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.squareup.picasso.Picasso;
import p040o.FragmentBuilder_BindEkycFragment;
import p040o.FragmentBuilder_BindFundDetailSummaryFragment;
import p040o.immediateFuture;
import p040o.onGetStartedClick;

public final class ImageAdBannerView extends BaseAdBannerView {
    @BindView
    public ImageView backgroundImage;
    @BindView
    public ImageView closeButton;

    public ImageAdBannerView(Context context) {
        this(context, (AttributeSet) null, 6, (byte) 0);
    }

    public ImageAdBannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, (byte) 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ ImageAdBannerView(Context context, AttributeSet attributeSet, int i, byte b) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImageAdBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        onGetStartedClick.write((Object) context, "context");
    }

    public final void setBackgroundImage(ImageView imageView) {
        onGetStartedClick.write((Object) imageView, "<set-?>");
        this.backgroundImage = imageView;
    }

    public final void setCloseButton(ImageView imageView) {
        onGetStartedClick.write((Object) imageView, "<set-?>");
        this.closeButton = imageView;
    }

    public final void read(Context context) {
        onGetStartedClick.write((Object) context, "context");
        ButterKnife.IconCompatParcelizer(this, FrameLayout.inflate(getContext(), R.layout.f82272131493453, this));
    }

    public final View write() {
        ImageView imageView = this.closeButton;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("closeButton");
        }
        return imageView;
    }

    public final View MediaBrowserCompat$CustomActionResultReceiver() {
        ImageView imageView = this.backgroundImage;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("backgroundImage");
        }
        return imageView;
    }

    public final void MediaBrowserCompat$ItemReceiver(immediateFuture immediatefuture) {
        if (immediatefuture != null) {
            FragmentBuilder_BindFundDetailSummaryFragment write = Picasso.read().write(immediatefuture.RatingCompat);
            ImageView imageView = this.backgroundImage;
            if (imageView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("backgroundImage");
            }
            write.read(imageView, (FragmentBuilder_BindEkycFragment) null);
            ImageView imageView2 = this.closeButton;
            if (imageView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("closeButton");
            }
            imageView2.setVisibility(immediatefuture.MediaMetadataCompat ? 0 : 8);
        }
    }
}

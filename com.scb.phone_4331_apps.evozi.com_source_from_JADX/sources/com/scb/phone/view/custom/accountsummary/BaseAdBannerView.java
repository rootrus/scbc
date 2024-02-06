package com.scb.phone.view.custom.accountsummary;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p040o.FragmentBuilder_BindBaseEBillSubscriptionReviewFragment;
import p040o.immediateFuture;
import p040o.onGetStartedClick;

public abstract class BaseAdBannerView extends FrameLayout {
    public BaseAdBannerView(Context context) {
        this(context, (AttributeSet) null, 6, (byte) 0);
    }

    public BaseAdBannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, (byte) 0);
    }

    public abstract View MediaBrowserCompat$CustomActionResultReceiver();

    public abstract void MediaBrowserCompat$ItemReceiver(immediateFuture immediatefuture);

    public abstract void read(Context context);

    public abstract View write();

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ BaseAdBannerView(Context context, AttributeSet attributeSet, int i, byte b) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseAdBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        onGetStartedClick.write((Object) context, "context");
        read(context);
    }

    public final void setDisplay(immediateFuture immediatefuture) {
        MediaBrowserCompat$ItemReceiver(immediatefuture);
    }

    static final class write implements View.OnClickListener {
        private /* synthetic */ FragmentBuilder_BindBaseEBillSubscriptionReviewFragment MediaBrowserCompat$CustomActionResultReceiver;

        write(FragmentBuilder_BindBaseEBillSubscriptionReviewFragment fragmentBuilder_BindBaseEBillSubscriptionReviewFragment) {
            this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindBaseEBillSubscriptionReviewFragment;
        }

        public final void onClick(View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public final void setContextualBannerListener(FragmentBuilder_BindBaseEBillSubscriptionReviewFragment fragmentBuilder_BindBaseEBillSubscriptionReviewFragment) {
        onGetStartedClick.write((Object) fragmentBuilder_BindBaseEBillSubscriptionReviewFragment, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        write().setOnClickListener(new BaseAdBannerView$MediaBrowserCompat$CustomActionResultReceiver(fragmentBuilder_BindBaseEBillSubscriptionReviewFragment));
        MediaBrowserCompat$CustomActionResultReceiver().setOnClickListener(new write(fragmentBuilder_BindBaseEBillSubscriptionReviewFragment));
    }
}

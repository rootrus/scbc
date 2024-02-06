package com.scb.phone.view.adapter.easycash.viewholder;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import p040o.AnalyticsConnectorReceiver;
import p040o.getPerformPaymentWithReferer;
import p040o.onGetStartedClick;

public final class BusinessAndMaritalInfoInputViewHolder extends RecyclerView.setContentView {
    public AnalyticsConnectorReceiver.BreadcrumbHandler AlertController$RecycleListView;
    public getPerformPaymentWithReferer.write Keep;
    @BindView
    public CommonInputViewGroup ivgInputField;
    @BindView
    public View paddingBottom;
    public final C5748x875dd94c setHasDecor = new C5748x875dd94c(this);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BusinessAndMaritalInfoInputViewHolder(View view) {
        super(view);
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        ButterKnife.IconCompatParcelizer(this, view);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        if (read()) {
            CommonInputViewGroup commonInputViewGroup = this.ivgInputField;
            if (commonInputViewGroup == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgInputField");
            }
            commonInputViewGroup.MediaBrowserCompat$CustomActionResultReceiver();
            return;
        }
        CommonInputViewGroup commonInputViewGroup2 = this.ivgInputField;
        if (commonInputViewGroup2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgInputField");
        }
        commonInputViewGroup2.MediaBrowserCompat$ItemReceiver();
    }

    private final boolean read() {
        getPerformPaymentWithReferer.write write = this.Keep;
        if (write == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        }
        AnalyticsConnectorReceiver.BreadcrumbHandler breadcrumbHandler = this.AlertController$RecycleListView;
        if (breadcrumbHandler == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("display");
        }
        return write.MediaBrowserCompat$CustomActionResultReceiver(breadcrumbHandler);
    }

    public static final /* synthetic */ void read(BusinessAndMaritalInfoInputViewHolder businessAndMaritalInfoInputViewHolder, String str) {
        AnalyticsConnectorReceiver.BreadcrumbHandler breadcrumbHandler = businessAndMaritalInfoInputViewHolder.AlertController$RecycleListView;
        if (breadcrumbHandler == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("display");
        }
        onGetStartedClick.write((Object) str, "<set-?>");
        breadcrumbHandler.MediaBrowserCompat$MediaItem = str;
        breadcrumbHandler.IconCompatParcelizer = false;
        businessAndMaritalInfoInputViewHolder.MediaBrowserCompat$ItemReceiver();
        getPerformPaymentWithReferer.write write = businessAndMaritalInfoInputViewHolder.Keep;
        if (write == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        }
        RecyclerView recyclerView = businessAndMaritalInfoInputViewHolder.MediaMetadataCompat;
        if (recyclerView != null) {
            recyclerView.MediaBrowserCompat$CustomActionResultReceiver((RecyclerView.setContentView) businessAndMaritalInfoInputViewHolder);
        }
        write.write();
    }
}

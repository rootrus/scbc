package com.scb.phone.view.adapter.easycash.viewholder;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import p040o.AutoValue_CrashlyticsReportWithSessionId;
import p040o.FragmentBuilder_BindEasycashFeaturesCardInformationFragment;
import p040o.getPerformPaymentWithReferer;
import p040o.onGetStartedClick;

public final class BusinessAndMaritalInfoNationalIdViewHolder extends RecyclerView.setContentView {
    public getPerformPaymentWithReferer.write AlertController$RecycleListView;
    public AutoValue_CrashlyticsReportWithSessionId PlaybackStateCompat;
    @BindView
    public CommonInputViewGroup ivgInputField;
    @BindView
    public View paddingBottom;
    public final read setHasDecor = new read(this);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BusinessAndMaritalInfoNationalIdViewHolder(View view) {
        super(view);
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        ButterKnife.IconCompatParcelizer(this, view);
    }

    public static final class write implements FragmentBuilder_BindEasycashFeaturesCardInformationFragment.read {
        private /* synthetic */ BusinessAndMaritalInfoNationalIdViewHolder MediaBrowserCompat$ItemReceiver;

        public write(BusinessAndMaritalInfoNationalIdViewHolder businessAndMaritalInfoNationalIdViewHolder) {
            this.MediaBrowserCompat$ItemReceiver = businessAndMaritalInfoNationalIdViewHolder;
        }

        public final String MediaBrowserCompat$ItemReceiver(String str) {
            BusinessAndMaritalInfoNationalIdViewHolder businessAndMaritalInfoNationalIdViewHolder = this.MediaBrowserCompat$ItemReceiver;
            onGetStartedClick.IconCompatParcelizer((Object) str, "input");
            return BusinessAndMaritalInfoNationalIdViewHolder.IconCompatParcelizer(businessAndMaritalInfoNationalIdViewHolder, str);
        }
    }

    public static final class read implements FragmentBuilder_BindEasycashFeaturesCardInformationFragment.write {
        private /* synthetic */ BusinessAndMaritalInfoNationalIdViewHolder MediaBrowserCompat$ItemReceiver;

        read(BusinessAndMaritalInfoNationalIdViewHolder businessAndMaritalInfoNationalIdViewHolder) {
            this.MediaBrowserCompat$ItemReceiver = businessAndMaritalInfoNationalIdViewHolder;
        }

        public final void write(String str) {
            BusinessAndMaritalInfoNationalIdViewHolder.read(this.MediaBrowserCompat$ItemReceiver, str);
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(String str) {
            BusinessAndMaritalInfoNationalIdViewHolder.read(this.MediaBrowserCompat$ItemReceiver, str);
        }
    }

    public final void read() {
        if (MediaBrowserCompat$ItemReceiver()) {
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

    private final boolean MediaBrowserCompat$ItemReceiver() {
        getPerformPaymentWithReferer.write write2 = this.AlertController$RecycleListView;
        if (write2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        }
        AutoValue_CrashlyticsReportWithSessionId autoValue_CrashlyticsReportWithSessionId = this.PlaybackStateCompat;
        if (autoValue_CrashlyticsReportWithSessionId == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("display");
        }
        return write2.read(autoValue_CrashlyticsReportWithSessionId);
    }

    public static final /* synthetic */ String IconCompatParcelizer(BusinessAndMaritalInfoNationalIdViewHolder businessAndMaritalInfoNationalIdViewHolder, String str) {
        getPerformPaymentWithReferer.write write2 = businessAndMaritalInfoNationalIdViewHolder.AlertController$RecycleListView;
        if (write2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        }
        return write2.IconCompatParcelizer(str);
    }

    public static final /* synthetic */ void read(BusinessAndMaritalInfoNationalIdViewHolder businessAndMaritalInfoNationalIdViewHolder, String str) {
        getPerformPaymentWithReferer.write write2 = businessAndMaritalInfoNationalIdViewHolder.AlertController$RecycleListView;
        if (write2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        }
        String write3 = write2.write(str);
        AutoValue_CrashlyticsReportWithSessionId autoValue_CrashlyticsReportWithSessionId = businessAndMaritalInfoNationalIdViewHolder.PlaybackStateCompat;
        if (autoValue_CrashlyticsReportWithSessionId == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("display");
        }
        if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) autoValue_CrashlyticsReportWithSessionId.RatingCompat, (Object) write3)) {
            AutoValue_CrashlyticsReportWithSessionId autoValue_CrashlyticsReportWithSessionId2 = businessAndMaritalInfoNationalIdViewHolder.PlaybackStateCompat;
            if (autoValue_CrashlyticsReportWithSessionId2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("display");
            }
            onGetStartedClick.write((Object) write3, "<set-?>");
            autoValue_CrashlyticsReportWithSessionId2.RatingCompat = write3;
            autoValue_CrashlyticsReportWithSessionId2.MediaBrowserCompat$CustomActionResultReceiver = false;
            businessAndMaritalInfoNationalIdViewHolder.read();
            getPerformPaymentWithReferer.write write4 = businessAndMaritalInfoNationalIdViewHolder.AlertController$RecycleListView;
            if (write4 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            }
            RecyclerView recyclerView = businessAndMaritalInfoNationalIdViewHolder.MediaMetadataCompat;
            if (recyclerView != null) {
                recyclerView.MediaBrowserCompat$CustomActionResultReceiver((RecyclerView.setContentView) businessAndMaritalInfoNationalIdViewHolder);
            }
            write4.write();
        }
    }
}

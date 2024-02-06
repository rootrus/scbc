package com.scb.phone.view.fragment.parntner.nsip;

import android.content.Context;
import android.os.Bundle;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.PurchaseSuccessFragment;
import java.util.List;
import p040o.CheckEligibilityActivity;
import p040o.ForwardingCheckedFuture;
import p040o.FragmentBuilder_BindBaseFragment;
import p040o.FundActionsSuccessActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.ProxySourceAdapter$ItemViewHolder;
import p040o.ZTBSV;
import p040o.forEachSrcOver;
import p040o.getUserId;
import p040o.onGetStartedClick;
import p040o.standardStartAndWait;

public final class NsipPartnerPaymentSuccessFragment extends PurchaseSuccessFragment implements FragmentBuilder_BindBaseFragment {
    public static final C6114xa9e179d6 MediaBrowserCompat$CustomActionResultReceiver = new C6114xa9e179d6((byte) 0);
    private boolean MediaBrowserCompat$MediaItem;
    private standardStartAndWait MediaBrowserCompat$SearchResultReceiver;
    private boolean MediaDescriptionCompat;
    private boolean MediaMetadataCompat;
    private final HmlVerifyEmailActivity RatingCompat;

    public NsipPartnerPaymentSuccessFragment() {
        FundActionsSuccessActivity fundActionsSuccessActivity = read.IconCompatParcelizer;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.RatingCompat = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
    }

    public final /* synthetic */ void IconCompatParcelizer(ForwardingCheckedFuture.SimpleForwardingCheckedFuture simpleForwardingCheckedFuture, boolean z, boolean z2) {
        onGetStartedClick.write((Object) (standardStartAndWait) simpleForwardingCheckedFuture, "display");
        this.MediaDescriptionCompat = z;
        this.MediaBrowserCompat$MediaItem = z2;
        MediaMetadataCompat();
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.MediaBrowserCompat$SearchResultReceiver = (standardStartAndWait) arguments.getParcelable("EXTRA_NSIP_SUCCESS");
            this.componentFactory.MediaBrowserCompat$CustomActionResultReceiver = this;
            this.presenter.read(this.MediaBrowserCompat$SearchResultReceiver, (List<getUserId>) null);
            ((forEachSrcOver) this.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver()).read(arguments.getString("NSIP_TRACKER_FROM", forEachSrcOver.read.IconCompatParcelizer));
            ZTBSV ztbsv = (forEachSrcOver) this.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver();
            String str = forEachSrcOver.IconCompatParcelizer.IconCompatParcelizer;
            if (getActivity() != null) {
                ztbsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, str);
            }
        }
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        this.componentFactory.MediaBrowserCompat$CustomActionResultReceiver = null;
        this.MediaMetadataCompat = true;
    }

    public final void MediaBrowserCompat$ItemReceiver(standardStartAndWait standardstartandwait, boolean z, boolean z2) {
        onGetStartedClick.write((Object) standardstartandwait, "display");
        this.MediaDescriptionCompat = z;
        this.MediaBrowserCompat$MediaItem = z2;
        MediaMetadataCompat();
    }

    public final void onShareSlipButtonClick() {
        String str;
        this.MediaDescriptionCompat = true;
        super.onShareSlipButtonClick();
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("NSIP_TRACKER_FROM", forEachSrcOver.read.IconCompatParcelizer);
        } else {
            str = null;
        }
        ((forEachSrcOver) this.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver()).read(str);
        ZTBSV ztbsv = (forEachSrcOver) this.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver();
        String str2 = forEachSrcOver.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        if (getActivity() != null) {
            ztbsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, str2);
        }
    }

    public final void onSaveSlipButtonClick() {
        this.MediaDescriptionCompat = false;
        super.onSaveSlipButtonClick();
    }

    private final void MediaMetadataCompat() {
        MediaSessionCompat$ResultReceiverWrapper();
        Context context = getContext();
        if (context != null && this.MediaMetadataCompat && ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(context, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            super.IconCompatParcelizer(this.MediaBrowserCompat$SearchResultReceiver, this.MediaDescriptionCompat, this.MediaBrowserCompat$MediaItem);
        }
    }

    public final void onDestroyView() {
        this.presenter.onDestroy();
        super.onDestroyView();
    }

    static final class read extends CheckEligibilityActivity implements FundActionsSuccessActivity<forEachSrcOver> {
        public static final read IconCompatParcelizer = new read();

        read() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new forEachSrcOver();
        }
    }
}

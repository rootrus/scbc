package com.scb.phone.view.activity.thirdparty;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment;
import com.squareup.picasso.Picasso;
import p040o.FragmentBuilder_BindEBillSubscriptionFragment;
import p040o.FragmentBuilder_BindEStatementsSuccessfulFragment;
import p040o.FragmentBuilder_BindEkycFragment;
import p040o.FragmentBuilder_BindFundDetailSummaryFragment;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onRotateClicked;

public class ThirdPartyConsentFragment extends BaseFragment implements FragmentBuilder_BindEBillSubscriptionFragment {
    C5717xdc309df8 MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    protected ImageView imgIcon;
    @BindView
    protected TextView tvConsentDetail;
    @BindView
    View viewHide;
    @BindView
    WebView wvConsentDescription;

    static final /* synthetic */ void read(WebView webView, String str) {
        try {
            Context context = webView.getContext();
            new onRotateClicked();
            String write = onRotateClicked.write(str);
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on WebView.loadUrl(String), modified: ");
            sb.append(write);
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            webView.loadUrl(write);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static ThirdPartyConsentFragment IconCompatParcelizer() {
        return new ThirdPartyConsentFragment();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f90102131494237, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        return inflate;
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, String str2) {
        this.viewHide.setVisibility(8);
        if (str == null || str.length() == 0) {
            this.imgIcon.setVisibility(8);
        } else {
            this.imgIcon.setVisibility(0);
            FragmentBuilder_BindFundDetailSummaryFragment IconCompatParcelizer = Picasso.read().write(str).MediaBrowserCompat$CustomActionResultReceiver((int) R.drawable.shape_gray_rectangle).IconCompatParcelizer((int) R.drawable.shape_gray_rectangle);
            IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.read(new FragmentBuilder_BindEStatementsSuccessfulFragment((int) getResources().getDimension(R.dimen.f73472131165730), 0, 0));
            IconCompatParcelizer.read(this.imgIcon, (FragmentBuilder_BindEkycFragment) null);
        }
        this.tvConsentDetail.setVisibility(0);
        this.tvConsentDetail.setText(str2);
    }

    public final void MediaSessionCompat$QueueItem() {
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    @OnClick
    public void onAllowClick() {
        C5717xdc309df8 thirdPartyConsentFragment$MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (thirdPartyConsentFragment$MediaBrowserCompat$CustomActionResultReceiver != null) {
            thirdPartyConsentFragment$MediaBrowserCompat$CustomActionResultReceiver.mo34354x50fd9e4a();
        }
    }

    @OnClick
    public void onDenyClick() {
        C5717xdc309df8 thirdPartyConsentFragment$MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (thirdPartyConsentFragment$MediaBrowserCompat$CustomActionResultReceiver != null) {
            thirdPartyConsentFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$QueueItem();
        }
    }
}

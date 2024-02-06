package com.scb.phone.view.fragment.parntner.nsip;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.activity.investment.scbs.AddAccountConsentActivity;
import com.scb.phone.view.adapter.accountsummary.ErrorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver;
import com.scb.phone.view.fragment.BaseFragment;
import com.scb.phone.view.fragment.transferandpay.AccountSourceSelectFragment;
import p040o.C4331eB;
import p040o.CrashlyticsReport;
import p040o.HmlPinActivity;
import p040o.LocalProjectProvider;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;

public final class NsipPaymentAddAccountFragment extends BaseFragment implements LocalProjectProvider.C69331.write {
    public static final NsipPaymentAddAccountFragment$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver = new NsipPaymentAddAccountFragment$MediaBrowserCompat$ItemReceiver((byte) 0);
    @HmlPinActivity
    public C4331eB presenter;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.f88682131494095, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.read = ButterKnife.IconCompatParcelizer(this, view);
        C4331eB eBVar = this.presenter;
        if (eBVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        eBVar.MediaBrowserCompat$ItemReceiver(this);
        C4331eB eBVar2 = this.presenter;
        if (eBVar2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C4331eB.read.read;
        if (eBVar2.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(eBVar2.RatingCompat);
        }
    }

    public final void IconCompatParcelizer(CrashlyticsReport.FilesPayload.File file) {
        onGetStartedClick.write((Object) file, "accountSourceSelectDisplay");
        getChildFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.fragment_account_source_select, AccountSourceSelectFragment.write(file, ErrorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver.AUTO_RESIZE_MESSAGE_ERROR)).write();
    }

    @OnClick
    public final void navigateToAddAccountPage() {
        AddAccountConsentActivity.IconCompatParcelizer(getContext());
    }

    public final void onDestroy() {
        C4331eB eBVar = this.presenter;
        if (eBVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        eBVar.onDestroy();
        super.onDestroy();
    }
}

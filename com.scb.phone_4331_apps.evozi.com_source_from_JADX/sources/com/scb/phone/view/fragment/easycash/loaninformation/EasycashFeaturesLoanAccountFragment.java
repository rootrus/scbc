package com.scb.phone.view.fragment.easycash.loaninformation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.HmlPinActivity;
import p040o.Image;
import p040o.onGetStartedClick;
import p040o.setImageFilePath;

public final class EasycashFeaturesLoanAccountFragment extends BaseCommonAccountFragment implements CheckExtractActivity_MembersInjector.setForceShowIcon {
    public static final C5940xfc71f797 IconCompatParcelizer = new C5940xfc71f797((byte) 0);
    @HmlPinActivity
    public Image.FileRestriction presenter;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final setImageFilePath<?> write() {
        Image.FileRestriction fileRestriction = this.presenter;
        if (fileRestriction == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        return fileRestriction;
    }

    public final String PlaybackStateCompat() {
        String string = getString(R.string.loan_info_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.loan_info_title)");
        return string;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f87052131493932, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        Image.FileRestriction fileRestriction = this.presenter;
        if (fileRestriction == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        fileRestriction.MediaBrowserCompat$ItemReceiver(this);
        super.onViewCreated(view, bundle);
    }
}

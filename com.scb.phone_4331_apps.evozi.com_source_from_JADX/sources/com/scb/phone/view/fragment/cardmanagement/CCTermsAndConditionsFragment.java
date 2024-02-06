package com.scb.phone.view.fragment.cardmanagement;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.CreditCardParameters;
import p040o.HmlPinActivity;
import p040o.isEnforceCertFingerprintMatch;
import p040o.isEnforceCertFingerprintMatch$MediaBrowserCompat$ItemReceiver;

public class CCTermsAndConditionsFragment extends BaseFragment implements CreditCardParameters {
    private String IconCompatParcelizer;
    @HmlPinActivity
    public isEnforceCertFingerprintMatch presenter;
    @BindView
    WebView webView;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f86052131493832, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.IconCompatParcelizer = getActivity().getIntent().getStringExtra("com.scb.phone.view.activity.card_management.CCAboutActivity.KEY_TERMS_AND_CONDITIONS_URL");
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        isEnforceCertFingerprintMatch isenforcecertfingerprintmatch = this.presenter;
        String str = this.IconCompatParcelizer;
        String stackedBackground = setStackedBackground();
        if (isenforcecertfingerprintmatch.RatingCompat != null) {
            isenforcecertfingerprintmatch.RatingCompat.AlertController$RecycleListView();
        }
        isenforcecertfingerprintmatch.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(str, stackedBackground);
        isenforcecertfingerprintmatch.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new isEnforceCertFingerprintMatch$MediaBrowserCompat$ItemReceiver(isenforcecertfingerprintmatch, (byte) 0));
        return inflate;
    }

    public final void write(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
        sb.append("css/cc_content_style.css");
        sb.append("\"/>");
        sb.append(str);
        this.webView.loadDataWithBaseURL("file:///android_asset/", sb.toString(), "text/html", "utf-8", (String) null);
    }
}

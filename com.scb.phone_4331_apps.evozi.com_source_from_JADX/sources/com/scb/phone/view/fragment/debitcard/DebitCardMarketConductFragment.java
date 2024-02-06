package com.scb.phone.view.fragment.debitcard;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.debitcard.DebitCardProductCatalogActivity;
import com.scb.phone.view.activity.partner.SCBUniversalWebViewActivity;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.HmlPinActivity;
import p040o.ImageClassifier;
import p040o.MyECouponActivity_ViewBinding;
import p040o.nativeInitialize;
import p040o.proxyGetIIdExtractionServerKta;
import p040o.serializeDb;
import p040o.setTapText;

public class DebitCardMarketConductFragment extends BaseFragment implements proxyGetIIdExtractionServerKta {
    @BindView
    TextView link;
    @HmlPinActivity
    public ImageClassifier presenter;

    public static DebitCardMarketConductFragment IconCompatParcelizer() {
        return new DebitCardMarketConductFragment();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f86442131493871, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        TextView textView = this.link;
        String string = getString(R.string.debit_card_market_conduct_link);
        StringBuilder sb = new StringBuilder();
        sb.append("<a href=\"");
        sb.append(string);
        sb.append("\">");
        sb.append(string);
        sb.append("</a>");
        textView.setText(Html.fromHtml(sb.toString()));
        return inflate;
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }

    @OnClick
    public void onButtonClick() {
        ImageClassifier imageClassifier = this.presenter;
        serializeDb serializedb = serializeDb.write;
        if (imageClassifier.RatingCompat != null) {
            serializedb.IconCompatParcelizer(imageClassifier.RatingCompat);
        }
    }

    @OnClick
    public void onLinkClick() {
        ImageClassifier imageClassifier = this.presenter;
        nativeInitialize nativeinitialize = nativeInitialize.MediaBrowserCompat$CustomActionResultReceiver;
        if (imageClassifier.RatingCompat != null) {
            nativeinitialize.IconCompatParcelizer(imageClassifier.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        DebitCardProductCatalogActivity.write(getContext());
    }

    public final void write() {
        Intent MediaBrowserCompat$ItemReceiver = SCBUniversalWebViewActivity.MediaBrowserCompat$ItemReceiver(getContext(), getString(R.string.debit_card_market_conduct_link));
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                MediaBrowserCompat$ItemReceiver = setTapText.write(activity, MediaBrowserCompat$ItemReceiver).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(MediaBrowserCompat$ItemReceiver.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(MediaBrowserCompat$ItemReceiver);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}

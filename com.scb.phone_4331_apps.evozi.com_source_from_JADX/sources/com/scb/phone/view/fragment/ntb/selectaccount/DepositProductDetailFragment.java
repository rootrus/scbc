package com.scb.phone.view.fragment.ntb.selectaccount;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment;
import com.squareup.picasso.Picasso;
import p040o.ActivityBuilder_ContributeHmlNTBAccountSuccessActivity;
import p040o.C4178cf;
import p040o.FragmentBuilder_BindEkycFragment;
import p040o.FragmentBuilder_BindFundDetailSummaryFragment;
import p040o.HmlPinActivity;
import p040o.KtaJsonCheck;
import p040o.getIBus;
import p040o.getIIdExtractorProvider;
import p040o.setDisplayVersion;

public class DepositProductDetailFragment extends BaseFragment implements KtaJsonCheck.write {
    public write MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    Button buttonProceed;
    @HmlPinActivity
    public C4178cf depositProductDetailPresenter;
    @BindView
    public ImageView imageDetail;
    @BindView
    WebView webView;

    public interface write {
        void MediaBrowserCompat$ItemReceiver(String str, String str2);
    }

    public static DepositProductDetailFragment read(String str, String str2) {
        DepositProductDetailFragment depositProductDetailFragment = new DepositProductDetailFragment();
        Bundle bundle = new Bundle();
        bundle.putString("BUNDLE_CODE", str);
        bundle.putString("OBJECTIVE_ID", str2);
        bundle.putBoolean("EXTRA_IS_FROM_TOUCH_POINT", true);
        depositProductDetailFragment.setArguments(bundle);
        return depositProductDetailFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f89832131494210, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        String string = getArguments().getString("BUNDLE_CODE");
        String string2 = getArguments().getString("OBJECTIVE_ID");
        boolean z2 = getArguments().getBoolean("EXTRA_IS_FROM_TOUCH_POINT");
        this.depositProductDetailPresenter.MediaBrowserCompat$ItemReceiver(this);
        C4178cf cfVar = this.depositProductDetailPresenter;
        cfVar.MediaBrowserCompat$ItemReceiver = string;
        cfVar.write = string2;
        getIIdExtractorProvider getiidextractorprovider = new getIIdExtractorProvider(z2);
        if (cfVar.RatingCompat != null) {
            getiidextractorprovider.IconCompatParcelizer(cfVar.RatingCompat);
        }
        if (cfVar.RatingCompat != null) {
            z = true;
        }
        if (z) {
            cfVar.RatingCompat.AlertController$RecycleListView();
        }
        cfVar.read.IconCompatParcelizer(string);
        cfVar.read.IconCompatParcelizer(new C4178cf.read());
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.buttonProceed.setText(R.string.proceed);
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        this.buttonProceed.setVisibility(z ? 0 : 8);
    }

    public final void write(String str, String str2) {
        write write2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (write2 != null) {
            write2.MediaBrowserCompat$ItemReceiver(str, str2);
        }
    }

    @OnClick
    public void onProceedButtonClick() {
        C4178cf cfVar = this.depositProductDetailPresenter;
        getIBus getibus = new getIBus(cfVar);
        if (cfVar.RatingCompat != null) {
            getibus.IconCompatParcelizer(cfVar.RatingCompat);
        }
    }

    public void onDestroyView() {
        this.depositProductDetailPresenter.onDestroy();
        super.onDestroyView();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(setDisplayVersion setdisplayversion) {
        FragmentBuilder_BindFundDetailSummaryFragment write2 = Picasso.read().write(setdisplayversion.MediaBrowserCompat$ItemReceiver);
        write2.read = true;
        write2.read(this.imageDetail, (FragmentBuilder_BindEkycFragment) null);
        this.imageDetail.post(new ActivityBuilder_ContributeHmlNTBAccountSuccessActivity(this));
        String str = setdisplayversion.RatingCompat;
        StringBuilder sb = new StringBuilder();
        sb.append("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/etb_terms_and_condition_style.css\"/>");
        sb.append(str);
        this.webView.loadDataWithBaseURL("file:///android_asset/", sb.toString(), "text/html", "utf-8", (String) null);
    }
}

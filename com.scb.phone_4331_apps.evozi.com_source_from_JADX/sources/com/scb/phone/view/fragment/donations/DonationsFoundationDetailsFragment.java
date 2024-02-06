package com.scb.phone.view.fragment.donations;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.material.appbar.AppBarLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.transferandpay.FavouriteSelectedActivity;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.lang.ref.WeakReference;
import p040o.AlertController$RecycleListView;
import p040o.CheckExtractActivity;
import p040o.Confidences;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.XVrsDocumentLandmark;
import p040o.getBinaryImagesFile;
import p040o.nativeChannels;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;

public class DonationsFoundationDetailsFragment extends BaseFragment implements AppBarLayout.read, CheckExtractActivity.IconCompatParcelizer {
    @BindView
    ImageView backgroundImageView;
    @HmlPinActivity
    public nativeChannels donationsFoundationDetailPresenter;
    @BindView
    AppBarLayout mAppBarLayout;
    @BindView
    TextView mFoundationName;
    @BindView
    WebView mHtmlDescriptionWebView;
    @BindView
    ImageView mLogoImageView;

    public static DonationsFoundationDetailsFragment read(getBinaryImagesFile getbinaryimagesfile) {
        DonationsFoundationDetailsFragment donationsFoundationDetailsFragment = new DonationsFoundationDetailsFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("SELECTED_IMAGE_POSITION", getbinaryimagesfile);
        donationsFoundationDetailsFragment.setArguments(bundle);
        return donationsFoundationDetailsFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f86822131493909, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        super.setTransitioning();
        ActionBarContextView();
        setActionBarVisibilityCallback();
        this.mAppBarLayout.IconCompatParcelizer((AppBarLayout.read) this);
        setTitleOptional();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.backgroundImageView.getLayoutParams().height = (displayMetrics.heightPixels * 38) / 100;
        this.donationsFoundationDetailPresenter.MediaBrowserCompat$ItemReceiver(this);
        getBinaryImagesFile getbinaryimagesfile = (getBinaryImagesFile) getArguments().getParcelable("SELECTED_IMAGE_POSITION");
        nativeChannels nativechannels = this.donationsFoundationDetailPresenter;
        nativechannels.read = getbinaryimagesfile;
        Confidences confidences = new Confidences(getbinaryimagesfile);
        if (nativechannels.RatingCompat != null) {
            z = true;
        }
        if (z) {
            confidences.IconCompatParcelizer(nativechannels.RatingCompat);
        }
        return inflate;
    }

    public final void read(AppBarLayout appBarLayout, int i) {
        AlertController$RecycleListView.read(appBarLayout, i, (WeakReference<TextView>) new WeakReference(this.mActionBarTitle));
    }

    public final void setTransitioning() {
        super.setTransitioning();
        ActionBarContextView();
        setActionBarVisibilityCallback();
    }

    public final void write() {
        Intent intent = new Intent(getContext(), FavouriteSelectedActivity.class);
        intent.putExtra("source", "input");
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void write(getBinaryImagesFile getbinaryimagesfile) {
        String stackedBackground = setStackedBackground();
        getContext();
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(setLastBaselineToBottomHeight.write(getContext(), R.drawable.donations_place_holder), this.backgroundImageView, getbinaryimagesfile.write);
        getContext();
        FragmentBuilder_BindDepositSelectorFragment.read((int) R.drawable.donations_place_holder_logo, this.mLogoImageView, getbinaryimagesfile.IconCompatParcelizer);
        if (stackedBackground.equals("th")) {
            this.mFoundationName.setText(getbinaryimagesfile.MediaMetadataCompat.write);
            WebView webView = this.mHtmlDescriptionWebView;
            StringBuilder sb = new StringBuilder();
            sb.append(getString(R.string.web_responsive));
            sb.append(getString(R.string.close_tag, getbinaryimagesfile.MediaBrowserCompat$CustomActionResultReceiver.write));
            webView.loadDataWithBaseURL((String) null, sb.toString(), "text/html", "UTF-8", (String) null);
        } else {
            this.mFoundationName.setText(getbinaryimagesfile.MediaMetadataCompat.read);
            WebView webView2 = this.mHtmlDescriptionWebView;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getString(R.string.web_responsive));
            sb2.append(getString(R.string.close_tag, getbinaryimagesfile.MediaBrowserCompat$CustomActionResultReceiver.read));
            webView2.loadDataWithBaseURL((String) null, sb2.toString(), "text/html", "UTF-8", (String) null);
        }
        this.mHtmlDescriptionWebView.getSettings().setJavaScriptEnabled(true);
        this.mHtmlDescriptionWebView.getSettings().setDomStorageEnabled(true);
    }

    @OnClick
    public void onDonateButtonClick() {
        nativeChannels nativechannels = this.donationsFoundationDetailPresenter;
        nativechannels.MediaBrowserCompat$ItemReceiver.read.MediaDescriptionCompat(nativechannels.read.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver);
        XVrsDocumentLandmark.LandmarkType landmarkType = XVrsDocumentLandmark.LandmarkType.IconCompatParcelizer;
        if (nativechannels.RatingCompat != null) {
            landmarkType.IconCompatParcelizer(nativechannels.RatingCompat);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.donationsFoundationDetailPresenter.onDestroy();
    }
}

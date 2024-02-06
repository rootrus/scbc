package com.scb.phone.view.fragment.ntb.selectaccount;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.BaseFragment;
import okhttp3.internal.cache.DiskLruCache;
import p040o.AutoValue_CrashlyticsReport_FilesPayload_File;
import p040o.C4199cn;
import p040o.FragmentBuilder_BindChangeChannelStatementReviewFragment;
import p040o.HmlPinActivity;
import p040o.KtaJsonCheck;
import p040o.KtaJsonCheck$MediaBrowserCompat$SearchResultReceiver;
import p040o.blend;
import p040o.getFiles;

public class ProductTermConditionFragment extends BaseFragment implements KtaJsonCheck$MediaBrowserCompat$SearchResultReceiver {
    private FragmentBuilder_BindChangeChannelStatementReviewFragment.read IconCompatParcelizer;
    private KtaJsonCheck.MediaDescriptionCompat MediaBrowserCompat$CustomActionResultReceiver;
    private blend RatingCompat = new blend();
    @BindView
    Button buttonAccept;
    @BindView
    Button buttonDecline;
    @HmlPinActivity
    public C4199cn productTermConditionPresenter;
    @BindView
    TextView textHtml;

    public /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(getFiles getfiles) {
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragmentBuilder_BindChangeChannelStatementReviewFragment.read) {
            this.IconCompatParcelizer = (FragmentBuilder_BindChangeChannelStatementReviewFragment.read) context;
        }
        if (context instanceof KtaJsonCheck.MediaDescriptionCompat) {
            this.MediaBrowserCompat$CustomActionResultReceiver = (KtaJsonCheck.MediaDescriptionCompat) context;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f89852131494212, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.productTermConditionPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.buttonAccept.setEnabled(false);
        this.buttonDecline.setEnabled(false);
        C4199cn cnVar = this.productTermConditionPresenter;
        String string = getArguments().getString("BUNDLE_PRODUCT_CODE");
        String string2 = getArguments().getString("BUNDLE_OBJECTIVE_ID");
        cnVar.write = string;
        cnVar.IconCompatParcelizer = string2;
        if (cnVar.RatingCompat != null) {
            z = true;
        }
        if (z) {
            cnVar.RatingCompat.AlertController$RecycleListView();
        }
        cnVar.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(string);
        cnVar.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new C4199cn.IconCompatParcelizer());
        FragmentBuilder_BindChangeChannelStatementReviewFragment.read read = this.IconCompatParcelizer;
        if (read != null) {
            read.mo34015m_(getString(R.string.ntb_select_account_term_condition_page));
        }
        return inflate;
    }

    public void onDestroy() {
        super.onDestroy();
        this.productTermConditionPresenter.onDestroy();
    }

    public void MediaBrowserCompat$CustomActionResultReceiver() {
        FragmentBuilder_BindChangeChannelStatementReviewFragment.read read = this.IconCompatParcelizer;
        if (read != null) {
            read.IconCompatParcelizer(DiskLruCache.VERSION_1);
        }
    }

    public final void read(AutoValue_CrashlyticsReport_FilesPayload_File autoValue_CrashlyticsReport_FilesPayload_File) {
        if (MediaBrowserCompat$ItemReceiver() != null) {
            blend blend = this.RatingCompat;
            String MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver();
            String write = this.productTermConditionPresenter.read.write();
            blend.read("source", MediaBrowserCompat$ItemReceiver);
            if (write != null && "touchpoint".equals(MediaBrowserCompat$ItemReceiver)) {
                blend.read("customer_group", write);
            }
        }
        blend blend2 = this.RatingCompat;
        if (getActivity() != null) {
            blend2.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "ekyc_savingaccount");
        }
        this.textHtml.setText(Html.fromHtml(autoValue_CrashlyticsReport_FilesPayload_File.read));
    }

    /* access modifiers changed from: protected */
    public String MediaBrowserCompat$ItemReceiver() {
        KtaJsonCheck.MediaDescriptionCompat mediaDescriptionCompat = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (mediaDescriptionCompat == null) {
            return null;
        }
        return mediaDescriptionCompat.read();
    }

    public final void read(boolean z) {
        this.buttonAccept.setEnabled(z);
        this.buttonDecline.setEnabled(z);
    }

    @OnClick
    public void onAcceptButtonClick() {
        this.productTermConditionPresenter.IconCompatParcelizer();
    }

    @OnClick
    public void onDeclineButtonClick() {
        setSplitBackground();
    }
}

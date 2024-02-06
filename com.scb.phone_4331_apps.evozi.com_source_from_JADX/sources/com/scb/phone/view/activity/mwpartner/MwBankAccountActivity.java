package com.scb.phone.view.activity.mwpartner;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.adapter.merchant.bankaccount.BankAccountAdapter;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.List;
import p040o.AppStatsDsFieldType;
import p040o.AppStatsInstanceType;
import p040o.C10833element;
import p040o.CrashlyticsReport;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.dateStringFromEventTime;
import p040o.fromExtractorField;
import p040o.getAppStatsDaoObjSizeInstCnt;
import p040o.setLiveFaceConfig;
import p040o.setTapText;
import p040o.standardElementSet;
import p040o.trimTrailingFrom;

public class MwBankAccountActivity extends BaseActivity implements fromExtractorField {
    private BankAccountAdapter MediaBrowserCompat$SearchResultReceiver;
    @BindView
    public Button btnReview;
    @BindView
    NestedScrollView layoutContent;
    @BindView
    LinearLayout layoutSomethingError;
    @HmlPinActivity
    public AppStatsInstanceType mwBankAccountPresenter;
    @BindView
    RecyclerView recyclerView;

    public static Intent read(Context context) {
        return new Intent(context, MwBankAccountActivity.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f78792131493104);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        setTitle(R.string.mw_bank_account_title);
        setTabContainer();
        mo13676d_("merchant_select_bankaccount");
        BankAccountAdapter bankAccountAdapter = new BankAccountAdapter();
        this.MediaBrowserCompat$SearchResultReceiver = bankAccountAdapter;
        bankAccountAdapter.write = new setLiveFaceConfig(this);
        this.recyclerView.setLayoutManager(new LinearLayoutManager());
        this.recyclerView.setAdapter(this.MediaBrowserCompat$SearchResultReceiver);
        this.btnReview.setEnabled(false);
        this.layoutContent.setVisibility(8);
        this.layoutSomethingError.setVisibility(8);
        this.mwBankAccountPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.mwBankAccountPresenter.IconCompatParcelizer();
    }

    @OnClick
    public void onClickReview() {
        AppStatsInstanceType appStatsInstanceType = this.mwBankAccountPresenter;
        BankAccountAdapter bankAccountAdapter = this.MediaBrowserCompat$SearchResultReceiver;
        int i = bankAccountAdapter.read;
        CrashlyticsReport.FilesPayload.File.Builder builder = i != -1 ? bankAccountAdapter.MediaBrowserCompat$ItemReceiver.get(i) : null;
        AppStatsDsFieldType appStatsDsFieldType = AppStatsDsFieldType.MediaBrowserCompat$CustomActionResultReceiver;
        if (appStatsInstanceType.RatingCompat != null) {
            appStatsDsFieldType.IconCompatParcelizer(appStatsInstanceType.RatingCompat);
        }
        C10833element write = appStatsInstanceType.IconCompatParcelizer.write();
        standardElementSet standardelementset = write.MediaBrowserCompat$CustomActionResultReceiver;
        standardelementset.read = builder.IconCompatParcelizer;
        standardelementset.write = builder.f2695x50fd9e4a;
        standardelementset.MediaBrowserCompat$ItemReceiver = builder.MediaMetadataCompat;
        standardelementset.IconCompatParcelizer = builder.MediaSessionCompat$ResultReceiverWrapper.value;
        trimTrailingFrom trimtrailingfrom = appStatsInstanceType.MediaBrowserCompat$ItemReceiver;
        trimtrailingfrom.read(trimtrailingfrom.write.MediaBrowserCompat$CustomActionResultReceiver(write), new getAppStatsDaoObjSizeInstCnt(appStatsInstanceType), new dateStringFromEventTime(appStatsInstanceType));
    }

    @OnClick
    public void onClickRetry() {
        this.mwBankAccountPresenter.IconCompatParcelizer();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.layoutContent.setVisibility(8);
        this.layoutSomethingError.setVisibility(0);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<CrashlyticsReport.FilesPayload.File.Builder> list) {
        this.layoutContent.setVisibility(0);
        this.layoutSomethingError.setVisibility(8);
        BankAccountAdapter bankAccountAdapter = this.MediaBrowserCompat$SearchResultReceiver;
        bankAccountAdapter.MediaBrowserCompat$ItemReceiver = list;
        bankAccountAdapter.IconCompatParcelizer.write();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        Intent IconCompatParcelizer = MwReviewActivity.IconCompatParcelizer(this);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, IconCompatParcelizer).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}

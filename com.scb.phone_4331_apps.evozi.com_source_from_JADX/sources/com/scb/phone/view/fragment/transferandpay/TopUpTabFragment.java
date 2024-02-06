package com.scb.phone.view.fragment.transferandpay;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.transferandpay.topup.TopUpActivity;
import com.scb.phone.view.adapter.accountsummary.ErrorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver;
import com.scb.phone.view.adapter.transferandpay.AccountSourceAdapter;
import com.scb.phone.view.fragment.transferandpay.AccountSourceSelectFragment;
import com.scb.phone.view.fragment.transferandpay.topuptab.TopUpBillerFragment;
import com.scb.phone.view.fragment.transferandpay.topuptab.TopUpBillerSelectedFragment;
import com.scb.phone.view.fragment.transferandpay.topuptab.TopUpTargetTabFragment;
import p040o.ActivityBuilder_ContributeVerifyIdentityTipsActivity;
import p040o.CardView;
import p040o.CrashlyticsReport;
import p040o.HmlPinActivity;
import p040o.LogFileManager;
import p040o.WorkflowActivity;
import p040o.ZSYR2K;
import p040o.getIJsonExactionHelperRtti;
import p040o.getTopLeftCornerWidth;
import p040o.handleException;
import p040o.parseEventSignal;
import p040o.tryRestoreState;

public class TopUpTabFragment extends BaseTransferAndPayTabFragment implements getTopLeftCornerWidth.setPadding, AccountSourceSelectFragment.write {
    public TopUpTargetTabFragment IconCompatParcelizer;
    private AccountSourceSelectFragment MediaBrowserCompat$CustomActionResultReceiver;
    private String MediaBrowserCompat$MediaItem;
    private TopUpBillerSelectedFragment MediaBrowserCompat$SearchResultReceiver;
    private String MediaMetadataCompat;
    @BindView
    NestedScrollView scrollView;
    @HmlPinActivity
    public getIJsonExactionHelperRtti topUpTabPresenter;

    public final /* synthetic */ void MediaSessionCompat$ResultReceiverWrapper() {
    }

    public static TopUpTabFragment IconCompatParcelizer(String str) {
        TopUpTabFragment topUpTabFragment = new TopUpTabFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.scb.phone.FAVOURITE", true);
        bundle.putString("source", str);
        topUpTabFragment.setArguments(bundle);
        return topUpTabFragment;
    }

    public static TopUpTabFragment write(parseEventSignal parseeventsignal, LogFileManager.C35981 r4, String str, String str2, CrashlyticsReport.FilesPayload.File file, ErrorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver errorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver) {
        TopUpTabFragment topUpTabFragment = new TopUpTabFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.TOP_SHORTCUT", parseeventsignal);
        bundle.putParcelable("com.scb.phone.TOP_HISTORY", r4);
        bundle.putString("source", str);
        bundle.putString("subtype", str2);
        bundle.putParcelable("EXTRA_ACCOUNT_SOURCE_DISPLAY", file);
        bundle.putSerializable("EXTRA_ERROR_TYPE", errorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver);
        topUpTabFragment.setArguments(bundle);
        return topUpTabFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f90112131494238, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.topUpTabPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.MediaMetadataCompat = AbsActionBarView();
        this.MediaBrowserCompat$MediaItem = setVisibility();
        boolean z2 = !(getActivity() instanceof TopUpActivity) || !((TopUpActivity) getActivity()).MediaBrowserCompat$SearchResultReceiver;
        if (!"tile".equalsIgnoreCase(this.MediaMetadataCompat) && z2) {
            ZSYR2K[] zsyr2kArr = {new ZSYR2K("source", this.MediaMetadataCompat)};
            if (getActivity() != null) {
                ((BaseActivity) getActivity()).scbAnalytics.write("topup_landing", zsyr2kArr);
            }
        }
        if (getArguments() == null || getArguments().getParcelable("EXTRA_ACCOUNT_SOURCE_DISPLAY") == null) {
            getIJsonExactionHelperRtti getijsonexactionhelperrtti = this.topUpTabPresenter;
            handleException handleexception = handleException.MediaBrowserCompat$CustomActionResultReceiver;
            if (getijsonexactionhelperrtti.RatingCompat != null) {
                handleexception.IconCompatParcelizer(getijsonexactionhelperrtti.RatingCompat);
            }
        } else {
            getIJsonExactionHelperRtti getijsonexactionhelperrtti2 = this.topUpTabPresenter;
            CrashlyticsReport.FilesPayload.File file = (CrashlyticsReport.FilesPayload.File) getArguments().getParcelable("EXTRA_ACCOUNT_SOURCE_DISPLAY");
            if (file != null) {
                tryRestoreState tryrestorestate = new tryRestoreState(file);
                if (getijsonexactionhelperrtti2.RatingCompat != null) {
                    tryrestorestate.IconCompatParcelizer(getijsonexactionhelperrtti2.RatingCompat);
                }
            } else {
                handleException handleexception2 = handleException.MediaBrowserCompat$CustomActionResultReceiver;
                if (getijsonexactionhelperrtti2.RatingCompat != null) {
                    handleexception2.IconCompatParcelizer(getijsonexactionhelperrtti2.RatingCompat);
                }
            }
        }
        if (getArguments() != null && getArguments().getParcelable("com.scb.phone.TOP_SHORTCUT") != null) {
            CardView read = getFragmentManager().read();
            read.MediaBrowserCompat$ItemReceiver(getChildFragmentManager().findFragmentById(R.id.fragment_favourite_top_up_target));
            read.write();
            getIJsonExactionHelperRtti getijsonexactionhelperrtti3 = this.topUpTabPresenter;
            parseEventSignal parseeventsignal = (parseEventSignal) getArguments().getParcelable("com.scb.phone.TOP_SHORTCUT");
            LogFileManager.C35981 r2 = (LogFileManager.C35981) getArguments().getParcelable("com.scb.phone.TOP_HISTORY");
            if (r2 != null) {
                parseeventsignal.Keep = r2.RatingCompat;
                parseeventsignal.MediaMetadataCompat = r2.MediaDescriptionCompat;
                parseeventsignal.MediaBrowserCompat$SearchResultReceiver = r2.read;
            }
            WorkflowActivity.C7089a aVar = new WorkflowActivity.C7089a(getijsonexactionhelperrtti3, parseeventsignal);
            if (getijsonexactionhelperrtti3.RatingCompat != null) {
                z = true;
            }
            if (z) {
                aVar.IconCompatParcelizer(getijsonexactionhelperrtti3.RatingCompat);
            }
        } else if (getArguments() == null || !getArguments().getBoolean("com.scb.phone.FAVOURITE")) {
            MediaBrowserCompat$ItemReceiver("com.scb.phone/BROADCAST_TOP_UP_NEXT_STEP", "com.scb.phone/BROADCAST_TOP_UP_BACK_STEP");
            TopUpTargetTabFragment read2 = TopUpTargetTabFragment.read((String) null);
            this.IconCompatParcelizer = read2;
            read(read2, R.id.fragment_container_top_up, "TOP_UP_BILLER_FRAGMENT_TAG", true);
        } else {
            CardView read3 = getFragmentManager().read();
            read3.MediaBrowserCompat$ItemReceiver(getChildFragmentManager().findFragmentById(R.id.fragment_favourite_top_up_target));
            read3.write();
            MediaBrowserCompat$ItemReceiver("com.scb.phone/BROADCAST_TOP_UP_FAVOURITE_NEXT_STEP", "com.scb.phone/BROADCAST_TOP_UP_BACK_STEP");
        }
        this.scrollView.setOnScrollChangeListener(new ActivityBuilder_ContributeVerifyIdentityTipsActivity(this));
        return inflate;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReport.FilesPayload.File file) {
        ErrorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver errorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver = ErrorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver.NORMAL_ERROR;
        if (!(getArguments() == null || getArguments().getSerializable("EXTRA_ERROR_TYPE") == null)) {
            errorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver = (ErrorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver) getArguments().getSerializable("EXTRA_ERROR_TYPE");
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = AccountSourceSelectFragment.write(file, errorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver);
        CardView read = getChildFragmentManager().read();
        read.MediaBrowserCompat$ItemReceiver(R.id.fragment_account_source_select, this.MediaBrowserCompat$CustomActionResultReceiver);
        read.write();
    }

    /* access modifiers changed from: package-private */
    public final void write(Intent intent) {
        this.topUpTabPresenter.IconCompatParcelizer(intent.getExtras());
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Intent intent) {
        super.IconCompatParcelizer(intent);
        read(new TopUpBillerFragment(), R.id.fragment_container_top_up, "TOP_UP_BILLER_FRAGMENT_TAG", true);
        this.MediaBrowserCompat$SearchResultReceiver = null;
    }

    public final void IconCompatParcelizer(parseEventSignal parseeventsignal) {
        AccountSourceSelectFragment accountSourceSelectFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        AccountSourceAdapter accountSourceAdapter = accountSourceSelectFragment.MediaBrowserCompat$SearchResultReceiver;
        TopUpBillerSelectedFragment write = TopUpBillerSelectedFragment.write(parseeventsignal, accountSourceAdapter != null ? accountSourceAdapter.MediaBrowserCompat$CustomActionResultReceiver(accountSourceSelectFragment.mViewPager.getCurrentItem()) : null, this.MediaMetadataCompat, this.MediaBrowserCompat$MediaItem);
        this.MediaBrowserCompat$SearchResultReceiver = write;
        read(write, R.id.fragment_container_top_up, "TOP_UP_BILLER_SELECTED_FRAGMENT_TAG", true, true);
    }

    public void onDestroy() {
        super.onDestroy();
        this.topUpTabPresenter.onDestroy();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReport.FilesPayload.File.Builder builder) {
        if (builder != null) {
            TopUpBillerSelectedFragment topUpBillerSelectedFragment = this.MediaBrowserCompat$SearchResultReceiver;
            if (topUpBillerSelectedFragment != null) {
                topUpBillerSelectedFragment.read(builder);
            } else if (this.IconCompatParcelizer == null) {
                aA_();
                TopUpTargetTabFragment read = TopUpTargetTabFragment.read(builder.MediaSessionCompat$Token);
                this.IconCompatParcelizer = read;
                read(read, R.id.fragment_container_top_up, "TOP_UP_BILLER_FRAGMENT_TAG", true);
            }
        }
    }

    /* renamed from: c_ */
    public final void mo13978c_(boolean z) {
        this.topUpTabPresenter.write(z);
        LogFileManager.C35981 r0 = getArguments() != null ? (LogFileManager.C35981) getArguments().getParcelable("com.scb.phone.TOP_HISTORY") : null;
        if (z && r0 != null && !TextUtils.isEmpty(r0.MediaBrowserCompat$ItemReceiver)) {
            this.MediaBrowserCompat$CustomActionResultReceiver.read(r0.MediaBrowserCompat$ItemReceiver);
        }
    }
}

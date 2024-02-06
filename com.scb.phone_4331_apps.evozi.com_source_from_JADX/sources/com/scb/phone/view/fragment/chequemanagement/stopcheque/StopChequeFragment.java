package com.scb.phone.view.fragment.chequemanagement.stopcheque;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.BaseFragment;
import com.scb.phone.view.fragment.transferandpay.AccountSourceSelectFragment;
import p040o.CrashlyticsReport;
import p040o.CrashlyticsReportJsonTransform$$Lambda$4;
import p040o.FragmentBuilder_BindBillPaymentTabFragment;
import p040o.HmlPinActivity;
import p040o.IdParameters;
import p040o.doubleValue;
import p040o.getCreditCardRewardsTermsAndConditions;
import p040o.intValue;
import p040o.promoteNameToValue;

public class StopChequeFragment extends BaseFragment implements IdParameters.IdState, FragmentBuilder_BindBillPaymentTabFragment, AccountSourceSelectFragment.write {
    public StopChequeHistoryFragment IconCompatParcelizer;
    String MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    FrameLayout accountSourceSelected;
    @HmlPinActivity
    public intValue presenter;
    @BindView
    LinearLayout rootErrorNoAccount;
    @BindView
    NestedScrollView scrollView;
    @BindView
    TextView tvAccountFrom;
    @BindView
    TextView tvErrorNoAccountDetail;
    @BindView
    TextView tvErrorNoAccountTitle;

    public final /* synthetic */ void MediaSessionCompat$ResultReceiverWrapper() {
    }

    /* renamed from: c_ */
    public final /* synthetic */ void mo13978c_(boolean z) {
    }

    public static StopChequeFragment IconCompatParcelizer(int i) {
        StopChequeFragment stopChequeFragment = new StopChequeFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("STOP_CHEQUE_EXTRA_SOURCE_SIZE", i);
        stopChequeFragment.setArguments(bundle);
        return stopChequeFragment;
    }

    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        if (fragment instanceof StopChequeHistoryFragment) {
            StopChequeHistoryFragment stopChequeHistoryFragment = (StopChequeHistoryFragment) fragment;
            this.IconCompatParcelizer = stopChequeHistoryFragment;
            stopChequeHistoryFragment.MediaBrowserCompat$MediaItem = this;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f90022131494229, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).mo13676d_("stopchq_landing");
        }
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        boolean z = false;
        int i = getArguments() != null ? getArguments().getInt("STOP_CHEQUE_EXTRA_SOURCE_SIZE", 0) : 0;
        intValue intvalue = this.presenter;
        if (i > 0) {
            doubleValue doublevalue = doubleValue.write;
            if (intvalue.RatingCompat != null) {
                z = true;
            }
            if (z) {
                doublevalue.IconCompatParcelizer(intvalue.RatingCompat);
                return;
            }
            return;
        }
        promoteNameToValue promotenametovalue = promoteNameToValue.MediaBrowserCompat$CustomActionResultReceiver;
        if (intvalue.RatingCompat != null) {
            z = true;
        }
        if (z) {
            promotenametovalue.IconCompatParcelizer(intvalue.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        getString(R.string.stop_cheque_title);
        CrashlyticsReport.FilesPayload.File.write write = new CrashlyticsReport.FilesPayload.File.write(CrashlyticsReportJsonTransform$$Lambda$4.STOP_CHEQUE_STATUS_FUNCTION);
        write.MediaBrowserCompat$ItemReceiver = false;
        write.IconCompatParcelizer = true;
        write.MediaDescriptionCompat = true;
        write.RatingCompat = true;
        write.MediaDescriptionCompat = false;
        write.RatingCompat = false;
        write.IconCompatParcelizer = false;
        getChildFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.fragment_account_source_select, AccountSourceSelectFragment.read(new CrashlyticsReport.FilesPayload.File(write, (byte) 0))).write();
        this.scrollView.setOnScrollChangeListener(new getCreditCardRewardsTermsAndConditions(this));
    }

    public final void write() {
        String string = getString(R.string.error_issued_cheque_no_account);
        String string2 = getString(R.string.error_issued_cheque_no_account_detail);
        this.tvErrorNoAccountTitle.setText(string);
        this.tvErrorNoAccountDetail.setText(string2);
        this.rootErrorNoAccount.setVisibility(0);
        getChildFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container_stop_cheque_history, StopChequeHistoryFragment.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, "")).write();
    }

    public final void aD_() {
        PlaybackStateCompat$CustomAction();
        if (getChildFragmentManager().findFragmentById(R.id.container_stop_cheque_history) instanceof StopChequeInputFragment) {
            getChildFragmentManager().MediaMetadataCompat();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReport.FilesPayload.File.Builder builder) {
        if (builder != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = builder.MediaSessionCompat$Token;
            getChildFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container_stop_cheque_history, StopChequeHistoryFragment.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, "")).write();
        }
    }
}

package com.scb.phone.view.fragment.loan;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.loan.LoanInputActivity;
import com.scb.phone.view.adapter.loan.LoanDetailAdapter;
import com.scb.phone.view.custom.common.CustomBillsToPay;
import com.scb.phone.view.custom.common.CustomHorizontalProgressBar;
import com.scb.phone.view.custom.common.WrapContentViewPager;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.ArrayList;
import java.util.List;
import p040o.ActivityBuilder_ContributeECouponDetailActivity;
import p040o.FragmentBuilder_BindDeejungPlansFragment;
import p040o.Futures;
import p040o.HmlPinActivity;
import p040o.ZSYR2K;
import p040o.getTransit;
import p040o.startRecord;
import p040o.writeFileStatusEvent;
import p059me.relex.circleindicator.CircleIndicator;

public class LoanDetailFragment extends BaseFragment implements getTransit.IconCompatParcelizer, ViewPager.MediaMetadataCompat {
    @BindView
    LinearLayout linearLoanStatusOk;
    @BindView
    LinearLayout linearLoanStatusRestricted;
    @HmlPinActivity
    public writeFileStatusEvent loanDetailPresenter;
    @BindView
    LinearLayout mAccountDetailCollapsibleRelativeLayout;
    @BindView
    ImageView mCollapsibleImageView;
    @BindView
    CustomBillsToPay mCustomBillsToPay;
    @BindView
    CustomHorizontalProgressBar mCustomHorizontalProgressBar;
    @BindView
    TextView mInstallmentAmountValueTextView;
    @BindView
    TextView mInterestRateTextView;
    @BindView
    TextView mLoanAccountNameTextView;
    @BindView
    CircleIndicator mLoanDetailCircleIndicator;
    @BindView
    TextView mLoanDetailLatePaymentsTextView;
    @BindView
    ScrollView mLoanDetailScrollview;
    @BindView
    TextView mLoanDetailTenorTextView;
    @BindView
    TextView mLoanTypeTextView;
    @BindView
    WrapContentViewPager mLoanViewPager;
    @BindView
    TextView mLoandDetailRestrictedDescriptionTextView;

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f88282131494055, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.loanDetailPresenter.MediaBrowserCompat$ItemReceiver(this);
        super.setTransitioning();
        setActionBarVisibilityCallback();
        ParcelableVolumeInfo(getString(R.string.loan_detail_title));
        ArrayList arrayList = new ArrayList();
        if (getActivity() == null || getActivity().getIntent() == null) {
            i = 0;
        } else {
            arrayList = getActivity().getIntent().getParcelableArrayListExtra("LOAN_DISPLAY_LIST");
            i = getActivity().getIntent().getIntExtra("SELECTED_LOAN_POSITION", 0);
        }
        writeFileStatusEvent writefilestatusevent = this.loanDetailPresenter;
        writefilestatusevent.IconCompatParcelizer = arrayList;
        if (writefilestatusevent.RatingCompat != null) {
            startRecord startrecord = new startRecord(arrayList, i);
            if (writefilestatusevent.RatingCompat != null) {
                z = true;
            }
            if (z) {
                startrecord.IconCompatParcelizer(writefilestatusevent.RatingCompat);
            }
        }
        writefilestatusevent.IconCompatParcelizer(i);
        return inflate;
    }

    public final void setTransitioning() {
        super.setTransitioning();
        setActionBarVisibilityCallback();
        ParcelableVolumeInfo(getString(R.string.loan_detail_title));
    }

    public void onDestroy() {
        this.loanDetailPresenter.onDestroy();
        super.onDestroy();
    }

    public final void read(List<Futures.C34051> list, int i) {
        this.mLoanViewPager.setAdapter(new LoanDetailAdapter(getActivity(), list));
        this.mLoanViewPager.setClipToPadding(false);
        this.mLoanViewPager.setPadding(getResources().getDimensionPixelOffset(R.dimen.f75542131166023), 0, getResources().getDimensionPixelOffset(R.dimen.f75542131166023), 0);
        this.mLoanViewPager.setCurrentItem(i);
        this.mLoanDetailCircleIndicator.setViewPager(this.mLoanViewPager);
        this.mCustomBillsToPay.setVisibility(0);
        this.mLoanViewPager.addOnPageChangeListener(this);
        if (list.size() >= 10) {
            this.mLoanDetailCircleIndicator.setVisibility(8);
        } else {
            this.mLoanDetailCircleIndicator.setVisibility(0);
        }
    }

    public final void read(String str, String str2, int i) {
        this.mCustomHorizontalProgressBar.setUsedValue(str2);
        this.mCustomHorizontalProgressBar.setAvailableValue(str);
        this.mCustomHorizontalProgressBar.setProgressBar(i);
        this.mCustomHorizontalProgressBar.mTotalContainerLinearLayout.setVisibility(8);
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, String str2, int i) {
        this.linearLoanStatusOk.setVisibility(0);
        this.linearLoanStatusRestricted.setVisibility(8);
        this.mCustomBillsToPay.setIconDrawable(str2, i);
        this.mCustomBillsToPay.setCompletedText(str);
        this.mCustomBillsToPay.setPayButtonVisibility(8);
        this.mCustomBillsToPay.setAmountTitleTextVisibility(8);
        this.mCustomBillsToPay.setAmountVisibility(8);
        this.mCustomBillsToPay.setDueDateVisibility(8);
        this.mCustomBillsToPay.setCompletedTextVisibility(0);
    }

    public final void IconCompatParcelizer(Futures.C34051 r3) {
        this.mLoanAccountNameTextView.setText(r3.MediaBrowserCompat$ItemReceiver);
        this.mLoanTypeTextView.setText(r3.MediaSessionCompat$ResultReceiverWrapper);
        this.mInstallmentAmountValueTextView.setText(r3.RatingCompat);
        this.mInterestRateTextView.setText(r3.MediaBrowserCompat$SearchResultReceiver);
        this.mLoanDetailLatePaymentsTextView.setText(r3.MediaSessionCompat$QueueItem);
        this.mLoanDetailTenorTextView.setText(r3.setItemInvoker);
    }

    @OnClick
    public void respondOnClick() {
        FragmentBuilder_BindDeejungPlansFragment.read(this.mCollapsibleImageView);
        if (this.mAccountDetailCollapsibleRelativeLayout.getVisibility() != 0) {
            FragmentBuilder_BindDeejungPlansFragment.write(this.mAccountDetailCollapsibleRelativeLayout);
            FragmentBuilder_BindDeejungPlansFragment.MediaBrowserCompat$CustomActionResultReceiver(this.mLoanDetailScrollview, (int) (((float) (this.mAccountDetailCollapsibleRelativeLayout.getMeasuredHeight() << 1)) / getContext().getResources().getDisplayMetrics().density));
            return;
        }
        FragmentBuilder_BindDeejungPlansFragment.MediaBrowserCompat$CustomActionResultReceiver(this.mAccountDetailCollapsibleRelativeLayout);
    }

    public void onPageSelected(int i) {
        this.loanDetailPresenter.IconCompatParcelizer(i);
    }

    public final void MediaBrowserCompat$ItemReceiver(Futures.C34051 r6) {
        if (!TextUtils.isEmpty(r6.ParcelableVolumeInfo)) {
            ZSYR2K[] zsyr2kArr = {new ZSYR2K("loanproduct", r6.ParcelableVolumeInfo)};
            if (getActivity() != null) {
                ((BaseActivity) getActivity()).scbAnalytics.write("loan_paybutton", zsyr2kArr);
            }
        }
        LoanInputActivity.write(getContext(), r6);
    }

    public final void read(Futures.C34051 r6) {
        if (r6.MediaDescriptionCompat) {
            this.linearLoanStatusOk.setVisibility(8);
            this.linearLoanStatusRestricted.setVisibility(0);
            this.mLoandDetailRestrictedDescriptionTextView.setText(r6.f2711x50fd9e4a);
        } else {
            this.linearLoanStatusOk.setVisibility(0);
            this.linearLoanStatusRestricted.setVisibility(8);
        }
        this.mCustomBillsToPay.setDueDate(r6.setExpandedFormat);
        this.mCustomBillsToPay.setAmountTitle(getString(R.string.amount_due));
        this.mCustomBillsToPay.setAmountValue(r6.AppCompatDialogFragment);
        this.mCustomBillsToPay.setIconDrawable(r6.IconCompatParcelizer, r6.MediaMetadataCompat);
        this.mCustomBillsToPay.setPayButtonVisibility(0);
        this.mCustomBillsToPay.setOnCustomBillsToPayClickListener(new ActivityBuilder_ContributeECouponDetailActivity(this, r6));
        this.mCustomBillsToPay.setAmountTitleTextVisibility(0);
        this.mCustomBillsToPay.setAmountVisibility(0);
        this.mCustomBillsToPay.setDueDateVisibility(0);
        this.mCustomBillsToPay.setCompletedTextVisibility(8);
        this.mCustomHorizontalProgressBar.setUsedTitle(r6.Keep);
        this.mCustomHorizontalProgressBar.setAvailableTitle(r6.setPadding);
    }
}

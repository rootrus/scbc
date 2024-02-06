package com.scb.phone.view.fragment.transferandpay;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.adapter.accountsummary.ErrorPagerAdapter;
import com.scb.phone.view.adapter.accountsummary.ErrorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver;
import com.scb.phone.view.adapter.transferandpay.AccountSourceAdapter;
import com.scb.phone.view.custom.common.NoSwipeViewPager;
import com.scb.phone.view.fragment.BaseFragment;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p040o.ActivityBuilder_ContributeRiskLevelAssesmentActivity;
import p040o.ActivityBuilder_ContributesHmlBusinessOwnerLoanSetupActivity;
import p040o.BulkTransferDeepLinkActivity;
import p040o.C10845isActive;
import p040o.C4923l;
import p040o.C6322x6fc01fb5;
import p040o.CrashlyticsReport;
import p040o.CrashlyticsReportJsonTransform$$Lambda$4;
import p040o.FragmentBuilder_BindCcSofBillPaymentOnlyFragment;
import p040o.HmlPinActivity;
import p040o.access$2200;
import p040o.getICheckDeserializerRtti;
import p040o.getTopLeftCornerWidth;
import p040o.onAcceptButtonClick;
import p040o.onActivityCreated;
import p040o.onForceCaptureButtonClick;
import p040o.setChildDrawingOrderCallback;
import p040o.setInstructionMessageDisplayRect;
import p040o.setLastBaselineToBottomHeight;
import p059me.relex.circleindicator.CircleIndicator;

public class AccountSourceSelectFragment extends BaseFragment implements ViewPager.MediaMetadataCompat, getTopLeftCornerWidth.read, FragmentBuilder_BindCcSofBillPaymentOnlyFragment {
    public String IconCompatParcelizer;
    public CrashlyticsReport.FilesPayload.File MediaBrowserCompat$CustomActionResultReceiver;
    public boolean MediaBrowserCompat$MediaItem;
    public AccountSourceAdapter MediaBrowserCompat$SearchResultReceiver;
    private List<write> MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    private BulkTransferDeepLinkActivity MediaSessionCompat$Token;
    private ErrorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver RatingCompat = ErrorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver.NORMAL_ERROR;
    @HmlPinActivity
    public onAcceptButtonClick accountSourcePresenter;
    @BindView
    View bottomDivider;
    @BindView
    Group groupHappyCashSuccess;
    @BindView
    LinearLayout llHappyCashError;
    @BindView
    CircleIndicator mCircleIndicator;
    @BindView
    TextView mFromTextView;
    @BindView
    LinearLayout mLlHappyCash;
    @BindView
    ProgressBar mPbHappyCash;
    @BindView
    TextView mTextDisclaimer;
    @BindView
    TextView mToTextView;
    @BindView
    TextView mTvHappyCashAvailable;
    @BindView
    TextView mTvHappyCashLimit;
    @BindView
    TextView mTvHappyCashLimitValue;
    @BindView
    TextView mTvHappyCashUsed;
    @BindView
    public NoSwipeViewPager mViewPager;

    public interface write {
        void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReport.FilesPayload.File.Builder builder);

        void MediaSessionCompat$ResultReceiverWrapper();

        /* renamed from: c_ */
        void mo13978c_(boolean z);
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public static AccountSourceSelectFragment read(CrashlyticsReport.FilesPayload.File file) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("AccountSourceDisplayExtra", file);
        AccountSourceSelectFragment accountSourceSelectFragment = new AccountSourceSelectFragment();
        accountSourceSelectFragment.setArguments(bundle);
        return accountSourceSelectFragment;
    }

    public static AccountSourceSelectFragment MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReport.FilesPayload.File file, String str, ErrorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver errorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("AccountSourceDisplayExtra", file);
        bundle.putString("com.scb.phone.EXTRA_ACCOUNT_SELECTED", str);
        bundle.putSerializable("EXTRA_ACCOUNT_ERROR", errorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver);
        AccountSourceSelectFragment accountSourceSelectFragment = new AccountSourceSelectFragment();
        accountSourceSelectFragment.setArguments(bundle);
        return accountSourceSelectFragment;
    }

    public static AccountSourceSelectFragment write(CrashlyticsReport.FilesPayload.File file, ErrorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver errorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("AccountSourceDisplayExtra", file);
        bundle.putSerializable("EXTRA_ACCOUNT_ERROR", errorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver);
        AccountSourceSelectFragment accountSourceSelectFragment = new AccountSourceSelectFragment();
        accountSourceSelectFragment.setArguments(bundle);
        return accountSourceSelectFragment;
    }

    public static AccountSourceSelectFragment IconCompatParcelizer(CrashlyticsReport.FilesPayload.File file, String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("AccountSourceDisplayExtra", file);
        bundle.putString("com.scb.phone.EXTRA_ACCOUNT_SELECTED", str);
        AccountSourceSelectFragment accountSourceSelectFragment = new AccountSourceSelectFragment();
        accountSourceSelectFragment.setArguments(bundle);
        return accountSourceSelectFragment;
    }

    public static AccountSourceSelectFragment MediaBrowserCompat$ItemReceiver(CrashlyticsReport.FilesPayload.File file, String str, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("AccountSourceDisplayExtra", file);
        bundle.putString("com.scb.phone.EXTRA_ACCOUNT_SELECTED", str);
        bundle.putBoolean("com.scb.phone.FAVOURITE", z);
        AccountSourceSelectFragment accountSourceSelectFragment = new AccountSourceSelectFragment();
        accountSourceSelectFragment.setArguments(bundle);
        return accountSourceSelectFragment;
    }

    public static AccountSourceSelectFragment MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReport.FilesPayload.File file, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("AccountSourceDisplayExtra", file);
        bundle.putBoolean("EXTRA_ACCOUNT_SPEEDY_CASH", z);
        AccountSourceSelectFragment accountSourceSelectFragment = new AccountSourceSelectFragment();
        accountSourceSelectFragment.setArguments(bundle);
        return accountSourceSelectFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f85472131493774, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.accountSourcePresenter.MediaBrowserCompat$ItemReceiver(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = (CrashlyticsReport.FilesPayload.File) arguments.getParcelable("AccountSourceDisplayExtra");
            this.IconCompatParcelizer = arguments.getString("com.scb.phone.EXTRA_ACCOUNT_SELECTED");
            this.MediaBrowserCompat$MediaItem = arguments.getBoolean("com.scb.phone.FAVOURITE", false);
            this.MediaMetadataCompat = arguments.getBoolean("EXTRA_ACCOUNT_SPEEDY_CASH", false);
            if (arguments.getSerializable("EXTRA_ACCOUNT_ERROR") != null) {
                this.RatingCompat = (ErrorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver) arguments.getSerializable("EXTRA_ACCOUNT_ERROR");
            }
        }
        this.mViewPager.addOnPageChangeListener(this);
        this.MediaSessionCompat$Token = setChildDrawingOrderCallback.IconCompatParcelizer(getContext(), new IntentFilter("com.scb.phone/BROADCAST_REFRESH_SOURCE_ACCOUNTS")).subscribe(new C6322x6fc01fb5(this), ActivityBuilder_ContributesHmlBusinessOwnerLoanSetupActivity.write);
        this.accountSourcePresenter.read(this.MediaBrowserCompat$CustomActionResultReceiver, this.IconCompatParcelizer, this.MediaBrowserCompat$MediaItem, this.MediaMetadataCompat);
        return inflate;
    }

    public final void IconCompatParcelizer(CrashlyticsReport.Session.Application.Organization organization) {
        this.mLlHappyCash.setVisibility(0);
        this.llHappyCashError.setVisibility(8);
        TextView textView = this.mTvHappyCashUsed;
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
        currencyInstance.setMinimumFractionDigits(2);
        currencyInstance.setMaximumFractionDigits(2);
        textView.setText(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(currencyInstance).format(organization.write));
        TextView textView2 = this.mTvHappyCashAvailable;
        NumberFormat currencyInstance2 = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
        currencyInstance2.setMinimumFractionDigits(2);
        currencyInstance2.setMaximumFractionDigits(2);
        textView2.setText(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(currencyInstance2).format(organization.read));
        TextView textView3 = this.mTvHappyCashLimitValue;
        NumberFormat currencyInstance3 = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
        currencyInstance3.setMinimumFractionDigits(2);
        currencyInstance3.setMaximumFractionDigits(2);
        textView3.setText(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(currencyInstance3).format(organization.MediaBrowserCompat$CustomActionResultReceiver));
        this.mTvHappyCashLimit.setText(String.valueOf(organization.IconCompatParcelizer));
        this.mPbHappyCash.setMax((int) organization.read);
        this.mPbHappyCash.setProgress((int) organization.write);
    }

    public final void IconCompatParcelizer() {
        this.mLlHappyCash.setVisibility(8);
        this.llHappyCashError.setVisibility(8);
    }

    public final void write() {
        this.mLlHappyCash.setVisibility(0);
        this.groupHappyCashSuccess.setVisibility(4);
        this.llHappyCashError.setVisibility(0);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        ArrayList arrayList = new ArrayList();
        this.MediaDescriptionCompat = arrayList;
        if (context instanceof write) {
            arrayList.add((write) context);
        }
        if (getParentFragment() instanceof write) {
            this.MediaDescriptionCompat.add((write) getParentFragment());
        }
    }

    public void onDetach() {
        super.onDetach();
        this.MediaDescriptionCompat.clear();
        this.MediaDescriptionCompat = null;
    }

    public final void read(String str) {
        AccountSourceAdapter accountSourceAdapter = this.MediaBrowserCompat$SearchResultReceiver;
        if (accountSourceAdapter != null) {
            int read = accountSourceAdapter.read(str);
            NoSwipeViewPager noSwipeViewPager = this.mViewPager;
            if (read == -1) {
                read = 0;
            }
            noSwipeViewPager.setCurrentItem(read);
        }
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        onAcceptButtonClick onacceptbuttonclick = this.accountSourcePresenter;
        C10845isActive isactive = new C10845isActive(onacceptbuttonclick, (String) null);
        if (onacceptbuttonclick.RatingCompat != null) {
            isactive.IconCompatParcelizer(onacceptbuttonclick.RatingCompat);
        }
    }

    public final void IconCompatParcelizer(String str) {
        onAcceptButtonClick onacceptbuttonclick = this.accountSourcePresenter;
        C10845isActive isactive = new C10845isActive(onacceptbuttonclick, str);
        if (onacceptbuttonclick.RatingCompat != null) {
            isactive.IconCompatParcelizer(onacceptbuttonclick.RatingCompat);
        }
    }

    public void onDestroy() {
        this.accountSourcePresenter.onDestroy();
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.MediaSessionCompat$Token;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            this.MediaSessionCompat$Token.dispose();
        }
        super.onDestroy();
    }

    public final void write(List<CrashlyticsReport.FilesPayload.File.Builder> list, int i) {
        AccountSourceAdapter accountSourceAdapter = new AccountSourceAdapter(getContext(), list, this);
        this.MediaBrowserCompat$SearchResultReceiver = accountSourceAdapter;
        CrashlyticsReport.FilesPayload.File file = this.MediaBrowserCompat$CustomActionResultReceiver;
        accountSourceAdapter.write = file != null && file.MediaBrowserCompat$CustomActionResultReceiver == CrashlyticsReportJsonTransform$$Lambda$4.CARDLESS_ATM_FUNCTION;
        this.mViewPager.setAdapter(this.MediaBrowserCompat$SearchResultReceiver);
        this.mViewPager.setClipToPadding(false);
        this.mViewPager.setVisibility(0);
        this.mCircleIndicator.setVisibility(0);
        if (list.size() == 1) {
            this.mViewPager.setPadding(getResources().getDimensionPixelOffset(R.dimen.f75532131166022), 0, 0, 0);
        } else {
            this.mViewPager.setPadding(getResources().getDimensionPixelOffset(R.dimen.f75522131166021), 0, getResources().getDimensionPixelOffset(R.dimen.f75512131166020), 0);
        }
        this.mCircleIndicator.setViewPager(this.mViewPager);
        this.mViewPager.setCurrentItem(i);
        AccountSourceAdapter accountSourceAdapter2 = this.MediaBrowserCompat$SearchResultReceiver;
        write(accountSourceAdapter2 != null ? accountSourceAdapter2.MediaBrowserCompat$CustomActionResultReceiver(this.mViewPager.getCurrentItem()) : null);
        write(true);
        if (list.size() >= 10) {
            this.mCircleIndicator.setVisibility(8);
        } else {
            this.mCircleIndicator.setVisibility(0);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        int i2;
        access$2200 access_2200 = new access$2200();
        int i3 = R.string.prepaid_card_request_account_error_description;
        if (i == 1) {
            i2 = R.string.debit_card_request_account_error_title;
            i3 = R.string.debit_card_request_account_error_description;
        } else if (i == 2) {
            i2 = R.string.prepaid_card_request_account_error_title;
        } else if (i == 4) {
            i2 = R.string.nsip_eligible_account_error_title;
            i3 = R.string.nsip_eligible_account_error_description;
        } else if (i != 5) {
            i2 = R.string.not_eligible_account_error_title;
            i3 = R.string.not_eligible_account_error_description;
        } else {
            i2 = R.string.prepaid_card_request_account_error_title_topup;
        }
        access_2200.MediaBrowserCompat$ItemReceiver = getString(i2);
        access_2200.IconCompatParcelizer = getString(i3);
        read(access_2200, true, (View.OnClickListener) null);
        write(false);
        this.mCircleIndicator.setVisibility(8);
    }

    public final void read() {
        this.mViewPager.setAdapter((onActivityCreated) null);
        this.MediaBrowserCompat$SearchResultReceiver = null;
        this.mViewPager.setVisibility(4);
        this.mCircleIndicator.setVisibility(4);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.mViewPager.setVisibility(0);
        this.mCircleIndicator.setVisibility(0);
    }

    public final void read(String str, int i) {
        if (this.mViewPager.getAdapter() instanceof AccountSourceAdapter) {
            CrashlyticsReport.FilesPayload.File.Builder MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(this.mViewPager.getCurrentItem());
            AccountSourceAdapter accountSourceAdapter = this.MediaBrowserCompat$SearchResultReceiver;
            accountSourceAdapter.IconCompatParcelizer = str;
            accountSourceAdapter.notifyDataSetChanged();
            if (this.MediaBrowserCompat$SearchResultReceiver.getCount() > 0) {
                this.mCircleIndicator.setViewPager(this.mViewPager);
                this.mViewPager.setCurrentItem(this.MediaBrowserCompat$SearchResultReceiver.read(MediaBrowserCompat$CustomActionResultReceiver2.MediaSessionCompat$Token), false);
                return;
            }
            MediaBrowserCompat$CustomActionResultReceiver(i);
        }
    }

    private void write(boolean z) {
        for (write c_ : this.MediaDescriptionCompat) {
            c_.mo13978c_(z);
        }
    }

    public void onPageSelected(int i) {
        MediaBrowserCompat$ItemReceiver(i);
    }

    public final void ax_() {
        int i;
        CrashlyticsReport.FilesPayload.File file = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (file != null) {
            i = file.IconCompatParcelizer;
        } else {
            i = 0;
        }
        if (i == 3) {
            access$2200 access_2200 = new access$2200();
            access_2200.MediaBrowserCompat$ItemReceiver = getString(R.string.banking_select_agent_error_title);
            access_2200.IconCompatParcelizer = getString(R.string.banking_select_agent_error_description);
            read(access_2200, false, new ActivityBuilder_ContributeRiskLevelAssesmentActivity(this));
        } else {
            read((access$2200) null, true, (View.OnClickListener) null);
        }
        write(false);
        List<write> list = this.MediaDescriptionCompat;
        if (list != null) {
            for (write MediaSessionCompat$ResultReceiverWrapper : list) {
                MediaSessionCompat$ResultReceiverWrapper.MediaSessionCompat$ResultReceiverWrapper();
            }
        }
    }

    private void read(access$2200 access_2200, boolean z, View.OnClickListener onClickListener) {
        this.mViewPager.setAdapter(new ErrorPagerAdapter(getContext(), access_2200, this.RatingCompat, onClickListener));
        this.mViewPager.setClipToPadding(false);
        this.mViewPager.setPadding(getResources().getDimensionPixelOffset(R.dimen.f75542131166023), 0, getResources().getDimensionPixelOffset(R.dimen.f75542131166023), 0);
        if (z) {
            this.mCircleIndicator.setVisibility(0);
            this.mCircleIndicator.setViewPager(this.mViewPager);
            return;
        }
        this.mCircleIndicator.setVisibility(8);
    }

    public final void read(int i) {
        this.mViewPager.setCurrentItem(i, true);
        MediaBrowserCompat$ItemReceiver(i);
    }

    private void write(CrashlyticsReport.FilesPayload.File.Builder builder) {
        onAcceptButtonClick onacceptbuttonclick = this.accountSourcePresenter;
        boolean z = true;
        if (!onacceptbuttonclick.read || builder.MediaSessionCompat$QueueItem == null || builder.MediaSessionCompat$QueueItem.isEmpty()) {
            onForceCaptureButtonClick onforcecapturebuttonclick = onForceCaptureButtonClick.MediaBrowserCompat$ItemReceiver;
            if (onacceptbuttonclick.RatingCompat != null) {
                onforcecapturebuttonclick.IconCompatParcelizer(onacceptbuttonclick.RatingCompat);
            }
        } else {
            CrashlyticsReport.Session.Application.Organization organization = builder.MediaBrowserCompat$MediaItem;
            if (organization == null || organization.MediaBrowserCompat$SearchResultReceiver == null || !organization.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.equals("1000")) {
                setInstructionMessageDisplayRect setinstructionmessagedisplayrect = setInstructionMessageDisplayRect.write;
                if (onacceptbuttonclick.RatingCompat != null) {
                    setinstructionmessagedisplayrect.IconCompatParcelizer(onacceptbuttonclick.RatingCompat);
                }
            } else {
                C4923l.C4924a aVar = new C4923l.C4924a(builder.MediaBrowserCompat$MediaItem);
                if (onacceptbuttonclick.RatingCompat != null) {
                    aVar.IconCompatParcelizer(onacceptbuttonclick.RatingCompat);
                }
            }
        }
        for (write MediaBrowserCompat$CustomActionResultReceiver2 : this.MediaDescriptionCompat) {
            MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver(builder);
        }
        CrashlyticsReport.FilesPayload.File file = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (file != null && file.MediaBrowserCompat$CustomActionResultReceiver.showDisclaimerValue.booleanValue()) {
            if (builder != null) {
                String str = builder.MediaBrowserCompat$SearchResultReceiver;
                if (!(str == null || str.length() == 0)) {
                    z = false;
                }
                if (!z) {
                    this.mTextDisclaimer.setVisibility(0);
                    this.mTextDisclaimer.setText(builder.MediaBrowserCompat$SearchResultReceiver);
                    return;
                }
            }
            this.mTextDisclaimer.setVisibility(8);
        }
    }

    private void MediaBrowserCompat$ItemReceiver(int i) {
        int[] iArr = {i - 1, i, i + 1};
        if (i == 0) {
            AccountSourceAdapter accountSourceAdapter = this.MediaBrowserCompat$SearchResultReceiver;
            this.mViewPager.setPadding(getResources().getDimensionPixelOffset(R.dimen.f75532131166022), 0, (accountSourceAdapter == null || accountSourceAdapter.getCount() == 1) ? 0 : getResources().getDimensionPixelOffset(R.dimen.f75512131166020), 0);
        } else {
            AccountSourceAdapter accountSourceAdapter2 = this.MediaBrowserCompat$SearchResultReceiver;
            if (accountSourceAdapter2 == null || i != accountSourceAdapter2.getCount() - 1) {
                this.mViewPager.setPadding(getResources().getDimensionPixelOffset(R.dimen.f75502131166019), 0, getResources().getDimensionPixelOffset(R.dimen.f75502131166019), 0);
            } else {
                this.mViewPager.setPadding(getResources().getDimensionPixelOffset(R.dimen.f75512131166020), 0, getResources().getDimensionPixelOffset(R.dimen.f75522131166021), 0);
            }
        }
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArr[i2];
            NoSwipeViewPager noSwipeViewPager = this.mViewPager;
            if (noSwipeViewPager != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("TAG_ACCOUNT_SOURCE_ADAPTER");
                sb.append(i3);
                View findViewWithTag = noSwipeViewPager.findViewWithTag(sb.toString());
                NoSwipeViewPager noSwipeViewPager2 = this.mViewPager;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("TAG_ACCOUNT_SOURCE_ADAPTER_TEXT");
                sb2.append(i3);
                TextView textView = (TextView) noSwipeViewPager2.findViewWithTag(sb2.toString());
                if (!(findViewWithTag == null || textView == null)) {
                    if (i == i3) {
                        findViewWithTag.setBackground(setLastBaselineToBottomHeight.write(getContext(), R.drawable.rounded_purple_view_pager));
                        textView.setTextColor(setLastBaselineToBottomHeight.read(getContext(), R.color.f66092131099764));
                    } else {
                        Context context = getContext();
                        CrashlyticsReport.FilesPayload.File file = this.MediaBrowserCompat$CustomActionResultReceiver;
                        findViewWithTag.setBackground(setLastBaselineToBottomHeight.write(context, file != null && file.MediaBrowserCompat$CustomActionResultReceiver == CrashlyticsReportJsonTransform$$Lambda$4.CARDLESS_ATM_FUNCTION ? R.drawable.bg_white_rounded_with_border : R.drawable.bg_white_rounded));
                        textView.setTextColor(setLastBaselineToBottomHeight.read(getContext(), R.color.f66182131099773));
                    }
                }
            }
        }
        AccountSourceAdapter accountSourceAdapter3 = this.MediaBrowserCompat$SearchResultReceiver;
        write(accountSourceAdapter3 != null ? accountSourceAdapter3.MediaBrowserCompat$CustomActionResultReceiver(this.mViewPager.getCurrentItem()) : null);
        AccountSourceAdapter accountSourceAdapter4 = this.MediaBrowserCompat$SearchResultReceiver;
        if (accountSourceAdapter4 != null) {
            accountSourceAdapter4.MediaBrowserCompat$ItemReceiver = i;
        }
    }

    public final void IconCompatParcelizer(CrashlyticsReport.FilesPayload.File file) {
        if (!file.MediaBrowserCompat$ItemReceiver) {
            this.bottomDivider.setVisibility(8);
        }
        if (!file.MediaMetadataCompat) {
            this.mToTextView.setVisibility(8);
        } else {
            this.mToTextView.setVisibility(0);
        }
        if (!TextUtils.isEmpty(file.RatingCompat)) {
            this.mToTextView.setText(file.RatingCompat);
        }
        if (!file.MediaDescriptionCompat) {
            this.mFromTextView.setVisibility(8);
        }
        if (!TextUtils.isEmpty(file.write)) {
            this.mFromTextView.setText(file.write);
        }
    }
}

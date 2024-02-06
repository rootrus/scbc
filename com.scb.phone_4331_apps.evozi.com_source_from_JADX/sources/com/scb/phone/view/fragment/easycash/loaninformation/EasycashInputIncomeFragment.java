package com.scb.phone.view.fragment.easycash.loaninformation;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.material.textfield.TextInputLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.easycash.EasycashActivity;
import com.scb.phone.view.activity.easycash.EasycashCarInformationActivity;
import com.scb.phone.view.activity.easycash.EasycashCollateralInformationActivity;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.easycash.CustomEasyCashSectionLabel;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.C1160x44733d2;
import p040o.CrashlyticsReportJsonTransform$$Lambda$7;
import p040o.DeepLinkModule_CardlessDeeplinkActivity;
import p040o.DeepLinkModule_ContributeActivateChequeDeepLinkActivity;
import p040o.HmlPinActivity;
import p040o.ZSYR2K;
import p040o.forEachClear;
import p040o.getImageDPI;
import p040o.getImageFileRep;
import p040o.getImageJpegQuality;
import p040o.getImageLongitude;
import p040o.getImageMimeType;
import p040o.isRooted;
import p040o.setImageID;
import p040o.setImageID$MediaBrowserCompat$CustomActionResultReceiver;

public class EasycashInputIncomeFragment extends BaseFragment implements C1160x44733d2.IconCompatParcelizer {
    private C1160x44733d2 IconCompatParcelizer;
    private AmountEditText.read MediaBrowserCompat$CustomActionResultReceiver = new AmountEditText.read() {
        public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver() {
            EasycashInputIncomeFragment.this.inputIncomePresenter.MediaBrowserCompat$ItemReceiver(EasycashInputIncomeFragment.this.amountEditText.getText().toString(), EasycashInputIncomeFragment.this.repaymentEditText.getText().toString());
            AmountEditText amountEditText = EasycashInputIncomeFragment.this.amountEditText;
            if (amountEditText != null) {
                ((InputMethodManager) amountEditText.getContext().getSystemService("input_method")).hideSoftInputFromWindow(amountEditText.getWindowToken(), 0);
            }
        }
    };
    private AmountEditText.write MediaBrowserCompat$MediaItem = new DeepLinkModule_CardlessDeeplinkActivity(this);
    private AmountEditText.write MediaBrowserCompat$SearchResultReceiver = new DeepLinkModule_ContributeActivateChequeDeepLinkActivity(this);
    private AmountEditText.read RatingCompat = new AmountEditText.read() {
        public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver() {
            EasycashInputIncomeFragment.this.inputIncomePresenter.MediaBrowserCompat$ItemReceiver(EasycashInputIncomeFragment.this.amountEditText.getText().toString(), EasycashInputIncomeFragment.this.repaymentEditText.getText().toString());
            AmountEditText amountEditText = EasycashInputIncomeFragment.this.amountEditText;
            if (amountEditText != null) {
                ((InputMethodManager) amountEditText.getContext().getSystemService("input_method")).hideSoftInputFromWindow(amountEditText.getWindowToken(), 0);
            }
        }
    };
    @BindView
    protected AmountEditText amountEditText;
    @BindView
    protected TextInputLayout amountInputLayout;
    @BindView
    protected Button buttonCalculate;
    @HmlPinActivity
    public setImageID inputIncomePresenter;
    @BindView
    protected AmountEditText repaymentEditText;
    @BindView
    protected CustomEasyCashSectionLabel repaymentHeaderLayout;
    @BindView
    protected TextInputLayout repaymentInputLayout;
    @HmlPinActivity
    public forEachClear tracker;
    @BindView
    protected TextView tvDisclaimer;

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof C1160x44733d2) {
            this.IconCompatParcelizer = (C1160x44733d2) context;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f87002131493927, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.inputIncomePresenter.MediaBrowserCompat$ItemReceiver(this);
        setImageID setimageid = this.inputIncomePresenter;
        String MediaBrowserCompat$CustomActionResultReceiver2 = this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
        if (setimageid.RatingCompat != null) {
            setimageid.RatingCompat.AlertController$RecycleListView();
        }
        setimageid.read.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver2);
        setimageid.read.IconCompatParcelizer(new setImageID.read(setimageid, (byte) 0));
        if ("PURPOSEFUL_LOAN".equals(MediaBrowserCompat$CustomActionResultReceiver2) || "MHMC".equals(MediaBrowserCompat$CustomActionResultReceiver2) || "MCMC".equals(MediaBrowserCompat$CustomActionResultReceiver2)) {
            getImageLongitude getimagelongitude = getImageLongitude.IconCompatParcelizer;
            if (setimageid.RatingCompat != null) {
                z = true;
            }
            if (z) {
                getimagelongitude.IconCompatParcelizer(setimageid.RatingCompat);
            }
        }
        this.amountEditText.setOnAmountChangeListener(this.MediaBrowserCompat$CustomActionResultReceiver);
        this.amountEditText.setOnHandleDismissKeyboardListener(this.MediaBrowserCompat$MediaItem);
        this.repaymentEditText.setOnAmountChangeListener(this.RatingCompat);
        this.repaymentEditText.setOnHandleDismissKeyboardListener(this.MediaBrowserCompat$SearchResultReceiver);
        super.setTransitioning();
        ParcelableVolumeInfo(this.IconCompatParcelizer.MediaMetadataCompat());
        setActionBarVisibilityCallback();
        return inflate;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.tvDisclaimer.setVisibility(8);
    }

    public final void read() {
        this.buttonCalculate.setText(R.string.next);
    }

    public final void MediaBrowserCompat$SearchResultReceiver(String str) {
        this.amountEditText.setText(str);
    }

    public final void MediaBrowserCompat$MediaItem(String str) {
        this.repaymentHeaderLayout.setVisibility(0);
        this.repaymentInputLayout.setVisibility(0);
        this.repaymentEditText.setText(str);
    }

    public final /* synthetic */ void write() {
        this.inputIncomePresenter.MediaBrowserCompat$ItemReceiver(this.amountEditText.getText().toString(), this.repaymentEditText.getText().toString());
    }

    public final /* synthetic */ void MediaBrowserCompat$SearchResultReceiver() {
        this.inputIncomePresenter.MediaBrowserCompat$ItemReceiver(this.amountEditText.getText().toString(), this.repaymentEditText.getText().toString());
    }

    public final void setTransitioning() {
        super.setTransitioning();
        ParcelableVolumeInfo(this.IconCompatParcelizer.MediaMetadataCompat());
        setActionBarVisibilityCallback();
    }

    public final void IconCompatParcelizer(boolean z) {
        this.buttonCalculate.setEnabled(z);
    }

    public final void read(int i) {
        this.amountInputLayout.setError(getString(i));
    }

    public final void IconCompatParcelizer() {
        this.amountInputLayout.setError((CharSequence) null);
    }

    public final void IconCompatParcelizer(int i) {
        this.repaymentInputLayout.setError(getString(i));
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.repaymentInputLayout.setError((CharSequence) null);
    }

    public final void read(String str) {
        EasycashCarInformationActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext(), str, this.IconCompatParcelizer.write());
    }

    @OnClick
    public void onDoneButtonClick() {
        this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("customer_type", this.IconCompatParcelizer.read()));
        this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("monthly_income", this.amountEditText.getText().toString()));
        forEachClear foreachclear = this.tracker;
        if (getActivity() != null) {
            foreachclear.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "apply_loan_calculator");
        }
        setImageID setimageid = this.inputIncomePresenter;
        CrashlyticsReportJsonTransform$$Lambda$7 crashlyticsReportJsonTransform$$Lambda$7 = new CrashlyticsReportJsonTransform$$Lambda$7(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(), this.IconCompatParcelizer.IconCompatParcelizer(), this.IconCompatParcelizer.read(), this.amountEditText.getText().toString(), this.repaymentEditText.getText().toString());
        boolean equals = "MHMC".equals(crashlyticsReportJsonTransform$$Lambda$7.MediaBrowserCompat$CustomActionResultReceiver);
        boolean z = true;
        if (equals && "MORTGAGE".equals(crashlyticsReportJsonTransform$$Lambda$7.IconCompatParcelizer)) {
            try {
                getImageJpegQuality getimagejpegquality = new getImageJpegQuality(setimageid, crashlyticsReportJsonTransform$$Lambda$7);
                if (setimageid.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    getimagejpegquality.IconCompatParcelizer(setimageid.RatingCompat);
                }
            } catch (Exception unused) {
            }
        } else if ("PURPOSEFUL_LOAN".equals(crashlyticsReportJsonTransform$$Lambda$7.MediaBrowserCompat$CustomActionResultReceiver) && "REFERRAL".equals(crashlyticsReportJsonTransform$$Lambda$7.IconCompatParcelizer)) {
            String str = crashlyticsReportJsonTransform$$Lambda$7.MediaBrowserCompat$CustomActionResultReceiver;
            String replaceAll = crashlyticsReportJsonTransform$$Lambda$7.read.replaceAll(",", "");
            if (setimageid.RatingCompat == null) {
                z = false;
            }
            if (z) {
                setimageid.RatingCompat.AlertController$RecycleListView();
            }
            setimageid.write.read(str, replaceAll);
            setimageid.write.IconCompatParcelizer(new setImageID$MediaBrowserCompat$CustomActionResultReceiver(setimageid, (byte) 0));
        } else if ("CARDS".equals(crashlyticsReportJsonTransform$$Lambda$7.MediaBrowserCompat$ItemReceiver)) {
            getImageDPI getimagedpi = new getImageDPI(setimageid, crashlyticsReportJsonTransform$$Lambda$7);
            if (setimageid.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getimagedpi.IconCompatParcelizer(setimageid.RatingCompat);
            }
        } else if ("LOANS".equals(crashlyticsReportJsonTransform$$Lambda$7.MediaBrowserCompat$ItemReceiver)) {
            getImageFileRep getimagefilerep = new getImageFileRep(setimageid, crashlyticsReportJsonTransform$$Lambda$7);
            if (setimageid.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getimagefilerep.IconCompatParcelizer(setimageid.RatingCompat);
            }
        } else if ("CAR".equals(crashlyticsReportJsonTransform$$Lambda$7.MediaBrowserCompat$ItemReceiver) && "REFERRAL".equals(crashlyticsReportJsonTransform$$Lambda$7.IconCompatParcelizer)) {
            getImageMimeType getimagemimetype = new getImageMimeType(setimageid, crashlyticsReportJsonTransform$$Lambda$7);
            if (setimageid.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getimagemimetype.IconCompatParcelizer(setimageid.RatingCompat);
            }
        }
    }

    public final void read(isRooted isrooted) {
        EasycashActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext(), isrooted, this.IconCompatParcelizer.write());
    }

    public final void write(String str) {
        EasycashActivity.IconCompatParcelizer(getContext(), this.IconCompatParcelizer.write(), "LOANS", str);
    }

    public final void IconCompatParcelizer(String str) {
        EasycashActivity.IconCompatParcelizer(getContext(), this.IconCompatParcelizer.write(), "CARDS", str);
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, String str2) {
        EasycashCollateralInformationActivity.write(getContext(), this.IconCompatParcelizer.write(), this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(), str, str2);
    }

    public void onDestroy() {
        this.tracker = null;
        super.onDestroy();
    }
}

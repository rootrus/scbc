package com.scb.phone.view.fragment.easycash.loaninformation;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.easycash.EasycashLandingActivity;
import com.scb.phone.view.custom.easycash.CustomAccountSelector;
import com.scb.phone.view.custom.easycash.CustomEasyCashSectionLabel;
import com.scb.phone.view.fragment.easycash.financialinformation.EasycashOccupationInfoFragment;
import com.scb.phone.view.fragment.etb.BreadcrumbFragment;
import java.util.List;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.CommonUtils;
import p040o.CrashlyticsReport;
import p040o.DeepLinkModule_BillerDeepLinkActivity;
import p040o.DeepLinkModule_ContributeASDLAccountSummaryDeepLinkActivity;
import p040o.DeepLinkModule_ContributeBankingAgentDeepLinkActivity;
import p040o.HmlPinActivity;
import p040o.IOrientationGuidanceCalculator;
import p040o.ZSYR2K;
import p040o.drainRecencyQueue;
import p040o.drainRecencyQueue$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.enqueueCleanup;
import p040o.enqueueCleanup$MediaBrowserCompat$ItemReceiver;
import p040o.forEachClear;
import p040o.getGrayscaleImageData;
import p040o.getImagePerfectProfileUsed;
import p040o.getNextTransition;
import p040o.isEmulator;
import p040o.isSupportFragmentClass;
import p040o.removeIfFromRandomAccessList;
import p040o.setImageFileRepresentation;
import p040o.show;

public class EasycashLoanFeaturesAccountFragment extends BreadcrumbFragment implements CheckExtractActivity_MembersInjector.AppCompatDialogFragment {
    public String IconCompatParcelizer = "";
    public CrashlyticsReport.FilesPayload.File.Builder MediaBrowserCompat$CustomActionResultReceiver;
    private IOrientationGuidanceCalculator RatingCompat;
    @BindView
    public CustomAccountSelector accountRepaySelector;
    @BindView
    CustomAccountSelector accountSelector;
    @BindView
    Button btnAction;
    @BindView
    LinearLayout layoutRepayAccount;
    @HmlPinActivity
    public setImageFileRepresentation presenter;
    @BindView
    RadioButton radioButtonCash;
    @BindView
    RadioButton radioButtonDirectDebit;
    @BindView
    RadioGroup radioGroupRepayOption;
    @BindView
    CustomEasyCashSectionLabel receivingAccountLabel;
    @BindView
    CustomEasyCashSectionLabel repayAccountLabel;
    @BindView
    TextView textViewDisclaimer;
    @HmlPinActivity
    public forEachClear tracker;

    public final int ParcelableVolumeInfo() {
        return 0;
    }

    public final boolean setHasDecor() {
        return true;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f87052131493932, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        IOrientationGuidanceCalculator iOrientationGuidanceCalculator = this.RatingCompat;
        if (iOrientationGuidanceCalculator != null) {
            String MediaMetadataCompat = iOrientationGuidanceCalculator.MediaMetadataCompat();
            char c = 65535;
            int hashCode = MediaMetadataCompat.hashCode();
            if (hashCode != -348127329) {
                if (hashCode == 2223327 && MediaMetadataCompat.equals("HOME")) {
                    c = 1;
                }
            } else if (MediaMetadataCompat.equals("PURPOSEFUL")) {
                c = 0;
            }
            if (c == 0) {
                this.presenter.MediaBrowserCompat$ItemReceiver(this.RatingCompat.MediaBrowserCompat$MediaItem(), this.RatingCompat.MediaBrowserCompat$ItemReceiver());
            } else if (c == 1 && "HOME_TOP_UP".equals(this.RatingCompat.MediaBrowserCompat$SearchResultReceiver())) {
                this.presenter.MediaBrowserCompat$ItemReceiver(this.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver(), this.RatingCompat.MediaBrowserCompat$ItemReceiver());
            }
        }
        this.accountRepaySelector.setBackgroundDrawable(R.drawable.bg_white_rounded_with_border);
        this.radioGroupRepayOption.setOnCheckedChangeListener(new DeepLinkModule_BillerDeepLinkActivity(this));
    }

    public final void IconCompatParcelizer(List<CrashlyticsReport.FilesPayload.File.Builder> list) {
        this.MediaBrowserCompat$CustomActionResultReceiver = list.get(0);
        this.accountSelector.IconCompatParcelizer(list, new DeepLinkModule_ContributeASDLAccountSummaryDeepLinkActivity(this, list));
    }

    public final void MediaBrowserCompat$ItemReceiver(List<CrashlyticsReport.FilesPayload.File.Builder> list) {
        if (!list.isEmpty()) {
            this.IconCompatParcelizer = list.get(0).f2695x50fd9e4a;
            this.accountRepaySelector.IconCompatParcelizer(list, new DeepLinkModule_ContributeBankingAgentDeepLinkActivity(this, list));
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        if (z) {
            this.radioButtonDirectDebit.setChecked(true);
            this.radioButtonDirectDebit.setEnabled(true);
            this.radioButtonCash.setChecked(false);
            return;
        }
        this.radioButtonDirectDebit.setChecked(false);
        this.radioButtonDirectDebit.setEnabled(false);
        this.radioButtonCash.setChecked(true);
    }

    public final void read(boolean z) {
        this.btnAction.setEnabled(z);
    }

    public final void IconCompatParcelizer(boolean z) {
        this.accountRepaySelector.setVisibility(z ? 0 : 8);
    }

    public final void read() {
        this.MediaMetadataCompat.IconCompatParcelizer(this, new EasycashOccupationInfoFragment());
    }

    public final void MediaBrowserCompat$ItemReceiver(int i) {
        this.accountSelector.setSelectedAccount(i);
    }

    public final void read(int i) {
        this.accountRepaySelector.setSelectedAccount(i);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        if (z) {
            this.radioButtonDirectDebit.setChecked(true);
            this.accountRepaySelector.setVisibility(0);
            return;
        }
        this.IconCompatParcelizer = "";
        this.radioButtonCash.setChecked(true);
        this.accountRepaySelector.setVisibility(8);
    }

    public final void read(String str) {
        IOrientationGuidanceCalculator iOrientationGuidanceCalculator = this.RatingCompat;
        if (iOrientationGuidanceCalculator != null) {
            iOrientationGuidanceCalculator.IconCompatParcelizer(str);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        EasycashLandingActivity.MediaBrowserCompat$CustomActionResultReceiver(getActivity());
    }

    public final String PlaybackStateCompat() {
        return getString(R.string.loan_info_title);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof IOrientationGuidanceCalculator) {
            this.RatingCompat = (IOrientationGuidanceCalculator) context;
        }
    }

    private String MediaBrowserCompat$ItemReceiver() {
        if (!"COMMERCIAL".equals(this.RatingCompat.MediaMetadataCompat()) && !this.radioButtonDirectDebit.isChecked()) {
            return "CASH";
        }
        return "DIRECT_DEBIT";
    }

    public void onDestroyView() {
        this.tracker = null;
        this.RatingCompat = null;
        this.presenter.onDestroy();
        super.onDestroyView();
    }

    @OnClick
    public void onNextButtonClicked() {
        String str;
        isSupportFragmentClass issupportfragmentclass;
        String str2;
        isEmulator MediaBrowserCompat$ItemReceiver;
        String str3;
        IOrientationGuidanceCalculator iOrientationGuidanceCalculator = this.RatingCompat;
        if (iOrientationGuidanceCalculator != null) {
            String MediaBrowserCompat$SearchResultReceiver = iOrientationGuidanceCalculator.MediaBrowserCompat$SearchResultReceiver();
            if ((MediaBrowserCompat$SearchResultReceiver.equals("PURPOSEFUL_LOAN") || MediaBrowserCompat$SearchResultReceiver.equals("COMMERCIAL_LOAN") || MediaBrowserCompat$SearchResultReceiver.equals("HOME_TOP_UP")) && (MediaBrowserCompat$ItemReceiver = this.RatingCompat.MediaBrowserCompat$ItemReceiver()) != null) {
                MediaBrowserCompat$ItemReceiver.RatingCompat = this.MediaBrowserCompat$CustomActionResultReceiver.f2695x50fd9e4a;
                MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat = Boolean.valueOf(this.radioButtonDirectDebit.isChecked());
                if (this.radioButtonDirectDebit.isChecked()) {
                    str3 = getString(R.string.review_value_direct_debit);
                } else {
                    str3 = getString(R.string.review_value_cash);
                }
                MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver = str3;
                MediaBrowserCompat$ItemReceiver.MediaMetadataCompat = this.IconCompatParcelizer;
                MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = Integer.valueOf(this.accountSelector.mViewPager.getCurrentItem());
                MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = Integer.valueOf(this.accountRepaySelector.mViewPager.getCurrentItem());
            }
        }
        if (this.RatingCompat != null && this.accountSelector.write() != null) {
            this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("customer_type", this.RatingCompat.write()));
            this.tracker.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver());
            forEachClear foreachclear = this.tracker;
            if (getActivity() != null) {
                foreachclear.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "apply_loan_account");
            }
            setImageFileRepresentation setimagefilerepresentation = this.presenter;
            String MediaMetadataCompat = this.RatingCompat.MediaMetadataCompat();
            String MediaBrowserCompat$SearchResultReceiver2 = this.RatingCompat.MediaBrowserCompat$SearchResultReceiver();
            String str4 = this.accountSelector.write().f2695x50fd9e4a;
            String MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver();
            CrashlyticsReport.FilesPayload.File.Builder write = this.accountRepaySelector.write();
            if (setimagefilerepresentation.RatingCompat != null) {
                setimagefilerepresentation.RatingCompat.AlertController$RecycleListView();
            }
            if (!"DIRECT_DEBIT".equals(MediaBrowserCompat$ItemReceiver2) || "COMMERCIAL".equals(MediaMetadataCompat)) {
                str = null;
            } else {
                str = write.f2695x50fd9e4a;
            }
            char c = 65535;
            int hashCode = MediaMetadataCompat.hashCode();
            if (hashCode != -348127329) {
                if (hashCode == 2223327 && MediaMetadataCompat.equals("HOME")) {
                    c = 1;
                }
            } else if (MediaMetadataCompat.equals("PURPOSEFUL")) {
                c = 0;
            }
            if (c == 0) {
                getGrayscaleImageData getgrayscaleimagedata = setimagefilerepresentation.IconCompatParcelizer;
                drainRecencyQueue$MediaBrowserCompat$CustomActionResultReceiver drainrecencyqueue_mediabrowsercompat_customactionresultreceiver = new drainRecencyQueue$MediaBrowserCompat$CustomActionResultReceiver();
                drainrecencyqueue_mediabrowsercompat_customactionresultreceiver.MediaMetadataCompat = setimagefilerepresentation.MediaBrowserCompat$ItemReceiver.f2875x50fd9e4a;
                drainrecencyqueue_mediabrowsercompat_customactionresultreceiver.MediaDescriptionCompat = MediaBrowserCompat$SearchResultReceiver2;
                drainrecencyqueue_mediabrowsercompat_customactionresultreceiver.RatingCompat = setimagefilerepresentation.MediaBrowserCompat$ItemReceiver.AlertController$RecycleListView;
                drainrecencyqueue_mediabrowsercompat_customactionresultreceiver.read = removeIfFromRandomAccessList.read(setimagefilerepresentation.MediaBrowserCompat$ItemReceiver.read);
                drainrecencyqueue_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer = String.valueOf(setimagefilerepresentation.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver);
                if (str4 != null && !str4.equals("")) {
                    str4 = str4.replace("-", "");
                }
                drainrecencyqueue_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver = str4;
                drainrecencyqueue_mediabrowsercompat_customactionresultreceiver.write = MediaBrowserCompat$ItemReceiver2;
                if (str != null && !str.equals("")) {
                    str = str.replace("-", "");
                }
                drainrecencyqueue_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver = str;
                getgrayscaleimagedata.read((drainRecencyQueue) drainrecencyqueue_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver());
                setimagefilerepresentation.IconCompatParcelizer.IconCompatParcelizer(new setImageFileRepresentation.write(setimagefilerepresentation, (byte) 0));
            } else if (c == 1) {
                getGrayscaleImageData getgrayscaleimagedata2 = setimagefilerepresentation.IconCompatParcelizer;
                String str5 = setimagefilerepresentation.MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo;
                enqueueCleanup$MediaBrowserCompat$ItemReceiver enqueuecleanup_mediabrowsercompat_itemreceiver = new enqueueCleanup$MediaBrowserCompat$ItemReceiver();
                enqueuecleanup_mediabrowsercompat_itemreceiver.MediaBrowserCompat$SearchResultReceiver = str5;
                show show = new show(setimagefilerepresentation.MediaBrowserCompat$ItemReceiver.write);
                show show2 = new show(show.write, new getNextTransition(show.IconCompatParcelizer, getImagePerfectProfileUsed.IconCompatParcelizer));
                if (show2.IconCompatParcelizer.hasNext()) {
                    issupportfragmentclass = isSupportFragmentClass.read(show2.IconCompatParcelizer.next());
                } else {
                    issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
                }
                T t = issupportfragmentclass.IconCompatParcelizer;
                if (t == null) {
                    t = null;
                }
                CommonUtils.C31811 r8 = (CommonUtils.C31811) t;
                if (r8 != null) {
                    str2 = r8.MediaDescriptionCompat;
                } else {
                    str2 = null;
                }
                enqueuecleanup_mediabrowsercompat_itemreceiver.MediaBrowserCompat$MediaItem = str2;
                enqueuecleanup_mediabrowsercompat_itemreceiver.MediaDescriptionCompat = MediaBrowserCompat$SearchResultReceiver2;
                enqueuecleanup_mediabrowsercompat_itemreceiver.RatingCompat = setimagefilerepresentation.MediaBrowserCompat$ItemReceiver.AlertController$RecycleListView;
                enqueuecleanup_mediabrowsercompat_itemreceiver.read = removeIfFromRandomAccessList.read(setimagefilerepresentation.MediaBrowserCompat$ItemReceiver.read);
                enqueuecleanup_mediabrowsercompat_itemreceiver.IconCompatParcelizer = String.valueOf(setimagefilerepresentation.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver);
                if (str4 != null && !str4.equals("")) {
                    str4 = str4.replace("-", "");
                }
                enqueuecleanup_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver = str4;
                enqueuecleanup_mediabrowsercompat_itemreceiver.write = MediaBrowserCompat$ItemReceiver2;
                if (str != null && !str.equals("")) {
                    str = str.replace("-", "");
                }
                enqueuecleanup_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver = str;
                getgrayscaleimagedata2.MediaBrowserCompat$CustomActionResultReceiver((enqueueCleanup) enqueuecleanup_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver());
                setimagefilerepresentation.IconCompatParcelizer.IconCompatParcelizer(new setImageFileRepresentation.read(setimagefilerepresentation, (byte) 0));
            }
        }
    }
}

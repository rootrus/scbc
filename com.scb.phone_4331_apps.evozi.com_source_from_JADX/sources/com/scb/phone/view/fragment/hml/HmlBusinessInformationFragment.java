package com.scb.phone.view.fragment.hml;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.hml.C5609x5fc43574;
import com.scb.phone.view.activity.hml.HmlETBOperatingAccountActivity;
import com.scb.phone.view.activity.hml.HmlETBOperatingAccountActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.activity.hml.businessowner.C5622xa441a992;
import com.scb.phone.view.activity.hml.businessowner.HmlBusinessHelpActivity;
import com.scb.phone.view.activity.hml.businessowner.HmlBusinessIndustrySelectionActivity;
import com.scb.phone.view.activity.hml.businessowner.HmlBusinessURLInformationActivity;
import com.scb.phone.view.activity.hml.businessowner.HmlETBOperatingBankActivity;
import com.scb.phone.view.adapter.hml.HmlBusinessInfoAdapter;
import com.scb.phone.view.custom.common.CustomAcceptDeclineButtons;
import com.scb.phone.view.custom.common.CustomEditText;
import com.scb.phone.view.custom.common.ProgressStateBar;
import com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p040o.ActivityBuilder_BindDepositDetailActivity;
import p040o.BaseDiscoverFundFilterActivity;
import p040o.C5377x1607559e;
import p040o.C6508x1018b6f;
import p040o.CheckEligibilityActivity;
import p040o.FragmentBuilder_BindETBProductTermConditionFragment;
import p040o.FragmentBuilder_BindEasycashContactInformationFragment;
import p040o.FundActionsSuccessActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlBusinessOwnerReviewSubmissionActivity;
import p040o.HmlNTBBusinessURLInformationActivity;
import p040o.HmlNdidSelectIdpActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.LinkedListMultimap;
import p040o.MoreExecutors;
import p040o.MyECouponActivity_ViewBinding;
import p040o.access$2200;
import p040o.access$2300;
import p040o.getICheckDeserializerRtti;
import p040o.getLastInNonemptyList$MediaBrowserCompat$ItemReceiver;
import p040o.getTimestampSeconds;
import p040o.getTrimmedNonFatalFiles;
import p040o.listFilesMatching;
import p040o.onGetStartedClick;
import p040o.removeIfFromRandomAccessList;
import p040o.retainSessions;
import p040o.setCompatElevation;
import p040o.setExtractionType;
import p040o.setMapStyle;
import p040o.setSheetID;
import p040o.setSheetID$AlertController$RecycleListView;
import p040o.setSheetID$MediaBrowserCompat$MediaItem;
import p040o.setSheetID$MediaBrowserCompat$SearchResultReceiver;
import p040o.setSheetID$MediaSessionCompat$QueueItem;
import p040o.setTapText;
import p040o.writeSessionUser;
import p040o.writeToLog;
import p040o.writeUInt64NoTag;
import p040o.zziu;

public class HmlBusinessInformationFragment extends BaseFragment implements setExtractionType {
    public static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer((byte) 0);
    private HmlBusinessInfoAdapter MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    public TextView accountSelector;
    @BindView
    public TextView addAccount;
    @BindView
    public TextView bankAccountError;
    @BindView
    public ProgressStateBar breadcrumbs;
    @BindView
    public TextView businessIndustry;
    @BindView
    public TextView businessIndustryError;
    @BindView
    public CustomAcceptDeclineButtons businessType;
    @BindView
    public TextView businessTypeError;
    @BindView
    public CheckBox cbCapital;
    @BindView
    public CheckBox cbExpansion;
    @BindView
    public CheckBox cbMarketplace;
    @BindView
    public CheckBox cbPhysical;
    @BindView
    public CheckBox cbWebsite;
    @BindView
    public CustomSpinnerWithTitle incomeSpinner;
    @BindView
    public TextView loanPurposeError;
    @BindView
    public CustomEditText monthlyIncome;
    @BindView
    public TextView netIncomeError;
    @BindView
    public Button nextButton;
    @HmlPinActivity
    public setSheetID presenter;
    @BindView
    public RecyclerView recyclerView;
    @BindView
    public RelativeLayout root;
    @BindView
    public TextView sourceIncomeError;
    @BindView
    public TextView storeTypeError;

    static final class MediaMetadataCompat extends CheckEligibilityActivity implements BaseDiscoverFundFilterActivity<C5609x5fc43574, getTimestampSeconds, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ HmlBusinessInformationFragment MediaBrowserCompat$ItemReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        MediaMetadataCompat(HmlBusinessInformationFragment hmlBusinessInformationFragment) {
            super(2);
            this.MediaBrowserCompat$ItemReceiver = hmlBusinessInformationFragment;
        }

        public final /* synthetic */ Object MediaBrowserCompat$CustomActionResultReceiver(Object obj, Object obj2) {
            C5609x5fc43574 hmlETBOperatingAccountActivity$MediaBrowserCompat$CustomActionResultReceiver = (C5609x5fc43574) obj;
            getTimestampSeconds gettimestampseconds = (getTimestampSeconds) obj2;
            onGetStartedClick.write((Object) hmlETBOperatingAccountActivity$MediaBrowserCompat$CustomActionResultReceiver, "operatingType");
            int i = ActivityBuilder_BindDepositDetailActivity.MediaBrowserCompat$ItemReceiver[hmlETBOperatingAccountActivity$MediaBrowserCompat$CustomActionResultReceiver.ordinal()];
            boolean z = false;
            if (i == 1) {
                setSheetID setsheetid = this.MediaBrowserCompat$ItemReceiver.presenter;
                if (setsheetid == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C5377x1607559e.MediaBrowserCompat$CustomActionResultReceiver;
                if (setsheetid.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    iconCompatParcelizer.IconCompatParcelizer(setsheetid.RatingCompat);
                }
            } else if (i == 2 && gettimestampseconds != null) {
                setSheetID setsheetid2 = this.MediaBrowserCompat$ItemReceiver.presenter;
                if (setsheetid2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                onGetStartedClick.write((Object) gettimestampseconds, "account");
                writeUInt64NoTag.IconCompatParcelizer parcelableVolumeInfo = new setSheetID.ParcelableVolumeInfo(gettimestampseconds);
                if (setsheetid2.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    parcelableVolumeInfo.IconCompatParcelizer(setsheetid2.RatingCompat);
                }
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f87762131494003, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        setSheetID setsheetid = this.presenter;
        if (setsheetid == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setsheetid.MediaBrowserCompat$ItemReceiver(this);
        setSheetID setsheetid2 = this.presenter;
        if (setsheetid2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setsheetid2.MediaBrowserCompat$ItemReceiver = true;
        if (setsheetid2.RatingCompat != null) {
            setsheetid2.RatingCompat.AlertController$RecycleListView();
        }
        LinkedListMultimap linkedListMultimap = setsheetid2.IconCompatParcelizer;
        FundFactSheetActivity sethasdecor = new setSheetID.setHasDecor(setsheetid2);
        FundFactSheetActivity customAction = new setSheetID.PlaybackStateCompat.CustomAction(setsheetid2);
        FundFactSheetActivity setsheetid_alertcontroller_recyclelistview = new setSheetID$AlertController$RecycleListView(setsheetid2);
        onGetStartedClick.write((Object) sethasdecor, "onSuccess");
        onGetStartedClick.write((Object) customAction, "onError");
        onGetStartedClick.write((Object) setsheetid_alertcontroller_recyclelistview, "transform");
        linkedListMultimap.MediaBrowserCompat$ItemReceiver(linkedListMultimap.IconCompatParcelizer, sethasdecor, customAction, new getLastInNonemptyList$MediaBrowserCompat$ItemReceiver(), setsheetid_alertcontroller_recyclelistview);
        CustomEditText customEditText = this.monthlyIncome;
        if (customEditText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("monthlyIncome");
        }
        customEditText.setFilters(new InputFilter[]{new FragmentBuilder_BindETBProductTermConditionFragment(17, 0)});
        CustomEditText customEditText2 = this.monthlyIncome;
        if (customEditText2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("monthlyIncome");
        }
        CustomEditText customEditText3 = this.monthlyIncome;
        if (customEditText3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("monthlyIncome");
        }
        customEditText2.addTextChangedListener(new FragmentBuilder_BindEasycashContactInformationFragment(customEditText3, (C6508x1018b6f) null));
        CustomEditText customEditText4 = this.monthlyIncome;
        if (customEditText4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("monthlyIncome");
        }
        customEditText4.setOnBackListener(new write(this));
        CustomEditText customEditText5 = this.monthlyIncome;
        if (customEditText5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("monthlyIncome");
        }
        customEditText5.setOnFocusChangeListener(new HmlBusinessInformationFragment$MediaBrowserCompat$ItemReceiver(this));
        CustomEditText customEditText6 = this.monthlyIncome;
        if (customEditText6 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("monthlyIncome");
        }
        customEditText6.setOnEditorActionListener(new HmlBusinessInformationFragment$MediaBrowserCompat$MediaItem(this));
        write();
        TextView textView = this.addAccount;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("addAccount");
        }
        textView.setOnClickListener(new MediaDescriptionCompat(this));
        return inflate;
    }

    static final class MediaDescriptionCompat implements View.OnClickListener {
        private /* synthetic */ HmlBusinessInformationFragment read;

        MediaDescriptionCompat(HmlBusinessInformationFragment hmlBusinessInformationFragment) {
            this.read = hmlBusinessInformationFragment;
        }

        public final void onClick(View view) {
            setSheetID setsheetid = this.read.presenter;
            if (setsheetid == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C5377x1607559e.MediaBrowserCompat$CustomActionResultReceiver;
            if (setsheetid.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(setsheetid.RatingCompat);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void write() {
        ProgressStateBar progressStateBar = this.breadcrumbs;
        if (progressStateBar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("breadcrumbs");
        }
        progressStateBar.setVisibility(0);
        ProgressStateBar progressStateBar2 = this.breadcrumbs;
        if (progressStateBar2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("breadcrumbs");
        }
        String[] stringArray = getResources().getStringArray(R.array.f64702130903049);
        onGetStartedClick.IconCompatParcelizer((Object) stringArray, "resources.getStringArray…rray.hml_breadcrumbs_ntb)");
        progressStateBar2.setStates(HmlBusinessOwnerReviewSubmissionActivity.write((T[]) stringArray));
        ProgressStateBar progressStateBar3 = this.breadcrumbs;
        if (progressStateBar3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("breadcrumbs");
        }
        progressStateBar3.setCurrentState(2);
    }

    static final class write implements CustomEditText.write {
        private /* synthetic */ HmlBusinessInformationFragment MediaBrowserCompat$ItemReceiver;

        write(HmlBusinessInformationFragment hmlBusinessInformationFragment) {
            this.MediaBrowserCompat$ItemReceiver = hmlBusinessInformationFragment;
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver() {
            this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
        }
    }

    /* access modifiers changed from: private */
    public final void IconCompatParcelizer() {
        RelativeLayout relativeLayout = this.root;
        if (relativeLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("root");
        }
        relativeLayout.setFocusable(true);
        RelativeLayout relativeLayout2 = this.root;
        if (relativeLayout2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("root");
        }
        relativeLayout2.setFocusableInTouchMode(true);
        RelativeLayout relativeLayout3 = this.root;
        if (relativeLayout3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("root");
        }
        relativeLayout3.requestFocus();
    }

    @OnClick
    public void navigateToSelectBusiness() {
        C5622xa441a992 hmlBusinessIndustrySelectionActivity$MediaBrowserCompat$ItemReceiver = HmlBusinessIndustrySelectionActivity.MediaBrowserCompat$MediaItem;
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "this.requireContext()");
        onGetStartedClick.write((Object) requireContext, "context");
        Intent intent = new Intent(requireContext, HmlBusinessIndustrySelectionActivity.class);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivityForResult(intent, 10002);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void read() {
        Context context = getContext();
        if (context != null) {
            HmlETBOperatingBankActivity.write write2 = HmlETBOperatingBankActivity.MediaBrowserCompat$SearchResultReceiver;
            onGetStartedClick.IconCompatParcelizer((Object) context, "it");
            onGetStartedClick.write((Object) context, "context");
            Intent intent = new Intent(context, HmlETBOperatingBankActivity.class);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    intent = setTapText.write(activity, intent).read();
                }
                MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
                sb.append(intent.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb.toString());
                startActivityForResult(intent, 10003);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void write(zziu.zzc zzc) {
        onGetStartedClick.write((Object) zzc, "account");
        Context context = getContext();
        if (context != null) {
            HmlETBOperatingAccountActivity$MediaBrowserCompat$ItemReceiver hmlETBOperatingAccountActivity$MediaBrowserCompat$ItemReceiver = HmlETBOperatingAccountActivity.MediaBrowserCompat$SearchResultReceiver;
            onGetStartedClick.IconCompatParcelizer((Object) context, "it");
            Intent MediaBrowserCompat$CustomActionResultReceiver2 = HmlETBOperatingAccountActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(context, C5609x5fc43574.EDIT, zzc);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    MediaBrowserCompat$CustomActionResultReceiver2 = setTapText.write(activity, MediaBrowserCompat$CustomActionResultReceiver2).read();
                }
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
                sb.append(MediaBrowserCompat$CustomActionResultReceiver2.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                startActivityForResult(MediaBrowserCompat$CustomActionResultReceiver2, 10004);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        Context context = getContext();
        if (context != null) {
            HmlBusinessURLInformationActivity.read read2 = HmlBusinessURLInformationActivity.MediaDescriptionCompat;
            onGetStartedClick.IconCompatParcelizer((Object) context, "it");
            onGetStartedClick.write((Object) context, "context");
            Intent intent = new Intent(context, HmlBusinessURLInformationActivity.class);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    intent = setTapText.write(activity, intent).read();
                }
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(intent.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                startActivity(intent);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @OnClick
    public void navigateToBusinessIndustryAbout() {
        Context context = getContext();
        if (context != null) {
            HmlBusinessHelpActivity.read read2 = HmlBusinessHelpActivity.MediaMetadataCompat;
            onGetStartedClick.IconCompatParcelizer((Object) context, "it");
            String string = getString(R.string.hml_business_owner_industry_about_activity);
            onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.hml_b…_industry_about_activity)");
            Intent MediaBrowserCompat$CustomActionResultReceiver2 = HmlBusinessHelpActivity.read.MediaBrowserCompat$CustomActionResultReceiver(context, string, R.layout.f78222131493047);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    MediaBrowserCompat$CustomActionResultReceiver2 = setTapText.write(activity, MediaBrowserCompat$CustomActionResultReceiver2).read();
                }
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(MediaBrowserCompat$CustomActionResultReceiver2.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                startActivity(MediaBrowserCompat$CustomActionResultReceiver2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @OnClick
    public void navigateToLoanPurposeAbout() {
        Context context = getContext();
        if (context != null) {
            HmlBusinessHelpActivity.read read2 = HmlBusinessHelpActivity.MediaMetadataCompat;
            onGetStartedClick.IconCompatParcelizer((Object) context, "it");
            String string = getString(R.string.hml_business_owner_purpose_loan_about_activity);
            onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.hml_b…pose_loan_about_activity)");
            Intent MediaBrowserCompat$CustomActionResultReceiver2 = HmlBusinessHelpActivity.read.MediaBrowserCompat$CustomActionResultReceiver(context, string, R.layout.f78252131493050);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    MediaBrowserCompat$CustomActionResultReceiver2 = setTapText.write(activity, MediaBrowserCompat$CustomActionResultReceiver2).read();
                }
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(MediaBrowserCompat$CustomActionResultReceiver2.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                startActivity(MediaBrowserCompat$CustomActionResultReceiver2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @OnClick
    public void navigateToStoreTypeAbout() {
        Context context = getContext();
        if (context != null) {
            HmlBusinessHelpActivity.read read2 = HmlBusinessHelpActivity.MediaMetadataCompat;
            onGetStartedClick.IconCompatParcelizer((Object) context, "it");
            String string = getString(R.string.hml_business_owner_type_store_about_activity);
            onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.hml_b…ype_store_about_activity)");
            Intent MediaBrowserCompat$CustomActionResultReceiver2 = HmlBusinessHelpActivity.read.MediaBrowserCompat$CustomActionResultReceiver(context, string, R.layout.f78282131493053);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    MediaBrowserCompat$CustomActionResultReceiver2 = setTapText.write(activity, MediaBrowserCompat$CustomActionResultReceiver2).read();
                }
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(MediaBrowserCompat$CustomActionResultReceiver2.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                startActivity(MediaBrowserCompat$CustomActionResultReceiver2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @OnClick
    public void navigateToMonthlyIncomeAbout() {
        Context context = getContext();
        if (context != null) {
            HmlBusinessHelpActivity.read read2 = HmlBusinessHelpActivity.MediaMetadataCompat;
            onGetStartedClick.IconCompatParcelizer((Object) context, "it");
            String string = getString(R.string.hml_business_owner_monthly_income_about_activity);
            onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.hml_b…ly_income_about_activity)");
            Intent MediaBrowserCompat$CustomActionResultReceiver2 = HmlBusinessHelpActivity.read.MediaBrowserCompat$CustomActionResultReceiver(context, string, R.layout.f78242131493049);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    MediaBrowserCompat$CustomActionResultReceiver2 = setTapText.write(activity, MediaBrowserCompat$CustomActionResultReceiver2).read();
                }
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(MediaBrowserCompat$CustomActionResultReceiver2.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                startActivity(MediaBrowserCompat$CustomActionResultReceiver2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(setSheetID.write write2, boolean z) {
        onGetStartedClick.write((Object) write2, "field");
        switch (ActivityBuilder_BindDepositDetailActivity.MediaBrowserCompat$CustomActionResultReceiver[write2.ordinal()]) {
            case 1:
                TextView textView = this.businessIndustryError;
                if (textView == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessIndustryError");
                }
                textView.setVisibility(0);
                TextView textView2 = this.businessIndustry;
                if (textView2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessIndustry");
                }
                textView2.setBackgroundResource(R.drawable.shape_red_reounded_reactangle_border);
                return;
            case 2:
                TextView textView3 = this.businessTypeError;
                if (textView3 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessTypeError");
                }
                textView3.setVisibility(0);
                return;
            case 3:
                TextView textView4 = this.storeTypeError;
                if (textView4 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("storeTypeError");
                }
                textView4.setVisibility(0);
                return;
            case 4:
                TextView textView5 = this.loanPurposeError;
                if (textView5 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("loanPurposeError");
                }
                textView5.setVisibility(0);
                return;
            case 5:
                TextView textView6 = this.netIncomeError;
                if (textView6 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("netIncomeError");
                }
                textView6.setText(getString(z ? R.string.hml_business_info_2_monthly_income_empty_error : R.string.hml_business_info_2_monthly_income_error));
                CustomEditText customEditText = this.monthlyIncome;
                if (customEditText == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("monthlyIncome");
                }
                customEditText.MediaBrowserCompat$CustomActionResultReceiver(false);
                TextView textView7 = this.netIncomeError;
                if (textView7 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("netIncomeError");
                }
                textView7.setVisibility(0);
                return;
            case 6:
                TextView textView8 = this.sourceIncomeError;
                if (textView8 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("sourceIncomeError");
                }
                textView8.setVisibility(0);
                CustomSpinnerWithTitle customSpinnerWithTitle = this.incomeSpinner;
                if (customSpinnerWithTitle == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("incomeSpinner");
                }
                customSpinnerWithTitle.setSpinnerBackground(Boolean.TRUE);
                return;
            case 7:
                TextView textView9 = this.bankAccountError;
                if (textView9 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("bankAccountError");
                }
                textView9.setVisibility(0);
                HmlBusinessInfoAdapter hmlBusinessInfoAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (hmlBusinessInfoAdapter != null) {
                    Iterable<getTimestampSeconds> iterable = hmlBusinessInfoAdapter.MediaBrowserCompat$ItemReceiver;
                    int i = 10;
                    onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
                    if (iterable instanceof Collection) {
                        i = ((Collection) iterable).size();
                    }
                    Collection arrayList = new ArrayList(i);
                    for (getTimestampSeconds gettimestampseconds : iterable) {
                        if (gettimestampseconds.MediaDescriptionCompat == listFilesMatching.PLACE_HOLDER) {
                            gettimestampseconds.MediaBrowserCompat$MediaItem = true;
                        }
                        arrayList.add(HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver);
                    }
                    hmlBusinessInfoAdapter.IconCompatParcelizer.write();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(setSheetID.write write2) {
        onGetStartedClick.write((Object) write2, "field");
        switch (ActivityBuilder_BindDepositDetailActivity.IconCompatParcelizer[write2.ordinal()]) {
            case 1:
                TextView textView = this.businessIndustryError;
                if (textView == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessIndustryError");
                }
                textView.setVisibility(8);
                TextView textView2 = this.businessIndustry;
                if (textView2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessIndustry");
                }
                textView2.setBackgroundResource(R.drawable.shape_gray_rounded_rectangle);
                return;
            case 2:
                TextView textView3 = this.businessTypeError;
                if (textView3 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessTypeError");
                }
                textView3.setVisibility(8);
                return;
            case 3:
                TextView textView4 = this.storeTypeError;
                if (textView4 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("storeTypeError");
                }
                textView4.setVisibility(8);
                return;
            case 4:
                TextView textView5 = this.loanPurposeError;
                if (textView5 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("loanPurposeError");
                }
                textView5.setVisibility(8);
                return;
            case 5:
                CustomEditText customEditText = this.monthlyIncome;
                if (customEditText == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("monthlyIncome");
                }
                customEditText.MediaBrowserCompat$CustomActionResultReceiver(true);
                TextView textView6 = this.netIncomeError;
                if (textView6 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("netIncomeError");
                }
                textView6.setVisibility(8);
                return;
            case 6:
                TextView textView7 = this.sourceIncomeError;
                if (textView7 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("sourceIncomeError");
                }
                textView7.setVisibility(8);
                CustomSpinnerWithTitle customSpinnerWithTitle = this.incomeSpinner;
                if (customSpinnerWithTitle == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("incomeSpinner");
                }
                customSpinnerWithTitle.setSpinnerBackground(Boolean.FALSE);
                return;
            case 7:
                TextView textView8 = this.bankAccountError;
                if (textView8 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("bankAccountError");
                }
                textView8.setVisibility(8);
                return;
            default:
                return;
        }
    }

    @OnCheckedChanged
    public final void onPhysicalChecked() {
        boolean z;
        setSheetID setsheetid = this.presenter;
        if (setsheetid == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setSheetID.write write2 = setSheetID.write.STORE_TYPE;
        CheckBox checkBox = this.cbPhysical;
        if (checkBox == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("cbPhysical");
        }
        if (!checkBox.isChecked()) {
            CheckBox checkBox2 = this.cbMarketplace;
            if (checkBox2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("cbMarketplace");
            }
            if (!checkBox2.isChecked()) {
                CheckBox checkBox3 = this.cbWebsite;
                if (checkBox3 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("cbWebsite");
                }
                if (!checkBox3.isChecked()) {
                    z = false;
                    setsheetid.MediaBrowserCompat$CustomActionResultReceiver(write2, z);
                }
            }
        }
        z = true;
        setsheetid.MediaBrowserCompat$CustomActionResultReceiver(write2, z);
    }

    @OnCheckedChanged
    public final void onMarketplaceChecked() {
        boolean z;
        setSheetID setsheetid = this.presenter;
        if (setsheetid == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setSheetID.write write2 = setSheetID.write.STORE_TYPE;
        CheckBox checkBox = this.cbPhysical;
        if (checkBox == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("cbPhysical");
        }
        if (!checkBox.isChecked()) {
            CheckBox checkBox2 = this.cbMarketplace;
            if (checkBox2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("cbMarketplace");
            }
            if (!checkBox2.isChecked()) {
                CheckBox checkBox3 = this.cbWebsite;
                if (checkBox3 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("cbWebsite");
                }
                if (!checkBox3.isChecked()) {
                    z = false;
                    setsheetid.MediaBrowserCompat$CustomActionResultReceiver(write2, z);
                }
            }
        }
        z = true;
        setsheetid.MediaBrowserCompat$CustomActionResultReceiver(write2, z);
    }

    @OnCheckedChanged
    public final void onWebsiteChecked() {
        boolean z;
        setSheetID setsheetid = this.presenter;
        if (setsheetid == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setSheetID.write write2 = setSheetID.write.STORE_TYPE;
        CheckBox checkBox = this.cbPhysical;
        if (checkBox == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("cbPhysical");
        }
        if (!checkBox.isChecked()) {
            CheckBox checkBox2 = this.cbMarketplace;
            if (checkBox2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("cbMarketplace");
            }
            if (!checkBox2.isChecked()) {
                CheckBox checkBox3 = this.cbWebsite;
                if (checkBox3 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("cbWebsite");
                }
                if (!checkBox3.isChecked()) {
                    z = false;
                    setsheetid.MediaBrowserCompat$CustomActionResultReceiver(write2, z);
                }
            }
        }
        z = true;
        setsheetid.MediaBrowserCompat$CustomActionResultReceiver(write2, z);
    }

    @OnCheckedChanged
    public final void onExpansionChecked() {
        boolean z;
        setSheetID setsheetid = this.presenter;
        if (setsheetid == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setSheetID.write write2 = setSheetID.write.LOAN_PURPOSE;
        CheckBox checkBox = this.cbExpansion;
        if (checkBox == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("cbExpansion");
        }
        if (!checkBox.isChecked()) {
            CheckBox checkBox2 = this.cbCapital;
            if (checkBox2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("cbCapital");
            }
            if (!checkBox2.isChecked()) {
                z = false;
                setsheetid.MediaBrowserCompat$CustomActionResultReceiver(write2, z);
            }
        }
        z = true;
        setsheetid.MediaBrowserCompat$CustomActionResultReceiver(write2, z);
    }

    @OnCheckedChanged
    public final void onCapitalChecked() {
        boolean z;
        setSheetID setsheetid = this.presenter;
        if (setsheetid == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setSheetID.write write2 = setSheetID.write.LOAN_PURPOSE;
        CheckBox checkBox = this.cbExpansion;
        if (checkBox == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("cbExpansion");
        }
        if (!checkBox.isChecked()) {
            CheckBox checkBox2 = this.cbCapital;
            if (checkBox2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("cbCapital");
            }
            if (!checkBox2.isChecked()) {
                z = false;
                setsheetid.MediaBrowserCompat$CustomActionResultReceiver(write2, z);
            }
        }
        z = true;
        setsheetid.MediaBrowserCompat$CustomActionResultReceiver(write2, z);
    }

    @OnClick
    public final void onNextClicked() {
        Collection collection;
        Set<setSheetID.write> set;
        setSheetID setsheetid = this.presenter;
        if (setsheetid == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        CustomAcceptDeclineButtons customAcceptDeclineButtons = this.businessType;
        if (customAcceptDeclineButtons == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessType");
        }
        Button button = customAcceptDeclineButtons.btAccept;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btAccept");
        }
        String str = button.isSelected() ? "JURISTIC" : "NON_JURISTIC";
        CheckBox checkBox = this.cbPhysical;
        if (checkBox == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("cbPhysical");
        }
        boolean isChecked = checkBox.isChecked();
        CheckBox checkBox2 = this.cbWebsite;
        if (checkBox2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("cbWebsite");
        }
        boolean isChecked2 = checkBox2.isChecked();
        CheckBox checkBox3 = this.cbMarketplace;
        if (checkBox3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("cbMarketplace");
        }
        boolean isChecked3 = checkBox3.isChecked();
        CheckBox checkBox4 = this.cbExpansion;
        if (checkBox4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("cbExpansion");
        }
        boolean isChecked4 = checkBox4.isChecked();
        CheckBox checkBox5 = this.cbCapital;
        if (checkBox5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("cbCapital");
        }
        boolean isChecked5 = checkBox5.isChecked();
        CustomEditText customEditText = this.monthlyIncome;
        if (customEditText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("monthlyIncome");
        }
        String valueOf = String.valueOf(customEditText.getText());
        CustomSpinnerWithTitle customSpinnerWithTitle = this.incomeSpinner;
        if (customSpinnerWithTitle == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("incomeSpinner");
        }
        int selectedItemPosition = customSpinnerWithTitle.spinner.getSelectedItemPosition();
        onGetStartedClick.write((Object) str, "businessType");
        onGetStartedClick.write((Object) valueOf, "monthlyNetIncome");
        if (setsheetid.read(valueOf)) {
            setsheetid.MediaSessionCompat$QueueItem.add(setSheetID.write.NET_INCOME);
        } else {
            setsheetid.MediaSessionCompat$QueueItem.remove(setSheetID.write.NET_INCOME);
        }
        boolean z = false;
        if (!(setsheetid.MediaSessionCompat$QueueItem.size() == setSheetID.write.values().length)) {
            Set MediaBrowserCompat$ItemReceiver = HmlBusinessOwnerReviewSubmissionActivity.MediaBrowserCompat$ItemReceiver(setSheetID.write.values());
            Iterable iterable = setsheetid.MediaSessionCompat$QueueItem;
            onGetStartedClick.write((Object) MediaBrowserCompat$ItemReceiver, "$this$minus");
            onGetStartedClick.write((Object) iterable, "elements");
            Iterable iterable2 = MediaBrowserCompat$ItemReceiver;
            onGetStartedClick.write((Object) iterable, "$this$convertToSetForSetOperationWith");
            onGetStartedClick.write((Object) iterable2, "source");
            if (iterable instanceof Set) {
                collection = (Collection) iterable;
            } else {
                boolean z2 = iterable instanceof Collection;
                if (z2) {
                    if (!(iterable2 instanceof Collection) || ((Collection) iterable2).size() >= 2) {
                        Collection collection2 = (Collection) iterable;
                        if (!(collection2.size() > 2 && (collection2 instanceof ArrayList))) {
                            collection = collection2;
                        }
                    } else {
                        collection = (Collection) iterable;
                    }
                }
                onGetStartedClick.write((Object) iterable, "$this$toHashSet");
                int i = 12;
                onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
                if (z2) {
                    i = ((Collection) iterable).size();
                }
                collection = (HashSet) HmlNTBBusinessURLInformationActivity.IconCompatParcelizer(iterable, new HashSet(HmlNdidSelectIdpActivity.read(i)));
            }
            if (collection.isEmpty()) {
                set = HmlNTBBusinessURLInformationActivity.write(iterable2);
            } else if (collection instanceof Set) {
                Collection linkedHashSet = new LinkedHashSet();
                for (Object next : iterable2) {
                    if (!collection.contains(next)) {
                        linkedHashSet.add(next);
                    }
                }
                set = (Set) linkedHashSet;
            } else {
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(MediaBrowserCompat$ItemReceiver);
                linkedHashSet2.removeAll(collection);
                set = linkedHashSet2;
            }
            if (!(!set.isEmpty())) {
                set = null;
            }
            if (set != null) {
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = setSheetID$MediaBrowserCompat$SearchResultReceiver.write;
                if (setsheetid.RatingCompat != null) {
                    iconCompatParcelizer.IconCompatParcelizer(setsheetid.RatingCompat);
                }
                if (set != null) {
                    for (setSheetID.write read2 : set) {
                        writeUInt64NoTag.IconCompatParcelizer read3 = new setSheetID.read(read2, valueOf);
                        if (setsheetid.RatingCompat != null) {
                            read3.IconCompatParcelizer(setsheetid.RatingCompat);
                        }
                    }
                }
            }
        } else if (setsheetid.MediaBrowserCompat$ItemReceiver) {
            setsheetid.MediaBrowserCompat$ItemReceiver = false;
            if (setsheetid.RatingCompat != null) {
                z = true;
            }
            if (z) {
                setsheetid.RatingCompat.AlertController$RecycleListView();
            }
            LinkedListMultimap linkedListMultimap = setsheetid.IconCompatParcelizer;
            FundActionsSuccessActivity mediaDescriptionCompat = new setSheetID.MediaDescriptionCompat(setsheetid);
            FundFactSheetActivity setsheetid_mediabrowsercompat_mediaitem = new setSheetID$MediaBrowserCompat$MediaItem(setsheetid);
            String str2 = setsheetid.MediaBrowserCompat$SearchResultReceiver;
            if (str2 == null) {
                str2 = "";
            }
            Double MediaBrowserCompat$ItemReceiver2 = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(valueOf);
            onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver2, "com.scb.phone.presentati…                        )");
            String read4 = removeIfFromRandomAccessList.read(MediaBrowserCompat$ItemReceiver2.doubleValue());
            onGetStartedClick.IconCompatParcelizer((Object) read4, "Utilities.amountDoubleWi…                        )");
            setMapStyle setmapstyle = new setMapStyle(((MoreExecutors) setsheetid.read.get(selectedItemPosition - 1)).MediaBrowserCompat$ItemReceiver);
            onGetStartedClick.write((Object) mediaDescriptionCompat, "onComplete");
            onGetStartedClick.write((Object) setsheetid_mediabrowsercompat_mediaitem, "onError");
            onGetStartedClick.write((Object) str2, "isicCode");
            onGetStartedClick.write((Object) str, "businessType");
            onGetStartedClick.write((Object) read4, "monthlyNetIncome");
            onGetStartedClick.write((Object) setmapstyle, "sourceOfIncome");
            linkedListMultimap.MediaBrowserCompat$ItemReceiver(linkedListMultimap.write, mediaDescriptionCompat, setsheetid_mediabrowsercompat_mediaitem, new setCompatElevation.IconCompatParcelizer(str2, str, isChecked, isChecked2, isChecked3, isChecked4, isChecked5, read4, setmapstyle));
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        IconCompatParcelizer();
        access$2200 access_2200 = new access$2200();
        access_2200.MediaBrowserCompat$ItemReceiver = getString(R.string.hml_business_info_2_empty_fields_title);
        access_2200.IconCompatParcelizer = getString(R.string.hml_business_info_2_empty_fields_content);
        access$2300 access_2300 = new access$2300();
        access_2300.MediaBrowserCompat$ItemReceiver = getString(R.string.ok);
        access_2300.read = access$2300.write.JUST_DISMISS;
        access_2200.MediaBrowserCompat$CustomActionResultReceiver = access_2300;
        write(access_2200);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Bundle extras;
        zziu.zzc zzc;
        Bundle extras2;
        zziu.zzc zzc2;
        super.onActivityResult(i, i2, intent);
        boolean z = true;
        if (i == 10002 && i2 == -1 && intent != null) {
            TextView textView = this.businessIndustry;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessIndustry");
            }
            textView.setText(intent.getStringExtra("EXTRA_RESULT_OCCUPATION_DESCRIPTION"));
            setSheetID setsheetid = this.presenter;
            if (setsheetid == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            String stringExtra = intent.getStringExtra("EXTRA_RESULT_OCCUPATION_ISIC_CODE");
            onGetStartedClick.IconCompatParcelizer((Object) stringExtra, "data.getStringExtra(EXTR…ULT_OCCUPATION_ISIC_CODE)");
            onGetStartedClick.write((Object) stringExtra, "code");
            setsheetid.MediaBrowserCompat$SearchResultReceiver = stringExtra;
            setSheetID setsheetid2 = this.presenter;
            if (setsheetid2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            setsheetid2.MediaBrowserCompat$CustomActionResultReceiver(setSheetID.write.BUSINESS_INDUSTRY, true);
        }
        if (!(i != 10003 || i2 != -1 || intent == null || (extras2 = intent.getExtras()) == null || (zzc2 = (zziu.zzc) extras2.getParcelable("OPERATING_ACCOUNT_RESULT")) == null)) {
            setSheetID setsheetid3 = this.presenter;
            if (setsheetid3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.IconCompatParcelizer((Object) zzc2, "it");
            onGetStartedClick.write((Object) zzc2, "account");
            setsheetid3.write++;
            setsheetid3.MediaBrowserCompat$CustomActionResultReceiver(setSheetID.write.BANK_ACCOUNT, setsheetid3.write >= setsheetid3.MediaBrowserCompat$MediaItem);
            writeUInt64NoTag.IconCompatParcelizer mediaMetadataCompat = new setSheetID.MediaMetadataCompat(setsheetid3, zzc2);
            if (setsheetid3.RatingCompat != null) {
                mediaMetadataCompat.IconCompatParcelizer(setsheetid3.RatingCompat);
            }
        }
        if (i == 10004 && i2 == -1 && intent != null && (extras = intent.getExtras()) != null && (zzc = (zziu.zzc) extras.getParcelable("OPERATING_ACCOUNT_RESULT")) != null) {
            if (extras.getBoolean("OPERATING_ACCOUNT_EDIT_ACTION", false)) {
                setSheetID setsheetid4 = this.presenter;
                if (setsheetid4 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                onGetStartedClick.IconCompatParcelizer((Object) zzc, "account");
                onGetStartedClick.write((Object) zzc, "account");
                int i3 = setsheetid4.write - 1;
                setsheetid4.write = i3;
                if (i3 < setsheetid4.MediaBrowserCompat$MediaItem) {
                    setsheetid4.MediaSessionCompat$QueueItem.remove(setSheetID.write.BANK_ACCOUNT);
                }
                writeUInt64NoTag.IconCompatParcelizer ratingCompat = new setSheetID.RatingCompat(setsheetid4, zzc);
                if (setsheetid4.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    ratingCompat.IconCompatParcelizer(setsheetid4.RatingCompat);
                    return;
                }
                return;
            }
            setSheetID setsheetid5 = this.presenter;
            if (setsheetid5 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.IconCompatParcelizer((Object) zzc, "account");
            onGetStartedClick.write((Object) zzc, "account");
            writeUInt64NoTag.IconCompatParcelizer setsheetid_mediasessioncompat_queueitem = new setSheetID$MediaSessionCompat$QueueItem(setsheetid5, zzc);
            if (setsheetid5.RatingCompat == null) {
                z = false;
            }
            if (z) {
                setsheetid_mediasessioncompat_queueitem.IconCompatParcelizer(setsheetid5.RatingCompat);
            }
        }
    }

    public final void IconCompatParcelizer(int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = new HmlBusinessInfoAdapter(i, new MediaMetadataCompat(this));
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerView");
        }
        getActivity();
        recyclerView2.setLayoutManager(new LinearLayoutManager(1, false));
        RecyclerView recyclerView3 = this.recyclerView;
        if (recyclerView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerView");
        }
        recyclerView3.setAdapter(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<getTimestampSeconds> list, int i) {
        onGetStartedClick.write((Object) list, "list");
        Collection collection = list;
        if (!collection.isEmpty()) {
            RecyclerView recyclerView2 = this.recyclerView;
            if (recyclerView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerView");
            }
            recyclerView2.setVisibility(0);
            TextView textView = this.accountSelector;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("accountSelector");
            }
            textView.setVisibility(8);
            HmlBusinessInfoAdapter hmlBusinessInfoAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (hmlBusinessInfoAdapter != null) {
                onGetStartedClick.write((Object) list, "list");
                hmlBusinessInfoAdapter.MediaBrowserCompat$ItemReceiver.clear();
                hmlBusinessInfoAdapter.MediaBrowserCompat$ItemReceiver.addAll(collection);
                hmlBusinessInfoAdapter.IconCompatParcelizer.write();
            }
            MediaBrowserCompat$ItemReceiver(i);
            return;
        }
        RecyclerView recyclerView3 = this.recyclerView;
        if (recyclerView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerView");
        }
        recyclerView3.setVisibility(8);
        TextView textView2 = this.addAccount;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("addAccount");
        }
        textView2.setVisibility(8);
        TextView textView3 = this.accountSelector;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("accountSelector");
        }
        textView3.setVisibility(0);
        MediaBrowserCompat$ItemReceiver(i);
    }

    public final void read(getTimestampSeconds gettimestampseconds) {
        Object obj;
        boolean z;
        onGetStartedClick.write((Object) gettimestampseconds, "account");
        HmlBusinessInfoAdapter hmlBusinessInfoAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (hmlBusinessInfoAdapter != null) {
            onGetStartedClick.write((Object) gettimestampseconds, "account");
            hmlBusinessInfoAdapter.MediaBrowserCompat$ItemReceiver.add(gettimestampseconds);
            HmlNTBBusinessURLInformationActivity.write(hmlBusinessInfoAdapter.MediaBrowserCompat$ItemReceiver, new HmlBusinessInfoAdapter.write());
            Iterator it = hmlBusinessInfoAdapter.MediaBrowserCompat$ItemReceiver.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((getTimestampSeconds) obj).MediaDescriptionCompat == listFilesMatching.PLACE_HOLDER) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            getTimestampSeconds gettimestampseconds2 = (getTimestampSeconds) obj;
            if (gettimestampseconds2 != null) {
                hmlBusinessInfoAdapter.MediaBrowserCompat$ItemReceiver.remove(gettimestampseconds2);
            }
            hmlBusinessInfoAdapter.IconCompatParcelizer.write();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(getTimestampSeconds gettimestampseconds) {
        onGetStartedClick.write((Object) gettimestampseconds, "account");
        HmlBusinessInfoAdapter hmlBusinessInfoAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (hmlBusinessInfoAdapter != null) {
            onGetStartedClick.write((Object) gettimestampseconds, "account");
            hmlBusinessInfoAdapter.MediaBrowserCompat$ItemReceiver.set(hmlBusinessInfoAdapter.write, gettimestampseconds);
            hmlBusinessInfoAdapter.IconCompatParcelizer.write();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(getTimestampSeconds gettimestampseconds) {
        Object obj;
        boolean z;
        onGetStartedClick.write((Object) gettimestampseconds, "account");
        HmlBusinessInfoAdapter hmlBusinessInfoAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (hmlBusinessInfoAdapter != null) {
            onGetStartedClick.write((Object) gettimestampseconds, "account");
            Iterator it = hmlBusinessInfoAdapter.MediaBrowserCompat$ItemReceiver.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((getTimestampSeconds) obj).MediaBrowserCompat$SearchResultReceiver == gettimestampseconds.MediaBrowserCompat$SearchResultReceiver) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            getTimestampSeconds gettimestampseconds2 = (getTimestampSeconds) obj;
            if (gettimestampseconds2 != null) {
                hmlBusinessInfoAdapter.MediaBrowserCompat$ItemReceiver.remove(gettimestampseconds2);
            }
            Collection arrayList = new ArrayList();
            for (Object next : hmlBusinessInfoAdapter.MediaBrowserCompat$ItemReceiver) {
                if (((getTimestampSeconds) next).MediaDescriptionCompat == listFilesMatching.ACCOUNT) {
                    arrayList.add(next);
                }
            }
            if (((List) arrayList).size() < hmlBusinessInfoAdapter.read) {
                hmlBusinessInfoAdapter.MediaBrowserCompat$ItemReceiver.add(new getTimestampSeconds(-1, "", "", "", "", "", listFilesMatching.PLACE_HOLDER));
            }
            hmlBusinessInfoAdapter.IconCompatParcelizer.write();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0061, code lost:
        if (r0 < r8) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaBrowserCompat$ItemReceiver(int r8) {
        /*
            r7 = this;
            com.scb.phone.view.adapter.hml.HmlBusinessInfoAdapter r0 = r7.MediaBrowserCompat$CustomActionResultReceiver
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0036
            java.util.List<o.getTimestampSeconds> r0 = r0.MediaBrowserCompat$ItemReceiver
            if (r0 == 0) goto L_0x0036
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Iterator r0 = r0.iterator()
        L_0x0017:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0033
            java.lang.Object r4 = r0.next()
            r5 = r4
            o.getTimestampSeconds r5 = (p040o.getTimestampSeconds) r5
            o.listFilesMatching r5 = r5.MediaDescriptionCompat
            o.listFilesMatching r6 = p040o.listFilesMatching.ACCOUNT
            if (r5 != r6) goto L_0x002c
            r5 = r1
            goto L_0x002d
        L_0x002c:
            r5 = r2
        L_0x002d:
            if (r5 == 0) goto L_0x0017
            r3.add(r4)
            goto L_0x0017
        L_0x0033:
            java.util.List r3 = (java.util.List) r3
            goto L_0x0037
        L_0x0036:
            r3 = 0
        L_0x0037:
            if (r3 == 0) goto L_0x003e
            int r0 = r3.size()
            goto L_0x003f
        L_0x003e:
            r0 = r2
        L_0x003f:
            android.widget.TextView r4 = r7.addAccount
            if (r4 != 0) goto L_0x0048
            java.lang.String r5 = "addAccount"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r5)
        L_0x0048:
            android.view.View r4 = (android.view.View) r4
            if (r0 >= r8) goto L_0x0063
            if (r3 == 0) goto L_0x0056
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r8 = r3.isEmpty()
            r8 = r8 ^ r1
            goto L_0x0057
        L_0x0056:
            r8 = r2
        L_0x0057:
            if (r8 == 0) goto L_0x0063
            com.scb.phone.view.adapter.hml.HmlBusinessInfoAdapter r8 = r7.MediaBrowserCompat$CustomActionResultReceiver
            if (r8 == 0) goto L_0x0060
            int r8 = r8.read
            goto L_0x0061
        L_0x0060:
            r8 = r2
        L_0x0061:
            if (r0 >= r8) goto L_0x0064
        L_0x0063:
            r1 = r2
        L_0x0064:
            java.lang.String r8 = "$this$isVisible"
            p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r8)
            if (r1 == 0) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            r2 = 8
        L_0x006e:
            r4.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.hml.HmlBusinessInformationFragment.MediaBrowserCompat$ItemReceiver(int):void");
    }

    public final void read(List<String> list, int i) {
        onGetStartedClick.write((Object) list, "countriesDisplay");
        CustomSpinnerWithTitle customSpinnerWithTitle = this.incomeSpinner;
        if (customSpinnerWithTitle == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("incomeSpinner");
        }
        customSpinnerWithTitle.setItems(list, true, false);
        CustomSpinnerWithTitle customSpinnerWithTitle2 = this.incomeSpinner;
        if (customSpinnerWithTitle2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("incomeSpinner");
        }
        customSpinnerWithTitle2.setSelectionIndex(i);
        CustomSpinnerWithTitle customSpinnerWithTitle3 = this.incomeSpinner;
        if (customSpinnerWithTitle3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("incomeSpinner");
        }
        customSpinnerWithTitle3.setOnCustomSpinnerWithTitleCompletion(new C5969x80cdf722(this));
    }

    public void onResume() {
        super.onResume();
        setSheetID setsheetid = this.presenter;
        if (setsheetid == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setsheetid.MediaBrowserCompat$ItemReceiver = true;
    }

    public void onDestroyView() {
        setSheetID setsheetid = this.presenter;
        if (setsheetid == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setsheetid.onDestroy();
        super.onDestroyView();
    }

    static final class read extends CheckEligibilityActivity implements FundFactSheetActivity<Boolean, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ HmlBusinessInformationFragment read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        read(HmlBusinessInformationFragment hmlBusinessInformationFragment) {
            super(1);
            this.read = hmlBusinessInformationFragment;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            setSheetID setsheetid = this.read.presenter;
            if (setsheetid == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            setsheetid.MediaBrowserCompat$CustomActionResultReceiver(setSheetID.write.BUSINESS_TYPE, true);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    public final void IconCompatParcelizer(retainSessions retainsessions) {
        String str;
        onGetStartedClick.write((Object) retainsessions, "display");
        getTrimmedNonFatalFiles gettrimmednonfatalfiles = retainsessions.write;
        if (!(gettrimmednonfatalfiles == null || (str = gettrimmednonfatalfiles.read) == null)) {
            TextView textView = this.businessIndustry;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessIndustry");
            }
            textView.setText(str);
        }
        CustomAcceptDeclineButtons customAcceptDeclineButtons = this.businessType;
        if (customAcceptDeclineButtons == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessType");
        }
        TextView textView2 = customAcceptDeclineButtons.tvLabel;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvLabel");
        }
        textView2.setVisibility(8);
        CustomAcceptDeclineButtons customAcceptDeclineButtons2 = this.businessType;
        if (customAcceptDeclineButtons2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessType");
        }
        Button button = customAcceptDeclineButtons2.btAccept;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btAccept");
        }
        button.setText(getString(R.string.hml_business_info_jusristic_button));
        CustomAcceptDeclineButtons customAcceptDeclineButtons3 = this.businessType;
        if (customAcceptDeclineButtons3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessType");
        }
        Button button2 = customAcceptDeclineButtons3.btDecline;
        if (button2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btDecline");
        }
        button2.setText(getString(R.string.hml_business_info_no_juristic_button));
        CustomAcceptDeclineButtons customAcceptDeclineButtons4 = this.businessType;
        if (customAcceptDeclineButtons4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessType");
        }
        customAcceptDeclineButtons4.setOnButtonClickListener(new read(this));
        String str2 = retainsessions.IconCompatParcelizer;
        if (str2 != null) {
            int hashCode = str2.hashCode();
            if (hashCode != -434442161) {
                if (hashCode == 664910589 && str2.equals("JURISTIC")) {
                    CustomAcceptDeclineButtons customAcceptDeclineButtons5 = this.businessType;
                    if (customAcceptDeclineButtons5 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessType");
                    }
                    customAcceptDeclineButtons5.write(true);
                }
            } else if (str2.equals("NON_JURISTIC")) {
                CustomAcceptDeclineButtons customAcceptDeclineButtons6 = this.businessType;
                if (customAcceptDeclineButtons6 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessType");
                }
                customAcceptDeclineButtons6.write(false);
            }
        }
        writeToLog writetolog = retainsessions.MediaMetadataCompat;
        if (writetolog != null) {
            boolean z = writetolog.MediaBrowserCompat$ItemReceiver;
            CheckBox checkBox = this.cbPhysical;
            if (checkBox == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("cbPhysical");
            }
            checkBox.setChecked(z);
        }
        writeToLog writetolog2 = retainsessions.MediaMetadataCompat;
        if (writetolog2 != null) {
            boolean z2 = writetolog2.IconCompatParcelizer;
            CheckBox checkBox2 = this.cbMarketplace;
            if (checkBox2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("cbMarketplace");
            }
            checkBox2.setChecked(z2);
        }
        writeToLog writetolog3 = retainsessions.MediaMetadataCompat;
        if (writetolog3 != null) {
            boolean z3 = writetolog3.MediaBrowserCompat$CustomActionResultReceiver;
            CheckBox checkBox3 = this.cbWebsite;
            if (checkBox3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("cbWebsite");
            }
            checkBox3.setChecked(z3);
        }
        writeSessionUser writesessionuser = retainsessions.MediaBrowserCompat$CustomActionResultReceiver;
        if (writesessionuser != null) {
            boolean z4 = writesessionuser.MediaBrowserCompat$CustomActionResultReceiver;
            CheckBox checkBox4 = this.cbExpansion;
            if (checkBox4 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("cbExpansion");
            }
            checkBox4.setChecked(z4);
        }
        writeSessionUser writesessionuser2 = retainsessions.MediaBrowserCompat$CustomActionResultReceiver;
        if (writesessionuser2 != null) {
            boolean z5 = writesessionuser2.write;
            CheckBox checkBox5 = this.cbCapital;
            if (checkBox5 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("cbCapital");
            }
            checkBox5.setChecked(z5);
        }
        Integer num = retainsessions.MediaBrowserCompat$ItemReceiver;
        if (num != null) {
            int intValue = num.intValue();
            CustomEditText customEditText = this.monthlyIncome;
            if (customEditText == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("monthlyIncome");
            }
            customEditText.setText(String.valueOf(intValue));
        }
    }
}

package com.scb.phone.view.fragment.hml;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.gms.common.internal.ImagesContract;
import com.scb.phone.R;
import com.scb.phone.view.activity.privacypolicy.ScbPrivacyPolicyActivity;
import com.scb.phone.view.activity.privacypolicy.ScbPrivacyPolicyActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.custom.tierpricing.TierPricingSimplePromotionView;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.ActivityBuilder_BindFundActionsSuccessActivity;
import p040o.C6992x633f693d;
import p040o.CrashlyticsController;
import p040o.CrashlyticsReport;
import p040o.DebitCardResetOtpActivity;
import p040o.HmlNTBBusinessURLInformationActivity;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PrepaidActivationService;
import p040o.TextRecognizer;
import p040o.getScanSettings;
import p040o.getScanSettings$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;
import p040o.proxyGetIPassportDeserializerRtti;
import p040o.setAllowCollapse;
import p040o.setTapText;
import p040o.writeToCosFromFile;
import p040o.writeUInt64NoTag;
import p040o.zzct;
import p040o.zzfe;
import p040o.zzjx;

public abstract class HmlSummaryFragment extends BaseFragment implements proxyGetIPassportDeserializerRtti {
    @BindView
    public TextView annualInterest;
    @BindView
    public Button btNextBusiness;
    @BindView
    public Button btNextCustomer;
    @BindView
    public TextView duration;
    @BindView
    public TextView durationValue;
    @BindView
    public TextView dutyStampDisclaimer;
    @BindView
    public View dutyStampSeparator;
    @BindView
    public TextView dutyStampTitle;
    @HmlPinActivity
    public getScanSettings presenter;
    @BindView
    public TextView repaymentDate;
    @BindView
    public TextView requestAmountValue;
    @BindView
    public TextView requestValue;
    @BindView
    public LinearLayout simplePromotionContainer;
    @BindView
    public ImageView step2Image;
    @BindView
    public TextView step2Text;
    @BindView
    public ImageView step3Image;
    @BindView
    public TextView tvLoanPersonalizationButton;
    @BindView
    public TextView tvLoanPersonalizationLabel;
    @BindView
    public TextView tvPrivacyNotice;
    @BindView
    public View vPrivacyNoticeContainer;

    public void IconCompatParcelizer() {
    }

    public void MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public void read() {
    }

    public void write() {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.f88092131494036, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        getScanSettings getscansettings = this.presenter;
        if (getscansettings == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getscansettings.MediaBrowserCompat$ItemReceiver(this);
        getScanSettings getscansettings2 = this.presenter;
        if (getscansettings2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getScanSettings$MediaBrowserCompat$ItemReceiver getscansettings_mediabrowsercompat_itemreceiver = new getScanSettings$MediaBrowserCompat$ItemReceiver(getscansettings2);
        if (getscansettings2.RatingCompat != null) {
            getscansettings2.RatingCompat.AlertController$RecycleListView();
        }
        TextRecognizer textRecognizer = getscansettings2.MediaBrowserCompat$SearchResultReceiver;
        DebitCardResetOtpActivity unused = textRecognizer.MediaBrowserCompat$ItemReceiver(zzfe.zza.PRIVACY_NOTICE, (String) null);
        textRecognizer.IconCompatParcelizer(new getScanSettings.write(getscansettings2, getscansettings_mediabrowsercompat_itemreceiver));
        Bundle arguments = getArguments();
        if (arguments != null) {
            boolean z = arguments.getBoolean("com.scb.phone.EXTRA_LOAN_PERSONALIZATION_SECTION");
            TextView textView = this.tvLoanPersonalizationLabel;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvLoanPersonalizationLabel");
            }
            View view = textView;
            onGetStartedClick.write((Object) view, "$this$isVisible");
            view.setVisibility(z ? 0 : 8);
            TextView textView2 = this.tvLoanPersonalizationButton;
            if (textView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvLoanPersonalizationButton");
            }
            View view2 = textView2;
            onGetStartedClick.write((Object) view2, "$this$isVisible");
            if (!z) {
                i = 8;
            }
            view2.setVisibility(i);
        }
        onGetStartedClick.IconCompatParcelizer((Object) inflate, "inflater.inflate(R.layou…ion(show)\n        }\n    }");
        return inflate;
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        View view = this.vPrivacyNoticeContainer;
        if (view == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("vPrivacyNoticeContainer");
        }
        view.setVisibility(8);
    }

    public final void read(String str) {
        onGetStartedClick.write((Object) str, "privacyContent");
        View view = this.vPrivacyNoticeContainer;
        if (view == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("vPrivacyNoticeContainer");
        }
        view.setVisibility(0);
        TextView textView = this.tvPrivacyNotice;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvPrivacyNotice");
        }
        textView.setText(setAllowCollapse.write(str, 0));
        textView.setMovementMethod(new PrepaidActivationService(new IconCompatParcelizer(this)));
    }

    public static final class IconCompatParcelizer implements C6992x633f693d {
        private /* synthetic */ HmlSummaryFragment IconCompatParcelizer;

        IconCompatParcelizer(HmlSummaryFragment hmlSummaryFragment) {
            this.IconCompatParcelizer = hmlSummaryFragment;
        }

        public final boolean read(String str) {
            onGetStartedClick.write((Object) str, ImagesContract.URL);
            HmlSummaryFragment.read(this.IconCompatParcelizer, str);
            return true;
        }
    }

    public final void read(zzct.zza zza) {
        onGetStartedClick.write((Object) zza, "customerType");
        int i = ActivityBuilder_BindFundActionsSuccessActivity.read[zza.ordinal()];
        if (i == 1) {
            Button button = this.btNextCustomer;
            if (button == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("btNextCustomer");
            }
            button.setVisibility(0);
        } else if (i == 2) {
            Button button2 = this.btNextBusiness;
            if (button2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("btNextBusiness");
            }
            button2.setVisibility(0);
        }
    }

    @OnClick
    public final void submit() {
        getScanSettings getscansettings = this.presenter;
        if (getscansettings == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getscansettings.IconCompatParcelizer();
    }

    @OnClick
    public final void onLoanPersonalizationClick() {
        getScanSettings getscansettings = this.presenter;
        if (getscansettings == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer read = new getScanSettings.read(getscansettings);
        if (getscansettings.RatingCompat != null) {
            read.IconCompatParcelizer(getscansettings.RatingCompat);
        }
    }

    public void onDestroyView() {
        getScanSettings getscansettings = this.presenter;
        if (getscansettings == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getscansettings.onDestroy();
        super.onDestroyView();
    }

    public final void IconCompatParcelizer(String str, String str2) {
        onGetStartedClick.write((Object) str, "rate");
        onGetStartedClick.write((Object) str2, "amount");
        TextView textView = this.dutyStampTitle;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("dutyStampTitle");
        }
        View view = textView;
        onGetStartedClick.write((Object) view, "$this$isVisible");
        view.setVisibility(0);
        TextView textView2 = this.dutyStampDisclaimer;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("dutyStampDisclaimer");
        }
        View view2 = textView2;
        onGetStartedClick.write((Object) view2, "$this$isVisible");
        view2.setVisibility(0);
        View view3 = this.dutyStampSeparator;
        if (view3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("dutyStampSeparator");
        }
        onGetStartedClick.write((Object) view3, "$this$isVisible");
        view3.setVisibility(0);
        TextView textView3 = this.dutyStampTitle;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("dutyStampTitle");
        }
        textView3.setText(getString(R.string.hml_summary_duty_stamp_title, str));
        TextView textView4 = this.dutyStampDisclaimer;
        if (textView4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("dutyStampDisclaimer");
        }
        textView4.setText(getString(R.string.hml_summary_duty_stamp_disclaimer, str, str2));
    }

    public static final /* synthetic */ void read(HmlSummaryFragment hmlSummaryFragment, String str) {
        Context context = hmlSummaryFragment.getContext();
        if (context != null) {
            ScbPrivacyPolicyActivity$MediaBrowserCompat$ItemReceiver scbPrivacyPolicyActivity$MediaBrowserCompat$ItemReceiver = ScbPrivacyPolicyActivity.MediaBrowserCompat$MediaItem;
            onGetStartedClick.IconCompatParcelizer((Object) context, "it");
            Intent read = ScbPrivacyPolicyActivity$MediaBrowserCompat$ItemReceiver.read(context, str, (String) null);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = hmlSummaryFragment.getActivity();
                if (activity != null) {
                    read = setTapText.write(activity, read).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(read.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                hmlSummaryFragment.startActivity(read);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(zzjx.zza.zzb zzb) {
        onGetStartedClick.write((Object) zzb, "productType");
        onGetStartedClick.write((Object) zzb, "productType");
    }

    public final void MediaBrowserCompat$ItemReceiver(CrashlyticsController.C322216 r8) {
        List<CrashlyticsReport.FilesPayload.Builder> list;
        CrashlyticsReport.FilesPayload.Builder builder;
        onGetStartedClick.write((Object) r8, "summaryDisplay");
        writeToCosFromFile writetocosfromfile = r8.write;
        TextView textView = this.requestValue;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("requestValue");
        }
        textView.setText(getString(R.string.hml_summary_request_value, r8.MediaBrowserCompat$ItemReceiver));
        TextView textView2 = this.requestAmountValue;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("requestAmountValue");
        }
        textView2.setText(getString(R.string.hml_summary_request_amount_value, writetocosfromfile.IconCompatParcelizer, writetocosfromfile.MediaBrowserCompat$CustomActionResultReceiver));
        TextView textView3 = this.repaymentDate;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("repaymentDate");
        }
        textView3.setText(r8.RatingCompat);
        TextView textView4 = this.duration;
        if (textView4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("duration");
        }
        textView4.setText(getString(R.string.hml_summary_duration));
        TextView textView5 = this.durationValue;
        if (textView5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("durationValue");
        }
        textView5.setText(getString(R.string.hml_summary_duration_value, r8.read, writetocosfromfile.write));
        TextView textView6 = this.annualInterest;
        if (textView6 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("annualInterest");
        }
        textView6.setText(getString(R.string.hml_summary_duration_description, r8.IconCompatParcelizer));
        Context context = getContext();
        if (context != null && (list = r8.MediaBrowserCompat$SearchResultReceiver) != null) {
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if (((CrashlyticsReport.FilesPayload.Builder) next).read) {
                    arrayList.add(next);
                }
            }
            List list2 = (List) arrayList;
            if (!(!list2.isEmpty())) {
                list2 = null;
            }
            if (list2 != null && (builder = (CrashlyticsReport.FilesPayload.Builder) HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$ItemReceiver(list2)) != null) {
                onGetStartedClick.IconCompatParcelizer((Object) context, "it");
                TierPricingSimplePromotionView tierPricingSimplePromotionView = new TierPricingSimplePromotionView(context, (AttributeSet) null, 6, (byte) 0);
                tierPricingSimplePromotionView.setDisplay(builder);
                FrameLayout frameLayout = tierPricingSimplePromotionView.divider;
                if (frameLayout == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("divider");
                }
                View view = frameLayout;
                onGetStartedClick.write((Object) view, "$this$isVisible");
                view.setVisibility(0);
                tierPricingSimplePromotionView.setRemarkTextColor(R.color.f66182131099773);
                LinearLayout linearLayout = this.simplePromotionContainer;
                if (linearLayout == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("simplePromotionContainer");
                }
                linearLayout.addView(tierPricingSimplePromotionView);
            }
        }
    }
}

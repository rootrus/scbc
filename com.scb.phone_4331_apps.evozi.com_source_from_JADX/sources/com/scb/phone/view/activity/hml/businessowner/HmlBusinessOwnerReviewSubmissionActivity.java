package com.scb.phone.view.activity.hml.businessowner;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.hml.businessowner.HmlBusinessOwnerSubmissionReviewStepTwoActivity;
import com.scb.phone.view.custom.tierpricing.TierPricingSimplePromotionView;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.C3953x80677f69;
import p040o.CrashlyticsController;
import p040o.CrashlyticsReport;
import p040o.FundFactSheetActivity;
import p040o.GoodToKnowActivity;
import p040o.HmlNTBBusinessURLInformationActivity;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.WebServiceCallResult;
import p040o.WebServiceCallResult$MediaBrowserCompat$ItemReceiver;
import p040o.ZSYR2K;
import p040o.getLastInNonemptyList$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;
import p040o.onUncaughtException;
import p040o.proxyGetOnDeviceExceptionResponseDeserializer;
import p040o.removeNode;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class HmlBusinessOwnerReviewSubmissionActivity extends BaseActivity implements proxyGetOnDeviceExceptionResponseDeserializer {
    public static final C5625x9ac9705b MediaBrowserCompat$SearchResultReceiver = new C5625x9ac9705b((byte) 0);
    @HmlPinActivity
    public WebServiceCallResult presenter;
    @BindView
    public TierPricingSimplePromotionView tierPricing;
    @BindView
    public TextView tvAddress;
    @BindView
    public TextView tvDuration;
    @BindView
    public TextView tvDurationDescription;
    @BindView
    public TextView tvDutyDescription;
    @BindView
    public TextView tvDutyLabel;
    @BindView
    public TextView tvEducation;
    @BindView
    public TextView tvEmail;
    @BindView
    public TextView tvExpiry;
    @BindView
    public TextView tvLaserId;
    @BindView
    public TextView tvMarital;
    @BindView
    public TextView tvMobile;
    @BindView
    public TextView tvName;
    @BindView
    public TextView tvProfession;
    @BindView
    public TextView tvProfessionHeader;
    @BindView
    public TextView tvProfessionLabel;
    @BindView
    public TextView tvRepaymentAmount;
    @BindView
    public TextView tvRequestedLoan;
    @BindView
    public TextView tvResidential;
    @BindView
    public TextView tvSpouseHeader;
    @BindView
    public TextView tvSpouseId;
    @BindView
    public TextView tvSpouseIdLabel;
    @BindView
    public TextView tvSpouseName;
    @BindView
    public TextView tvSpouseNameLabel;
    @BindView
    public TextView tvStartRepayment;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f78272131493052);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.hml_review_title));
        setTabContainer();
        boolean z = true;
        this.scbAnalytics.write("p10x1_business_review_submission_1", new ZSYR2K("user_type", "etb"));
        WebServiceCallResult webServiceCallResult = this.presenter;
        if (webServiceCallResult == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        webServiceCallResult.MediaBrowserCompat$ItemReceiver(this);
        WebServiceCallResult webServiceCallResult2 = this.presenter;
        if (webServiceCallResult2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (webServiceCallResult2.RatingCompat == null) {
            z = false;
        }
        if (z) {
            webServiceCallResult2.RatingCompat.AlertController$RecycleListView();
        }
        removeNode removenode = webServiceCallResult2.write;
        FundFactSheetActivity read = new WebServiceCallResult.read(webServiceCallResult2);
        FundFactSheetActivity webServiceCallResult$MediaBrowserCompat$CustomActionResultReceiver = new C3953x80677f69(webServiceCallResult2);
        FundFactSheetActivity write = new WebServiceCallResult.write(webServiceCallResult2);
        onGetStartedClick.write((Object) read, "onSuccess");
        onGetStartedClick.write((Object) webServiceCallResult$MediaBrowserCompat$CustomActionResultReceiver, "onError");
        onGetStartedClick.write((Object) write, "transform");
        removenode.read.read(read, webServiceCallResult$MediaBrowserCompat$CustomActionResultReceiver, new getLastInNonemptyList$MediaBrowserCompat$ItemReceiver(), write, removenode.MediaBrowserCompat$ItemReceiver);
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.hml_review_title));
        setTabContainer();
    }

    public final void write(onUncaughtException onuncaughtexception) {
        onGetStartedClick.write((Object) onuncaughtexception, "data");
        HmlBusinessOwnerSubmissionReviewStepTwoActivity.write write = HmlBusinessOwnerSubmissionReviewStepTwoActivity.MediaBrowserCompat$SearchResultReceiver;
        Context context = this;
        String stringExtra = getIntent().getStringExtra("intent");
        onGetStartedClick.write((Object) context, "context");
        Intent putExtra = new Intent(context, HmlBusinessOwnerSubmissionReviewStepTwoActivity.class).putExtra("EXTRA_DISPLAY", onuncaughtexception).putExtra("INTENT_VALUE", stringExtra);
        onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, HmlBusin…NTENT_VALUE, intentValue)");
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, putExtra).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(CrashlyticsController.C32313 r14, String str) {
        CharSequence charSequence;
        String str2;
        CrashlyticsReport.FilesPayload.Builder builder;
        onGetStartedClick.write((Object) r14, "data");
        onGetStartedClick.write((Object) str, "userLanguage");
        TextView textView = this.tvRequestedLoan;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRequestedLoan");
        }
        textView.setText(getString(R.string.hml_business_owner_review_loan_amount, new Object[]{r14.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver}));
        TextView textView2 = this.tvRepaymentAmount;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRepaymentAmount");
        }
        textView2.setText(getString(R.string.hml_business_owner_review_repayment_amount, new Object[]{r14.IconCompatParcelizer.write.IconCompatParcelizer, r14.IconCompatParcelizer.write.MediaBrowserCompat$CustomActionResultReceiver}));
        TextView textView3 = this.tvDuration;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvDuration");
        }
        textView3.setText(getString(R.string.hml_business_owner_review_repayment_term_amount, new Object[]{r14.IconCompatParcelizer.read, r14.IconCompatParcelizer.write.write}));
        TextView textView4 = this.tvDurationDescription;
        if (textView4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvDurationDescription");
        }
        textView4.setText(getString(R.string.hml_business_owner_review_repayment_term_description, new Object[]{r14.IconCompatParcelizer.IconCompatParcelizer}));
        TextView textView5 = this.tvStartRepayment;
        if (textView5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvStartRepayment");
        }
        textView5.setText(r14.IconCompatParcelizer.RatingCompat);
        TextView textView6 = this.tvDutyLabel;
        if (textView6 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvDutyLabel");
        }
        textView6.setText(getString(R.string.hml_business_owner_review_duty_label, new Object[]{r14.read.read}));
        TextView textView7 = this.tvDutyDescription;
        if (textView7 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvDutyDescription");
        }
        textView7.setText(getString(R.string.hml_business_owner_review_duty_description, new Object[]{r14.read.read, r14.read.IconCompatParcelizer}));
        List<CrashlyticsReport.FilesPayload.Builder> list = r14.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver;
        String str3 = null;
        if (list != null) {
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
            if (!(list2 == null || (builder = (CrashlyticsReport.FilesPayload.Builder) HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$ItemReceiver(list2)) == null)) {
                TierPricingSimplePromotionView tierPricingSimplePromotionView = this.tierPricing;
                if (tierPricingSimplePromotionView == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("tierPricing");
                }
                tierPricingSimplePromotionView.setDisplay(builder);
                tierPricingSimplePromotionView.setRemarkTextColor(R.color.f66182131099773);
                tierPricingSimplePromotionView.setVisibility(0);
            }
        }
        if (r14.MediaBrowserCompat$CustomActionResultReceiver.f2692x50fd9e4a != null) {
            TextView textView8 = this.tvProfession;
            if (textView8 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvProfession");
            }
            textView8.setText(r14.MediaBrowserCompat$CustomActionResultReceiver.f2692x50fd9e4a);
        } else {
            TextView textView9 = this.tvProfession;
            if (textView9 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvProfession");
            }
            textView9.setVisibility(8);
            TextView textView10 = this.tvProfessionLabel;
            if (textView10 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvProfessionLabel");
            }
            textView10.setVisibility(8);
            TextView textView11 = this.tvProfessionHeader;
            if (textView11 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvProfessionHeader");
            }
            textView11.setVisibility(8);
        }
        TextView textView12 = this.tvName;
        if (textView12 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvName");
        }
        if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(str, "TH", true)) {
            charSequence = r14.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver;
        } else {
            charSequence = r14.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        }
        textView12.setText(charSequence);
        TextView textView13 = this.tvAddress;
        if (textView13 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvAddress");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$ItemReceiver(r14.MediaBrowserCompat$ItemReceiver.read, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (FundFactSheetActivity) null, 62));
        textView13.setText(sb.toString());
        TextView textView14 = this.tvEmail;
        if (textView14 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvEmail");
        }
        textView14.setText(r14.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer);
        TextView textView15 = this.tvMobile;
        if (textView15 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvMobile");
        }
        textView15.setText(r14.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem);
        if (r14.MediaDescriptionCompat != null) {
            TextView textView16 = this.tvSpouseId;
            if (textView16 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvSpouseId");
            }
            CrashlyticsController.C32335 r1 = r14.MediaDescriptionCompat;
            if (r1 != null) {
                str2 = r1.IconCompatParcelizer;
            } else {
                str2 = null;
            }
            textView16.setText(str2);
            TextView textView17 = this.tvSpouseName;
            if (textView17 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvSpouseName");
            }
            CrashlyticsController.C32335 r0 = r14.MediaDescriptionCompat;
            if (r0 != null) {
                str3 = r0.write;
            }
            textView17.setText(str3);
        } else {
            TextView textView18 = this.tvSpouseHeader;
            if (textView18 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvSpouseHeader");
            }
            textView18.setVisibility(8);
            TextView textView19 = this.tvSpouseId;
            if (textView19 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvSpouseId");
            }
            textView19.setVisibility(8);
            TextView textView20 = this.tvSpouseIdLabel;
            if (textView20 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvSpouseIdLabel");
            }
            textView20.setVisibility(8);
            TextView textView21 = this.tvSpouseName;
            if (textView21 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvSpouseName");
            }
            textView21.setVisibility(8);
            TextView textView22 = this.tvSpouseNameLabel;
            if (textView22 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvSpouseNameLabel");
            }
            textView22.setVisibility(8);
        }
        TextView textView23 = this.tvExpiry;
        if (textView23 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvExpiry");
        }
        textView23.setText(r14.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver);
        TextView textView24 = this.tvLaserId;
        if (textView24 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvLaserId");
        }
        textView24.setText(r14.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.write);
        TextView textView25 = this.tvMarital;
        if (textView25 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvMarital");
        }
        textView25.setText(r14.MediaBrowserCompat$ItemReceiver.MediaMetadataCompat);
        TextView textView26 = this.tvResidential;
        if (textView26 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvResidential");
        }
        textView26.setText(r14.MediaBrowserCompat$ItemReceiver.RatingCompat);
        TextView textView27 = this.tvEducation;
        if (textView27 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvEducation");
        }
        textView27.setText(r14.MediaBrowserCompat$ItemReceiver.write);
    }

    @OnClick
    public final void onNextClicked() {
        WebServiceCallResult webServiceCallResult = this.presenter;
        if (webServiceCallResult == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        onUncaughtException onuncaughtexception = webServiceCallResult.MediaBrowserCompat$ItemReceiver;
        if (onuncaughtexception != null) {
            writeUInt64NoTag.IconCompatParcelizer webServiceCallResult$MediaBrowserCompat$ItemReceiver = new WebServiceCallResult$MediaBrowserCompat$ItemReceiver(onuncaughtexception);
            if (webServiceCallResult.RatingCompat != null) {
                webServiceCallResult$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(webServiceCallResult.RatingCompat);
            }
        }
    }
}

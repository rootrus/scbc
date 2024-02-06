package com.scb.phone.view.fragment.prepaid.request;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager$MediaBrowserCompat$MediaItem;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.prepaid.request.C5699x8a3f8ad4;
import com.scb.phone.view.activity.prepaid.request.PrepaidRequestMailingAddressActivity;
import com.scb.phone.view.activity.prepaid.request.PrepaidRequestTermConditionsActivity;
import com.scb.phone.view.adapter.accountsummary.ErrorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;
import com.scb.phone.view.fragment.BaseFragment;
import com.scb.phone.view.fragment.transferandpay.AccountSourceSelectFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.HashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import p040o.AutoValue_CrashlyticsReport_CustomAttribute;
import p040o.C3449x3b9e8dd2;
import p040o.C7534ua;
import p040o.CardView;
import p040o.CheckEligibilityActivity;
import p040o.CrashlyticsReport;
import p040o.FundActionsSuccessActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlNationalIdActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.IFaceDetector;
import p040o.IFaceDetector$MediaBrowserCompat$ItemReceiver;
import p040o.ImmutableCollection;
import p040o.MyECouponActivity_ViewBinding;
import p040o.Platform;
import p040o.ZHER2K;
import p040o.ZTBSV;
import p040o.getCasaDetails;
import p040o.getKernelIDDstAtop;
import p040o.getLog;
import p040o.getTimestamp;
import p040o.hashCodeImpl;
import p040o.onGetStartedClick;
import p040o.removeAllReports;
import p040o.setTapText;
import p040o.writeUInt64NoTag;
import p059me.relex.circleindicator.CircleIndicator;

public final class PrepaidRequestInputFragment extends BaseFragment implements C7534ua.write, AccountSourceSelectFragment.write {
    public static final PrepaidRequestInputFragment$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver = new PrepaidRequestInputFragment$MediaBrowserCompat$ItemReceiver((byte) 0);
    private HashMap IconCompatParcelizer;
    private getCasaDetails MediaBrowserCompat$SearchResultReceiver = new getCasaDetails(HmlNationalIdActivity.IconCompatParcelizer);
    private final HmlVerifyEmailActivity MediaMetadataCompat;
    @BindView
    public TextView mailingAddressText;
    @BindView
    public ConstraintLayout prepaidLayout;
    @HmlPinActivity
    public IFaceDetector presenter;

    static final class read implements DialogInterface.OnClickListener {
        public static final read IconCompatParcelizer = new read();

        read() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    private View MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = new HashMap();
        }
        View view = (View) this.IconCompatParcelizer.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.IconCompatParcelizer.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final /* synthetic */ void MediaSessionCompat$ResultReceiverWrapper() {
    }

    /* renamed from: c_ */
    public final /* synthetic */ void mo13978c_(boolean z) {
    }

    public PrepaidRequestInputFragment() {
        FundActionsSuccessActivity fundActionsSuccessActivity = IconCompatParcelizer.write;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.MediaMetadataCompat = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.f88932131494120, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.read = ButterKnife.IconCompatParcelizer(this, view);
        IFaceDetector iFaceDetector = this.presenter;
        if (iFaceDetector == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        iFaceDetector.MediaBrowserCompat$ItemReceiver(this);
        ViewPager viewPager = (ViewPager) MediaBrowserCompat$CustomActionResultReceiver(ZHER2K.write.cardViewPager);
        onGetStartedClick.IconCompatParcelizer((Object) viewPager, "cardViewPager");
        viewPager.setAdapter(this.MediaBrowserCompat$SearchResultReceiver);
        ((ViewPager) MediaBrowserCompat$CustomActionResultReceiver(ZHER2K.write.cardViewPager)).addOnPageChangeListener(new write(this));
        ((CircleIndicator) MediaBrowserCompat$CustomActionResultReceiver(ZHER2K.write.indicator)).setViewPager((ViewPager) MediaBrowserCompat$CustomActionResultReceiver(ZHER2K.write.cardViewPager));
        getCasaDetails getcasadetails = this.MediaBrowserCompat$SearchResultReceiver;
        CircleIndicator circleIndicator = (CircleIndicator) MediaBrowserCompat$CustomActionResultReceiver(ZHER2K.write.indicator);
        onGetStartedClick.IconCompatParcelizer((Object) circleIndicator, "indicator");
        getcasadetails.registerDataSetObserver(circleIndicator.MediaBrowserCompat$CustomActionResultReceiver);
        ((CustomTransferAndPayItem) MediaBrowserCompat$CustomActionResultReceiver(ZHER2K.write.annualFeeSection)).setDescriptionText(getString(R.string.prepaid_request_input_annual_fee_description));
        ((CustomTransferAndPayItem) MediaBrowserCompat$CustomActionResultReceiver(ZHER2K.write.annualFeeSection)).scheduleFeeText.setVisibility(0);
        ((CustomTransferAndPayItem) MediaBrowserCompat$CustomActionResultReceiver(ZHER2K.write.annualFeeSection)).setDescriptionAlignToLeft();
        IFaceDetector iFaceDetector2 = this.presenter;
        if (iFaceDetector2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (iFaceDetector2.RatingCompat != null) {
            iFaceDetector2.RatingCompat.AlertController$RecycleListView();
        }
        hashCodeImpl hashcodeimpl = iFaceDetector2.write;
        FundFactSheetActivity mediaMetadataCompat = new IFaceDetector.MediaMetadataCompat(iFaceDetector2);
        FundFactSheetActivity iFaceDetector$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = new C3449x3b9e8dd2(iFaceDetector2);
        ImmutableCollection.ArrayImmutableCollection arrayImmutableCollection = new ImmutableCollection.ArrayImmutableCollection((byte) 0);
        onGetStartedClick.write((Object) mediaMetadataCompat, "onSuccess");
        onGetStartedClick.write((Object) iFaceDetector$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver, "onError");
        onGetStartedClick.write((Object) arrayImmutableCollection, "request");
        hashcodeimpl.IconCompatParcelizer(hashcodeimpl.IconCompatParcelizer, mediaMetadataCompat, iFaceDetector$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver, new Platform.C37291.write(arrayImmutableCollection));
    }

    public static final class write extends ViewPager$MediaBrowserCompat$MediaItem {
        private /* synthetic */ PrepaidRequestInputFragment MediaBrowserCompat$ItemReceiver;

        write(PrepaidRequestInputFragment prepaidRequestInputFragment) {
            this.MediaBrowserCompat$ItemReceiver = prepaidRequestInputFragment;
        }

        public final void onPageSelected(int i) {
            IFaceDetector iFaceDetector = this.MediaBrowserCompat$ItemReceiver.presenter;
            if (iFaceDetector == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            iFaceDetector.MediaBrowserCompat$CustomActionResultReceiver(i);
        }
    }

    public final void IconCompatParcelizer(CrashlyticsReport.FilesPayload.File file) {
        onGetStartedClick.write((Object) file, "accountSourceSelectDisplay");
        CardView read2 = getChildFragmentManager().read();
        onGetStartedClick.IconCompatParcelizer((Object) read2, "childFragmentManager.beginTransaction()");
        read2.MediaBrowserCompat$ItemReceiver(R.id.fragment_account_source_select, AccountSourceSelectFragment.write(file, ErrorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver.AUTO_RESIZE_MESSAGE_ERROR));
        read2.write();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReport.FilesPayload.File.Builder builder) {
        IFaceDetector iFaceDetector = this.presenter;
        if (iFaceDetector == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        iFaceDetector.IconCompatParcelizer = builder;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = IFaceDetector$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
        if (iFaceDetector.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(iFaceDetector.RatingCompat);
        }
    }

    public final void IconCompatParcelizer(List<? extends removeAllReports> list) {
        onGetStartedClick.write((Object) list, "cardCustomDisplayList");
        getCasaDetails getcasadetails = this.MediaBrowserCompat$SearchResultReceiver;
        onGetStartedClick.write((Object) list, "displays");
        getcasadetails.MediaBrowserCompat$ItemReceiver = list;
        getcasadetails.notifyDataSetChanged();
    }

    public final void IconCompatParcelizer(boolean z) {
        int i;
        CircleIndicator circleIndicator = (CircleIndicator) MediaBrowserCompat$CustomActionResultReceiver(ZHER2K.write.indicator);
        onGetStartedClick.IconCompatParcelizer((Object) circleIndicator, "indicator");
        if (z) {
            i = 0;
        } else if (!z) {
            i = 8;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        circleIndicator.setVisibility(i);
    }

    public final void write() {
        ConstraintLayout constraintLayout = this.prepaidLayout;
        if (constraintLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("prepaidLayout");
        }
        constraintLayout.setVisibility(0);
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, "annualFee");
        ((CustomTransferAndPayItem) MediaBrowserCompat$CustomActionResultReceiver(ZHER2K.write.annualFeeSection)).setValue(str);
    }

    public final void IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, "issuingFee");
        ((CustomTransferAndPayItem) MediaBrowserCompat$CustomActionResultReceiver(ZHER2K.write.issuingFeeSection)).setValue(str);
    }

    public final void read(String str) {
        onGetStartedClick.write((Object) str, "deliveryFee");
        ((CustomTransferAndPayItem) MediaBrowserCompat$CustomActionResultReceiver(ZHER2K.write.deliveryFeeSection)).setValue(str);
    }

    public final void MediaDescriptionCompat(String str) {
        onGetStartedClick.write((Object) str, "mailingAddress");
        TextView textView = this.mailingAddressText;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mailingAddressText");
        }
        textView.setText(str);
    }

    public final void IconCompatParcelizer() {
        Button button = (Button) MediaBrowserCompat$CustomActionResultReceiver(ZHER2K.write.reviewButton);
        onGetStartedClick.IconCompatParcelizer((Object) button, "reviewButton");
        button.setEnabled(true);
    }

    @OnClick
    public final void onReviewButtonClicked() {
        CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer(getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.confirm_mailing_title).IconCompatParcelizer((int) R.string.confirm_mailing_text);
        CustomDialog IconCompatParcelizer3 = IconCompatParcelizer2.IconCompatParcelizer(IconCompatParcelizer2.read.getString(R.string.ok), new C9460x62694f67(this));
        IconCompatParcelizer3.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer3.read.getString(R.string.cancel), read.IconCompatParcelizer).show();
    }

    @OnClick
    public final void onClickedChangeMailingAddress() {
        IFaceDetector iFaceDetector = this.presenter;
        if (iFaceDetector == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer write2 = new IFaceDetector.write(iFaceDetector);
        if (iFaceDetector.RatingCompat != null) {
            write2.IconCompatParcelizer(iFaceDetector.RatingCompat);
        }
    }

    public final void IconCompatParcelizer(AutoValue_CrashlyticsReport_CustomAttribute autoValue_CrashlyticsReport_CustomAttribute) {
        onGetStartedClick.write((Object) autoValue_CrashlyticsReport_CustomAttribute, "mailingAddressDisplay");
        Context context = getContext();
        if (context != null) {
            C5699x8a3f8ad4 prepaidRequestMailingAddressActivity$MediaBrowserCompat$ItemReceiver = PrepaidRequestMailingAddressActivity.MediaDescriptionCompat;
            onGetStartedClick.IconCompatParcelizer((Object) context, "it");
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) autoValue_CrashlyticsReport_CustomAttribute, "mailingAddressDisplay");
            Intent intent = new Intent(context, PrepaidRequestMailingAddressActivity.class);
            intent.putExtra("EXTRA_PREPAID_REQUEST_MAILING_ADDRESS", autoValue_CrashlyticsReport_CustomAttribute);
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
                startActivityForResult(intent, 1112);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        r2 = r4.getExtras();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r2, int r3, android.content.Intent r4) {
        /*
            r1 = this;
            super.onActivityResult(r2, r3, r4)
            r0 = 1112(0x458, float:1.558E-42)
            if (r2 != r0) goto L_0x0045
            r2 = -1
            if (r3 != r2) goto L_0x0045
            com.scb.phone.view.activity.prepaid.request.PrepaidRequestMailingAddressActivity$MediaBrowserCompat$ItemReceiver r2 = com.scb.phone.view.activity.prepaid.request.PrepaidRequestMailingAddressActivity.MediaDescriptionCompat
            if (r4 == 0) goto L_0x001d
            android.os.Bundle r2 = r4.getExtras()
            if (r2 == 0) goto L_0x001d
            java.lang.String r3 = "EXTRA_PREPAID_REQUEST_MAILING_ADDRESS"
            android.os.Parcelable r2 = r2.getParcelable(r3)
            o.getRam r2 = (p040o.getRam) r2
            goto L_0x001e
        L_0x001d:
            r2 = 0
        L_0x001e:
            if (r2 == 0) goto L_0x0045
            o.IFaceDetector r3 = r1.presenter
            if (r3 != 0) goto L_0x0029
            java.lang.String r4 = "presenter"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r4)
        L_0x0029:
            java.lang.String r4 = "mailingAddressDisplay"
            p040o.onGetStartedClick.write((java.lang.Object) r2, (java.lang.String) r4)
            r3.read = r2
            o.IFaceDetector$IconCompatParcelizer r4 = new o.IFaceDetector$IconCompatParcelizer
            r4.<init>(r3, r2)
            o.writeUInt64NoTag$IconCompatParcelizer r4 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r4
            T r2 = r3.RatingCompat
            if (r2 == 0) goto L_0x003d
            r2 = 1
            goto L_0x003e
        L_0x003d:
            r2 = 0
        L_0x003e:
            if (r2 == 0) goto L_0x0045
            T r2 = r3.RatingCompat
            r4.IconCompatParcelizer(r2)
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.prepaid.request.PrepaidRequestInputFragment.onActivityResult(int, int, android.content.Intent):void");
    }

    public final void read() {
        ConstraintLayout constraintLayout = (ConstraintLayout) MediaBrowserCompat$CustomActionResultReceiver(ZHER2K.write.prepaid_layout);
        onGetStartedClick.IconCompatParcelizer((Object) constraintLayout, "prepaid_layout");
        constraintLayout.setVisibility(8);
        View MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(ZHER2K.write.layout_empty_state);
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$CustomActionResultReceiver2, "layout_empty_state");
        MediaBrowserCompat$CustomActionResultReceiver2.setVisibility(0);
        ((TextView) MediaBrowserCompat$CustomActionResultReceiver(ZHER2K.write.card_empty_state_header)).setText(R.string.prepaid_request_duplicate_card);
        TextView textView = (TextView) MediaBrowserCompat$CustomActionResultReceiver(ZHER2K.write.card_empty_state_footer);
        onGetStartedClick.IconCompatParcelizer((Object) textView, "card_empty_state_footer");
        textView.setVisibility(8);
    }

    public final void onDestroyView() {
        IFaceDetector iFaceDetector = this.presenter;
        if (iFaceDetector == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        iFaceDetector.onDestroy();
        super.onDestroyView();
        HashMap hashMap = this.IconCompatParcelizer;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundActionsSuccessActivity<getKernelIDDstAtop> {
        public static final IconCompatParcelizer write = new IconCompatParcelizer();

        IconCompatParcelizer() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new getKernelIDDstAtop();
        }
    }

    public final void read(getTimestamp gettimestamp, getLog getlog) {
        onGetStartedClick.write((Object) gettimestamp, "prepaidRequestVerificationDisplay");
        onGetStartedClick.write((Object) getlog, "prepaidDisplay");
        ZTBSV ztbsv = (getKernelIDDstAtop) this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver();
        if (getActivity() != null) {
            ztbsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "planetscb_request_review");
        }
        Context context = getContext();
        if (context != null) {
            PrepaidRequestTermConditionsActivity.IconCompatParcelizer iconCompatParcelizer = PrepaidRequestTermConditionsActivity.MediaBrowserCompat$MediaItem;
            onGetStartedClick.IconCompatParcelizer((Object) context, "it");
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) gettimestamp, "prepaidRequestVerificationDisplay");
            onGetStartedClick.write((Object) getlog, "prepaidRequestLandingDisplay");
            Intent intent = new Intent(context, PrepaidRequestTermConditionsActivity.class);
            intent.putExtra("EXTRAS_PREPAID_REQUEST_VERIFICATION_DISPLAY", gettimestamp);
            intent.putExtra("EXTRAS_PREPAID_REQUEST_LANDING_DISPLAY", getlog);
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
}

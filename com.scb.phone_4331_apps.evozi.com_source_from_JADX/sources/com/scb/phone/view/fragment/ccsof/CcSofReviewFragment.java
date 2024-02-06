package com.scb.phone.view.fragment.ccsof;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.components.ItemCustom;
import com.scb.phone.view.activity.ccsof.C5578x4c901875;
import com.scb.phone.view.activity.ccsof.CcSofReviewTermsAndConditionsActivity;
import com.scb.phone.view.activity.ccsof.CcSofSuccessActivity;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.ArrayList;
import java.util.List;
import p040o.ForwardingFuture;
import p040o.HmlPinActivity;
import p040o.Iterables;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZHPR2;
import p040o.ZHPR2$MediaBrowserCompat$ItemReceiver;
import p040o.ZTRMM;
import p040o.getActualTypeArguments;
import p040o.getIExceptionResponseDeserializerOnDevice;
import p040o.getUserId;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.standardStartAndWait;
import p040o.writeUInt64NoTag;

public final class CcSofReviewFragment extends BaseFragment implements getIExceptionResponseDeserializerOnDevice.IconCompatParcelizer {
    public static final CcSofReviewFragment$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver = new CcSofReviewFragment$MediaBrowserCompat$ItemReceiver((byte) 0);
    private ZTRMM IconCompatParcelizer;
    @HmlPinActivity
    public getActualTypeArguments ccSofReviewFragmentPresenter;
    @BindView
    public Button confirmButton;
    @BindView
    public LinearLayout itemContainer;
    @HmlPinActivity
    public Iterables.C352414 mComponentFactory;
    @BindView
    public CheckBox reviewTcCheck;
    @BindView
    public LinearLayout reviewTcLayout;
    @BindView
    public TextView reviewTcText;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f86092131493836, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        getActualTypeArguments getactualtypearguments = this.ccSofReviewFragmentPresenter;
        if (getactualtypearguments == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ccSofReviewFragmentPresenter");
        }
        getactualtypearguments.MediaBrowserCompat$ItemReceiver(this);
        this.IconCompatParcelizer = new ZTRMM();
        return inflate;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityCreated(android.os.Bundle r21) {
        /*
            r20 = this;
            super.onActivityCreated(r21)
            android.os.Bundle r0 = r20.getArguments()
            r1 = 0
            if (r0 == 0) goto L_0x0013
            java.lang.String r2 = "EXTRA_CCSOF_INPUT_DISPLAY"
            android.os.Parcelable r0 = r0.getParcelable(r2)
            o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception$1 r0 = (p040o.C3080xc2f5febc.C30811) r0
            goto L_0x0014
        L_0x0013:
            r0 = r1
        L_0x0014:
            if (r0 == 0) goto L_0x010f
            r2 = r20
            o.getActualTypeArguments r3 = r2.ccSofReviewFragmentPresenter
            if (r3 != 0) goto L_0x0021
            java.lang.String r4 = "ccSofReviewFragmentPresenter"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r4)
        L_0x0021:
            java.lang.String r4 = "purchaseCcSInputDisplay"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r4)
            r3.MediaBrowserCompat$MediaItem = r0
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r4)
            o.getFrames r4 = r0.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r4 = r4.IconCompatParcelizer
            o.CrashlyticsReportJsonTransform$$Lambda$9 r5 = p040o.CrashlyticsReportJsonTransform$$Lambda$9.CREDIT_CARD_INSTALLMENT_PAYMENT_PLAN
            java.lang.String r5 = r5.code
            r6 = 0
            boolean r4 = p040o.GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(r4, r5, r6)
            if (r4 == 0) goto L_0x004d
            o.lambda$processSetComponents$1 r4 = r0.IconCompatParcelizer
            o.ComponentDiscovery$MetadataRegistrarNameRetriever r4 = r4.MediaBrowserCompat$CustomActionResultReceiver
            if (r4 == 0) goto L_0x0043
            java.lang.String r4 = r4.MediaBrowserCompat$CustomActionResultReceiver
            goto L_0x0044
        L_0x0043:
            r4 = r1
        L_0x0044:
            o.lambda$processSetComponents$1 r5 = r0.IconCompatParcelizer
            o.ComponentDiscovery$MetadataRegistrarNameRetriever r5 = r5.MediaBrowserCompat$CustomActionResultReceiver
            if (r5 == 0) goto L_0x0061
            java.lang.Double r5 = r5.read
            goto L_0x005f
        L_0x004d:
            o.lambda$processSetComponents$1 r4 = r0.IconCompatParcelizer
            o.retrieve r4 = r4.read
            if (r4 == 0) goto L_0x0056
            java.lang.String r4 = r4.MediaBrowserCompat$ItemReceiver
            goto L_0x0057
        L_0x0056:
            r4 = r1
        L_0x0057:
            o.lambda$processSetComponents$1 r5 = r0.IconCompatParcelizer
            o.retrieve r5 = r5.read
            if (r5 == 0) goto L_0x0061
            java.lang.Double r5 = r5.IconCompatParcelizer
        L_0x005f:
            r11 = r5
            goto L_0x0062
        L_0x0061:
            r11 = r1
        L_0x0062:
            o.chain r5 = r0.read
            java.lang.String r5 = r5.setPopupCallback
            o.getFrames r7 = r0.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r7 = r7.MediaBrowserCompat$ItemReceiver
            o.chain r8 = r0.read
            java.lang.String r8 = r8.MediaDescriptionCompat
            o.chain r9 = r0.read
            java.lang.String r9 = r9.f2806x50fd9e4a
            o.ComponentDiscovery$1 r10 = new o.ComponentDiscovery$1
            r10.<init>(r7, r5, r8, r9)
            o.lambda$processSetComponents$1 r5 = r0.IconCompatParcelizer
            o.ComponentFactory r5 = r5.MediaBrowserCompat$SearchResultReceiver
            if (r5 == 0) goto L_0x0084
            o.processInstanceComponents r5 = r5.MediaBrowserCompat$CustomActionResultReceiver
            if (r5 == 0) goto L_0x0084
            java.lang.String r5 = r5.MediaDescriptionCompat
            goto L_0x0085
        L_0x0084:
            r5 = r1
        L_0x0085:
            o.lambda$processSetComponents$1 r7 = r0.IconCompatParcelizer
            o.ComponentFactory r7 = r7.MediaBrowserCompat$SearchResultReceiver
            if (r7 == 0) goto L_0x0091
            o.processInstanceComponents r7 = r7.MediaBrowserCompat$CustomActionResultReceiver
            if (r7 == 0) goto L_0x0091
            java.lang.String r1 = r7.MediaBrowserCompat$ItemReceiver
        L_0x0091:
            o.forContext r12 = new o.forContext
            r12.<init>(r5, r1, r4)
            o.getFrames r1 = r0.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r8 = r1.MediaMetadataCompat
            o.getFrames r1 = r0.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r1 = r1.MediaBrowserCompat$CustomActionResultReceiver
            double r4 = java.lang.Double.parseDouble(r1)
            o.ComponentDiscovery$RegistrarNameRetriever r13 = r0.MediaBrowserCompat$MediaItem
            o.lambda$processSetComponents$1 r1 = r0.IconCompatParcelizer
            o.retrieve r14 = r1.read
            o.lambda$processSetComponents$1 r1 = r0.IconCompatParcelizer
            o.ComponentFactory r15 = r1.MediaBrowserCompat$SearchResultReceiver
            o.getFrames r1 = r0.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r1 = r1.write
            o.getFrames r7 = r0.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r9 = r7.read
            java.lang.String r7 = r0.MediaBrowserCompat$ItemReceiver
            o.getFrames r6 = r0.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r6 = r6.IconCompatParcelizer
            o.setOfProvider r2 = new o.setOfProvider
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            r5 = r7
            r7 = r2
            r17 = r9
            r9 = r10
            r10 = r12
            r12 = r4
            r16 = r1
            r18 = r5
            r19 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r3.MediaBrowserCompat$ItemReceiver = r2
            o.calculateNewCapacity r1 = r3.write
            java.util.List r1 = r1.write(r2)
            o.getActualTypeArguments$MediaDescriptionCompat r2 = new o.getActualTypeArguments$MediaDescriptionCompat
            r2.<init>(r1)
            o.writeUInt64NoTag$IconCompatParcelizer r2 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r2
            T r1 = r3.RatingCompat
            r4 = 1
            if (r1 == 0) goto L_0x00e6
            r1 = r4
            goto L_0x00e7
        L_0x00e6:
            r1 = 0
        L_0x00e7:
            if (r1 == 0) goto L_0x00ee
            T r1 = r3.RatingCompat
            r2.IconCompatParcelizer(r1)
        L_0x00ee:
            o.getFrames r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r0 = r0.IconCompatParcelizer
            o.CrashlyticsReportJsonTransform$$Lambda$9 r1 = p040o.CrashlyticsReportJsonTransform$$Lambda$9.CREDIT_CARD_INSTALLMENT_PAYMENT_PLAN
            java.lang.String r1 = r1.code
            r2 = 0
            boolean r0 = p040o.GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(r0, r1, r2)
            if (r0 == 0) goto L_0x010f
            o.getActualTypeArguments$MediaBrowserCompat$MediaItem r0 = p040o.getActualTypeArguments$MediaBrowserCompat$MediaItem.IconCompatParcelizer
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r1 = r3.RatingCompat
            if (r1 == 0) goto L_0x0107
            r6 = r4
            goto L_0x0108
        L_0x0107:
            r6 = r2
        L_0x0108:
            if (r6 == 0) goto L_0x010f
            T r1 = r3.RatingCompat
            r0.IconCompatParcelizer(r1)
        L_0x010f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.ccsof.CcSofReviewFragment.onActivityCreated(android.os.Bundle):void");
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<? extends ForwardingFuture> list) {
        onGetStartedClick.write((Object) list, "displays");
        for (ForwardingFuture forwardingFuture : list) {
            Iterables.C352414 r1 = this.mComponentFactory;
            if (r1 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mComponentFactory");
            }
            ItemCustom MediaBrowserCompat$CustomActionResultReceiver2 = r1.MediaBrowserCompat$CustomActionResultReceiver(requireContext(), forwardingFuture);
            MediaBrowserCompat$CustomActionResultReceiver2.setUpWithDisplay(forwardingFuture);
            LinearLayout linearLayout = this.itemContainer;
            if (linearLayout == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("itemContainer");
            }
            linearLayout.addView(MediaBrowserCompat$CustomActionResultReceiver2);
        }
    }

    public final void IconCompatParcelizer(standardStartAndWait standardstartandwait, String str, List<getUserId> list) {
        onGetStartedClick.write((Object) standardstartandwait, "successfulDisplay");
        onGetStartedClick.write((Object) str, "partnerSubtypeCode");
        Context requireContext = requireContext();
        C5578x4c901875 ccSofSuccessActivity$MediaBrowserCompat$CustomActionResultReceiver = CcSofSuccessActivity.MediaMetadataCompat;
        Context requireContext2 = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext2, "requireContext()");
        onGetStartedClick.write((Object) requireContext2, "context");
        onGetStartedClick.write((Object) standardstartandwait, "successfulDisplay");
        onGetStartedClick.write((Object) str, "partnerSubtypeCode");
        Intent intent = new Intent(requireContext2, CcSofSuccessActivity.class);
        intent.putExtra("EXTRA_CC_SOF_KEY_SUCCESS", standardstartandwait);
        intent.putExtra("EXTRA_CC_SOF_KEY_SUCCESS_PARTNER_SUBTYPE_CODE", str);
        if (list != null) {
            intent.putParcelableArrayListExtra("EXTRA_ITEM_DEEP_LINK_BUTTON_DISPLAY_LIST", new ArrayList(list));
        }
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(requireContext, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(requireContext.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            requireContext.startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        CcSofReviewTermsAndConditionsActivity.IconCompatParcelizer iconCompatParcelizer = CcSofReviewTermsAndConditionsActivity.MediaBrowserCompat$SearchResultReceiver;
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
        onGetStartedClick.write((Object) requireContext, "context");
        Intent putExtra = new Intent(requireContext, CcSofReviewTermsAndConditionsActivity.class).putExtra("EXTRA_CARD_TYPE", i);
        onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, CcSofRev…XTRA_CARD_TYPE, cardType)");
        Context requireContext2 = requireContext();
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(requireContext2, putExtra).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(requireContext2.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            requireContext2.startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void read() {
        TextView textView = this.reviewTcText;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("reviewTcText");
        }
        textView.setMovementMethod(new LinkMovementMethod());
        TextView textView2 = this.reviewTcText;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("reviewTcText");
        }
        textView2.setText(ZHPR2.MediaBrowserCompat$CustomActionResultReceiver(getString(R.string.auto_ccsof_review_t_c_plan_text), getString(R.string.auto_ccsof_review_t_c_link), getResources(), new read(this), true, 0));
        LinearLayout linearLayout = this.reviewTcLayout;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("reviewTcLayout");
        }
        View view = linearLayout;
        onGetStartedClick.write((Object) view, "$this$isVisible");
        view.setVisibility(0);
        CheckBox checkBox = this.reviewTcCheck;
        if (checkBox == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("reviewTcCheck");
        }
        checkBox.setOnCheckedChangeListener(new C5888xc033ee5f(this));
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        Button button = this.confirmButton;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("confirmButton");
        }
        button.setEnabled(false);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        mo15340x50fd9e4a(true);
    }

    public final void IconCompatParcelizer() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(-1);
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }

    static final class read implements ZHPR2$MediaBrowserCompat$ItemReceiver {
        private /* synthetic */ CcSofReviewFragment MediaBrowserCompat$CustomActionResultReceiver;

        read(CcSofReviewFragment ccSofReviewFragment) {
            this.MediaBrowserCompat$CustomActionResultReceiver = ccSofReviewFragment;
        }

        public final void read() {
            getActualTypeArguments getactualtypearguments = this.MediaBrowserCompat$CustomActionResultReceiver.ccSofReviewFragmentPresenter;
            if (getactualtypearguments == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ccSofReviewFragmentPresenter");
            }
            writeUInt64NoTag.IconCompatParcelizer read = new getActualTypeArguments.read(getactualtypearguments);
            if (getactualtypearguments.RatingCompat != null) {
                read.IconCompatParcelizer(getactualtypearguments.RatingCompat);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        if (r1 == null) goto L_0x001a;
     */
    @butterknife.OnClick
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClickConfirm() {
        /*
            r8 = this;
            android.os.Bundle r0 = r8.getArguments()
            if (r0 == 0) goto L_0x001a
            r1 = 0
            r2 = -1
            java.lang.String r3 = "com.scb.phone.EXTRA_PAYMENT_FLOW_TYPE"
            int r0 = r0.getInt(r3, r2)
            if (r0 < 0) goto L_0x0016
            o.jsonFromMapEntryString[] r1 = p040o.jsonFromMapEntryString.values()
            r1 = r1[r0]
        L_0x0016:
            o.jsonFromMapEntryString r1 = (p040o.jsonFromMapEntryString) r1
            if (r1 != 0) goto L_0x001c
        L_0x001a:
            o.jsonFromMapEntryString r1 = p040o.jsonFromMapEntryString.NORMAL
        L_0x001c:
            o.getActualTypeArguments r0 = r8.ccSofReviewFragmentPresenter
            java.lang.String r2 = "ccSofReviewFragmentPresenter"
            if (r0 != 0) goto L_0x0025
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
        L_0x0025:
            java.lang.String r3 = "paymentFlowType"
            p040o.onGetStartedClick.write((java.lang.Object) r1, (java.lang.String) r3)
            o.jsonFromMapEntryString r3 = p040o.jsonFromMapEntryString.INSURANCE_PORT
            r4 = 1
            r5 = 0
            java.lang.String r6 = "purchaseCcSInputDisplay"
            if (r1 != r3) goto L_0x008f
            T r1 = r0.RatingCompat
            if (r1 == 0) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            r4 = r5
        L_0x0038:
            if (r4 == 0) goto L_0x003f
            T r1 = r0.RatingCompat
            r1.AlertController$RecycleListView()
        L_0x003f:
            o.setOfProvider r1 = r0.MediaBrowserCompat$ItemReceiver
            if (r1 != 0) goto L_0x0048
            java.lang.String r3 = "mCcSofReviewDisplay"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x0048:
            java.lang.String r1 = r1.ParcelableVolumeInfo
            o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception$1 r3 = r0.MediaBrowserCompat$MediaItem
            if (r3 != 0) goto L_0x0051
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r6)
        L_0x0051:
            o.lambda$processSetComponents$1 r3 = r3.IconCompatParcelizer
            java.lang.String r3 = r3.write
            java.lang.String r4 = ""
            if (r3 != 0) goto L_0x005a
            r3 = r4
        L_0x005a:
            o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception$1 r5 = r0.MediaBrowserCompat$MediaItem
            if (r5 != 0) goto L_0x0061
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r6)
        L_0x0061:
            o.lambda$processSetComponents$1 r5 = r5.IconCompatParcelizer
            java.lang.String r5 = r5.IconCompatParcelizer
            if (r5 != 0) goto L_0x0068
            r5 = r4
        L_0x0068:
            o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception$1 r7 = r0.MediaBrowserCompat$MediaItem
            if (r7 != 0) goto L_0x006f
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r6)
        L_0x006f:
            o.lambda$processSetComponents$1 r7 = r7.IconCompatParcelizer
            java.lang.String r7 = r7.MediaSessionCompat$ResultReceiverWrapper
            if (r7 == 0) goto L_0x0076
            r4 = r7
        L_0x0076:
            o.CustomConcurrentHashMap$Values r7 = new o.CustomConcurrentHashMap$Values
            r7.<init>(r1, r3, r5, r4)
            o.LinkedListMultimap$5 r1 = r0.read
            o.getActualTypeArguments$MediaBrowserCompat$CustomActionResultReceiver r3 = new o.getActualTypeArguments$MediaBrowserCompat$CustomActionResultReceiver
            r3.<init>(r0)
            o.FundFactSheetActivity r3 = (p040o.FundFactSheetActivity) r3
            o.getActualTypeArguments$IconCompatParcelizer r4 = new o.getActualTypeArguments$IconCompatParcelizer
            r4.<init>(r0)
            o.FundFactSheetActivity r4 = (p040o.FundFactSheetActivity) r4
            r1.MediaBrowserCompat$CustomActionResultReceiver(r7, r3, r4)
            goto L_0x00d9
        L_0x008f:
            T r1 = r0.RatingCompat
            if (r1 == 0) goto L_0x0094
            goto L_0x0095
        L_0x0094:
            r4 = r5
        L_0x0095:
            if (r4 == 0) goto L_0x009c
            T r1 = r0.RatingCompat
            r1.AlertController$RecycleListView()
        L_0x009c:
            o.Iterators$10 r1 = r0.IconCompatParcelizer
            o.getActualTypeArguments$MediaMetadataCompat r3 = new o.getActualTypeArguments$MediaMetadataCompat
            r3.<init>(r0)
            o.FundFactSheetActivity r3 = (p040o.FundFactSheetActivity) r3
            o.getActualTypeArguments$RatingCompat r4 = new o.getActualTypeArguments$RatingCompat
            r4.<init>(r0)
            o.FundFactSheetActivity r4 = (p040o.FundFactSheetActivity) r4
            o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception$1 r0 = r0.MediaBrowserCompat$MediaItem
            if (r0 != 0) goto L_0x00b3
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r6)
        L_0x00b3:
            o.ImmutableSet$ArrayImmutableSet r5 = new o.ImmutableSet$ArrayImmutableSet
            o.getFrames r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r0 = r0.MediaMetadataCompat
            r5.<init>(r0)
            java.lang.String r0 = "onSuccess"
            p040o.onGetStartedClick.write((java.lang.Object) r3, (java.lang.String) r0)
            java.lang.String r0 = "onError"
            p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r0)
            java.lang.String r0 = "request"
            p040o.onGetStartedClick.write((java.lang.Object) r5, (java.lang.String) r0)
            o.endOfData$IconCompatParcelizer r0 = new o.endOfData$IconCompatParcelizer
            r0.<init>(r5)
            o.endOfData r5 = r1.read
            o.frequency r5 = (p040o.frequency) r5
            o.getLastInNonemptyList$MediaBrowserCompat$CustomActionResultReceiver r0 = (p040o.C4602xca7af99c) r0
            r1.IconCompatParcelizer(r5, r3, r4, r0)
        L_0x00d9:
            o.ZTRMM r0 = r8.IconCompatParcelizer
            java.lang.String r1 = "mTracker"
            if (r0 != 0) goto L_0x00e2
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x00e2:
            java.lang.String r3 = "source"
            java.lang.String r4 = "deeplink"
            r0.read(r3, r4)
            o.ZTRMM r0 = r8.IconCompatParcelizer
            if (r0 != 0) goto L_0x00f0
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x00f0:
            o.getActualTypeArguments r3 = r8.ccSofReviewFragmentPresenter
            if (r3 != 0) goto L_0x00f7
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
        L_0x00f7:
            o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception$1 r2 = r3.MediaBrowserCompat$MediaItem
            if (r2 != 0) goto L_0x00fe
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r6)
        L_0x00fe:
            o.getFrames r2 = r2.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r2 = r2.IconCompatParcelizer
            java.lang.String r3 = "subtype"
            r0.read(r3, r2)
            o.ZTRMM r0 = r8.IconCompatParcelizer
            if (r0 != 0) goto L_0x010e
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x010e:
            o.ZTBSV r0 = (p040o.ZTBSV) r0
            androidx.fragment.app.FragmentActivity r1 = r8.getActivity()
            if (r1 == 0) goto L_0x0123
            androidx.fragment.app.FragmentActivity r1 = r8.getActivity()
            com.scb.phone.view.activity.BaseActivity r1 = (com.scb.phone.view.activity.BaseActivity) r1
            o.getKernelIDDst r1 = r1.scbAnalytics
            java.lang.String r2 = "partner_payment_review"
            r0.MediaBrowserCompat$ItemReceiver(r1, r2)
        L_0x0123:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.ccsof.CcSofReviewFragment.onClickConfirm():void");
    }
}

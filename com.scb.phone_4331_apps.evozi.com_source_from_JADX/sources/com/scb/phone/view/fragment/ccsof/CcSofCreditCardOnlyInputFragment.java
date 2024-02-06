package com.scb.phone.view.fragment.ccsof;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.ccsof.CcSofReviewActivity;
import com.scb.phone.view.activity.ccsof.CcSofReviewActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.custom.ScbEditText;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.custom.common.NoteEditText;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.List;
import p040o.C3080xc2f5febc;
import p040o.ComponentDiscovery;
import p040o.ComponentDiscoveryService;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ServiceModule;
import p040o.ZTRMM;
import p040o.getIIdDeserializerOnDevice;
import p040o.jsonFromMapEntryString;
import p040o.onGetStartedClick;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.typeToString;
import p040o.writeUInt64NoTag;

public final class CcSofCreditCardOnlyInputFragment extends BaseFragment implements getIIdDeserializerOnDevice.IconCompatParcelizer, ServiceModule.read {
    public static final read MediaBrowserCompat$CustomActionResultReceiver = new read((byte) 0);
    private ServiceModule IconCompatParcelizer;
    private ZTRMM MediaDescriptionCompat;
    @BindView
    public LinearLayout availableInstallmentsContainer;
    @BindView
    public DefaultButton btnReview;
    @BindView
    public CheckBox cbApplyCcIpp;
    @BindView
    public ScbEditText etRef1;
    @BindView
    public ImageView imageIcon;
    @BindView
    public LinearLayout installmentLayout;
    @HmlPinActivity
    public typeToString mPresenter;
    @BindView
    public NoteEditText noteEditText;
    @BindView
    public RecyclerView rvTenor;
    @BindView
    public LinearLayout selectedInstallmentDetailsContainer;
    @BindView
    public AmountEditText tvAmount;
    @BindView
    public TextView tvInterestAmount;
    @BindView
    public TextView tvMerchantId;
    @BindView
    public TextView tvMerchantTitle;
    @BindView
    public TextView tvMonthlyInterestRate;
    @BindView
    public TextView tvMonthlyPaymentAmount;
    @BindView
    public TextView tvPrincipalAmount;
    @BindView
    public TextView tvPrincipalInterestCalculation;
    @BindView
    public TextView tvTotalPayment;

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0087, code lost:
        if (r0 == null) goto L_0x0089;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r6, android.view.ViewGroup r7, android.os.Bundle r8) {
        /*
            r5 = this;
            java.lang.String r8 = "inflater"
            p040o.onGetStartedClick.write((java.lang.Object) r6, (java.lang.String) r8)
            r8 = 0
            r0 = 2131493834(0x7f0c03ca, float:1.861116E38)
            android.view.View r6 = r6.inflate(r0, r7, r8)
            butterknife.ButterKnife.IconCompatParcelizer(r5, r6)
            o.ZTRMM r7 = new o.ZTRMM
            r7.<init>()
            r5.MediaDescriptionCompat = r7
            com.scb.phone.view.custom.common.AmountEditText r7 = r5.tvAmount
            java.lang.String r0 = "tvAmount"
            if (r7 != 0) goto L_0x0020
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r0)
        L_0x0020:
            r7.setEnabled(r8)
            com.scb.phone.view.custom.common.AmountEditText r7 = r5.tvAmount
            if (r7 != 0) goto L_0x002a
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r0)
        L_0x002a:
            r7.setInputType(r8)
            com.scb.phone.view.custom.common.NoteEditText r7 = r5.noteEditText
            if (r7 != 0) goto L_0x0036
            java.lang.String r0 = "noteEditText"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r0)
        L_0x0036:
            com.scb.phone.view.fragment.ccsof.CcSofCreditCardOnlyInputFragment$IconCompatParcelizer r0 = new com.scb.phone.view.fragment.ccsof.CcSofCreditCardOnlyInputFragment$IconCompatParcelizer
            r0.<init>(r5)
            com.scb.phone.view.custom.common.NoteEditText$IconCompatParcelizer r0 = (com.scb.phone.view.custom.common.NoteEditText.IconCompatParcelizer) r0
            java.lang.String r1 = "^(?=\\S)[0-9a-zA-Z\\u0E00-\\u0E3E\\u0E40-\\u0E7F _*'\"#&*()@\\-]+$"
            r7.setOnNoteInputListener(r0, r1, r8)
            o.typeToString r7 = r5.mPresenter
            java.lang.String r8 = "mPresenter"
            if (r7 != 0) goto L_0x004b
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r8)
        L_0x004b:
            r0 = r5
            o.CheckCaptureModule_GetICheckDeserializerRttiFactory r0 = (p040o.CheckCaptureModule_GetICheckDeserializerRttiFactory) r0
            r7.MediaBrowserCompat$ItemReceiver(r0)
            android.os.Bundle r7 = r5.getArguments()
            r0 = 0
            if (r7 == 0) goto L_0x0061
            java.lang.String r1 = "EXTRA_CREDIT_CARD_DISPLAY"
            android.os.Parcelable r7 = r7.getParcelable(r1)
            o.chain r7 = (p040o.chain) r7
            goto L_0x0062
        L_0x0061:
            r7 = r0
        L_0x0062:
            android.os.Bundle r1 = r5.getArguments()
            if (r1 == 0) goto L_0x006f
            java.lang.String r2 = "EXTRA_CALLBACK_URL"
            java.lang.String r1 = r1.getString(r2)
            goto L_0x0070
        L_0x006f:
            r1 = r0
        L_0x0070:
            android.os.Bundle r2 = r5.getArguments()
            if (r2 == 0) goto L_0x0089
            r3 = -1
            java.lang.String r4 = "com.scb.phone.EXTRA_PAYMENT_FLOW_TYPE"
            int r2 = r2.getInt(r4, r3)
            if (r2 < 0) goto L_0x0085
            o.jsonFromMapEntryString[] r0 = p040o.jsonFromMapEntryString.values()
            r0 = r0[r2]
        L_0x0085:
            o.jsonFromMapEntryString r0 = (p040o.jsonFromMapEntryString) r0
            if (r0 != 0) goto L_0x008b
        L_0x0089:
            o.jsonFromMapEntryString r0 = p040o.jsonFromMapEntryString.NORMAL
        L_0x008b:
            android.os.Bundle r2 = r5.getArguments()
            if (r2 == 0) goto L_0x00aa
            java.lang.String r3 = "EXTRA_CC_SOURCE_OF_FUND_DISPLAY"
            android.os.Parcelable r2 = r2.getParcelable(r3)
            o.lambda$processSetComponents$1 r2 = (p040o.lambda$processSetComponents$1) r2
            if (r2 == 0) goto L_0x00aa
            o.typeToString r3 = r5.mPresenter
            if (r3 != 0) goto L_0x00a2
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r8)
        L_0x00a2:
            java.lang.String r8 = "it"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r2, (java.lang.String) r8)
            r3.IconCompatParcelizer((p040o.lambda$processSetComponents$1) r2, (p040o.chain) r7, (java.lang.String) r1, (p040o.jsonFromMapEntryString) r0)
        L_0x00aa:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.ccsof.CcSofCreditCardOnlyInputFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    static final class IconCompatParcelizer implements NoteEditText.IconCompatParcelizer {
        private /* synthetic */ CcSofCreditCardOnlyInputFragment MediaBrowserCompat$ItemReceiver;

        IconCompatParcelizer(CcSofCreditCardOnlyInputFragment ccSofCreditCardOnlyInputFragment) {
            this.MediaBrowserCompat$ItemReceiver = ccSofCreditCardOnlyInputFragment;
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
            typeToString typetostring = this.MediaBrowserCompat$ItemReceiver.mPresenter;
            if (typetostring == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = typeToString.read.IconCompatParcelizer;
            if (typetostring.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(typetostring.RatingCompat);
            }
        }
    }

    public final void onDestroyView() {
        typeToString typetostring = this.mPresenter;
        if (typetostring == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
        }
        typetostring.onDestroy();
        super.onDestroyView();
    }

    @OnClick
    public final void onCheckboxClick() {
        typeToString typetostring = this.mPresenter;
        if (typetostring == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
        }
        typetostring.IconCompatParcelizer = !typetostring.IconCompatParcelizer;
        typetostring.write(true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:152:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0288  */
    @butterknife.OnClick
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReviewButtonClick() {
        /*
            r43 = this;
            r0 = r43
            o.typeToString r1 = r0.mPresenter
            java.lang.String r2 = "mPresenter"
            if (r1 != 0) goto L_0x000b
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
        L_0x000b:
            com.scb.phone.view.custom.common.NoteEditText r3 = r0.noteEditText
            if (r3 != 0) goto L_0x0014
            java.lang.String r4 = "noteEditText"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r4)
        L_0x0014:
            android.widget.EditText r3 = r3.mNoteEditText
            android.text.Editable r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "noteEditText.note"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r3, (java.lang.String) r4)
            java.lang.String r4 = "note"
            p040o.onGetStartedClick.write((java.lang.Object) r3, (java.lang.String) r4)
            r4 = r3
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            int r5 = r4.length()
            if (r5 <= 0) goto L_0x0033
            r5 = 1
            goto L_0x0034
        L_0x0033:
            r5 = 0
        L_0x0034:
            if (r5 == 0) goto L_0x005c
            java.lang.String r5 = "^(?=\\S)[0-9a-zA-Z\\u0E00-\\u0E3E\\u0E40-\\u0E7F _*'\"#&*()@\\-]+$"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.util.regex.Matcher r5 = r5.matcher(r3)
            boolean r5 = r5.matches()
            if (r5 != 0) goto L_0x005c
            o.typeToString$write r3 = p040o.typeToString.write.write
            o.writeUInt64NoTag$IconCompatParcelizer r3 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r3
            T r4 = r1.RatingCompat
            if (r4 == 0) goto L_0x0050
            r6 = 1
            goto L_0x0051
        L_0x0050:
            r6 = 0
        L_0x0051:
            if (r6 == 0) goto L_0x0058
            T r1 = r1.RatingCompat
            r3.IconCompatParcelizer(r1)
        L_0x0058:
            r42 = r2
            goto L_0x02c6
        L_0x005c:
            o.jsonFromMapEntryString r5 = r1.MediaBrowserCompat$MediaItem
            o.chain r8 = r1.write
            if (r8 == 0) goto L_0x026a
            java.lang.String r11 = r8.MediaDescriptionCompat
            if (r11 == 0) goto L_0x026a
            o.CrashlyticsReportJsonTransform$$Lambda$9 r8 = p040o.CrashlyticsReportJsonTransform$$Lambda$9.CREDIT_CARD_INSTALLMENT_PAYMENT_PLAN
            java.lang.String r8 = r8.code
            boolean r10 = r1.IconCompatParcelizer
            java.lang.String r12 = "mPurchaseCcSofDisplay"
            if (r10 == 0) goto L_0x00d0
            o.lambda$processSetComponents$1 r10 = r1.MediaDescriptionCompat
            if (r10 != 0) goto L_0x0077
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r12)
        L_0x0077:
            o.ComponentDiscovery$MetadataRegistrarNameRetriever r10 = r10.MediaBrowserCompat$CustomActionResultReceiver
            if (r10 == 0) goto L_0x026a
            java.lang.Double r13 = r10.read
            if (r13 == 0) goto L_0x026a
            double r13 = r13.doubleValue()
            java.lang.String r15 = r10.IconCompatParcelizer
            if (r15 == 0) goto L_0x026a
            java.lang.String r6 = r10.MediaBrowserCompat$MediaItem
            java.lang.String r10 = r10.MediaBrowserCompat$CustomActionResultReceiver
            if (r10 == 0) goto L_0x026a
            java.util.List r16 = r1.MediaBrowserCompat$CustomActionResultReceiver()
            java.lang.Iterable r16 = (java.lang.Iterable) r16
            java.util.Iterator r16 = r16.iterator()
        L_0x0097:
            boolean r17 = r16.hasNext()
            if (r17 == 0) goto L_0x00b7
            java.lang.Object r17 = r16.next()
            r7 = r17
            o.ComponentDiscovery$RegistrarNameRetriever r7 = (p040o.ComponentDiscovery.RegistrarNameRetriever) r7
            int r7 = r7.RatingCompat
            java.lang.Integer r9 = r1.MediaMetadataCompat
            if (r9 == 0) goto L_0x00b3
            int r9 = r9.intValue()
            if (r7 != r9) goto L_0x00b3
            r7 = 1
            goto L_0x00b4
        L_0x00b3:
            r7 = 0
        L_0x00b4:
            if (r7 == 0) goto L_0x0097
            goto L_0x00b9
        L_0x00b7:
            r17 = 0
        L_0x00b9:
            o.ComponentDiscovery$RegistrarNameRetriever r17 = (p040o.ComponentDiscovery.RegistrarNameRetriever) r17
            o.lambda$processSetComponents$1 r7 = r1.MediaDescriptionCompat
            if (r7 != 0) goto L_0x00c2
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r12)
        L_0x00c2:
            o.ComponentDiscovery$MetadataRegistrarNameRetriever r7 = r7.MediaBrowserCompat$CustomActionResultReceiver
            r21 = r6
            r6 = r8
            r22 = r10
            r18 = r13
            r20 = r15
            r8 = r17
            goto L_0x00fb
        L_0x00d0:
            o.CrashlyticsReportJsonTransform$$Lambda$9 r6 = p040o.CrashlyticsReportJsonTransform$$Lambda$9.CREDIT_CARD_FULL_AMOUNT
            java.lang.String r6 = r6.code
            o.lambda$processSetComponents$1 r7 = r1.MediaDescriptionCompat
            if (r7 != 0) goto L_0x00db
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r12)
        L_0x00db:
            o.retrieve r7 = r7.read
            if (r7 == 0) goto L_0x026a
            java.lang.Double r8 = r7.IconCompatParcelizer
            if (r8 == 0) goto L_0x026a
            double r8 = r8.doubleValue()
            java.lang.String r10 = r7.MediaBrowserCompat$CustomActionResultReceiver
            if (r10 == 0) goto L_0x026a
            java.lang.String r13 = r7.read
            java.lang.String r7 = r7.MediaBrowserCompat$ItemReceiver
            if (r7 == 0) goto L_0x026a
            r22 = r7
            r18 = r8
            r20 = r10
            r21 = r13
            r7 = 0
            r8 = 0
        L_0x00fb:
            o.lambda$processSetComponents$1 r9 = r1.MediaDescriptionCompat
            if (r9 != 0) goto L_0x0102
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r12)
        L_0x0102:
            r9.MediaSessionCompat$ResultReceiverWrapper = r6
            java.lang.String r9 = r1.read
            o.jsonFromMapEntryString r10 = p040o.jsonFromMapEntryString.NORMAL
            if (r5 != r10) goto L_0x0115
            o.lambda$processSetComponents$1 r10 = r1.MediaDescriptionCompat
            if (r10 != 0) goto L_0x0111
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r12)
        L_0x0111:
            java.lang.String r10 = r10.MediaMetadataCompat
            r13 = r10
            goto L_0x0116
        L_0x0115:
            r13 = 0
        L_0x0116:
            o.jsonFromMapEntryString r10 = p040o.jsonFromMapEntryString.NORMAL
            if (r5 != r10) goto L_0x0125
            o.lambda$processSetComponents$1 r10 = r1.MediaDescriptionCompat
            if (r10 != 0) goto L_0x0121
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r12)
        L_0x0121:
            java.lang.String r10 = r10.MediaDescriptionCompat
            r14 = r10
            goto L_0x0126
        L_0x0125:
            r14 = 0
        L_0x0126:
            o.jsonFromMapEntryString r10 = p040o.jsonFromMapEntryString.NORMAL
            if (r5 != r10) goto L_0x0135
            o.lambda$processSetComponents$1 r10 = r1.MediaDescriptionCompat
            if (r10 != 0) goto L_0x0131
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r12)
        L_0x0131:
            java.lang.String r10 = r10.MediaBrowserCompat$MediaItem
            r15 = r10
            goto L_0x0136
        L_0x0135:
            r15 = 0
        L_0x0136:
            o.jsonFromMapEntryString r10 = p040o.jsonFromMapEntryString.NORMAL
            if (r5 != r10) goto L_0x013d
            java.lang.String r5 = "PURCHASE"
            goto L_0x013f
        L_0x013d:
            java.lang.String r5 = "IN_APP_PURCHASE"
        L_0x013f:
            r16 = r5
            if (r8 == 0) goto L_0x014c
            int r5 = r8.write
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r23 = r5
            goto L_0x014e
        L_0x014c:
            r23 = 0
        L_0x014e:
            if (r8 == 0) goto L_0x0159
            int r5 = r8.RatingCompat
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r24 = r5
            goto L_0x015b
        L_0x0159:
            r24 = 0
        L_0x015b:
            if (r8 == 0) goto L_0x0169
            r5 = r2
            r34 = r3
            double r2 = r8.MediaBrowserCompat$SearchResultReceiver
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r25 = r2
            goto L_0x016e
        L_0x0169:
            r5 = r2
            r34 = r3
            r25 = 0
        L_0x016e:
            if (r7 == 0) goto L_0x0175
            java.lang.Double r2 = r7.read
            r26 = r2
            goto L_0x0177
        L_0x0175:
            r26 = 0
        L_0x0177:
            if (r8 == 0) goto L_0x0182
            double r2 = r8.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r27 = r2
            goto L_0x0184
        L_0x0182:
            r27 = 0
        L_0x0184:
            if (r8 == 0) goto L_0x018f
            double r2 = r8.read
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r28 = r2
            goto L_0x0191
        L_0x018f:
            r28 = 0
        L_0x0191:
            if (r8 == 0) goto L_0x019c
            double r2 = r8.MediaBrowserCompat$ItemReceiver
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r29 = r2
            goto L_0x019e
        L_0x019c:
            r29 = 0
        L_0x019e:
            if (r8 == 0) goto L_0x01a9
            double r2 = r8.MediaBrowserCompat$MediaItem
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r30 = r2
            goto L_0x01ab
        L_0x01a9:
            r30 = 0
        L_0x01ab:
            if (r8 == 0) goto L_0x01b2
            java.lang.String r2 = r8.IconCompatParcelizer
            r31 = r2
            goto L_0x01b4
        L_0x01b2:
            r31 = 0
        L_0x01b4:
            int r2 = r4.length()
            if (r2 != 0) goto L_0x01bc
            r2 = 1
            goto L_0x01bd
        L_0x01bc:
            r2 = 0
        L_0x01bd:
            if (r2 == 0) goto L_0x01c2
            r32 = 0
            goto L_0x01c4
        L_0x01c2:
            r32 = r34
        L_0x01c4:
            o.lambda$processSetComponents$1 r2 = r1.MediaDescriptionCompat
            if (r2 != 0) goto L_0x01cb
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r12)
        L_0x01cb:
            o.ComponentFactory r2 = r2.MediaBrowserCompat$SearchResultReceiver
            if (r2 == 0) goto L_0x025c
            java.lang.String r3 = r2.read
            o.processInstanceComponents r4 = r2.MediaBrowserCompat$CustomActionResultReceiver
            if (r4 == 0) goto L_0x01f9
            java.lang.String r7 = r4.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r8 = r4.MediaBrowserCompat$ItemReceiver
            java.lang.String r10 = r4.write
            java.lang.String r12 = r4.read
            r42 = r5
            java.lang.String r5 = r4.MediaDescriptionCompat
            java.lang.String r4 = r4.IconCompatParcelizer
            o.GoogleMap$OnPolylineClickListener r17 = new o.GoogleMap$OnPolylineClickListener
            r35 = r17
            r36 = r7
            r37 = r8
            r38 = r10
            r39 = r12
            r40 = r5
            r41 = r4
            r35.<init>(r36, r37, r38, r39, r40, r41)
            r4 = r17
            goto L_0x01fc
        L_0x01f9:
            r42 = r5
            r4 = 0
        L_0x01fc:
            java.util.List<o.ComponentRuntime> r2 = r2.MediaBrowserCompat$ItemReceiver
            if (r2 == 0) goto L_0x0253
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r5 = new java.util.ArrayList
            r7 = 10
            java.lang.String r8 = "$this$collectionSizeOrDefault"
            p040o.onGetStartedClick.write((java.lang.Object) r2, (java.lang.String) r8)
            boolean r8 = r2 instanceof java.util.Collection
            if (r8 == 0) goto L_0x0216
            r7 = r2
            java.util.Collection r7 = (java.util.Collection) r7
            int r7 = r7.size()
        L_0x0216:
            r5.<init>(r7)
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.Iterator r2 = r2.iterator()
        L_0x021f:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0250
            java.lang.Object r7 = r2.next()
            o.ComponentRuntime r7 = (p040o.ComponentRuntime) r7
            java.lang.String r8 = r7.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r10 = r7.write
            java.lang.String r12 = r7.MediaBrowserCompat$ItemReceiver
            r17 = r2
            java.lang.String r2 = r7.IconCompatParcelizer
            java.lang.String r7 = r7.read
            o.onPolylineClick r0 = new o.onPolylineClick
            r35 = r0
            r36 = r8
            r37 = r10
            r38 = r12
            r39 = r2
            r40 = r7
            r35.<init>(r36, r37, r38, r39, r40)
            r5.add(r0)
            r0 = r43
            r2 = r17
            goto L_0x021f
        L_0x0250:
            java.util.List r5 = (java.util.List) r5
            goto L_0x0254
        L_0x0253:
            r5 = 0
        L_0x0254:
            o.onSnapshotReady r0 = new o.onSnapshotReady
            r0.<init>(r3, r4, r5)
            r33 = r0
            goto L_0x0260
        L_0x025c:
            r42 = r5
            r33 = 0
        L_0x0260:
            o.ImmutableMultiset$EntrySet$1 r0 = new o.ImmutableMultiset$EntrySet$1
            r10 = r0
            r12 = r9
            r17 = r6
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            goto L_0x026f
        L_0x026a:
            r42 = r2
            r34 = r3
            r0 = 0
        L_0x026f:
            if (r0 != 0) goto L_0x0288
            o.RegularImmutableBiMap r0 = r1.MediaBrowserCompat$CustomActionResultReceiver
            int r2 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource
            android.content.res.Resources r3 = r0.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r2 = r3.getString(r2)
            o.access$2300$write r3 = p040o.access$2300.write.JUST_DISMISS
            r4 = 0
            o.access$2200 r0 = r0.read(r4, r2, r3)
            r1.MediaBrowserCompat$ItemReceiver((p040o.access$2200) r0)
        L_0x0285:
            r0 = r43
            goto L_0x02c6
        L_0x0288:
            T r2 = r1.RatingCompat
            if (r2 == 0) goto L_0x028e
            r6 = 1
            goto L_0x028f
        L_0x028e:
            r6 = 0
        L_0x028f:
            if (r6 == 0) goto L_0x0296
            T r2 = r1.RatingCompat
            r2.AlertController$RecycleListView()
        L_0x0296:
            o.forEnumeration r2 = r1.MediaBrowserCompat$ItemReceiver
            o.typeToString$MediaBrowserCompat$CustomActionResultReceiver r3 = new o.typeToString$MediaBrowserCompat$CustomActionResultReceiver
            r4 = r34
            r3.<init>(r1, r4)
            o.FundFactSheetActivity r3 = (p040o.FundFactSheetActivity) r3
            o.typeToString$MediaBrowserCompat$ItemReceiver r4 = new o.typeToString$MediaBrowserCompat$ItemReceiver
            r4.<init>(r1)
            o.FundFactSheetActivity r4 = (p040o.FundFactSheetActivity) r4
            java.lang.String r1 = "onSuccess"
            p040o.onGetStartedClick.write((java.lang.Object) r3, (java.lang.String) r1)
            java.lang.String r1 = "onError"
            p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r1)
            java.lang.String r1 = "request"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            o.Splitter$AbstractIterator$write r1 = new o.Splitter$AbstractIterator$write
            r1.<init>(r0)
            o.Splitter$AbstractIterator r0 = r2.read
            o.frequency r0 = (p040o.frequency) r0
            o.getLastInNonemptyList$MediaBrowserCompat$CustomActionResultReceiver r1 = (p040o.C4602xca7af99c) r1
            r2.IconCompatParcelizer(r0, r3, r4, r1)
            goto L_0x0285
        L_0x02c6:
            o.ZTRMM r1 = r0.MediaDescriptionCompat
            java.lang.String r2 = "mTracker"
            if (r1 != 0) goto L_0x02cf
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
        L_0x02cf:
            java.lang.String r3 = "source"
            java.lang.String r4 = "deeplink"
            r1.read(r3, r4)
            o.ZTRMM r1 = r0.MediaDescriptionCompat
            if (r1 != 0) goto L_0x02dd
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
        L_0x02dd:
            o.typeToString r3 = r0.mPresenter
            if (r3 != 0) goto L_0x02e4
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r42)
        L_0x02e4:
            boolean r3 = r3.IconCompatParcelizer
            if (r3 == 0) goto L_0x02ed
            o.CrashlyticsReportJsonTransform$$Lambda$9 r3 = p040o.CrashlyticsReportJsonTransform$$Lambda$9.CREDIT_CARD_INSTALLMENT_PAYMENT_PLAN
            java.lang.String r3 = r3.code
            goto L_0x02f1
        L_0x02ed:
            o.CrashlyticsReportJsonTransform$$Lambda$9 r3 = p040o.CrashlyticsReportJsonTransform$$Lambda$9.CREDIT_CARD_FULL_AMOUNT
            java.lang.String r3 = r3.code
        L_0x02f1:
            java.lang.String r4 = "subtype"
            r1.read(r4, r3)
            o.ZTRMM r1 = r0.MediaDescriptionCompat
            if (r1 != 0) goto L_0x02fd
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
        L_0x02fd:
            o.ZTBSV r1 = (p040o.ZTBSV) r1
            androidx.fragment.app.FragmentActivity r2 = r43.getActivity()
            if (r2 == 0) goto L_0x0312
            androidx.fragment.app.FragmentActivity r2 = r43.getActivity()
            com.scb.phone.view.activity.BaseActivity r2 = (com.scb.phone.view.activity.BaseActivity) r2
            o.getKernelIDDst r2 = r2.scbAnalytics
            java.lang.String r3 = "partner_payment_input"
            r1.MediaBrowserCompat$ItemReceiver(r2, r3)
        L_0x0312:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.ccsof.CcSofCreditCardOnlyInputFragment.onReviewButtonClick():void");
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, String str2, String str3, String str4, String str5) {
        TextView textView = this.tvMerchantTitle;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvMerchantTitle");
        }
        textView.setText(str);
        TextView textView2 = this.tvMerchantId;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvMerchantId");
        }
        textView2.setText(str2);
        ScbEditText scbEditText = this.etRef1;
        if (scbEditText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("etRef1");
        }
        scbEditText.setText(str4);
        AmountEditText amountEditText = this.tvAmount;
        if (amountEditText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvAmount");
        }
        amountEditText.setText(str3);
        if (str5 != null) {
            Drawable write = setLastBaselineToBottomHeight.write(requireContext(), R.drawable.biller_place_holder);
            Context context = getContext();
            ImageView imageView = this.imageIcon;
            if (imageView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("imageIcon");
            }
            FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(context, write, imageView, str5, getResources().getDimensionPixelOffset(R.dimen.f72042131165281), setLastBaselineToBottomHeight.read(requireContext(), R.color.f66402131099796));
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z, boolean z2, int i) {
        CheckBox checkBox = this.cbApplyCcIpp;
        if (checkBox == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("cbApplyCcIpp");
        }
        checkBox.setChecked(z);
        CheckBox checkBox2 = this.cbApplyCcIpp;
        if (checkBox2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("cbApplyCcIpp");
        }
        checkBox2.setEnabled(z2);
        CheckBox checkBox3 = this.cbApplyCcIpp;
        if (checkBox3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("cbApplyCcIpp");
        }
        checkBox3.setButtonDrawable(i);
    }

    public final void write(List<ComponentDiscovery.RegistrarNameRetriever> list, Integer num) {
        onGetStartedClick.write((Object) list, "tenorList");
        RecyclerView recyclerView = this.rvTenor;
        if (recyclerView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rvTenor");
        }
        if (recyclerView.AppCompatActivity == null) {
            RecyclerView recyclerView2 = this.rvTenor;
            if (recyclerView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("rvTenor");
            }
            getActivity();
            recyclerView2.setLayoutManager(new LinearLayoutManager(0, false));
        }
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = new ServiceModule(list, num, this);
            RecyclerView recyclerView3 = this.rvTenor;
            if (recyclerView3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("rvTenor");
            }
            ServiceModule serviceModule = this.IconCompatParcelizer;
            if (serviceModule == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mCcSofInstallmentDetailsTenorAdapter");
            }
            recyclerView3.setAdapter(serviceModule);
            return;
        }
        ServiceModule serviceModule2 = this.IconCompatParcelizer;
        if (serviceModule2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mCcSofInstallmentDetailsTenorAdapter");
        }
        onGetStartedClick.write((Object) list, "<set-?>");
        serviceModule2.MediaBrowserCompat$ItemReceiver = list;
        ServiceModule serviceModule3 = this.IconCompatParcelizer;
        if (serviceModule3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mCcSofInstallmentDetailsTenorAdapter");
        }
        serviceModule3.read = num;
        ServiceModule serviceModule4 = this.IconCompatParcelizer;
        if (serviceModule4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mCcSofInstallmentDetailsTenorAdapter");
        }
        serviceModule4.IconCompatParcelizer.write();
    }

    public final void MediaBrowserCompat$ItemReceiver(ComponentDiscoveryService componentDiscoveryService, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        TextView textView = this.tvMonthlyInterestRate;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvMonthlyInterestRate");
        }
        String str6 = null;
        if (componentDiscoveryService != null) {
            str2 = componentDiscoveryService.IconCompatParcelizer;
        } else {
            str2 = null;
        }
        textView.setText(str2);
        TextView textView2 = this.tvTotalPayment;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvTotalPayment");
        }
        if (componentDiscoveryService != null) {
            str3 = componentDiscoveryService.MediaBrowserCompat$ItemReceiver;
        } else {
            str3 = null;
        }
        textView2.setText(str3);
        TextView textView3 = this.tvPrincipalAmount;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvPrincipalAmount");
        }
        textView3.setText(str);
        TextView textView4 = this.tvInterestAmount;
        if (textView4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvInterestAmount");
        }
        if (componentDiscoveryService != null) {
            str4 = componentDiscoveryService.read;
        } else {
            str4 = null;
        }
        textView4.setText(str4);
        TextView textView5 = this.tvMonthlyPaymentAmount;
        if (textView5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvMonthlyPaymentAmount");
        }
        if (componentDiscoveryService != null) {
            str5 = componentDiscoveryService.write;
        } else {
            str5 = null;
        }
        textView5.setText(str5);
        TextView textView6 = this.tvPrincipalInterestCalculation;
        if (textView6 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvPrincipalInterestCalculation");
        }
        Object[] objArr = new Object[1];
        if (componentDiscoveryService != null) {
            str6 = componentDiscoveryService.MediaBrowserCompat$CustomActionResultReceiver;
        }
        objArr[0] = str6;
        textView6.setText(getString(R.string.auto_ccsof_input_disclaimer_text, objArr));
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        LinearLayout linearLayout = this.installmentLayout;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("installmentLayout");
        }
        View view = linearLayout;
        onGetStartedClick.write((Object) view, "$this$isVisible");
        view.setVisibility(z ? 0 : 8);
    }

    public final void write(boolean z) {
        LinearLayout linearLayout = this.availableInstallmentsContainer;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("availableInstallmentsContainer");
        }
        View view = linearLayout;
        onGetStartedClick.write((Object) view, "$this$isVisible");
        view.setVisibility(z ? 0 : 8);
    }

    public final void IconCompatParcelizer(boolean z) {
        LinearLayout linearLayout = this.selectedInstallmentDetailsContainer;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("selectedInstallmentDetailsContainer");
        }
        View view = linearLayout;
        onGetStartedClick.write((Object) view, "$this$isVisible");
        view.setVisibility(z ? 0 : 8);
    }

    public final void read(boolean z) {
        DefaultButton defaultButton = this.btnReview;
        if (defaultButton == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btnReview");
        }
        defaultButton.setButtonEnabled(z);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        if (z) {
            NoteEditText noteEditText2 = this.noteEditText;
            if (noteEditText2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("noteEditText");
            }
            noteEditText2.IconCompatParcelizer();
            return;
        }
        NoteEditText noteEditText3 = this.noteEditText;
        if (noteEditText3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("noteEditText");
        }
        noteEditText3.write();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(C3080xc2f5febc.C30811 r5, jsonFromMapEntryString jsonfrommapentrystring) {
        onGetStartedClick.write((Object) r5, "purchaseCcsofInputDisplay");
        onGetStartedClick.write((Object) jsonfrommapentrystring, "paymentFlowType");
        CcSofReviewActivity$MediaBrowserCompat$ItemReceiver ccSofReviewActivity$MediaBrowserCompat$ItemReceiver = CcSofReviewActivity.MediaMetadataCompat;
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
        onGetStartedClick.write((Object) requireContext, "context");
        onGetStartedClick.write((Object) r5, "purchaseCcSofDisplay");
        onGetStartedClick.write((Object) jsonfrommapentrystring, "paymentFlowType");
        Intent putExtra = new Intent(requireContext, CcSofReviewActivity.class).putExtra("EXTRA_CCSOF_INPUT_DISPLAY", r5);
        onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, CcSofRev…AY, purchaseCcSofDisplay)");
        Intent putExtra2 = putExtra.putExtra("com.scb.phone.EXTRA_PAYMENT_FLOW_TYPE", jsonfrommapentrystring.ordinal());
        onGetStartedClick.IconCompatParcelizer((Object) putExtra2, "putExtra(key, value?.ordinal ?: -1)");
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = parentFragment.getActivity();
                if (activity != null) {
                    putExtra2 = setTapText.write(activity, putExtra2).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
                sb.append(putExtra2.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                parentFragment.startActivityForResult(putExtra2, 90);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void read() {
        mo15340x50fd9e4a(false);
    }

    public final void MediaBrowserCompat$ItemReceiver(ComponentDiscovery.RegistrarNameRetriever registrarNameRetriever) {
        onGetStartedClick.write((Object) registrarNameRetriever, "installmentPlansDisplay");
        typeToString typetostring = this.mPresenter;
        if (typetostring == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
        }
        onGetStartedClick.write((Object) registrarNameRetriever, "installmentPlansDisplay");
        typetostring.MediaMetadataCompat = Integer.valueOf(registrarNameRetriever.RatingCompat);
        typetostring.write(false);
    }
}

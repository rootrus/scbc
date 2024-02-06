package com.scb.phone.view.fragment.ccsof;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment;
import com.scb.phone.view.fragment.ccsof.CcSofCreditCardOnlyInputFragment;
import com.scb.phone.view.fragment.transferandpay.cardlessatm.C6192xd0d7758e;
import com.scb.phone.view.fragment.transferandpay.cardlessatm.CardlessCreditCardSelectorFragment;
import java.util.ArrayList;
import p040o.ActivityBuilder_SourceOfFundsActivity;
import p040o.C$Gson$Types;
import p040o.C$Gson$Types$GenericArrayTypeImpl$MediaBrowserCompat$ItemReceiver;
import p040o.C2984x49d52c29;
import p040o.CardView;
import p040o.HmlPinActivity;
import p040o.chain;
import p040o.getIIdDeserializerKta$MediaBrowserCompat$ItemReceiver;
import p040o.jsonFromMapEntryString;
import p040o.lambda$processSetComponents$1;
import p040o.onGetStartedClick;
import p040o.typeToString;
import p040o.writeUInt64NoTag;

public final class CcSofCreditCardOnlyFragment extends BaseFragment implements getIIdDeserializerKta$MediaBrowserCompat$ItemReceiver, ActivityBuilder_SourceOfFundsActivity {
    public static final write IconCompatParcelizer = new write((byte) 0);
    private CardlessCreditCardSelectorFragment MediaBrowserCompat$CustomActionResultReceiver;
    private CcSofCreditCardOnlyInputFragment MediaBrowserCompat$MediaItem;
    @BindView
    public FrameLayout mInputContainer;
    @BindView
    public RelativeLayout mLayoutError;
    @HmlPinActivity
    public C$Gson$Types.GenericArrayTypeImpl mPresenter;
    @BindView
    public FrameLayout mSourceOfFundContainer;
    @BindView
    public TextView mSourceOfFundEmptyStateTextView;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }

        public static CcSofCreditCardOnlyFragment IconCompatParcelizer(lambda$processSetComponents$1 lambda_processsetcomponents_1, String str, jsonFromMapEntryString jsonfrommapentrystring) {
            onGetStartedClick.write((Object) lambda_processsetcomponents_1, "purchaseSourceOfFundDisplay");
            onGetStartedClick.write((Object) jsonfrommapentrystring, "paymentFlowType");
            CcSofCreditCardOnlyFragment ccSofCreditCardOnlyFragment = new CcSofCreditCardOnlyFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXTRA_PURCHASE_SOURCE_FUND_DISPLAY", lambda_processsetcomponents_1);
            bundle.putString("EXTRA_CALLBACK_URL", str);
            bundle.putInt("com.scb.phone.EXTRA_PAYMENT_FLOW_TYPE", jsonfrommapentrystring.ordinal());
            ccSofCreditCardOnlyFragment.setArguments(bundle);
            return ccSofCreditCardOnlyFragment;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0080, code lost:
        if (r1 == null) goto L_0x0082;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r8, android.view.ViewGroup r9, android.os.Bundle r10) {
        /*
            r7 = this;
            java.lang.String r10 = "inflater"
            p040o.onGetStartedClick.write((java.lang.Object) r8, (java.lang.String) r10)
            r10 = 0
            r0 = 2131493835(0x7f0c03cb, float:1.8611161E38)
            android.view.View r8 = r8.inflate(r0, r9, r10)
            butterknife.ButterKnife.IconCompatParcelizer(r7, r8)
            android.widget.TextView r9 = r7.mSourceOfFundEmptyStateTextView
            if (r9 != 0) goto L_0x0019
            java.lang.String r0 = "mSourceOfFundEmptyStateTextView"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r0)
        L_0x0019:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 2131755830(0x7f100336, float:1.914255E38)
            java.lang.String r1 = r7.getString(r1)
            r0[r10] = r1
            r1 = 2131755831(0x7f100337, float:1.9142552E38)
            java.lang.String r1 = r7.getString(r1)
            r2 = 1
            r0[r2] = r1
            r1 = 2131756550(0x7f100606, float:1.914401E38)
            java.lang.String r0 = r7.getString(r1, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.setText(r0)
            o.$Gson$Types$GenericArrayTypeImpl r9 = r7.mPresenter
            java.lang.String r0 = "mPresenter"
            if (r9 != 0) goto L_0x0044
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r0)
        L_0x0044:
            r1 = r7
            o.CheckCaptureModule_GetICheckDeserializerRttiFactory r1 = (p040o.CheckCaptureModule_GetICheckDeserializerRttiFactory) r1
            r9.MediaBrowserCompat$ItemReceiver(r1)
            android.os.Bundle r9 = r7.getArguments()
            r1 = 0
            if (r9 == 0) goto L_0x005a
            java.lang.String r3 = "EXTRA_PURCHASE_SOURCE_FUND_DISPLAY"
            android.os.Parcelable r9 = r9.getParcelable(r3)
            o.lambda$processSetComponents$1 r9 = (p040o.lambda$processSetComponents$1) r9
            goto L_0x005b
        L_0x005a:
            r9 = r1
        L_0x005b:
            android.os.Bundle r3 = r7.getArguments()
            if (r3 == 0) goto L_0x0068
            java.lang.String r4 = "EXTRA_CALLBACK_URL"
            java.lang.String r3 = r3.getString(r4)
            goto L_0x0069
        L_0x0068:
            r3 = r1
        L_0x0069:
            android.os.Bundle r4 = r7.getArguments()
            if (r4 == 0) goto L_0x0082
            r5 = -1
            java.lang.String r6 = "com.scb.phone.EXTRA_PAYMENT_FLOW_TYPE"
            int r4 = r4.getInt(r6, r5)
            if (r4 < 0) goto L_0x007e
            o.jsonFromMapEntryString[] r1 = p040o.jsonFromMapEntryString.values()
            r1 = r1[r4]
        L_0x007e:
            o.jsonFromMapEntryString r1 = (p040o.jsonFromMapEntryString) r1
            if (r1 != 0) goto L_0x0084
        L_0x0082:
            o.jsonFromMapEntryString r1 = p040o.jsonFromMapEntryString.NORMAL
        L_0x0084:
            if (r9 == 0) goto L_0x00b0
            o.$Gson$Types$GenericArrayTypeImpl r4 = r7.mPresenter
            if (r4 != 0) goto L_0x008d
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r0)
        L_0x008d:
            java.lang.String r0 = "purchaseSourceOfFundDisplay"
            p040o.onGetStartedClick.write((java.lang.Object) r9, (java.lang.String) r0)
            java.lang.String r0 = "paymentFlowType"
            p040o.onGetStartedClick.write((java.lang.Object) r1, (java.lang.String) r0)
            r4.IconCompatParcelizer = r9
            r4.MediaBrowserCompat$ItemReceiver = r3
            r4.read = r1
            o.$Gson$Types$GenericArrayTypeImpl$MediaBrowserCompat$ItemReceiver r9 = new o.$Gson$Types$GenericArrayTypeImpl$MediaBrowserCompat$ItemReceiver
            r9.<init>(r4)
            o.writeUInt64NoTag$IconCompatParcelizer r9 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r9
            T r0 = r4.RatingCompat
            if (r0 == 0) goto L_0x00a9
            r10 = r2
        L_0x00a9:
            if (r10 == 0) goto L_0x00b0
            T r10 = r4.RatingCompat
            r9.IconCompatParcelizer(r10)
        L_0x00b0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.ccsof.CcSofCreditCardOnlyFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroy() {
        C$Gson$Types.GenericArrayTypeImpl genericArrayTypeImpl = this.mPresenter;
        if (genericArrayTypeImpl == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
        }
        genericArrayTypeImpl.onDestroy();
        super.onDestroy();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 90 && i2 == -1) {
            C$Gson$Types.GenericArrayTypeImpl genericArrayTypeImpl = this.mPresenter;
            if (genericArrayTypeImpl == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
            }
            writeUInt64NoTag.IconCompatParcelizer _gson_types_genericarraytypeimpl_mediabrowsercompat_itemreceiver = new C$Gson$Types$GenericArrayTypeImpl$MediaBrowserCompat$ItemReceiver(genericArrayTypeImpl);
            if (genericArrayTypeImpl.RatingCompat != null) {
                _gson_types_genericarraytypeimpl_mediabrowsercompat_itemreceiver.IconCompatParcelizer(genericArrayTypeImpl.RatingCompat);
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(ArrayList<String> arrayList) {
        onGetStartedClick.write((Object) arrayList, "allowTags");
        C6192xd0d7758e cardlessCreditCardSelectorFragment$MediaBrowserCompat$CustomActionResultReceiver = CardlessCreditCardSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver;
        CardlessCreditCardSelectorFragment MediaBrowserCompat$ItemReceiver = C6192xd0d7758e.MediaBrowserCompat$ItemReceiver(arrayList, true);
        this.MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$ItemReceiver;
        MediaBrowserCompat$ItemReceiver.RatingCompat = this;
        CardView read = getChildFragmentManager().read();
        CardlessCreditCardSelectorFragment cardlessCreditCardSelectorFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (cardlessCreditCardSelectorFragment == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mCardlessCreditCardSelectorFragment");
        }
        read.MediaBrowserCompat$ItemReceiver(R.id.source_of_fund_container, cardlessCreditCardSelectorFragment).write();
    }

    public final void IconCompatParcelizer(chain chain, lambda$processSetComponents$1 lambda_processsetcomponents_1, String str, jsonFromMapEntryString jsonfrommapentrystring) {
        onGetStartedClick.write((Object) lambda_processsetcomponents_1, "purchaseSourceOfFundDisplay");
        onGetStartedClick.write((Object) jsonfrommapentrystring, "paymentFlowType");
        if (this.MediaBrowserCompat$MediaItem == null) {
            CcSofCreditCardOnlyInputFragment.read read = CcSofCreditCardOnlyInputFragment.MediaBrowserCompat$CustomActionResultReceiver;
            onGetStartedClick.write((Object) lambda_processsetcomponents_1, "purchaseSourceOfFundDisplay");
            onGetStartedClick.write((Object) jsonfrommapentrystring, "paymentFlowType");
            CcSofCreditCardOnlyInputFragment ccSofCreditCardOnlyInputFragment = new CcSofCreditCardOnlyInputFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXTRA_CC_SOURCE_OF_FUND_DISPLAY", lambda_processsetcomponents_1);
            bundle.putParcelable("EXTRA_CREDIT_CARD_DISPLAY", chain);
            bundle.putString("EXTRA_CALLBACK_URL", str);
            bundle.putInt("com.scb.phone.EXTRA_PAYMENT_FLOW_TYPE", jsonfrommapentrystring.ordinal());
            ccSofCreditCardOnlyInputFragment.setArguments(bundle);
            this.MediaBrowserCompat$MediaItem = ccSofCreditCardOnlyInputFragment;
            CardView read2 = getChildFragmentManager().read();
            CcSofCreditCardOnlyInputFragment ccSofCreditCardOnlyInputFragment2 = this.MediaBrowserCompat$MediaItem;
            if (ccSofCreditCardOnlyInputFragment2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mCcSofCreditCardOnlyInputFragment");
            }
            read2.MediaBrowserCompat$ItemReceiver(R.id.input_container, ccSofCreditCardOnlyInputFragment2).write();
            return;
        }
        CcSofCreditCardOnlyInputFragment ccSofCreditCardOnlyInputFragment3 = this.MediaBrowserCompat$MediaItem;
        if (ccSofCreditCardOnlyInputFragment3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mCcSofCreditCardOnlyInputFragment");
        }
        onGetStartedClick.write((Object) lambda_processsetcomponents_1, "purchaseCcSofDisplay");
        onGetStartedClick.write((Object) jsonfrommapentrystring, "paymentFlowType");
        typeToString typetostring = ccSofCreditCardOnlyInputFragment3.mPresenter;
        if (typetostring == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
        }
        typetostring.IconCompatParcelizer(lambda_processsetcomponents_1, chain, str, jsonfrommapentrystring);
    }

    public final void write(boolean z) {
        TextView textView = this.mSourceOfFundEmptyStateTextView;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mSourceOfFundEmptyStateTextView");
        }
        View view = textView;
        onGetStartedClick.write((Object) view, "$this$isVisible");
        view.setVisibility(z ? 0 : 8);
    }

    public final void IconCompatParcelizer(boolean z) {
        RelativeLayout relativeLayout = this.mLayoutError;
        if (relativeLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mLayoutError");
        }
        View view = relativeLayout;
        onGetStartedClick.write((Object) view, "$this$isVisible");
        view.setVisibility(z ? 0 : 8);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(chain chain) {
        onGetStartedClick.write((Object) chain, "display");
        C$Gson$Types.GenericArrayTypeImpl genericArrayTypeImpl = this.mPresenter;
        if (genericArrayTypeImpl == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
        }
        onGetStartedClick.write((Object) chain, "creditCardDisplay");
        genericArrayTypeImpl.write = chain;
        writeUInt64NoTag.IconCompatParcelizer read = new C$Gson$Types.GenericArrayTypeImpl.read(genericArrayTypeImpl);
        if (genericArrayTypeImpl.RatingCompat != null) {
            read.IconCompatParcelizer(genericArrayTypeImpl.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        C$Gson$Types.GenericArrayTypeImpl genericArrayTypeImpl = this.mPresenter;
        if (genericArrayTypeImpl == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
        }
        writeUInt64NoTag.IconCompatParcelizer _gson_types_genericarraytypeimpl_mediabrowsercompat_customactionresultreceiver = new C2984x49d52c29(z);
        if (genericArrayTypeImpl.RatingCompat != null) {
            _gson_types_genericarraytypeimpl_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(genericArrayTypeImpl.RatingCompat);
        }
    }

    public final void write() {
        C$Gson$Types.GenericArrayTypeImpl genericArrayTypeImpl = this.mPresenter;
        if (genericArrayTypeImpl == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
        }
        genericArrayTypeImpl.write = null;
        writeUInt64NoTag.IconCompatParcelizer write2 = new C$Gson$Types.GenericArrayTypeImpl.write(genericArrayTypeImpl);
        if (genericArrayTypeImpl.RatingCompat != null) {
            write2.IconCompatParcelizer(genericArrayTypeImpl.RatingCompat);
        }
    }
}

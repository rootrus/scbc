package com.scb.phone.view.fragment.bankingagent;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.fragment.BaseFragment;
import com.scb.phone.view.fragment.bankingagent.BaseBankingAgentsFragment;
import kotlin.TypeCastException;
import p040o.CheckCaptureModule_GetExtractionParametersFactory;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.GoodToKnowActivity;
import p040o.HmlPinActivity;
import p040o.applyNonNullHeader;
import p040o.applyNonNullHeader$MediaBrowserCompat$ItemReceiver;
import p040o.applyNonNullHeader$MediaBrowserCompat$MediaItem;
import p040o.onGetStartedClick;
import p040o.sameThreadExecutor;
import p040o.setLastBaselineToBottomHeight;
import p040o.writeUInt64NoTag;

public final class BankingAgentSelectedFragment extends BaseFragment implements CheckCaptureModule_GetExtractionParametersFactory.IconCompatParcelizer {
    public static final write IconCompatParcelizer = new write((byte) 0);
    private C5855x4f7ba9d7 MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    public ImageView agentIcon;
    @BindView
    public TextView agentName;
    @BindView
    public TextView amountError;
    @BindView
    public AmountEditText amountText;
    @BindView
    public TextView dailyLimitText;
    @BindView
    public TextView feeText;
    @HmlPinActivity
    public applyNonNullHeader presenter;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    @OnClick
    public final void onCloseClicked() {
        C5855x4f7ba9d7 bankingAgentSelectedFragment$MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (bankingAgentSelectedFragment$MediaBrowserCompat$CustomActionResultReceiver == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("bankingAgentSelectedListener");
        }
        bankingAgentSelectedFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat();
    }

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        if (getParentFragment() instanceof BaseBankingAgentsFragment.write) {
            Fragment parentFragment = getParentFragment();
            if (parentFragment != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = (C5855x4f7ba9d7) parentFragment;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.view.fragment.bankingagent.BankingAgentSelectedFragment.OnBankingAgentSelectedListener");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        sameThreadExecutor samethreadexecutor;
        String str;
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f85712131493798, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        applyNonNullHeader applynonnullheader = this.presenter;
        if (applynonnullheader == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        applynonnullheader.MediaBrowserCompat$ItemReceiver(this);
        Bundle arguments = getArguments();
        if (!(arguments == null || (samethreadexecutor = (sameThreadExecutor) arguments.getParcelable("com.scb.phone.EXTRA_BANKING_AGENT_TAG")) == null)) {
            applyNonNullHeader applynonnullheader2 = this.presenter;
            if (applynonnullheader2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            Bundle arguments2 = getArguments();
            if (arguments2 == null || (str = arguments2.getString("com.scb.phone.EXTRA_POSTING_TYPE")) == null) {
                str = "";
            }
            onGetStartedClick.IconCompatParcelizer((Object) samethreadexecutor, "it");
            onGetStartedClick.write((Object) str, "postingType");
            onGetStartedClick.write((Object) samethreadexecutor, "display");
            applynonnullheader2.IconCompatParcelizer = samethreadexecutor;
            applynonnullheader2.read = str;
            writeUInt64NoTag.IconCompatParcelizer applynonnullheader_mediabrowsercompat_mediaitem = new applyNonNullHeader$MediaBrowserCompat$MediaItem(str, samethreadexecutor);
            if (applynonnullheader2.RatingCompat != null) {
                z = true;
            }
            if (z) {
                applynonnullheader_mediabrowsercompat_mediaitem.IconCompatParcelizer(applynonnullheader2.RatingCompat);
            }
        }
        AmountEditText amountEditText = this.amountText;
        if (amountEditText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("amountText");
        }
        amountEditText.setOnAmountChangeListener(new IconCompatParcelizer(this));
        AmountEditText amountEditText2 = this.amountText;
        if (amountEditText2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("amountText");
        }
        amountEditText2.setOnFocusChangeListener(new read(this));
        return inflate;
    }

    public static final class IconCompatParcelizer implements AmountEditText.read {
        private /* synthetic */ BankingAgentSelectedFragment IconCompatParcelizer;

        IconCompatParcelizer(BankingAgentSelectedFragment bankingAgentSelectedFragment) {
            this.IconCompatParcelizer = bankingAgentSelectedFragment;
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
            applyNonNullHeader applynonnullheader = this.IconCompatParcelizer.presenter;
            if (applynonnullheader == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            applynonnullheader.MediaBrowserCompat$ItemReceiver = d;
            writeUInt64NoTag.IconCompatParcelizer applynonnullheader_mediabrowsercompat_itemreceiver = new applyNonNullHeader$MediaBrowserCompat$ItemReceiver(applynonnullheader);
            if (applynonnullheader.RatingCompat != null) {
                applynonnullheader_mediabrowsercompat_itemreceiver.IconCompatParcelizer(applynonnullheader.RatingCompat);
            }
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver() {
            this.IconCompatParcelizer.PlaybackStateCompat$CustomAction();
        }
    }

    static final class read implements View.OnFocusChangeListener {
        private /* synthetic */ BankingAgentSelectedFragment read;

        read(BankingAgentSelectedFragment bankingAgentSelectedFragment) {
            this.read = bankingAgentSelectedFragment;
        }

        public final void onFocusChange(View view, boolean z) {
            AmountEditText amountEditText = this.read.amountText;
            if (amountEditText == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("amountText");
            }
            Editable text = amountEditText.getText();
            if (text != null) {
                boolean z2 = false;
                if (text.length() > 0) {
                    applyNonNullHeader applynonnullheader = this.read.presenter;
                    if (applynonnullheader == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                    }
                    AmountEditText amountEditText2 = this.read.amountText;
                    if (amountEditText2 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("amountText");
                    }
                    double d = amountEditText2.write;
                    if (!applynonnullheader.MediaBrowserCompat$ItemReceiver(d)) {
                        writeUInt64NoTag.IconCompatParcelizer write = new applyNonNullHeader.write(applynonnullheader);
                        if (applynonnullheader.RatingCompat != null) {
                            z2 = true;
                        }
                        if (z2) {
                            write.IconCompatParcelizer(applynonnullheader.RatingCompat);
                        }
                    } else if (!applynonnullheader.read(d)) {
                        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = applyNonNullHeader.read.MediaBrowserCompat$ItemReceiver;
                        if (applynonnullheader.RatingCompat != null) {
                            z2 = true;
                        }
                        if (z2) {
                            iconCompatParcelizer.IconCompatParcelizer(applynonnullheader.RatingCompat);
                        }
                    } else {
                        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = applyNonNullHeader.IconCompatParcelizer.IconCompatParcelizer;
                        if (applynonnullheader.RatingCompat != null) {
                            z2 = true;
                        }
                        if (z2) {
                            iconCompatParcelizer2.IconCompatParcelizer(applynonnullheader.RatingCompat);
                        }
                    }
                }
            }
        }
    }

    public final void IconCompatParcelizer(String str, sameThreadExecutor samethreadexecutor) {
        onGetStartedClick.write((Object) str, "postingType");
        onGetStartedClick.write((Object) samethreadexecutor, "display");
        TextView textView = this.agentName;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("agentName");
        }
        textView.setText(samethreadexecutor.MediaDescriptionCompat);
        AmountEditText amountEditText = this.amountText;
        if (amountEditText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("amountText");
        }
        amountEditText.setHint(getString(R.string.banking_amount_max_min, samethreadexecutor.MediaBrowserCompat$SearchResultReceiver, samethreadexecutor.MediaBrowserCompat$ItemReceiver));
        TextView textView2 = this.dailyLimitText;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("dailyLimitText");
        }
        textView2.setText(getString(GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(str, "D", true) ? R.string.banking_deposit_daily_limit : R.string.banking_withdrawal_daily_limit, samethreadexecutor.MediaBrowserCompat$CustomActionResultReceiver));
        TextView textView3 = this.feeText;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("feeText");
        }
        textView3.setText(getString(GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(str, "D", true) ? R.string.banking_deposits_fee_text : R.string.banking_withdrawal_fee_text));
        Context context = getContext();
        if (context != null) {
            Drawable write2 = setLastBaselineToBottomHeight.write(context, R.drawable.biller_place_holder);
            ImageView imageView = this.agentIcon;
            if (imageView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("agentIcon");
            }
            String str2 = samethreadexecutor.read;
            onGetStartedClick.IconCompatParcelizer((Object) context, "it");
            FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(context, write2, imageView, str2, context.getResources().getDimensionPixelOffset(R.dimen.f72032131165280), setLastBaselineToBottomHeight.read(context, R.color.f66182131099773));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        r1 = r1.getString("com.scb.phone.EXTRA_POSTING_TYPE");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaBrowserCompat$ItemReceiver() {
        /*
            r3 = this;
            com.scb.phone.view.custom.common.AmountEditText r0 = r3.amountText
            if (r0 != 0) goto L_0x0009
            java.lang.String r1 = "amountText"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x0009:
            r1 = 1
            r0.setInvalidAmount(r1)
            android.widget.TextView r0 = r3.amountError
            java.lang.String r1 = "amountError"
            if (r0 != 0) goto L_0x0016
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x0016:
            r2 = 0
            r0.setVisibility(r2)
            android.widget.TextView r0 = r3.amountError
            if (r0 != 0) goto L_0x0021
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x0021:
            android.os.Bundle r1 = r3.getArguments()
            if (r1 == 0) goto L_0x003a
            java.lang.String r2 = "com.scb.phone.EXTRA_POSTING_TYPE"
            java.lang.String r1 = r1.getString(r2)
            if (r1 == 0) goto L_0x003a
            java.lang.String r2 = "D"
            boolean r1 = r1.equals(r2)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto L_0x003b
        L_0x003a:
            r1 = 0
        L_0x003b:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r1 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r1, (java.lang.Object) r2)
            if (r1 == 0) goto L_0x0047
            r1 = 2131756238(0x7f1004ce, float:1.9143378E38)
            goto L_0x004a
        L_0x0047:
            r1 = 2131756239(0x7f1004cf, float:1.914338E38)
        L_0x004a:
            java.lang.String r1 = r3.getString(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.bankingagent.BankingAgentSelectedFragment.MediaBrowserCompat$ItemReceiver():void");
    }

    public final void write(String str, String str2) {
        onGetStartedClick.write((Object) str, "min");
        onGetStartedClick.write((Object) str2, "max");
        AmountEditText amountEditText = this.amountText;
        if (amountEditText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("amountText");
        }
        amountEditText.setInvalidAmount(true);
        TextView textView = this.amountError;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("amountError");
        }
        textView.setVisibility(0);
        TextView textView2 = this.amountError;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("amountError");
        }
        textView2.setText(getString(R.string.banking_amount_error_range, str, str2));
    }

    public final void IconCompatParcelizer() {
        AmountEditText amountEditText = this.amountText;
        if (amountEditText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("amountText");
        }
        amountEditText.setInvalidAmount(false);
        TextView textView = this.amountError;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("amountError");
        }
        textView.setVisibility(8);
    }

    public final void IconCompatParcelizer(double d) {
        C5855x4f7ba9d7 bankingAgentSelectedFragment$MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (bankingAgentSelectedFragment$MediaBrowserCompat$CustomActionResultReceiver == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("bankingAgentSelectedListener");
        }
        bankingAgentSelectedFragment$MediaBrowserCompat$CustomActionResultReceiver.write(d);
    }

    public final void onDestroy() {
        applyNonNullHeader applynonnullheader = this.presenter;
        if (applynonnullheader == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        applynonnullheader.onDestroy();
        super.onDestroy();
    }
}

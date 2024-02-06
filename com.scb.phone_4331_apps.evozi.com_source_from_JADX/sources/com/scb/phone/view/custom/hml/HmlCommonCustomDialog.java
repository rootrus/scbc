package com.scb.phone.view.custom.hml;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.AbstractSafeParcelable;
import p040o.CompoundOrdering;
import p040o.DebitCardResetOtpActivity;
import p040o.FundActionsSuccessActivity;
import p040o.HitBuilders;
import p040o.HmlPinActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.IIdExtractionResult;
import p040o.ListAppsActivityContract;
import p040o.TaskRunner;
import p040o.ViewUtils;
import p040o.configure;
import p040o.createSegment;
import p040o.getRemoteCreator;
import p040o.getXmlAttributeString;
import p040o.onGetStartedClick;
import p040o.safeContains;
import p040o.segmentFor;
import p040o.setCurrencyCode;
import p040o.setRevenue;
import p040o.setTarget;
import p040o.setTransactionId;
import p040o.zzfx;
import p040o.zzvk;
import p040o.zzxc;
import p040o.zzxi;
import p040o.zzxj;
import p040o.zzxk;

public class HmlCommonCustomDialog extends Dialog {
    @BindView
    public TextView messageText;
    @BindView
    public TextView negativeButton;
    @BindView
    public Button positiveButton;
    @BindView
    public LinearLayout rootView;
    @BindView
    public TextView titleText;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HmlCommonCustomDialog(Context context) {
        super(context);
        onGetStartedClick.write((Object) context, "context");
        requestWindowFeature(1);
        setContentView(R.layout.f81672131493393);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawableResource(17170445);
        }
        ButterKnife.write((Dialog) this);
    }

    public static final class IconCompatParcelizer implements IIdExtractionResult {
        public final HitBuilders.TransactionBuilder IconCompatParcelizer;
        private final TaskRunner.TaskCompletedListener.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;
        private zzxk MediaBrowserCompat$ItemReceiver;
        private final String MediaBrowserCompat$SearchResultReceiver;
        private final setRevenue MediaMetadataCompat;
        private final setCurrencyCode read;
        public final setTarget write;

        private IconCompatParcelizer() {
        }

        @HmlPinActivity
        public IconCompatParcelizer(TaskRunner.TaskCompletedListener.IconCompatParcelizer iconCompatParcelizer, HitBuilders.TransactionBuilder transactionBuilder, setRevenue setrevenue, setCurrencyCode setcurrencycode, setTransactionId settransactionid, setTarget settarget, String str) {
            this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer;
            this.IconCompatParcelizer = transactionBuilder;
            this.MediaMetadataCompat = setrevenue;
            this.read = setcurrencycode;
            this.write = settarget;
            this.MediaBrowserCompat$SearchResultReceiver = str;
        }

        public final DebitCardResetOtpActivity<zzxi> IconCompatParcelizer(safeContains safecontains) {
            return this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.confirmPurchaseBond(safecontains).map(new AbstractSafeParcelable(this));
        }

        public final DebitCardResetOtpActivity<zzxi> write(safeContains safecontains) {
            return this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.confirmPurchaseBondV2(safecontains).map(new ListAppsActivityContract(this));
        }

        public final DebitCardResetOtpActivity<zzxc.zzd> MediaBrowserCompat$CustomActionResultReceiver(createSegment createsegment) {
            return this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.getBondAccountSummary(createsegment).map(new getXmlAttributeString(this));
        }

        public final DebitCardResetOtpActivity<zzvk> read(String str) {
            return this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.getBondDltTermsAndConditions(str).map(new zzfx(this.MediaMetadataCompat));
        }

        public final DebitCardResetOtpActivity<zzxj> write(CompoundOrdering compoundOrdering) {
            return this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.getBondSelectionList(compoundOrdering).map(new configure(this));
        }

        public final DebitCardResetOtpActivity<zzvk> IconCompatParcelizer() {
            return this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.getBondTermsAndConditions().map(new zzfx(this.MediaMetadataCompat));
        }

        public final zzxk write() {
            return this.MediaBrowserCompat$ItemReceiver;
        }

        public final String read() {
            return this.MediaBrowserCompat$SearchResultReceiver;
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(zzxk zzxk) {
            this.MediaBrowserCompat$ItemReceiver = zzxk;
        }

        public final DebitCardResetOtpActivity<zzxk> read(segmentFor segmentfor) {
            return this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.verifyPurchaseBond(segmentfor).map(new ViewUtils(this));
        }

        public final DebitCardResetOtpActivity<zzxk> MediaBrowserCompat$CustomActionResultReceiver(segmentFor segmentfor) {
            return this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.verifyPurchaseBondV2(segmentfor).map(new getRemoteCreator(this));
        }
    }

    public final HmlCommonCustomDialog IconCompatParcelizer(String str) {
        CharSequence charSequence = str;
        if (!TextUtils.isEmpty(charSequence)) {
            TextView textView = this.titleText;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("titleText");
            }
            textView.setVisibility(0);
            TextView textView2 = this.titleText;
            if (textView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("titleText");
            }
            textView2.setText(charSequence);
        }
        return this;
    }

    public final HmlCommonCustomDialog read(String str) {
        CharSequence charSequence = str;
        if (!TextUtils.isEmpty(charSequence)) {
            TextView textView = this.messageText;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("messageText");
            }
            textView.setVisibility(0);
            TextView textView2 = this.messageText;
            if (textView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("messageText");
            }
            textView2.setText(charSequence);
        }
        return this;
    }

    public final HmlCommonCustomDialog MediaBrowserCompat$ItemReceiver(String str, FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> fundActionsSuccessActivity) {
        CharSequence charSequence = str;
        if (!TextUtils.isEmpty(charSequence)) {
            Button button = this.positiveButton;
            if (button == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("positiveButton");
            }
            button.setVisibility(0);
            Button button2 = this.positiveButton;
            if (button2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("positiveButton");
            }
            button2.setText(charSequence);
            Button button3 = this.positiveButton;
            if (button3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("positiveButton");
            }
            button3.setOnClickListener(new write(this, fundActionsSuccessActivity));
        }
        return this;
    }

    static final class write implements View.OnClickListener {
        private /* synthetic */ FundActionsSuccessActivity MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ HmlCommonCustomDialog write;

        write(HmlCommonCustomDialog hmlCommonCustomDialog, FundActionsSuccessActivity fundActionsSuccessActivity) {
            this.write = hmlCommonCustomDialog;
            this.MediaBrowserCompat$ItemReceiver = fundActionsSuccessActivity;
        }

        public final void onClick(View view) {
            FundActionsSuccessActivity fundActionsSuccessActivity = this.MediaBrowserCompat$ItemReceiver;
            if (fundActionsSuccessActivity != null) {
                fundActionsSuccessActivity.invoke();
            }
            this.write.dismiss();
        }
    }

    public final HmlCommonCustomDialog write(String str, FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> fundActionsSuccessActivity) {
        CharSequence charSequence = str;
        if (!TextUtils.isEmpty(charSequence)) {
            TextView textView = this.negativeButton;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("negativeButton");
            }
            textView.setVisibility(0);
            TextView textView2 = this.negativeButton;
            if (textView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("negativeButton");
            }
            textView2.setText(charSequence);
            TextView textView3 = this.negativeButton;
            if (textView3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("negativeButton");
            }
            textView3.setOnClickListener(new read(this, fundActionsSuccessActivity));
        }
        return this;
    }

    static final class read implements View.OnClickListener {
        private /* synthetic */ HmlCommonCustomDialog IconCompatParcelizer;
        private /* synthetic */ FundActionsSuccessActivity MediaBrowserCompat$ItemReceiver;

        read(HmlCommonCustomDialog hmlCommonCustomDialog, FundActionsSuccessActivity fundActionsSuccessActivity) {
            this.IconCompatParcelizer = hmlCommonCustomDialog;
            this.MediaBrowserCompat$ItemReceiver = fundActionsSuccessActivity;
        }

        public final void onClick(View view) {
            FundActionsSuccessActivity fundActionsSuccessActivity = this.MediaBrowserCompat$ItemReceiver;
            if (fundActionsSuccessActivity != null) {
                fundActionsSuccessActivity.invoke();
            }
            this.IconCompatParcelizer.dismiss();
        }
    }
}

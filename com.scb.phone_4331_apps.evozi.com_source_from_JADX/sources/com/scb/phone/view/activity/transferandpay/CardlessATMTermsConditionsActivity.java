package com.scb.phone.view.activity.transferandpay;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.TermsAndConditionsFragment;
import com.scb.phone.view.fragment.TermsConditionsFragment;
import p040o.CheckCaptureModule_GetIExceptionResponseDeserializerKtaFactory;
import p040o.ExtractActivity;
import p040o.FragmentBuilder_BindCustomizeYourPageFragment;
import p040o.HmlPinActivity;
import p040o.draggable;
import p040o.immediateFailedFuture;
import p040o.onGetStartedClick;

public final class CardlessATMTermsConditionsActivity extends BaseActivityWithFragment implements CheckCaptureModule_GetIExceptionResponseDeserializerKtaFactory, FragmentBuilder_BindCustomizeYourPageFragment {
    @HmlPinActivity
    public ExtractActivity.C64801 presenter;

    public final void setContentView() {
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        return new Fragment();
    }

    public final String au_() {
        String string = getString(R.string.cardless_tnc_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.cardless_tnc_title)");
        return string;
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [o.ExtractActivity] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r3) {
        /*
            r2 = this;
            super.onCreate(r3)
            r3 = 2131493019(0x7f0c009b, float:1.8609506E38)
            r2.setContentView(r3)
            r3 = r2
            android.app.Activity r3 = (android.app.Activity) r3
            butterknife.ButterKnife.MediaBrowserCompat$ItemReceiver(r3)
            r2.setStackedBackground()
            o.ExtractActivity$1 r3 = r2.presenter
            java.lang.String r0 = "presenter"
            if (r3 != 0) goto L_0x001b
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r0)
        L_0x001b:
            r1 = r2
            o.CheckCaptureModule_GetICheckDeserializerRttiFactory r1 = (p040o.CheckCaptureModule_GetICheckDeserializerRttiFactory) r1
            r3.MediaBrowserCompat$ItemReceiver(r1)
            o.ExtractActivity$1 r3 = r2.presenter
            if (r3 != 0) goto L_0x0028
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r0)
        L_0x0028:
            o.ExtractActivity$1$MediaBrowserCompat$ItemReceiver r0 = p040o.ExtractActivity$1$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver
            o.FundFactSheetActivity r0 = (p040o.FundFactSheetActivity) r0
            if (r0 == 0) goto L_0x0034
            o.ExtractActivity r1 = new o.ExtractActivity
            r1.<init>(r0)
            r0 = r1
        L_0x0034:
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r1 = r3.RatingCompat
            if (r1 == 0) goto L_0x003c
            r1 = 1
            goto L_0x003d
        L_0x003c:
            r1 = 0
        L_0x003d:
            if (r1 == 0) goto L_0x0044
            T r3 = r3.RatingCompat
            r0.IconCompatParcelizer(r3)
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.transferandpay.CardlessATMTermsConditionsActivity.onCreate(android.os.Bundle):void");
    }

    public final void IconCompatParcelizer() {
        String simpleName = TermsConditionsFragment.class.getSimpleName();
        onGetStartedClick.IconCompatParcelizer((Object) simpleName, "TermsConditionsFragment::class.java.simpleName");
        immediateFailedFuture immediatefailedfuture = new immediateFailedFuture(simpleName, (String) null, "CARDLESS", (String) null, getString(R.string.cardless_atm_title), (String) null, (String) null, true, false, false);
        TermsAndConditionsFragment.write write2 = TermsAndConditionsFragment.IconCompatParcelizer;
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container, TermsAndConditionsFragment.write.MediaBrowserCompat$CustomActionResultReceiver(immediatefailedfuture)).write();
    }

    public final void IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, "tag");
        CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer((Context) this);
        String string = IconCompatParcelizer2.read.getString(R.string.cardless_tnc_accept_dialog_title);
        if (!(string == null || string.length() == 0)) {
            IconCompatParcelizer2.mTitleTextView.setVisibility(0);
            IconCompatParcelizer2.mTitleTextView.setText(string);
        }
        String string2 = IconCompatParcelizer2.read.getString(R.string.cardless_tnc_accept_dialog_description);
        if (true ^ (string2 == null || string2.length() == 0)) {
            IconCompatParcelizer2.mTextTextView.setVisibility(0);
            IconCompatParcelizer2.mTextTextView.setText(string2);
        }
        CustomDialog IconCompatParcelizer3 = IconCompatParcelizer2.IconCompatParcelizer(IconCompatParcelizer2.read.getString(R.string.cardless_tnc_accept_dialog_btn_accept), new write(this));
        IconCompatParcelizer3.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer3.read.getString(R.string.cardless_tnc_accept_dialog_btn_cancel), IconCompatParcelizer.IconCompatParcelizer).show();
    }

    static final class write implements DialogInterface.OnClickListener {
        private /* synthetic */ CardlessATMTermsConditionsActivity MediaBrowserCompat$ItemReceiver;

        write(CardlessATMTermsConditionsActivity cardlessATMTermsConditionsActivity) {
            this.MediaBrowserCompat$ItemReceiver = cardlessATMTermsConditionsActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            ExtractActivity.C64801 r3 = this.MediaBrowserCompat$ItemReceiver.presenter;
            if (r3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            if (r3.RatingCompat != null) {
                r3.RatingCompat.AlertController$RecycleListView();
            }
            draggable draggable = r3.IconCompatParcelizer;
            draggable.write(draggable.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(), new ExtractActivity.C64801.read(r3));
            this.MediaBrowserCompat$ItemReceiver.setResult(-1);
            this.MediaBrowserCompat$ItemReceiver.finish();
        }
    }

    static final class IconCompatParcelizer implements DialogInterface.OnClickListener {
        public static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, "tag");
        CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer((Context) this);
        String string = IconCompatParcelizer2.read.getString(R.string.cardless_tnc_decline_dialog_title);
        if (!(string == null || string.length() == 0)) {
            IconCompatParcelizer2.mTitleTextView.setVisibility(0);
            IconCompatParcelizer2.mTitleTextView.setText(string);
        }
        String string2 = IconCompatParcelizer2.read.getString(R.string.cardless_tnc_decline_dialog_description);
        if (true ^ (string2 == null || string2.length() == 0)) {
            IconCompatParcelizer2.mTextTextView.setVisibility(0);
            IconCompatParcelizer2.mTextTextView.setText(string2);
        }
        CustomDialog IconCompatParcelizer3 = IconCompatParcelizer2.IconCompatParcelizer(IconCompatParcelizer2.read.getString(R.string.cardless_tnc_decline_dialog_btn_accept), new read(this));
        IconCompatParcelizer3.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer3.read.getString(R.string.cardless_tnc_decline_dialog_btn_cancel), C5719xa372fd99.MediaBrowserCompat$CustomActionResultReceiver).show();
    }

    static final class read implements DialogInterface.OnClickListener {
        private /* synthetic */ CardlessATMTermsConditionsActivity write;

        read(CardlessATMTermsConditionsActivity cardlessATMTermsConditionsActivity) {
            this.write = cardlessATMTermsConditionsActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            this.write.setResult(0);
            this.write.finish();
        }
    }

    public final void onBackPressed() {
        setResult(0);
        super.onBackPressed();
    }

    public final void onDestroy() {
        ExtractActivity.C64801 r0 = this.presenter;
        if (r0 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        r0.onDestroy();
        super.onDestroy();
    }

    public static final Intent read(Context context) {
        onGetStartedClick.write((Object) context, "context");
        return new Intent(context, CardlessATMTermsConditionsActivity.class);
    }
}

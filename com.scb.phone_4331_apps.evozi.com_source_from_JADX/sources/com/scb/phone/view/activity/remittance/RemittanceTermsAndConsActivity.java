package com.scb.phone.view.activity.remittance;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.TermsAndConditionsFragment;
import p040o.C5021nT;
import p040o.FragmentBuilder_BindCustomizeYourPageFragment;
import p040o.FundActionsSuccessActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlPinActivity;
import p040o.Lists;
import p040o.ServerProjectProvider;
import p040o.getLastInNonemptyList$MediaBrowserCompat$ItemReceiver;
import p040o.immediateFailedFuture;
import p040o.nT$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.nT$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;

public final class RemittanceTermsAndConsActivity extends BaseActivityWithFragment implements ServerProjectProvider.C706212, FragmentBuilder_BindCustomizeYourPageFragment {
    public static final C5712x6024113b MediaBrowserCompat$SearchResultReceiver = new C5712x6024113b((byte) 0);
    @HmlPinActivity
    public C5021nT presenter;

    public final void MediaBrowserCompat$SearchResultReceiver() {
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C5021nT nTVar = this.presenter;
        if (nTVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        nTVar.MediaBrowserCompat$ItemReceiver(this);
        C5021nT nTVar2 = this.presenter;
        if (nTVar2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String D_ = mo3026D_();
        onGetStartedClick.IconCompatParcelizer((Object) D_, "language");
        onGetStartedClick.write((Object) D_, "lang");
        writeUInt64NoTag.IconCompatParcelizer nt_mediabrowsercompat_customactionresultreceiver = new nT$MediaBrowserCompat$CustomActionResultReceiver(nTVar2);
        if (nTVar2.RatingCompat != null) {
            nt_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(nTVar2.RatingCompat);
        }
        mo13676d_("outward_remittance_tc");
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        return new Fragment();
    }

    public final String au_() {
        String string = getString(R.string.terms_and_conditions);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(com.scb.phone.…ing.terms_and_conditions)");
        return string;
    }

    public final void read(immediateFailedFuture immediatefailedfuture) {
        onGetStartedClick.write((Object) immediatefailedfuture, "display");
        TermsAndConditionsFragment.write write2 = TermsAndConditionsFragment.IconCompatParcelizer;
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container, TermsAndConditionsFragment.write.MediaBrowserCompat$CustomActionResultReceiver(immediatefailedfuture)).write();
    }

    public final void IconCompatParcelizer(String str) {
        CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer((Context) this);
        String string = IconCompatParcelizer2.read.getString(R.string.bond_accept_terms_alert_title);
        if (!(string == null || string.length() == 0)) {
            IconCompatParcelizer2.mTitleTextView.setVisibility(0);
            IconCompatParcelizer2.mTitleTextView.setText(string);
        }
        String string2 = IconCompatParcelizer2.read.getString(R.string.bond_accept_terms_alert_description);
        if (true ^ (string2 == null || string2.length() == 0)) {
            IconCompatParcelizer2.mTextTextView.setVisibility(0);
            IconCompatParcelizer2.mTextTextView.setText(string2);
        }
        CustomDialog IconCompatParcelizer3 = IconCompatParcelizer2.IconCompatParcelizer(IconCompatParcelizer2.read.getString(R.string.bond_accept_terms_alert_positive_button), new IconCompatParcelizer(this));
        IconCompatParcelizer3.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer3.read.getString(R.string.bond_terms_alert_negative_button), RemittanceTermsAndConsActivity$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer).show();
    }

    static final class IconCompatParcelizer implements DialogInterface.OnClickListener {
        private /* synthetic */ RemittanceTermsAndConsActivity write;

        IconCompatParcelizer(RemittanceTermsAndConsActivity remittanceTermsAndConsActivity) {
            this.write = remittanceTermsAndConsActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C5021nT nTVar = this.write.presenter;
            if (nTVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C5021nT.write.MediaBrowserCompat$ItemReceiver;
            if (nTVar.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(nTVar.RatingCompat);
            }
            Lists.TransformingSequentialList.C35951 r5 = nTVar.MediaBrowserCompat$ItemReceiver;
            FundActionsSuccessActivity read = new C5021nT.read(nTVar);
            FundFactSheetActivity nt_mediabrowsercompat_itemreceiver = new nT$MediaBrowserCompat$ItemReceiver(nTVar);
            onGetStartedClick.write((Object) read, "onSuccess");
            onGetStartedClick.write((Object) nt_mediabrowsercompat_itemreceiver, "onError");
            r5.read.MediaBrowserCompat$ItemReceiver(read, nt_mediabrowsercompat_itemreceiver, new getLastInNonemptyList$MediaBrowserCompat$ItemReceiver(), r5.MediaBrowserCompat$ItemReceiver);
        }
    }

    public final void write(String str) {
        CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer((Context) this);
        String string = IconCompatParcelizer2.read.getString(R.string.bond_decline_terms_alert_title);
        if (!(string == null || string.length() == 0)) {
            IconCompatParcelizer2.mTitleTextView.setVisibility(0);
            IconCompatParcelizer2.mTitleTextView.setText(string);
        }
        String string2 = IconCompatParcelizer2.read.getString(R.string.bond_decline_terms_alert_description);
        if (true ^ (string2 == null || string2.length() == 0)) {
            IconCompatParcelizer2.mTextTextView.setVisibility(0);
            IconCompatParcelizer2.mTextTextView.setText(string2);
        }
        CustomDialog IconCompatParcelizer3 = IconCompatParcelizer2.IconCompatParcelizer(IconCompatParcelizer2.read.getString(R.string.bond_decline_terms_alert_positive_button), new write(this));
        IconCompatParcelizer3.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer3.read.getString(R.string.bond_terms_alert_negative_button), read.read).show();
    }

    static final class write implements DialogInterface.OnClickListener {
        private /* synthetic */ RemittanceTermsAndConsActivity IconCompatParcelizer;

        write(RemittanceTermsAndConsActivity remittanceTermsAndConsActivity) {
            this.IconCompatParcelizer = remittanceTermsAndConsActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C5021nT nTVar = this.IconCompatParcelizer.presenter;
            if (nTVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C5021nT.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
            if (nTVar.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(nTVar.RatingCompat);
            }
        }
    }

    static final class read implements DialogInterface.OnClickListener {
        public static final read read = new read();

        read() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    public final void IconCompatParcelizer() {
        setResult(-1);
        finish();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        setResult(0);
        finish();
    }

    public final void setContentView() {
        C5021nT nTVar = this.presenter;
        if (nTVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C5021nT.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
        if (nTVar.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(nTVar.RatingCompat);
        }
    }
}

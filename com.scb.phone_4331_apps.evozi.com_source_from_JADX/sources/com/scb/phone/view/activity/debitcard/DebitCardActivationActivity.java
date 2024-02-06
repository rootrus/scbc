package com.scb.phone.view.activity.debitcard;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.debitcard.DebitCardActivationInputFragment;
import com.scb.phone.view.fragment.debitcard.DebitCardActivationInputFragment$MediaBrowserCompat$ItemReceiver;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.HmlPinActivity;
import p040o.IdCaptureModule_GetIIdExtractionServerKtaFactory;
import p040o.MyECouponActivity_ViewBinding;
import p040o.deserializeDb;
import p040o.nativeAddField;
import p040o.nativeGetNumberOfRows;
import p040o.nativeSetPageImageFileName;
import p040o.setTapText;

public class DebitCardActivationActivity extends BaseActivityWithFragment implements IdCaptureModule_GetIIdExtractionServerKtaFactory, DebitCardActivationInputFragment$MediaBrowserCompat$ItemReceiver {
    @HmlPinActivity
    public nativeGetNumberOfRows presenter;

    public static void MediaBrowserCompat$ItemReceiver(Context context) {
        Intent intent = new Intent(context, DebitCardActivationActivity.class);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            context.startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo13676d_("atm_activate_input_information_screen");
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        return DebitCardActivationInputFragment.MediaBrowserCompat$ItemReceiver();
    }

    public final String au_() {
        return getString(R.string.debit_card_activation_title);
    }

    public final void AppCompatActivity() {
        nativeGetNumberOfRows nativegetnumberofrows = this.presenter;
        nativeSetPageImageFileName nativesetpageimagefilename = nativeSetPageImageFileName.IconCompatParcelizer;
        if (nativegetnumberofrows.RatingCompat != null) {
            nativesetpageimagefilename.IconCompatParcelizer(nativegetnumberofrows.RatingCompat);
        }
    }

    public final void read() {
        Intent read = DebitCardConfirmPinActivity.read(this);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, read).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read2, 1);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void IconCompatParcelizer() {
        Intent MediaBrowserCompat$CustomActionResultReceiver = DebitCardOtpActivationActivity.MediaBrowserCompat$CustomActionResultReceiver(this);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, MediaBrowserCompat$CustomActionResultReceiver).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read, 2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        DebitCardSuccessfulActivationActivity.MediaBrowserCompat$ItemReceiver(this);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        RatingCompat(false);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        boolean z = false;
        if (1 == i && -1 == i2) {
            nativeGetNumberOfRows nativegetnumberofrows = this.presenter;
            deserializeDb deserializedb = deserializeDb.read;
            if (nativegetnumberofrows.RatingCompat != null) {
                z = true;
            }
            if (z) {
                deserializedb.IconCompatParcelizer(nativegetnumberofrows.RatingCompat);
            }
        } else if (2 != i) {
        } else {
            if (-1 == i2) {
                nativeGetNumberOfRows nativegetnumberofrows2 = this.presenter;
                nativeAddField nativeaddfield = nativeAddField.MediaBrowserCompat$CustomActionResultReceiver;
                if (nativegetnumberofrows2.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    nativeaddfield.IconCompatParcelizer(nativegetnumberofrows2.RatingCompat);
                }
            } else if (intent != null) {
                this.presenter.IconCompatParcelizer(intent.getStringExtra("OTP_ERROR_TITLE"), intent.getStringExtra("OTP_ERROR_MESSAGE"));
            }
        }
    }
}

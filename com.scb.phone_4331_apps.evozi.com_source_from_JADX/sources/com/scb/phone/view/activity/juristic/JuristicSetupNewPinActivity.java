package com.scb.phone.view.activity.juristic;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseChangePinActivity;
import com.scb.phone.view.activity.pinchange.PinChangeSuccessActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.concurrent.TimeUnit;
import p040o.C7135hI;
import p040o.CheckEligibilityActivity;
import p040o.DebitCardResetOtpActivity;
import p040o.FundActionsSuccessActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.IDocumentBaseOverlayView;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PlaceBuffer;
import p040o.forEachDstIn;
import p040o.isUpperCase;
import p040o.isUpperCase$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;
import p040o.setTapText;

public final class JuristicSetupNewPinActivity extends BaseChangePinActivity<IDocumentBaseOverlayView> implements C7135hI {
    public static final IconCompatParcelizer MediaBrowserCompat$MediaItem = new IconCompatParcelizer((byte) 0);
    private String MediaBrowserCompat$SearchResultReceiver;
    private String MediaDescriptionCompat;
    private final HmlVerifyEmailActivity MediaMetadataCompat;

    public JuristicSetupNewPinActivity() {
        FundActionsSuccessActivity fundActionsSuccessActivity = read.write;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.MediaMetadataCompat = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("DEVICE_STATE");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra, "intent.getStringExtra(DEVICE_STATE)");
        this.MediaDescriptionCompat = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("TOKEN_ID");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra2, "intent.getStringExtra(TOKEN_ID)");
        this.MediaBrowserCompat$SearchResultReceiver = stringExtra2;
        ((IDocumentBaseOverlayView) this.presenter).MediaBrowserCompat$ItemReceiver(this);
        ((IDocumentBaseOverlayView) this.presenter).IconCompatParcelizer();
        super.setStackedBackground();
        setTitle(R.string.juristic_setpin_title);
        setTabContainer();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.juristic_setpin_title);
    }

    public final void MediaDescriptionCompat() {
        super.MediaDescriptionCompat();
        setTitle(R.string.juristic_setpin_title);
        this.topTextView.setText(R.string.juristic_setpin_message);
        forEachDstIn foreachdstin = (forEachDstIn) this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver();
        forEachDstIn.read read2 = forEachDstIn.write;
        String str = this.MediaDescriptionCompat;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("juristicState");
        }
        foreachdstin.read("user_state", forEachDstIn.read.read(str));
        ((forEachDstIn) this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver()).MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "juristic_setpin");
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        super.MediaBrowserCompat$CustomActionResultReceiver();
        setTitle(R.string.juristic_setpin_title);
        this.topTextView.setText(R.string.juristic_confirmpin_message);
        forEachDstIn foreachdstin = (forEachDstIn) this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver();
        forEachDstIn.read read2 = forEachDstIn.write;
        String str = this.MediaDescriptionCompat;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("juristicState");
        }
        foreachdstin.read("user_state", forEachDstIn.read.read(str));
        ((forEachDstIn) this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver()).MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "juristic_confirmpin");
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem == null || menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public final void onBackPressed() {
        if (((IDocumentBaseOverlayView) this.presenter).read()) {
            String str = this.MediaDescriptionCompat;
            if (str == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("juristicState");
            }
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) "PRE_REGISTERED", (Object) str)) {
                CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer((Context) this);
                String string = IconCompatParcelizer2.read.getString(R.string.juristic_setpin_exit_dialog_title);
                if (!(string == null || string.length() == 0)) {
                    IconCompatParcelizer2.mTitleTextView.setVisibility(0);
                    IconCompatParcelizer2.mTitleTextView.setText(string);
                }
                String string2 = IconCompatParcelizer2.read.getString(R.string.juristic_setpin_exit_dialog_msg);
                if (true ^ (string2 == null || string2.length() == 0)) {
                    IconCompatParcelizer2.mTextTextView.setVisibility(0);
                    IconCompatParcelizer2.mTextTextView.setText(string2);
                }
                CustomDialog MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.cancel), write.MediaBrowserCompat$ItemReceiver);
                MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.confirm), new JuristicSetupNewPinActivity$MediaBrowserCompat$ItemReceiver(this)).show();
                return;
            }
            return;
        }
        ((IDocumentBaseOverlayView) this.presenter).MediaBrowserCompat$CustomActionResultReceiver();
    }

    static final class write implements DialogInterface.OnClickListener {
        public static final write MediaBrowserCompat$ItemReceiver = new write();

        write() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    public final void MediaBrowserCompat$MediaItem() {
        Context context = this;
        String str = this.MediaDescriptionCompat;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("juristicState");
        }
        Intent read2 = PinChangeSuccessActivity.read(context, str);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read3 = setTapText.write(this, read2).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read3.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(read3);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        finish();
    }

    public final void write(String str) {
        IDocumentBaseOverlayView iDocumentBaseOverlayView = (IDocumentBaseOverlayView) this.presenter;
        String str2 = this.MediaDescriptionCompat;
        if (str2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("juristicState");
        }
        String str3 = this.MediaBrowserCompat$SearchResultReceiver;
        if (str3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("preregistrationTokenId");
        }
        onGetStartedClick.write((Object) str2, "juristicState");
        onGetStartedClick.write((Object) str3, "preregistrationTokenId");
        isUpperCase isuppercase = iDocumentBaseOverlayView.IconCompatParcelizer;
        onGetStartedClick.write((Object) str2, "juristicState");
        onGetStartedClick.write((Object) str3, "preregistrationTokenId");
        DebitCardResetOtpActivity<PlaceBuffer> delay = isuppercase.IconCompatParcelizer.MediaBrowserCompat$MediaItem().delay(100, TimeUnit.MILLISECONDS);
        onGetStartedClick.IconCompatParcelizer((Object) delay, "iSprintRepositoryContrac…E, TimeUnit.MILLISECONDS)");
        DebitCardResetOtpActivity<R> doOnNext = delay.map(new isUpperCase.read(isuppercase, str, str2, str3)).flatMap(new isUpperCase$MediaBrowserCompat$ItemReceiver(isuppercase)).doOnNext(new isUpperCase.write(isuppercase));
        onGetStartedClick.IconCompatParcelizer((Object) doOnNext, "preAuthenticateFromApi()…      }\n                }");
        iDocumentBaseOverlayView.IconCompatParcelizer.write(doOnNext, new IDocumentBaseOverlayView.write(iDocumentBaseOverlayView));
    }

    static final class read extends CheckEligibilityActivity implements FundActionsSuccessActivity<forEachDstIn> {
        public static final read write = new read();

        read() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new forEachDstIn();
        }
    }
}

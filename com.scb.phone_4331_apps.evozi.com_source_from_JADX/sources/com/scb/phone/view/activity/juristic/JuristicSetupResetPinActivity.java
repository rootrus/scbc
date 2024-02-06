package com.scb.phone.view.activity.juristic;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseChangePinActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import java.util.concurrent.TimeUnit;
import p040o.C7135hI;
import p040o.CheckEligibilityActivity;
import p040o.DebitCardResetOtpActivity;
import p040o.FundActionsSuccessActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.LinkedListMultimap;
import p040o.PlaceBuffer;
import p040o.forEachDstIn;
import p040o.initMessages;
import p040o.initMessages$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.initMessages$MediaBrowserCompat$ItemReceiver;
import p040o.isUpperCase;
import p040o.onGetStartedClick;

public final class JuristicSetupResetPinActivity extends BaseChangePinActivity<initMessages> implements C7135hI {
    public static final JuristicSetupResetPinActivity$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$SearchResultReceiver = new JuristicSetupResetPinActivity$MediaBrowserCompat$ItemReceiver((byte) 0);
    private String MediaBrowserCompat$MediaItem;
    private final HmlVerifyEmailActivity MediaMetadataCompat;

    public JuristicSetupResetPinActivity() {
        FundActionsSuccessActivity fundActionsSuccessActivity = IconCompatParcelizer.read;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.MediaMetadataCompat = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("RESET_TOKEN_ID");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra, "intent.getStringExtra(RESET_TOKEN_ID)");
        this.MediaBrowserCompat$MediaItem = stringExtra;
        ((initMessages) this.presenter).MediaBrowserCompat$ItemReceiver(this);
        ((initMessages) this.presenter).IconCompatParcelizer();
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
        ((forEachDstIn) this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver()).MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "forgot_juristic_pin_new_pin");
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        super.MediaBrowserCompat$CustomActionResultReceiver();
        setTitle(R.string.juristic_setpin_title);
        this.topTextView.setText(R.string.juristic_confirmpin_message);
        ((forEachDstIn) this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver()).MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "forgot_juristic_pin_confirm_pin");
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem == null || menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public final void onBackPressed() {
        if (((initMessages) this.presenter).read()) {
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
            MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.confirm), new C5656xfa96cc42(this)).show();
            return;
        }
        ((initMessages) this.presenter).MediaBrowserCompat$CustomActionResultReceiver();
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
        MediaSessionCompat$Token(true);
    }

    public final void write(String str) {
        if (str != null) {
            initMessages initmessages = (initMessages) this.presenter;
            String str2 = this.MediaBrowserCompat$MediaItem;
            if (str2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("resetTokenId");
            }
            onGetStartedClick.write((Object) str, "newPin");
            onGetStartedClick.write((Object) str2, "resetTokenId");
            LinkedListMultimap.DistinctKeyIterator distinctKeyIterator = initmessages.write;
            FundFactSheetActivity initmessages_mediabrowsercompat_customactionresultreceiver = new initMessages$MediaBrowserCompat$CustomActionResultReceiver(initmessages);
            FundFactSheetActivity initmessages_mediabrowsercompat_itemreceiver = new initMessages$MediaBrowserCompat$ItemReceiver(initmessages);
            onGetStartedClick.write((Object) initmessages_mediabrowsercompat_customactionresultreceiver, "onSuccess");
            onGetStartedClick.write((Object) initmessages_mediabrowsercompat_itemreceiver, "onError");
            onGetStartedClick.write((Object) str, "pin");
            onGetStartedClick.write((Object) str2, "resetPinTokenId");
            isUpperCase isuppercase = distinctKeyIterator.read;
            DebitCardResetOtpActivity<PlaceBuffer> delay = isuppercase.IconCompatParcelizer.MediaBrowserCompat$MediaItem().delay(100, TimeUnit.MILLISECONDS);
            onGetStartedClick.IconCompatParcelizer((Object) delay, "iSprintRepositoryContrac…E, TimeUnit.MILLISECONDS)");
            isuppercase.write(delay, new LinkedListMultimap.DistinctKeyIterator.IconCompatParcelizer(distinctKeyIterator, str, str2, initmessages_mediabrowsercompat_customactionresultreceiver, initmessages_mediabrowsercompat_itemreceiver));
        }
    }

    static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundActionsSuccessActivity<forEachDstIn> {
        public static final IconCompatParcelizer read = new IconCompatParcelizer();

        IconCompatParcelizer() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new forEachDstIn();
        }
    }
}

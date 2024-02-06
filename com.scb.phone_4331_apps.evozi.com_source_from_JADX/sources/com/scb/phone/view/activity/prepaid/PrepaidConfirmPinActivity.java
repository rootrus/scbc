package com.scb.phone.view.activity.prepaid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8183f;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseChangePinActivity;
import org.bouncycastle.i18n.MessageBundle;
import p040o.AlertController$RecycleListView;
import p040o.C4765hh;
import p040o.FundActionsSuccessActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.ImmutableBiMap;
import p040o.LocalProjectProvider$5$MediaBrowserCompat$ItemReceiver;
import p040o.getKernelIDDstAtop;
import p040o.onGetStartedClick;
import p040o.setModel;

public final class PrepaidConfirmPinActivity extends BaseChangePinActivity<C4765hh> implements LocalProjectProvider$5$MediaBrowserCompat$ItemReceiver {
    public static final PrepaidConfirmPinActivity$MediaBrowserCompat$ItemReceiver MediaDescriptionCompat = new PrepaidConfirmPinActivity$MediaBrowserCompat$ItemReceiver((byte) 0);
    private String MediaBrowserCompat$MediaItem;
    private final HmlVerifyEmailActivity MediaBrowserCompat$SearchResultReceiver;
    private boolean MediaMetadataCompat;
    private String MediaSessionCompat$ResultReceiverWrapper;
    private setModel MediaSessionCompat$Token;

    public PrepaidConfirmPinActivity() {
        FundActionsSuccessActivity fundActionsSuccessActivity = C5693x6efd9e60.read;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.MediaBrowserCompat$SearchResultReceiver = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
    }

    public final void onCreate(Bundle bundle) {
        Bundle extras;
        Bundle extras2;
        super.onCreate(bundle);
        Intent intent = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent, "intent");
        Bundle extras3 = intent.getExtras();
        String str = null;
        this.MediaSessionCompat$Token = extras3 != null ? (setModel) extras3.getParcelable("EXTRA_PREPAID_ACTIVATION_VERIFICATION") : null;
        Intent intent2 = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent2, "intent");
        String write = AlertController$RecycleListView.write(intent2.getExtras(), "EXTRA_PREPAID_CARD_NUMBER");
        setModel setmodel = this.MediaSessionCompat$Token;
        if (setmodel != null) {
            write = setmodel.IconCompatParcelizer;
            this.MediaMetadataCompat = true;
        }
        Intent intent3 = getIntent();
        String string = (intent3 == null || (extras2 = intent3.getExtras()) == null) ? null : extras2.getString("EXTRA_PREPAID_TITLE_PIN", getString(R.string.prepaid_card_confirm_pin_title));
        String str2 = "";
        if (string == null) {
            string = str2;
        }
        this.MediaSessionCompat$ResultReceiverWrapper = string;
        Intent intent4 = getIntent();
        if (!(intent4 == null || (extras = intent4.getExtras()) == null)) {
            str = extras.getString("EXTRA_PREPAID_MESSAGE_PIN", getString(R.string.prepaid_card_set_pin_instruction));
        }
        if (str != null) {
            str2 = str;
        }
        this.MediaBrowserCompat$MediaItem = str2;
        ((C4765hh) this.presenter).MediaBrowserCompat$ItemReceiver(this);
        ((C4765hh) this.presenter).write(write, this.MediaMetadataCompat);
        setStackedBackground();
        String str3 = this.MediaSessionCompat$ResultReceiverWrapper;
        if (str3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("prepaidTitle");
        }
        MediaSessionCompat$QueueItem(str3);
        setTabContainer();
        MediaBrowserCompat$ItemReceiver(true);
    }

    public final void MediaDescriptionCompat() {
        String str = this.MediaSessionCompat$ResultReceiverWrapper;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("prepaidTitle");
        }
        MediaSessionCompat$QueueItem(str);
        TextView textView = this.topTextView;
        onGetStartedClick.IconCompatParcelizer((Object) textView, "topTextView");
        String str2 = this.MediaBrowserCompat$MediaItem;
        if (str2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("prepaidMessage");
        }
        textView.setText(str2);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        String str = this.MediaSessionCompat$ResultReceiverWrapper;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("prepaidTitle");
        }
        MediaSessionCompat$QueueItem(str);
        this.topTextView.setText(R.string.your_confirm_pin);
        MediaBrowserCompat$ItemReceiver(false);
    }

    private final void MediaBrowserCompat$ItemReceiver(boolean z) {
        String str;
        if (z) {
            str = this.MediaMetadataCompat ? "planetscb_activate_newpin_screen" : "planetscb_resetcardpin_newpin_screen";
        } else {
            str = this.MediaMetadataCompat ? "planetscb_activate_confirmpin_screen" : "planetscb_resetcardpin_confirmpin_screen";
        }
        ((getKernelIDDstAtop) this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver()).MediaBrowserCompat$ItemReceiver(this.scbAnalytics, str);
    }

    public final void write(ImmutableBiMap.SerializedForm serializedForm) {
        Intent intent = new Intent();
        if (serializedForm != null) {
            intent.putExtra("EXTRA_PREPAID_ENCRYPT_PIN_REQUEST", serializedForm);
        }
        ((getKernelIDDstAtop) this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver()).MediaBrowserCompat$ItemReceiver(this.scbAnalytics, this.MediaSessionCompat$Token != null ? "planetscb_prepaid_next_setpin" : "planetscb_prepaid_next_resetpin");
        setResult(-1, intent);
        finish();
    }

    public final void MediaBrowserCompat$MediaItem() {
        setResult(0);
        finish();
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        onGetStartedClick.write((Object) menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public final void onBackPressed() {
        ((C4765hh) this.presenter).MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void onDestroy() {
        ((C4765hh) this.presenter).onDestroy();
        super.onDestroy();
    }

    public static final ImmutableBiMap.SerializedForm read(Intent intent) {
        Bundle extras;
        if (intent == null || (extras = intent.getExtras()) == null) {
            return null;
        }
        return (ImmutableBiMap.SerializedForm) extras.getParcelable("EXTRA_PREPAID_ENCRYPT_PIN_REQUEST");
    }

    public static final Intent IconCompatParcelizer(Context context, String str, String str2, String str3) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, "cardNumber");
        onGetStartedClick.write((Object) str2, MessageBundle.TITLE_ENTRY);
        onGetStartedClick.write((Object) str3, C8183f.f4230JO);
        Intent putExtra = new Intent(context, PrepaidConfirmPinActivity.class).putExtra("EXTRA_PREPAID_CARD_NUMBER", str).putExtra("EXTRA_PREPAID_TITLE_PIN", str2).putExtra("EXTRA_PREPAID_MESSAGE_PIN", str3);
        onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, PrepaidC…AID_MESSAGE_PIN, message)");
        return putExtra;
    }
}

package com.scb.phone.view.activity.easycash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import p040o.AlertController$RecycleListView;
import p040o.C1161xfaac52a4;
import p040o.FragmentBuilder_BindDebitCardFragment;
import p040o.HmlPinActivity;
import p040o.getBitsPerPixel;
import p040o.getChannels;
import p040o.onGetStartedClick;

public final class EasycashCommonNCBConsentActivity extends BaseCommonNCBConsentActivity implements C1161xfaac52a4 {
    @HmlPinActivity
    public getBitsPerPixel presenter;

    public final getChannels<?> MediaSessionCompat$ResultReceiverWrapper() {
        getBitsPerPixel getbitsperpixel = this.presenter;
        if (getbitsperpixel == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        return getbitsperpixel;
    }

    public final void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
    }

    public final void MediaSessionCompat$Token() {
        getBitsPerPixel getbitsperpixel = this.presenter;
        if (getbitsperpixel == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getbitsperpixel.MediaBrowserCompat$ItemReceiver(this);
        Intent intent = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent, "intent");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            String string = extras.getString("EXTRA_FLOW_TYPE", "");
            String string2 = extras.getString("EXTRA_PRODUCT_GROUP", "");
            getBitsPerPixel getbitsperpixel2 = this.presenter;
            if (getbitsperpixel2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.IconCompatParcelizer((Object) string2, "productGroup");
            onGetStartedClick.IconCompatParcelizer((Object) string, "flowType");
            onGetStartedClick.write((Object) string2, "productGroup");
            onGetStartedClick.write((Object) string, "flowType");
            getbitsperpixel2.MediaBrowserCompat$MediaItem = string2;
            getbitsperpixel2.MediaDescriptionCompat = string;
        }
    }

    public static final Intent IconCompatParcelizer(FragmentBuilder_BindDebitCardFragment fragmentBuilder_BindDebitCardFragment) {
        onGetStartedClick.write((Object) fragmentBuilder_BindDebitCardFragment, "ncdbConsent");
        Intent intent = new Intent(fragmentBuilder_BindDebitCardFragment.MediaBrowserCompat$CustomActionResultReceiver, EasycashCommonNCBConsentActivity.class);
        intent.putExtra("EXTRA_APPLICATION_ID", fragmentBuilder_BindDebitCardFragment.IconCompatParcelizer);
        intent.putExtra("EXTRA_PRODUCT_TYPE", fragmentBuilder_BindDebitCardFragment.MediaMetadataCompat);
        intent.putExtra("EXTRA_PRODUCT_PROGRAM", fragmentBuilder_BindDebitCardFragment.MediaBrowserCompat$SearchResultReceiver);
        intent.putExtra("EXTRA_NCB_TRANSACTION_ID", fragmentBuilder_BindDebitCardFragment.read);
        intent.putExtra("EXTRA_FLOW_TYPE", fragmentBuilder_BindDebitCardFragment.MediaBrowserCompat$ItemReceiver);
        intent.putExtra("EXTRA_PRODUCT_GROUP", fragmentBuilder_BindDebitCardFragment.write);
        return intent;
    }
}

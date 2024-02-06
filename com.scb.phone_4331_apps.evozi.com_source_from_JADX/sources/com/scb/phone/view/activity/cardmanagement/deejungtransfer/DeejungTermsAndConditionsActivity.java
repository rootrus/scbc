package com.scb.phone.view.activity.cardmanagement.deejungtransfer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.internal.ImagesContract;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.activity.ccrredemption.ecoupon.C5572x5c6e7578;
import com.scb.phone.view.fragment.TermsAndConditionsFragment;
import p040o.HmlPinActivity;
import p040o.getAddress3;
import p040o.getRegisteredVersions;
import p040o.immediateFailedFuture;
import p040o.onGetStartedClick;
import p040o.toLongArray;
import p040o.writeUInt64NoTag;

public final class DeejungTermsAndConditionsActivity extends BaseActivityWithFragment implements getAddress3.write {
    @HmlPinActivity
    public getRegisteredVersions mPresenter;

    public final void MediaBrowserCompat$SearchResultReceiver() {
    }

    public static final class IconCompatParcelizer {
        public final String IconCompatParcelizer;
        public final C5572x5c6e7578 MediaBrowserCompat$CustomActionResultReceiver;
        public final Boolean MediaBrowserCompat$ItemReceiver;
        public final String read;
        public final String write;

        private IconCompatParcelizer() {
        }

        public IconCompatParcelizer(String str, C5572x5c6e7578 eCouponDetailActivity$MediaBrowserCompat$CustomActionResultReceiver, String str2, Boolean bool, String str3) {
            onGetStartedClick.write((Object) str, "gmbImageURL");
            onGetStartedClick.write((Object) str2, "gmbDeeplinkURL");
            onGetStartedClick.write((Object) str3, "gmbClientSecret");
            this.read = str;
            this.MediaBrowserCompat$CustomActionResultReceiver = eCouponDetailActivity$MediaBrowserCompat$CustomActionResultReceiver;
            this.IconCompatParcelizer = str2;
            this.MediaBrowserCompat$ItemReceiver = bool;
            this.write = str3;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getRegisteredVersions getregisteredversions = this.mPresenter;
        if (getregisteredversions == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
        }
        getregisteredversions.MediaBrowserCompat$ItemReceiver(this);
        String stringExtra = getIntent().getStringExtra("EXTRA_DEEJUNG_TERMS_AND_CONDITIONS_URL");
        getRegisteredVersions getregisteredversions2 = this.mPresenter;
        if (getregisteredversions2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
        }
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra, ImagesContract.URL);
        onGetStartedClick.write((Object) stringExtra, ImagesContract.URL);
        writeUInt64NoTag.IconCompatParcelizer read = new getRegisteredVersions.read(toLongArray.MediaBrowserCompat$CustomActionResultReceiver(getregisteredversions2.read, stringExtra, (String) null, (String) null, (String) null, false, false, (String) null, 72));
        if (getregisteredversions2.RatingCompat != null) {
            read.IconCompatParcelizer(getregisteredversions2.RatingCompat);
        }
    }

    public final String au_() {
        String string = getString(R.string.terms_and_conditions_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.terms_and_conditions_title)");
        return string;
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        return new Fragment();
    }

    public final void read(immediateFailedFuture immediatefailedfuture) {
        onGetStartedClick.write((Object) immediatefailedfuture, "display");
        TermsAndConditionsFragment.write write = TermsAndConditionsFragment.IconCompatParcelizer;
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container, TermsAndConditionsFragment.write.MediaBrowserCompat$CustomActionResultReceiver(immediatefailedfuture)).write();
    }

    public static final Intent IconCompatParcelizer(Context context, String str) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, ImagesContract.URL);
        Intent intent = new Intent(context, DeejungTermsAndConditionsActivity.class);
        intent.putExtra("EXTRA_DEEJUNG_TERMS_AND_CONDITIONS_URL", str);
        return intent;
    }
}

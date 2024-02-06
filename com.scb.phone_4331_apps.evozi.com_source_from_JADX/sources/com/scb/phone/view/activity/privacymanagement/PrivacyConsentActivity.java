package com.scb.phone.view.activity.privacymanagement;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.fragment.TermsAndConditionsFragment;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import java.io.Serializable;
import kotlin.TypeCastException;
import p040o.FragmentBuilder_BindCustomizeYourPageFragment;
import p040o.HmlPinActivity;
import p040o.LogFileManager;
import p040o.MyECouponActivity_ViewBinding;
import p040o.OnDeviceIdExtractor_Factory;
import p040o.generateBinaryImagesJsonString;
import p040o.getCityFieldName;
import p040o.getCityFieldName$MediaBrowserCompat$SearchResultReceiver;
import p040o.getLibraryFile;
import p040o.immediateFailedFuture;
import p040o.onGetStartedClick;
import p040o.setTapText;

public final class PrivacyConsentActivity extends BaseActivityWithFragment implements OnDeviceIdExtractor_Factory.write, FragmentBuilder_BindCustomizeYourPageFragment {
    public static final IconCompatParcelizer MediaMetadataCompat = new IconCompatParcelizer((byte) 0);
    private boolean MediaBrowserCompat$MediaItem;
    @HmlPinActivity
    public getCityFieldName mPresenter;

    public static final Intent read(Context context, generateBinaryImagesJsonString generatebinaryimagesjsonstring, getLibraryFile getlibraryfile, LogFileManager.DirectoryProvider directoryProvider, boolean z) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) generatebinaryimagesjsonstring, "type");
        onGetStartedClick.write((Object) getlibraryfile, "flow");
        onGetStartedClick.write((Object) directoryProvider, "preloadCheckDisplay");
        Intent intent = new Intent(context, PrivacyConsentActivity.class);
        intent.putExtra("EXTRA_CONSENT_SOURCE", getlibraryfile);
        intent.putExtra("EXTRA_CONSENT_TYPE", generatebinaryimagesjsonstring);
        intent.putExtra("EXTRA_PRELOAD_CHECK", directoryProvider);
        intent.putExtra("com.scb.phone.EXTRA_DEEP_LINK", z);
        return intent;
    }

    public final String au_() {
        return "";
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        public static Intent MediaBrowserCompat$ItemReceiver(Context context, generateBinaryImagesJsonString generatebinaryimagesjsonstring, getLibraryFile getlibraryfile, boolean z) {
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) generatebinaryimagesjsonstring, "type");
            onGetStartedClick.write((Object) getlibraryfile, "flow");
            Intent intent = new Intent(context, PrivacyConsentActivity.class);
            intent.putExtra("EXTRA_CONSENT_SOURCE", getlibraryfile);
            intent.putExtra("EXTRA_CONSENT_TYPE", generatebinaryimagesjsonstring);
            intent.putExtra("com.scb.phone.EXTRA_DEEP_LINK", z);
            return intent;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getCityFieldName getcityfieldname = this.mPresenter;
        if (getcityfieldname == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
        }
        getcityfieldname.MediaBrowserCompat$ItemReceiver(this);
        Serializable serializableExtra = getIntent().getSerializableExtra("EXTRA_CONSENT_TYPE");
        if (serializableExtra != null) {
            generateBinaryImagesJsonString generatebinaryimagesjsonstring = (generateBinaryImagesJsonString) serializableExtra;
            Serializable serializableExtra2 = getIntent().getSerializableExtra("EXTRA_CONSENT_SOURCE");
            if (serializableExtra2 != null) {
                getLibraryFile getlibraryfile = (getLibraryFile) serializableExtra2;
                String stringExtra = getIntent().getStringExtra("EXTRA_CONSENT_TITLE");
                this.MediaBrowserCompat$MediaItem = getIntent().getBooleanExtra("com.scb.phone.EXTRA_DEEP_LINK", false);
                getCityFieldName getcityfieldname2 = this.mPresenter;
                if (getcityfieldname2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
                }
                onGetStartedClick.write((Object) generatebinaryimagesjsonstring, "type");
                onGetStartedClick.write((Object) getlibraryfile, "flow");
                getcityfieldname2.write = generatebinaryimagesjsonstring;
                getcityfieldname2.read = getlibraryfile;
                getcityfieldname2.MediaBrowserCompat$ItemReceiver = stringExtra;
                new getCityFieldName$MediaBrowserCompat$SearchResultReceiver(getcityfieldname2).read(generatebinaryimagesjsonstring, getlibraryfile).MediaBrowserCompat$ItemReceiver();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.presentation.model.enums.PrivacyConsentFlow");
        }
        throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.presentation.model.enums.PrivacyConsentType");
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        return new Fragment();
    }

    public final void write(immediateFailedFuture immediatefailedfuture) {
        onGetStartedClick.write((Object) immediatefailedfuture, "content");
        TermsAndConditionsFragment.write write = TermsAndConditionsFragment.IconCompatParcelizer;
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container, TermsAndConditionsFragment.write.MediaBrowserCompat$CustomActionResultReceiver(immediatefailedfuture)).write();
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        if (z) {
            ListMenuItemView();
        } else {
            setTabContainer();
        }
    }

    public final void read(String str) {
        onGetStartedClick.write((Object) str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        MediaSessionCompat$QueueItem(str);
    }

    public final void IconCompatParcelizer(getLibraryFile getlibraryfile) {
        onGetStartedClick.write((Object) getlibraryfile, "flow");
        Intent MediaBrowserCompat$ItemReceiver = IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this, generateBinaryImagesJsonString.CROSS_SELL_CONSENT, getlibraryfile, this.MediaBrowserCompat$MediaItem);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, MediaBrowserCompat$ItemReceiver).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read, 1001);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (!this.MediaBrowserCompat$MediaItem) {
            finish();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Bundle extras;
        LogFileManager.DirectoryProvider directoryProvider;
        boolean z = this.MediaBrowserCompat$MediaItem;
        if (!z) {
            Intent intent = getIntent();
            if (intent == null || (extras = intent.getExtras()) == null || (directoryProvider = (LogFileManager.DirectoryProvider) extras.getParcelable("EXTRA_PRELOAD_CHECK")) == null) {
                RatingCompat(false);
                return;
            }
            HomeActivity.read((Context) this, directoryProvider);
            finish();
        } else if (z) {
            setResult(-1);
            finish();
        }
    }

    public final void read() {
        setResult(-1);
        finish();
        overridePendingTransition(R.anim.f64132130771980, R.anim.f64142130771981);
    }

    public final void IconCompatParcelizer(String str) {
        getCityFieldName getcityfieldname = this.mPresenter;
        if (getcityfieldname == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
        }
        getCityFieldName$MediaBrowserCompat$SearchResultReceiver getcityfieldname_mediabrowsercompat_searchresultreceiver = new getCityFieldName$MediaBrowserCompat$SearchResultReceiver(getcityfieldname);
        generateBinaryImagesJsonString generatebinaryimagesjsonstring = getcityfieldname.write;
        if (generatebinaryimagesjsonstring == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mType");
        }
        getLibraryFile getlibraryfile = getcityfieldname.read;
        if (getlibraryfile == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mFlow");
        }
        getcityfieldname_mediabrowsercompat_searchresultreceiver.read(generatebinaryimagesjsonstring, getlibraryfile).IconCompatParcelizer(true);
    }

    public final void write(String str) {
        getCityFieldName getcityfieldname = this.mPresenter;
        if (getcityfieldname == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
        }
        getCityFieldName$MediaBrowserCompat$SearchResultReceiver getcityfieldname_mediabrowsercompat_searchresultreceiver = new getCityFieldName$MediaBrowserCompat$SearchResultReceiver(getcityfieldname);
        generateBinaryImagesJsonString generatebinaryimagesjsonstring = getcityfieldname.write;
        if (generatebinaryimagesjsonstring == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mType");
        }
        getLibraryFile getlibraryfile = getcityfieldname.read;
        if (getlibraryfile == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mFlow");
        }
        getcityfieldname_mediabrowsercompat_searchresultreceiver.read(generatebinaryimagesjsonstring, getlibraryfile).IconCompatParcelizer(false);
    }

    public final void setContentView() {
        getCityFieldName getcityfieldname = this.mPresenter;
        if (getcityfieldname == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
        }
        getCityFieldName$MediaBrowserCompat$SearchResultReceiver getcityfieldname_mediabrowsercompat_searchresultreceiver = new getCityFieldName$MediaBrowserCompat$SearchResultReceiver(getcityfieldname);
        generateBinaryImagesJsonString generatebinaryimagesjsonstring = getcityfieldname.write;
        if (generatebinaryimagesjsonstring == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mType");
        }
        getLibraryFile getlibraryfile = getcityfieldname.read;
        if (getlibraryfile == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mFlow");
        }
        getcityfieldname_mediabrowsercompat_searchresultreceiver.read(generatebinaryimagesjsonstring, getlibraryfile).write();
    }

    public final void onBackPressed() {
        getCityFieldName getcityfieldname = this.mPresenter;
        if (getcityfieldname == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
        }
        getCityFieldName$MediaBrowserCompat$SearchResultReceiver getcityfieldname_mediabrowsercompat_searchresultreceiver = new getCityFieldName$MediaBrowserCompat$SearchResultReceiver(getcityfieldname);
        generateBinaryImagesJsonString generatebinaryimagesjsonstring = getcityfieldname.write;
        if (generatebinaryimagesjsonstring == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mType");
        }
        getLibraryFile getlibraryfile = getcityfieldname.read;
        if (getlibraryfile == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mFlow");
        }
        if (getcityfieldname_mediabrowsercompat_searchresultreceiver.read(generatebinaryimagesjsonstring, getlibraryfile).MediaMetadataCompat()) {
            super.onBackPressed();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1001 && i2 == -1 && this.MediaBrowserCompat$MediaItem) {
            setResult(i2);
            finish();
        }
    }
}

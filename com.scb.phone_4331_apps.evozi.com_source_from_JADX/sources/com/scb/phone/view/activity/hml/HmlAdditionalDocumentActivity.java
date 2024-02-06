package com.scb.phone.view.activity.hml;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.hml.HmlDocumentUploadFragment;
import p040o.IOrientationGuidanceCalculator;
import p040o.ZSYR2K;
import p040o.animateCamera;
import p040o.getLegacySharedPrefs;
import p040o.getTotalRamInBytes;
import p040o.isEmulator;
import p040o.isRooted;
import p040o.setAutoFocusEnabled;

public class HmlAdditionalDocumentActivity extends BaseActivityWithFragment implements IOrientationGuidanceCalculator {
    /* access modifiers changed from: protected */
    public String AppCompatDelegateImpl$ListMenuDecorView() {
        return "etb";
    }

    public final String IconCompatParcelizer() {
        return null;
    }

    public final void IconCompatParcelizer(String str) {
    }

    public final void IconCompatParcelizer(isEmulator isemulator) {
    }

    public final getTotalRamInBytes MediaBrowserCompat$CustomActionResultReceiver() {
        return null;
    }

    public final isEmulator MediaBrowserCompat$ItemReceiver() {
        return null;
    }

    public final void MediaBrowserCompat$ItemReceiver(animateCamera animatecamera) {
    }

    public final isRooted MediaBrowserCompat$MediaItem() {
        return null;
    }

    public final String MediaBrowserCompat$SearchResultReceiver() {
        return "GENERAL_LOAN";
    }

    public final getLegacySharedPrefs MediaDescriptionCompat() {
        return null;
    }

    public final String MediaMetadataCompat() {
        return null;
    }

    public final int MediaSessionCompat$Token() {
        return R.layout.f78212131493046;
    }

    public final void RatingCompat() {
    }

    public final String read() {
        return null;
    }

    public final void read(animateCamera animatecamera) {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setPrimaryBackground();
        this.scbAnalytics.write("p10x1_additional_document", new ZSYR2K("user_type", AppCompatDelegateImpl$ListMenuDecorView()));
    }

    public final String au_() {
        return getString(R.string.document_upload_title);
    }

    public final String write() {
        return setAutoFocusEnabled.IconCompatParcelizer.HML.name();
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public Fragment mo13702x50fd9e4a() {
        return new HmlDocumentUploadFragment();
    }
}

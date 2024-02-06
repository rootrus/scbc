package com.scb.phone.view.activity.hml;

import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.hml.HmlNTBExternalAuthenticationFragment;
import p040o.onGetStartedClick;

public final class HmlNTBExternalAuthenticationActivity extends BaseActivityWithFragment {

    public static final class read {
        public final String IconCompatParcelizer;
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        public final String MediaBrowserCompat$MediaItem;
        public final String MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public final String f3064x50fd9e4a;
        public final String MediaDescriptionCompat;
        public final String MediaMetadataCompat;
        public final int MediaSessionCompat$Token;
        public final String ParcelableVolumeInfo;
        public final String RatingCompat;
        public final String read;
        public final String write;

        private read() {
        }

        public read(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, String str12) {
            onGetStartedClick.write((Object) str, "firstNameTH");
            onGetStartedClick.write((Object) str3, "lastNameTH");
            onGetStartedClick.write((Object) str9, "phoneNumber");
            onGetStartedClick.write((Object) str10, "referenceId");
            onGetStartedClick.write((Object) str11, "referenceType");
            onGetStartedClick.write((Object) str12, "tNcType");
            this.MediaBrowserCompat$ItemReceiver = str;
            this.MediaMetadataCompat = str2;
            this.IconCompatParcelizer = str3;
            this.MediaBrowserCompat$CustomActionResultReceiver = str4;
            this.RatingCompat = str5;
            this.read = str6;
            this.write = str7;
            this.MediaBrowserCompat$SearchResultReceiver = str8;
            this.MediaBrowserCompat$MediaItem = str9;
            this.MediaDescriptionCompat = str10;
            this.f3064x50fd9e4a = str11;
            this.MediaSessionCompat$Token = i;
            this.ParcelableVolumeInfo = str12;
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        HmlNTBExternalAuthenticationFragment.IconCompatParcelizer iconCompatParcelizer = HmlNTBExternalAuthenticationFragment.MediaBrowserCompat$CustomActionResultReceiver;
        return new HmlNTBExternalAuthenticationFragment();
    }

    public final String au_() {
        String string = getString(R.string.hml_external_authentication_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.hml_e…nal_authentication_title)");
        return string;
    }
}

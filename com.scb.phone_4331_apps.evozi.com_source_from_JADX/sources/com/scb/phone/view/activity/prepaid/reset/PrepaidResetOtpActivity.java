package com.scb.phone.view.activity.prepaid.reset;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.view.activity.BaseOtpActivity;
import p040o.AlertController$RecycleListView;
import p040o.C1229xe1b6193a;
import p040o.FundFactSheetActivity;
import p040o.HmlPinActivity;
import p040o.ImmutableBiMap;
import p040o.ImmutableEntry;
import p040o.badPositionIndex$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.equalsImpl;
import p040o.onGetStartedClick;
import p040o.setParameters;

public final class PrepaidResetOtpActivity extends BaseOtpActivity implements C1229xe1b6193a {
    @HmlPinActivity
    public setParameters presenter;

    public static final class write {
        public String IconCompatParcelizer;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public int MediaBrowserCompat$SearchResultReceiver;
        public int MediaDescriptionCompat;
        public String MediaMetadataCompat;
        public String read;
        public String write;

        private write() {
        }

        public write(int i, String str, String str2, String str3, String str4, int i2) {
            this.MediaBrowserCompat$SearchResultReceiver = i;
            this.MediaBrowserCompat$ItemReceiver = str;
            this.write = str2;
            this.MediaBrowserCompat$CustomActionResultReceiver = str3;
            this.MediaMetadataCompat = str4;
            this.MediaDescriptionCompat = i2;
        }

        public write(int i, String str, String str2, String str3, String str4, int i2, String str5, String str6) {
            this.MediaBrowserCompat$SearchResultReceiver = i;
            this.MediaBrowserCompat$ItemReceiver = str;
            this.write = str2;
            this.MediaBrowserCompat$CustomActionResultReceiver = str3;
            this.MediaMetadataCompat = str4;
            this.MediaDescriptionCompat = i2;
            this.read = str5;
            this.IconCompatParcelizer = str6;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            write write2 = (write) obj;
            if (this.MediaBrowserCompat$SearchResultReceiver != write2.MediaBrowserCompat$SearchResultReceiver || this.MediaDescriptionCompat != write2.MediaDescriptionCompat) {
                return false;
            }
            String str = this.MediaBrowserCompat$ItemReceiver;
            if (str == null ? write2.MediaBrowserCompat$ItemReceiver != null : !str.equals(write2.MediaBrowserCompat$ItemReceiver)) {
                return false;
            }
            String str2 = this.write;
            if (str2 == null ? write2.write != null : !str2.equals(write2.write)) {
                return false;
            }
            String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (str3 == null ? write2.MediaBrowserCompat$CustomActionResultReceiver != null : !str3.equals(write2.MediaBrowserCompat$CustomActionResultReceiver)) {
                return false;
            }
            String str4 = this.read;
            if (str4 == null ? write2.read != null : !str4.equals(write2.read)) {
                return false;
            }
            String str5 = this.IconCompatParcelizer;
            if (str5 == null ? write2.IconCompatParcelizer != null : !str5.equals(write2.IconCompatParcelizer)) {
                return false;
            }
            String str6 = this.MediaMetadataCompat;
            String str7 = write2.MediaMetadataCompat;
            if (str6 != null) {
                return str6.equals(str7);
            }
            if (str7 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = this.MediaBrowserCompat$SearchResultReceiver;
            String str = this.MediaBrowserCompat$ItemReceiver;
            int i2 = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.write;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.IconCompatParcelizer;
            int hashCode4 = str4 != null ? str4.hashCode() : 0;
            String str5 = this.read;
            int hashCode5 = str5 != null ? str5.hashCode() : 0;
            String str6 = this.MediaMetadataCompat;
            if (str6 != null) {
                i2 = str6.hashCode();
            }
            return (((((((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i2) * 31) + this.MediaDescriptionCompat;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("OccupationTitle{sortSequence=");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append(", occupationCode='");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append('\'');
            sb.append(", isicCode='");
            sb.append(this.write);
            sb.append('\'');
            sb.append(", occupationDescription='");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append('\'');
            sb.append(", recommendFlag='");
            sb.append(this.MediaMetadataCompat);
            sb.append('\'');
            sb.append(", recommendOrder=");
            sb.append(this.MediaDescriptionCompat);
            sb.append('}');
            return sb.toString();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setParameters setparameters = this.presenter;
        if (setparameters == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setparameters.MediaBrowserCompat$ItemReceiver(this);
    }

    public final void write(String str, String str2) {
        Bundle extras;
        onGetStartedClick.write((Object) str, "tokenUUID");
        onGetStartedClick.write((Object) str2, "otp");
        Intent intent = getIntent();
        ImmutableBiMap.SerializedForm serializedForm = null;
        String write2 = AlertController$RecycleListView.write(intent != null ? intent.getExtras() : null, "EXTRA_PREPAID_CARD_NUMBER");
        Intent intent2 = getIntent();
        if (!(intent2 == null || (extras = intent2.getExtras()) == null)) {
            serializedForm = (ImmutableBiMap.SerializedForm) extras.getParcelable("EXTRA_PREPAID_ENCRYPT_PIN");
        }
        if (serializedForm != null) {
            setParameters setparameters = this.presenter;
            if (setparameters == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.write((Object) write2, "cardNumber");
            onGetStartedClick.write((Object) serializedForm, "encryptPinRequest");
            onGetStartedClick.write((Object) str, "tokenUUID");
            onGetStartedClick.write((Object) str2, "otp");
            if (setparameters.RatingCompat != null) {
                setparameters.RatingCompat.AlertController$RecycleListView();
            }
            ImmutableEntry immutableEntry = new ImmutableEntry(write2, serializedForm.MediaBrowserCompat$CustomActionResultReceiver, serializedForm.read);
            equalsImpl equalsimpl = setparameters.write;
            FundFactSheetActivity write3 = new setParameters.write(setparameters);
            FundFactSheetActivity iconCompatParcelizer = new setParameters.IconCompatParcelizer(setparameters);
            onGetStartedClick.write((Object) write3, "onSuccess");
            onGetStartedClick.write((Object) iconCompatParcelizer, "onError");
            onGetStartedClick.write((Object) immutableEntry, "request");
            onGetStartedClick.write((Object) str, "tokenUUID");
            onGetStartedClick.write((Object) str2, "otp");
            equalsimpl.IconCompatParcelizer(equalsimpl.write, write3, iconCompatParcelizer, new badPositionIndex$MediaBrowserCompat$CustomActionResultReceiver(immutableEntry, str, str2));
        }
    }

    public static final Intent MediaBrowserCompat$ItemReceiver(Context context, String str, ImmutableBiMap.SerializedForm serializedForm) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, "cardNumber");
        onGetStartedClick.write((Object) serializedForm, "encryptPinRequest");
        Intent putExtra = new Intent(context, PrepaidResetOtpActivity.class).putExtra("EXTRA_PREPAID_CARD_NUMBER", str).putExtra("EXTRA_PREPAID_ENCRYPT_PIN", serializedForm);
        onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, PrepaidR…T_PIN, encryptPinRequest)");
        return putExtra;
    }
}

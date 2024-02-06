package p040o;

import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8183f;

/* renamed from: o.AutoValue_CrashlyticsReport_FilesPayload_File */
public final class AutoValue_CrashlyticsReport_FilesPayload_File extends remainingCapacity {
    public String read;

    /* renamed from: o.AutoValue_CrashlyticsReport_FilesPayload_File$1 */
    public final class C30621 {
        String IconCompatParcelizer;
        String MediaBrowserCompat$CustomActionResultReceiver;
        setEvents MediaBrowserCompat$ItemReceiver;
        boolean write;

        public /* synthetic */ C30621() {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C30621)) {
                return false;
            }
            C30621 r3 = (C30621) obj;
            return this.write == r3.write && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) r3.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) r3.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) r3.MediaBrowserCompat$ItemReceiver);
        }

        public final int hashCode() {
            boolean z = this.write;
            if (z) {
                z = true;
            }
            String str = this.IconCompatParcelizer;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            setEvents setevents = this.MediaBrowserCompat$ItemReceiver;
            if (setevents != null) {
                i = setevents.hashCode();
            }
            return ((((((z ? 1 : 0) * true) + hashCode) * 31) + hashCode2) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("GoogleLocationResponseDisplay(isLocationEnable=");
            sb.append(this.write);
            sb.append(", latitude=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", longitude=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", status=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(")");
            return sb.toString();
        }

        public C30621(boolean z, String str, String str2, setEvents setevents) {
            onGetStartedClick.write((Object) setevents, "status");
            this.write = z;
            this.IconCompatParcelizer = str;
            this.MediaBrowserCompat$CustomActionResultReceiver = str2;
            this.MediaBrowserCompat$ItemReceiver = setevents;
        }
    }

    /* renamed from: o.AutoValue_CrashlyticsReport_FilesPayload_File$Builder */
    public final class Builder {
        public final String IconCompatParcelizer;
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        public final String MediaDescriptionCompat;
        public final int MediaMetadataCompat;
        public final int read;
        public final FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) obj;
            return this.MediaMetadataCompat == builder.MediaMetadataCompat && this.read == builder.read && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) builder.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) builder.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) builder.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) builder.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) builder.MediaBrowserCompat$ItemReceiver);
        }

        public final int hashCode() {
            int i = this.MediaMetadataCompat;
            int i2 = this.read;
            String str = this.IconCompatParcelizer;
            int i3 = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaDescriptionCompat;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> fundActionsSuccessActivity = this.write;
            int hashCode4 = fundActionsSuccessActivity != null ? fundActionsSuccessActivity.hashCode() : 0;
            String str4 = this.MediaBrowserCompat$ItemReceiver;
            if (str4 != null) {
                i3 = str4.hashCode();
            }
            return (((((((((((i * 31) + i2) * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i3;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("TouchPointWifiSettingsDisplay(titleId=");
            sb.append(this.MediaMetadataCompat);
            sb.append(", iconId=");
            sb.append(this.read);
            sb.append(", message=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", hint=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", remark=");
            sb.append(this.MediaDescriptionCompat);
            sb.append(", onClickAction=");
            sb.append(this.write);
            sb.append(", buttonText=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(")");
            return sb.toString();
        }

        public Builder(int i, int i2, String str, String str2, String str3, FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> fundActionsSuccessActivity, String str4) {
            onGetStartedClick.write((Object) str, C8183f.f4230JO);
            onGetStartedClick.write((Object) str2, "hint");
            this.MediaMetadataCompat = i;
            this.read = i2;
            this.IconCompatParcelizer = str;
            this.MediaBrowserCompat$CustomActionResultReceiver = str2;
            this.MediaDescriptionCompat = str3;
            this.write = fundActionsSuccessActivity;
            this.MediaBrowserCompat$ItemReceiver = str4;
        }
    }

    public static AutoValue_CrashlyticsReport_FilesPayload_File read() {
        return new AutoValue_CrashlyticsReport_FilesPayload_File();
    }
}

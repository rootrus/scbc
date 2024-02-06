package p040o;

import com.scb.phone.view.activity.prepaid.reset.PrepaidResetOtpActivity;

/* renamed from: o.getChecksum */
public final /* synthetic */ class getChecksum implements findFragmentByWho {
    public /* synthetic */ getChecksum(CharStreams charStreams) {
    }

    public final Object IconCompatParcelizer(Object obj) {
        PrepaidResetOtpActivity.write write = (PrepaidResetOtpActivity.write) obj;
        if (write == null) {
            return null;
        }
        return new remainingCapacity(write.MediaBrowserCompat$SearchResultReceiver, write.MediaBrowserCompat$ItemReceiver, write.write, write.MediaBrowserCompat$CustomActionResultReceiver, write.MediaMetadataCompat, write.MediaDescriptionCompat, write.read, write.IconCompatParcelizer) {
            public String IconCompatParcelizer;
            public String MediaBrowserCompat$CustomActionResultReceiver;
            public String MediaBrowserCompat$ItemReceiver;
            private int MediaBrowserCompat$MediaItem;
            public String MediaBrowserCompat$SearchResultReceiver;
            public int MediaDescriptionCompat;
            public String RatingCompat;
            public String read;

            {
                this.MediaBrowserCompat$MediaItem = r1;
                this.MediaBrowserCompat$CustomActionResultReceiver = r2;
                this.MediaBrowserCompat$ItemReceiver = r3;
                this.IconCompatParcelizer = r4;
                this.RatingCompat = r5;
                this.MediaDescriptionCompat = r6;
                this.MediaBrowserCompat$SearchResultReceiver = r7;
                this.read = r8;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                C30601 r5 = (C30601) obj;
                if (this.MediaBrowserCompat$MediaItem != r5.MediaBrowserCompat$MediaItem || this.MediaDescriptionCompat != r5.MediaDescriptionCompat) {
                    return false;
                }
                String str = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (str == null ? r5.MediaBrowserCompat$CustomActionResultReceiver != null : !str.equals(r5.MediaBrowserCompat$CustomActionResultReceiver)) {
                    return false;
                }
                String str2 = this.MediaBrowserCompat$ItemReceiver;
                if (str2 == null ? r5.MediaBrowserCompat$ItemReceiver != null : !str2.equals(r5.MediaBrowserCompat$ItemReceiver)) {
                    return false;
                }
                String str3 = this.IconCompatParcelizer;
                if (str3 == null ? r5.IconCompatParcelizer != null : !str3.equals(r5.IconCompatParcelizer)) {
                    return false;
                }
                String str4 = this.RatingCompat;
                if (str4 == null ? r5.RatingCompat == null : str4.equals(r5.RatingCompat)) {
                    return false;
                }
                String str5 = this.MediaBrowserCompat$SearchResultReceiver;
                if (str5 == null ? r5.MediaBrowserCompat$SearchResultReceiver != null : str5.equals(r5.MediaBrowserCompat$SearchResultReceiver)) {
                    return false;
                }
                String str6 = this.read;
                String str7 = r5.read;
                if (str6 != null) {
                    return str6.equals(str7);
                }
                if (str7 == null) {
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                int i = this.MediaBrowserCompat$MediaItem;
                String str = this.MediaBrowserCompat$CustomActionResultReceiver;
                int i2 = 0;
                int hashCode = str != null ? str.hashCode() : 0;
                String str2 = this.MediaBrowserCompat$ItemReceiver;
                int hashCode2 = str2 != null ? str2.hashCode() : 0;
                String str3 = this.IconCompatParcelizer;
                int hashCode3 = str3 != null ? str3.hashCode() : 0;
                String str4 = this.RatingCompat;
                if (str4 != null) {
                    i2 = str4.hashCode();
                }
                return (((((((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + i2) * 31) + this.MediaDescriptionCompat) * 31) + this.MediaBrowserCompat$SearchResultReceiver.hashCode()) * 31) + this.read.hashCode();
            }
        };
    }
}

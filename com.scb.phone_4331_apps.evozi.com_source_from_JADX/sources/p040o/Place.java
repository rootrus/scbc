package p040o;

import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.Place */
public final class Place {
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Place)) {
            return false;
        }
        Place place = (Place) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) place.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) place.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) place.read);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SpouseReviewInfo(name=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", nationFlag=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", documentId=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: o.Place$ExtendedDetails */
    public final class ExtendedDetails {
        public final String IconCompatParcelizer;
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        public final String MediaBrowserCompat$MediaItem;
        public final String MediaDescriptionCompat;
        public final String read;
        public final OffsetDateTime write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ExtendedDetails)) {
                return false;
            }
            ExtendedDetails extendedDetails = (ExtendedDetails) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) extendedDetails.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) extendedDetails.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) extendedDetails.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) extendedDetails.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) extendedDetails.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) extendedDetails.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) extendedDetails.MediaBrowserCompat$ItemReceiver);
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$CustomActionResultReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.read;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaBrowserCompat$MediaItem;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.IconCompatParcelizer;
            int hashCode4 = str4 != null ? str4.hashCode() : 0;
            String str5 = this.MediaDescriptionCompat;
            int hashCode5 = str5 != null ? str5.hashCode() : 0;
            OffsetDateTime offsetDateTime = this.write;
            int hashCode6 = offsetDateTime != null ? offsetDateTime.hashCode() : 0;
            String str6 = this.MediaBrowserCompat$ItemReceiver;
            if (str6 != null) {
                i = str6.hashCode();
            }
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MutualFunds(cardTitle=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", iconUrl=");
            sb.append(this.read);
            sb.append(", totalBalance=");
            sb.append(this.MediaBrowserCompat$MediaItem);
            sb.append(", netGain=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", netGainPercent=");
            sb.append(this.MediaDescriptionCompat);
            sb.append(", lastUpdatedDate=");
            sb.append(this.write);
            sb.append(", errorDescription=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(")");
            return sb.toString();
        }

        public ExtendedDetails(String str, String str2, String str3, String str4, String str5, OffsetDateTime offsetDateTime, String str6) {
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
            this.read = str2;
            this.MediaBrowserCompat$MediaItem = str3;
            this.IconCompatParcelizer = str4;
            this.MediaDescriptionCompat = str5;
            this.write = offsetDateTime;
            this.MediaBrowserCompat$ItemReceiver = str6;
        }
    }

    public Place(String str, String str2, String str3) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.read = str3;
    }
}

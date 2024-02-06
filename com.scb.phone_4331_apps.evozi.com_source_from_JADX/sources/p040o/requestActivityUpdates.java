package p040o;

import com.google.android.gms.common.Scopes;
import java.util.List;

/* renamed from: o.requestActivityUpdates */
public final class requestActivityUpdates {
    public final List<C5229x76737fb9> IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final removeActivityUpdates MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$SearchResultReceiver;
    public final read read;
    public final List<String> write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof requestActivityUpdates)) {
            return false;
        }
        requestActivityUpdates requestactivityupdates = (requestActivityUpdates) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) requestactivityupdates.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) requestactivityupdates.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) requestactivityupdates.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) requestactivityupdates.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) requestactivityupdates.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) requestactivityupdates.write);
    }

    public final int hashCode() {
        read read2 = this.read;
        int i = 0;
        int hashCode = read2 != null ? read2.hashCode() : 0;
        removeActivityUpdates removeactivityupdates = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = removeactivityupdates != null ? removeactivityupdates.hashCode() : 0;
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str != null ? str.hashCode() : 0;
        List<C5229x76737fb9> list = this.IconCompatParcelizer;
        int hashCode4 = list != null ? list.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode5 = str2 != null ? str2.hashCode() : 0;
        List<String> list2 = this.write;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CloseAccountEligibilityValidation(closingAccount=");
        sb.append(this.read);
        sb.append(", receivingAccount=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", email=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", subDeposit=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", transactionToken=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", remarks=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public requestActivityUpdates(read read2, removeActivityUpdates removeactivityupdates, String str, List<C5229x76737fb9> list, String str2, List<String> list2) {
        onGetStartedClick.write((Object) read2, "closingAccount");
        onGetStartedClick.write((Object) removeactivityupdates, "receivingAccount");
        onGetStartedClick.write((Object) str, Scopes.EMAIL);
        onGetStartedClick.write((Object) str2, "transactionToken");
        onGetStartedClick.write((Object) list2, "remarks");
        this.read = read2;
        this.MediaBrowserCompat$ItemReceiver = removeactivityupdates;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.IconCompatParcelizer = list;
        this.MediaBrowserCompat$SearchResultReceiver = str2;
        this.write = list2;
    }

    /* renamed from: o.requestActivityUpdates$read */
    public static final class read {
        public final double IconCompatParcelizer;
        public final double MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        public final String MediaBrowserCompat$MediaItem;
        public final double MediaBrowserCompat$SearchResultReceiver;
        public final double MediaDescriptionCompat;
        public final String MediaMetadataCompat;
        public final String MediaSessionCompat$Token;
        public final String RatingCompat;
        public final double read;
        public final double write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof read)) {
                return false;
            }
            read read2 = (read) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) read2.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) read2.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) read2.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) read2.MediaSessionCompat$Token) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) read2.MediaMetadataCompat) && Double.compare(this.write, read2.write) == 0 && Double.compare(this.IconCompatParcelizer, read2.IconCompatParcelizer) == 0 && Double.compare(this.MediaBrowserCompat$SearchResultReceiver, read2.MediaBrowserCompat$SearchResultReceiver) == 0 && Double.compare(this.MediaBrowserCompat$CustomActionResultReceiver, read2.MediaBrowserCompat$CustomActionResultReceiver) == 0 && Double.compare(this.read, read2.read) == 0 && Double.compare(this.MediaDescriptionCompat, read2.MediaDescriptionCompat) == 0;
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$MediaItem;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.RatingCompat;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.MediaSessionCompat$Token;
            int hashCode4 = str4 != null ? str4.hashCode() : 0;
            String str5 = this.MediaMetadataCompat;
            if (str5 != null) {
                i = str5.hashCode();
            }
            long doubleToLongBits = Double.doubleToLongBits(this.write);
            long doubleToLongBits2 = Double.doubleToLongBits(this.IconCompatParcelizer);
            int i2 = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
            long doubleToLongBits3 = Double.doubleToLongBits(this.MediaBrowserCompat$SearchResultReceiver);
            long doubleToLongBits4 = Double.doubleToLongBits(this.MediaBrowserCompat$CustomActionResultReceiver);
            long doubleToLongBits5 = Double.doubleToLongBits(this.read);
            long doubleToLongBits6 = Double.doubleToLongBits(this.MediaDescriptionCompat);
            return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + i2) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) ((doubleToLongBits6 >>> 32) ^ doubleToLongBits6));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ClosingAccount(name=");
            sb.append(this.MediaBrowserCompat$MediaItem);
            sb.append(", branch=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", number=");
            sb.append(this.RatingCompat);
            sb.append(", type=");
            sb.append(this.MediaSessionCompat$Token);
            sb.append(", subAttribute=");
            sb.append(this.MediaMetadataCompat);
            sb.append(", balance=");
            sb.append(this.write);
            sb.append(", interest=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", tax=");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append(", closingFee=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", irFee=");
            sb.append(this.read);
            sb.append(", netAmount=");
            sb.append(this.MediaDescriptionCompat);
            sb.append(")");
            return sb.toString();
        }

        public read(String str, String str2, String str3, String str4, String str5, double d, double d2, double d3, double d4, double d5, double d6) {
            onGetStartedClick.write((Object) str, "name");
            onGetStartedClick.write((Object) str2, "branch");
            onGetStartedClick.write((Object) str3, "number");
            onGetStartedClick.write((Object) str4, "type");
            onGetStartedClick.write((Object) str5, "subAttribute");
            this.MediaBrowserCompat$MediaItem = str;
            this.MediaBrowserCompat$ItemReceiver = str2;
            this.RatingCompat = str3;
            this.MediaSessionCompat$Token = str4;
            this.MediaMetadataCompat = str5;
            this.write = d;
            this.IconCompatParcelizer = d2;
            this.MediaBrowserCompat$SearchResultReceiver = d3;
            this.MediaBrowserCompat$CustomActionResultReceiver = d4;
            this.read = d5;
            this.MediaDescriptionCompat = d6;
        }
    }
}

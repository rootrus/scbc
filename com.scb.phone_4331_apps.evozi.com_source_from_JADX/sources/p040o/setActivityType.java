package p040o;

import java.util.List;
import p040o.ActivityTransition;
import p040o.zzcz;

/* renamed from: o.setActivityType */
public final class setActivityType {
    public final getTransitionEvents IconCompatParcelizer;
    public final write MediaBrowserCompat$CustomActionResultReceiver;
    public final zzcz.zzg MediaBrowserCompat$ItemReceiver;
    public final String MediaMetadataCompat;
    public final setActivityTransition RatingCompat;
    public final ActivityTransition.SupportedActivityTransition read;
    public final List<String> write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setActivityType)) {
            return false;
        }
        setActivityType setactivitytype = (setActivityType) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setactivitytype.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setactivitytype.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) setactivitytype.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setactivitytype.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) setactivitytype.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setactivitytype.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setactivitytype.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        zzcz.zzg zzg = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = zzg != null ? zzg.hashCode() : 0;
        ActivityTransition.SupportedActivityTransition supportedActivityTransition = this.read;
        int hashCode2 = supportedActivityTransition != null ? supportedActivityTransition.hashCode() : 0;
        setActivityTransition setactivitytransition = this.RatingCompat;
        int hashCode3 = setactivitytransition != null ? setactivitytransition.hashCode() : 0;
        getTransitionEvents gettransitionevents = this.IconCompatParcelizer;
        int hashCode4 = gettransitionevents != null ? gettransitionevents.hashCode() : 0;
        String str = this.MediaMetadataCompat;
        int hashCode5 = str != null ? str.hashCode() : 0;
        List<String> list = this.write;
        int hashCode6 = list != null ? list.hashCode() : 0;
        write write2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (write2 != null) {
            i = write2.hashCode();
        }
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlBusinessOwnerReviewSubmission(requestedProduct=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", customerContactInfo=");
        sb.append(this.read);
        sb.append(", spouseInfo=");
        sb.append(this.RatingCompat);
        sb.append(", businessInfo=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", uploadedDocumentAmount=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", consentDocuments=");
        sb.append(this.write);
        sb.append(", dutyStampFee=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public setActivityType(zzcz.zzg zzg, ActivityTransition.SupportedActivityTransition supportedActivityTransition, setActivityTransition setactivitytransition, getTransitionEvents gettransitionevents, String str, List<String> list, write write2) {
        onGetStartedClick.write((Object) zzg, "requestedProduct");
        onGetStartedClick.write((Object) supportedActivityTransition, "customerContactInfo");
        onGetStartedClick.write((Object) gettransitionevents, "businessInfo");
        onGetStartedClick.write((Object) str, "uploadedDocumentAmount");
        onGetStartedClick.write((Object) list, "consentDocuments");
        onGetStartedClick.write((Object) write2, "dutyStampFee");
        this.MediaBrowserCompat$ItemReceiver = zzg;
        this.read = supportedActivityTransition;
        this.RatingCompat = setactivitytransition;
        this.IconCompatParcelizer = gettransitionevents;
        this.MediaMetadataCompat = str;
        this.write = list;
        this.MediaBrowserCompat$CustomActionResultReceiver = write2;
    }

    /* renamed from: o.setActivityType$write */
    public static final class write {
        public final String IconCompatParcelizer;
        public final String read;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof write)) {
                return false;
            }
            write write = (write) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) write.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) write.IconCompatParcelizer);
        }

        public final int hashCode() {
            String str = this.read;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.IconCompatParcelizer;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("DutyStampFee(rate=");
            sb.append(this.read);
            sb.append(", maxAmount=");
            sb.append(this.IconCompatParcelizer);
            sb.append(")");
            return sb.toString();
        }

        public write(String str, String str2) {
            onGetStartedClick.write((Object) str, "rate");
            onGetStartedClick.write((Object) str2, "maxAmount");
            this.read = str;
            this.IconCompatParcelizer = str2;
        }
    }
}

package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p040o.FirebaseApp;

/* renamed from: o.getPersistenceKey */
public final class getPersistenceKey extends checkNotDeleted implements Parcelable {
    public static final Parcelable.Creator CREATOR = new getPersistenceKey$MediaBrowserCompat$ItemReceiver();
    public final String IconCompatParcelizer;
    public final double MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$MediaItem;
    public final double MediaBrowserCompat$SearchResultReceiver;
    public final List<FirebaseException> MediaDescriptionCompat;
    public final double MediaMetadataCompat;
    public final double RatingCompat;
    public final FirebaseApp.UiExecutor read;
    public final String write;

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        List<FirebaseException> list = this.MediaDescriptionCompat;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (FirebaseException writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeParcelable(this.read, i);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.write);
        parcel.writeDouble(this.RatingCompat);
        parcel.writeDouble(this.MediaMetadataCompat);
        parcel.writeDouble(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeDouble(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
    }

    public final String write() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final String IconCompatParcelizer() {
        return this.write;
    }

    public final double MediaBrowserCompat$SearchResultReceiver() {
        return this.RatingCompat;
    }

    public final double read() {
        return this.MediaMetadataCompat;
    }

    public final double MediaBrowserCompat$CustomActionResultReceiver() {
        return this.MediaBrowserCompat$SearchResultReceiver;
    }

    public final double MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getPersistenceKey(List<FirebaseException> list, FirebaseApp.UiExecutor uiExecutor, String str, String str2, double d, double d2, double d3, double d4, String str3, String str4) {
        super(str, str2, d, d2, d3, d4);
        onGetStartedClick.write((Object) uiExecutor, "status");
        this.MediaDescriptionCompat = list;
        this.read = uiExecutor;
        this.MediaBrowserCompat$ItemReceiver = str;
        this.write = str2;
        this.RatingCompat = d;
        this.MediaMetadataCompat = d2;
        this.MediaBrowserCompat$SearchResultReceiver = d3;
        this.MediaBrowserCompat$CustomActionResultReceiver = d4;
        this.IconCompatParcelizer = str3;
        this.MediaBrowserCompat$MediaItem = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getPersistenceKey)) {
            return false;
        }
        getPersistenceKey getpersistencekey = (getPersistenceKey) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) getpersistencekey.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getpersistencekey.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getpersistencekey.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getpersistencekey.write) && Double.compare(this.RatingCompat, getpersistencekey.RatingCompat) == 0 && Double.compare(this.MediaMetadataCompat, getpersistencekey.MediaMetadataCompat) == 0 && Double.compare(this.MediaBrowserCompat$SearchResultReceiver, getpersistencekey.MediaBrowserCompat$SearchResultReceiver) == 0 && Double.compare(this.MediaBrowserCompat$CustomActionResultReceiver, getpersistencekey.MediaBrowserCompat$CustomActionResultReceiver) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getpersistencekey.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) getpersistencekey.MediaBrowserCompat$MediaItem);
    }

    public final int hashCode() {
        List<FirebaseException> list = this.MediaDescriptionCompat;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        FirebaseApp.UiExecutor uiExecutor = this.read;
        int hashCode2 = uiExecutor != null ? uiExecutor.hashCode() : 0;
        String str = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode4 = str2 != null ? str2.hashCode() : 0;
        long doubleToLongBits = Double.doubleToLongBits(this.RatingCompat);
        int i2 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.MediaMetadataCompat);
        int i3 = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
        long doubleToLongBits3 = Double.doubleToLongBits(this.MediaBrowserCompat$SearchResultReceiver);
        int i4 = (int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32));
        long doubleToLongBits4 = Double.doubleToLongBits(this.MediaBrowserCompat$CustomActionResultReceiver);
        int i5 = (int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32));
        String str3 = this.IconCompatParcelizer;
        int hashCode5 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$MediaItem;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeejungPlanResponseDisplay(transactions=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", status=");
        sb.append(this.read);
        sb.append(", term=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", monthlyRate=");
        sb.append(this.write);
        sb.append(", totalPrincipal=");
        sb.append(this.RatingCompat);
        sb.append(", totalInterest=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", totalPayment=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", monthlyPayment=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", loanId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", yearlyRate=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(")");
        return sb.toString();
    }
}

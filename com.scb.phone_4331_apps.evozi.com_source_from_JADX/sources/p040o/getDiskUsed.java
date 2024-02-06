package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import com.prolificinteractive.materialcalendarview.CalendarDay;
import java.util.List;
import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.getDiskUsed */
public class getDiskUsed extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<getDiskUsed> CREATOR = new Parcelable.Creator<getDiskUsed>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new getDiskUsed(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getDiskUsed[i];
        }
    };
    public List<CalendarDay> IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public OffsetDateTime MediaBrowserCompat$ItemReceiver;
    public boolean MediaBrowserCompat$SearchResultReceiver;
    public OffsetDateTime RatingCompat;
    public OffsetDateTime read;

    public int describeContents() {
        return 0;
    }

    public getDiskUsed(String str, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, OffsetDateTime offsetDateTime3, List<CalendarDay> list, boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.MediaBrowserCompat$ItemReceiver = offsetDateTime;
        this.RatingCompat = offsetDateTime2;
        this.read = offsetDateTime3;
        this.IconCompatParcelizer = list;
        this.MediaBrowserCompat$SearchResultReceiver = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeSerializable(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeSerializable(this.RatingCompat);
        parcel.writeSerializable(this.read);
        parcel.writeTypedList(this.IconCompatParcelizer);
        parcel.writeByte(this.MediaBrowserCompat$SearchResultReceiver ? (byte) 1 : 0);
    }

    protected getDiskUsed(Parcel parcel) {
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = (OffsetDateTime) parcel.readSerializable();
        this.RatingCompat = (OffsetDateTime) parcel.readSerializable();
        this.read = (OffsetDateTime) parcel.readSerializable();
        this.IconCompatParcelizer = parcel.createTypedArrayList(CalendarDay.CREATOR);
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readByte() != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        getDiskUsed getdiskused = (getDiskUsed) obj;
        if (this.MediaBrowserCompat$SearchResultReceiver != getdiskused.MediaBrowserCompat$SearchResultReceiver) {
            return false;
        }
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str == null ? getdiskused.MediaBrowserCompat$CustomActionResultReceiver != null : !str.equals(getdiskused.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        OffsetDateTime offsetDateTime = this.MediaBrowserCompat$ItemReceiver;
        if (offsetDateTime == null ? getdiskused.MediaBrowserCompat$ItemReceiver != null : !offsetDateTime.equals(getdiskused.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        OffsetDateTime offsetDateTime2 = this.RatingCompat;
        if (offsetDateTime2 == null ? getdiskused.RatingCompat != null : !offsetDateTime2.equals(getdiskused.RatingCompat)) {
            return false;
        }
        OffsetDateTime offsetDateTime3 = this.read;
        if (offsetDateTime3 == null ? getdiskused.read != null : !offsetDateTime3.equals(getdiskused.read)) {
            return false;
        }
        List<CalendarDay> list = this.IconCompatParcelizer;
        List<CalendarDay> list2 = getdiskused.IconCompatParcelizer;
        if (list != null) {
            return list.equals(list2);
        }
        if (list2 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        OffsetDateTime offsetDateTime = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = offsetDateTime != null ? offsetDateTime.hashCode() : 0;
        OffsetDateTime offsetDateTime2 = this.RatingCompat;
        int hashCode3 = offsetDateTime2 != null ? offsetDateTime2.hashCode() : 0;
        OffsetDateTime offsetDateTime3 = this.read;
        int hashCode4 = offsetDateTime3 != null ? offsetDateTime3.hashCode() : 0;
        List<CalendarDay> list = this.IconCompatParcelizer;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i) * 31) + (this.MediaBrowserCompat$SearchResultReceiver ? 1 : 0);
    }
}

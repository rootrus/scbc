package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.getStringsFileValue */
public class getStringsFileValue extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<getStringsFileValue> CREATOR = new Parcelable.Creator<getStringsFileValue>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new getStringsFileValue(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getStringsFileValue[i];
        }
    };
    public String AlertController$RecycleListView;
    public String AppCompatActivity;
    public String AppCompatDelegateImpl$ListMenuDecorView;
    public List<padWithZerosToMaxIntWidth> AppCompatDialogFragment;
    private String IconCompatParcelizer;
    public String Keep;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public String f2854x50fd9e4a;
    public List<Integer> MediaSessionCompat$QueueItem;
    public String MediaSessionCompat$ResultReceiverWrapper;
    public String PlaybackStateCompat;
    public String PlaybackStateCompat$CustomAction;
    public boolean setHasDecor;

    public int describeContents() {
        return 0;
    }

    public getStringsFileValue(write write2) {
        this.MediaSessionCompat$ResultReceiverWrapper = write2.MediaSessionCompat$Token;
        this.IconCompatParcelizer = write2.setBackgroundResource;
        this.Keep = write2.AlertController$RecycleListView;
        this.PlaybackStateCompat = write2.AppCompatDialogFragment;
        this.AppCompatDelegateImpl$ListMenuDecorView = write2.AppCompatActivity;
        this.PlaybackStateCompat$CustomAction = write2.setHasDecor;
        this.AlertController$RecycleListView = write2.PlaybackStateCompat;
        this.f2854x50fd9e4a = write2.MediaSessionCompat$QueueItem;
        this.AppCompatActivity = write2.AppCompatDelegateImpl$ListMenuDecorView;
        this.setHasDecor = write2.PlaybackStateCompat$CustomAction;
        this.MediaSessionCompat$QueueItem = write2.Keep;
        this.AppCompatDialogFragment = write2.setContentView;
    }

    /* renamed from: o.getStringsFileValue$write */
    public static class write {
        public String AlertController$RecycleListView;
        public String AppCompatActivity;
        public String AppCompatDelegateImpl$ListMenuDecorView;
        public String AppCompatDialogFragment;
        public List<Integer> Keep;
        public String MediaSessionCompat$QueueItem;
        public String MediaSessionCompat$Token;
        public String PlaybackStateCompat;
        public boolean PlaybackStateCompat$CustomAction;
        public String setBackgroundResource;
        public List<padWithZerosToMaxIntWidth> setContentView;
        public String setHasDecor;

        public getStringsFileValue MediaBrowserCompat$ItemReceiver() {
            return new getStringsFileValue(this);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.Keep);
        parcel.writeString(this.PlaybackStateCompat);
        parcel.writeString(this.AppCompatDelegateImpl$ListMenuDecorView);
        parcel.writeString(this.PlaybackStateCompat$CustomAction);
        parcel.writeString(this.AlertController$RecycleListView);
        parcel.writeString(this.f2854x50fd9e4a);
        parcel.writeString(this.AppCompatActivity);
        parcel.writeByte(this.setHasDecor ? (byte) 1 : 0);
        parcel.writeList(this.MediaSessionCompat$QueueItem);
        parcel.writeTypedList(this.AppCompatDialogFragment);
    }

    public getStringsFileValue(Parcel parcel) {
        this.MediaSessionCompat$ResultReceiverWrapper = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.Keep = parcel.readString();
        this.PlaybackStateCompat = parcel.readString();
        this.AppCompatDelegateImpl$ListMenuDecorView = parcel.readString();
        this.PlaybackStateCompat$CustomAction = parcel.readString();
        this.AlertController$RecycleListView = parcel.readString();
        this.f2854x50fd9e4a = parcel.readString();
        this.AppCompatActivity = parcel.readString();
        this.setHasDecor = parcel.readByte() != 0;
        ArrayList arrayList = new ArrayList();
        this.MediaSessionCompat$QueueItem = arrayList;
        parcel.readList(arrayList, Integer.class.getClassLoader());
        this.AppCompatDialogFragment = parcel.createTypedArrayList(padWithZerosToMaxIntWidth.CREATOR);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        getStringsFileValue getstringsfilevalue = (getStringsFileValue) obj;
        String str = this.MediaSessionCompat$ResultReceiverWrapper;
        if (str == null ? getstringsfilevalue.MediaSessionCompat$ResultReceiverWrapper != null : !str.equals(getstringsfilevalue.MediaSessionCompat$ResultReceiverWrapper)) {
            return false;
        }
        String str2 = this.IconCompatParcelizer;
        if (str2 == null ? getstringsfilevalue.IconCompatParcelizer != null : !str2.equals(getstringsfilevalue.IconCompatParcelizer)) {
            return false;
        }
        String str3 = this.Keep;
        if (str3 == null ? getstringsfilevalue.Keep != null : !str3.equals(getstringsfilevalue.Keep)) {
            return false;
        }
        String str4 = this.PlaybackStateCompat;
        if (str4 == null ? getstringsfilevalue.PlaybackStateCompat != null : !str4.equals(getstringsfilevalue.PlaybackStateCompat)) {
            return false;
        }
        String str5 = this.AppCompatDelegateImpl$ListMenuDecorView;
        if (str5 == null ? getstringsfilevalue.AppCompatDelegateImpl$ListMenuDecorView != null : !str5.equals(getstringsfilevalue.AppCompatDelegateImpl$ListMenuDecorView)) {
            return false;
        }
        String str6 = this.PlaybackStateCompat$CustomAction;
        if (str6 == null ? getstringsfilevalue.PlaybackStateCompat$CustomAction != null : !str6.equals(getstringsfilevalue.PlaybackStateCompat$CustomAction)) {
            return false;
        }
        String str7 = this.AlertController$RecycleListView;
        if (str7 == null ? getstringsfilevalue.AlertController$RecycleListView != null : !str7.equals(getstringsfilevalue.AlertController$RecycleListView)) {
            return false;
        }
        String str8 = this.f2854x50fd9e4a;
        if (str8 == null ? getstringsfilevalue.f2854x50fd9e4a != null : !str8.equals(getstringsfilevalue.f2854x50fd9e4a)) {
            return false;
        }
        String str9 = this.AppCompatActivity;
        if (str9 == null ? getstringsfilevalue.AppCompatActivity != null : !str9.equals(getstringsfilevalue.AppCompatActivity)) {
            return false;
        }
        List<Integer> list = this.MediaSessionCompat$QueueItem;
        if (list == null ? getstringsfilevalue.MediaSessionCompat$QueueItem != null : !list.equals(getstringsfilevalue.MediaSessionCompat$QueueItem)) {
            return false;
        }
        List<padWithZerosToMaxIntWidth> list2 = this.AppCompatDialogFragment;
        List<padWithZerosToMaxIntWidth> list3 = getstringsfilevalue.AppCompatDialogFragment;
        if (list2 != null) {
            return list2.equals(list3);
        }
        if (list3 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaSessionCompat$ResultReceiverWrapper;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.Keep;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.PlaybackStateCompat;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.AppCompatDelegateImpl$ListMenuDecorView;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.PlaybackStateCompat$CustomAction;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.AlertController$RecycleListView;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.f2854x50fd9e4a;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.AppCompatActivity;
        int hashCode9 = str9 != null ? str9.hashCode() : 0;
        List<Integer> list = this.MediaSessionCompat$QueueItem;
        int hashCode10 = list != null ? list.hashCode() : 0;
        List<padWithZerosToMaxIntWidth> list2 = this.AppCompatDialogFragment;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EasycashOfferDisplay{applicationId='");
        sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
        sb.append('\'');
        sb.append(", sortSequence='");
        sb.append(this.IconCompatParcelizer);
        sb.append('\'');
        sb.append(", productCode='");
        sb.append(this.Keep);
        sb.append('\'');
        sb.append(", productSubCode='");
        sb.append(this.PlaybackStateCompat);
        sb.append('\'');
        sb.append(", sourceCode='");
        sb.append(this.AppCompatDelegateImpl$ListMenuDecorView);
        sb.append('\'');
        sb.append(", minimumCreditLimit='");
        sb.append(this.PlaybackStateCompat$CustomAction);
        sb.append('\'');
        sb.append(", maximumCreditLimit='");
        sb.append(this.AlertController$RecycleListView);
        sb.append('\'');
        sb.append(", defaultCreditLimit='");
        sb.append(this.f2854x50fd9e4a);
        sb.append('\'');
        sb.append(", sliderInterval='");
        sb.append(this.AppCompatActivity);
        sb.append('\'');
        sb.append(", durationOptions=");
        sb.append(this.MediaSessionCompat$QueueItem);
        sb.append(", repaymentMonthOptions=");
        sb.append(this.AppCompatDialogFragment);
        sb.append('}');
        return sb.toString();
    }
}

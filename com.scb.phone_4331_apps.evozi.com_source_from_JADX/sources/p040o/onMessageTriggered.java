package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Scopes;
import java.util.List;

/* renamed from: o.onMessageTriggered */
public final class onMessageTriggered implements Parcelable {
    public static final Parcelable.Creator CREATOR = new read();
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    private List<String> MediaMetadataCompat;
    private String RatingCompat;
    public String read;
    public List<String> write;

    /* renamed from: o.onMessageTriggered$read */
    public static final class read implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "in");
            return new onMessageTriggered(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        public final Object[] newArray(int i) {
            return new onMessageTriggered[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onMessageTriggered)) {
            return false;
        }
        onMessageTriggered onmessagetriggered = (onMessageTriggered) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) onmessagetriggered.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) onmessagetriggered.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) onmessagetriggered.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) onmessagetriggered.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) onmessagetriggered.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) onmessagetriggered.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) onmessagetriggered.write);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.RatingCompat;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.read;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        List<String> list = this.MediaMetadataCompat;
        int hashCode6 = list != null ? list.hashCode() : 0;
        List<String> list2 = this.write;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChangeChannelSuccessDisplay(transactionDate=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", channelName=");
        sb.append(this.RatingCompat);
        sb.append(", channel=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", email=");
        sb.append(this.read);
        sb.append(", address=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", cardList=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", cardMaskNo=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeStringList(this.MediaMetadataCompat);
        parcel.writeStringList(this.write);
    }

    public onMessageTriggered(String str, String str2, String str3, String str4, String str5, List<String> list, List<String> list2) {
        onGetStartedClick.write((Object) str, "transactionDate");
        onGetStartedClick.write((Object) str2, "channelName");
        onGetStartedClick.write((Object) str3, "channel");
        onGetStartedClick.write((Object) str4, Scopes.EMAIL);
        onGetStartedClick.write((Object) str5, "address");
        onGetStartedClick.write((Object) list, "cardList");
        onGetStartedClick.write((Object) list2, "cardMaskNo");
        this.IconCompatParcelizer = str;
        this.RatingCompat = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
        this.read = str4;
        this.MediaBrowserCompat$ItemReceiver = str5;
        this.MediaMetadataCompat = list;
        this.write = list2;
    }
}

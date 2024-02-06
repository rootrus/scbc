package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Scopes;
import java.util.ArrayList;
import java.util.List;
import p040o.AnalyticsConnectorImpl;

/* renamed from: o.Component */
public final class Component implements Parcelable {
    public static final Parcelable.Creator CREATOR = new write();
    public List<AnalyticsConnectorImpl.C30121> IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    private String MediaBrowserCompat$SearchResultReceiver;
    public String read;
    public String write;

    /* renamed from: o.Component$write */
    public static final class write implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "in");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((AnalyticsConnectorImpl.C30121) AnalyticsConnectorImpl.C30121.CREATOR.createFromParcel(parcel));
                readInt--;
            }
            return new Component(readString, readString2, readString3, readString4, readString5, arrayList);
        }

        public final Object[] newArray(int i) {
            return new Component[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Component)) {
            return false;
        }
        Component component = (Component) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) component.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) component.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) component.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) component.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) component.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) component.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.write;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        List<AnalyticsConnectorImpl.C30121> list = this.IconCompatParcelizer;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StatementChannelDisplay(channelName=");
        sb.append(this.read);
        sb.append(", channel=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", email=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", address=");
        sb.append(this.write);
        sb.append(", verifyEmail=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", channels=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.write);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        List<AnalyticsConnectorImpl.C30121> list = this.IconCompatParcelizer;
        parcel.writeInt(list.size());
        for (AnalyticsConnectorImpl.C30121 writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, 0);
        }
    }

    /* renamed from: o.Component$Builder */
    public final class Builder implements Parcelable {
        public static final Parcelable.Creator CREATOR = new Component$Builder$MediaBrowserCompat$ItemReceiver();
        public String MediaBrowserCompat$CustomActionResultReceiver;

        public Builder() {
            this((byte) 0);
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Builder) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) ((Builder) obj).MediaBrowserCompat$CustomActionResultReceiver);
            }
            return true;
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MyECouponDeepLinkDisplay(cardRef=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "parcel");
            parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public Builder(String str) {
            onGetStartedClick.write((Object) str, "cardRef");
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
        }

        private /* synthetic */ Builder(byte b) {
            this("");
        }
    }

    public Component(String str, String str2, String str3, String str4, String str5, List<AnalyticsConnectorImpl.C30121> list) {
        onGetStartedClick.write((Object) str, "channelName");
        onGetStartedClick.write((Object) str2, "channel");
        onGetStartedClick.write((Object) str3, Scopes.EMAIL);
        onGetStartedClick.write((Object) str4, "address");
        onGetStartedClick.write((Object) str5, "verifyEmail");
        onGetStartedClick.write((Object) list, "channels");
        this.read = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
        this.write = str4;
        this.MediaBrowserCompat$SearchResultReceiver = str5;
        this.IconCompatParcelizer = list;
    }
}

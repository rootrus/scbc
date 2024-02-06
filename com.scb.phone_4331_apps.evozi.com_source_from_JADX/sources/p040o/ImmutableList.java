package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

/* renamed from: o.ImmutableList */
public final class ImmutableList implements Parcelable {
    public static final Parcelable.Creator<ImmutableList> CREATOR = new IconCompatParcelizer();
    @SerializedName("conversionType")
    public final String IconCompatParcelizer;
    @SerializedName("fromAmount")
    private final double MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("fromCurrency")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("toCurrency")
    private final String MediaBrowserCompat$MediaItem;
    @SerializedName("toAmount")
    private final double MediaMetadataCompat;
    @SerializedName("cardRefNo")
    private final String read;
    @SerializedName("conversionRate")
    private final double write;

    public final int describeContents() {
        return 0;
    }

    /* renamed from: o.ImmutableList$Builder */
    public final class Builder {
        @SerializedName("cardRefNo")
        private final String MediaBrowserCompat$CustomActionResultReceiver;

        public Builder(String str) {
            onGetStartedClick.write((Object) str, "cardRefNo");
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
        }
    }

    /* renamed from: o.ImmutableList$ReverseImmutableList */
    public final class ReverseImmutableList {
        @SerializedName("currentAddress")
        private final reversePosition write;

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof ReverseImmutableList) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) ((ReverseImmutableList) obj).write);
            }
            return true;
        }

        public final int hashCode() {
            reversePosition reverseposition = this.write;
            if (reverseposition != null) {
                return reverseposition.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AddressSaveRequest(currentAddress=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }

        public ReverseImmutableList(reversePosition reverseposition) {
            onGetStartedClick.write((Object) reverseposition, "currentAddress");
            this.write = reverseposition;
        }
    }

    public ImmutableList(String str, String str2, String str3, String str4, double d, double d2, double d3) {
        onGetStartedClick.write((Object) str, "cardRefNo");
        onGetStartedClick.write((Object) str2, "conversionType");
        onGetStartedClick.write((Object) str3, "fromCurrency");
        onGetStartedClick.write((Object) str4, "toCurrency");
        this.read = str;
        this.IconCompatParcelizer = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
        this.MediaBrowserCompat$MediaItem = str4;
        this.write = d;
        this.MediaBrowserCompat$CustomActionResultReceiver = d2;
        this.MediaMetadataCompat = d3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ImmutableList(android.os.Parcel r14) {
        /*
            r13 = this;
            java.lang.String r0 = "source"
            p040o.onGetStartedClick.write((java.lang.Object) r14, (java.lang.String) r0)
            java.lang.String r0 = r14.readString()
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x000f
            r3 = r1
            goto L_0x0010
        L_0x000f:
            r3 = r0
        L_0x0010:
            java.lang.String r0 = r14.readString()
            if (r0 != 0) goto L_0x0018
            r4 = r1
            goto L_0x0019
        L_0x0018:
            r4 = r0
        L_0x0019:
            java.lang.String r0 = r14.readString()
            if (r0 != 0) goto L_0x0021
            r5 = r1
            goto L_0x0022
        L_0x0021:
            r5 = r0
        L_0x0022:
            java.lang.String r0 = r14.readString()
            if (r0 != 0) goto L_0x002a
            r6 = r1
            goto L_0x002b
        L_0x002a:
            r6 = r0
        L_0x002b:
            double r7 = r14.readDouble()
            double r9 = r14.readDouble()
            double r11 = r14.readDouble()
            r2 = r13
            r2.<init>(r3, r4, r5, r6, r7, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.ImmutableList.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "dest");
        parcel.writeString(this.read);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeDouble(this.write);
        parcel.writeDouble(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeDouble(this.MediaMetadataCompat);
    }

    /* renamed from: o.ImmutableList$SerializedForm */
    public class SerializedForm {
        @SerializedName("nickname")
        public String ActionMenuItemView;
        @SerializedName("accountTo")
        public String AppCompatDelegateImpl$ListMenuDecorView;
        @SerializedName("function")
        public String AppCompatViewInflater;
        @SerializedName("refNo1")
        public String setCheckable;
        @SerializedName("amount")
        public double setChecked;
        @SerializedName("accountFrom")
        public String setContentView;
        @SerializedName("payeeId")
        public String setExpandedFormat;
        @SerializedName("refNo2")
        public String setIcon;
        @SerializedName("refNo3")
        public String setPadding;
        @SerializedName("subFunction")
        public String setShortcut;

        public static SerializedForm read() {
            return new SerializedForm();
        }
    }

    /* renamed from: o.ImmutableList$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements Parcelable.Creator<ImmutableList> {
        IconCompatParcelizer() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "source");
            return new ImmutableList(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ImmutableList[i];
        }
    }
}

package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.setDiskSpace */
public final class setDiskSpace extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IconCompatParcelizer();
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final read MediaBrowserCompat$ItemReceiver;
    private final String MediaBrowserCompat$MediaItem;
    private final String MediaDescriptionCompat;
    public final read MediaMetadataCompat;
    public final String RatingCompat;
    public final write read;

    /* renamed from: o.setDiskSpace$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "in");
            return new setDiskSpace(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (read) read.CREATOR.createFromParcel(parcel), (read) read.CREATOR.createFromParcel(parcel), (write) write.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new setDiskSpace[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setDiskSpace)) {
            return false;
        }
        setDiskSpace setdiskspace = (setDiskSpace) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) setdiskspace.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) setdiskspace.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setdiskspace.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setdiskspace.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setdiskspace.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) setdiskspace.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setdiskspace.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) setdiskspace.MediaBrowserCompat$MediaItem);
    }

    public final int hashCode() {
        String str = this.MediaDescriptionCompat;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.RatingCompat;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        read read2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode5 = read2 != null ? read2.hashCode() : 0;
        read read3 = this.MediaMetadataCompat;
        int hashCode6 = read3 != null ? read3.hashCode() : 0;
        write write2 = this.read;
        int hashCode7 = write2 != null ? write2.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$MediaItem;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrepaidTravelConversionVerificationDisplay(cardRefNo=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", transactionToken=");
        sb.append(this.RatingCompat);
        sb.append(", fromAmount=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", toAmount=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", fromCurrency=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", toCurrency=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", conversionRate=");
        sb.append(this.read);
        sb.append(", isRateChangedFlag=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        this.MediaBrowserCompat$ItemReceiver.writeToParcel(parcel, 0);
        this.MediaMetadataCompat.writeToParcel(parcel, 0);
        this.read.writeToParcel(parcel, 0);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
    }

    public setDiskSpace(String str, String str2, String str3, String str4, read read2, read read3, write write2, String str5) {
        onGetStartedClick.write((Object) str, "cardRefNo");
        onGetStartedClick.write((Object) str2, "transactionToken");
        onGetStartedClick.write((Object) str3, "fromAmount");
        onGetStartedClick.write((Object) str4, "toAmount");
        onGetStartedClick.write((Object) read2, "fromCurrency");
        onGetStartedClick.write((Object) read3, "toCurrency");
        onGetStartedClick.write((Object) write2, "conversionRate");
        onGetStartedClick.write((Object) str5, "isRateChangedFlag");
        this.MediaDescriptionCompat = str;
        this.RatingCompat = str2;
        this.IconCompatParcelizer = str3;
        this.MediaBrowserCompat$CustomActionResultReceiver = str4;
        this.MediaBrowserCompat$ItemReceiver = read2;
        this.MediaMetadataCompat = read3;
        this.read = write2;
        this.MediaBrowserCompat$MediaItem = str5;
    }

    /* renamed from: o.setDiskSpace$read */
    public static final class read implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C10759read();
        public final String IconCompatParcelizer;
        public final String write;

        /* renamed from: o.setDiskSpace$read$read  reason: collision with other inner class name */
        public static final class C10759read implements Parcelable.Creator {
            public final Object createFromParcel(Parcel parcel) {
                onGetStartedClick.write((Object) parcel, "in");
                return new read(parcel.readString(), parcel.readString());
            }

            public final Object[] newArray(int i) {
                return new read[i];
            }
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof read)) {
                return false;
            }
            read read = (read) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) read.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) read.write);
        }

        public final int hashCode() {
            String str = this.IconCompatParcelizer;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.write;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CurrencyDisplay(currency=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", currencyName=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "parcel");
            parcel.writeString(this.IconCompatParcelizer);
            parcel.writeString(this.write);
        }

        public read(String str, String str2) {
            onGetStartedClick.write((Object) str, "currency");
            onGetStartedClick.write((Object) str2, "currencyName");
            this.IconCompatParcelizer = str;
            this.write = str2;
        }
    }

    /* renamed from: o.setDiskSpace$write */
    public static final class write implements Parcelable {
        public static final Parcelable.Creator CREATOR = new setDiskSpace$write$MediaBrowserCompat$ItemReceiver();
        private final double MediaBrowserCompat$ItemReceiver;
        public final String write;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof write)) {
                return false;
            }
            write write2 = (write) obj;
            return Double.compare(this.MediaBrowserCompat$ItemReceiver, write2.MediaBrowserCompat$ItemReceiver) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) write2.write);
        }

        public final int hashCode() {
            long doubleToLongBits = Double.doubleToLongBits(this.MediaBrowserCompat$ItemReceiver);
            int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
            String str = this.write;
            return (i * 31) + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ConversionRateDisplay(rate=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", description=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "parcel");
            parcel.writeDouble(this.MediaBrowserCompat$ItemReceiver);
            parcel.writeString(this.write);
        }

        public write(double d, String str) {
            onGetStartedClick.write((Object) str, "description");
            this.MediaBrowserCompat$ItemReceiver = d;
            this.write = str;
        }
    }
}

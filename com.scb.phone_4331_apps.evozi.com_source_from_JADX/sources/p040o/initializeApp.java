package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.initializeApp */
public final class initializeApp implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IconCompatParcelizer();
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public String f2868x50fd9e4a;
    public double MediaDescriptionCompat;
    public List<isDefaultApp> MediaMetadataCompat;
    public double MediaSessionCompat$QueueItem;
    public String MediaSessionCompat$ResultReceiverWrapper;
    public String MediaSessionCompat$Token;
    public String ParcelableVolumeInfo;
    public String RatingCompat;
    public String read;
    public String setHasDecor;
    public String write;

    /* renamed from: o.initializeApp$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Parcel parcel2 = parcel;
            onGetStartedClick.write((Object) parcel2, "in");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            double readDouble = parcel.readDouble();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            double readDouble2 = parcel.readDouble();
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList2.add((isDefaultApp) isDefaultApp.CREATOR.createFromParcel(parcel2));
                    readInt--;
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            return new initializeApp(readString, readString2, readDouble, readString3, readString4, readString5, readDouble2, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new initializeApp[i];
        }
    }

    public initializeApp() {
        this((byte) 0);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof initializeApp)) {
            return false;
        }
        initializeApp initializeapp = (initializeApp) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) initializeapp.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) initializeapp.MediaBrowserCompat$ItemReceiver) && Double.compare(this.MediaSessionCompat$QueueItem, initializeapp.MediaSessionCompat$QueueItem) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.ParcelableVolumeInfo, (Object) initializeapp.ParcelableVolumeInfo) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) initializeapp.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) initializeapp.read) && Double.compare(this.MediaDescriptionCompat, initializeapp.MediaDescriptionCompat) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) initializeapp.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) initializeapp.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) initializeapp.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) initializeapp.MediaSessionCompat$Token) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) initializeapp.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.setHasDecor, (Object) initializeapp.setHasDecor) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) initializeapp.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$ResultReceiverWrapper, (Object) initializeapp.MediaSessionCompat$ResultReceiverWrapper) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.f2868x50fd9e4a, (Object) initializeapp.f2868x50fd9e4a);
    }

    public final int hashCode() {
        String str = this.RatingCompat;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        long doubleToLongBits = Double.doubleToLongBits(this.MediaSessionCompat$QueueItem);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        String str3 = this.ParcelableVolumeInfo;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.read;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        long doubleToLongBits2 = Double.doubleToLongBits(this.MediaDescriptionCompat);
        int i2 = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
        List<isDefaultApp> list = this.MediaMetadataCompat;
        int hashCode6 = list != null ? list.hashCode() : 0;
        String str6 = this.IconCompatParcelizer;
        int hashCode7 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode8 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.MediaSessionCompat$Token;
        int hashCode9 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.write;
        int hashCode10 = str9 != null ? str9.hashCode() : 0;
        String str10 = this.setHasDecor;
        int hashCode11 = str10 != null ? str10.hashCode() : 0;
        String str11 = this.MediaBrowserCompat$MediaItem;
        int hashCode12 = str11 != null ? str11.hashCode() : 0;
        String str12 = this.MediaSessionCompat$ResultReceiverWrapper;
        int hashCode13 = str12 != null ? str12.hashCode() : 0;
        String str13 = this.f2868x50fd9e4a;
        return (((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + i) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i2) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + (str13 != null ? str13.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeejungInstallmentsReviewDisplayModel(nickName=");
        sb.append(this.RatingCompat);
        sb.append(", maskedCardNumber=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", totalPurchaseAmount=");
        sb.append(this.MediaSessionCompat$QueueItem);
        sb.append(", totalInterestAmount=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(", monthlyInterestRate=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", duration=");
        sb.append(this.read);
        sb.append(", monthlyPayment=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", merchantPaymentDetails=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", formattedDuration=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", cardRefNo=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", tokenId=");
        sb.append(this.MediaSessionCompat$Token);
        sb.append(", loanId=");
        sb.append(this.write);
        sb.append(", yearlyInterestRate=");
        sb.append(this.setHasDecor);
        sb.append(", principal=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", totalPayment=");
        sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
        sb.append(", verifiedEmail=");
        sb.append(this.f2868x50fd9e4a);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeDouble(this.MediaSessionCompat$QueueItem);
        parcel.writeString(this.ParcelableVolumeInfo);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.read);
        parcel.writeDouble(this.MediaDescriptionCompat);
        List<isDefaultApp> list = this.MediaMetadataCompat;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (isDefaultApp writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaSessionCompat$Token);
        parcel.writeString(this.write);
        parcel.writeString(this.setHasDecor);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeString(this.f2868x50fd9e4a);
    }

    public initializeApp(String str, String str2, double d, String str3, String str4, String str5, double d2, List<isDefaultApp> list, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        this.RatingCompat = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.MediaSessionCompat$QueueItem = d;
        this.ParcelableVolumeInfo = str3;
        this.MediaBrowserCompat$SearchResultReceiver = str4;
        this.read = str5;
        this.MediaDescriptionCompat = d2;
        this.MediaMetadataCompat = list;
        this.IconCompatParcelizer = str6;
        this.MediaBrowserCompat$CustomActionResultReceiver = str7;
        this.MediaSessionCompat$Token = str8;
        this.write = str9;
        this.setHasDecor = str10;
        this.MediaBrowserCompat$MediaItem = str11;
        this.MediaSessionCompat$ResultReceiverWrapper = str12;
        this.f2868x50fd9e4a = str13;
    }

    public /* synthetic */ initializeApp(byte b) {
        this("", "", 0.0d, "", "", "", 0.0d, (List<isDefaultApp>) null, "", "", "", (String) null, "", "", "", (String) null);
    }
}

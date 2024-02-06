package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p040o.zzfe;

/* renamed from: o.onUncaughtException */
public final class onUncaughtException implements Parcelable {
    public static final Parcelable.Creator CREATOR = new read();
    public final write IconCompatParcelizer;
    public final C5103xa98770a8 MediaBrowserCompat$CustomActionResultReceiver;
    public final List<IconCompatParcelizer> MediaBrowserCompat$ItemReceiver;
    public final RatingCompat MediaBrowserCompat$MediaItem;
    public final MediaDescriptionCompat MediaBrowserCompat$SearchResultReceiver;
    public final onUncaughtException$MediaBrowserCompat$SearchResultReceiver MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final onUncaughtException$MediaBrowserCompat$MediaItem RatingCompat;
    public final MediaMetadataCompat read;
    public final onUncaughtException$MediaBrowserCompat$ItemReceiver write;

    /* renamed from: o.onUncaughtException$read */
    public static final class read implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            onGetStartedClick.write((Object) parcel, "in");
            onUncaughtException$MediaBrowserCompat$ItemReceiver onuncaughtexception_mediabrowsercompat_itemreceiver = (onUncaughtException$MediaBrowserCompat$ItemReceiver) onUncaughtException$MediaBrowserCompat$ItemReceiver.CREATOR.createFromParcel(parcel);
            MediaMetadataCompat mediaMetadataCompat = (MediaMetadataCompat) MediaMetadataCompat.CREATOR.createFromParcel(parcel);
            write write = (write) write.CREATOR.createFromParcel(parcel);
            C5103xa98770a8 onuncaughtexception_mediabrowsercompat_customactionresultreceiver = (C5103xa98770a8) C5103xa98770a8.CREATOR.createFromParcel(parcel);
            RatingCompat ratingCompat = (RatingCompat) RatingCompat.CREATOR.createFromParcel(parcel);
            onUncaughtException$MediaBrowserCompat$SearchResultReceiver onuncaughtexception_mediabrowsercompat_searchresultreceiver = (onUncaughtException$MediaBrowserCompat$SearchResultReceiver) onUncaughtException$MediaBrowserCompat$SearchResultReceiver.CREATOR.createFromParcel(parcel);
            onUncaughtException$MediaBrowserCompat$MediaItem onuncaughtexception_mediabrowsercompat_mediaitem = (onUncaughtException$MediaBrowserCompat$MediaItem) onUncaughtException$MediaBrowserCompat$MediaItem.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add((IconCompatParcelizer) IconCompatParcelizer.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
            } else {
                arrayList = null;
            }
            return new onUncaughtException(onuncaughtexception_mediabrowsercompat_itemreceiver, mediaMetadataCompat, write, onuncaughtexception_mediabrowsercompat_customactionresultreceiver, ratingCompat, onuncaughtexception_mediabrowsercompat_searchresultreceiver, onuncaughtexception_mediabrowsercompat_mediaitem, arrayList, parcel.readString(), parcel.readInt() != 0 ? (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel) : null);
        }

        public final Object[] newArray(int i) {
            return new onUncaughtException[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onUncaughtException)) {
            return false;
        }
        onUncaughtException onuncaughtexception = (onUncaughtException) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) onuncaughtexception.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) onuncaughtexception.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) onuncaughtexception.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) onuncaughtexception.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) onuncaughtexception.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) onuncaughtexception.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) onuncaughtexception.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) onuncaughtexception.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) onuncaughtexception.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) onuncaughtexception.MediaBrowserCompat$SearchResultReceiver);
    }

    public final int hashCode() {
        onUncaughtException$MediaBrowserCompat$ItemReceiver onuncaughtexception_mediabrowsercompat_itemreceiver = this.write;
        int i = 0;
        int hashCode = onuncaughtexception_mediabrowsercompat_itemreceiver != null ? onuncaughtexception_mediabrowsercompat_itemreceiver.hashCode() : 0;
        MediaMetadataCompat mediaMetadataCompat = this.read;
        int hashCode2 = mediaMetadataCompat != null ? mediaMetadataCompat.hashCode() : 0;
        write write2 = this.IconCompatParcelizer;
        int hashCode3 = write2 != null ? write2.hashCode() : 0;
        C5103xa98770a8 onuncaughtexception_mediabrowsercompat_customactionresultreceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = onuncaughtexception_mediabrowsercompat_customactionresultreceiver != null ? onuncaughtexception_mediabrowsercompat_customactionresultreceiver.hashCode() : 0;
        RatingCompat ratingCompat = this.MediaBrowserCompat$MediaItem;
        int hashCode5 = ratingCompat != null ? ratingCompat.hashCode() : 0;
        onUncaughtException$MediaBrowserCompat$SearchResultReceiver onuncaughtexception_mediabrowsercompat_searchresultreceiver = this.MediaDescriptionCompat;
        int hashCode6 = onuncaughtexception_mediabrowsercompat_searchresultreceiver != null ? onuncaughtexception_mediabrowsercompat_searchresultreceiver.hashCode() : 0;
        onUncaughtException$MediaBrowserCompat$MediaItem onuncaughtexception_mediabrowsercompat_mediaitem = this.RatingCompat;
        int hashCode7 = onuncaughtexception_mediabrowsercompat_mediaitem != null ? onuncaughtexception_mediabrowsercompat_mediaitem.hashCode() : 0;
        List<IconCompatParcelizer> list = this.MediaBrowserCompat$ItemReceiver;
        int hashCode8 = list != null ? list.hashCode() : 0;
        String str = this.MediaMetadataCompat;
        int hashCode9 = str != null ? str.hashCode() : 0;
        MediaDescriptionCompat mediaDescriptionCompat = this.MediaBrowserCompat$SearchResultReceiver;
        if (mediaDescriptionCompat != null) {
            i = mediaDescriptionCompat.hashCode();
        }
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlBusinessOwnerSubmissionReviewStepTwoInitialDataDisplay(businessInfo=");
        sb.append(this.write);
        sb.append(", loanInfo=");
        sb.append(this.read);
        sb.append(", incomeInfo=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", bankInfo=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", urlInfo=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", uploadedDocumentsInfo=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", tcInfo=");
        sb.append(this.RatingCompat);
        sb.append(", consentInfo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", principalAmount=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", trackingInfo=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        this.write.writeToParcel(parcel, 0);
        this.read.writeToParcel(parcel, 0);
        this.IconCompatParcelizer.writeToParcel(parcel, 0);
        this.MediaBrowserCompat$CustomActionResultReceiver.writeToParcel(parcel, 0);
        this.MediaBrowserCompat$MediaItem.writeToParcel(parcel, 0);
        this.MediaDescriptionCompat.writeToParcel(parcel, 0);
        this.RatingCompat.writeToParcel(parcel, 0);
        List<IconCompatParcelizer> list = this.MediaBrowserCompat$ItemReceiver;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (IconCompatParcelizer writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.MediaMetadataCompat);
        MediaDescriptionCompat mediaDescriptionCompat = this.MediaBrowserCompat$SearchResultReceiver;
        if (mediaDescriptionCompat != null) {
            parcel.writeInt(1);
            mediaDescriptionCompat.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public onUncaughtException(onUncaughtException$MediaBrowserCompat$ItemReceiver onuncaughtexception_mediabrowsercompat_itemreceiver, MediaMetadataCompat mediaMetadataCompat, write write2, C5103xa98770a8 onuncaughtexception_mediabrowsercompat_customactionresultreceiver, RatingCompat ratingCompat, onUncaughtException$MediaBrowserCompat$SearchResultReceiver onuncaughtexception_mediabrowsercompat_searchresultreceiver, onUncaughtException$MediaBrowserCompat$MediaItem onuncaughtexception_mediabrowsercompat_mediaitem, List<IconCompatParcelizer> list, String str, MediaDescriptionCompat mediaDescriptionCompat) {
        onGetStartedClick.write((Object) onuncaughtexception_mediabrowsercompat_itemreceiver, "businessInfo");
        onGetStartedClick.write((Object) mediaMetadataCompat, "loanInfo");
        onGetStartedClick.write((Object) write2, "incomeInfo");
        onGetStartedClick.write((Object) onuncaughtexception_mediabrowsercompat_customactionresultreceiver, "bankInfo");
        onGetStartedClick.write((Object) ratingCompat, "urlInfo");
        onGetStartedClick.write((Object) onuncaughtexception_mediabrowsercompat_searchresultreceiver, "uploadedDocumentsInfo");
        onGetStartedClick.write((Object) onuncaughtexception_mediabrowsercompat_mediaitem, "tcInfo");
        onGetStartedClick.write((Object) str, "principalAmount");
        this.write = onuncaughtexception_mediabrowsercompat_itemreceiver;
        this.read = mediaMetadataCompat;
        this.IconCompatParcelizer = write2;
        this.MediaBrowserCompat$CustomActionResultReceiver = onuncaughtexception_mediabrowsercompat_customactionresultreceiver;
        this.MediaBrowserCompat$MediaItem = ratingCompat;
        this.MediaDescriptionCompat = onuncaughtexception_mediabrowsercompat_searchresultreceiver;
        this.RatingCompat = onuncaughtexception_mediabrowsercompat_mediaitem;
        this.MediaBrowserCompat$ItemReceiver = list;
        this.MediaMetadataCompat = str;
        this.MediaBrowserCompat$SearchResultReceiver = mediaDescriptionCompat;
    }

    /* renamed from: o.onUncaughtException$MediaDescriptionCompat */
    public static final class MediaDescriptionCompat implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C5107x34a8f4bf();
        public final String IconCompatParcelizer;
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final String write;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MediaDescriptionCompat)) {
                return false;
            }
            MediaDescriptionCompat mediaDescriptionCompat = (MediaDescriptionCompat) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) mediaDescriptionCompat.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) mediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) mediaDescriptionCompat.write);
        }

        public final int hashCode() {
            String str = this.IconCompatParcelizer;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.write;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return (((hashCode * 31) + hashCode2) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("TrackingInfo(loanAmount=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", repaymentAmount=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", repaymentTerm=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "parcel");
            parcel.writeString(this.IconCompatParcelizer);
            parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
            parcel.writeString(this.write);
        }

        public MediaDescriptionCompat(String str, String str2, String str3) {
            onGetStartedClick.write((Object) str, "loanAmount");
            onGetStartedClick.write((Object) str2, "repaymentAmount");
            onGetStartedClick.write((Object) str3, "repaymentTerm");
            this.IconCompatParcelizer = str;
            this.MediaBrowserCompat$CustomActionResultReceiver = str2;
            this.write = str3;
        }
    }

    /* renamed from: o.onUncaughtException$MediaMetadataCompat */
    public static final class MediaMetadataCompat implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C5108xe0e89539();
        public final String MediaBrowserCompat$CustomActionResultReceiver;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) ((MediaMetadataCompat) obj).MediaBrowserCompat$CustomActionResultReceiver);
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
            sb.append("LoanInfo(purpose=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "parcel");
            parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public MediaMetadataCompat(String str) {
            onGetStartedClick.write((Object) str, "purpose");
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
        }
    }

    /* renamed from: o.onUncaughtException$write */
    public static final class write implements Parcelable {
        public static final Parcelable.Creator CREATOR = new IconCompatParcelizer();
        public final String IconCompatParcelizer;
        public final String read;

        /* renamed from: o.onUncaughtException$write$IconCompatParcelizer */
        public static final class IconCompatParcelizer implements Parcelable.Creator {
            public final Object createFromParcel(Parcel parcel) {
                onGetStartedClick.write((Object) parcel, "in");
                return new write(parcel.readString(), parcel.readString());
            }

            public final Object[] newArray(int i) {
                return new write[i];
            }
        }

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
            write write = (write) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) write.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) write.read);
        }

        public final int hashCode() {
            String str = this.IconCompatParcelizer;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.read;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("IncomeInfo(netIncome=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", sourceOfIncomeCountry=");
            sb.append(this.read);
            sb.append(")");
            return sb.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "parcel");
            parcel.writeString(this.IconCompatParcelizer);
            parcel.writeString(this.read);
        }

        public write(String str, String str2) {
            onGetStartedClick.write((Object) str, "netIncome");
            this.IconCompatParcelizer = str;
            this.read = str2;
        }
    }

    /* renamed from: o.onUncaughtException$RatingCompat */
    public static final class RatingCompat implements Parcelable {
        public static final Parcelable.Creator CREATOR = new read();
        public final List<String> IconCompatParcelizer;
        private final List<String> MediaBrowserCompat$CustomActionResultReceiver;
        public final List<String> read;
        private final List<String> write;

        /* renamed from: o.onUncaughtException$RatingCompat$read */
        public static final class read implements Parcelable.Creator {
            public final Object createFromParcel(Parcel parcel) {
                onGetStartedClick.write((Object) parcel, "in");
                return new RatingCompat(parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList());
            }

            public final Object[] newArray(int i) {
                return new RatingCompat[i];
            }
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RatingCompat)) {
                return false;
            }
            RatingCompat ratingCompat = (RatingCompat) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) ratingCompat.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) ratingCompat.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) ratingCompat.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) ratingCompat.read);
        }

        public final int hashCode() {
            List<String> list = this.IconCompatParcelizer;
            int i = 0;
            int hashCode = list != null ? list.hashCode() : 0;
            List<String> list2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode2 = list2 != null ? list2.hashCode() : 0;
            List<String> list3 = this.write;
            int hashCode3 = list3 != null ? list3.hashCode() : 0;
            List<String> list4 = this.read;
            if (list4 != null) {
                i = list4.hashCode();
            }
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("UrlInfo(ownStoreUrls=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", storeUrls=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", productUrls=");
            sb.append(this.write);
            sb.append(", storeAndProducts=");
            sb.append(this.read);
            sb.append(")");
            return sb.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "parcel");
            parcel.writeStringList(this.IconCompatParcelizer);
            parcel.writeStringList(this.MediaBrowserCompat$CustomActionResultReceiver);
            parcel.writeStringList(this.write);
            parcel.writeStringList(this.read);
        }

        public RatingCompat(List<String> list, List<String> list2, List<String> list3, List<String> list4) {
            onGetStartedClick.write((Object) list4, "storeAndProducts");
            this.IconCompatParcelizer = list;
            this.MediaBrowserCompat$CustomActionResultReceiver = list2;
            this.write = list3;
            this.read = list4;
        }
    }

    /* renamed from: o.onUncaughtException$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements Parcelable {
        public static final Parcelable.Creator CREATOR = new write();
        public final zzfe.zza MediaBrowserCompat$CustomActionResultReceiver;
        public final C10756IconCompatParcelizer write;

        /* renamed from: o.onUncaughtException$IconCompatParcelizer$IconCompatParcelizer  reason: collision with other inner class name */
        public enum C10756IconCompatParcelizer {
            EMPTY,
            ACCEPTED,
            DECLINED
        }

        /* renamed from: o.onUncaughtException$IconCompatParcelizer$write */
        public static final class write implements Parcelable.Creator {
            public final Object createFromParcel(Parcel parcel) {
                onGetStartedClick.write((Object) parcel, "in");
                return new IconCompatParcelizer((zzfe.zza) Enum.valueOf(zzfe.zza.class, parcel.readString()), (C10756IconCompatParcelizer) Enum.valueOf(C10756IconCompatParcelizer.class, parcel.readString()));
            }

            public final Object[] newArray(int i) {
                return new IconCompatParcelizer[i];
            }
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) iconCompatParcelizer.write);
        }

        public final int hashCode() {
            zzfe.zza zza = this.MediaBrowserCompat$CustomActionResultReceiver;
            int i = 0;
            int hashCode = zza != null ? zza.hashCode() : 0;
            C10756IconCompatParcelizer iconCompatParcelizer = this.write;
            if (iconCompatParcelizer != null) {
                i = iconCompatParcelizer.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ConsentInfo(documentType=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", initialState=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "parcel");
            parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver.name());
            parcel.writeString(this.write.name());
        }

        public IconCompatParcelizer(zzfe.zza zza, C10756IconCompatParcelizer iconCompatParcelizer) {
            onGetStartedClick.write((Object) zza, "documentType");
            onGetStartedClick.write((Object) iconCompatParcelizer, "initialState");
            this.MediaBrowserCompat$CustomActionResultReceiver = zza;
            this.write = iconCompatParcelizer;
        }
    }
}

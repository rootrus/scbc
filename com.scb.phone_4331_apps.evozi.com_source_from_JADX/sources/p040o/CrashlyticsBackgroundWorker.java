package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.CrashlyticsBackgroundWorker */
public final class CrashlyticsBackgroundWorker extends isRunningOnThread {
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;

    public CrashlyticsBackgroundWorker(String str, String str2) {
        onGetStartedClick.write((Object) str, "header");
        onGetStartedClick.write((Object) str2, "subHeader");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
    }

    /* renamed from: o.CrashlyticsBackgroundWorker$1 */
    public final class C32131 extends remainingCapacity implements Parcelable {
        public static final Parcelable.Creator CREATOR = new write();
        public List<C32142> IconCompatParcelizer;
        public Double MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        private String MediaBrowserCompat$MediaItem;
        public String MediaBrowserCompat$SearchResultReceiver;
        public String MediaMetadataCompat;
        public String RatingCompat;
        public String read;

        /* renamed from: o.CrashlyticsBackgroundWorker$1$write */
        public static final class write implements Parcelable.Creator {
            public final Object createFromParcel(Parcel parcel) {
                onGetStartedClick.write((Object) parcel, "in");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                ArrayList arrayList = null;
                Double valueOf = parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null;
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                if (parcel.readInt() != 0) {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    while (readInt != 0) {
                        arrayList.add((C32142) C32142.CREATOR.createFromParcel(parcel));
                        readInt--;
                    }
                }
                return new C32131(readString, readString2, readString3, valueOf, readString4, readString5, arrayList, parcel.readString());
            }

            public final Object[] newArray(int i) {
                return new C32131[i];
            }
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "parcel");
            parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
            parcel.writeString(this.RatingCompat);
            parcel.writeString(this.read);
            Double d = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (d != null) {
                parcel.writeInt(1);
                parcel.writeDouble(d.doubleValue());
            } else {
                parcel.writeInt(0);
            }
            parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
            parcel.writeString(this.MediaMetadataCompat);
            List<C32142> list = this.IconCompatParcelizer;
            if (list != null) {
                parcel.writeInt(1);
                parcel.writeInt(list.size());
                for (C32142 writeToParcel : list) {
                    writeToParcel.writeToParcel(parcel, 0);
                }
            } else {
                parcel.writeInt(0);
            }
            parcel.writeString(this.MediaBrowserCompat$MediaItem);
        }

        public C32131(String str, String str2, String str3, Double d, String str4, String str5, List<C32142> list, String str6) {
            this.MediaBrowserCompat$ItemReceiver = str;
            this.RatingCompat = str2;
            this.read = str3;
            this.MediaBrowserCompat$CustomActionResultReceiver = d;
            this.MediaBrowserCompat$SearchResultReceiver = str4;
            this.MediaMetadataCompat = str5;
            this.IconCompatParcelizer = list;
            this.MediaBrowserCompat$MediaItem = str6;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("EasycashReferralDisplay{name='");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append('\'');
            sb.append(", phone='");
            sb.append(this.RatingCompat);
            sb.append('\'');
            sb.append(", email='");
            sb.append(this.read);
            sb.append('\'');
            sb.append(", minimumAmount=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", productType='");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append('\'');
            sb.append(", uuid='");
            sb.append(this.MediaMetadataCompat);
            sb.append('\'');
            sb.append(", consentDocuments=");
            sb.append(this.IconCompatParcelizer);
            sb.append('}');
            return sb.toString();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C32131(CrashlyticsBackgroundWorker$1$MediaBrowserCompat$ItemReceiver crashlyticsBackgroundWorker$1$MediaBrowserCompat$ItemReceiver) {
            this(crashlyticsBackgroundWorker$1$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver, crashlyticsBackgroundWorker$1$MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat, crashlyticsBackgroundWorker$1$MediaBrowserCompat$ItemReceiver.write, crashlyticsBackgroundWorker$1$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer, crashlyticsBackgroundWorker$1$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver, crashlyticsBackgroundWorker$1$MediaBrowserCompat$ItemReceiver.RatingCompat, crashlyticsBackgroundWorker$1$MediaBrowserCompat$ItemReceiver.read, crashlyticsBackgroundWorker$1$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver);
            onGetStartedClick.write((Object) crashlyticsBackgroundWorker$1$MediaBrowserCompat$ItemReceiver, "builder");
        }
    }
}

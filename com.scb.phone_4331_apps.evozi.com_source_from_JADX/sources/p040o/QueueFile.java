package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.TypeCastException;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;

/* renamed from: o.QueueFile */
public final class QueueFile {
    public String MediaBrowserCompat$ItemReceiver;
    public String write;

    /* renamed from: o.QueueFile$ElementInputStream */
    public final class ElementInputStream implements Parcelable {
        public static final read CREATOR = new read((byte) 0);
        private final String IconCompatParcelizer;
        private final String MediaBrowserCompat$CustomActionResultReceiver;
        private final String MediaBrowserCompat$ItemReceiver;
        private final String MediaBrowserCompat$SearchResultReceiver;
        private final String read;
        private final String write;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ElementInputStream)) {
                return false;
            }
            ElementInputStream elementInputStream = (ElementInputStream) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) elementInputStream.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) elementInputStream.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) elementInputStream.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) elementInputStream.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) elementInputStream.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) elementInputStream.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$ItemReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$SearchResultReceiver;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.write;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.IconCompatParcelizer;
            int hashCode4 = str4 != null ? str4.hashCode() : 0;
            String str5 = this.read;
            int hashCode5 = str5 != null ? str5.hashCode() : 0;
            String str6 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (str6 != null) {
                i = str6.hashCode();
            }
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MerchantWalletOwnerDisplay(firstNameTH=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", middleNameTH=");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append(", lastNameTH=");
            sb.append(this.write);
            sb.append(", firstNameEN=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", middleNameEN=");
            sb.append(this.read);
            sb.append(", lastNameEN=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        public ElementInputStream(String str, String str2, String str3, String str4, String str5, String str6) {
            this.MediaBrowserCompat$ItemReceiver = str;
            this.MediaBrowserCompat$SearchResultReceiver = str2;
            this.write = str3;
            this.IconCompatParcelizer = str4;
            this.read = str5;
            this.MediaBrowserCompat$CustomActionResultReceiver = str6;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public ElementInputStream(Parcel parcel) {
            this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            onGetStartedClick.write((Object) parcel, "parcel");
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "parcel");
            parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
            parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
            parcel.writeString(this.write);
            parcel.writeString(this.IconCompatParcelizer);
            parcel.writeString(this.read);
            parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        }

        /* renamed from: o.QueueFile$ElementInputStream$read */
        public static final class read implements Parcelable.Creator<ElementInputStream> {
            private read() {
            }

            public /* synthetic */ read(byte b) {
                this();
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                onGetStartedClick.write((Object) parcel, "parcel");
                return new ElementInputStream(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new ElementInputStream[i];
            }
        }
    }

    /* renamed from: o.QueueFile$Element */
    public final class Element extends AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder {
        public static final Parcelable.Creator<Element> CREATOR = new IconCompatParcelizer();
        public static final QueueFile$Element$MediaBrowserCompat$CustomActionResultReceiver read = new QueueFile$Element$MediaBrowserCompat$CustomActionResultReceiver((byte) 0);
        public String IconCompatParcelizer;
        public boolean MediaBrowserCompat$CustomActionResultReceiver;
        public boolean MediaBrowserCompat$ItemReceiver;
        public String write;

        public final int describeContents() {
            return 0;
        }

        public /* synthetic */ Element(QueueFile$Element$MediaBrowserCompat$ItemReceiver queueFile$Element$MediaBrowserCompat$ItemReceiver, byte b) {
            this(queueFile$Element$MediaBrowserCompat$ItemReceiver);
        }

        private Element(QueueFile$Element$MediaBrowserCompat$ItemReceiver queueFile$Element$MediaBrowserCompat$ItemReceiver) {
            this.MediaBrowserCompat$CustomActionResultReceiver = true;
            read(false);
            this.f2675x50fd9e4a = queueFile$Element$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
            this.IconCompatParcelizer = queueFile$Element$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
            this.write = queueFile$Element$MediaBrowserCompat$ItemReceiver.write;
            this.MediaBrowserCompat$ItemReceiver = false;
            this.MediaBrowserCompat$CustomActionResultReceiver = queueFile$Element$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "dest");
            parcel.writeString(this.IconCompatParcelizer);
            parcel.writeString(this.write);
            parcel.writeByte(this.MediaBrowserCompat$ItemReceiver ? (byte) 1 : 0);
            parcel.writeByte(this.MediaBrowserCompat$CustomActionResultReceiver ? (byte) 1 : 0);
            parcel.writeByte(this.MediaSessionCompat$Token ? (byte) 1 : 0);
            parcel.writeInt(this.f2675x50fd9e4a);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) getClass(), (Object) obj != null ? obj.getClass() : null)) {
                return false;
            }
            if (obj != null) {
                Element element = (Element) obj;
                if (!(!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) element.IconCompatParcelizer)) && !(!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) element.write)) && this.MediaBrowserCompat$ItemReceiver == element.MediaBrowserCompat$ItemReceiver && this.MediaBrowserCompat$CustomActionResultReceiver == element.MediaBrowserCompat$CustomActionResultReceiver) {
                    return true;
                }
                return false;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.presentation.model.display.mailingaddress.MailingAddressSelector");
        }

        public final int hashCode() {
            String str = this.IconCompatParcelizer;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.write;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return (((((hashCode * 31) + i) * 31) + Boolean.valueOf(this.MediaBrowserCompat$ItemReceiver).hashCode()) * 31) + Boolean.valueOf(this.MediaBrowserCompat$CustomActionResultReceiver).hashCode();
        }

        protected Element(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "parcel");
            boolean z = true;
            this.MediaBrowserCompat$CustomActionResultReceiver = true;
            this.IconCompatParcelizer = parcel.readString();
            this.write = parcel.readString();
            this.MediaBrowserCompat$ItemReceiver = parcel.readByte() != 0;
            this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readByte() != 0;
            this.MediaSessionCompat$Token = parcel.readByte() == 0 ? false : z;
            this.f2675x50fd9e4a = parcel.readInt();
        }

        /* renamed from: o.QueueFile$Element$IconCompatParcelizer */
        public static final class IconCompatParcelizer implements Parcelable.Creator<Element> {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            }

            IconCompatParcelizer() {
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                onGetStartedClick.write((Object) parcel, "source");
                return new Element(parcel);
            }
        }
    }

    /* renamed from: o.QueueFile$ElementReader */
    public final class ElementReader extends remainingCapacity {
        public String IconCompatParcelizer;
        public String read;

        public static ElementReader MediaBrowserCompat$ItemReceiver() {
            return new ElementReader();
        }
    }
}

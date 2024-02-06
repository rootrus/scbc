package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.AutoValue_CrashlyticsReport_Session_Device */
public final class AutoValue_CrashlyticsReport_Session_Device {
    public final String MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.AutoValue_CrashlyticsReport_Session_Device$Builder */
    public final class Builder implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C3068x37b75801();
        private final String IconCompatParcelizer;
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final C30661 MediaBrowserCompat$ItemReceiver;
        private final String read;
        public final getManufacturer write;

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "parcel");
            parcel.writeString(this.IconCompatParcelizer);
            parcel.writeString(this.read);
            parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
            parcel.writeParcelable(this.write, i);
            parcel.writeParcelable(this.MediaBrowserCompat$ItemReceiver, i);
        }

        public Builder(String str, String str2, String str3, getManufacturer getmanufacturer, C30661 r6) {
            onGetStartedClick.write((Object) str, "newFlag");
            onGetStartedClick.write((Object) str2, "prepaidCardType");
            onGetStartedClick.write((Object) str3, "cardImageUrl");
            onGetStartedClick.write((Object) getmanufacturer, "newFee");
            onGetStartedClick.write((Object) r6, "productType");
            this.IconCompatParcelizer = str;
            this.read = str2;
            this.MediaBrowserCompat$CustomActionResultReceiver = str3;
            this.write = getmanufacturer;
            this.MediaBrowserCompat$ItemReceiver = r6;
        }
    }

    public AutoValue_CrashlyticsReport_Session_Device(String str) {
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    /* renamed from: o.AutoValue_CrashlyticsReport_Session_Device$1 */
    public final class C30661 implements Parcelable {
        public static final Parcelable.Creator<C30661> CREATOR = new C3067xbf6f1037();
        public final String read;
        public final String write;

        public final int describeContents() {
            return 0;
        }

        public C30661(String str, String str2) {
            onGetStartedClick.write((Object) str, "code");
            onGetStartedClick.write((Object) str2, "description");
            this.read = str;
            this.write = str2;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C30661(android.os.Parcel r4) {
            /*
                r3 = this;
                java.lang.String r0 = "source"
                p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r0)
                java.lang.String r0 = "$this$readStringNonNull"
                p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r0)
                java.lang.String r1 = r4.readString()
                java.lang.String r2 = ""
                if (r1 != 0) goto L_0x0013
                r1 = r2
            L_0x0013:
                p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r0)
                java.lang.String r4 = r4.readString()
                if (r4 != 0) goto L_0x001d
                goto L_0x001e
            L_0x001d:
                r2 = r4
            L_0x001e:
                r3.<init>(r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.AutoValue_CrashlyticsReport_Session_Device.C30661.<init>(android.os.Parcel):void");
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "dest");
            parcel.writeString(this.read);
            parcel.writeString(this.write);
        }

        /* renamed from: o.AutoValue_CrashlyticsReport_Session_Device$1$write */
        public static final class write implements findFragmentByWho {
            private final /* synthetic */ GooglePlayServicesUtilLight MediaBrowserCompat$CustomActionResultReceiver;
            private final /* synthetic */ String write;

            private write() {
            }

            public /* synthetic */ write(GooglePlayServicesUtilLight googlePlayServicesUtilLight, String str) {
                this.MediaBrowserCompat$CustomActionResultReceiver = googlePlayServicesUtilLight;
                this.write = str;
            }

            public final Object IconCompatParcelizer(Object obj) {
                return this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.write, (PlacePhotoMetadataResult) obj);
            }
        }
    }
}

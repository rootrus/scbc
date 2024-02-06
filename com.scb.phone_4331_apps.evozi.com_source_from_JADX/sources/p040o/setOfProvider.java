package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.ComponentDiscovery;

/* renamed from: o.setOfProvider */
public final class setOfProvider implements Parcelable {
    public static final IconCompatParcelizer CREATOR = new IconCompatParcelizer((byte) 0);
    public final Double IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final ComponentFactory MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$MediaItem;
    public final ComponentDiscovery.C31871 MediaBrowserCompat$SearchResultReceiver;
    public final forContext MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    private final retrieve MediaSessionCompat$Token;
    public String ParcelableVolumeInfo;
    public final String RatingCompat;
    public final ComponentDiscovery.RegistrarNameRetriever read;
    public final Double write;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setOfProvider)) {
            return false;
        }
        setOfProvider setofprovider = (setOfProvider) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.ParcelableVolumeInfo, (Object) setofprovider.ParcelableVolumeInfo) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) setofprovider.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) setofprovider.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setofprovider.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setofprovider.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setofprovider.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) setofprovider.MediaSessionCompat$Token) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setofprovider.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setofprovider.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) setofprovider.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) setofprovider.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) setofprovider.RatingCompat);
    }

    public final int hashCode() {
        String str = this.ParcelableVolumeInfo;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        ComponentDiscovery.C31871 r2 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode2 = r2 != null ? r2.hashCode() : 0;
        forContext forcontext = this.MediaDescriptionCompat;
        int hashCode3 = forcontext != null ? forcontext.hashCode() : 0;
        Double d = this.write;
        int hashCode4 = d != null ? d.hashCode() : 0;
        Double d2 = this.IconCompatParcelizer;
        int hashCode5 = d2 != null ? d2.hashCode() : 0;
        ComponentDiscovery.RegistrarNameRetriever registrarNameRetriever = this.read;
        int hashCode6 = registrarNameRetriever != null ? registrarNameRetriever.hashCode() : 0;
        retrieve retrieve = this.MediaSessionCompat$Token;
        int hashCode7 = retrieve != null ? retrieve.hashCode() : 0;
        ComponentFactory componentFactory = this.MediaBrowserCompat$ItemReceiver;
        int hashCode8 = componentFactory != null ? componentFactory.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode9 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$MediaItem;
        int hashCode10 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaMetadataCompat;
        int hashCode11 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.RatingCompat;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CcSofReviewDisplay(transactionToken=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(", sender=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", receiver=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", amount=");
        sb.append(this.write);
        sb.append(", fee=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", ccsofInstallment=");
        sb.append(this.read);
        sb.append(", creditCardFullAmount=");
        sb.append(this.MediaSessionCompat$Token);
        sb.append(", merchantMetaData=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", email=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", remark=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", note=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", partnerSubType=");
        sb.append(this.RatingCompat);
        sb.append(")");
        return sb.toString();
    }

    public setOfProvider(String str, ComponentDiscovery.C31871 r3, forContext forcontext, Double d, Double d2, ComponentDiscovery.RegistrarNameRetriever registrarNameRetriever, retrieve retrieve, ComponentFactory componentFactory, String str2, String str3, String str4, String str5) {
        onGetStartedClick.write((Object) str, "transactionToken");
        onGetStartedClick.write((Object) str5, "partnerSubType");
        this.ParcelableVolumeInfo = str;
        this.MediaBrowserCompat$SearchResultReceiver = r3;
        this.MediaDescriptionCompat = forcontext;
        this.write = d;
        this.IconCompatParcelizer = d2;
        this.read = registrarNameRetriever;
        this.MediaSessionCompat$Token = retrieve;
        this.MediaBrowserCompat$ItemReceiver = componentFactory;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.MediaBrowserCompat$MediaItem = str3;
        this.MediaMetadataCompat = str4;
        this.RatingCompat = str5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public setOfProvider(android.os.Parcel r18) {
        /*
            r17 = this;
            r0 = r18
            java.lang.String r1 = "parcel"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r1 = "$this$readStringNonNull"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r2 = r18.readString()
            java.lang.String r3 = ""
            if (r2 != 0) goto L_0x0016
            r5 = r3
            goto L_0x0017
        L_0x0016:
            r5 = r2
        L_0x0017:
            java.lang.Class<o.ComponentDiscovery$1> r2 = p040o.ComponentDiscovery.C31871.class
            java.lang.ClassLoader r2 = r2.getClassLoader()
            android.os.Parcelable r2 = r0.readParcelable(r2)
            r6 = r2
            o.ComponentDiscovery$1 r6 = (p040o.ComponentDiscovery.C31871) r6
            java.lang.Class<o.forContext> r2 = p040o.forContext.class
            java.lang.ClassLoader r2 = r2.getClassLoader()
            android.os.Parcelable r2 = r0.readParcelable(r2)
            r7 = r2
            o.forContext r7 = (p040o.forContext) r7
            java.lang.Class r2 = java.lang.Double.TYPE
            java.lang.ClassLoader r2 = r2.getClassLoader()
            java.lang.Object r2 = r0.readValue(r2)
            boolean r4 = r2 instanceof java.lang.Double
            r8 = 0
            if (r4 != 0) goto L_0x0041
            r2 = r8
        L_0x0041:
            java.lang.Double r2 = (java.lang.Double) r2
            java.lang.Class r4 = java.lang.Double.TYPE
            java.lang.ClassLoader r4 = r4.getClassLoader()
            java.lang.Object r4 = r0.readValue(r4)
            boolean r9 = r4 instanceof java.lang.Double
            if (r9 != 0) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r8 = r4
        L_0x0053:
            r9 = r8
            java.lang.Double r9 = (java.lang.Double) r9
            java.lang.Class<o.ComponentDiscovery$RegistrarNameRetriever> r4 = p040o.ComponentDiscovery.RegistrarNameRetriever.class
            java.lang.ClassLoader r4 = r4.getClassLoader()
            android.os.Parcelable r4 = r0.readParcelable(r4)
            r10 = r4
            o.ComponentDiscovery$RegistrarNameRetriever r10 = (p040o.ComponentDiscovery.RegistrarNameRetriever) r10
            java.lang.Class<o.retrieve> r4 = p040o.retrieve.class
            java.lang.ClassLoader r4 = r4.getClassLoader()
            android.os.Parcelable r4 = r0.readParcelable(r4)
            r11 = r4
            o.retrieve r11 = (p040o.retrieve) r11
            java.lang.Class<o.ComponentFactory> r4 = p040o.ComponentFactory.class
            java.lang.ClassLoader r4 = r4.getClassLoader()
            android.os.Parcelable r4 = r0.readParcelable(r4)
            r12 = r4
            o.ComponentFactory r12 = (p040o.ComponentFactory) r12
            java.lang.String r13 = r18.readString()
            java.lang.String r14 = r18.readString()
            java.lang.String r15 = r18.readString()
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r0 = r18.readString()
            if (r0 != 0) goto L_0x0095
            r16 = r3
            goto L_0x0097
        L_0x0095:
            r16 = r0
        L_0x0097:
            r4 = r17
            r8 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setOfProvider.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.ParcelableVolumeInfo);
        parcel.writeParcelable(this.MediaBrowserCompat$SearchResultReceiver, i);
        parcel.writeParcelable(this.MediaDescriptionCompat, i);
        parcel.writeValue(this.write);
        parcel.writeValue(this.IconCompatParcelizer);
        parcel.writeParcelable(this.read, i);
        parcel.writeParcelable(this.MediaSessionCompat$Token, i);
        parcel.writeParcelable(this.MediaBrowserCompat$ItemReceiver, i);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.RatingCompat);
    }

    /* renamed from: o.setOfProvider$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements Parcelable.Creator<setOfProvider> {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "parcel");
            return new setOfProvider(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new setOfProvider[i];
        }
    }
}

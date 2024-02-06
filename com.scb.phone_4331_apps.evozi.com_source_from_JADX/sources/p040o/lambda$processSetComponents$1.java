package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p040o.ComponentDiscovery;

/* renamed from: o.lambda$processSetComponents$1 */
public final class lambda$processSetComponents$1 implements Parcelable {
    public static final C4937x33558e00 CREATOR = new C4937x33558e00((byte) 0);
    public String IconCompatParcelizer;
    public final ComponentDiscovery.MetadataRegistrarNameRetriever MediaBrowserCompat$CustomActionResultReceiver;
    public final getProvider MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$MediaItem;
    public final ComponentFactory MediaBrowserCompat$SearchResultReceiver;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public String MediaSessionCompat$ResultReceiverWrapper;
    public final String MediaSessionCompat$Token;
    public String ParcelableVolumeInfo;
    public final List<String> RatingCompat;
    public final retrieve read;
    public String write;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lambda$processSetComponents$1)) {
            return false;
        }
        lambda$processSetComponents$1 lambda_processsetcomponents_1 = (lambda$processSetComponents$1) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) lambda_processsetcomponents_1.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) lambda_processsetcomponents_1.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) lambda_processsetcomponents_1.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.ParcelableVolumeInfo, (Object) lambda_processsetcomponents_1.ParcelableVolumeInfo) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$ResultReceiverWrapper, (Object) lambda_processsetcomponents_1.MediaSessionCompat$ResultReceiverWrapper) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) lambda_processsetcomponents_1.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) lambda_processsetcomponents_1.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) lambda_processsetcomponents_1.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) lambda_processsetcomponents_1.MediaSessionCompat$Token) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) lambda_processsetcomponents_1.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) lambda_processsetcomponents_1.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) lambda_processsetcomponents_1.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) lambda_processsetcomponents_1.MediaBrowserCompat$SearchResultReceiver);
    }

    public final int hashCode() {
        ComponentDiscovery.MetadataRegistrarNameRetriever metadataRegistrarNameRetriever = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = metadataRegistrarNameRetriever != null ? metadataRegistrarNameRetriever.hashCode() : 0;
        String str = this.write;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.ParcelableVolumeInfo;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaSessionCompat$ResultReceiverWrapper;
        int hashCode5 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaMetadataCompat;
        int hashCode6 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaDescriptionCompat;
        int hashCode7 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaBrowserCompat$MediaItem;
        int hashCode8 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.MediaSessionCompat$Token;
        int hashCode9 = str8 != null ? str8.hashCode() : 0;
        List<String> list = this.RatingCompat;
        int hashCode10 = list != null ? list.hashCode() : 0;
        getProvider getprovider = this.MediaBrowserCompat$ItemReceiver;
        int hashCode11 = getprovider != null ? getprovider.hashCode() : 0;
        retrieve retrieve = this.read;
        int hashCode12 = retrieve != null ? retrieve.hashCode() : 0;
        ComponentFactory componentFactory = this.MediaBrowserCompat$SearchResultReceiver;
        if (componentFactory != null) {
            i = componentFactory.hashCode();
        }
        return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PurchaseSourceOfFundDisplay(creditCardInstallment=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", insAcctId=");
        sb.append(this.write);
        sb.append(", dataSource=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", policyNo=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(", payType=");
        sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
        sb.append(", partnerId=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", partnerName=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", partnerTransactionId=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", partnerType=");
        sb.append(this.MediaSessionCompat$Token);
        sb.append(", partnerSubType=");
        sb.append(this.RatingCompat);
        sb.append(", billPayment=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", creditCardFullAmount=");
        sb.append(this.read);
        sb.append(", merchantMetaData=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public lambda$processSetComponents$1(ComponentDiscovery.MetadataRegistrarNameRetriever metadataRegistrarNameRetriever, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List<String> list, getProvider getprovider, retrieve retrieve, ComponentFactory componentFactory) {
        onGetStartedClick.write((Object) str5, "partnerId");
        onGetStartedClick.write((Object) str6, "partnerName");
        onGetStartedClick.write((Object) str7, "partnerTransactionId");
        onGetStartedClick.write((Object) str8, "partnerType");
        onGetStartedClick.write((Object) list, "partnerSubType");
        this.MediaBrowserCompat$CustomActionResultReceiver = metadataRegistrarNameRetriever;
        this.write = str;
        this.IconCompatParcelizer = str2;
        this.ParcelableVolumeInfo = str3;
        this.MediaSessionCompat$ResultReceiverWrapper = str4;
        this.MediaMetadataCompat = str5;
        this.MediaDescriptionCompat = str6;
        this.MediaBrowserCompat$MediaItem = str7;
        this.MediaSessionCompat$Token = str8;
        this.RatingCompat = list;
        this.MediaBrowserCompat$ItemReceiver = getprovider;
        this.read = retrieve;
        this.MediaBrowserCompat$SearchResultReceiver = componentFactory;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public lambda$processSetComponents$1(android.os.Parcel r17) {
        /*
            r16 = this;
            r0 = r17
            java.lang.String r1 = "parcel"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.Class<o.ComponentDiscovery$MetadataRegistrarNameRetriever> r1 = p040o.ComponentDiscovery.MetadataRegistrarNameRetriever.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r1 = r0.readParcelable(r1)
            r3 = r1
            o.ComponentDiscovery$MetadataRegistrarNameRetriever r3 = (p040o.ComponentDiscovery.MetadataRegistrarNameRetriever) r3
            java.lang.String r4 = r17.readString()
            java.lang.String r5 = r17.readString()
            java.lang.String r6 = r17.readString()
            java.lang.String r7 = r17.readString()
            java.lang.String r1 = "$this$readStringNonNull"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r2 = r17.readString()
            java.lang.String r8 = ""
            if (r2 != 0) goto L_0x0033
            r9 = r8
            goto L_0x0034
        L_0x0033:
            r9 = r2
        L_0x0034:
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r2 = r17.readString()
            if (r2 != 0) goto L_0x003f
            r10 = r8
            goto L_0x0040
        L_0x003f:
            r10 = r2
        L_0x0040:
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r2 = r17.readString()
            if (r2 != 0) goto L_0x004b
            r11 = r8
            goto L_0x004c
        L_0x004b:
            r11 = r2
        L_0x004c:
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r1 = r17.readString()
            if (r1 != 0) goto L_0x0056
            r1 = r8
        L_0x0056:
            java.util.ArrayList r2 = r17.createStringArrayList()
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L_0x0062
            o.HmlNationalIdActivity r2 = p040o.HmlNationalIdActivity.IconCompatParcelizer
            java.util.List r2 = (java.util.List) r2
        L_0x0062:
            r12 = r2
            java.lang.Class<o.getProvider> r2 = p040o.getProvider.class
            java.lang.ClassLoader r2 = r2.getClassLoader()
            android.os.Parcelable r2 = r0.readParcelable(r2)
            r13 = r2
            o.getProvider r13 = (p040o.getProvider) r13
            java.lang.Class<o.retrieve> r2 = p040o.retrieve.class
            java.lang.ClassLoader r2 = r2.getClassLoader()
            android.os.Parcelable r2 = r0.readParcelable(r2)
            r14 = r2
            o.retrieve r14 = (p040o.retrieve) r14
            java.lang.Class<o.ComponentFactory> r2 = p040o.ComponentFactory.class
            java.lang.ClassLoader r2 = r2.getClassLoader()
            android.os.Parcelable r0 = r0.readParcelable(r2)
            r15 = r0
            o.ComponentFactory r15 = (p040o.ComponentFactory) r15
            r2 = r16
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.lambda$processSetComponents$1.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeParcelable(this.MediaBrowserCompat$CustomActionResultReceiver, i);
        parcel.writeString(this.write);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.ParcelableVolumeInfo);
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.MediaSessionCompat$Token);
        parcel.writeStringList(this.RatingCompat);
        parcel.writeParcelable(this.MediaBrowserCompat$ItemReceiver, i);
        parcel.writeParcelable(this.read, i);
        parcel.writeParcelable(this.MediaBrowserCompat$SearchResultReceiver, i);
    }
}

package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import org.bouncycastle.i18n.MessageBundle;

/* renamed from: o.MoreExecutors */
public final class MoreExecutors extends remainingCapacity {
    public String IconCompatParcelizer;
    public List<zzwj> MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public List<String> read;

    /* renamed from: o.MoreExecutors$1 */
    public final class C36611 implements Parcelable {
        public static final write CREATOR = new write((byte) 0);
        public final String IconCompatParcelizer;
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        private final double MediaBrowserCompat$ItemReceiver;
        public final String read;
        public final String write;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C36611)) {
                return false;
            }
            C36611 r5 = (C36611) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) r5.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) r5.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) r5.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) r5.MediaBrowserCompat$CustomActionResultReceiver) && Double.compare(this.MediaBrowserCompat$ItemReceiver, r5.MediaBrowserCompat$ItemReceiver) == 0;
        }

        public final int hashCode() {
            String str = this.read;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.write;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.IconCompatParcelizer;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (str4 != null) {
                i = str4.hashCode();
            }
            long doubleToLongBits = Double.doubleToLongBits(this.MediaBrowserCompat$ItemReceiver);
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i) * 31) + ((int) ((doubleToLongBits >>> 32) ^ doubleToLongBits));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("BankingDepositDisplay(title=");
            sb.append(this.read);
            sb.append(", amountString=");
            sb.append(this.write);
            sb.append(", accountName=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", accountNo=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", amount=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(")");
            return sb.toString();
        }

        public C36611(String str, String str2, String str3, String str4, double d) {
            onGetStartedClick.write((Object) str, MessageBundle.TITLE_ENTRY);
            onGetStartedClick.write((Object) str2, "amountString");
            onGetStartedClick.write((Object) str3, "accountName");
            onGetStartedClick.write((Object) str4, "accountNo");
            this.read = str;
            this.write = str2;
            this.IconCompatParcelizer = str3;
            this.MediaBrowserCompat$CustomActionResultReceiver = str4;
            this.MediaBrowserCompat$ItemReceiver = d;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C36611(android.os.Parcel r11) {
            /*
                r10 = this;
                java.lang.String r0 = "parcel"
                p040o.onGetStartedClick.write((java.lang.Object) r11, (java.lang.String) r0)
                java.lang.String r0 = "$this$readStringNonNull"
                p040o.onGetStartedClick.write((java.lang.Object) r11, (java.lang.String) r0)
                java.lang.String r1 = r11.readString()
                java.lang.String r2 = ""
                if (r1 != 0) goto L_0x0014
                r4 = r2
                goto L_0x0015
            L_0x0014:
                r4 = r1
            L_0x0015:
                p040o.onGetStartedClick.write((java.lang.Object) r11, (java.lang.String) r0)
                java.lang.String r1 = r11.readString()
                if (r1 != 0) goto L_0x0020
                r5 = r2
                goto L_0x0021
            L_0x0020:
                r5 = r1
            L_0x0021:
                p040o.onGetStartedClick.write((java.lang.Object) r11, (java.lang.String) r0)
                java.lang.String r1 = r11.readString()
                if (r1 != 0) goto L_0x002c
                r6 = r2
                goto L_0x002d
            L_0x002c:
                r6 = r1
            L_0x002d:
                p040o.onGetStartedClick.write((java.lang.Object) r11, (java.lang.String) r0)
                java.lang.String r0 = r11.readString()
                if (r0 != 0) goto L_0x0038
                r7 = r2
                goto L_0x0039
            L_0x0038:
                r7 = r0
            L_0x0039:
                double r8 = r11.readDouble()
                r3 = r10
                r3.<init>(r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.MoreExecutors.C36611.<init>(android.os.Parcel):void");
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "parcel");
            parcel.writeString(this.read);
            parcel.writeString(this.write);
            parcel.writeString(this.IconCompatParcelizer);
            parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
            parcel.writeDouble(this.MediaBrowserCompat$ItemReceiver);
        }

        /* renamed from: o.MoreExecutors$1$write */
        public static final class write implements Parcelable.Creator<C36611> {
            private write() {
            }

            public /* synthetic */ write(byte b) {
                this();
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                onGetStartedClick.write((Object) parcel, "parcel");
                return new C36611(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new C36611[i];
            }
        }
    }

    /* renamed from: o.MoreExecutors$SameThreadExecutorService */
    public final class SameThreadExecutorService implements Parcelable {
        public static final write CREATOR = new write((byte) 0);
        public final String IconCompatParcelizer;
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        public final String MediaBrowserCompat$MediaItem;
        public final String MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        private final String f2761x50fd9e4a;
        public final String MediaDescriptionCompat;
        public final String MediaMetadataCompat;
        public final String MediaSessionCompat$Token;
        public final String RatingCompat;
        public final String read;
        public final String write;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SameThreadExecutorService)) {
                return false;
            }
            SameThreadExecutorService sameThreadExecutorService = (SameThreadExecutorService) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) sameThreadExecutorService.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) sameThreadExecutorService.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) sameThreadExecutorService.MediaSessionCompat$Token) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) sameThreadExecutorService.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) sameThreadExecutorService.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) sameThreadExecutorService.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) sameThreadExecutorService.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) sameThreadExecutorService.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) sameThreadExecutorService.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.f2761x50fd9e4a, (Object) sameThreadExecutorService.f2761x50fd9e4a) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) sameThreadExecutorService.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) sameThreadExecutorService.MediaDescriptionCompat);
        }

        public final int hashCode() {
            String str = this.MediaMetadataCompat;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$MediaItem;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaSessionCompat$Token;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.RatingCompat;
            int hashCode4 = str4 != null ? str4.hashCode() : 0;
            String str5 = this.IconCompatParcelizer;
            int hashCode5 = str5 != null ? str5.hashCode() : 0;
            String str6 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode6 = str6 != null ? str6.hashCode() : 0;
            String str7 = this.read;
            int hashCode7 = str7 != null ? str7.hashCode() : 0;
            String str8 = this.write;
            int hashCode8 = str8 != null ? str8.hashCode() : 0;
            String str9 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode9 = str9 != null ? str9.hashCode() : 0;
            String str10 = this.f2761x50fd9e4a;
            int hashCode10 = str10 != null ? str10.hashCode() : 0;
            String str11 = this.MediaBrowserCompat$SearchResultReceiver;
            int hashCode11 = str11 != null ? str11.hashCode() : 0;
            String str12 = this.MediaDescriptionCompat;
            if (str12 != null) {
                i = str12.hashCode();
            }
            return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("BankingAgentSuccessDisplay(postingType=");
            sb.append(this.MediaMetadataCompat);
            sb.append(", title=");
            sb.append(this.MediaBrowserCompat$MediaItem);
            sb.append(", transactionDate=");
            sb.append(this.MediaSessionCompat$Token);
            sb.append(", refID=");
            sb.append(this.RatingCompat);
            sb.append(", accountName=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", accountNo=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", accountNoMasked=");
            sb.append(this.read);
            sb.append(", agentLogo=");
            sb.append(this.write);
            sb.append(", agentName=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", agentNo=");
            sb.append(this.f2761x50fd9e4a);
            sb.append(", amount=");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append(", branchNo=");
            sb.append(this.MediaDescriptionCompat);
            sb.append(")");
            return sb.toString();
        }

        public SameThreadExecutorService(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
            onGetStartedClick.write((Object) str, "postingType");
            onGetStartedClick.write((Object) str2, MessageBundle.TITLE_ENTRY);
            onGetStartedClick.write((Object) str3, "transactionDate");
            onGetStartedClick.write((Object) str4, "refID");
            onGetStartedClick.write((Object) str5, "accountName");
            onGetStartedClick.write((Object) str6, "accountNo");
            onGetStartedClick.write((Object) str7, "accountNoMasked");
            onGetStartedClick.write((Object) str8, "agentLogo");
            onGetStartedClick.write((Object) str9, "agentName");
            onGetStartedClick.write((Object) str10, "agentNo");
            onGetStartedClick.write((Object) str11, "amount");
            onGetStartedClick.write((Object) str12, "branchNo");
            this.MediaMetadataCompat = str;
            this.MediaBrowserCompat$MediaItem = str2;
            this.MediaSessionCompat$Token = str3;
            this.RatingCompat = str4;
            this.IconCompatParcelizer = str5;
            this.MediaBrowserCompat$ItemReceiver = str6;
            this.read = str7;
            this.write = str8;
            this.MediaBrowserCompat$CustomActionResultReceiver = str9;
            this.f2761x50fd9e4a = str10;
            this.MediaBrowserCompat$SearchResultReceiver = str11;
            this.MediaDescriptionCompat = str12;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public SameThreadExecutorService(android.os.Parcel r18) {
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
                p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                java.lang.String r2 = r18.readString()
                if (r2 != 0) goto L_0x0022
                r6 = r3
                goto L_0x0023
            L_0x0022:
                r6 = r2
            L_0x0023:
                p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                java.lang.String r2 = r18.readString()
                if (r2 != 0) goto L_0x002e
                r7 = r3
                goto L_0x002f
            L_0x002e:
                r7 = r2
            L_0x002f:
                p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                java.lang.String r2 = r18.readString()
                if (r2 != 0) goto L_0x003a
                r8 = r3
                goto L_0x003b
            L_0x003a:
                r8 = r2
            L_0x003b:
                p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                java.lang.String r2 = r18.readString()
                if (r2 != 0) goto L_0x0046
                r9 = r3
                goto L_0x0047
            L_0x0046:
                r9 = r2
            L_0x0047:
                p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                java.lang.String r2 = r18.readString()
                if (r2 != 0) goto L_0x0052
                r10 = r3
                goto L_0x0053
            L_0x0052:
                r10 = r2
            L_0x0053:
                p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                java.lang.String r2 = r18.readString()
                if (r2 != 0) goto L_0x005e
                r11 = r3
                goto L_0x005f
            L_0x005e:
                r11 = r2
            L_0x005f:
                p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                java.lang.String r2 = r18.readString()
                if (r2 != 0) goto L_0x006a
                r12 = r3
                goto L_0x006b
            L_0x006a:
                r12 = r2
            L_0x006b:
                p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                java.lang.String r2 = r18.readString()
                if (r2 != 0) goto L_0x0076
                r13 = r3
                goto L_0x0077
            L_0x0076:
                r13 = r2
            L_0x0077:
                p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                java.lang.String r2 = r18.readString()
                if (r2 != 0) goto L_0x0082
                r14 = r3
                goto L_0x0083
            L_0x0082:
                r14 = r2
            L_0x0083:
                p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                java.lang.String r2 = r18.readString()
                if (r2 != 0) goto L_0x008e
                r15 = r3
                goto L_0x008f
            L_0x008e:
                r15 = r2
            L_0x008f:
                p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                java.lang.String r0 = r18.readString()
                if (r0 != 0) goto L_0x009b
                r16 = r3
                goto L_0x009d
            L_0x009b:
                r16 = r0
            L_0x009d:
                r4 = r17
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.MoreExecutors.SameThreadExecutorService.<init>(android.os.Parcel):void");
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "parcel");
            parcel.writeString(this.MediaMetadataCompat);
            parcel.writeString(this.MediaBrowserCompat$MediaItem);
            parcel.writeString(this.MediaSessionCompat$Token);
            parcel.writeString(this.RatingCompat);
            parcel.writeString(this.IconCompatParcelizer);
            parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
            parcel.writeString(this.read);
            parcel.writeString(this.write);
            parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
            parcel.writeString(this.f2761x50fd9e4a);
            parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
            parcel.writeString(this.MediaDescriptionCompat);
        }

        /* renamed from: o.MoreExecutors$SameThreadExecutorService$write */
        public static final class write implements Parcelable.Creator<SameThreadExecutorService> {
            private write() {
            }

            public /* synthetic */ write(byte b) {
                this();
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                onGetStartedClick.write((Object) parcel, "parcel");
                return new SameThreadExecutorService(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SameThreadExecutorService[i];
            }
        }
    }

    public final String toString() {
        return this.IconCompatParcelizer;
    }
}

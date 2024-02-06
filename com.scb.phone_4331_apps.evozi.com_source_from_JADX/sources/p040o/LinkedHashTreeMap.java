package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.LinkedHashTreeMap */
public final class LinkedHashTreeMap {
    @SerializedName("categories")
    public final List<skipToEndOfBlockComment> IconCompatParcelizer;

    /* renamed from: o.LinkedHashTreeMap$1 */
    public final class C35681 {
        @SerializedName("currentAddress")
        public final String IconCompatParcelizer;
        @SerializedName("contactNumber")
        public final List<String> MediaBrowserCompat$CustomActionResultReceiver;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C35681)) {
                return false;
            }
            C35681 r3 = (C35681) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) r3.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) r3.IconCompatParcelizer);
        }

        public final int hashCode() {
            List<String> list = this.MediaBrowserCompat$CustomActionResultReceiver;
            int i = 0;
            int hashCode = list != null ? list.hashCode() : 0;
            String str = this.IconCompatParcelizer;
            if (str != null) {
                i = str.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("IdpContactInfoEntity(contactNumber=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", currentAddress=");
            sb.append(this.IconCompatParcelizer);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: o.LinkedHashTreeMap$AvlBuilder */
    public final class AvlBuilder {
        @SerializedName("shop")
        public final entrySet IconCompatParcelizer;
        @SerializedName("bankAccount")
        public final readEscapeCharacter MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("address")
        public final peekNumber MediaBrowserCompat$ItemReceiver;
        @SerializedName("walletStatus")
        public final String RatingCompat;
        @SerializedName("sortSequence")
        public final int read;
        @SerializedName("walletId")
        public final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AvlBuilder)) {
                return false;
            }
            AvlBuilder avlBuilder = (AvlBuilder) obj;
            return this.read == avlBuilder.read && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) avlBuilder.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) avlBuilder.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) avlBuilder.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) avlBuilder.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) avlBuilder.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final int hashCode() {
            int i = this.read;
            String str = this.write;
            int i2 = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.RatingCompat;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            entrySet entryset = this.IconCompatParcelizer;
            int hashCode3 = entryset != null ? entryset.hashCode() : 0;
            peekNumber peeknumber = this.MediaBrowserCompat$ItemReceiver;
            int hashCode4 = peeknumber != null ? peeknumber.hashCode() : 0;
            readEscapeCharacter readescapecharacter = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (readescapecharacter != null) {
                i2 = readescapecharacter.hashCode();
            }
            return (((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("WalletEntity(sortSequence=");
            sb.append(this.read);
            sb.append(", walletId=");
            sb.append(this.write);
            sb.append(", walletStatus=");
            sb.append(this.RatingCompat);
            sb.append(", shop=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", address=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", bankAccount=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: o.LinkedHashTreeMap$Node */
    public class Node {
        @SerializedName("detailImageURL")
        public String IconCompatParcelizer;
        @SerializedName("longDesc")
        public String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("code")
        public String MediaBrowserCompat$ItemReceiver;
        @SerializedName("subProductCount")
        public int MediaBrowserCompat$MediaItem;
        @SerializedName("shortDesc")
        public String MediaBrowserCompat$SearchResultReceiver;
        @SerializedName("sortSequence")

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        private int f2751x50fd9e4a;
        @SerializedName("name")
        public String MediaDescriptionCompat;
        @SerializedName("type")
        public String MediaMetadataCompat;
        @SerializedName("subSortSequence")
        private int MediaSessionCompat$Token;
        @SerializedName("productList")
        public List<Node> RatingCompat;
        @SerializedName("imageURL")
        public String read;
        @SerializedName("desc")
        public String write;
    }

    /* renamed from: o.LinkedHashTreeMap$AvlIterator */
    public final class AvlIterator {
        @SerializedName("remark")
        public final KeySet.C35691 read;

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof AvlIterator) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) ((AvlIterator) obj).read);
            }
            return true;
        }

        public final int hashCode() {
            KeySet.C35691 r0 = this.read;
            if (r0 != null) {
                return r0.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NdidRemark(remark=");
            sb.append(this.read);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: o.LinkedHashTreeMap$EntrySet */
    public final class EntrySet {
        @SerializedName("idpList")
        public final List<removeInternalByKey> write;

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof EntrySet) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) ((EntrySet) obj).write);
            }
            return true;
        }

        public final int hashCode() {
            List<removeInternalByKey> list = this.write;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("IdpListEntity(idpList=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof LinkedHashTreeMap) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) ((LinkedHashTreeMap) obj).IconCompatParcelizer);
        }
        return true;
    }

    public final int hashCode() {
        List<skipToEndOfBlockComment> list = this.IconCompatParcelizer;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MerchantCategoryEntity(categories=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: o.LinkedHashTreeMap$KeySet */
    public final class KeySet {
        @SerializedName("categoryList")
        public final List<LinkedTreeMapIterator> MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("notificationChannel")
        public final String MediaBrowserCompat$ItemReceiver;
        @SerializedName("channelEnabledFlag")
        public final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof KeySet)) {
                return false;
            }
            KeySet keySet = (KeySet) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) keySet.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) keySet.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) keySet.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$ItemReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.write;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            List<LinkedTreeMapIterator> list = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (list != null) {
                i = list.hashCode();
            }
            return (((hashCode * 31) + hashCode2) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NotificationChannelEntity(notificationChannel=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", channelEnabledFlag=");
            sb.append(this.write);
            sb.append(", categoryList=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        public KeySet(String str, String str2, List<LinkedTreeMapIterator> list) {
            onGetStartedClick.write((Object) str, "notificationChannel");
            onGetStartedClick.write((Object) str2, "channelEnabledFlag");
            this.MediaBrowserCompat$ItemReceiver = str;
            this.write = str2;
            this.MediaBrowserCompat$CustomActionResultReceiver = list;
        }
    }

    /* renamed from: o.LinkedHashTreeMap$LinkedTreeMapIterator */
    public final class LinkedTreeMapIterator {
        @SerializedName("categoryIcon")
        public final String IconCompatParcelizer;
        @SerializedName("category")
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("categoryColor")
        public final String MediaBrowserCompat$ItemReceiver;
        @SerializedName("sortSequence")
        public final String MediaBrowserCompat$MediaItem;
        @SerializedName("descriptionTH")
        public final String MediaBrowserCompat$SearchResultReceiver;
        @SerializedName("categoryEnabledFlag")
        public final String read;
        @SerializedName("descriptionEN")
        public final String write;

        private LinkedTreeMapIterator(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            onGetStartedClick.write((Object) str, "category");
            onGetStartedClick.write((Object) str7, "categoryEnabledFlag");
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
            this.MediaBrowserCompat$MediaItem = null;
            this.MediaBrowserCompat$SearchResultReceiver = null;
            this.write = null;
            this.MediaBrowserCompat$ItemReceiver = null;
            this.IconCompatParcelizer = null;
            this.read = str7;
        }

        public /* synthetic */ LinkedTreeMapIterator(String str, String str2) {
            this(str, (String) null, (String) null, (String) null, (String) null, (String) null, str2);
        }
    }
}

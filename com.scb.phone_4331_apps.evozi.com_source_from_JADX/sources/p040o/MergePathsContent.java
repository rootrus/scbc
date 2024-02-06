package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.MergePathsContent */
public class MergePathsContent {
    @SerializedName("fontColor")
    public String IconCompatParcelizer;
    @SerializedName("imagePath")
    public String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("thumbnailPath")
    public String read;
    @SerializedName("selectedFlag")
    public String write;

    /* renamed from: o.MergePathsContent$1 */
    public final class C36531 {
        @SerializedName("contact")
        public final IconCompatParcelizer IconCompatParcelizer;
        @SerializedName("businessExperience")
        public final write MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("applicationUuid")
        public final String MediaBrowserCompat$ItemReceiver;
        @SerializedName("productType")
        public final String MediaDescriptionCompat;
        @SerializedName("privilegedProfession")
        public final C3654x569b5c3d read;
        @SerializedName("businessName")
        public final String write;

        /* renamed from: o.MergePathsContent$1$IconCompatParcelizer */
        public static final class IconCompatParcelizer {
            @SerializedName("companyPhone")
            public final String IconCompatParcelizer;
            @SerializedName("businessAddress")
            public final PolystarContent write;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof IconCompatParcelizer)) {
                    return false;
                }
                IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
                return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) iconCompatParcelizer.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) iconCompatParcelizer.write);
            }

            public final int hashCode() {
                String str = this.IconCompatParcelizer;
                int i = 0;
                int hashCode = str != null ? str.hashCode() : 0;
                PolystarContent polystarContent = this.write;
                if (polystarContent != null) {
                    i = polystarContent.hashCode();
                }
                return (hashCode * 31) + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("Contact(companyPhone=");
                sb.append(this.IconCompatParcelizer);
                sb.append(", businessAddress=");
                sb.append(this.write);
                sb.append(")");
                return sb.toString();
            }
        }

        /* renamed from: o.MergePathsContent$1$write */
        public static final class write {
            @SerializedName("year")
            public final String IconCompatParcelizer;
            @SerializedName("month")
            public final String MediaBrowserCompat$CustomActionResultReceiver;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof write)) {
                    return false;
                }
                write write = (write) obj;
                return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) write.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) write.MediaBrowserCompat$CustomActionResultReceiver);
            }

            public final int hashCode() {
                String str = this.IconCompatParcelizer;
                int i = 0;
                int hashCode = str != null ? str.hashCode() : 0;
                String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (str2 != null) {
                    i = str2.hashCode();
                }
                return (hashCode * 31) + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("BusinessExperience(year=");
                sb.append(this.IconCompatParcelizer);
                sb.append(", month=");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                sb.append(")");
                return sb.toString();
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C36531)) {
                return false;
            }
            C36531 r3 = (C36531) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) r3.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) r3.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) r3.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) r3.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) r3.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) r3.MediaDescriptionCompat);
        }

        public final int hashCode() {
            String str = this.write;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            IconCompatParcelizer iconCompatParcelizer = this.IconCompatParcelizer;
            int hashCode2 = iconCompatParcelizer != null ? iconCompatParcelizer.hashCode() : 0;
            C3654x569b5c3d mergePathsContent$1$MediaBrowserCompat$CustomActionResultReceiver = this.read;
            int hashCode3 = mergePathsContent$1$MediaBrowserCompat$CustomActionResultReceiver != null ? mergePathsContent$1$MediaBrowserCompat$CustomActionResultReceiver.hashCode() : 0;
            write write2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode4 = write2 != null ? write2.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode5 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaDescriptionCompat;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("BusinessProfileDetailsEntity(businessName=");
            sb.append(this.write);
            sb.append(", contact=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", privilegedProfession=");
            sb.append(this.read);
            sb.append(", businessExperience=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", applicationUuid=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", productType=");
            sb.append(this.MediaDescriptionCompat);
            sb.append(")");
            return sb.toString();
        }
    }
}

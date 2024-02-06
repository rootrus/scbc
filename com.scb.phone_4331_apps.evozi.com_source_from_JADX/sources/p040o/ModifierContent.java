package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.ModifierContent */
public final class ModifierContent {
    @SerializedName("applicationUuid")
    private final String IconCompatParcelizer;
    @SerializedName("businessExperience")
    private final write MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("businessName")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("contact")
    private final read read;
    @SerializedName("privilegedProfession")
    private final ModifierContent$MediaBrowserCompat$ItemReceiver write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModifierContent)) {
            return false;
        }
        ModifierContent modifierContent = (ModifierContent) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) modifierContent.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) modifierContent.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) modifierContent.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) modifierContent.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) modifierContent.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        read read2 = this.read;
        int hashCode3 = read2 != null ? read2.hashCode() : 0;
        ModifierContent$MediaBrowserCompat$ItemReceiver modifierContent$MediaBrowserCompat$ItemReceiver = this.write;
        int hashCode4 = modifierContent$MediaBrowserCompat$ItemReceiver != null ? modifierContent$MediaBrowserCompat$ItemReceiver.hashCode() : 0;
        write write2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (write2 != null) {
            i = write2.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BusinessProfileDetailsRequest(applicationUuid=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", businessName=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", contact=");
        sb.append(this.read);
        sb.append(", privilegedProfession=");
        sb.append(this.write);
        sb.append(", businessExperience=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public ModifierContent(String str, String str2, read read2, ModifierContent$MediaBrowserCompat$ItemReceiver modifierContent$MediaBrowserCompat$ItemReceiver, write write2) {
        onGetStartedClick.write((Object) str, "applicationUuid");
        onGetStartedClick.write((Object) str2, "businessName");
        onGetStartedClick.write((Object) read2, "contact");
        onGetStartedClick.write((Object) modifierContent$MediaBrowserCompat$ItemReceiver, "privilegedProfession");
        onGetStartedClick.write((Object) write2, "businessExperience");
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.read = read2;
        this.write = modifierContent$MediaBrowserCompat$ItemReceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = write2;
    }

    /* renamed from: o.ModifierContent$read */
    public static final class read {
        @SerializedName("businessAddress")
        private final PolystarContent IconCompatParcelizer;
        @SerializedName("companyPhone")
        private final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof read)) {
                return false;
            }
            read read = (read) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) read.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) read.IconCompatParcelizer);
        }

        public final int hashCode() {
            String str = this.write;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            PolystarContent polystarContent = this.IconCompatParcelizer;
            if (polystarContent != null) {
                i = polystarContent.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Contact(companyPhone=");
            sb.append(this.write);
            sb.append(", businessAddress=");
            sb.append(this.IconCompatParcelizer);
            sb.append(")");
            return sb.toString();
        }

        public read(String str, PolystarContent polystarContent) {
            onGetStartedClick.write((Object) str, "companyPhone");
            onGetStartedClick.write((Object) polystarContent, "businessAddress");
            this.write = str;
            this.IconCompatParcelizer = polystarContent;
        }
    }

    /* renamed from: o.ModifierContent$write */
    public static final class write {
        @SerializedName("year")
        private final int IconCompatParcelizer;
        @SerializedName("month")
        private final int MediaBrowserCompat$ItemReceiver;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof write)) {
                return false;
            }
            write write = (write) obj;
            return this.IconCompatParcelizer == write.IconCompatParcelizer && this.MediaBrowserCompat$ItemReceiver == write.MediaBrowserCompat$ItemReceiver;
        }

        public final int hashCode() {
            return (this.IconCompatParcelizer * 31) + this.MediaBrowserCompat$ItemReceiver;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("BusinessExperience(year=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", month=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(")");
            return sb.toString();
        }

        public write(int i, int i2) {
            this.IconCompatParcelizer = i;
            this.MediaBrowserCompat$ItemReceiver = i2;
        }
    }
}

package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Objects;

/* renamed from: o.TextLayer */
public class TextLayer {
    @SerializedName("businessTypes")
    public List<codePointToString> MediaBrowserCompat$CustomActionResultReceiver;

    /* renamed from: o.TextLayer$1 */
    public final class C38571 {
        @SerializedName("name")
        public final String IconCompatParcelizer;
        @SerializedName("documentId")
        public final String MediaBrowserCompat$ItemReceiver;
        @SerializedName("nationFlag")
        public final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C38571)) {
                return false;
            }
            C38571 r3 = (C38571) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) r3.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) r3.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) r3.MediaBrowserCompat$ItemReceiver);
        }

        public final int hashCode() {
            String str = this.IconCompatParcelizer;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.write;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaBrowserCompat$ItemReceiver;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return (((hashCode * 31) + hashCode2) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SpouseInfoReviewEntity(name=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", nationFlag=");
            sb.append(this.write);
            sb.append(", documentId=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: o.TextLayer$2 */
    public final class C38582 {
        @SerializedName("name")
        public final String MediaBrowserCompat$ItemReceiver;
        @SerializedName("investmentType")
        public final String read;
        @SerializedName("totalScore")
        public final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C38582)) {
                return false;
            }
            C38582 r3 = (C38582) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) r3.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) r3.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) r3.read);
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$ItemReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.write;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.read;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return (((hashCode * 31) + hashCode2) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SuitabilityAssessmentResultEntity(name=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", totalScore=");
            sb.append(this.write);
            sb.append(", investmentType=");
            sb.append(this.read);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: o.TextLayer$3 */
    public final class C38593 {
        @SerializedName("selectedFlag")
        public final String IconCompatParcelizer;
        @SerializedName("choice")
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("score")
        public final String MediaBrowserCompat$ItemReceiver;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C38593)) {
                return false;
            }
            C38593 r3 = (C38593) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) r3.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) r3.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) r3.MediaBrowserCompat$ItemReceiver);
        }

        public final int hashCode() {
            String str = this.IconCompatParcelizer;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaBrowserCompat$ItemReceiver;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return (((hashCode * 31) + hashCode2) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AnswerEntity(selectedFlag=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", choice=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", score=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(")");
            return sb.toString();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.MediaBrowserCompat$CustomActionResultReceiver, ((TextLayer) obj).MediaBrowserCompat$CustomActionResultReceiver);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.MediaBrowserCompat$CustomActionResultReceiver});
    }
}

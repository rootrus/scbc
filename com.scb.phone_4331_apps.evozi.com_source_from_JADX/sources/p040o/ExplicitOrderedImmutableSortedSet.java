package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p040o.EvictionListeners;

/* renamed from: o.ExplicitOrderedImmutableSortedSet */
public final class ExplicitOrderedImmutableSortedSet {
    @SerializedName("answerSection1")
    private final List<EvictionListeners.C97301.C33341> MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("answerSection2")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("answerSection3")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExplicitOrderedImmutableSortedSet)) {
            return false;
        }
        ExplicitOrderedImmutableSortedSet explicitOrderedImmutableSortedSet = (ExplicitOrderedImmutableSortedSet) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) explicitOrderedImmutableSortedSet.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) explicitOrderedImmutableSortedSet.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) explicitOrderedImmutableSortedSet.write);
    }

    public final int hashCode() {
        List<EvictionListeners.C97301.C33341> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        String str = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SuitabilitiesConfirmationRequest(answerSection1=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", answerSection2=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", answerSection3=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: o.ExplicitOrderedImmutableSortedSet$SerializedForm */
    public final class SerializedForm {
        @SerializedName("binNumber")
        private final String read;

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof SerializedForm) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) ((SerializedForm) obj).read);
            }
            return true;
        }

        public final int hashCode() {
            String str = this.read;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PreAuthorizationRequest(binNumber=");
            sb.append(this.read);
            sb.append(")");
            return sb.toString();
        }

        public SerializedForm(String str) {
            onGetStartedClick.write((Object) str, "binNumber");
            this.read = str;
        }
    }

    public ExplicitOrderedImmutableSortedSet(List<EvictionListeners.C97301.C33341> list, String str, String str2) {
        onGetStartedClick.write((Object) list, "answerSection1");
        onGetStartedClick.write((Object) str, "answerSection2");
        onGetStartedClick.write((Object) str2, "answerSection3");
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
        this.MediaBrowserCompat$ItemReceiver = str;
        this.write = str2;
    }
}

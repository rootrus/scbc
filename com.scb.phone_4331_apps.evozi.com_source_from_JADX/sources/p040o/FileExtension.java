package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.FileExtension */
public final class FileExtension {
    @SerializedName("questions")
    public final List<filenameForUrl> MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("sumQuestions")
    public final List<NetworkCache> write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileExtension)) {
            return false;
        }
        FileExtension fileExtension = (FileExtension) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) fileExtension.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) fileExtension.write);
    }

    public final int hashCode() {
        List<filenameForUrl> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        List<NetworkCache> list2 = this.write;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SuitabilitiesEntity(questions=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", sumQuestions=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}

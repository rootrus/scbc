package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.zzws */
public class zzws {
    @SerializedName("refreshCacheOnResumeInMinutes")
    public long write;

    public /* synthetic */ zzws() {
    }

    public zzws(long j) {
        this.write = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (this.write != ((zzws) obj).write) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.write;
        return (int) (j ^ (j >>> 32));
    }
}

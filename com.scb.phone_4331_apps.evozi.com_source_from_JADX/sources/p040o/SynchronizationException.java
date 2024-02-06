package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.SynchronizationException */
public class SynchronizationException {
    @SerializedName("amount")
    public String IconCompatParcelizer;
    @SerializedName("recipientId")
    public long read;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SynchronizationException synchronizationException = (SynchronizationException) obj;
        if (this.read != synchronizationException.read) {
            return false;
        }
        String str = this.IconCompatParcelizer;
        String str2 = synchronizationException.IconCompatParcelizer;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.IconCompatParcelizer;
        int hashCode = str != null ? str.hashCode() : 0;
        long j = this.read;
        return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
    }
}

package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getSkew */
public final class getSkew {
    @SerializedName("skipDocumentUploadFlag")
    private final int write;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof getSkew) && this.write == ((getSkew) obj).write;
        }
        return true;
    }

    public final int hashCode() {
        return this.write;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UpdateOccupationEntity(skipDocumentUploadFlag=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}

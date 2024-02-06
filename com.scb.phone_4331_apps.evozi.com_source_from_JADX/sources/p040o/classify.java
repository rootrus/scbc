package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.classify */
public final class classify {
    @SerializedName("tcAcceptVersion")
    private final int IconCompatParcelizer;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof classify) && this.IconCompatParcelizer == ((classify) obj).IconCompatParcelizer;
        }
        return true;
    }

    public final int hashCode() {
        return this.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BankingAgentTcRequest(tcAcceptVersion=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public classify(int i) {
        this.IconCompatParcelizer = i;
    }
}

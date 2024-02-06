package p040o;

import java.io.Serializable;
import java.security.Principal;

/* renamed from: o.PromptPayOtpActivity */
public final class PromptPayOtpActivity implements Principal, Serializable {
    private final String read;

    public PromptPayOtpActivity(String str) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(str, "User name");
        this.read = str;
    }

    public final String getName() {
        return this.read;
    }

    public final int hashCode() {
        String str = this.read;
        return (str != null ? str.hashCode() : 0) + 629;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PromptPayOtpActivity) {
            String str = this.read;
            String str2 = ((PromptPayOtpActivity) obj).read;
            if (str == null ? str2 == null : str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[principal: ");
        sb.append(this.read);
        sb.append("]");
        return sb.toString();
    }
}

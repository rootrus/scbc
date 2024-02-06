package org.jmrtd.protocol;

import java.io.Serializable;
import org.jmrtd.BACKeySpec;

public class BACResult implements Serializable {
    private static final long serialVersionUID = -7114911372181772099L;
    private BACKeySpec bacKey;
    private SecureMessagingWrapper wrapper;

    public BACResult(SecureMessagingWrapper secureMessagingWrapper) {
        this((BACKeySpec) null, secureMessagingWrapper);
    }

    public BACResult(BACKeySpec bACKeySpec, SecureMessagingWrapper secureMessagingWrapper) {
        this.bacKey = bACKeySpec;
        this.wrapper = secureMessagingWrapper;
    }

    public BACKeySpec getBACKey() {
        return this.bacKey;
    }

    public SecureMessagingWrapper getWrapper() {
        return this.wrapper;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("BACResult [bacKey: ");
        sb2.append(this.bacKey);
        sb.append(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(", wrapper: ");
        sb3.append(this.wrapper);
        sb.append(sb3.toString());
        sb.append("]");
        return sb.toString();
    }

    public int hashCode() {
        BACKeySpec bACKeySpec = this.bacKey;
        int i = 0;
        int hashCode = bACKeySpec == null ? 0 : bACKeySpec.hashCode();
        SecureMessagingWrapper secureMessagingWrapper = this.wrapper;
        if (secureMessagingWrapper != null) {
            i = secureMessagingWrapper.hashCode();
        }
        return ((hashCode + 1303377669) * 1234567891) + i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BACResult bACResult = (BACResult) obj;
        BACKeySpec bACKeySpec = this.bacKey;
        if (bACKeySpec == null) {
            if (bACResult.bacKey != null) {
                return false;
            }
        } else if (!bACKeySpec.equals(bACResult.bacKey)) {
            return false;
        }
        SecureMessagingWrapper secureMessagingWrapper = this.wrapper;
        if (secureMessagingWrapper == null) {
            if (bACResult.wrapper != null) {
                return false;
            }
        } else if (!secureMessagingWrapper.equals(bACResult.wrapper)) {
            return false;
        }
        return true;
    }
}

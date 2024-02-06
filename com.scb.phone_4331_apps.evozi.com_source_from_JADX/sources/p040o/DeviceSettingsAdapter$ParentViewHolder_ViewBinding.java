package p040o;

import java.io.Serializable;

/* renamed from: o.DeviceSettingsAdapter$ParentViewHolder_ViewBinding */
public final class DeviceSettingsAdapter$ParentViewHolder_ViewBinding implements DonationsItemListAdapter$DonationsCardViewHolder_ViewBinding, Serializable {
    private final byte[] MediaBrowserCompat$ItemReceiver;

    public DeviceSettingsAdapter$ParentViewHolder_ViewBinding() {
        this.MediaBrowserCompat$ItemReceiver = new byte[5];
    }

    public DeviceSettingsAdapter$ParentViewHolder_ViewBinding(byte[] bArr) {
        if (bArr.length == 5) {
            byte[] bArr2 = (byte[]) bArr.clone();
            this.MediaBrowserCompat$ItemReceiver = bArr2;
            bArr2[0] = (byte) (bArr2[0] & -193);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("byte array length must be 5, was ");
        sb.append(bArr.length);
        throw new IllegalArgumentException(sb.toString());
    }

    public final byte[] read() {
        return (byte[]) this.MediaBrowserCompat$ItemReceiver.clone();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 37; i++) {
            if (i < 0 || i > 37) {
                throw new ArrayIndexOutOfBoundsException(i);
            }
            byte[] bArr = this.MediaBrowserCompat$ItemReceiver;
            if (((bArr[(bArr.length - 1) - (i >> 3)] >> (i & 7)) & 1) == 1) {
                if (i < 0 || i > 37) {
                    throw new ArrayIndexOutOfBoundsException(i);
                }
                if (i >= 33) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("W-DG");
                    sb2.append(54 - i);
                    str = sb2.toString();
                } else if (i > 28) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("RFU-");
                    sb3.append(i);
                    str = sb3.toString();
                } else if (i >= 8) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("R-DG");
                    sb4.append((i - 8) + 1);
                    str = sb4.toString();
                } else {
                    switch (i) {
                        case 0:
                            str = "Age Verification";
                            break;
                        case 1:
                            str = "Community ID Verification";
                            break;
                        case 2:
                            str = "Restricted Identification";
                            break;
                        case 3:
                            str = "Privileged Terminal";
                            break;
                        case 4:
                            str = "CAN Allowed";
                            break;
                        case 5:
                            str = "PIN Management";
                            break;
                        case 6:
                            str = "Install Certificate";
                            break;
                        case 7:
                            str = "Install Qualified Certificate";
                            break;
                        default:
                            throw new IllegalStateException();
                    }
                }
                sb.append(str);
                sb.append(", ");
            }
        }
        if (sb.length() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }
        return sb.toString();
    }
}

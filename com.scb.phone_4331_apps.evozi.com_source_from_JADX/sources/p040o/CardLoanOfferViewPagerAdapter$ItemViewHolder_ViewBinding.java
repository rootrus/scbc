package p040o;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;

/* renamed from: o.CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding */
public abstract class CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding implements Serializable {
    public static final String read = System.getProperty("line.separator");
    private DeviceSettingsAdapter$ParentViewHolder MediaBrowserCompat$CustomActionResultReceiver;
    private final EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder write;

    /* access modifiers changed from: protected */
    public abstract int read(DataOutputStream dataOutputStream) throws IOException;

    public CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder easycashLoanTrackAdapter$LoanInfoHeaderViewHolder) {
        this.write = easycashLoanTrackAdapter$LoanInfoHeaderViewHolder;
    }

    public final EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder MediaBrowserCompat$CustomActionResultReceiver() {
        return this.write;
    }

    public final DeviceSettingsAdapter$ParentViewHolder read() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final void IconCompatParcelizer(DeviceSettingsAdapter$ParentViewHolder deviceSettingsAdapter$ParentViewHolder) {
        this.MediaBrowserCompat$CustomActionResultReceiver = deviceSettingsAdapter$ParentViewHolder;
    }

    protected static byte[] MediaBrowserCompat$ItemReceiver(int i) {
        int i2 = i > 127 ? i > 255 ? 2 : 1 : 0;
        ByteBuffer allocate = ByteBuffer.allocate(i2 + 1);
        if (i2 == 0) {
            allocate.put(0, (byte) i);
        } else {
            allocate.put(0, (byte) (i2 + 128));
            if (i2 == 1) {
                allocate.put(1, (byte) i);
            } else {
                allocate.putShort(1, (short) i);
            }
        }
        return allocate.array();
    }

    public static int IconCompatParcelizer(DataInputStream dataInputStream) throws IOException {
        int read2 = dataInputStream.read();
        if (read2 <= 127) {
            return read2;
        }
        if ((read2 & 15) == 1) {
            return dataInputStream.readUnsignedByte();
        }
        return dataInputStream.readShort();
    }

    protected static byte[] read(Integer num) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(num.intValue());
        return read(allocate.array());
    }

    protected static byte[] read(byte[] bArr) {
        int i = 0;
        boolean z = false;
        while (i < bArr.length) {
            z = bArr[i] != 0;
            if (z) {
                break;
            }
            i++;
        }
        if (z) {
            byte[] bArr2 = new byte[(bArr.length - i)];
            System.arraycopy(bArr, i, bArr2, 0, bArr.length - i);
            return bArr2;
        }
        return new byte[]{0};
    }

    public String MediaBrowserCompat$ItemReceiver(String str) {
        return write(str, true);
    }

    public String write(String str, boolean z) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        if (z) {
            stringBuffer.append(Integer.toHexString(this.write.value));
            stringBuffer.append(' ');
        }
        stringBuffer.append(this.write.name());
        stringBuffer.append("  ");
        return stringBuffer.toString();
    }
}

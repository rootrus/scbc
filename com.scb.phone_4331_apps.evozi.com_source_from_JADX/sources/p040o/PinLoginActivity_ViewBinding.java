package p040o;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* renamed from: o.PinLoginActivity_ViewBinding */
public class PinLoginActivity_ViewBinding implements Serializable, Comparable<PinLoginActivity_ViewBinding> {
    private static char[] IconCompatParcelizer = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final PinLoginActivity_ViewBinding MediaBrowserCompat$ItemReceiver = new PinLoginActivity_ViewBinding((byte[]) new byte[0].clone());
    public transient String MediaBrowserCompat$CustomActionResultReceiver;
    private transient int read;
    public final byte[] write;

    public /* synthetic */ int compareTo(Object obj) {
        PinLoginActivity_ViewBinding pinLoginActivity_ViewBinding = (PinLoginActivity_ViewBinding) obj;
        int length = this.write.length;
        int length2 = pinLoginActivity_ViewBinding.write.length;
        int min = Math.min(length, length2);
        int i = 0;
        while (i < min) {
            byte b = this.write[i] & 255;
            byte b2 = pinLoginActivity_ViewBinding.write[i] & 255;
            if (b == b2) {
                i++;
            } else if (b >= b2) {
                return 1;
            } else {
                return -1;
            }
        }
        if (length == length2) {
            return 0;
        }
        if (length >= length2) {
            return 1;
        }
        return -1;
    }

    PinLoginActivity_ViewBinding(byte[] bArr) {
        this.write = bArr;
    }

    public static PinLoginActivity_ViewBinding MediaBrowserCompat$ItemReceiver(byte... bArr) {
        if (bArr != null) {
            return new PinLoginActivity_ViewBinding((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public static PinLoginActivity_ViewBinding MediaBrowserCompat$CustomActionResultReceiver(String str) {
        if (str != null) {
            PinLoginActivity_ViewBinding pinLoginActivity_ViewBinding = new PinLoginActivity_ViewBinding(str.getBytes(ModifyQuickTopUpActivity.MediaBrowserCompat$ItemReceiver));
            pinLoginActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver = str;
            return pinLoginActivity_ViewBinding;
        }
        throw new IllegalArgumentException("s == null");
    }

    private PinLoginActivity_ViewBinding IconCompatParcelizer(String str) {
        try {
            byte[] digest = MessageDigest.getInstance(str).digest(this.write);
            if (digest != null) {
                return new PinLoginActivity_ViewBinding((byte[]) digest.clone());
            }
            throw new IllegalArgumentException("data == null");
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public static PinLoginActivity_ViewBinding write(String str) {
        if (str != null) {
            byte[] IconCompatParcelizer2 = SetupQuickBalanceActivity.IconCompatParcelizer(str);
            if (IconCompatParcelizer2 != null) {
                return new PinLoginActivity_ViewBinding(IconCompatParcelizer2);
            }
            return null;
        }
        throw new IllegalArgumentException("base64 == null");
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver() {
        byte[] bArr = this.write;
        char[] cArr = new char[(bArr.length << 1)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = IconCompatParcelizer;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public final PinLoginActivity_ViewBinding IconCompatParcelizer() {
        int i = 0;
        while (true) {
            byte[] bArr = this.write;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b < 65 || b > 90) {
                i++;
            } else {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b2 = bArr2[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArr2[i2] = (byte) (b2 + 32);
                    }
                }
                return new PinLoginActivity_ViewBinding(bArr2);
            }
        }
    }

    public final byte[] write() {
        return (byte[]) this.write.clone();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PinLoginActivity_ViewBinding) {
            byte[] bArr = ((PinLoginActivity_ViewBinding) obj).write;
            int length = bArr.length;
            byte[] bArr2 = this.write;
            if (length == bArr2.length) {
                int length2 = bArr2.length;
                if (bArr.length - length2 >= 0 && bArr2.length - length2 >= 0 && ModifyQuickTopUpActivity.read(bArr, 0, bArr2, 0, length2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.read;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.write);
        this.read = hashCode;
        return hashCode;
    }

    public String toString() {
        byte[] bArr = this.write;
        if (bArr.length == 0) {
            return "ByteString[size=0]";
        }
        if (bArr.length <= 16) {
            return String.format("ByteString[size=%s data=%s]", new Object[]{Integer.valueOf(bArr.length), MediaBrowserCompat$CustomActionResultReceiver()});
        }
        return String.format("ByteString[size=%s md5=%s]", new Object[]{Integer.valueOf(bArr.length), IconCompatParcelizer("MD5").MediaBrowserCompat$CustomActionResultReceiver()});
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        int readInt = objectInputStream.readInt();
        if (objectInputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (readInt >= 0) {
            byte[] bArr = new byte[readInt];
            int i = 0;
            while (i < readInt) {
                int read2 = objectInputStream.read(bArr, i, readInt - i);
                if (read2 != -1) {
                    i += read2;
                } else {
                    throw new EOFException();
                }
            }
            PinLoginActivity_ViewBinding pinLoginActivity_ViewBinding = new PinLoginActivity_ViewBinding(bArr);
            try {
                Field declaredField = PinLoginActivity_ViewBinding.class.getDeclaredField("write");
                declaredField.setAccessible(true);
                declaredField.set(this, pinLoginActivity_ViewBinding.write);
            } catch (NoSuchFieldException unused) {
                throw new AssertionError();
            } catch (IllegalAccessException unused2) {
                throw new AssertionError();
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(readInt);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.write.length);
        objectOutputStream.write(this.write);
    }
}

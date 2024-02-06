package p040o;

/* renamed from: o.MerchantWalletOutgoingTransactionAdapter$ChildViewHolder_ViewBinding */
public final class C6958xd50139e8 {
    public Double IconCompatParcelizer;
    public Integer MediaBrowserCompat$CustomActionResultReceiver;
    public Integer MediaBrowserCompat$ItemReceiver;
    public String read;
    public String write;

    public static boolean write(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return true;
        }
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        for (int i = 0; i != bArr.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int read(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ bArr[length];
        }
    }
}

package p040o;

/* renamed from: o.EasycashProductAdapter$LoanProductViewHolder */
public final class EasycashProductAdapter$LoanProductViewHolder {
    private static final char[] IconCompatParcelizer = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String write(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            byte b2 = b & 255;
            char[] cArr = IconCompatParcelizer;
            char c = cArr[(b2 >> 4) & 15];
            char c2 = cArr[b2 & 15];
            StringBuilder sb = new StringBuilder();
            sb.append(Character.toString(c));
            sb.append(c2);
            stringBuffer.append(sb.toString());
        }
        return stringBuffer.toString();
    }
}

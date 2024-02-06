package com.google.android.gms.internal.vision;

import java.nio.ByteBuffer;
import org.jmrtd.PassportService;

abstract class zziy {
    zziy() {
    }

    /* access modifiers changed from: package-private */
    public abstract int zzb(int i, byte[] bArr, int i2, int i3);

    /* access modifiers changed from: package-private */
    public abstract int zzb(CharSequence charSequence, byte[] bArr, int i, int i2);

    /* access modifiers changed from: package-private */
    public abstract void zzb(CharSequence charSequence, ByteBuffer byteBuffer);

    /* access modifiers changed from: package-private */
    public abstract String zzi(byte[] bArr, int i, int i2) throws zzgf;

    /* access modifiers changed from: package-private */
    public final boolean zzg(byte[] bArr, int i, int i2) {
        return zzb(0, bArr, i, i2) == 0;
    }

    static void zzc(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i;
        int i2;
        int length = charSequence.length();
        int position = byteBuffer.position();
        int i3 = 0;
        while (i3 < length) {
            try {
                char charAt = charSequence.charAt(i3);
                if (charAt >= 128) {
                    break;
                }
                byteBuffer.put(position + i3, (byte) charAt);
                i3++;
            } catch (IndexOutOfBoundsException unused) {
                i = position;
                int position2 = byteBuffer.position();
                int max = Math.max(i3, (i - byteBuffer.position()) + 1);
                char charAt2 = charSequence.charAt(i3);
                StringBuilder sb = new StringBuilder(37);
                sb.append("Failed writing ");
                sb.append(charAt2);
                sb.append(" at index ");
                sb.append(position2 + max);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
        }
        if (i3 == length) {
            byteBuffer.position(position + i3);
            return;
        }
        position += i3;
        while (i3 < length) {
            char charAt3 = charSequence.charAt(i3);
            if (charAt3 < 128) {
                byteBuffer.put(position, (byte) charAt3);
            } else if (charAt3 < 2048) {
                i2 = position + 1;
                try {
                    byteBuffer.put(position, (byte) ((charAt3 >>> 6) | 192));
                    byteBuffer.put(i2, (byte) ((charAt3 & '?') | 128));
                    position = i2;
                } catch (IndexOutOfBoundsException unused2) {
                    i = i2;
                    int position22 = byteBuffer.position();
                    int max2 = Math.max(i3, (i - byteBuffer.position()) + 1);
                    char charAt22 = charSequence.charAt(i3);
                    StringBuilder sb2 = new StringBuilder(37);
                    sb2.append("Failed writing ");
                    sb2.append(charAt22);
                    sb2.append(" at index ");
                    sb2.append(position22 + max2);
                    throw new ArrayIndexOutOfBoundsException(sb2.toString());
                }
            } else if (charAt3 < 55296 || 57343 < charAt3) {
                i2 = position + 1;
                byteBuffer.put(position, (byte) ((charAt3 >>> 12) | PassportService.DEFAULT_MAX_BLOCKSIZE));
                position = i2 + 1;
                byteBuffer.put(i2, (byte) (((charAt3 >>> 6) & 63) | 128));
                byteBuffer.put(position, (byte) ((charAt3 & '?') | 128));
            } else {
                int i4 = i3 + 1;
                if (i4 != length) {
                    try {
                        char charAt4 = charSequence.charAt(i4);
                        if (Character.isSurrogatePair(charAt3, charAt4)) {
                            int codePoint = Character.toCodePoint(charAt3, charAt4);
                            i = position + 1;
                            try {
                                byteBuffer.put(position, (byte) ((codePoint >>> 18) | 240));
                                position = i + 1;
                                byteBuffer.put(i, (byte) (((codePoint >>> 12) & 63) | 128));
                                i = position + 1;
                                byteBuffer.put(position, (byte) (((codePoint >>> 6) & 63) | 128));
                                byteBuffer.put(i, (byte) ((codePoint & 63) | 128));
                                position = i;
                                i3 = i4;
                            } catch (IndexOutOfBoundsException unused3) {
                                i3 = i4;
                                int position222 = byteBuffer.position();
                                int max22 = Math.max(i3, (i - byteBuffer.position()) + 1);
                                char charAt222 = charSequence.charAt(i3);
                                StringBuilder sb22 = new StringBuilder(37);
                                sb22.append("Failed writing ");
                                sb22.append(charAt222);
                                sb22.append(" at index ");
                                sb22.append(position222 + max22);
                                throw new ArrayIndexOutOfBoundsException(sb22.toString());
                            }
                        } else {
                            i3 = i4;
                        }
                    } catch (IndexOutOfBoundsException unused4) {
                        i = position;
                        i3 = i4;
                        int position2222 = byteBuffer.position();
                        int max222 = Math.max(i3, (i - byteBuffer.position()) + 1);
                        char charAt2222 = charSequence.charAt(i3);
                        StringBuilder sb222 = new StringBuilder(37);
                        sb222.append("Failed writing ");
                        sb222.append(charAt2222);
                        sb222.append(" at index ");
                        sb222.append(position2222 + max222);
                        throw new ArrayIndexOutOfBoundsException(sb222.toString());
                    }
                }
                throw new zzja(i3, length);
            }
            i3++;
            position++;
        }
        byteBuffer.position(position);
    }
}

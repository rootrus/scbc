package com.google.android.gms.internal.firebase_ml;

import net.p088sf.scuba.smartcards.ISO7816;

final class zzws {
    static String zzd(zzsw zzsw) {
        zzwt zzwt = new zzwt(zzsw);
        StringBuilder sb = new StringBuilder(zzwt.size());
        for (int i = 0; i < zzwt.size(); i++) {
            byte zzcl = zzwt.zzcl(i);
            if (zzcl == 34) {
                sb.append("\\\"");
            } else if (zzcl == 39) {
                sb.append("\\'");
            } else if (zzcl != 92) {
                switch (zzcl) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (zzcl >= 32 && zzcl <= 126) {
                            sb.append((char) zzcl);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((zzcl >>> 6) & 3) + 48));
                            sb.append((char) (((zzcl >>> 3) & 7) + 48));
                            sb.append((char) ((zzcl & 7) + ISO7816.INS_DECREASE));
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}

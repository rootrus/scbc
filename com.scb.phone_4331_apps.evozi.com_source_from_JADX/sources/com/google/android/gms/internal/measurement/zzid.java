package com.google.android.gms.internal.measurement;

import net.p088sf.scuba.smartcards.ISO7816;

final class zzid {
    static String zza(zzeg zzeg) {
        zzic zzic = new zzic(zzeg);
        StringBuilder sb = new StringBuilder(zzic.zza());
        for (int i = 0; i < zzic.zza(); i++) {
            byte zza = zzic.zza(i);
            if (zza == 34) {
                sb.append("\\\"");
            } else if (zza == 39) {
                sb.append("\\'");
            } else if (zza != 92) {
                switch (zza) {
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
                        if (zza >= 32 && zza <= 126) {
                            sb.append((char) zza);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((zza >>> 6) & 3) + 48));
                            sb.append((char) (((zza >>> 3) & 7) + 48));
                            sb.append((char) ((zza & 7) + ISO7816.INS_DECREASE));
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

package com.google.android.gms.internal.firebase_ml;

import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

final class zzgq extends zzgi {
    private final zzgn zzxb;
    private final zzqn zzxc;
    private List<String> zzxd = new ArrayList();
    private zzgm zzxe;
    private String zzxf;

    zzgq(zzgn zzgn, zzqn zzqn) {
        this.zzxb = zzgn;
        this.zzxc = zzqn;
        zzqn.setLenient(true);
    }

    public final void close() throws IOException {
        this.zzxc.close();
    }

    public final String zzgj() {
        if (this.zzxd.isEmpty()) {
            return null;
        }
        List<String> list = this.zzxd;
        return list.get(list.size() - 1);
    }

    public final zzgm zzgi() {
        return this.zzxe;
    }

    public final zzge zzgg() {
        return this.zzxb;
    }

    public final byte zzgl() {
        zzgy();
        return Byte.parseByte(this.zzxf);
    }

    public final short zzgm() {
        zzgy();
        return Short.parseShort(this.zzxf);
    }

    public final int getIntValue() {
        zzgy();
        return Integer.parseInt(this.zzxf);
    }

    public final float zzgn() {
        zzgy();
        return Float.parseFloat(this.zzxf);
    }

    public final BigInteger zzgq() {
        zzgy();
        return new BigInteger(this.zzxf);
    }

    public final BigDecimal zzgr() {
        zzgy();
        return new BigDecimal(this.zzxf);
    }

    public final double zzgp() {
        zzgy();
        return Double.parseDouble(this.zzxf);
    }

    public final long zzgo() {
        zzgy();
        return Long.parseLong(this.zzxf);
    }

    private final void zzgy() {
        zzks.checkArgument(this.zzxe == zzgm.VALUE_NUMBER_INT || this.zzxe == zzgm.VALUE_NUMBER_FLOAT);
    }

    public final String getText() {
        return this.zzxf;
    }

    public final zzgm zzgh() throws IOException {
        zzqp zzqp;
        zzgm zzgm;
        if (this.zzxe != null) {
            int i = zzgr.zzwl[this.zzxe.ordinal()];
            if (i == 1) {
                this.zzxc.beginArray();
                this.zzxd.add((Object) null);
            } else if (i == 2) {
                this.zzxc.beginObject();
                this.zzxd.add((Object) null);
            }
        }
        try {
            zzqp = this.zzxc.zznq();
        } catch (EOFException unused) {
            zzqp = zzqp.END_DOCUMENT;
        }
        switch (zzgr.zzxg[zzqp.ordinal()]) {
            case 1:
                this.zzxf = "[";
                this.zzxe = zzgm.START_ARRAY;
                break;
            case 2:
                this.zzxf = "]";
                this.zzxe = zzgm.END_ARRAY;
                List<String> list = this.zzxd;
                list.remove(list.size() - 1);
                this.zzxc.endArray();
                break;
            case 3:
                this.zzxf = "{";
                this.zzxe = zzgm.START_OBJECT;
                break;
            case 4:
                this.zzxf = "}";
                this.zzxe = zzgm.END_OBJECT;
                List<String> list2 = this.zzxd;
                list2.remove(list2.size() - 1);
                this.zzxc.endObject();
                break;
            case 5:
                if (!this.zzxc.nextBoolean()) {
                    this.zzxf = "false";
                    this.zzxe = zzgm.VALUE_FALSE;
                    break;
                } else {
                    this.zzxf = "true";
                    this.zzxe = zzgm.VALUE_TRUE;
                    break;
                }
            case 6:
                this.zzxf = "null";
                this.zzxe = zzgm.VALUE_NULL;
                this.zzxc.nextNull();
                break;
            case 7:
                this.zzxf = this.zzxc.nextString();
                this.zzxe = zzgm.VALUE_STRING;
                break;
            case 8:
                String nextString = this.zzxc.nextString();
                this.zzxf = nextString;
                if (nextString.indexOf(46) == -1) {
                    zzgm = zzgm.VALUE_NUMBER_INT;
                } else {
                    zzgm = zzgm.VALUE_NUMBER_FLOAT;
                }
                this.zzxe = zzgm;
                break;
            case 9:
                this.zzxf = this.zzxc.nextName();
                this.zzxe = zzgm.FIELD_NAME;
                List<String> list3 = this.zzxd;
                list3.set(list3.size() - 1, this.zzxf);
                break;
            default:
                this.zzxf = null;
                this.zzxe = null;
                break;
        }
        return this.zzxe;
    }

    public final zzgi zzgk() throws IOException {
        if (this.zzxe != null) {
            int i = zzgr.zzwl[this.zzxe.ordinal()];
            if (i == 1) {
                this.zzxc.skipValue();
                this.zzxf = "]";
                this.zzxe = zzgm.END_ARRAY;
            } else if (i == 2) {
                this.zzxc.skipValue();
                this.zzxf = "}";
                this.zzxe = zzgm.END_OBJECT;
            }
        }
        return this;
    }
}

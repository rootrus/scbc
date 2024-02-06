package com.google.android.gms.internal.firebase_ml;

enum zzfs {
    PLUS('+', "", ",", false, true),
    HASH('#', "#", ",", false, true),
    DOT('.', ".", ".", false, false),
    FORWARD_SLASH('/', "/", "/", false, false),
    SEMI_COLON(';', ";", ";", true, false),
    QUERY('?', "?", "&", true, false),
    AMP('&', "&", "&", true, false),
    SIMPLE((String) null, "", ",", false, false);
    
    private final Character zzvr;
    private final String zzvs;
    private final String zzvt;
    private final boolean zzvu;
    private final boolean zzvv;

    private zzfs(Character ch, String str, String str2, boolean z, boolean z2) {
        this.zzvr = ch;
        this.zzvs = (String) zzks.checkNotNull(str);
        this.zzvt = (String) zzks.checkNotNull(str2);
        this.zzvu = z;
        this.zzvv = z2;
        if (ch != null) {
            zzfr.zzvi.put(ch, this);
        }
    }

    /* access modifiers changed from: package-private */
    public final String zzfr() {
        return this.zzvs;
    }

    /* access modifiers changed from: package-private */
    public final String zzfs() {
        return this.zzvt;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzft() {
        return this.zzvu;
    }

    /* access modifiers changed from: package-private */
    public final int zzfu() {
        return this.zzvr == null ? 0 : 1;
    }

    /* access modifiers changed from: package-private */
    public final String zzak(String str) {
        if (this.zzvv) {
            return zzie.zzas(str);
        }
        return zzie.zzaq(str);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzfv() {
        return this.zzvv;
    }
}

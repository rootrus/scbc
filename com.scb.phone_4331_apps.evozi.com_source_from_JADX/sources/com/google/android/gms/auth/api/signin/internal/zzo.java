package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

public final class zzo {
    private static zzo zzci;
    private Storage zzcj;
    private GoogleSignInAccount zzck;
    private GoogleSignInOptions zzcl = this.zzcj.getSavedDefaultGoogleSignInOptions();

    private zzo(Context context) {
        Storage instance = Storage.getInstance(context);
        this.zzcj = instance;
        this.zzck = instance.getSavedDefaultGoogleSignInAccount();
    }

    public static zzo zzd(Context context) {
        zzo zze;
        synchronized (zzo.class) {
            zze = zze(context.getApplicationContext());
        }
        return zze;
    }

    private static zzo zze(Context context) {
        synchronized (zzo.class) {
            if (zzci != null) {
                zzo zzo = zzci;
                return zzo;
            }
            zzo zzo2 = new zzo(context);
            zzci = zzo2;
            return zzo2;
        }
    }

    public final void clear() {
        synchronized (this) {
            this.zzcj.clear();
            this.zzck = null;
            this.zzcl = null;
        }
    }

    public final void zzc(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        synchronized (this) {
            this.zzcj.saveDefaultGoogleSignInAccount(googleSignInAccount, googleSignInOptions);
            this.zzck = googleSignInAccount;
            this.zzcl = googleSignInOptions;
        }
    }

    public final GoogleSignInAccount zzk() {
        GoogleSignInAccount googleSignInAccount;
        synchronized (this) {
            googleSignInAccount = this.zzck;
        }
        return googleSignInAccount;
    }

    public final GoogleSignInOptions zzl() {
        GoogleSignInOptions googleSignInOptions;
        synchronized (this) {
            googleSignInOptions = this.zzcl;
        }
        return googleSignInOptions;
    }
}

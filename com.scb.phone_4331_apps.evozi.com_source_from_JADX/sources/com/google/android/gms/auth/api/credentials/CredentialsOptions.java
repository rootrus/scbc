package com.google.android.gms.auth.api.credentials;

import com.google.android.gms.auth.api.Auth;

public final class CredentialsOptions extends Auth.AuthCredentialsOptions {
    public static final CredentialsOptions DEFAULT = ((CredentialsOptions) new Builder().zzd());

    public static final class Builder extends Auth.AuthCredentialsOptions.Builder {
        public final Builder forceEnableSaveDialog() {
            this.zzu = Boolean.TRUE;
            return this;
        }

        /* renamed from: build */
        public final CredentialsOptions zzd() {
            return new CredentialsOptions(this);
        }

        public final /* synthetic */ Auth.AuthCredentialsOptions.Builder zzc(String str) {
            this.zzn = str;
            return this;
        }
    }

    private CredentialsOptions(Builder builder) {
        super(builder);
    }
}

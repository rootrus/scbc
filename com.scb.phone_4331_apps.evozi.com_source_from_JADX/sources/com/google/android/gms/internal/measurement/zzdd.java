package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;

final /* synthetic */ class zzdd implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final zzde zza;

    zzdd(zzde zzde) {
        this.zza = zzde;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.zza.zza(sharedPreferences, str);
    }
}

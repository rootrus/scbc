package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.C0155R;

public class StringResourceValueReader {
    private final Resources zzfi;
    private final String zzfj;

    public StringResourceValueReader(Context context) {
        Preconditions.checkNotNull(context);
        Resources resources = context.getResources();
        this.zzfi = resources;
        this.zzfj = resources.getResourcePackageName(C0155R.string.common_google_play_services_unknown_issue);
    }

    public String getString(String str) {
        int identifier = this.zzfi.getIdentifier(str, "string", this.zzfj);
        if (identifier == 0) {
            return null;
        }
        return this.zzfi.getString(identifier);
    }
}

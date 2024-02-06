package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Map;
import p040o.setTextAppearance;

public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new zzv();
    Bundle zza;
    private Map<String, String> zzb;

    public RemoteMessage(Bundle bundle) {
        this.zza = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, this.zza, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final Map<String, String> getData() {
        if (this.zzb == null) {
            Bundle bundle = this.zza;
            setTextAppearance settextappearance = new setTextAppearance();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        settextappearance.put(str, str2);
                    }
                }
            }
            this.zzb = settextappearance;
        }
        return this.zzb;
    }

    public final Intent toIntent() {
        Intent intent = new Intent();
        intent.putExtras(this.zza);
        return intent;
    }
}

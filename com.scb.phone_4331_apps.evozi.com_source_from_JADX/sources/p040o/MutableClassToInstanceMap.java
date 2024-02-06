package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import p040o.Multisets;
import p040o.Onboarding;
import p040o.SignedBytes;
import p040o.zzbt;

/* renamed from: o.MutableClassToInstanceMap */
public final class MutableClassToInstanceMap extends SignedBytes.LexicographicalComparator {
    private Multisets.SetMultiset.EntrySet.C36891 read;

    @HmlPinActivity
    public MutableClassToInstanceMap(Resources resources, SharedPreferences sharedPreferences, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseAssetsURL") String str, Multisets.SetMultiset.EntrySet.C36891 r4) {
        super(resources, sharedPreferences, str);
        this.read = r4;
    }

    public final Onboarding.C37171 IconCompatParcelizer(zzbt.zzf.zza zza) {
        if (zza == null) {
            return null;
        }
        Onboarding.C37171.read read2 = new Onboarding.C37171.read();
        read2.write = mo26549c_(zza.read);
        read2.MediaBrowserCompat$CustomActionResultReceiver = zza.MediaBrowserCompat$ItemReceiver;
        read2.read = Multisets.SetMultiset.EntrySet.C36891.read(zza.MediaBrowserCompat$CustomActionResultReceiver);
        return new Onboarding.C37171(read2);
    }
}

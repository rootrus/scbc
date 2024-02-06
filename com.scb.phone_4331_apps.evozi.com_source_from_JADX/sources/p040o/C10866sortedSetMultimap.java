package p040o;

import p040o.Synchronized;
import p040o.zzag;

/* renamed from: o.sortedSetMultimap  reason: case insensitive filesystem */
public final /* synthetic */ class C10866sortedSetMultimap implements findFragmentByWho {
    private final /* synthetic */ Synchronized.C38331 MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ boolean MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ C10866sortedSetMultimap(Synchronized.C38331 r1, boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver = r1;
        this.MediaBrowserCompat$ItemReceiver = z;
    }

    public final Object IconCompatParcelizer(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        makeChecked makechecked;
        String str6;
        String str7;
        boolean z = this.MediaBrowserCompat$ItemReceiver;
        zzvm zzvm = (zzvm) obj;
        String str8 = zzvm.MediaBrowserCompat$ItemReceiver;
        String str9 = zzvm.write;
        zzag.zza zza = zzvm.MediaDescriptionCompat;
        if (z) {
            str = zza.read;
        } else {
            str = zza.MediaBrowserCompat$ItemReceiver;
        }
        String str10 = str;
        zzag.zza zza2 = zzvm.IconCompatParcelizer;
        if (z) {
            str2 = zza2.read;
        } else {
            str2 = zza2.MediaBrowserCompat$ItemReceiver;
        }
        String str11 = str2;
        if (zzvm.MediaMetadataCompat != null) {
            zzag.zza zza3 = zzvm.MediaMetadataCompat;
            if (z) {
                str7 = zza3.read;
            } else {
                str7 = zza3.MediaBrowserCompat$ItemReceiver;
            }
            str3 = str7;
        } else {
            str3 = "";
        }
        if (zzvm.read != null) {
            zzag.zza zza4 = zzvm.read;
            if (z) {
                str6 = zza4.read;
            } else {
                str6 = zza4.MediaBrowserCompat$ItemReceiver;
            }
            str4 = str6;
        } else {
            str4 = "";
        }
        if (zzvm.MediaBrowserCompat$CustomActionResultReceiver != null) {
            zzag.zza zza5 = zzvm.MediaBrowserCompat$CustomActionResultReceiver;
            if (z) {
                str5 = zza5.read;
            } else {
                str5 = zza5.MediaBrowserCompat$ItemReceiver;
            }
        } else {
            str5 = "";
        }
        int i = Synchronized.C38331.C38344.MediaBrowserCompat$CustomActionResultReceiver[zzvm.MediaBrowserCompat$MediaItem.ordinal()];
        if (i == 1) {
            makechecked = makeChecked.IMAGE;
        } else if (i != 2) {
            makechecked = null;
        } else {
            makechecked = makeChecked.TEXT;
        }
        return new immediateFuture(str8, str9, str10, str11, str3, str4, str5, makechecked, false);
    }
}

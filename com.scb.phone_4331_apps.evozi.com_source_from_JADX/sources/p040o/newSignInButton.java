package p040o;

import p040o.Api;
import p040o.zzbt;
import p040o.zzfo;

/* renamed from: o.newSignInButton */
public final /* synthetic */ class newSignInButton implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ Api.AnyClientKey read;

    public /* synthetic */ newSignInButton(Api.AnyClientKey anyClientKey) {
        this.read = anyClientKey;
    }

    public final Object write(Object obj) {
        Api.AnyClientKey anyClientKey = this.read;
        call call = (call) obj;
        zzfo.zzd zzd = null;
        if (call == null) {
            return null;
        }
        zzbt.zzb.zza.IconCompatParcelizer iconCompatParcelizer = new zzbt.zzb.zza.IconCompatParcelizer();
        if (call.write != null) {
            zzd = setShowCancelButton.write(call.write);
        }
        iconCompatParcelizer.read = zzd;
        iconCompatParcelizer.write = call.MediaBrowserCompat$CustomActionResultReceiver;
        iconCompatParcelizer.MediaBrowserCompat$ItemReceiver = call.read;
        iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = anyClientKey.MediaBrowserCompat$CustomActionResultReceiver(call.IconCompatParcelizer);
        return (zzbt.zzb.zza) iconCompatParcelizer.MediaBrowserCompat$ItemReceiver();
    }
}

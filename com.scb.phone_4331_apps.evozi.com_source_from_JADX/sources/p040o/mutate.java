package p040o;

import retrofit2.Response;

/* renamed from: o.mutate */
public final /* synthetic */ class mutate implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ KeepForSdkWithMembers IconCompatParcelizer;

    public /* synthetic */ mutate(KeepForSdkWithMembers keepForSdkWithMembers) {
        this.IconCompatParcelizer = keepForSdkWithMembers;
    }

    public final Object write(Object obj) {
        return this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver((Response) obj);
    }
}

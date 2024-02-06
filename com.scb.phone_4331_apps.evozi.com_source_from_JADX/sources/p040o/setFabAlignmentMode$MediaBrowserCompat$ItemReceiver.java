package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setFabAlignmentMode$MediaBrowserCompat$ItemReceiver */
final class setFabAlignmentMode$MediaBrowserCompat$ItemReceiver<T, R> implements DirectDebitDeepLinkActivity<T, DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> {
    private /* synthetic */ setFabAlignmentMode IconCompatParcelizer;
    private /* synthetic */ String write;

    setFabAlignmentMode$MediaBrowserCompat$ItemReceiver(setFabAlignmentMode setfabalignmentmode, String str) {
        this.IconCompatParcelizer = setfabalignmentmode;
        this.write = str;
    }

    public final /* synthetic */ Object write(Object obj) {
        String str = (String) obj;
        onGetStartedClick.write((Object) str, "applicationUuid");
        return this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(new Object(str, this.write) {
            @SerializedName("applicationUuid")
            private final String MediaBrowserCompat$CustomActionResultReceiver;
            @SerializedName("issuerId")
            private final String MediaBrowserCompat$ItemReceiver;

            {
                onGetStartedClick.write((Object) r2, "applicationUuid");
                onGetStartedClick.write((Object) r3, "issuerId");
                this.MediaBrowserCompat$CustomActionResultReceiver = r2;
                this.MediaBrowserCompat$ItemReceiver = r3;
            }
        });
    }
}

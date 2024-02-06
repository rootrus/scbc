package p040o;

import p040o.PlacePicker;

/* renamed from: o.immutableCell$MediaBrowserCompat$ItemReceiver */
final class immutableCell$MediaBrowserCompat$ItemReceiver<T, R> implements findFragmentByWho<T, R> {
    private /* synthetic */ immutableCell MediaBrowserCompat$CustomActionResultReceiver;

    immutableCell$MediaBrowserCompat$ItemReceiver(immutableCell immutablecell) {
        this.MediaBrowserCompat$CustomActionResultReceiver = immutablecell;
    }

    public final /* synthetic */ Object IconCompatParcelizer(Object obj) {
        setHint sethint = (setHint) obj;
        onGetStartedClick.IconCompatParcelizer((Object) sethint, "item");
        int i = sethint.RatingCompat;
        String str = sethint.MediaBrowserCompat$ItemReceiver;
        String str2 = sethint.read;
        String str3 = sethint.IconCompatParcelizer;
        String str4 = sethint.MediaBrowserCompat$CustomActionResultReceiver;
        String str5 = sethint.write;
        PlacePicker.IntentBuilder intentBuilder = sethint.MediaBrowserCompat$MediaItem;
        return new ringRead(i, str, str2, str3, str4, str5, intentBuilder != null ? new writeInts(intentBuilder.MediaBrowserCompat$ItemReceiver, intentBuilder.IconCompatParcelizer) : null);
    }
}

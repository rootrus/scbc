package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import p040o.awaitEvenIfOnMainThread;

/* renamed from: o.findMinChild */
public final class findMinChild extends constrainedListMultimap {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public findMinChild(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
    }

    public final awaitEvenIfOnMainThread MediaBrowserCompat$CustomActionResultReceiver(String str, String str2, boolean z) {
        onGetStartedClick.write((Object) str, "accountNumber");
        awaitEvenIfOnMainThread.IconCompatParcelizer IconCompatParcelizer = awaitEvenIfOnMainThread.IconCompatParcelizer();
        IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(str, z);
        if (str2 == null) {
            str2 = "";
        }
        IconCompatParcelizer.MediaMetadataCompat = str2;
        awaitEvenIfOnMainThread.IconCompatParcelizer iconCompatParcelizer = IconCompatParcelizer;
        iconCompatParcelizer.RatingCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.debit_card_activation_account_label);
        awaitEvenIfOnMainThread.IconCompatParcelizer iconCompatParcelizer2 = iconCompatParcelizer;
        iconCompatParcelizer2.MediaBrowserCompat$ItemReceiver = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(Iterables$3$MediaBrowserCompat$ItemReceiver.bankicon_scb).toString();
        awaitEvenIfOnMainThread awaitevenifonmainthread = new awaitEvenIfOnMainThread(iconCompatParcelizer2, (byte) 0);
        onGetStartedClick.IconCompatParcelizer((Object) awaitevenifonmainthread, "ItemIconCustomDisplay.ne…\n                .build()");
        return awaitevenifonmainthread;
    }
}

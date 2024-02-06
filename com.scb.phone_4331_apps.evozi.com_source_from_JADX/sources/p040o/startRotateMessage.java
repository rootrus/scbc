package p040o;

import p040o.CheckParameters_MembersInjector;

/* renamed from: o.startRotateMessage */
public class startRotateMessage extends writeUInt64NoTag<CheckParameters_MembersInjector.MediaDescriptionCompat> {
    public removeDependent IconCompatParcelizer;
    final Ints MediaBrowserCompat$ItemReceiver;
    public String read;

    @HmlPinActivity
    public startRotateMessage(Ints ints, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$ItemReceiver = ints;
    }

    static /* synthetic */ void MediaBrowserCompat$MediaItem(CheckParameters_MembersInjector.MediaDescriptionCompat mediaDescriptionCompat) {
        mediaDescriptionCompat.write(0);
        mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(13);
    }

    static /* synthetic */ void MediaBrowserCompat$SearchResultReceiver(CheckParameters_MembersInjector.MediaDescriptionCompat mediaDescriptionCompat) {
        mediaDescriptionCompat.write(1);
        mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(10);
        mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver();
    }

    static /* synthetic */ void write(int i, CheckParameters_MembersInjector.MediaDescriptionCompat mediaDescriptionCompat) {
        mediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(i);
        mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(false);
    }

    static /* synthetic */ void RatingCompat(CheckParameters_MembersInjector.MediaDescriptionCompat mediaDescriptionCompat) {
        mediaDescriptionCompat.write();
        mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(true);
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, String str2) {
        if (removeIfFromRandomAccessList.write(str)) {
            reportFromJson reportfromjson = new reportFromJson();
            reportfromjson.MediaBrowserCompat$CustomActionResultReceiver = str2;
            reportfromjson.MediaBrowserCompat$ItemReceiver = str;
            this.IconCompatParcelizer = reportfromjson;
        } else if (removeIfFromRandomAccessList.MediaBrowserCompat$ItemReceiver(str)) {
            parseNdkPayload parsendkpayload = new parseNdkPayload();
            parsendkpayload.MediaBrowserCompat$ItemReceiver = str;
            this.IconCompatParcelizer = parsendkpayload;
        }
    }
}

package p040o;

import android.content.SharedPreferences;
import p040o.MissingNativeComponent;
import p040o.Multimaps;

/* renamed from: o.getDocument */
public class getDocument extends writeUInt64NoTag {
    public final snippet IconCompatParcelizer;
    /* access modifiers changed from: private */
    public final Multimaps.MapMultimap MediaBrowserCompat$ItemReceiver;
    private SharedPreferences MediaDescriptionCompat;
    public getDocument$MediaBrowserCompat$CustomActionResultReceiver read;
    public String write;

    static /* synthetic */ getDocument$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer(getDocument getdocument) {
        return null;
    }

    @HmlPinActivity
    public getDocument(snippet snippet, Multimaps.MapMultimap mapMultimap, RegularImmutableBiMap regularImmutableBiMap, SharedPreferences sharedPreferences) {
        super(regularImmutableBiMap);
        this.IconCompatParcelizer = snippet;
        this.MediaBrowserCompat$ItemReceiver = mapMultimap;
        this.MediaDescriptionCompat = sharedPreferences;
    }

    static /* synthetic */ void read(getDocument getdocument, MissingNativeComponent.C36601 r2) {
        if (!r2.write || getdocument.write.isEmpty()) {
            getdocument.MediaDescriptionCompat.edit().putBoolean("com.scb.phone.pref.key.ENABLE_PUSH_NOTIFICATIONS", false).apply();
        } else {
            getdocument.MediaDescriptionCompat.edit().putBoolean("com.scb.phone.pref.key.ENABLE_PUSH_NOTIFICATIONS", true).apply();
        }
    }
}

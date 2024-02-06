package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.Onboarding;
import p040o.writeUInt64NoTag;

/* renamed from: o.getCropType */
public final /* synthetic */ class getCropType implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getLegacySharedPrefs MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ Onboarding.C37171 read;

    public /* synthetic */ getCropType(getLegacySharedPrefs getlegacysharedprefs, Onboarding.C37171 r2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getlegacysharedprefs;
        this.read = r2;
    }

    public final void IconCompatParcelizer(Object obj) {
        setInputDocLongEdge.read(this.MediaBrowserCompat$CustomActionResultReceiver, this.read, (CheckExtractActivity_MembersInjector.AppCompatViewInflater) obj);
    }
}

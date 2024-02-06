package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.Onboarding;
import p040o.writeUInt64NoTag;

/* renamed from: o.setDirection */
public final /* synthetic */ class setDirection implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getLegacySharedPrefs MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ getOutputBitDepth MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ Onboarding.C37171 read;

    public /* synthetic */ setDirection(getOutputBitDepth getoutputbitdepth, getLegacySharedPrefs getlegacysharedprefs, Onboarding.C37171 r3) {
        this.MediaBrowserCompat$ItemReceiver = getoutputbitdepth;
        this.MediaBrowserCompat$CustomActionResultReceiver = getlegacysharedprefs;
        this.read = r3;
    }

    public final void IconCompatParcelizer(Object obj) {
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, this.read, (CheckExtractActivity_MembersInjector.setContentView) obj);
    }
}

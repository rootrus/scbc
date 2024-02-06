package p040o;

import java.util.List;
import p040o.SignInButton;

/* renamed from: o.getHeartBeatCode$MediaBrowserCompat$CustomActionResultReceiver */
public final class getHeartBeatCode$MediaBrowserCompat$CustomActionResultReceiver implements findFragmentByWho {
    private final /* synthetic */ List MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ SignInButton.ButtonSize read;

    private getHeartBeatCode$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public /* synthetic */ getHeartBeatCode$MediaBrowserCompat$CustomActionResultReceiver(SignInButton.ButtonSize buttonSize, List list) {
        this.read = buttonSize;
        this.MediaBrowserCompat$ItemReceiver = list;
    }

    public final Object IconCompatParcelizer(Object obj) {
        return this.read.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver, (ShapeDataParser) obj);
    }
}

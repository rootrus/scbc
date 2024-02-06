package p040o;

import p040o.Guideline;

/* renamed from: o.getStatementPreRequest$MediaBrowserCompat$CustomActionResultReceiver */
public final class C7125xb9aa3dd2 extends Guideline.write<getUiOrientation> {
    public final /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver(Object obj, Object obj2) {
        getUiOrientation getuiorientation = (getUiOrientation) obj;
        getUiOrientation getuiorientation2 = (getUiOrientation) obj2;
        onGetStartedClick.write((Object) getuiorientation, "oldItem");
        onGetStartedClick.write((Object) getuiorientation2, "newItem");
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) getuiorientation, (Object) getuiorientation2);
    }

    public final /* synthetic */ boolean read(Object obj, Object obj2) {
        getUiOrientation getuiorientation = (getUiOrientation) obj;
        getUiOrientation getuiorientation2 = (getUiOrientation) obj2;
        onGetStartedClick.write((Object) getuiorientation, "oldItem");
        onGetStartedClick.write((Object) getuiorientation2, "newItem");
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) getuiorientation.write, (Object) getuiorientation2.write);
    }
}

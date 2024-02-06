package p040o;

/* renamed from: o.BaseNtbInstructionActivity */
public abstract class BaseNtbInstructionActivity {
    public abstract Object MediaBrowserCompat$CustomActionResultReceiver(Object obj);

    public abstract IdpShareInformationActivity<?> MediaBrowserCompat$CustomActionResultReceiver();

    public String toString() {
        StringBuilder sb = new StringBuilder();
        onGetStartedClick.write((Object) this, "$this$classSimpleName");
        String simpleName = getClass().getSimpleName();
        onGetStartedClick.IconCompatParcelizer((Object) simpleName, "this::class.java.simpleName");
        sb.append(simpleName);
        sb.append('@');
        onGetStartedClick.write((Object) this, "$this$hexAddress");
        String hexString = Integer.toHexString(System.identityHashCode(this));
        onGetStartedClick.IconCompatParcelizer((Object) hexString, "Integer.toHexString(System.identityHashCode(this))");
        sb.append(hexString);
        return sb.toString();
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver(BaseNtbInstructionActivity baseNtbInstructionActivity) {
        IdpShareInformationActivity<?> MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) baseNtbInstructionActivity, "that");
        IdpShareInformationActivity<?> MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver2 == null || (MediaBrowserCompat$CustomActionResultReceiver = baseNtbInstructionActivity.MediaBrowserCompat$CustomActionResultReceiver()) == null || MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver() >= MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver()) {
            return false;
        }
        return true;
    }
}

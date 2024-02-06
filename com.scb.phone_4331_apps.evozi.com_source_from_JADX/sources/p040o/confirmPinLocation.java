package p040o;

/* renamed from: o.confirmPinLocation */
public final class confirmPinLocation extends MwBusinessDetailsActivity {
    public static final confirmPinLocation IconCompatParcelizer = new confirmPinLocation();

    public final String toString() {
        return "Unconfined";
    }

    public final boolean write(HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity) {
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, "context");
        return false;
    }

    private confirmPinLocation() {
    }

    public final void IconCompatParcelizer(HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity, Runnable runnable) {
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, "context");
        onGetStartedClick.write((Object) runnable, "block");
        onDoneClick ondoneclick = (onDoneClick) hmlPromptPayVerificationActivity.IconCompatParcelizer(onDoneClick.MediaBrowserCompat$ItemReceiver);
        if (ondoneclick != null) {
            ondoneclick.MediaBrowserCompat$CustomActionResultReceiver = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }
}

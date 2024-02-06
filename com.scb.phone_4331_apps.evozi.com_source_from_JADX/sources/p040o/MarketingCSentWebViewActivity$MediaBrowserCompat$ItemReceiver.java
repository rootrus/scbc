package p040o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: o.MarketingCSentWebViewActivity$MediaBrowserCompat$ItemReceiver */
final class MarketingCSentWebViewActivity$MediaBrowserCompat$ItemReceiver implements onCallUsClick {
    private final MarketingCSentWebViewActivity MediaBrowserCompat$CustomActionResultReceiver;

    public MarketingCSentWebViewActivity$MediaBrowserCompat$ItemReceiver(MarketingCSentWebViewActivity marketingCSentWebViewActivity) {
        onGetStartedClick.write((Object) marketingCSentWebViewActivity, "inflater");
        this.MediaBrowserCompat$CustomActionResultReceiver = marketingCSentWebViewActivity;
    }

    public final View IconCompatParcelizer(View view, String str, Context context, AttributeSet attributeSet) {
        onGetStartedClick.write((Object) str, "name");
        onGetStartedClick.write((Object) context, "context");
        View view2 = null;
        for (String createView : MarketingCSentWebViewActivity.MediaBrowserCompat$ItemReceiver) {
            try {
                view2 = this.MediaBrowserCompat$CustomActionResultReceiver.createView(str, createView, attributeSet);
                if (view2 != null) {
                    break;
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        return view2 == null ? this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(str, attributeSet) : view2;
    }
}

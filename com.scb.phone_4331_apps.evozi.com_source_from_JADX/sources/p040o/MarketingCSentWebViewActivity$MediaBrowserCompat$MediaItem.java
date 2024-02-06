package p040o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

/* renamed from: o.MarketingCSentWebViewActivity$MediaBrowserCompat$MediaItem */
final class MarketingCSentWebViewActivity$MediaBrowserCompat$MediaItem implements onCallUsClick {
    private final LayoutInflater.Factory IconCompatParcelizer;

    public MarketingCSentWebViewActivity$MediaBrowserCompat$MediaItem(LayoutInflater.Factory factory) {
        onGetStartedClick.write((Object) factory, "factory");
        this.IconCompatParcelizer = factory;
    }

    public final View IconCompatParcelizer(View view, String str, Context context, AttributeSet attributeSet) {
        onGetStartedClick.write((Object) str, "name");
        onGetStartedClick.write((Object) context, "context");
        return this.IconCompatParcelizer.onCreateView(str, context, attributeSet);
    }
}

package p040o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import p040o.MarketingCSentWebViewActivity;

/* renamed from: o.MarketingCSentWebViewActivity$MediaBrowserCompat$SearchResultReceiver */
final class C6947x45091141 extends MarketingCSentWebViewActivity.RatingCompat {
    private final MarketingCSentWebViewActivity read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6947x45091141(LayoutInflater.Factory2 factory2, MarketingCSentWebViewActivity marketingCSentWebViewActivity) {
        super(factory2);
        onGetStartedClick.write((Object) factory2, "factory2");
        onGetStartedClick.write((Object) marketingCSentWebViewActivity, "inflater");
        this.read = marketingCSentWebViewActivity;
    }

    public final View IconCompatParcelizer(View view, String str, Context context, AttributeSet attributeSet) {
        onGetStartedClick.write((Object) str, "name");
        onGetStartedClick.write((Object) context, "context");
        return this.read.MediaBrowserCompat$ItemReceiver(write().onCreateView(view, str, context, attributeSet), str, context, attributeSet);
    }
}

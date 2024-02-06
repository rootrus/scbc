package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p040o.AppCompatAutoCompleteTextView$MediaBrowserCompat$ItemReceiver;

public class BrowserActionsFallbackMenuView extends LinearLayout {
    private final int MediaBrowserCompat$CustomActionResultReceiver = getResources().getDimensionPixelOffset(AppCompatAutoCompleteTextView$MediaBrowserCompat$ItemReceiver.browser_actions_context_menu_max_width);
    private final int read = getResources().getDimensionPixelOffset(AppCompatAutoCompleteTextView$MediaBrowserCompat$ItemReceiver.browser_actions_context_menu_min_padding);

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.read << 1), this.MediaBrowserCompat$CustomActionResultReceiver), 1073741824), i2);
    }
}

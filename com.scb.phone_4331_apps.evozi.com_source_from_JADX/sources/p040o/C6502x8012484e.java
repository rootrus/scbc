package p040o;

import android.content.res.Resources;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: o.FragmentBuilder_BindDirectDebitInputMainFragment$MediaBrowserCompat$CustomActionResultReceiver */
public final class C6502x8012484e extends ClickableSpan {
    private /* synthetic */ FundActionsSuccessActivity IconCompatParcelizer;
    private /* synthetic */ Resources MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ boolean MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ int write;

    C6502x8012484e(FundActionsSuccessActivity fundActionsSuccessActivity, boolean z, Resources resources, int i) {
        this.IconCompatParcelizer = fundActionsSuccessActivity;
        this.MediaBrowserCompat$ItemReceiver = z;
        this.MediaBrowserCompat$CustomActionResultReceiver = resources;
        this.write = i;
    }

    public final void onClick(View view) {
        onGetStartedClick.write((Object) view, "widget");
        this.IconCompatParcelizer.invoke();
    }

    public final void updateDrawState(TextPaint textPaint) {
        onGetStartedClick.write((Object) textPaint, "ds");
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(this.MediaBrowserCompat$ItemReceiver);
        textPaint.setColor(ContentFrameLayout.write(this.MediaBrowserCompat$CustomActionResultReceiver, this.write, (Resources.Theme) null));
    }
}

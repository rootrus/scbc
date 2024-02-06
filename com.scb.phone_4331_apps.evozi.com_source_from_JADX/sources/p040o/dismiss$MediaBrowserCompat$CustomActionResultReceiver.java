package p040o;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: o.dismiss$MediaBrowserCompat$CustomActionResultReceiver */
class dismiss$MediaBrowserCompat$CustomActionResultReceiver extends Drawable.ConstantState {
    private final Drawable.ConstantState IconCompatParcelizer;

    public dismiss$MediaBrowserCompat$CustomActionResultReceiver(Drawable.ConstantState constantState) {
        this.IconCompatParcelizer = constantState;
    }

    public Drawable newDrawable() {
        dismiss dismiss = new dismiss();
        dismiss.write = this.IconCompatParcelizer.newDrawable();
        dismiss.write.setCallback(dismiss.IconCompatParcelizer);
        return dismiss;
    }

    public Drawable newDrawable(Resources resources) {
        dismiss dismiss = new dismiss();
        dismiss.write = this.IconCompatParcelizer.newDrawable(resources);
        dismiss.write.setCallback(dismiss.IconCompatParcelizer);
        return dismiss;
    }

    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        dismiss dismiss = new dismiss();
        dismiss.write = this.IconCompatParcelizer.newDrawable(resources, theme);
        dismiss.write.setCallback(dismiss.IconCompatParcelizer);
        return dismiss;
    }

    public boolean canApplyTheme() {
        return this.IconCompatParcelizer.canApplyTheme();
    }

    public int getChangingConfigurations() {
        return this.IconCompatParcelizer.getChangingConfigurations();
    }
}

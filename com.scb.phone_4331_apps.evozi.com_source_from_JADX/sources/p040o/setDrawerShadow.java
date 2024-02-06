package p040o;

import android.view.View;
import android.view.WindowId;

/* renamed from: o.setDrawerShadow */
class setDrawerShadow implements CheckExtractActivity_MembersInjector {
    private final WindowId IconCompatParcelizer;

    setDrawerShadow(View view) {
        this.IconCompatParcelizer = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof setDrawerShadow) && ((setDrawerShadow) obj).IconCompatParcelizer.equals(this.IconCompatParcelizer);
    }

    public int hashCode() {
        return this.IconCompatParcelizer.hashCode();
    }
}

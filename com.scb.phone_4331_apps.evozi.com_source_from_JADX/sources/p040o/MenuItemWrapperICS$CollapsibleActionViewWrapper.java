package p040o;

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import p040o.setMaxWidth;

/* renamed from: o.MenuItemWrapperICS$CollapsibleActionViewWrapper */
public class MenuItemWrapperICS$CollapsibleActionViewWrapper extends MenuItemWrapperICS {
    public MenuItemWrapperICS$CollapsibleActionViewWrapper(Context context, setGravity setgravity) {
        super(context, setgravity);
    }

    public MenuItemWrapperICS.IconCompatParcelizer write(ActionProvider actionProvider) {
        return new write(this.read, actionProvider);
    }

    /* renamed from: o.MenuItemWrapperICS$CollapsibleActionViewWrapper$write */
    class write extends MenuItemWrapperICS.IconCompatParcelizer implements ActionProvider.VisibilityListener {
        setMaxWidth.write read;

        public write(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        public View MediaBrowserCompat$CustomActionResultReceiver(MenuItem menuItem) {
            return this.MediaBrowserCompat$CustomActionResultReceiver.onCreateActionView(menuItem);
        }

        public boolean IconCompatParcelizer() {
            return this.MediaBrowserCompat$CustomActionResultReceiver.overridesItemVisibility();
        }

        public boolean MediaBrowserCompat$ItemReceiver() {
            return this.MediaBrowserCompat$CustomActionResultReceiver.isVisible();
        }

        public void MediaBrowserCompat$CustomActionResultReceiver(setMaxWidth.write write2) {
            this.read = write2;
            this.MediaBrowserCompat$CustomActionResultReceiver.setVisibilityListener(write2 != null ? this : null);
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            setMaxWidth.write write2 = this.read;
            if (write2 != null) {
                write2.MediaBrowserCompat$ItemReceiver();
            }
        }
    }
}

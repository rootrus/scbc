package p040o;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment;

/* renamed from: o.CropDocumentActivity */
public final class CropDocumentActivity {
    boolean IconCompatParcelizer = false;
    private final WeakReference<Menu> MediaBrowserCompat$CustomActionResultReceiver;
    public final List<View.OnClickListener> MediaBrowserCompat$ItemReceiver = new ArrayList();

    public CropDocumentActivity(Menu menu, MenuInflater menuInflater) {
        this.MediaBrowserCompat$CustomActionResultReceiver = new WeakReference<>(menu);
        try {
            menuInflater.inflate(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.MediaMetadataCompat.th_menu_admin_screen, menu);
            menu.findItem(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.th_menu_admin_screen_item_submit).getActionView().findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.th_layout_menuitem_submit_text_icon_check).setOnClickListener(new read(this, (byte) 0));
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
        }
    }

    public final void write(boolean z) {
        this.IconCompatParcelizer = z;
        Menu menu = this.MediaBrowserCompat$CustomActionResultReceiver.get();
        if (menu != null) {
            MenuItem findItem = menu.findItem(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.th_menu_admin_screen_item_submit);
            View findViewById = findItem.getActionView().findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.th_layout_menuitem_submit_text_icon_check);
            findItem.setEnabled(z);
            findViewById.setEnabled(z);
        }
    }

    /* renamed from: o.CropDocumentActivity$read */
    class read implements View.OnClickListener {
        private read() {
        }

        /* synthetic */ read(CropDocumentActivity cropDocumentActivity, byte b) {
            this();
        }

        public final void onClick(View view) {
            if (CropDocumentActivity.this.IconCompatParcelizer) {
                for (View.OnClickListener onClick : CropDocumentActivity.this.MediaBrowserCompat$ItemReceiver) {
                    onClick.onClick(view);
                }
            }
        }
    }
}

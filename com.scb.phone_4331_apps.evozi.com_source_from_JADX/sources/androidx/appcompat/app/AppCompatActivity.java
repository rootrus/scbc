package androidx.appcompat.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import p040o.ActionMenuItemView;
import p040o.AlertController$RecycleListView;
import p040o.AppCompatRatingBar;
import p040o.Keep;
import p040o.PlaybackStateCompat;
import p040o.setDropDownWidth;
import p040o.setHasDecor;

public class AppCompatActivity extends FragmentActivity implements PlaybackStateCompat, setDropDownWidth.write {
    private int IconCompatParcelizer = 0;
    private Resources MediaBrowserCompat$CustomActionResultReceiver;
    private setHasDecor read;

    public void IconCompatParcelizer(ActionMenuItemView actionMenuItemView) {
    }

    public void IconCompatParcelizer(setDropDownWidth setdropdownwidth) {
    }

    public ActionMenuItemView MediaBrowserCompat$CustomActionResultReceiver(ActionMenuItemView.read read2) {
        return null;
    }

    @Deprecated
    /* renamed from: w_ */
    public void mo48w_() {
    }

    public void write(ActionMenuItemView actionMenuItemView) {
    }

    public void onCreate(Bundle bundle) {
        setHasDecor A_ = mo10A_();
        A_.IconCompatParcelizer();
        A_.write(bundle);
        if (A_.write() && this.IconCompatParcelizer != 0) {
            if (Build.VERSION.SDK_INT >= 23) {
                onApplyThemeResource(getTheme(), this.IconCompatParcelizer, false);
            } else {
                setTheme(this.IconCompatParcelizer);
            }
        }
        super.onCreate(bundle);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        this.IconCompatParcelizer = i;
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        mo10A_().MediaBrowserCompat$ItemReceiver(bundle);
    }

    /* renamed from: B_ */
    public Keep mo11B_() {
        return mo10A_().MediaBrowserCompat$CustomActionResultReceiver();
    }

    public void read(Toolbar toolbar) {
        mo10A_().read(toolbar);
    }

    public MenuInflater getMenuInflater() {
        return mo10A_().read();
    }

    public void setContentView(int i) {
        mo10A_().IconCompatParcelizer(i);
    }

    public void setContentView(View view) {
        mo10A_().MediaBrowserCompat$CustomActionResultReceiver(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo10A_().IconCompatParcelizer(view, layoutParams);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo10A_().MediaBrowserCompat$ItemReceiver(view, layoutParams);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo10A_().MediaBrowserCompat$CustomActionResultReceiver(configuration);
        if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
    }

    public void onPostResume() {
        super.onPostResume();
        mo10A_().MediaBrowserCompat$SearchResultReceiver();
    }

    public void onStart() {
        super.onStart();
        mo10A_().MediaMetadataCompat();
    }

    public void onStop() {
        super.onStop();
        mo10A_().MediaBrowserCompat$MediaItem();
    }

    public <T extends View> T findViewById(int i) {
        return mo10A_().MediaBrowserCompat$ItemReceiver(i);
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        Keep B_ = mo11B_();
        if (menuItem.getItemId() != 16908332 || B_ == null || (B_.MediaBrowserCompat$CustomActionResultReceiver() & 4) == 0) {
            return false;
        }
        return mo12C_();
    }

    public void onDestroy() {
        super.onDestroy();
        mo10A_().RatingCompat();
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        mo10A_().MediaBrowserCompat$ItemReceiver(charSequence);
    }

    public void supportInvalidateOptionsMenu() {
        mo10A_().MediaDescriptionCompat();
    }

    public void invalidateOptionsMenu() {
        mo10A_().MediaDescriptionCompat();
    }

    /* renamed from: C_ */
    public boolean mo12C_() {
        Intent u_ = mo47u_();
        if (u_ == null) {
            return false;
        }
        if (IconCompatParcelizer(u_)) {
            setDropDownWidth IconCompatParcelizer2 = setDropDownWidth.IconCompatParcelizer(this);
            MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer2);
            IconCompatParcelizer(IconCompatParcelizer2);
            IconCompatParcelizer2.write();
            try {
                AppCompatRatingBar.write(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            MediaBrowserCompat$CustomActionResultReceiver(u_);
            return true;
        }
    }

    /* renamed from: u_ */
    public Intent mo47u_() {
        return AlertController$RecycleListView.write((Activity) this);
    }

    public void onContentChanged() {
        mo48w_();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        mo10A_().IconCompatParcelizer(bundle);
    }

    /* renamed from: A_ */
    public setHasDecor mo10A_() {
        if (this.read == null) {
            this.read = setHasDecor.MediaBrowserCompat$ItemReceiver((Activity) this, (PlaybackStateCompat) this);
        }
        return this.read;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        Keep B_ = mo11B_();
        if (keyCode != 82 || B_ == null || !B_.read(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public Resources getResources() {
        Resources resources = this.MediaBrowserCompat$CustomActionResultReceiver;
        return resources == null ? super.getResources() : resources;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r2 = getWindow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean MediaBrowserCompat$ItemReceiver(int r2, android.view.KeyEvent r3) {
        /*
            r1 = this;
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r2 >= r0) goto L_0x003e
            boolean r2 = r3.isCtrlPressed()
            if (r2 != 0) goto L_0x003e
            int r2 = r3.getMetaState()
            boolean r2 = android.view.KeyEvent.metaStateHasNoModifiers(r2)
            if (r2 != 0) goto L_0x003e
            int r2 = r3.getRepeatCount()
            if (r2 != 0) goto L_0x003e
            int r2 = r3.getKeyCode()
            boolean r2 = android.view.KeyEvent.isModifierKey(r2)
            if (r2 != 0) goto L_0x003e
            android.view.Window r2 = r1.getWindow()
            if (r2 == 0) goto L_0x003e
            android.view.View r0 = r2.getDecorView()
            if (r0 == 0) goto L_0x003e
            android.view.View r2 = r2.getDecorView()
            boolean r2 = r2.dispatchKeyShortcutEvent(r3)
            if (r2 == 0) goto L_0x003e
            r2 = 1
            return r2
        L_0x003e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatActivity.MediaBrowserCompat$ItemReceiver(int, android.view.KeyEvent):boolean");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (MediaBrowserCompat$ItemReceiver(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void openOptionsMenu() {
        Keep B_ = mo11B_();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (B_ == null || !B_.MediaBrowserCompat$SearchResultReceiver()) {
            super.openOptionsMenu();
        }
    }

    public void closeOptionsMenu() {
        Keep B_ = mo11B_();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (B_ == null || !B_.MediaBrowserCompat$ItemReceiver()) {
            super.closeOptionsMenu();
        }
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(setDropDownWidth setdropdownwidth) {
        Intent u_ = mo47u_();
        if (u_ == null) {
            u_ = AlertController$RecycleListView.write((Activity) this);
        }
        if (u_ != null) {
            ComponentName component = u_.getComponent();
            if (component == null) {
                component = u_.resolveActivity(setdropdownwidth.write.getPackageManager());
            }
            setdropdownwidth.MediaBrowserCompat$CustomActionResultReceiver(component);
            setdropdownwidth.MediaBrowserCompat$ItemReceiver.add(u_);
        }
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(Intent intent) {
        if (Build.VERSION.SDK_INT >= 16) {
            navigateUpTo(intent);
            return;
        }
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public boolean IconCompatParcelizer(Intent intent) {
        if (Build.VERSION.SDK_INT >= 16) {
            return shouldUpRecreateTask(intent);
        }
        String action = getIntent().getAction();
        return action != null && !action.equals("android.intent.action.MAIN");
    }
}

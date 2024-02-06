package androidx.core.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.ReportFragment;
import p040o.AppCompatCheckBox;
import p040o.SwitchCompat;
import p040o.entryRemoved;
import p040o.get;
import p040o.maxSize;
import p040o.setQuery;

public class ComponentActivity extends Activity implements maxSize, setQuery.IconCompatParcelizer {
    private AppCompatCheckBox<Class<? extends ComponentActivity$MediaBrowserCompat$CustomActionResultReceiver>, ComponentActivity$MediaBrowserCompat$CustomActionResultReceiver> mExtraDataMap = new AppCompatCheckBox<>();
    private get mLifecycleRegistry = new get(this);

    public void putExtraData(ComponentActivity$MediaBrowserCompat$CustomActionResultReceiver componentActivity$MediaBrowserCompat$CustomActionResultReceiver) {
        this.mExtraDataMap.put(componentActivity$MediaBrowserCompat$CustomActionResultReceiver.getClass(), componentActivity$MediaBrowserCompat$CustomActionResultReceiver);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ReportFragment.MediaBrowserCompat$ItemReceiver(this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.mLifecycleRegistry.write(entryRemoved.read.CREATED);
        super.onSaveInstanceState(bundle);
    }

    public <T extends ComponentActivity$MediaBrowserCompat$CustomActionResultReceiver> T getExtraData(Class<T> cls) {
        return (ComponentActivity$MediaBrowserCompat$CustomActionResultReceiver) this.mExtraDataMap.get(cls);
    }

    public entryRemoved getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !SwitchCompat.MediaBrowserCompat$CustomActionResultReceiver(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !SwitchCompat.MediaBrowserCompat$CustomActionResultReceiver(decorView, keyEvent)) {
            return setQuery.MediaBrowserCompat$ItemReceiver(this, decorView, this, keyEvent);
        }
        return true;
    }
}

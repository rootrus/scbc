package p040o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment;
import p040o.ScriptGroup;

/* renamed from: o.validateHER2K */
public abstract class validateHER2K extends RecyclerView.setContentView implements ScriptGroup.Input {
    private final FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.read PlaybackStateCompat = new FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.read();

    public validateHER2K(View view) {
        super(view);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        this.PlaybackStateCompat.MediaBrowserCompat$ItemReceiver = i;
    }

    public final int write() {
        return this.PlaybackStateCompat.MediaBrowserCompat$ItemReceiver;
    }
}

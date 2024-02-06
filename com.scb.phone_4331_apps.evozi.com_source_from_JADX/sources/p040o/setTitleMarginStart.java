package p040o;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

/* renamed from: o.setTitleMarginStart */
public abstract class setTitleMarginStart {

    /* renamed from: o.setTitleMarginStart$IconCompatParcelizer */
    public interface IconCompatParcelizer {
        void write();
    }

    /* renamed from: o.setTitleMarginStart$write */
    public interface write {
        String MediaDescriptionCompat();
    }

    public abstract boolean IconCompatParcelizer();

    public abstract List<Fragment> MediaBrowserCompat$CustomActionResultReceiver();

    public abstract write MediaBrowserCompat$ItemReceiver(int i);

    public abstract void MediaBrowserCompat$ItemReceiver(IconCompatParcelizer iconCompatParcelizer);

    public abstract boolean MediaBrowserCompat$ItemReceiver();

    public abstract boolean MediaMetadataCompat();

    public abstract void RatingCompat();

    public abstract Fragment findFragmentById(int i);

    public abstract Fragment findFragmentByTag(String str);

    public abstract CardView read();

    public abstract void read(Bundle bundle, String str, Fragment fragment);

    public abstract void read(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract int write();

    public abstract Fragment.IconCompatParcelizer write(Fragment fragment);

    public abstract Fragment write(Bundle bundle, String str);

    public abstract void write(int i);
}

package p040o;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p040o.ScriptGroup;

/* renamed from: o.addInput$MediaBrowserCompat$ItemReceiver */
public class addInput$MediaBrowserCompat$ItemReceiver extends getGlobal {
    public final /* bridge */ /* synthetic */ void read(RecyclerView.setContentView setcontentview) {
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(ScriptGroup.ConnectLine connectLine) {
        addInvoke addinvoke = (addInvoke) connectLine;
        setSwitchPadding write = SwitchCompat.write(addinvoke.MediaBrowserCompat$ItemReceiver.write);
        write.IconCompatParcelizer(1.0f);
        write.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$SearchResultReceiver());
        write(addinvoke, addinvoke.MediaBrowserCompat$ItemReceiver, write);
    }

    public addInput$MediaBrowserCompat$ItemReceiver(seperateArgsAndBindings seperateargsandbindings) {
        super(seperateargsandbindings);
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview) {
        RatingCompat(setcontentview);
        setcontentview.write.setAlpha(BitmapDescriptorFactory.HUE_RED);
        MediaBrowserCompat$ItemReceiver(new addInvoke(setcontentview));
        return true;
    }

    public final /* synthetic */ void write(ScriptGroup.ConnectLine connectLine, RecyclerView.setContentView setcontentview) {
        setcontentview.write.setAlpha(1.0f);
    }

    public final /* synthetic */ void MediaBrowserCompat$ItemReceiver(RecyclerView.setContentView setcontentview) {
        setcontentview.write.setAlpha(1.0f);
    }
}

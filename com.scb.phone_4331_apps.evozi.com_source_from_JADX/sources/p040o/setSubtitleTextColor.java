package p040o;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: o.setSubtitleTextColor */
public abstract class setSubtitleTextColor extends setNavigationIcon {
    private int RatingCompat;
    private int read;
    private LayoutInflater write;

    @Deprecated
    public setSubtitleTextColor(Context context, int i) {
        super(context, (Cursor) null, true);
        this.read = i;
        this.RatingCompat = i;
        this.write = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public View write(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.write.inflate(this.RatingCompat, viewGroup, false);
    }

    public final View read(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.write.inflate(this.read, viewGroup, false);
    }
}

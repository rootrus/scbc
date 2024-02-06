package p040o;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;

/* renamed from: o.ViewStubCompat */
public abstract class ViewStubCompat {
    public abstract boolean IconCompatParcelizer();

    public abstract View read(int i);

    public Fragment IconCompatParcelizer(Context context, String str, Bundle bundle) {
        return Fragment.instantiate(context, str, bundle);
    }
}

package p040o;

import android.content.Context;
import android.widget.ArrayAdapter;
import com.scb.phone.R;

/* renamed from: o.MailingAddressApi */
public final class MailingAddressApi extends ArrayAdapter<String> {
    private int IconCompatParcelizer;
    public getIdClass MediaBrowserCompat$CustomActionResultReceiver;

    public MailingAddressApi(Context context, int i) {
        super(context, R.layout.f84842131493711);
        this.IconCompatParcelizer = i;
    }

    public final int getCount() {
        return this.IconCompatParcelizer;
    }

    public final /* synthetic */ Object getItem(int i) {
        getIdClass getidclass = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (getidclass != null) {
            return getidclass.read(i);
        }
        return (String) super.getItem(i);
    }
}

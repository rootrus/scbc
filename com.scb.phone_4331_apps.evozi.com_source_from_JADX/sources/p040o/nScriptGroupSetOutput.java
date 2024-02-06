package p040o;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: o.nScriptGroupSetOutput */
public final class nScriptGroupSetOutput extends FragmentBuilder_BindPrepaidActivateEmptyStateFragment implements nScriptCCreate {
    public nScriptGroupSetOutput(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.appupdate.protocol.IAppUpdateService");
    }

    public final void write(String str, Bundle bundle, getFirstName getfirstname) throws RemoteException {
        Parcel MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver();
        MediaBrowserCompat$ItemReceiver.writeString(str);
        MediaBrowserCompat$ItemReceiver.writeInt(1);
        bundle.writeToParcel(MediaBrowserCompat$ItemReceiver, 0);
        MediaBrowserCompat$ItemReceiver.writeStrongBinder(getfirstname.asBinder());
        IconCompatParcelizer(2, MediaBrowserCompat$ItemReceiver);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, Bundle bundle, getFirstName getfirstname) throws RemoteException {
        Parcel MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver();
        MediaBrowserCompat$ItemReceiver.writeString(str);
        MediaBrowserCompat$ItemReceiver.writeInt(1);
        bundle.writeToParcel(MediaBrowserCompat$ItemReceiver, 0);
        MediaBrowserCompat$ItemReceiver.writeStrongBinder(getfirstname.asBinder());
        IconCompatParcelizer(3, MediaBrowserCompat$ItemReceiver);
    }
}

package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.writeUInt64NoTag;

/* renamed from: o.G */
public final /* synthetic */ class C3418G implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setImageBitmapInternal MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ getResourcesIdentifier read;
    private final /* synthetic */ getSharedPrefs write;

    public /* synthetic */ C3418G(setImageBitmapInternal setimagebitmapinternal, getSharedPrefs getsharedprefs, getResourcesIdentifier getresourcesidentifier) {
        this.MediaBrowserCompat$CustomActionResultReceiver = setimagebitmapinternal;
        this.write = getsharedprefs;
        this.read = getresourcesidentifier;
    }

    public final void IconCompatParcelizer(Object obj) {
        setImageBitmapInternal setimagebitmapinternal = this.MediaBrowserCompat$CustomActionResultReceiver;
        getSharedPrefs getsharedprefs = this.write;
        getResourcesIdentifier getresourcesidentifier = this.read;
        CheckExtractActivity_MembersInjector.setItemInvoker setiteminvoker = (CheckExtractActivity_MembersInjector.setItemInvoker) obj;
        setiteminvoker.read(leastOf.MediaBrowserCompat$ItemReceiver((getStringsFileValue) getsharedprefs));
        setiteminvoker.read(usingToString.read(getsharedprefs));
        setiteminvoker.IconCompatParcelizer(getresourcesidentifier.MediaBrowserCompat$ItemReceiver);
        setiteminvoker.IconCompatParcelizer(getsharedprefs.read);
        setimagebitmapinternal.write = getsharedprefs.read;
    }
}

package p040o;

import p040o.CameraSource;

/* renamed from: o.setFilledIconRes */
public final class setFilledIconRes<T> implements CameraSource.CameraSourceException.IconCompatParcelizer<T, T> {
    private setInnerColors<? super T, Boolean> read;

    public final /* synthetic */ Object MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        CustomCheckboxGroupView_ViewBinding customCheckboxGroupView_ViewBinding = (CustomCheckboxGroupView_ViewBinding) obj;
        setFilledIconRes$MediaBrowserCompat$CustomActionResultReceiver setfillediconres_mediabrowsercompat_customactionresultreceiver = new setFilledIconRes$MediaBrowserCompat$CustomActionResultReceiver(customCheckboxGroupView_ViewBinding, this.read);
        customCheckboxGroupView_ViewBinding.read.MediaBrowserCompat$ItemReceiver(setfillediconres_mediabrowsercompat_customactionresultreceiver);
        return setfillediconres_mediabrowsercompat_customactionresultreceiver;
    }

    public setFilledIconRes(setInnerColors<? super T, Boolean> setinnercolors) {
        this.read = setinnercolors;
    }
}

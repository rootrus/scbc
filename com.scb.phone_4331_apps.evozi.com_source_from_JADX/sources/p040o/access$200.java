package p040o;

import p040o.Api;
import p040o.onLoadFinished;
import p040o.stopAutoManage;

/* renamed from: o.access$200 */
public final class access$200 extends stopAutoManage.IconCompatParcelizer {
    public final boolean MediaBrowserCompat$ItemReceiver;

    access$200(createFailedResult$MediaBrowserCompat$ItemReceiver createfailedresult_mediabrowsercompat_itemreceiver, boolean z) {
        super(createfailedresult_mediabrowsercompat_itemreceiver);
        this.MediaBrowserCompat$ItemReceiver = z;
    }

    public final void IconCompatParcelizer() {
        for (Api.ApiOptions.Optional.IconCompatParcelizer iconCompatParcelizer : read()) {
            if (iconCompatParcelizer != null) {
                iconCompatParcelizer.read = ((iconCompatParcelizer.MediaBrowserCompat$ItemReceiver / 30) * 3) + (iconCompatParcelizer.write / 3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final onLoadFinished.write write() {
        Api.ApiOptions.Optional.IconCompatParcelizer[] read = read();
        getXEnd getxend = new getXEnd();
        getXEnd getxend2 = new getXEnd();
        getXEnd getxend3 = new getXEnd();
        getXEnd getxend4 = new getXEnd();
        for (Api.ApiOptions.Optional.IconCompatParcelizer iconCompatParcelizer : read) {
            if (iconCompatParcelizer != null) {
                iconCompatParcelizer.read = ((iconCompatParcelizer.MediaBrowserCompat$ItemReceiver / 30) * 3) + (iconCompatParcelizer.write / 3);
                int i = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver % 30;
                int i2 = iconCompatParcelizer.read;
                if (!this.MediaBrowserCompat$ItemReceiver) {
                    i2 += 2;
                }
                int i3 = i2 % 3;
                if (i3 == 0) {
                    getxend2.MediaBrowserCompat$ItemReceiver((i * 3) + 1);
                } else if (i3 == 1) {
                    getxend4.MediaBrowserCompat$ItemReceiver(i / 3);
                    getxend3.MediaBrowserCompat$ItemReceiver(i % 3);
                } else if (i3 == 2) {
                    getxend.MediaBrowserCompat$ItemReceiver(i + 1);
                }
            }
        }
        if (getxend.MediaBrowserCompat$ItemReceiver().length == 0 || getxend2.MediaBrowserCompat$ItemReceiver().length == 0 || getxend3.MediaBrowserCompat$ItemReceiver().length == 0 || getxend4.MediaBrowserCompat$ItemReceiver().length == 0 || getxend.MediaBrowserCompat$ItemReceiver()[0] <= 0 || getxend2.MediaBrowserCompat$ItemReceiver()[0] + getxend3.MediaBrowserCompat$ItemReceiver()[0] < 3 || getxend2.MediaBrowserCompat$ItemReceiver()[0] + getxend3.MediaBrowserCompat$ItemReceiver()[0] > 90) {
            return null;
        }
        onLoadFinished.write write = new onLoadFinished.write(getxend.MediaBrowserCompat$ItemReceiver()[0], getxend2.MediaBrowserCompat$ItemReceiver()[0], getxend3.MediaBrowserCompat$ItemReceiver()[0], getxend4.MediaBrowserCompat$ItemReceiver()[0]);
        read(read, write);
        return write;
    }

    public final void read(Api.ApiOptions.Optional.IconCompatParcelizer[] iconCompatParcelizerArr, onLoadFinished.write write) {
        for (int i = 0; i < iconCompatParcelizerArr.length; i++) {
            Api.ApiOptions.Optional.IconCompatParcelizer iconCompatParcelizer = iconCompatParcelizerArr[i];
            if (iconCompatParcelizerArr[i] != null) {
                int i2 = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver % 30;
                int i3 = iconCompatParcelizer.read;
                if (i3 > write.IconCompatParcelizer) {
                    iconCompatParcelizerArr[i] = null;
                } else {
                    if (!this.MediaBrowserCompat$ItemReceiver) {
                        i3 += 2;
                    }
                    int i4 = i3 % 3;
                    if (i4 != 0) {
                        if (i4 != 1) {
                            if (i4 == 2 && i2 + 1 != write.MediaBrowserCompat$ItemReceiver) {
                                iconCompatParcelizerArr[i] = null;
                            }
                        } else if (i2 / 3 != write.write || i2 % 3 != write.MediaBrowserCompat$CustomActionResultReceiver) {
                            iconCompatParcelizerArr[i] = null;
                        }
                    } else if ((i2 * 3) + 1 != write.read) {
                        iconCompatParcelizerArr[i] = null;
                    }
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IsLeft: ");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(10);
        sb.append(super.toString());
        return sb.toString();
    }
}

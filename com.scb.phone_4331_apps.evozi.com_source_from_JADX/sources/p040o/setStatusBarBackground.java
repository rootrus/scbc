package p040o;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: o.setStatusBarBackground */
public final class setStatusBarBackground {
    public final setAutoSizeTextTypeWithDefaults<RecyclerView.setContentView> read = new setAutoSizeTextTypeWithDefaults<>();
    public final setTextAppearance<RecyclerView.setContentView, C1539x5a6c48da> write = new setTextAppearance<>();

    /* renamed from: o.setStatusBarBackground$IconCompatParcelizer */
    public interface IconCompatParcelizer {
        void IconCompatParcelizer(RecyclerView.setContentView setcontentview, RecyclerView.MediaMetadataCompat.IconCompatParcelizer iconCompatParcelizer, RecyclerView.MediaMetadataCompat.IconCompatParcelizer iconCompatParcelizer2);

        void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview);

        void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, RecyclerView.MediaMetadataCompat.IconCompatParcelizer iconCompatParcelizer, RecyclerView.MediaMetadataCompat.IconCompatParcelizer iconCompatParcelizer2);

        void read(RecyclerView.setContentView setcontentview, RecyclerView.MediaMetadataCompat.IconCompatParcelizer iconCompatParcelizer, RecyclerView.MediaMetadataCompat.IconCompatParcelizer iconCompatParcelizer2);
    }

    public final void IconCompatParcelizer(RecyclerView.setContentView setcontentview, RecyclerView.MediaMetadataCompat.IconCompatParcelizer iconCompatParcelizer) {
        C1539x5a6c48da setstatusbarbackground_mediabrowsercompat_customactionresultreceiver = this.write.get(setcontentview);
        if (setstatusbarbackground_mediabrowsercompat_customactionresultreceiver == null) {
            setstatusbarbackground_mediabrowsercompat_customactionresultreceiver = C1539x5a6c48da.write();
            this.write.put(setcontentview, setstatusbarbackground_mediabrowsercompat_customactionresultreceiver);
        }
        setstatusbarbackground_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer = iconCompatParcelizer;
        setstatusbarbackground_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver |= 4;
    }

    public final RecyclerView.MediaMetadataCompat.IconCompatParcelizer MediaBrowserCompat$ItemReceiver(RecyclerView.setContentView setcontentview, int i) {
        int i2;
        C1539x5a6c48da setstatusbarbackground_mediabrowsercompat_customactionresultreceiver;
        RecyclerView.MediaMetadataCompat.IconCompatParcelizer iconCompatParcelizer;
        setTextAppearance<RecyclerView.setContentView, C1539x5a6c48da> settextappearance = this.write;
        if (setcontentview == null) {
            i2 = settextappearance.IconCompatParcelizer();
        } else {
            i2 = settextappearance.read((Object) setcontentview, setcontentview.hashCode());
        }
        if (i2 < 0 || (setstatusbarbackground_mediabrowsercompat_customactionresultreceiver = (C1539x5a6c48da) this.write.read[(i2 << 1) + 1]) == null || (setstatusbarbackground_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver & i) == 0) {
            return null;
        }
        setstatusbarbackground_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver &= ~i;
        if (i == 4) {
            iconCompatParcelizer = setstatusbarbackground_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer;
        } else if (i == 8) {
            iconCompatParcelizer = setstatusbarbackground_mediabrowsercompat_customactionresultreceiver.write;
        } else {
            throw new IllegalArgumentException("Must provide flag PRE or POST");
        }
        if ((setstatusbarbackground_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver & 12) == 0) {
            this.write.write(i2);
            C1539x5a6c48da.MediaBrowserCompat$ItemReceiver(setstatusbarbackground_mediabrowsercompat_customactionresultreceiver);
        }
        return iconCompatParcelizer;
    }

    public final void read(RecyclerView.setContentView setcontentview, RecyclerView.MediaMetadataCompat.IconCompatParcelizer iconCompatParcelizer) {
        C1539x5a6c48da setstatusbarbackground_mediabrowsercompat_customactionresultreceiver = this.write.get(setcontentview);
        if (setstatusbarbackground_mediabrowsercompat_customactionresultreceiver == null) {
            setstatusbarbackground_mediabrowsercompat_customactionresultreceiver = C1539x5a6c48da.write();
            this.write.put(setcontentview, setstatusbarbackground_mediabrowsercompat_customactionresultreceiver);
        }
        setstatusbarbackground_mediabrowsercompat_customactionresultreceiver.write = iconCompatParcelizer;
        setstatusbarbackground_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver |= 8;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview) {
        C1539x5a6c48da setstatusbarbackground_mediabrowsercompat_customactionresultreceiver = this.write.get(setcontentview);
        if (setstatusbarbackground_mediabrowsercompat_customactionresultreceiver == null) {
            setstatusbarbackground_mediabrowsercompat_customactionresultreceiver = C1539x5a6c48da.write();
            this.write.put(setcontentview, setstatusbarbackground_mediabrowsercompat_customactionresultreceiver);
        }
        setstatusbarbackground_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver |= 1;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer iconCompatParcelizer) {
        for (int size = this.write.size() - 1; size >= 0; size--) {
            RecyclerView.setContentView setcontentview = (RecyclerView.setContentView) this.write.read[size << 1];
            C1539x5a6c48da write2 = this.write.write(size);
            if ((write2.MediaBrowserCompat$ItemReceiver & 3) == 3) {
                iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(setcontentview);
            } else if ((write2.MediaBrowserCompat$ItemReceiver & 1) != 0) {
                if (write2.IconCompatParcelizer == null) {
                    iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(setcontentview);
                } else {
                    iconCompatParcelizer.read(setcontentview, write2.IconCompatParcelizer, write2.write);
                }
            } else if ((write2.MediaBrowserCompat$ItemReceiver & 14) == 14) {
                iconCompatParcelizer.IconCompatParcelizer(setcontentview, write2.IconCompatParcelizer, write2.write);
            } else if ((write2.MediaBrowserCompat$ItemReceiver & 12) == 12) {
                iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(setcontentview, write2.IconCompatParcelizer, write2.write);
            } else if ((write2.MediaBrowserCompat$ItemReceiver & 4) != 0) {
                iconCompatParcelizer.read(setcontentview, write2.IconCompatParcelizer, (RecyclerView.MediaMetadataCompat.IconCompatParcelizer) null);
            } else if ((write2.MediaBrowserCompat$ItemReceiver & 8) != 0) {
                iconCompatParcelizer.IconCompatParcelizer(setcontentview, write2.IconCompatParcelizer, write2.write);
            }
            C1539x5a6c48da.MediaBrowserCompat$ItemReceiver(write2);
        }
    }

    public final void write(RecyclerView.setContentView setcontentview) {
        setAutoSizeTextTypeWithDefaults<RecyclerView.setContentView> setautosizetexttypewithdefaults = this.read;
        if (setautosizetexttypewithdefaults.MediaBrowserCompat$CustomActionResultReceiver) {
            setautosizetexttypewithdefaults.write();
        }
        int i = setautosizetexttypewithdefaults.IconCompatParcelizer - 1;
        while (true) {
            if (i < 0) {
                break;
            }
            setAutoSizeTextTypeWithDefaults<RecyclerView.setContentView> setautosizetexttypewithdefaults2 = this.read;
            if (setautosizetexttypewithdefaults2.MediaBrowserCompat$CustomActionResultReceiver) {
                setautosizetexttypewithdefaults2.write();
            }
            if (setcontentview == setautosizetexttypewithdefaults2.MediaBrowserCompat$ItemReceiver[i]) {
                setAutoSizeTextTypeWithDefaults<RecyclerView.setContentView> setautosizetexttypewithdefaults3 = this.read;
                Object[] objArr = setautosizetexttypewithdefaults3.MediaBrowserCompat$ItemReceiver;
                Object obj = objArr[i];
                Object obj2 = setAutoSizeTextTypeWithDefaults.read;
                if (obj != obj2) {
                    objArr[i] = obj2;
                    setautosizetexttypewithdefaults3.MediaBrowserCompat$CustomActionResultReceiver = true;
                }
            } else {
                i--;
            }
        }
        C1539x5a6c48da remove = this.write.remove(setcontentview);
        if (remove != null) {
            C1539x5a6c48da.MediaBrowserCompat$ItemReceiver(remove);
        }
    }
}

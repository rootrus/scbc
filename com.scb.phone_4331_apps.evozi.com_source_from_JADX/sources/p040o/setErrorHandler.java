package p040o;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.zxing.NotFoundException;
import java.util.Map;

/* renamed from: o.setErrorHandler */
public final class setErrorHandler {
    public final rsnScriptSetVarI MediaBrowserCompat$ItemReceiver;
    public final onActivityStarted$MediaBrowserCompat$CustomActionResultReceiver write;

    public setErrorHandler(rsnScriptSetVarI rsnscriptsetvari) throws NotFoundException {
        this.MediaBrowserCompat$ItemReceiver = rsnscriptsetvari;
        this.write = new onActivityStarted$MediaBrowserCompat$CustomActionResultReceiver(rsnscriptsetvari);
    }

    public static void MediaBrowserCompat$ItemReceiver(Map<rsnScriptForEach, Integer> map, rsnScriptForEach rsnscriptforeach) {
        Integer num = map.get(rsnscriptforeach);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        map.put(rsnscriptforeach, Integer.valueOf(i));
    }

    public static rsnScriptSetVarI MediaBrowserCompat$ItemReceiver(rsnScriptSetVarI rsnscriptsetvari, rsnScriptForEach rsnscriptforeach, rsnScriptForEach rsnscriptforeach2, rsnScriptForEach rsnscriptforeach3, rsnScriptForEach rsnscriptforeach4, int i, int i2) throws NotFoundException {
        rsnScriptForEach rsnscriptforeach5 = rsnscriptforeach;
        rsnScriptForEach rsnscriptforeach6 = rsnscriptforeach2;
        rsnScriptForEach rsnscriptforeach7 = rsnscriptforeach3;
        rsnScriptForEach rsnscriptforeach8 = rsnscriptforeach4;
        float f = ((float) i) - 0.5f;
        float f2 = ((float) i2) - 0.5f;
        return rsnScriptReduce.MediaBrowserCompat$CustomActionResultReceiver().IconCompatParcelizer(rsnscriptsetvari, i, i2, 0.5f, 0.5f, f, 0.5f, f, f2, 0.5f, f2, rsnscriptforeach5.MediaBrowserCompat$CustomActionResultReceiver, rsnscriptforeach5.read, rsnscriptforeach8.MediaBrowserCompat$CustomActionResultReceiver, rsnscriptforeach8.read, rsnscriptforeach7.MediaBrowserCompat$CustomActionResultReceiver, rsnscriptforeach7.read, rsnscriptforeach6.MediaBrowserCompat$CustomActionResultReceiver, rsnscriptforeach6.read);
    }

    /* renamed from: o.setErrorHandler$write */
    public static final class write {
        public final int IconCompatParcelizer;
        public final rsnScriptForEach MediaBrowserCompat$CustomActionResultReceiver;
        public final rsnScriptForEach read;

        /* synthetic */ write(rsnScriptForEach rsnscriptforeach, rsnScriptForEach rsnscriptforeach2, int i, byte b) {
            this(rsnscriptforeach, rsnscriptforeach2, i);
        }

        private write(rsnScriptForEach rsnscriptforeach, rsnScriptForEach rsnscriptforeach2, int i) {
            this.MediaBrowserCompat$CustomActionResultReceiver = rsnscriptforeach;
            this.read = rsnscriptforeach2;
            this.IconCompatParcelizer = i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append("/");
            sb.append(this.read);
            sb.append('/');
            sb.append(this.IconCompatParcelizer);
            return sb.toString();
        }
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver(rsnScriptForEach rsnscriptforeach) {
        return rsnscriptforeach.MediaBrowserCompat$CustomActionResultReceiver >= BitmapDescriptorFactory.HUE_RED && rsnscriptforeach.MediaBrowserCompat$CustomActionResultReceiver < ((float) this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer) && rsnscriptforeach.read > BitmapDescriptorFactory.HUE_RED && rsnscriptforeach.read < ((float) this.MediaBrowserCompat$ItemReceiver.write);
    }

    public final write read(rsnScriptForEach rsnscriptforeach, rsnScriptForEach rsnscriptforeach2) {
        setErrorHandler seterrorhandler = this;
        rsnScriptForEach rsnscriptforeach3 = rsnscriptforeach;
        rsnScriptForEach rsnscriptforeach4 = rsnscriptforeach2;
        int i = (int) rsnscriptforeach3.MediaBrowserCompat$CustomActionResultReceiver;
        int i2 = (int) rsnscriptforeach3.read;
        int i3 = (int) rsnscriptforeach4.MediaBrowserCompat$CustomActionResultReceiver;
        int i4 = (int) rsnscriptforeach4.read;
        int i5 = 1;
        boolean z = Math.abs(i4 - i2) > Math.abs(i3 - i);
        if (z) {
            int i6 = i2;
            i2 = i;
            i = i6;
            int i7 = i4;
            i4 = i3;
            i3 = i7;
        }
        int abs = Math.abs(i3 - i);
        int abs2 = Math.abs(i4 - i2);
        int i8 = (-abs) / 2;
        int i9 = i2 < i4 ? 1 : -1;
        if (i >= i3) {
            i5 = -1;
        }
        boolean MediaBrowserCompat$ItemReceiver2 = seterrorhandler.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(z ? i2 : i, z ? i : i2);
        int i10 = 0;
        while (i != i3) {
            int i11 = i3;
            boolean MediaBrowserCompat$ItemReceiver3 = seterrorhandler.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(z ? i2 : i, z ? i : i2);
            if (MediaBrowserCompat$ItemReceiver3 != MediaBrowserCompat$ItemReceiver2) {
                i10++;
                MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver3;
            }
            i8 += abs2;
            if (i8 > 0) {
                if (i2 == i4) {
                    break;
                }
                i2 += i9;
                i8 -= abs;
            }
            i += i5;
            seterrorhandler = this;
            i3 = i11;
        }
        return new write(rsnscriptforeach3, rsnscriptforeach4, i10, (byte) 0);
    }
}

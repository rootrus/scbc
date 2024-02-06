package p040o;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import org.bouncycastle.asn1.eac.EACTags;

/* renamed from: o.rsnScriptGroupCreate */
public final class rsnScriptGroupCreate {
    private static final int[][] IconCompatParcelizer;
    static final int[][] MediaBrowserCompat$CustomActionResultReceiver;
    static final int[][] MediaBrowserCompat$ItemReceiver = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};
    static final String[] read = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};
    final byte[] write;

    static {
        int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, new int[]{5, 256});
        IconCompatParcelizer = iArr;
        iArr[0][32] = 1;
        for (int i = 65; i <= 90; i++) {
            IconCompatParcelizer[0][i] = (i - 65) + 2;
        }
        IconCompatParcelizer[1][32] = 1;
        for (int i2 = 97; i2 <= 122; i2++) {
            IconCompatParcelizer[1][i2] = (i2 - 97) + 2;
        }
        IconCompatParcelizer[2][32] = 1;
        for (int i3 = 48; i3 <= 57; i3++) {
            IconCompatParcelizer[2][i3] = (i3 - 48) + 2;
        }
        int[][] iArr2 = IconCompatParcelizer;
        iArr2[2][44] = 12;
        iArr2[2][46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, EACTags.DYNAMIC_AUTHENTIFICATION_TEMPLATE, 126, 127};
        for (int i4 = 0; i4 < 28; i4++) {
            IconCompatParcelizer[3][iArr3[i4]] = i4;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, EACTags.SECURITY_ENVIRONMENT_TEMPLATE, 125};
        for (int i5 = 0; i5 < 31; i5++) {
            if (iArr4[i5] > 0) {
                IconCompatParcelizer[4][iArr4[i5]] = i5;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance(Integer.TYPE, new int[]{6, 6});
        MediaBrowserCompat$CustomActionResultReceiver = iArr5;
        for (int[] fill : iArr5) {
            Arrays.fill(fill, -1);
        }
        int[][] iArr6 = MediaBrowserCompat$CustomActionResultReceiver;
        iArr6[0][4] = 0;
        iArr6[1][4] = 0;
        iArr6[1][0] = 28;
        iArr6[3][4] = 0;
        iArr6[2][4] = 0;
        iArr6[2][0] = 15;
    }

    public rsnScriptGroupCreate(byte[] bArr) {
        this.write = bArr;
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(rsnScriptGroupSetOutput rsnscriptgroupsetoutput, int i, Collection<rsnScriptGroupSetOutput> collection) {
        char c = (char) (this.write[i] & 255);
        boolean z = IconCompatParcelizer[rsnscriptgroupsetoutput.MediaBrowserCompat$ItemReceiver][c] > 0;
        rsnScriptGroupSetOutput rsnscriptgroupsetoutput2 = null;
        for (int i2 = 0; i2 <= 4; i2++) {
            int i3 = IconCompatParcelizer[i2][c];
            if (i3 > 0) {
                if (rsnscriptgroupsetoutput2 == null) {
                    rsnscriptgroupsetoutput2 = rsnscriptgroupsetoutput.MediaBrowserCompat$CustomActionResultReceiver(i);
                }
                if (!z || i2 == rsnscriptgroupsetoutput.MediaBrowserCompat$ItemReceiver || i2 == 2) {
                    collection.add(rsnscriptgroupsetoutput2.MediaBrowserCompat$CustomActionResultReceiver(i2, i3));
                }
                if (!z && MediaBrowserCompat$CustomActionResultReceiver[rsnscriptgroupsetoutput.MediaBrowserCompat$ItemReceiver][i2] >= 0) {
                    collection.add(rsnscriptgroupsetoutput2.IconCompatParcelizer(i2, i3));
                }
            }
        }
        if (rsnscriptgroupsetoutput.write > 0 || IconCompatParcelizer[rsnscriptgroupsetoutput.MediaBrowserCompat$ItemReceiver][c] == 0) {
            collection.add(rsnscriptgroupsetoutput.read(i));
        }
    }

    static Collection<rsnScriptGroupSetOutput> MediaBrowserCompat$ItemReceiver(Iterable<rsnScriptGroupSetOutput> iterable, int i, int i2) {
        LinkedList linkedList = new LinkedList();
        for (rsnScriptGroupSetOutput next : iterable) {
            rsnScriptGroupSetOutput MediaBrowserCompat$CustomActionResultReceiver2 = next.MediaBrowserCompat$CustomActionResultReceiver(i);
            linkedList.add(MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver(4, i2));
            if (next.MediaBrowserCompat$ItemReceiver != 4) {
                linkedList.add(MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer(4, i2));
            }
            if (i2 == 3 || i2 == 4) {
                linkedList.add(MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver(2, 16 - i2).MediaBrowserCompat$CustomActionResultReceiver(2, 1));
            }
            if (next.write > 0) {
                linkedList.add(next.read(i).read(i + 1));
            }
        }
        return MediaBrowserCompat$ItemReceiver(linkedList);
    }

    static Collection<rsnScriptGroupSetOutput> MediaBrowserCompat$ItemReceiver(Iterable<rsnScriptGroupSetOutput> iterable) {
        boolean z;
        LinkedList linkedList = new LinkedList();
        for (rsnScriptGroupSetOutput next : iterable) {
            Iterator it = linkedList.iterator();
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                rsnScriptGroupSetOutput rsnscriptgroupsetoutput = (rsnScriptGroupSetOutput) it.next();
                if (rsnscriptgroupsetoutput.IconCompatParcelizer(next)) {
                    z = false;
                    break;
                } else if (next.IconCompatParcelizer(rsnscriptgroupsetoutput)) {
                    it.remove();
                }
            }
            if (z) {
                linkedList.add(next);
            }
        }
        return linkedList;
    }
}

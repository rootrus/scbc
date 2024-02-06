package p040o;

import java.io.PrintWriter;

/* renamed from: o.setInputType */
public final class setInputType {
    private static final Object IconCompatParcelizer = new Object();
    private static char[] read = new char[24];

    private static int write(char[] cArr, int i, char c, int i2, boolean z, int i3) {
        int i4;
        if (!z && i <= 0) {
            return i2;
        }
        if ((!z || i3 < 3) && i <= 99) {
            i4 = i2;
        } else {
            int i5 = i / 100;
            cArr[i2] = (char) (i5 + 48);
            i4 = i2 + 1;
            i -= i5 * 100;
        }
        if ((z && i3 >= 2) || i > 9 || i2 != i4) {
            int i6 = i / 10;
            cArr[i4] = (char) (i6 + 48);
            i4++;
            i -= i6 * 10;
        }
        cArr[i4] = (char) (i + 48);
        int i7 = i4 + 1;
        cArr[i7] = c;
        return i7 + 1;
    }

    private static int MediaBrowserCompat$CustomActionResultReceiver(long j, int i) {
        char c;
        int i2;
        int i3;
        int i4;
        int i5;
        if (read.length < 0) {
            read = new char[0];
        }
        char[] cArr = read;
        int i6 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i6 == 0) {
            cArr[0] = '0';
            return 1;
        }
        if (i6 > 0) {
            c = '+';
        } else {
            c = '-';
            j = -j;
        }
        int i7 = (int) (j % 1000);
        int floor = (int) Math.floor((double) (j / 1000));
        if (floor > 86400) {
            i2 = floor / 86400;
            floor -= 86400 * i2;
        } else {
            i2 = 0;
        }
        if (floor > 3600) {
            i3 = floor / 3600;
            floor -= i3 * 3600;
        } else {
            i3 = 0;
        }
        if (floor > 60) {
            int i8 = floor / 60;
            i5 = floor - (i8 * 60);
            i4 = i8;
        } else {
            i5 = floor;
            i4 = 0;
        }
        cArr[0] = c;
        int write = write(cArr, i2, 'd', 1, false, 0);
        int write2 = write(cArr, i3, 'h', write, write != 1, 0);
        int write3 = write(cArr, i4, 'm', write2, write2 != 1, 0);
        char[] cArr2 = cArr;
        int write4 = write(cArr2, i7, 'm', write(cArr2, i5, 's', write3, write3 != 1, 0), true, 0);
        cArr[write4] = 's';
        return write4 + 1;
    }

    private static void MediaBrowserCompat$CustomActionResultReceiver(long j, PrintWriter printWriter) {
        synchronized (IconCompatParcelizer) {
            printWriter.print(new String(read, 0, MediaBrowserCompat$CustomActionResultReceiver(j, 0)));
        }
    }

    public static void MediaBrowserCompat$ItemReceiver(long j, PrintWriter printWriter) {
        MediaBrowserCompat$CustomActionResultReceiver(j, printWriter);
    }

    public static void write(long j, long j2, PrintWriter printWriter) {
        if (j == 0) {
            printWriter.print("--");
        } else {
            MediaBrowserCompat$CustomActionResultReceiver(j - j2, printWriter);
        }
    }
}

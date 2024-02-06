package p040o;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* renamed from: o.NsipPaymentLandingActivity */
public final class NsipPaymentLandingActivity implements HowToAddAccountStep2Activity {
    private final ShortcutRouterActivity IconCompatParcelizer;
    private byte MediaBrowserCompat$CustomActionResultReceiver;
    private final CRC32 MediaBrowserCompat$ItemReceiver = new CRC32();
    private final Inflater read;
    private final PayNowReviewActivity write;

    public NsipPaymentLandingActivity(HowToAddAccountStep2Activity howToAddAccountStep2Activity) {
        onGetStartedClick.write((Object) howToAddAccountStep2Activity, "source");
        this.IconCompatParcelizer = new ShortcutRouterActivity(howToAddAccountStep2Activity);
        Inflater inflater = new Inflater(true);
        this.read = inflater;
        this.write = new PayNowReviewActivity(this.IconCompatParcelizer, inflater);
    }

    public final long read(SCBUniversalWebViewActivity sCBUniversalWebViewActivity, long j) throws IOException {
        long j2;
        SCBUniversalWebViewActivity sCBUniversalWebViewActivity2 = sCBUniversalWebViewActivity;
        long j3 = j;
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity2, "sink");
        int i = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
        boolean z = false;
        if (!(i >= 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(j3);
            throw new IllegalArgumentException(sb.toString().toString());
        } else if (i == 0) {
            return 0;
        } else {
            if (this.MediaBrowserCompat$CustomActionResultReceiver == 0) {
                if (this.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver(10)) {
                    byte read2 = this.IconCompatParcelizer.write.read(3);
                    boolean z2 = ((read2 >> 1) & 1) == 1;
                    if (z2) {
                        write(this.IconCompatParcelizer.write, 0, 10);
                    }
                    ShortcutRouterActivity shortcutRouterActivity = this.IconCompatParcelizer;
                    shortcutRouterActivity.MediaDescriptionCompat(2);
                    IconCompatParcelizer("ID1ID2", 8075, shortcutRouterActivity.write.setHasDecor());
                    this.IconCompatParcelizer.MediaBrowserCompat$MediaItem(8);
                    if (((read2 >> 2) & 1) == 1) {
                        this.IconCompatParcelizer.MediaDescriptionCompat(2);
                        if (z2) {
                            write(this.IconCompatParcelizer.write, 0, 2);
                        }
                        short hasDecor = this.IconCompatParcelizer.write.setHasDecor() & 65535;
                        long j4 = (long) ((short) (((hasDecor & 65280) >>> 8) | ((hasDecor & 255) << 8)));
                        this.IconCompatParcelizer.MediaDescriptionCompat(j4);
                        if (z2) {
                            j2 = j4;
                            write(this.IconCompatParcelizer.write, 0, j4);
                        } else {
                            j2 = j4;
                        }
                        this.IconCompatParcelizer.MediaBrowserCompat$MediaItem(j2);
                    }
                    if (((read2 >> 3) & 1) == 1) {
                        long MediaBrowserCompat$ItemReceiver2 = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver();
                        if (MediaBrowserCompat$ItemReceiver2 != -1) {
                            if (z2) {
                                write(this.IconCompatParcelizer.write, 0, MediaBrowserCompat$ItemReceiver2 + 1);
                            }
                            this.IconCompatParcelizer.MediaBrowserCompat$MediaItem(MediaBrowserCompat$ItemReceiver2 + 1);
                        } else {
                            throw new EOFException();
                        }
                    }
                    if (((read2 >> 4) & 1) == 1) {
                        z = true;
                    }
                    if (z) {
                        long MediaBrowserCompat$ItemReceiver3 = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver();
                        if (MediaBrowserCompat$ItemReceiver3 != -1) {
                            if (z2) {
                                write(this.IconCompatParcelizer.write, 0, MediaBrowserCompat$ItemReceiver3 + 1);
                            }
                            this.IconCompatParcelizer.MediaBrowserCompat$MediaItem(MediaBrowserCompat$ItemReceiver3 + 1);
                        } else {
                            throw new EOFException();
                        }
                    }
                    if (z2) {
                        ShortcutRouterActivity shortcutRouterActivity2 = this.IconCompatParcelizer;
                        shortcutRouterActivity2.MediaDescriptionCompat(2);
                        short hasDecor2 = shortcutRouterActivity2.write.setHasDecor() & 65535;
                        IconCompatParcelizer("FHCRC", (short) (((hasDecor2 & 65280) >>> 8) | ((hasDecor2 & 255) << 8)), (short) ((int) this.MediaBrowserCompat$ItemReceiver.getValue()));
                        this.MediaBrowserCompat$ItemReceiver.reset();
                    }
                    this.MediaBrowserCompat$CustomActionResultReceiver = 1;
                } else {
                    throw new EOFException();
                }
            }
            if (this.MediaBrowserCompat$CustomActionResultReceiver == 1) {
                long j5 = sCBUniversalWebViewActivity2.read;
                long read3 = this.write.read(sCBUniversalWebViewActivity2, j3);
                if (read3 != -1) {
                    write(sCBUniversalWebViewActivity, j5, read3);
                    return read3;
                }
                this.MediaBrowserCompat$CustomActionResultReceiver = 2;
            }
            if (this.MediaBrowserCompat$CustomActionResultReceiver == 2) {
                ShortcutRouterActivity shortcutRouterActivity3 = this.IconCompatParcelizer;
                shortcutRouterActivity3.MediaDescriptionCompat(4);
                IconCompatParcelizer("CRC", shortcutRouterActivity3.write.MediaSessionCompat$ResultReceiverWrapper(), (int) this.MediaBrowserCompat$ItemReceiver.getValue());
                ShortcutRouterActivity shortcutRouterActivity4 = this.IconCompatParcelizer;
                shortcutRouterActivity4.MediaDescriptionCompat(4);
                IconCompatParcelizer("ISIZE", shortcutRouterActivity4.write.MediaSessionCompat$ResultReceiverWrapper(), (int) this.read.getBytesWritten());
                this.MediaBrowserCompat$CustomActionResultReceiver = 3;
                if (!this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    public final PinChangeActivity_ViewBinding timeout() {
        return this.IconCompatParcelizer.timeout();
    }

    public final void close() throws IOException {
        this.write.close();
    }

    private final void write(SCBUniversalWebViewActivity sCBUniversalWebViewActivity, long j, long j2) {
        PersonalizeActivity personalizeActivity = sCBUniversalWebViewActivity.write;
        if (personalizeActivity == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        while (j >= ((long) (personalizeActivity.write - personalizeActivity.read))) {
            j -= (long) (personalizeActivity.write - personalizeActivity.read);
            personalizeActivity = personalizeActivity.MediaBrowserCompat$ItemReceiver;
            if (personalizeActivity == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
        }
        while (j2 > 0) {
            int i = (int) (((long) personalizeActivity.read) + j);
            int min = (int) Math.min((long) (personalizeActivity.write - i), j2);
            this.MediaBrowserCompat$ItemReceiver.update(personalizeActivity.MediaBrowserCompat$CustomActionResultReceiver, i, min);
            j2 -= (long) min;
            personalizeActivity = personalizeActivity.MediaBrowserCompat$ItemReceiver;
            if (personalizeActivity == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            j = 0;
        }
    }

    private static void IconCompatParcelizer(String str, int i, int i2) {
        if (i2 != i) {
            String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3));
            onGetStartedClick.IconCompatParcelizer((Object) format, "java.lang.String.format(this, *args)");
            throw new IOException(format);
        }
    }
}

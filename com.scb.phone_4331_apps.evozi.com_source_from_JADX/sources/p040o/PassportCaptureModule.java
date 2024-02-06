package p040o;

import com.google.zxing.ChecksumException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import java.util.ArrayList;
import java.util.List;
import p040o.CrashlyticsController;
import p040o.zziu;

/* renamed from: o.PassportCaptureModule */
public interface PassportCaptureModule extends CheckCaptureModule_GetICheckDeserializerRttiFactory {

    /* renamed from: o.PassportCaptureModule$KtaExceptionResponseDeserializer */
    public interface KtaExceptionResponseDeserializer extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer(String str, String str2, String str3);

        void IconCompatParcelizer(getFiles getfiles);

        void write();

        void write(String str);
    }

    /* renamed from: o.PassportCaptureModule$RttiExceptionResponseDeserializer */
    public interface RttiExceptionResponseDeserializer extends getExtractionType {
        void IconCompatParcelizer(String str, String str2);

        void IconCompatParcelizer(getPageID$MediaBrowserCompat$ItemReceiver getpageid_mediabrowsercompat_itemreceiver);

        void MediaBrowserCompat$SearchResultReceiver(String str);

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        void mo37808x50fd9e4a();

        void MediaDescriptionCompat();

        void MediaDescriptionCompat(String str);

        void MediaSessionCompat$QueueItem();

        void MediaSessionCompat$Token();

        void RatingCompat();

        void read(getFatalSessionFilesDir getfatalsessionfilesdir);

        void read(boolean z);

        void write(String str);
    }

    /* renamed from: o.PassportCaptureModule$a */
    public interface C6974a extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer();

        void MediaBrowserCompat$CustomActionResultReceiver(listCompleteSessionFiles listcompletesessionfiles);
    }

    /* renamed from: o.PassportCaptureModule$c */
    public interface C6976c extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer(String str);

        void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsController.C322720 r1);

        void MediaBrowserCompat$CustomActionResultReceiver(handleUncaughtException handleuncaughtexception);

        void MediaBrowserCompat$ItemReceiver();

        void MediaBrowserCompat$ItemReceiver(Boolean bool);

        void aK_();

        void read();

        void write();

        void write(String str);
    }

    void IconCompatParcelizer(String str);

    /* renamed from: o.PassportCaptureModule$b */
    public interface C6975b extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer();

        void MediaBrowserCompat$CustomActionResultReceiver(zziu.zzc zzc, boolean z);

        void MediaBrowserCompat$ItemReceiver();

        void read(String str, String str2, String str3);

        /* renamed from: o.PassportCaptureModule$b$IconCompatParcelizer */
        public static final class IconCompatParcelizer {
            private final List<int[]> IconCompatParcelizer = new ArrayList();
            private final List<String> write = new ArrayList();

            public final String read(String str) {
                int[] iArr;
                int i;
                synchronized (this) {
                    if (this.IconCompatParcelizer.isEmpty()) {
                        this.IconCompatParcelizer.add(new int[]{0, 19});
                        this.write.add("US/CA");
                        this.IconCompatParcelizer.add(new int[]{30, 39});
                        this.write.add("US");
                        this.IconCompatParcelizer.add(new int[]{60, 139});
                        this.write.add("US/CA");
                        this.IconCompatParcelizer.add(new int[]{300, 379});
                        this.write.add("FR");
                        this.IconCompatParcelizer.add(new int[]{380});
                        this.write.add("BG");
                        this.IconCompatParcelizer.add(new int[]{383});
                        this.write.add("SI");
                        this.IconCompatParcelizer.add(new int[]{385});
                        this.write.add("HR");
                        this.IconCompatParcelizer.add(new int[]{387});
                        this.write.add("BA");
                        this.IconCompatParcelizer.add(new int[]{400, 440});
                        this.write.add("DE");
                        this.IconCompatParcelizer.add(new int[]{450, 459});
                        this.write.add("JP");
                        this.IconCompatParcelizer.add(new int[]{460, 469});
                        this.write.add("RU");
                        this.IconCompatParcelizer.add(new int[]{471});
                        this.write.add("TW");
                        this.IconCompatParcelizer.add(new int[]{474});
                        this.write.add("EE");
                        this.IconCompatParcelizer.add(new int[]{475});
                        this.write.add("LV");
                        this.IconCompatParcelizer.add(new int[]{476});
                        this.write.add("AZ");
                        this.IconCompatParcelizer.add(new int[]{477});
                        this.write.add("LT");
                        this.IconCompatParcelizer.add(new int[]{478});
                        this.write.add("UZ");
                        this.IconCompatParcelizer.add(new int[]{479});
                        this.write.add("LK");
                        this.IconCompatParcelizer.add(new int[]{480});
                        this.write.add("PH");
                        this.IconCompatParcelizer.add(new int[]{481});
                        this.write.add("BY");
                        this.IconCompatParcelizer.add(new int[]{482});
                        this.write.add("UA");
                        this.IconCompatParcelizer.add(new int[]{484});
                        this.write.add("MD");
                        this.IconCompatParcelizer.add(new int[]{485});
                        this.write.add("AM");
                        this.IconCompatParcelizer.add(new int[]{486});
                        this.write.add("GE");
                        this.IconCompatParcelizer.add(new int[]{487});
                        this.write.add("KZ");
                        this.IconCompatParcelizer.add(new int[]{489});
                        this.write.add("HK");
                        this.IconCompatParcelizer.add(new int[]{490, 499});
                        this.write.add("JP");
                        this.IconCompatParcelizer.add(new int[]{500, 509});
                        this.write.add("GB");
                        this.IconCompatParcelizer.add(new int[]{520});
                        this.write.add("GR");
                        this.IconCompatParcelizer.add(new int[]{528});
                        this.write.add("LB");
                        this.IconCompatParcelizer.add(new int[]{529});
                        this.write.add("CY");
                        this.IconCompatParcelizer.add(new int[]{531});
                        this.write.add("MK");
                        this.IconCompatParcelizer.add(new int[]{535});
                        this.write.add("MT");
                        this.IconCompatParcelizer.add(new int[]{539});
                        this.write.add("IE");
                        this.IconCompatParcelizer.add(new int[]{540, 549});
                        this.write.add("BE/LU");
                        this.IconCompatParcelizer.add(new int[]{560});
                        this.write.add("PT");
                        this.IconCompatParcelizer.add(new int[]{569});
                        this.write.add("IS");
                        this.IconCompatParcelizer.add(new int[]{570, 579});
                        this.write.add("DK");
                        this.IconCompatParcelizer.add(new int[]{590});
                        this.write.add("PL");
                        this.IconCompatParcelizer.add(new int[]{594});
                        this.write.add("RO");
                        this.IconCompatParcelizer.add(new int[]{599});
                        this.write.add("HU");
                        this.IconCompatParcelizer.add(new int[]{600, 601});
                        this.write.add("ZA");
                        this.IconCompatParcelizer.add(new int[]{603});
                        this.write.add("GH");
                        this.IconCompatParcelizer.add(new int[]{608});
                        this.write.add("BH");
                        this.IconCompatParcelizer.add(new int[]{609});
                        this.write.add("MU");
                        this.IconCompatParcelizer.add(new int[]{611});
                        this.write.add("MA");
                        this.IconCompatParcelizer.add(new int[]{613});
                        this.write.add("DZ");
                        this.IconCompatParcelizer.add(new int[]{616});
                        this.write.add("KE");
                        this.IconCompatParcelizer.add(new int[]{618});
                        this.write.add("CI");
                        this.IconCompatParcelizer.add(new int[]{619});
                        this.write.add("TN");
                        this.IconCompatParcelizer.add(new int[]{621});
                        this.write.add("SY");
                        this.IconCompatParcelizer.add(new int[]{622});
                        this.write.add("EG");
                        this.IconCompatParcelizer.add(new int[]{624});
                        this.write.add("LY");
                        this.IconCompatParcelizer.add(new int[]{625});
                        this.write.add("JO");
                        this.IconCompatParcelizer.add(new int[]{626});
                        this.write.add("IR");
                        this.IconCompatParcelizer.add(new int[]{627});
                        this.write.add("KW");
                        this.IconCompatParcelizer.add(new int[]{628});
                        this.write.add("SA");
                        this.IconCompatParcelizer.add(new int[]{629});
                        this.write.add("AE");
                        this.IconCompatParcelizer.add(new int[]{640, 649});
                        this.write.add("FI");
                        this.IconCompatParcelizer.add(new int[]{690, 695});
                        this.write.add("CN");
                        this.IconCompatParcelizer.add(new int[]{700, 709});
                        this.write.add("NO");
                        this.IconCompatParcelizer.add(new int[]{729});
                        this.write.add("IL");
                        this.IconCompatParcelizer.add(new int[]{730, 739});
                        this.write.add("SE");
                        this.IconCompatParcelizer.add(new int[]{740});
                        this.write.add("GT");
                        this.IconCompatParcelizer.add(new int[]{741});
                        this.write.add("SV");
                        this.IconCompatParcelizer.add(new int[]{742});
                        this.write.add("HN");
                        this.IconCompatParcelizer.add(new int[]{743});
                        this.write.add("NI");
                        this.IconCompatParcelizer.add(new int[]{744});
                        this.write.add("CR");
                        this.IconCompatParcelizer.add(new int[]{745});
                        this.write.add("PA");
                        this.IconCompatParcelizer.add(new int[]{746});
                        this.write.add("DO");
                        this.IconCompatParcelizer.add(new int[]{750});
                        this.write.add("MX");
                        this.IconCompatParcelizer.add(new int[]{754, 755});
                        this.write.add("CA");
                        this.IconCompatParcelizer.add(new int[]{759});
                        this.write.add("VE");
                        this.IconCompatParcelizer.add(new int[]{760, 769});
                        this.write.add("CH");
                        this.IconCompatParcelizer.add(new int[]{770});
                        this.write.add("CO");
                        this.IconCompatParcelizer.add(new int[]{773});
                        this.write.add("UY");
                        this.IconCompatParcelizer.add(new int[]{775});
                        this.write.add("PE");
                        this.IconCompatParcelizer.add(new int[]{777});
                        this.write.add("BO");
                        this.IconCompatParcelizer.add(new int[]{779});
                        this.write.add("AR");
                        this.IconCompatParcelizer.add(new int[]{780});
                        this.write.add("CL");
                        this.IconCompatParcelizer.add(new int[]{784});
                        this.write.add("PY");
                        this.IconCompatParcelizer.add(new int[]{785});
                        this.write.add("PE");
                        this.IconCompatParcelizer.add(new int[]{786});
                        this.write.add("EC");
                        this.IconCompatParcelizer.add(new int[]{789, 790});
                        this.write.add("BR");
                        this.IconCompatParcelizer.add(new int[]{800, 839});
                        this.write.add("IT");
                        this.IconCompatParcelizer.add(new int[]{840, 849});
                        this.write.add("ES");
                        this.IconCompatParcelizer.add(new int[]{850});
                        this.write.add("CU");
                        this.IconCompatParcelizer.add(new int[]{858});
                        this.write.add("SK");
                        this.IconCompatParcelizer.add(new int[]{859});
                        this.write.add("CZ");
                        this.IconCompatParcelizer.add(new int[]{860});
                        this.write.add("YU");
                        this.IconCompatParcelizer.add(new int[]{865});
                        this.write.add("MN");
                        this.IconCompatParcelizer.add(new int[]{867});
                        this.write.add("KP");
                        this.IconCompatParcelizer.add(new int[]{868, 869});
                        this.write.add("TR");
                        this.IconCompatParcelizer.add(new int[]{870, 879});
                        this.write.add("NL");
                        this.IconCompatParcelizer.add(new int[]{880});
                        this.write.add("KR");
                        this.IconCompatParcelizer.add(new int[]{885});
                        this.write.add("TH");
                        this.IconCompatParcelizer.add(new int[]{888});
                        this.write.add("SG");
                        this.IconCompatParcelizer.add(new int[]{890});
                        this.write.add("IN");
                        this.IconCompatParcelizer.add(new int[]{893});
                        this.write.add("VN");
                        this.IconCompatParcelizer.add(new int[]{896});
                        this.write.add("PK");
                        this.IconCompatParcelizer.add(new int[]{899});
                        this.write.add("ID");
                        this.IconCompatParcelizer.add(new int[]{900, 919});
                        this.write.add("AT");
                        this.IconCompatParcelizer.add(new int[]{930, 939});
                        this.write.add("AU");
                        this.IconCompatParcelizer.add(new int[]{940, 949});
                        this.write.add("AZ");
                        this.IconCompatParcelizer.add(new int[]{955});
                        this.write.add("MY");
                        this.IconCompatParcelizer.add(new int[]{958});
                        this.write.add("MO");
                    }
                }
                int parseInt = Integer.parseInt(str.substring(0, 3));
                int size = this.IconCompatParcelizer.size();
                for (int i2 = 0; i2 < size && parseInt >= (i = iArr[0]); i2++) {
                    if ((iArr = this.IconCompatParcelizer.get(i2)).length != 1) {
                        i = iArr[1];
                    }
                    if (parseInt <= i) {
                        return this.write.get(i2);
                    }
                }
                return null;
            }
        }
    }

    /* renamed from: o.PassportCaptureModule$PassportOnDeviceExtractionServer */
    public interface PassportOnDeviceExtractionServer extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void MediaBrowserCompat$CustomActionResultReceiver();

        void MediaBrowserCompat$ItemReceiver(finalizeSessions finalizesessions);

        void read();

        /* renamed from: o.PassportCaptureModule$PassportOnDeviceExtractionServer$IconCompatParcelizer */
        public static final class IconCompatParcelizer {
            private final setLogLevel$MediaBrowserCompat$ItemReceiver IconCompatParcelizer = new setLogLevel$MediaBrowserCompat$ItemReceiver(rsnScriptSetVarObj.MediaBrowserCompat$MediaItem);

            public void IconCompatParcelizer(byte[] bArr, int i, int i2, int i3, int i4) throws ChecksumException {
                int i5 = i2 + i3;
                int i6 = i4 == 0 ? 1 : 2;
                int[] iArr = new int[(i5 / i6)];
                for (int i7 = 0; i7 < i5; i7++) {
                    if (i4 == 0 || i7 % 2 == i4 - 1) {
                        iArr[i7 / i6] = bArr[i7 + i] & 255;
                    }
                }
                try {
                    this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(iArr, i3 / i6);
                    for (int i8 = 0; i8 < i2; i8++) {
                        if (i4 == 0 || i8 % 2 == i4 - 1) {
                            bArr[i8 + i] = (byte) iArr[i8 / i6];
                        }
                    }
                } catch (ReedSolomonException unused) {
                    throw ChecksumException.write();
                }
            }
        }
    }
}

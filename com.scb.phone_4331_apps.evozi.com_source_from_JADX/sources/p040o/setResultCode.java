package p040o;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import okhttp3.internal.cache.DiskLruCache;
import org.threeten.p041bp.OffsetDateTime;
import p040o.AppBarLayout;
import p040o.BottomAppBar;
import p040o.CustomConcurrentHashMap;
import p040o.Enums;
import p040o.PassportCaptureModule;
import p040o.PhenotypeFlag;
import p040o.Serialization;
import p040o.setContentDescription;
import p040o.zzca;
import p040o.zzcz;
import p040o.zzjx;

/* renamed from: o.setResultCode */
public class setResultCode extends getPageID<PassportCaptureModule.RttiExceptionResponseDeserializer> {
    private final BottomAppBar.Behavior AppCompatActivity;
    public getConditionalUserPropertiesAs AppCompatDelegateImpl$ListMenuDecorView;
    cartesianProduct AppCompatDialogFragment;
    public final setContentScrimColor PlaybackStateCompat;
    setHideMotionSpecResource setBackgroundResource;
    /* access modifiers changed from: private */
    public List<String> setContentView;
    public setExpandedTitleTextColor setHasDecor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public setResultCode(RegularImmutableBiMap regularImmutableBiMap, setExpandedTitleMargin setexpandedtitlemargin, setCollapsedTitleTextColor setcollapsedtitletextcolor, AppBarLayout.ScrollingViewBehavior scrollingViewBehavior, Serialization.C37651 r9, setTextColor settextcolor, onProviderInstallFailed onproviderinstallfailed, PhenotypeFlag.zza zza, setScrimAnimationDuration setscrimanimationduration, setExpandedTitleMarginStart setexpandedtitlemarginstart, setScrimsShown setscrimsshown, setExpandedTitleTextColor setexpandedtitletextcolor, getConditionalUserPropertiesAs getconditionaluserpropertiesas, cartesianProduct cartesianproduct, setContentScrimColor setcontentscrimcolor, BottomAppBar.Behavior behavior, setHideMotionSpecResource sethidemotionspecresource, Enums.C33301 r22) {
        super(regularImmutableBiMap, setexpandedtitlemargin, setcollapsedtitletextcolor, scrollingViewBehavior, r9, settextcolor, onproviderinstallfailed, zza, setscrimanimationduration, setexpandedtitlemarginstart, setscrimsshown);
        this.setHasDecor = setexpandedtitletextcolor;
        this.AppCompatDelegateImpl$ListMenuDecorView = getconditionaluserpropertiesas;
        this.AppCompatDialogFragment = cartesianproduct;
        this.PlaybackStateCompat = setcontentscrimcolor;
        this.AppCompatActivity = behavior;
        this.setBackgroundResource = sethidemotionspecresource;
        this.MediaSessionCompat$QueueItem = Arrays.asList(new getPageID$MediaBrowserCompat$ItemReceiver[]{getPageID$MediaBrowserCompat$ItemReceiver.TITLE, getPageID$MediaBrowserCompat$ItemReceiver.FIRST_NAME, getPageID$MediaBrowserCompat$ItemReceiver.LAST_NAME, getPageID$MediaBrowserCompat$ItemReceiver.FIRST_NAME_ENGLISH, getPageID$MediaBrowserCompat$ItemReceiver.LAST_NAME_ENGLISH, getPageID$MediaBrowserCompat$ItemReceiver.MOBILE_NUMBER, getPageID$MediaBrowserCompat$ItemReceiver.HOME_ADDRESS, getPageID$MediaBrowserCompat$ItemReceiver.MAILING_ADDRESS, getPageID$MediaBrowserCompat$ItemReceiver.EMAIL, getPageID$MediaBrowserCompat$ItemReceiver.INCOMING, getPageID$MediaBrowserCompat$ItemReceiver.MARITAL_STATUS, getPageID$MediaBrowserCompat$ItemReceiver.EDUCATION_LEVEL, getPageID$MediaBrowserCompat$ItemReceiver.RESIDENCE_TYPE, getPageID$MediaBrowserCompat$ItemReceiver.NATIONAL_ID, getPageID$MediaBrowserCompat$ItemReceiver.LASER_ID, getPageID$MediaBrowserCompat$ItemReceiver.EXPIRY_DATE, getPageID$MediaBrowserCompat$ItemReceiver.ISSUE_DATE, getPageID$MediaBrowserCompat$ItemReceiver.BIRTH_DATE});
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        MediaBrowserCompat$CustomActionResultReceiver(z);
        BottomAppBar.Behavior behavior = this.AppCompatActivity;
        if (z) {
            setContentDescription MediaBrowserCompat$CustomActionResultReceiver = behavior.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(setContentDescription.write.HOME);
            if (MediaBrowserCompat$CustomActionResultReceiver != null) {
                behavior.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$CustomActionResultReceiver, setContentDescription.write.MAILING);
                return;
            }
            return;
        }
        behavior.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(setContentDescription.write.MAILING);
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        boolean z2 = true;
        if (z) {
            setInterimImageFileFormat setinterimimagefileformat = new setInterimImageFileFormat(this);
            if (this.RatingCompat == null) {
                z2 = false;
            }
            if (z2) {
                setinterimimagefileformat.IconCompatParcelizer(this.RatingCompat);
                return;
            }
            return;
        }
        read(getPageID$MediaBrowserCompat$ItemReceiver.MAILING_ADDRESS, false);
        setSourceServer setsourceserver = setSourceServer.IconCompatParcelizer;
        if (this.RatingCompat == null) {
            z2 = false;
        }
        if (z2) {
            setsourceserver.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public final void read(String str) {
        boolean z = true;
        if (str != null) {
            write(getPageID$MediaBrowserCompat$ItemReceiver.NATIONAL_ID, str.length() == 17, TextUtils.isEmpty(str));
        }
        saveBitmap savebitmap = new saveBitmap(str);
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            savebitmap.IconCompatParcelizer(this.RatingCompat);
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(String str, PassportCaptureModule.RttiExceptionResponseDeserializer rttiExceptionResponseDeserializer) {
        rttiExceptionResponseDeserializer.read(str != null && !str.isEmpty());
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void write(p040o.setResultCode r4, p040o.didCrashOnPreviousExecution r5, p040o.getFatalSessionFilesDir r6) {
        /*
            java.lang.String r0 = r6.ParcelableVolumeInfo
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x000e
            r0 = r1
            goto L_0x000f
        L_0x000e:
            r0 = r2
        L_0x000f:
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = r6.MediaSessionCompat$Token
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x001d
            r0 = r1
            goto L_0x001e
        L_0x001d:
            r0 = r2
        L_0x001e:
            if (r0 == 0) goto L_0x0034
            o.readBitmapFromFileBufferUsingIp r0 = new o.readBitmapFromFileBufferUsingIp
            r0.<init>(r6)
            T r3 = r4.RatingCompat
            if (r3 == 0) goto L_0x002b
            r3 = r1
            goto L_0x002c
        L_0x002b:
            r3 = r2
        L_0x002c:
            if (r3 == 0) goto L_0x0044
            T r3 = r4.RatingCompat
            r0.IconCompatParcelizer(r3)
            goto L_0x0044
        L_0x0034:
            o.loadBitmapFromFile r0 = p040o.loadBitmapFromFile.IconCompatParcelizer
            T r3 = r4.RatingCompat
            if (r3 == 0) goto L_0x003c
            r3 = r1
            goto L_0x003d
        L_0x003c:
            r3 = r2
        L_0x003d:
            if (r3 == 0) goto L_0x0044
            T r3 = r4.RatingCompat
            r0.IconCompatParcelizer(r3)
        L_0x0044:
            java.lang.String r0 = r6.IconCompatParcelizer
            if (r0 == 0) goto L_0x0050
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0050
            r0 = r1
            goto L_0x0051
        L_0x0050:
            r0 = r2
        L_0x0051:
            if (r0 == 0) goto L_0x0075
            java.lang.String r0 = r6.MediaBrowserCompat$ItemReceiver
            if (r0 == 0) goto L_0x005f
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x005f
            r0 = r1
            goto L_0x0060
        L_0x005f:
            r0 = r2
        L_0x0060:
            if (r0 == 0) goto L_0x0075
            o.loadScaledBitmap r0 = new o.loadScaledBitmap
            r0.<init>(r6)
            T r3 = r4.RatingCompat
            if (r3 == 0) goto L_0x006d
            r3 = r1
            goto L_0x006e
        L_0x006d:
            r3 = r2
        L_0x006e:
            if (r3 == 0) goto L_0x0075
            T r3 = r4.RatingCompat
            r0.IconCompatParcelizer(r3)
        L_0x0075:
            java.lang.String r0 = r6.PlaybackStateCompat$CustomAction
            if (r0 == 0) goto L_0x0081
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0081
            r0 = r1
            goto L_0x0082
        L_0x0081:
            r0 = r2
        L_0x0082:
            if (r0 == 0) goto L_0x00ad
            o.getPageID$MediaBrowserCompat$ItemReceiver r5 = p040o.getPageID$MediaBrowserCompat$ItemReceiver.TITLE
            r4.read(r5, r1)
            o.loadBitmapFromFileBuffer r5 = p040o.loadBitmapFromFileBuffer.MediaBrowserCompat$CustomActionResultReceiver
            T r0 = r4.RatingCompat
            if (r0 == 0) goto L_0x0091
            r0 = r1
            goto L_0x0092
        L_0x0091:
            r0 = r2
        L_0x0092:
            if (r0 == 0) goto L_0x0099
            T r0 = r4.RatingCompat
            r5.IconCompatParcelizer(r0)
        L_0x0099:
            o.rotateBitmap r5 = new o.rotateBitmap
            r5.<init>(r6)
            T r0 = r4.RatingCompat
            if (r0 == 0) goto L_0x00a4
            r0 = r1
            goto L_0x00a5
        L_0x00a4:
            r0 = r2
        L_0x00a5:
            if (r0 == 0) goto L_0x00c0
            T r0 = r4.RatingCompat
            r5.IconCompatParcelizer(r0)
            goto L_0x00c0
        L_0x00ad:
            o.getUseableImageMemoryLimits r0 = new o.getUseableImageMemoryLimits
            r0.<init>(r5)
            T r5 = r4.RatingCompat
            if (r5 == 0) goto L_0x00b8
            r5 = r1
            goto L_0x00b9
        L_0x00b8:
            r5 = r2
        L_0x00b9:
            if (r5 == 0) goto L_0x00c0
            T r5 = r4.RatingCompat
            r0.IconCompatParcelizer(r5)
        L_0x00c0:
            java.lang.Boolean r5 = r6.MediaSessionCompat$ResultReceiverWrapper
            if (r5 == 0) goto L_0x00cd
            java.lang.Boolean r5 = r6.MediaSessionCompat$ResultReceiverWrapper
            boolean r5 = r5.booleanValue()
            r4.MediaBrowserCompat$CustomActionResultReceiver(r5)
        L_0x00cd:
            java.lang.String r5 = r6.MediaBrowserCompat$SearchResultReceiver
            if (r5 == 0) goto L_0x00d8
            int r5 = r5.length()
            if (r5 == 0) goto L_0x00d8
            r1 = r2
        L_0x00d8:
            if (r1 != 0) goto L_0x00e1
            o.getPageID$MediaBrowserCompat$ItemReceiver r5 = p040o.getPageID$MediaBrowserCompat$ItemReceiver.INCOMING
            java.lang.String r6 = r6.MediaBrowserCompat$SearchResultReceiver
            r4.read(r5, r6, r2)
        L_0x00e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setResultCode.write(o.setResultCode, o.didCrashOnPreviousExecution, o.getFatalSessionFilesDir):void");
    }

    static /* synthetic */ void IconCompatParcelizer(setResultCode setresultcode, getFatalSessionFilesDir getfatalsessionfilesdir) {
        String str = getfatalsessionfilesdir.ParcelableVolumeInfo;
        boolean z = false;
        if (str != null && !str.isEmpty()) {
            getPageID$MediaBrowserCompat$ItemReceiver getpageid_mediabrowsercompat_itemreceiver = getPageID$MediaBrowserCompat$ItemReceiver.FIRST_NAME;
            loadBitmapFromURI loadbitmapfromuri = new loadBitmapFromURI(getpageid_mediabrowsercompat_itemreceiver);
            if (setresultcode.RatingCompat != null) {
                loadbitmapfromuri.IconCompatParcelizer(setresultcode.RatingCompat);
            }
            setresultcode.read(getpageid_mediabrowsercompat_itemreceiver, true);
        }
        String str2 = getfatalsessionfilesdir.MediaSessionCompat$Token;
        if (str2 != null && !str2.isEmpty()) {
            getPageID$MediaBrowserCompat$ItemReceiver getpageid_mediabrowsercompat_itemreceiver2 = getPageID$MediaBrowserCompat$ItemReceiver.LAST_NAME;
            loadBitmapFromURI loadbitmapfromuri2 = new loadBitmapFromURI(getpageid_mediabrowsercompat_itemreceiver2);
            if (setresultcode.RatingCompat != null) {
                loadbitmapfromuri2.IconCompatParcelizer(setresultcode.RatingCompat);
            }
            setresultcode.read(getpageid_mediabrowsercompat_itemreceiver2, true);
        }
        String str3 = getfatalsessionfilesdir.IconCompatParcelizer;
        if (str3 != null && !str3.isEmpty()) {
            getPageID$MediaBrowserCompat$ItemReceiver getpageid_mediabrowsercompat_itemreceiver3 = getPageID$MediaBrowserCompat$ItemReceiver.FIRST_NAME_ENGLISH;
            loadBitmapFromURI loadbitmapfromuri3 = new loadBitmapFromURI(getpageid_mediabrowsercompat_itemreceiver3);
            if (setresultcode.RatingCompat != null) {
                loadbitmapfromuri3.IconCompatParcelizer(setresultcode.RatingCompat);
            }
            setresultcode.read(getpageid_mediabrowsercompat_itemreceiver3, true);
        }
        String str4 = getfatalsessionfilesdir.MediaBrowserCompat$ItemReceiver;
        if (str4 != null && !str4.isEmpty()) {
            getPageID$MediaBrowserCompat$ItemReceiver getpageid_mediabrowsercompat_itemreceiver4 = getPageID$MediaBrowserCompat$ItemReceiver.LAST_NAME_ENGLISH;
            loadBitmapFromURI loadbitmapfromuri4 = new loadBitmapFromURI(getpageid_mediabrowsercompat_itemreceiver4);
            if (setresultcode.RatingCompat != null) {
                loadbitmapfromuri4.IconCompatParcelizer(setresultcode.RatingCompat);
            }
            setresultcode.read(getpageid_mediabrowsercompat_itemreceiver4, true);
        }
        String str5 = getfatalsessionfilesdir.write;
        if (str5 != null && !str5.isEmpty()) {
            getPageID$MediaBrowserCompat$ItemReceiver getpageid_mediabrowsercompat_itemreceiver5 = getPageID$MediaBrowserCompat$ItemReceiver.BIRTH_DATE;
            loadBitmapFromURI loadbitmapfromuri5 = new loadBitmapFromURI(getpageid_mediabrowsercompat_itemreceiver5);
            if (setresultcode.RatingCompat != null) {
                loadbitmapfromuri5.IconCompatParcelizer(setresultcode.RatingCompat);
            }
            setresultcode.read(getpageid_mediabrowsercompat_itemreceiver5, true);
        }
        String str6 = getfatalsessionfilesdir.MediaSessionCompat$QueueItem;
        if (str6 != null && !str6.isEmpty()) {
            getPageID$MediaBrowserCompat$ItemReceiver getpageid_mediabrowsercompat_itemreceiver6 = getPageID$MediaBrowserCompat$ItemReceiver.NATIONAL_ID;
            loadBitmapFromURI loadbitmapfromuri6 = new loadBitmapFromURI(getpageid_mediabrowsercompat_itemreceiver6);
            if (setresultcode.RatingCompat != null) {
                loadbitmapfromuri6.IconCompatParcelizer(setresultcode.RatingCompat);
            }
            setresultcode.read(getpageid_mediabrowsercompat_itemreceiver6, true);
        }
        String str7 = getfatalsessionfilesdir.MediaDescriptionCompat;
        if (str7 != null && !str7.isEmpty()) {
            getPageID$MediaBrowserCompat$ItemReceiver getpageid_mediabrowsercompat_itemreceiver7 = getPageID$MediaBrowserCompat$ItemReceiver.LASER_ID;
            loadBitmapFromURI loadbitmapfromuri7 = new loadBitmapFromURI(getpageid_mediabrowsercompat_itemreceiver7);
            if (setresultcode.RatingCompat != null) {
                loadbitmapfromuri7.IconCompatParcelizer(setresultcode.RatingCompat);
            }
            setresultcode.read(getpageid_mediabrowsercompat_itemreceiver7, true);
        }
        String str8 = getfatalsessionfilesdir.MediaBrowserCompat$MediaItem;
        if (str8 != null && !str8.isEmpty()) {
            getPageID$MediaBrowserCompat$ItemReceiver getpageid_mediabrowsercompat_itemreceiver8 = getPageID$MediaBrowserCompat$ItemReceiver.ISSUE_DATE;
            loadBitmapFromURI loadbitmapfromuri8 = new loadBitmapFromURI(getpageid_mediabrowsercompat_itemreceiver8);
            if (setresultcode.RatingCompat != null) {
                loadbitmapfromuri8.IconCompatParcelizer(setresultcode.RatingCompat);
            }
            setresultcode.read(getpageid_mediabrowsercompat_itemreceiver8, true);
        }
        String str9 = getfatalsessionfilesdir.read;
        if (str9 != null && !str9.isEmpty()) {
            getPageID$MediaBrowserCompat$ItemReceiver getpageid_mediabrowsercompat_itemreceiver9 = getPageID$MediaBrowserCompat$ItemReceiver.EXPIRY_DATE;
            loadBitmapFromURI loadbitmapfromuri9 = new loadBitmapFromURI(getpageid_mediabrowsercompat_itemreceiver9);
            if (setresultcode.RatingCompat != null) {
                z = true;
            }
            if (z) {
                loadbitmapfromuri9.IconCompatParcelizer(setresultcode.RatingCompat);
            }
            setresultcode.read(getpageid_mediabrowsercompat_itemreceiver9, true);
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(setResultCode setresultcode) {
        if (setresultcode.RatingCompat != null) {
            setresultcode.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void IconCompatParcelizer(setResultCode setresultcode) {
        if (setresultcode.RatingCompat != null) {
            setresultcode.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void write(setResultCode setresultcode) {
        getPageID$MediaBrowserCompat$ItemReceiver getpageid_mediabrowsercompat_itemreceiver = getPageID$MediaBrowserCompat$ItemReceiver.LAST_NAME;
        loadBitmapFromURI loadbitmapfromuri = new loadBitmapFromURI(getpageid_mediabrowsercompat_itemreceiver);
        boolean z = false;
        if (setresultcode.RatingCompat != null) {
            loadbitmapfromuri.IconCompatParcelizer(setresultcode.RatingCompat);
        }
        setresultcode.read(getpageid_mediabrowsercompat_itemreceiver, true);
        getPageID$MediaBrowserCompat$ItemReceiver getpageid_mediabrowsercompat_itemreceiver2 = getPageID$MediaBrowserCompat$ItemReceiver.FIRST_NAME;
        loadBitmapFromURI loadbitmapfromuri2 = new loadBitmapFromURI(getpageid_mediabrowsercompat_itemreceiver2);
        if (setresultcode.RatingCompat != null) {
            loadbitmapfromuri2.IconCompatParcelizer(setresultcode.RatingCompat);
        }
        setresultcode.read(getpageid_mediabrowsercompat_itemreceiver2, true);
        getPageID$MediaBrowserCompat$ItemReceiver getpageid_mediabrowsercompat_itemreceiver3 = getPageID$MediaBrowserCompat$ItemReceiver.FIRST_NAME_ENGLISH;
        loadBitmapFromURI loadbitmapfromuri3 = new loadBitmapFromURI(getpageid_mediabrowsercompat_itemreceiver3);
        if (setresultcode.RatingCompat != null) {
            loadbitmapfromuri3.IconCompatParcelizer(setresultcode.RatingCompat);
        }
        setresultcode.read(getpageid_mediabrowsercompat_itemreceiver3, true);
        getPageID$MediaBrowserCompat$ItemReceiver getpageid_mediabrowsercompat_itemreceiver4 = getPageID$MediaBrowserCompat$ItemReceiver.LAST_NAME_ENGLISH;
        loadBitmapFromURI loadbitmapfromuri4 = new loadBitmapFromURI(getpageid_mediabrowsercompat_itemreceiver4);
        if (setresultcode.RatingCompat != null) {
            loadbitmapfromuri4.IconCompatParcelizer(setresultcode.RatingCompat);
        }
        setresultcode.read(getpageid_mediabrowsercompat_itemreceiver4, true);
        getPageID$MediaBrowserCompat$ItemReceiver getpageid_mediabrowsercompat_itemreceiver5 = getPageID$MediaBrowserCompat$ItemReceiver.BIRTH_DATE;
        loadBitmapFromURI loadbitmapfromuri5 = new loadBitmapFromURI(getpageid_mediabrowsercompat_itemreceiver5);
        if (setresultcode.RatingCompat != null) {
            loadbitmapfromuri5.IconCompatParcelizer(setresultcode.RatingCompat);
        }
        setresultcode.read(getpageid_mediabrowsercompat_itemreceiver5, true);
        getPageID$MediaBrowserCompat$ItemReceiver getpageid_mediabrowsercompat_itemreceiver6 = getPageID$MediaBrowserCompat$ItemReceiver.NATIONAL_ID;
        loadBitmapFromURI loadbitmapfromuri6 = new loadBitmapFromURI(getpageid_mediabrowsercompat_itemreceiver6);
        if (setresultcode.RatingCompat != null) {
            loadbitmapfromuri6.IconCompatParcelizer(setresultcode.RatingCompat);
        }
        setresultcode.read(getpageid_mediabrowsercompat_itemreceiver6, true);
        getPageID$MediaBrowserCompat$ItemReceiver getpageid_mediabrowsercompat_itemreceiver7 = getPageID$MediaBrowserCompat$ItemReceiver.LASER_ID;
        loadBitmapFromURI loadbitmapfromuri7 = new loadBitmapFromURI(getpageid_mediabrowsercompat_itemreceiver7);
        if (setresultcode.RatingCompat != null) {
            loadbitmapfromuri7.IconCompatParcelizer(setresultcode.RatingCompat);
        }
        setresultcode.read(getpageid_mediabrowsercompat_itemreceiver7, true);
        getPageID$MediaBrowserCompat$ItemReceiver getpageid_mediabrowsercompat_itemreceiver8 = getPageID$MediaBrowserCompat$ItemReceiver.ISSUE_DATE;
        loadBitmapFromURI loadbitmapfromuri8 = new loadBitmapFromURI(getpageid_mediabrowsercompat_itemreceiver8);
        if (setresultcode.RatingCompat != null) {
            loadbitmapfromuri8.IconCompatParcelizer(setresultcode.RatingCompat);
        }
        setresultcode.read(getpageid_mediabrowsercompat_itemreceiver8, true);
        getPageID$MediaBrowserCompat$ItemReceiver getpageid_mediabrowsercompat_itemreceiver9 = getPageID$MediaBrowserCompat$ItemReceiver.EXPIRY_DATE;
        loadBitmapFromURI loadbitmapfromuri9 = new loadBitmapFromURI(getpageid_mediabrowsercompat_itemreceiver9);
        if (setresultcode.RatingCompat != null) {
            z = true;
        }
        if (z) {
            loadbitmapfromuri9.IconCompatParcelizer(setresultcode.RatingCompat);
        }
        setresultcode.read(getpageid_mediabrowsercompat_itemreceiver9, true);
    }

    public final /* synthetic */ hasResult write(boolean z, int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, setContentDescription setcontentdescription, setContentDescription setcontentdescription2, zzcz.zzg zzg) throws Exception {
        String str17;
        String str18;
        String str19;
        String str20;
        int i2;
        String str21;
        String str22;
        String str23;
        String str24 = str7;
        String str25 = str15;
        String str26 = str16;
        zzcz.zzg zzg2 = zzg;
        if (zzg2.RatingCompat != null) {
            str17 = zzg2.RatingCompat;
        } else {
            str17 = zzjx.zza.zzb.GENERAL.name();
        }
        double d = zzg2.MediaDescriptionCompat;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.getDefault());
        decimalFormatSymbols.setDecimalSeparator('.');
        String format = new DecimalFormat("#################0.00", decimalFormatSymbols).format(d);
        if (zzg2.MediaBrowserCompat$ItemReceiver != null) {
            str18 = zzg2.MediaBrowserCompat$ItemReceiver;
        } else {
            str18 = "";
        }
        if (zzg2.IconCompatParcelizer.write != null) {
            double doubleValue = zzg2.IconCompatParcelizer.write.doubleValue();
            DecimalFormatSymbols decimalFormatSymbols2 = new DecimalFormatSymbols(Locale.getDefault());
            decimalFormatSymbols2.setDecimalSeparator('.');
            str19 = new DecimalFormat("#################0.00", decimalFormatSymbols2).format(doubleValue);
        } else {
            str19 = "";
        }
        if (zzg2.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver != null) {
            str20 = zzg2.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
        } else {
            str20 = "";
        }
        CustomConcurrentHashMap.Strength.C33053 r13 = new Object(str19, str20) {
            @SerializedName("frequency")
            private final String MediaBrowserCompat$CustomActionResultReceiver;
            @SerializedName("amount")
            private final String read;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C33053)) {
                    return false;
                }
                C33053 r3 = (C33053) obj;
                return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) r3.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) r3.MediaBrowserCompat$CustomActionResultReceiver);
            }

            public final int hashCode() {
                String str = this.read;
                int i = 0;
                int hashCode = str != null ? str.hashCode() : 0;
                String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (str2 != null) {
                    i = str2.hashCode();
                }
                return (hashCode * 31) + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("InstallmentRequest(amount=");
                sb.append(this.read);
                sb.append(", frequency=");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                sb.append(")");
                return sb.toString();
            }

            {
                onGetStartedClick.write((Object) r2, "amount");
                onGetStartedClick.write((Object) r3, "frequency");
                this.read = r2;
                this.MediaBrowserCompat$CustomActionResultReceiver = r3;
            }
        };
        if (zzg2.MediaMetadataCompat != null) {
            i2 = zzg2.MediaMetadataCompat.intValue();
        } else {
            i2 = 0;
        }
        String num = Integer.toString(i2);
        double d2 = zzg2.MediaBrowserCompat$CustomActionResultReceiver;
        String str27 = num;
        DecimalFormatSymbols decimalFormatSymbols3 = new DecimalFormatSymbols(Locale.getDefault());
        decimalFormatSymbols3.setDecimalSeparator('.');
        String format2 = new DecimalFormat("#################0.00", decimalFormatSymbols3).format(d2);
        OffsetDateTime offsetDateTime = zzg2.ParcelableVolumeInfo;
        onGetStartedClick.write((Object) offsetDateTime, "date");
        String format3 = offsetDateTime == null ? null : offsetDateTime.format(GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSXXX").withZone(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding.m3070of("Asia/Bangkok")));
        onGetStartedClick.IconCompatParcelizer((Object) format3, "DateUtilities.transform(…           date\n        )");
        if (zzg2.read != null) {
            str21 = zzg2.read;
        } else {
            str21 = "";
        }
        String str28 = z ? DiskLruCache.VERSION_1 : "0";
        if (i >= 0) {
            str22 = str28;
            str23 = this.setContentView.get(i - 1);
        } else {
            str22 = str28;
            str23 = str;
        }
        String str29 = str21;
        String str30 = format3;
        String MediaBrowserCompat$ItemReceiver = CheckCaptureActivity.MediaBrowserCompat$ItemReceiver(str6, "dd/MM/yyyy", "yyyy-MM-dd", false);
        if (str24 != null && !str24.equals("")) {
            str24 = str24.replace("-", "");
        }
        String str31 = str24;
        zzca.zzc.zza IconCompatParcelizer = IconCompatParcelizer(setcontentdescription2);
        zzca.zzc.zza IconCompatParcelizer2 = IconCompatParcelizer(!z ? setcontentdescription : setcontentdescription2);
        String str32 = format2;
        zzjx.zzc zzc = new zzjx.zzc(MediaBrowserCompat$CustomActionResultReceiver(this.MediaSessionCompat$Token, str9), (String) null);
        CustomConcurrentHashMap.Strength.C33053 r18 = r13;
        String str33 = str18;
        zzjx.zzc zzc2 = new zzjx.zzc(MediaBrowserCompat$CustomActionResultReceiver(this.f2846x50fd9e4a, str10), (String) null);
        zzjx.zzc zzc3 = new zzjx.zzc(MediaBrowserCompat$CustomActionResultReceiver(this.read, str11), (String) null);
        double doubleValue2 = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(str12).doubleValue();
        String str34 = format;
        DecimalFormatSymbols decimalFormatSymbols4 = new DecimalFormatSymbols(Locale.getDefault());
        decimalFormatSymbols4.setDecimalSeparator('.');
        String format4 = new DecimalFormat("#################0.00", decimalFormatSymbols4).format(doubleValue2);
        String replace = str13.replace("-", "");
        onGetStartedClick.write((Object) str25, "date");
        String MediaBrowserCompat$ItemReceiver2 = CheckCaptureActivity.MediaBrowserCompat$ItemReceiver(str25, "dd/MM/yyyy", "yyyy-MM-dd", false);
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver2, "formatDate(\n            …,\n            false\n    )");
        onGetStartedClick.write((Object) str26, "date");
        String MediaBrowserCompat$ItemReceiver3 = CheckCaptureActivity.MediaBrowserCompat$ItemReceiver(str26, "dd/MM/yyyy", "yyyy-MM-dd", false);
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver3, "formatDate(\n            …,\n            false\n    )");
        return new hasResult(str17, str34, str33, r18, str27, str32, str30, str29, str22, new getElapsedRealtimeMillis(str23, str2, str3, str4, str5, MediaBrowserCompat$ItemReceiver, str31, str8, IconCompatParcelizer, IconCompatParcelizer2, zzc, zzc2, zzc3, format4, new getActivityConfidence(replace, str14, MediaBrowserCompat$ItemReceiver2, MediaBrowserCompat$ItemReceiver3)));
    }

    public final /* synthetic */ void IconCompatParcelizer(getProbableActivities getprobableactivities) throws Exception {
        this.ParcelableVolumeInfo = getprobableactivities.MediaSessionCompat$Token;
    }
}

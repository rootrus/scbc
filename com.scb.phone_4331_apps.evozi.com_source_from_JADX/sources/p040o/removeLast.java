package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.threeten.p041bp.OffsetDateTime;
import p040o.BinaryImagesConverter;
import p040o.CrashlyticsReport;
import p040o.CrashlyticsReportJsonTransform;
import p040o.Iterables;
import p040o.awaitEvenIfOnMainThread;
import p040o.standardStartAndWait;

/* renamed from: o.removeLast */
public final class removeLast extends constrainedListMultimap {
    private final String MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public removeLast(Resources resources, SharedPreferences sharedPreferences, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseAssetsURL") String str) {
        super(resources, sharedPreferences);
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
        onGetStartedClick.write((Object) str, "baseAssetsURL");
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    public final standardStartAndWait read(isClickable isclickable) {
        capSessionCount capsessioncount;
        onGetStartedClick.write((Object) isclickable, "entity");
        ArrayList arrayList = new ArrayList();
        ProcMapEntry procMapEntry = ProcMapEntry.DEFAULT;
        new Dependency();
        getZIndex getzindex = isclickable.IconCompatParcelizer;
        if (getzindex != null) {
            onGetStartedClick.write((Object) getzindex, "headerEntity");
            C10854optional optional = new C10854optional(getzindex.IconCompatParcelizer, getzindex.read, getzindex.write, getzindex.MediaBrowserCompat$ItemReceiver, getzindex.MediaBrowserCompat$CustomActionResultReceiver);
            onGetStartedClick.write((Object) optional, "header");
            if (optional.MediaBrowserCompat$ItemReceiver.length() > 0) {
                capSessionCount$MediaBrowserCompat$CustomActionResultReceiver read = capSessionCount.read();
                read.MediaMetadataCompat = optional.MediaBrowserCompat$CustomActionResultReceiver;
                read.MediaBrowserCompat$MediaItem = MediaMetadataCompat(optional.IconCompatParcelizer);
                read.read = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.ref_id, new Object[]{optional.write});
                read.IconCompatParcelizer = optional.MediaBrowserCompat$ItemReceiver;
                read.write = Iterables$3$MediaBrowserCompat$ItemReceiver.ic_check_circle_black_48dp;
                capsessioncount = new capSessionCount(read, CrashlyticsReportJsonTransform$$Lambda$1.REVAMP_SUCCESS_HEADER, (byte) 0);
                onGetStartedClick.IconCompatParcelizer((Object) capsessioncount, "ItemSuccessfulHeaderCust…pe.REVAMP_SUCCESS_HEADER)");
            } else {
                capSessionCount$MediaBrowserCompat$CustomActionResultReceiver read2 = capSessionCount.read();
                read2.MediaMetadataCompat = optional.MediaBrowserCompat$CustomActionResultReceiver;
                read2.read = MediaMetadataCompat(optional.IconCompatParcelizer);
                read2.IconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.ref_id, new Object[]{optional.write});
                read2.write = Iterables$3$MediaBrowserCompat$ItemReceiver.ic_check_circle_black_48dp;
                capsessioncount = new capSessionCount(read2, CrashlyticsReportJsonTransform$$Lambda$1.REVAMP_SUCCESS_HEADER, (byte) 0);
                onGetStartedClick.IconCompatParcelizer((Object) capsessioncount, "ItemSuccessfulHeaderCust…pe.REVAMP_SUCCESS_HEADER)");
            }
            arrayList.add(capsessioncount);
        }
        List<getJointType> list = isclickable.read;
        if (list != null) {
            arrayList.addAll(write(MediaBrowserCompat$CustomActionResultReceiver(list)));
        }
        try {
            procMapEntry = ProcMapEntry.valueOf(isclickable.write);
        } catch (IllegalArgumentException unused) {
        }
        standardStartAndWait.IconCompatParcelizer write = standardStartAndWait.write(arrayList, "slip");
        List<setMockMode> list2 = isclickable.MediaBrowserCompat$ItemReceiver;
        if (list2 != null) {
            write.write = read(list2);
        }
        write.MediaSessionCompat$ResultReceiverWrapper = procMapEntry;
        standardStartAndWait read3 = write.read();
        onGetStartedClick.IconCompatParcelizer((Object) read3, "successfulData.build()");
        return read3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0041, code lost:
        if ((r1.MediaBrowserCompat$CustomActionResultReceiver.length() == 0) != false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0054, code lost:
        if (r5 != false) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List<p040o.sanitizeAttribute> read(java.util.List<p040o.setMockMode> r8) {
        /*
            r7 = this;
            java.lang.String r0 = "footer"
            p040o.onGetStartedClick.write((java.lang.Object) r8, (java.lang.String) r0)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Iterator r8 = r8.iterator()
        L_0x0012:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0070
            java.lang.Object r1 = r8.next()
            o.setMockMode r1 = (p040o.setMockMode) r1
            java.lang.String r2 = "footerEntity"
            p040o.onGetStartedClick.write((java.lang.Object) r1, (java.lang.String) r2)
            java.lang.String r2 = r1.MediaBrowserCompat$ItemReceiver
            o.CrashlyticsReportJsonTransform$$Lambda$1 r2 = MediaDescriptionCompat(r2)
            o.CrashlyticsReportJsonTransform$$Lambda$1 r3 = p040o.CrashlyticsReportJsonTransform$$Lambda$1.FOOTER_CONTENT
            r4 = 0
            r5 = 1
            r6 = 0
            if (r2 == r3) goto L_0x0034
            o.CrashlyticsReportJsonTransform$$Lambda$1 r3 = p040o.CrashlyticsReportJsonTransform$$Lambda$1.FOOTER_REMARK
            if (r2 != r3) goto L_0x0044
        L_0x0034:
            java.lang.String r3 = r1.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0040
            r3 = r5
            goto L_0x0041
        L_0x0040:
            r3 = r6
        L_0x0041:
            if (r3 == 0) goto L_0x0044
            goto L_0x006a
        L_0x0044:
            o.CrashlyticsReportJsonTransform$$Lambda$1 r3 = p040o.CrashlyticsReportJsonTransform$$Lambda$1.FOOTER_IMAGE
            if (r2 != r3) goto L_0x0057
            java.lang.String r2 = r1.read
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r5 = r6
        L_0x0054:
            if (r5 == 0) goto L_0x0057
            goto L_0x006a
        L_0x0057:
            java.lang.String r2 = r1.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r3 = r1.MediaBrowserCompat$ItemReceiver
            o.CrashlyticsReportJsonTransform$$Lambda$1 r3 = MediaDescriptionCompat(r3)
            java.lang.String r1 = r1.read
            java.lang.String r1 = r7.MediaBrowserCompat$SearchResultReceiver(r1)
            o.sanitizeAttribute r4 = new o.sanitizeAttribute
            r4.<init>(r2, r3, r1)
        L_0x006a:
            if (r4 == 0) goto L_0x0012
            r0.add(r4)
            goto L_0x0012
        L_0x0070:
            java.util.List r0 = (java.util.List) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.removeLast.read(java.util.List):java.util.List");
    }

    private List<isLeaf> MediaBrowserCompat$CustomActionResultReceiver(List<getJointType> list) {
        onGetStartedClick.write((Object) list, "bodyEntity");
        Iterable<getJointType> iterable = list;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (getJointType getjointtype : iterable) {
            onGetStartedClick.write((Object) getjointtype, "bodyEntity");
            boolean z = getjointtype.IconCompatParcelizer;
            CrashlyticsReportJsonTransform.ObjectParser.write write = CrashlyticsReportJsonTransform.ObjectParser.MediaBrowserCompat$ItemReceiver;
            BinaryImagesConverter.FileIdStrategy MediaBrowserCompat$CustomActionResultReceiver = CrashlyticsReportJsonTransform.ObjectParser.write.MediaBrowserCompat$CustomActionResultReceiver(getjointtype.MediaMetadataCompat);
            CrashlyticsReportJsonTransform.ObjectParser.write write2 = CrashlyticsReportJsonTransform.ObjectParser.MediaBrowserCompat$ItemReceiver;
            BinaryImagesConverter.FileIdStrategy MediaBrowserCompat$CustomActionResultReceiver2 = CrashlyticsReportJsonTransform.ObjectParser.write.MediaBrowserCompat$CustomActionResultReceiver(getjointtype.RatingCompat);
            C3127x58232bf4 binaryImagesConverter$MediaBrowserCompat$CustomActionResultReceiver = BinaryImagesConverter.IconCompatParcelizer;
            arrayList.add(new isLeaf(z, MediaBrowserCompat$CustomActionResultReceiver, MediaBrowserCompat$CustomActionResultReceiver2, C3127x58232bf4.MediaBrowserCompat$ItemReceiver(getjointtype.MediaBrowserCompat$MediaItem), getjointtype.MediaBrowserCompat$CustomActionResultReceiver, getjointtype.MediaBrowserCompat$SearchResultReceiver, MediaBrowserCompat$ItemReceiver(getjointtype.MediaBrowserCompat$ItemReceiver), MediaBrowserCompat$SearchResultReceiver(getjointtype.write), getjointtype.MediaDescriptionCompat, getjointtype.read));
        }
        return (List) arrayList;
    }

    private static List<ForwardingFuture> write(List<isLeaf> list) {
        ForwardingFuture forwardingFuture;
        onGetStartedClick.write((Object) list, "body");
        ArrayList arrayList = new ArrayList();
        for (isLeaf next : list) {
            if (next.MediaBrowserCompat$CustomActionResultReceiver && next.MediaBrowserCompat$MediaItem != NativeFileUtils.UNKNOWN) {
                arrayList.add(new callTask(true));
            }
            if (next.MediaBrowserCompat$MediaItem == NativeFileUtils.TEXT_TWO_COLUMNS) {
                onGetStartedClick.write((Object) next, "item");
                awaitEvenIfOnMainThread.IconCompatParcelizer IconCompatParcelizer = awaitEvenIfOnMainThread.IconCompatParcelizer();
                IconCompatParcelizer.RatingCompat = next.IconCompatParcelizer;
                awaitEvenIfOnMainThread.IconCompatParcelizer iconCompatParcelizer = IconCompatParcelizer;
                iconCompatParcelizer.MediaMetadataCompat = next.MediaMetadataCompat;
                awaitEvenIfOnMainThread.IconCompatParcelizer iconCompatParcelizer2 = iconCompatParcelizer;
                if (next.write.length() > 0) {
                    iconCompatParcelizer2.MediaBrowserCompat$ItemReceiver = next.write;
                }
                if (next.read.length() > 0) {
                    iconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver = next.read;
                }
                if (next.RatingCompat == BinaryImagesConverter.FileIdStrategy.SMALL) {
                    iconCompatParcelizer2.ParcelableVolumeInfo = true;
                }
                if (next.MediaBrowserCompat$SearchResultReceiver == BinaryImagesConverter.FileIdStrategy.SMALL) {
                    iconCompatParcelizer2.MediaDescriptionCompat = true;
                }
                if (next.MediaBrowserCompat$ItemReceiver) {
                    iconCompatParcelizer2.MediaSessionCompat$Token = true;
                }
                awaitEvenIfOnMainThread awaitevenifonmainthread = new awaitEvenIfOnMainThread(iconCompatParcelizer2, (byte) 0);
                onGetStartedClick.IconCompatParcelizer((Object) awaitevenifonmainthread, "display.build()");
                arrayList.add(awaitevenifonmainthread);
            } else if (next.MediaBrowserCompat$MediaItem == NativeFileUtils.TEXT) {
                onGetStartedClick.write((Object) next, "item");
                if (next.MediaMetadataCompat.length() > 0) {
                    capFileCount$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver = capFileCount.MediaBrowserCompat$CustomActionResultReceiver();
                    MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat = next.IconCompatParcelizer;
                    MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = next.MediaMetadataCompat;
                    MediaBrowserCompat$CustomActionResultReceiver.write = Iterables.C35273.read.gray;
                    if (next.MediaBrowserCompat$ItemReceiver) {
                        MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat = true;
                    }
                    if (next.MediaBrowserCompat$SearchResultReceiver == BinaryImagesConverter.FileIdStrategy.SMALL) {
                        MediaBrowserCompat$CustomActionResultReceiver.RatingCompat = true;
                    }
                    if (next.RatingCompat == BinaryImagesConverter.FileIdStrategy.SMALL) {
                        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem = true;
                    }
                    forwardingFuture = new capFileCount(MediaBrowserCompat$CustomActionResultReceiver, (byte) 0);
                } else {
                    forwardingFuture = null;
                }
                if (forwardingFuture != null) {
                    arrayList.add(forwardingFuture);
                }
            } else if (next.MediaBrowserCompat$MediaItem == NativeFileUtils.MINI_QR) {
                onGetStartedClick.write((Object) next, "item");
                C3769x8df5a479 write = SessionReportingCoordinator$$Lambda$1.write();
                List<CrashlyticsReport.Session.OperatingSystem.Builder> singletonList = Collections.singletonList(new CrashlyticsReport.Session.OperatingSystem.Builder(next.MediaBrowserCompat$MediaItem.toString(), next.IconCompatParcelizer, (String) null, (String) null, (String) null, next.MediaDescriptionCompat));
                onGetStartedClick.IconCompatParcelizer((Object) singletonList, "java.util.Collections.singletonList(element)");
                write.MediaBrowserCompat$ItemReceiver = singletonList;
                SessionReportingCoordinator$$Lambda$1 sessionReportingCoordinator$$Lambda$1 = new SessionReportingCoordinator$$Lambda$1((C3769x8df5a479<?>) write);
                onGetStartedClick.IconCompatParcelizer((Object) sessionReportingCoordinator$$Lambda$1, "ItemAdditionalMetaDataCu…   )\n            .build()");
                arrayList.add(sessionReportingCoordinator$$Lambda$1);
            }
        }
        return arrayList;
    }

    private String MediaMetadataCompat(String str) {
        onGetStartedClick.write((Object) str, "strDate");
        if (str.length() == 0) {
            return str;
        }
        String IconCompatParcelizer = IconCompatParcelizer("dd MMM yyyy - HH:mm", OffsetDateTime.parse(CheckCaptureActivity.MediaBrowserCompat$CustomActionResultReceiver(str)));
        onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer, "transformToDateMonthYear…ies.formatDate(strDate)))");
        return IconCompatParcelizer;
    }

    private static CrashlyticsReportJsonTransform$$Lambda$1 MediaDescriptionCompat(String str) {
        onGetStartedClick.write((Object) str, "type");
        String lowerCase = str.toLowerCase();
        onGetStartedClick.IconCompatParcelizer((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
        int hashCode = lowerCase.hashCode();
        if (hashCode != -911436124) {
            if (hashCode != -314580553) {
                if (hashCode == 1670366677) {
                    boolean equals = lowerCase.equals("footer_content");
                }
            } else if (lowerCase.equals("footer_image")) {
                return CrashlyticsReportJsonTransform$$Lambda$1.FOOTER_IMAGE;
            }
        } else if (lowerCase.equals("footer_remark")) {
            return CrashlyticsReportJsonTransform$$Lambda$1.FOOTER_REMARK;
        }
        return CrashlyticsReportJsonTransform$$Lambda$1.FOOTER_CONTENT;
    }

    private String MediaBrowserCompat$SearchResultReceiver(String str) {
        onGetStartedClick.write((Object) str, "imageUrl");
        return ((str.length() == 0) || GoodToKnowActivity.read(str, "http", false)) ? str : onGetStartedClick.write(this.write.getString("BASE_ASSETS_URL", this.MediaBrowserCompat$ItemReceiver), (Object) str);
    }

    private static String MediaBrowserCompat$ItemReceiver(List<String> list) {
        onGetStartedClick.write((Object) list, "strList");
        StringBuilder sb = new StringBuilder("");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).length() > 0) {
                sb.append(list.get(i));
                if (i < size - 1) {
                    sb.append("\n");
                }
            }
        }
        String obj = sb.toString();
        onGetStartedClick.IconCompatParcelizer((Object) obj, "str.toString()");
        return obj;
    }
}

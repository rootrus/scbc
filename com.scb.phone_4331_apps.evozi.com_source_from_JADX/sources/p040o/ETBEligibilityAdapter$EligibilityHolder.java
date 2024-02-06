package p040o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Vector;
import okhttp3.internal.cache.DiskLruCache;
import org.ksoap2.SoapFault;
import org.ksoap2.SoapFault12;
import org.xmlpull.p042v1.XmlPullParser;
import org.xmlpull.p042v1.XmlPullParserException;
import org.xmlpull.p042v1.XmlSerializer;

/* renamed from: o.ETBEligibilityAdapter$EligibilityHolder */
public final class ETBEligibilityAdapter$EligibilityHolder extends IssuerSearchAdapter$CustomViewHolder {
    private static BusinessAndMaritalInfoYearMonthSelectorViewHolder RatingCompat = new BusinessAndMaritalInfoRadioChoiceViewHolder();
    private boolean MediaBrowserCompat$SearchResultReceiver = true;
    private Hashtable MediaDescriptionCompat = new Hashtable();
    private boolean MediaSessionCompat$QueueItem;
    private Hashtable MediaSessionCompat$ResultReceiverWrapper = new Hashtable();
    private Hashtable MediaSessionCompat$Token = new Hashtable();
    private Vector ParcelableVolumeInfo;

    public ETBEligibilityAdapter$EligibilityHolder() {
        super(120);
        new Hashtable();
        IconCompatParcelizer(this.write, "Array", ETBProductDetailAdapter$ETBProductDetailViewHolder.MediaBrowserCompat$SearchResultReceiver, (BusinessAndMaritalInfoYearMonthSelectorViewHolder) null);
        RatingCompat.MediaBrowserCompat$CustomActionResultReceiver(this);
    }

    public final void read(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        SoapFault soapFault;
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
        xmlPullParser.nextTag();
        if (xmlPullParser.getEventType() != 2 || !xmlPullParser.getNamespace().equals(this.MediaBrowserCompat$ItemReceiver) || !xmlPullParser.getName().equals("Fault")) {
            while (xmlPullParser.getEventType() == 2) {
                String attributeValue = xmlPullParser.getAttributeValue(this.write, "root");
                Object IconCompatParcelizer = IconCompatParcelizer(xmlPullParser, (Object) null, -1, xmlPullParser.getNamespace(), xmlPullParser.getName(), ETBProductDetailAdapter$ETBProductDetailViewHolder.write);
                if (DiskLruCache.VERSION_1.equals(attributeValue) || this.MediaBrowserCompat$CustomActionResultReceiver == null) {
                    this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
                }
                xmlPullParser.nextTag();
            }
            return;
        }
        if (this.read < 120) {
            soapFault = new SoapFault((byte) 0);
        } else {
            soapFault = new SoapFault12((byte) 0);
        }
        soapFault.write(xmlPullParser);
        this.MediaBrowserCompat$CustomActionResultReceiver = soapFault;
    }

    private void read(XmlPullParser xmlPullParser, BusinessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding businessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding) throws IOException, XmlPullParserException {
        int i;
        int nextTag;
        String str;
        int i2;
        String str2;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        BusinessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding businessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding2 = businessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding;
        try {
            i = xmlPullParser.nextTag();
        } catch (XmlPullParserException unused) {
            if (businessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding2 instanceof EBillSubscriptionAdapter$EBillSubscriptionItemHolder_ViewBinding) {
                EBillSubscriptionAdapter$EBillSubscriptionItemHolder_ViewBinding eBillSubscriptionAdapter$EBillSubscriptionItemHolder_ViewBinding = (EBillSubscriptionAdapter$EBillSubscriptionItemHolder_ViewBinding) businessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding2;
                if (xmlPullParser.getText() != null) {
                    str2 = xmlPullParser.getText();
                } else {
                    str2 = "";
                }
                eBillSubscriptionAdapter$EBillSubscriptionItemHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(str2);
            }
            i = xmlPullParser.nextTag();
        }
        while (i != 3) {
            String name = xmlPullParser.getName();
            if (!this.MediaSessionCompat$QueueItem || !(businessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding2 instanceof ETBDescriptionAdapter$DescriptionHolder)) {
                ETBProductDetailAdapter$ETBProductDetailViewHolder eTBProductDetailAdapter$ETBProductDetailViewHolder = new ETBProductDetailAdapter$ETBProductDetailViewHolder();
                int IconCompatParcelizer = businessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding.IconCompatParcelizer();
                int i3 = 0;
                boolean z = false;
                int i4 = 0;
                while (i4 < IconCompatParcelizer && !z) {
                    eTBProductDetailAdapter$ETBProductDetailViewHolder.ParcelableVolumeInfo = ETBProductDetailAdapter$ETBProductDetailViewHolder.MediaBrowserCompat$ItemReceiver;
                    eTBProductDetailAdapter$ETBProductDetailViewHolder.RatingCompat = i3;
                    eTBProductDetailAdapter$ETBProductDetailViewHolder.MediaSessionCompat$QueueItem = null;
                    eTBProductDetailAdapter$ETBProductDetailViewHolder.f5808x50fd9e4a = null;
                    businessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding2.MediaBrowserCompat$CustomActionResultReceiver(i4, eTBProductDetailAdapter$ETBProductDetailViewHolder);
                    if ((!name.equals(eTBProductDetailAdapter$ETBProductDetailViewHolder.MediaSessionCompat$QueueItem) || eTBProductDetailAdapter$ETBProductDetailViewHolder.f5808x50fd9e4a != null) && (!name.equals(eTBProductDetailAdapter$ETBProductDetailViewHolder.MediaSessionCompat$QueueItem) || !xmlPullParser.getNamespace().equals(eTBProductDetailAdapter$ETBProductDetailViewHolder.f5808x50fd9e4a))) {
                        i2 = i4;
                    } else {
                        i2 = i4;
                        businessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding2.MediaBrowserCompat$ItemReceiver(i2, IconCompatParcelizer(xmlPullParser, businessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding, i4, (String) null, (String) null, eTBProductDetailAdapter$ETBProductDetailViewHolder));
                        z = true;
                    }
                    i4 = i2 + 1;
                    i3 = 0;
                }
                if (!z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown Property: ");
                    sb.append(name);
                    throw new RuntimeException(sb.toString());
                } else if (businessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding2 instanceof BusinessAndMaritalInfoSpouseSelectorViewHolder_ViewBinding) {
                    int attributeCount = xmlPullParser.getAttributeCount();
                    for (int i5 = 0; i5 < attributeCount; i5++) {
                        BusinessAndMaritalInfoSpouseSelectorViewHolder businessAndMaritalInfoSpouseSelectorViewHolder = new BusinessAndMaritalInfoSpouseSelectorViewHolder();
                        businessAndMaritalInfoSpouseSelectorViewHolder.MediaSessionCompat$QueueItem = xmlPullParser2.getAttributeName(i5);
                        businessAndMaritalInfoSpouseSelectorViewHolder.write(xmlPullParser2.getAttributeValue(i5));
                        businessAndMaritalInfoSpouseSelectorViewHolder.f5808x50fd9e4a = xmlPullParser2.getAttributeNamespace(i5);
                        businessAndMaritalInfoSpouseSelectorViewHolder.ParcelableVolumeInfo = xmlPullParser2.getAttributeType(i5);
                    }
                }
            } else {
                ETBDescriptionAdapter$DescriptionHolder eTBDescriptionAdapter$DescriptionHolder = (ETBDescriptionAdapter$DescriptionHolder) businessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding2;
                eTBDescriptionAdapter$DescriptionHolder.MediaBrowserCompat$CustomActionResultReceiver(xmlPullParser.getName(), IconCompatParcelizer(xmlPullParser, businessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding, businessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding.IconCompatParcelizer(), eTBDescriptionAdapter$DescriptionHolder.IconCompatParcelizer, name, ETBProductDetailAdapter$ETBProductDetailViewHolder.write));
            }
            try {
                nextTag = xmlPullParser.nextTag();
            } catch (XmlPullParserException unused2) {
                if (businessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding2 instanceof EBillSubscriptionAdapter$EBillSubscriptionItemHolder_ViewBinding) {
                    EBillSubscriptionAdapter$EBillSubscriptionItemHolder_ViewBinding eBillSubscriptionAdapter$EBillSubscriptionItemHolder_ViewBinding2 = (EBillSubscriptionAdapter$EBillSubscriptionItemHolder_ViewBinding) businessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding2;
                    if (xmlPullParser.getText() != null) {
                        str = xmlPullParser.getText();
                    } else {
                        str = "";
                    }
                    eBillSubscriptionAdapter$EBillSubscriptionItemHolder_ViewBinding2.MediaBrowserCompat$ItemReceiver(str);
                }
                nextTag = xmlPullParser.nextTag();
            }
        }
        xmlPullParser2.require(3, (String) null, (String) null);
    }

    private Object MediaBrowserCompat$ItemReceiver(XmlPullParser xmlPullParser, String str, String str2) throws IOException, XmlPullParserException {
        BusinessAndMaritalInfoNationalIdViewHolder businessAndMaritalInfoNationalIdViewHolder;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        String str3 = str;
        String str4 = str2;
        String name = xmlPullParser.getName();
        String namespace = xmlPullParser.getNamespace();
        Vector vector = new Vector();
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            BusinessAndMaritalInfoSpouseSelectorViewHolder businessAndMaritalInfoSpouseSelectorViewHolder = new BusinessAndMaritalInfoSpouseSelectorViewHolder();
            businessAndMaritalInfoSpouseSelectorViewHolder.MediaSessionCompat$QueueItem = xmlPullParser.getAttributeName(i);
            businessAndMaritalInfoSpouseSelectorViewHolder.write(xmlPullParser.getAttributeValue(i));
            businessAndMaritalInfoSpouseSelectorViewHolder.f5808x50fd9e4a = xmlPullParser.getAttributeNamespace(i);
            businessAndMaritalInfoSpouseSelectorViewHolder.ParcelableVolumeInfo = xmlPullParser.getAttributeType(i);
            vector.addElement(businessAndMaritalInfoSpouseSelectorViewHolder);
        }
        xmlPullParser.next();
        String str5 = null;
        if (xmlPullParser.getEventType() == 4) {
            str5 = xmlPullParser.getText();
            businessAndMaritalInfoNationalIdViewHolder = new ETBDescriptionAdapter$DescriptionHolder_ViewBinding(str3, str4, str5);
            for (int i2 = 0; i2 < vector.size(); i2++) {
                businessAndMaritalInfoNationalIdViewHolder.write.addElement((BusinessAndMaritalInfoSpouseSelectorViewHolder) vector.elementAt(i2));
            }
            xmlPullParser.next();
        } else if (xmlPullParser.getEventType() == 3) {
            businessAndMaritalInfoNationalIdViewHolder = new ETBDescriptionAdapter$DescriptionHolder(str3, str4);
            for (int i3 = 0; i3 < vector.size(); i3++) {
                businessAndMaritalInfoNationalIdViewHolder.write.addElement((BusinessAndMaritalInfoSpouseSelectorViewHolder) vector.elementAt(i3));
            }
        } else {
            businessAndMaritalInfoNationalIdViewHolder = null;
        }
        if (xmlPullParser.getEventType() == 2) {
            if (str5 == null || str5.trim().length() == 0) {
                ETBDescriptionAdapter$DescriptionHolder eTBDescriptionAdapter$DescriptionHolder = new ETBDescriptionAdapter$DescriptionHolder(str3, str4);
                for (int i4 = 0; i4 < vector.size(); i4++) {
                    eTBDescriptionAdapter$DescriptionHolder.write.addElement((BusinessAndMaritalInfoSpouseSelectorViewHolder) vector.elementAt(i4));
                }
                while (xmlPullParser.getEventType() != 3) {
                    eTBDescriptionAdapter$DescriptionHolder.write(xmlPullParser.getNamespace(), xmlPullParser.getName(), IconCompatParcelizer(xmlPullParser, eTBDescriptionAdapter$DescriptionHolder, eTBDescriptionAdapter$DescriptionHolder.read.size(), (String) null, (String) null, ETBProductDetailAdapter$ETBProductDetailViewHolder.write));
                    xmlPullParser.nextTag();
                }
                businessAndMaritalInfoNationalIdViewHolder = eTBDescriptionAdapter$DescriptionHolder;
            } else {
                throw new RuntimeException("Malformed input: Mixed content");
            }
        }
        xmlPullParser.require(3, namespace, name);
        return businessAndMaritalInfoNationalIdViewHolder;
    }

    private static int read(String str, int i, int i2) {
        if (str == null) {
            return i2;
        }
        try {
            return str.length() - i < 3 ? i2 : Integer.parseInt(str.substring(i + 1, str.length() - 1));
        } catch (Exception unused) {
            return i2;
        }
    }

    private Object IconCompatParcelizer(XmlPullParser xmlPullParser, Object obj, int i, String str, String str2, ETBProductDetailAdapter$ETBProductDetailViewHolder eTBProductDetailAdapter$ETBProductDetailViewHolder) throws IOException, XmlPullParserException {
        Object obj2;
        Object obj3;
        String str3;
        String name = xmlPullParser.getName();
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "href");
        if (attributeValue == null) {
            String attributeValue2 = xmlPullParser.getAttributeValue(this.MediaMetadataCompat, "nil");
            String attributeValue3 = xmlPullParser.getAttributeValue((String) null, Name.MARK);
            if (attributeValue2 == null) {
                attributeValue2 = xmlPullParser.getAttributeValue(this.MediaMetadataCompat, "null");
            }
            if (attributeValue2 == null || !IssuerSearchAdapter$CustomViewHolder.MediaBrowserCompat$ItemReceiver(attributeValue2)) {
                String attributeValue4 = xmlPullParser.getAttributeValue(this.MediaMetadataCompat, "type");
                if (attributeValue4 != null) {
                    int indexOf = attributeValue4.indexOf(58);
                    str2 = attributeValue4.substring(indexOf + 1);
                    if (indexOf == -1) {
                        str3 = "";
                    } else {
                        str3 = attributeValue4.substring(0, indexOf);
                    }
                    str = xmlPullParser.getNamespace(str3);
                } else if (str2 == null && str == null) {
                    if (xmlPullParser.getAttributeValue(this.write, "arrayType") != null) {
                        str = this.write;
                        str2 = "Array";
                    } else {
                        Object[] read = read(eTBProductDetailAdapter$ETBProductDetailViewHolder.ParcelableVolumeInfo, (Object) null);
                        String str4 = (String) read[0];
                        str2 = (String) read[1];
                        str = str4;
                    }
                }
                if (attributeValue4 == null) {
                    this.MediaSessionCompat$QueueItem = true;
                }
                Object read2 = read(xmlPullParser, str, str2, eTBProductDetailAdapter$ETBProductDetailViewHolder);
                if (read2 == null) {
                    read2 = MediaBrowserCompat$ItemReceiver(xmlPullParser, str, str2);
                }
                obj3 = read2;
            } else {
                xmlPullParser.nextTag();
                xmlPullParser.require(3, (String) null, name);
                obj3 = null;
            }
            if (attributeValue3 != null) {
                write(attributeValue3, obj2);
            }
        } else if (obj != null) {
            String substring = attributeValue.substring(1);
            obj2 = this.MediaSessionCompat$ResultReceiverWrapper.get(substring);
            if (obj2 == null || (obj2 instanceof EBillSubscriptionAdapter$EBillSubscriptionItemHolder)) {
                EBillSubscriptionAdapter$EBillSubscriptionItemHolder eBillSubscriptionAdapter$EBillSubscriptionItemHolder = new EBillSubscriptionAdapter$EBillSubscriptionItemHolder();
                eBillSubscriptionAdapter$EBillSubscriptionItemHolder.IconCompatParcelizer = (EBillSubscriptionAdapter$EBillSubscriptionItemHolder) obj2;
                eBillSubscriptionAdapter$EBillSubscriptionItemHolder.MediaBrowserCompat$CustomActionResultReceiver = obj;
                eBillSubscriptionAdapter$EBillSubscriptionItemHolder.read = i;
                this.MediaSessionCompat$ResultReceiverWrapper.put(substring, eBillSubscriptionAdapter$EBillSubscriptionItemHolder);
                obj2 = null;
            }
            xmlPullParser.nextTag();
            xmlPullParser.require(3, (String) null, name);
        } else {
            throw new RuntimeException("href at root level?!?");
        }
        xmlPullParser.require(3, (String) null, name);
        return obj2;
    }

    private void write(String str, Object obj) {
        Object obj2 = this.MediaSessionCompat$ResultReceiverWrapper.get(str);
        if (obj2 instanceof EBillSubscriptionAdapter$EBillSubscriptionItemHolder) {
            EBillSubscriptionAdapter$EBillSubscriptionItemHolder eBillSubscriptionAdapter$EBillSubscriptionItemHolder = (EBillSubscriptionAdapter$EBillSubscriptionItemHolder) obj2;
            do {
                if (eBillSubscriptionAdapter$EBillSubscriptionItemHolder.MediaBrowserCompat$CustomActionResultReceiver instanceof BusinessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding) {
                    ((BusinessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding) eBillSubscriptionAdapter$EBillSubscriptionItemHolder.MediaBrowserCompat$CustomActionResultReceiver).MediaBrowserCompat$ItemReceiver(eBillSubscriptionAdapter$EBillSubscriptionItemHolder.read, obj);
                } else {
                    ((Vector) eBillSubscriptionAdapter$EBillSubscriptionItemHolder.MediaBrowserCompat$CustomActionResultReceiver).setElementAt(obj, eBillSubscriptionAdapter$EBillSubscriptionItemHolder.read);
                }
                eBillSubscriptionAdapter$EBillSubscriptionItemHolder = eBillSubscriptionAdapter$EBillSubscriptionItemHolder.IconCompatParcelizer;
            } while (eBillSubscriptionAdapter$EBillSubscriptionItemHolder != null);
        } else if (obj2 == null) {
            this.MediaSessionCompat$ResultReceiverWrapper.put(str, obj);
        } else {
            throw new RuntimeException("double ID");
        }
        this.MediaSessionCompat$ResultReceiverWrapper.put(str, obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Object read(org.xmlpull.p042v1.XmlPullParser r19, java.lang.String r20, java.lang.String r21, p040o.ETBProductDetailAdapter$ETBProductDetailViewHolder r22) throws java.io.IOException, org.xmlpull.p042v1.XmlPullParserException {
        /*
            r18 = this;
            r8 = r18
            r0 = r19
            r1 = r20
            r2 = r21
            java.util.Hashtable r3 = r8.MediaSessionCompat$Token
            o.ETBDescriptionAdapter$DescriptionHolder_ViewBinding r4 = new o.ETBDescriptionAdapter$DescriptionHolder_ViewBinding
            r9 = 0
            r4.<init>(r1, r2, r9)
            java.lang.Object r3 = r3.get(r4)
            if (r3 != 0) goto L_0x0017
            return r9
        L_0x0017:
            boolean r4 = r3 instanceof p040o.BusinessAndMaritalInfoYearMonthSelectorViewHolder
            if (r4 == 0) goto L_0x0022
            o.BusinessAndMaritalInfoYearMonthSelectorViewHolder r3 = (p040o.BusinessAndMaritalInfoYearMonthSelectorViewHolder) r3
            java.lang.Object r0 = r3.write(r0, r2)
            return r0
        L_0x0022:
            boolean r4 = r3 instanceof p040o.ETBDescriptionAdapter$DescriptionHolder
            if (r4 == 0) goto L_0x002e
            o.ETBDescriptionAdapter$DescriptionHolder r3 = (p040o.ETBDescriptionAdapter$DescriptionHolder) r3
            o.ETBDescriptionAdapter$DescriptionHolder r1 = r3.MediaBrowserCompat$CustomActionResultReceiver()
        L_0x002c:
            r10 = r1
            goto L_0x0040
        L_0x002e:
            java.lang.Class<o.ETBDescriptionAdapter$DescriptionHolder> r4 = p040o.ETBDescriptionAdapter$DescriptionHolder.class
            if (r3 != r4) goto L_0x0039
            o.ETBDescriptionAdapter$DescriptionHolder r3 = new o.ETBDescriptionAdapter$DescriptionHolder
            r3.<init>(r1, r2)
            r10 = r3
            goto L_0x0040
        L_0x0039:
            java.lang.Class r3 = (java.lang.Class) r3     // Catch:{ Exception -> 0x016b }
            java.lang.Object r1 = r3.newInstance()     // Catch:{ Exception -> 0x016b }
            goto L_0x002c
        L_0x0040:
            boolean r1 = r10 instanceof p040o.BusinessAndMaritalInfoSpouseSelectorViewHolder_ViewBinding
            r11 = 0
            if (r1 == 0) goto L_0x006d
            int r1 = r19.getAttributeCount()
            r2 = r11
        L_0x004a:
            if (r2 >= r1) goto L_0x006d
            o.BusinessAndMaritalInfoSpouseSelectorViewHolder r3 = new o.BusinessAndMaritalInfoSpouseSelectorViewHolder
            r3.<init>()
            java.lang.String r4 = r0.getAttributeName(r2)
            r3.MediaSessionCompat$QueueItem = r4
            java.lang.String r4 = r0.getAttributeValue(r2)
            r3.write(r4)
            java.lang.String r4 = r0.getAttributeNamespace(r2)
            r3.f5808x50fd9e4a = r4
            java.lang.String r4 = r0.getAttributeType(r2)
            r3.ParcelableVolumeInfo = r4
            int r2 = r2 + 1
            goto L_0x004a
        L_0x006d:
            boolean r1 = r10 instanceof p040o.ETBDescriptionAdapter$DescriptionHolder
            if (r1 == 0) goto L_0x008d
            r1 = r10
            o.ETBDescriptionAdapter$DescriptionHolder r1 = (p040o.ETBDescriptionAdapter$DescriptionHolder) r1
        L_0x0074:
            int r2 = r19.getAttributeCount()
            if (r11 >= r2) goto L_0x0088
            java.lang.String r2 = r0.getAttributeName(r11)
            java.lang.String r3 = r0.getAttributeValue(r11)
            r1.MediaBrowserCompat$ItemReceiver(r2, r3)
            int r11 = r11 + 1
            goto L_0x0074
        L_0x0088:
            r8.read((org.xmlpull.p042v1.XmlPullParser) r0, (p040o.BusinessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding) r1)
            goto L_0x014f
        L_0x008d:
            boolean r1 = r10 instanceof p040o.BusinessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x00af
            boolean r1 = r10 instanceof p040o.EBillSubscriptionAdapter$EBillSubscriptionItemHolder_ViewBinding
            if (r1 == 0) goto L_0x00a7
            r1 = r10
            o.EBillSubscriptionAdapter$EBillSubscriptionItemHolder_ViewBinding r1 = (p040o.EBillSubscriptionAdapter$EBillSubscriptionItemHolder_ViewBinding) r1
            java.lang.String r3 = r19.getText()
            if (r3 == 0) goto L_0x00a4
            java.lang.String r2 = r19.getText()
        L_0x00a4:
            r1.MediaBrowserCompat$ItemReceiver(r2)
        L_0x00a7:
            r1 = r10
            o.BusinessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding r1 = (p040o.BusinessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding) r1
            r8.read((org.xmlpull.p042v1.XmlPullParser) r0, (p040o.BusinessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding) r1)
            goto L_0x014f
        L_0x00af:
            boolean r1 = r10 instanceof java.util.Vector
            if (r1 == 0) goto L_0x0150
            r12 = r10
            java.util.Vector r12 = (java.util.Vector) r12
            r1 = r22
            o.ETBProductDetailAdapter$ETBProductDetailViewHolder r1 = r1.MediaDescriptionCompat
            int r3 = r12.size()
            java.lang.String r4 = r8.write
            java.lang.String r5 = "arrayType"
            java.lang.String r4 = r0.getAttributeValue(r4, r5)
            r5 = 1
            if (r4 == 0) goto L_0x00f8
            r3 = 58
            int r3 = r4.indexOf(r3)
            java.lang.String r6 = "["
            int r6 = r4.indexOf(r6, r3)
            int r7 = r3 + 1
            java.lang.String r7 = r4.substring(r7, r6)
            r13 = -1
            if (r3 != r13) goto L_0x00df
            goto L_0x00e3
        L_0x00df:
            java.lang.String r2 = r4.substring(r11, r3)
        L_0x00e3:
            java.lang.String r2 = r0.getNamespace(r2)
            int r3 = read((java.lang.String) r4, (int) r6, (int) r13)
            if (r3 == r13) goto L_0x00f4
            r12.setSize(r3)
            r13 = r2
            r15 = r7
            r14 = r11
            goto L_0x00fb
        L_0x00f4:
            r13 = r2
            r14 = r5
            r15 = r7
            goto L_0x00fb
        L_0x00f8:
            r14 = r5
            r13 = r9
            r15 = r13
        L_0x00fb:
            if (r1 != 0) goto L_0x00ff
            o.ETBProductDetailAdapter$ETBProductDetailViewHolder r1 = p040o.ETBProductDetailAdapter$ETBProductDetailViewHolder.write
        L_0x00ff:
            r16 = r1
            r19.nextTag()
            java.lang.String r1 = r8.write
            java.lang.String r2 = "offset"
            java.lang.String r1 = r0.getAttributeValue(r1, r2)
            int r1 = read((java.lang.String) r1, (int) r11, (int) r11)
        L_0x0110:
            int r2 = r19.getEventType()
            r4 = 3
            if (r2 == r4) goto L_0x014c
            java.lang.String r2 = r8.write
            java.lang.String r4 = "position"
            java.lang.String r2 = r0.getAttributeValue(r2, r4)
            int r7 = read((java.lang.String) r2, (int) r11, (int) r1)
            if (r14 == 0) goto L_0x012f
            if (r7 < r3) goto L_0x012f
            int r1 = r7 + 1
            r12.setSize(r1)
            r17 = r1
            goto L_0x0131
        L_0x012f:
            r17 = r3
        L_0x0131:
            r1 = r18
            r2 = r19
            r3 = r12
            r4 = r7
            r5 = r13
            r6 = r15
            r11 = r7
            r7 = r16
            java.lang.Object r1 = r1.IconCompatParcelizer(r2, r3, r4, r5, r6, r7)
            r12.setElementAt(r1, r11)
            int r1 = r11 + 1
            r19.nextTag()
            r3 = r17
            r11 = 0
            goto L_0x0110
        L_0x014c:
            r0.require(r4, r9, r9)
        L_0x014f:
            return r10
        L_0x0150:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "no deserializer for "
            r0.append(r1)
            java.lang.Class r1 = r10.getClass()
            r0.append(r1)
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x016b:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.ETBEligibilityAdapter$EligibilityHolder.read(org.xmlpull.v1.XmlPullParser, java.lang.String, java.lang.String, o.ETBProductDetailAdapter$ETBProductDetailViewHolder):java.lang.Object");
    }

    private Object[] read(Object obj, Object obj2) {
        Object[] objArr;
        if (obj == null) {
            obj = ((obj2 instanceof ETBDescriptionAdapter$DescriptionHolder) || (obj2 instanceof ETBDescriptionAdapter$DescriptionHolder_ViewBinding)) ? obj2 : obj2.getClass();
        }
        if (obj instanceof ETBDescriptionAdapter$DescriptionHolder) {
            ETBDescriptionAdapter$DescriptionHolder eTBDescriptionAdapter$DescriptionHolder = (ETBDescriptionAdapter$DescriptionHolder) obj;
            return new Object[]{eTBDescriptionAdapter$DescriptionHolder.IconCompatParcelizer, eTBDescriptionAdapter$DescriptionHolder.MediaBrowserCompat$ItemReceiver, null, null};
        } else if (obj instanceof ETBDescriptionAdapter$DescriptionHolder_ViewBinding) {
            ETBDescriptionAdapter$DescriptionHolder_ViewBinding eTBDescriptionAdapter$DescriptionHolder_ViewBinding = (ETBDescriptionAdapter$DescriptionHolder_ViewBinding) obj;
            return new Object[]{eTBDescriptionAdapter$DescriptionHolder_ViewBinding.read, eTBDescriptionAdapter$DescriptionHolder_ViewBinding.IconCompatParcelizer, null, RatingCompat};
        } else if ((obj instanceof Class) && obj != ETBProductDetailAdapter$ETBProductDetailViewHolder.MediaBrowserCompat$ItemReceiver && (objArr = (Object[]) this.MediaDescriptionCompat.get(((Class) obj).getName())) != null) {
            return objArr;
        } else {
            return new Object[]{this.MediaBrowserCompat$MediaItem, "anyType", null, null};
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Class} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void IconCompatParcelizer(java.lang.String r5, java.lang.String r6, java.lang.Class r7, p040o.BusinessAndMaritalInfoYearMonthSelectorViewHolder r8) {
        /*
            r4 = this;
            java.util.Hashtable r0 = r4.MediaSessionCompat$Token
            o.ETBDescriptionAdapter$DescriptionHolder_ViewBinding r1 = new o.ETBDescriptionAdapter$DescriptionHolder_ViewBinding
            r2 = 0
            r1.<init>(r5, r6, r2)
            if (r8 != 0) goto L_0x000c
            r3 = r7
            goto L_0x000d
        L_0x000c:
            r3 = r8
        L_0x000d:
            r0.put(r1, r3)
            java.util.Hashtable r0 = r4.MediaDescriptionCompat
            java.lang.String r7 = r7.getName()
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r1[r3] = r5
            r5 = 1
            r1[r5] = r6
            r5 = 2
            r1[r5] = r2
            r5 = 3
            r1[r5] = r8
            r0.put(r7, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.ETBEligibilityAdapter$EligibilityHolder.IconCompatParcelizer(java.lang.String, java.lang.String, java.lang.Class, o.BusinessAndMaritalInfoYearMonthSelectorViewHolder):void");
    }

    public final Object write() throws SoapFault {
        if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
            return null;
        }
        if (!(this.MediaBrowserCompat$CustomActionResultReceiver instanceof SoapFault)) {
            BusinessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding businessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding = (BusinessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding) this.MediaBrowserCompat$CustomActionResultReceiver;
            if (businessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding.IconCompatParcelizer() == 0) {
                return null;
            }
            if (businessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding.IconCompatParcelizer() == 1) {
                return businessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding.read(0);
            }
            Vector vector = new Vector();
            for (int i = 0; i < businessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding.IconCompatParcelizer(); i++) {
                vector.add(businessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding.read(i));
            }
            return vector;
        }
        throw ((SoapFault) this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final void MediaBrowserCompat$ItemReceiver(XmlSerializer xmlSerializer) throws IOException {
        if (this.IconCompatParcelizer != null) {
            Vector vector = new Vector();
            this.ParcelableVolumeInfo = vector;
            vector.addElement(this.IconCompatParcelizer);
            Object[] read = read((Object) null, this.IconCompatParcelizer);
            xmlSerializer.startTag((String) read[0], (String) read[1]);
            if (this.MediaBrowserCompat$SearchResultReceiver) {
                xmlSerializer.attribute((String) null, Name.MARK, read[2] == null ? "o0" : (String) read[2]);
                xmlSerializer.attribute(this.write, "root", DiskLruCache.VERSION_1);
            }
            write(xmlSerializer, this.IconCompatParcelizer, (ETBProductDetailAdapter$ETBProductDetailViewHolder) null, read[3]);
            xmlSerializer.endTag((String) read[0], (String) read[1]);
        }
    }

    private static void IconCompatParcelizer(XmlSerializer xmlSerializer, BusinessAndMaritalInfoSpouseSelectorViewHolder_ViewBinding businessAndMaritalInfoSpouseSelectorViewHolder_ViewBinding) throws IOException {
        int aX_ = businessAndMaritalInfoSpouseSelectorViewHolder_ViewBinding.aX_();
        for (int i = 0; i < aX_; i++) {
            BusinessAndMaritalInfoSpouseSelectorViewHolder businessAndMaritalInfoSpouseSelectorViewHolder = new BusinessAndMaritalInfoSpouseSelectorViewHolder();
            businessAndMaritalInfoSpouseSelectorViewHolder_ViewBinding.read(i, businessAndMaritalInfoSpouseSelectorViewHolder);
            if (businessAndMaritalInfoSpouseSelectorViewHolder.IconCompatParcelizer() != null) {
                xmlSerializer.attribute(businessAndMaritalInfoSpouseSelectorViewHolder.f5808x50fd9e4a, businessAndMaritalInfoSpouseSelectorViewHolder.MediaSessionCompat$QueueItem, businessAndMaritalInfoSpouseSelectorViewHolder.IconCompatParcelizer().toString());
            }
        }
    }

    private void MediaBrowserCompat$ItemReceiver(XmlSerializer xmlSerializer, BusinessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding businessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding) throws IOException {
        String str;
        String str2;
        Object read;
        if (businessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding instanceof BusinessAndMaritalInfoSpouseSelectorViewHolder_ViewBinding) {
            IconCompatParcelizer(xmlSerializer, (BusinessAndMaritalInfoSpouseSelectorViewHolder_ViewBinding) businessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding);
        }
        ArrayList arrayList = (ArrayList) businessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding;
        BusinessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding businessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding2 = (BusinessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding) arrayList;
        int size = arrayList.size();
        ETBProductDetailAdapter$ETBProductDetailViewHolder eTBProductDetailAdapter$ETBProductDetailViewHolder = new ETBProductDetailAdapter$ETBProductDetailViewHolder();
        for (int i = 0; i < size; i++) {
            Object read2 = businessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding2.read(i);
            businessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding2.MediaBrowserCompat$CustomActionResultReceiver(i, eTBProductDetailAdapter$ETBProductDetailViewHolder);
            if (read2 instanceof ETBDescriptionAdapter$DescriptionHolder) {
                ETBDescriptionAdapter$DescriptionHolder eTBDescriptionAdapter$DescriptionHolder = (ETBDescriptionAdapter$DescriptionHolder) read2;
                Object[] read3 = read((Object) null, (Object) eTBDescriptionAdapter$DescriptionHolder);
                String str3 = (String) read3[1];
                if (eTBProductDetailAdapter$ETBProductDetailViewHolder.MediaSessionCompat$QueueItem == null || eTBProductDetailAdapter$ETBProductDetailViewHolder.MediaSessionCompat$QueueItem.length() <= 0) {
                    str = (String) read3[1];
                } else {
                    str = eTBProductDetailAdapter$ETBProductDetailViewHolder.MediaSessionCompat$QueueItem;
                }
                if (eTBProductDetailAdapter$ETBProductDetailViewHolder.f5808x50fd9e4a == null || eTBProductDetailAdapter$ETBProductDetailViewHolder.f5808x50fd9e4a.length() <= 0) {
                    str2 = (String) read3[0];
                } else {
                    str2 = eTBProductDetailAdapter$ETBProductDetailViewHolder.f5808x50fd9e4a;
                }
                xmlSerializer.startTag(str2, str);
                if (!this.MediaSessionCompat$QueueItem) {
                    String prefix = xmlSerializer.getPrefix(str2, true);
                    String str4 = this.MediaMetadataCompat;
                    StringBuilder sb = new StringBuilder();
                    sb.append(prefix);
                    sb.append(":");
                    sb.append(str3);
                    xmlSerializer.attribute(str4, "type", sb.toString());
                }
                write(xmlSerializer, (BusinessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding) eTBDescriptionAdapter$DescriptionHolder);
                xmlSerializer.endTag(str2, str);
            } else if ((eTBProductDetailAdapter$ETBProductDetailViewHolder.RatingCompat & 1) == 0 && (read = businessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding2.read(i)) != ETBDescriptionAdapter$DescriptionHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver) {
                xmlSerializer.startTag(eTBProductDetailAdapter$ETBProductDetailViewHolder.f5808x50fd9e4a, eTBProductDetailAdapter$ETBProductDetailViewHolder.MediaSessionCompat$QueueItem);
                IconCompatParcelizer(xmlSerializer, read, eTBProductDetailAdapter$ETBProductDetailViewHolder);
                xmlSerializer.endTag(eTBProductDetailAdapter$ETBProductDetailViewHolder.f5808x50fd9e4a, eTBProductDetailAdapter$ETBProductDetailViewHolder.MediaSessionCompat$QueueItem);
            }
        }
        if (businessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding2 instanceof EBillSubscriptionAdapter$EBillSubscriptionItemHolder_ViewBinding) {
            EBillSubscriptionAdapter$EBillSubscriptionItemHolder_ViewBinding eBillSubscriptionAdapter$EBillSubscriptionItemHolder_ViewBinding = (EBillSubscriptionAdapter$EBillSubscriptionItemHolder_ViewBinding) businessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding2;
            if (eBillSubscriptionAdapter$EBillSubscriptionItemHolder_ViewBinding.write() != null) {
                xmlSerializer.cdsect(eBillSubscriptionAdapter$EBillSubscriptionItemHolder_ViewBinding.write());
            }
        }
    }

    private void write(XmlSerializer xmlSerializer, BusinessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding businessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding) throws IOException {
        if (businessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding instanceof BusinessAndMaritalInfoSpouseSelectorViewHolder_ViewBinding) {
            IconCompatParcelizer(xmlSerializer, (BusinessAndMaritalInfoSpouseSelectorViewHolder_ViewBinding) businessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding);
        }
        MediaBrowserCompat$CustomActionResultReceiver(xmlSerializer, businessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding);
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(XmlSerializer xmlSerializer, BusinessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding businessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding) throws IOException {
        String str;
        String str2;
        Object read;
        int IconCompatParcelizer = businessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding.IconCompatParcelizer();
        ETBProductDetailAdapter$ETBProductDetailViewHolder eTBProductDetailAdapter$ETBProductDetailViewHolder = new ETBProductDetailAdapter$ETBProductDetailViewHolder();
        for (int i = 0; i < IconCompatParcelizer; i++) {
            Object read2 = businessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding.read(i);
            businessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(i, eTBProductDetailAdapter$ETBProductDetailViewHolder);
            if (read2 instanceof ETBDescriptionAdapter$DescriptionHolder) {
                ETBDescriptionAdapter$DescriptionHolder eTBDescriptionAdapter$DescriptionHolder = (ETBDescriptionAdapter$DescriptionHolder) read2;
                Object[] read3 = read((Object) null, (Object) eTBDescriptionAdapter$DescriptionHolder);
                String str3 = (String) read3[1];
                if (eTBProductDetailAdapter$ETBProductDetailViewHolder.MediaSessionCompat$QueueItem == null || eTBProductDetailAdapter$ETBProductDetailViewHolder.MediaSessionCompat$QueueItem.length() <= 0) {
                    str = (String) read3[1];
                } else {
                    str = eTBProductDetailAdapter$ETBProductDetailViewHolder.MediaSessionCompat$QueueItem;
                }
                if (eTBProductDetailAdapter$ETBProductDetailViewHolder.f5808x50fd9e4a == null || eTBProductDetailAdapter$ETBProductDetailViewHolder.f5808x50fd9e4a.length() <= 0) {
                    str2 = (String) read3[0];
                } else {
                    str2 = eTBProductDetailAdapter$ETBProductDetailViewHolder.f5808x50fd9e4a;
                }
                xmlSerializer.startTag(str2, str);
                if (!this.MediaSessionCompat$QueueItem) {
                    String prefix = xmlSerializer.getPrefix(str2, true);
                    String str4 = this.MediaMetadataCompat;
                    StringBuilder sb = new StringBuilder();
                    sb.append(prefix);
                    sb.append(":");
                    sb.append(str3);
                    xmlSerializer.attribute(str4, "type", sb.toString());
                }
                write(xmlSerializer, (BusinessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding) eTBDescriptionAdapter$DescriptionHolder);
                xmlSerializer.endTag(str2, str);
            } else if ((eTBProductDetailAdapter$ETBProductDetailViewHolder.RatingCompat & 1) == 0 && (read = businessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding.read(i)) != ETBDescriptionAdapter$DescriptionHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver) {
                xmlSerializer.startTag(eTBProductDetailAdapter$ETBProductDetailViewHolder.f5808x50fd9e4a, eTBProductDetailAdapter$ETBProductDetailViewHolder.MediaSessionCompat$QueueItem);
                IconCompatParcelizer(xmlSerializer, read, eTBProductDetailAdapter$ETBProductDetailViewHolder);
                xmlSerializer.endTag(eTBProductDetailAdapter$ETBProductDetailViewHolder.f5808x50fd9e4a, eTBProductDetailAdapter$ETBProductDetailViewHolder.MediaSessionCompat$QueueItem);
            }
        }
        if (businessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding instanceof EBillSubscriptionAdapter$EBillSubscriptionItemHolder_ViewBinding) {
            EBillSubscriptionAdapter$EBillSubscriptionItemHolder_ViewBinding eBillSubscriptionAdapter$EBillSubscriptionItemHolder_ViewBinding = (EBillSubscriptionAdapter$EBillSubscriptionItemHolder_ViewBinding) businessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding;
            if (eBillSubscriptionAdapter$EBillSubscriptionItemHolder_ViewBinding.write() != null) {
                xmlSerializer.cdsect(eBillSubscriptionAdapter$EBillSubscriptionItemHolder_ViewBinding.write());
            }
        }
    }

    private void IconCompatParcelizer(XmlSerializer xmlSerializer, Object obj, ETBProductDetailAdapter$ETBProductDetailViewHolder eTBProductDetailAdapter$ETBProductDetailViewHolder) throws IOException {
        StringBuilder sb;
        if (obj == null || obj == ETBDescriptionAdapter$DescriptionHolder_ViewBinding.MediaBrowserCompat$ItemReceiver) {
            xmlSerializer.attribute(this.MediaMetadataCompat, this.read >= 120 ? "nil" : "null", "true");
            return;
        }
        Object[] read = read((Object) null, obj);
        if (eTBProductDetailAdapter$ETBProductDetailViewHolder.MediaMetadataCompat || read[2] != null) {
            int indexOf = this.ParcelableVolumeInfo.indexOf(obj);
            if (indexOf == -1) {
                indexOf = this.ParcelableVolumeInfo.size();
                this.ParcelableVolumeInfo.addElement(obj);
            }
            if (read[2] == null) {
                sb = new StringBuilder();
                sb.append("#o");
                sb.append(indexOf);
            } else {
                sb = new StringBuilder();
                sb.append("#");
                sb.append(read[2]);
            }
            xmlSerializer.attribute((String) null, "href", sb.toString());
            return;
        }
        if (!this.MediaSessionCompat$QueueItem || obj.getClass() != eTBProductDetailAdapter$ETBProductDetailViewHolder.ParcelableVolumeInfo) {
            String prefix = xmlSerializer.getPrefix((String) read[0], true);
            String str = this.MediaMetadataCompat;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(prefix);
            sb2.append(":");
            sb2.append(read[1]);
            xmlSerializer.attribute(str, "type", sb2.toString());
        }
        write(xmlSerializer, obj, eTBProductDetailAdapter$ETBProductDetailViewHolder, read[3]);
    }

    private void write(XmlSerializer xmlSerializer, Object obj, ETBProductDetailAdapter$ETBProductDetailViewHolder eTBProductDetailAdapter$ETBProductDetailViewHolder, Object obj2) throws IOException {
        if (obj2 != null) {
            ((BusinessAndMaritalInfoYearMonthSelectorViewHolder) obj2).MediaBrowserCompat$CustomActionResultReceiver(xmlSerializer, obj);
        } else if ((obj instanceof BusinessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding) || obj == ETBDescriptionAdapter$DescriptionHolder_ViewBinding.MediaBrowserCompat$ItemReceiver || obj == ETBDescriptionAdapter$DescriptionHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver) {
            if (obj instanceof ArrayList) {
                MediaBrowserCompat$ItemReceiver(xmlSerializer, (BusinessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding) obj);
            } else {
                write(xmlSerializer, (BusinessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding) obj);
            }
        } else if (obj instanceof BusinessAndMaritalInfoSpouseSelectorViewHolder_ViewBinding) {
            IconCompatParcelizer(xmlSerializer, (BusinessAndMaritalInfoSpouseSelectorViewHolder_ViewBinding) obj);
        } else if (obj instanceof Vector) {
            read(xmlSerializer, (Vector) obj, eTBProductDetailAdapter$ETBProductDetailViewHolder.MediaDescriptionCompat);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot serialize: ");
            sb.append(obj);
            throw new RuntimeException(sb.toString());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void read(org.xmlpull.p042v1.XmlSerializer r12, java.util.Vector r13, p040o.ETBProductDetailAdapter$ETBProductDetailViewHolder r14) throws java.io.IOException {
        /*
            r11 = this;
            r0 = 0
            if (r14 != 0) goto L_0x0006
            o.ETBProductDetailAdapter$ETBProductDetailViewHolder r14 = p040o.ETBProductDetailAdapter$ETBProductDetailViewHolder.write
            goto L_0x0013
        L_0x0006:
            boolean r1 = r14 instanceof p040o.ETBProductDetailAdapter$ETBProductDetailViewHolder
            if (r1 == 0) goto L_0x0013
            java.lang.String r1 = r14.MediaSessionCompat$QueueItem
            if (r1 == 0) goto L_0x0013
            java.lang.String r1 = r14.MediaSessionCompat$QueueItem
            java.lang.String r2 = r14.f5808x50fd9e4a
            goto L_0x0016
        L_0x0013:
            java.lang.String r1 = "item"
            r2 = r0
        L_0x0016:
            int r3 = r13.size()
            java.lang.Object r4 = r14.ParcelableVolumeInfo
            java.lang.Object[] r0 = r11.read((java.lang.Object) r4, (java.lang.Object) r0)
            boolean r4 = r11.MediaSessionCompat$QueueItem
            java.lang.String r5 = "]"
            java.lang.String r6 = "["
            r7 = 1
            r8 = 0
            if (r4 != 0) goto L_0x0059
            java.lang.String r4 = r11.write
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r10 = r0[r8]
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r10 = r12.getPrefix(r10, r8)
            r9.append(r10)
            java.lang.String r10 = ":"
            r9.append(r10)
            r0 = r0[r7]
            r9.append(r0)
            r9.append(r6)
            r9.append(r3)
            r9.append(r5)
            java.lang.String r0 = r9.toString()
            java.lang.String r9 = "arrayType"
            r12.attribute(r4, r9, r0)
            goto L_0x0060
        L_0x0059:
            if (r2 != 0) goto L_0x0060
            r0 = r0[r8]
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
        L_0x0060:
            r0 = r8
            r4 = r0
        L_0x0062:
            if (r0 >= r3) goto L_0x0098
            java.lang.Object r9 = r13.elementAt(r0)
            if (r9 != 0) goto L_0x006c
            r4 = r7
            goto L_0x0095
        L_0x006c:
            r12.startTag(r2, r1)
            if (r4 == 0) goto L_0x008b
            java.lang.String r4 = r11.write
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            r9.append(r0)
            r9.append(r5)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = "position"
            r12.attribute(r4, r10, r9)
            r4 = r8
        L_0x008b:
            java.lang.Object r9 = r13.elementAt(r0)
            r11.IconCompatParcelizer(r12, r9, r14)
            r12.endTag(r2, r1)
        L_0x0095:
            int r0 = r0 + 1
            goto L_0x0062
        L_0x0098:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.ETBEligibilityAdapter$EligibilityHolder.read(org.xmlpull.v1.XmlSerializer, java.util.Vector, o.ETBProductDetailAdapter$ETBProductDetailViewHolder):void");
    }
}

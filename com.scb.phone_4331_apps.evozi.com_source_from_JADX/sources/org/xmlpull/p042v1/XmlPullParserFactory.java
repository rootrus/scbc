package org.xmlpull.p042v1;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* renamed from: org.xmlpull.v1.XmlPullParserFactory */
public class XmlPullParserFactory {
    public static final String PROPERTY_NAME = "org.xmlpull.v1.XmlPullParserFactory";
    private static final String RESOURCE_NAME = "/META-INF/services/org.xmlpull.v1.XmlPullParserFactory";
    static final Class referenceContextClass = new XmlPullParserFactory().getClass();
    protected String classNamesLocation;
    protected Hashtable features = new Hashtable();
    protected Vector parserClasses;
    protected Vector serializerClasses;

    protected XmlPullParserFactory() {
    }

    public void setFeature(String str, boolean z) throws XmlPullParserException {
        this.features.put(str, Boolean.valueOf(z));
    }

    public boolean getFeature(String str) {
        Boolean bool = (Boolean) this.features.get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public void setNamespaceAware(boolean z) {
        this.features.put(XmlPullParser.FEATURE_PROCESS_NAMESPACES, Boolean.valueOf(z));
    }

    public boolean isNamespaceAware() {
        return getFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES);
    }

    public void setValidating(boolean z) {
        this.features.put(XmlPullParser.FEATURE_VALIDATION, Boolean.valueOf(z));
    }

    public boolean isValidating() {
        return getFeature(XmlPullParser.FEATURE_VALIDATION);
    }

    public XmlPullParser newPullParser() throws XmlPullParserException {
        Vector vector = this.parserClasses;
        if (vector == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Factory initialization was incomplete - has not tried ");
            sb.append(this.classNamesLocation);
            throw new XmlPullParserException(sb.toString());
        } else if (vector.size() != 0) {
            StringBuffer stringBuffer = new StringBuffer();
            int i = 0;
            while (i < this.parserClasses.size()) {
                Class cls = (Class) this.parserClasses.elementAt(i);
                try {
                    XmlPullParser xmlPullParser = (XmlPullParser) cls.newInstance();
                    Enumeration keys = this.features.keys();
                    while (keys.hasMoreElements()) {
                        String str = (String) keys.nextElement();
                        Boolean bool = (Boolean) this.features.get(str);
                        if (bool != null && bool.booleanValue()) {
                            xmlPullParser.setFeature(str, true);
                        }
                    }
                    return xmlPullParser;
                } catch (Exception e) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(cls.getName());
                    sb2.append(": ");
                    sb2.append(e.toString());
                    sb2.append("; ");
                    stringBuffer.append(sb2.toString());
                    i++;
                }
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("could not create parser: ");
            sb3.append(stringBuffer);
            throw new XmlPullParserException(sb3.toString());
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("No valid parser classes found in ");
            sb4.append(this.classNamesLocation);
            throw new XmlPullParserException(sb4.toString());
        }
    }

    public XmlSerializer newSerializer() throws XmlPullParserException {
        Vector vector = this.serializerClasses;
        if (vector == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Factory initialization incomplete - has not tried ");
            sb.append(this.classNamesLocation);
            throw new XmlPullParserException(sb.toString());
        } else if (vector.size() != 0) {
            StringBuffer stringBuffer = new StringBuffer();
            int i = 0;
            while (i < this.serializerClasses.size()) {
                Class cls = (Class) this.serializerClasses.elementAt(i);
                try {
                    return (XmlSerializer) cls.newInstance();
                } catch (Exception e) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(cls.getName());
                    sb2.append(": ");
                    sb2.append(e.toString());
                    sb2.append("; ");
                    stringBuffer.append(sb2.toString());
                    i++;
                }
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("could not create serializer: ");
            sb3.append(stringBuffer);
            throw new XmlPullParserException(sb3.toString());
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("No valid serializer classes found in ");
            sb4.append(this.classNamesLocation);
            throw new XmlPullParserException(sb4.toString());
        }
    }

    public static XmlPullParserFactory newInstance() throws XmlPullParserException {
        return newInstance((String) null, (Class) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c3 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.xmlpull.p042v1.XmlPullParserFactory newInstance(java.lang.String r12, java.lang.Class r13) throws org.xmlpull.p042v1.XmlPullParserException {
        /*
            if (r13 != 0) goto L_0x0004
            java.lang.Class r13 = referenceContextClass
        L_0x0004:
            java.lang.String r0 = "'"
            r1 = 0
            if (r12 == 0) goto L_0x002c
            int r2 = r12.length()
            if (r2 == 0) goto L_0x002c
            java.lang.String r2 = "DEFAULT"
            boolean r2 = r2.equals(r12)
            if (r2 != 0) goto L_0x002c
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r2 = "parameter classNames to newInstance() that contained '"
            r13.append(r2)
            r13.append(r12)
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            goto L_0x005a
        L_0x002c:
            java.lang.String r12 = "/META-INF/services/org.xmlpull.v1.XmlPullParserFactory"
            java.io.InputStream r12 = r13.getResourceAsStream(r12)     // Catch:{ Exception -> 0x00e6 }
            if (r12 == 0) goto L_0x00de
            java.lang.StringBuffer r13 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x00e6 }
            r13.<init>()     // Catch:{ Exception -> 0x00e6 }
        L_0x0039:
            int r2 = r12.read()     // Catch:{ Exception -> 0x00e6 }
            if (r2 >= 0) goto L_0x00d4
            r12.close()     // Catch:{ Exception -> 0x00e6 }
            java.lang.String r12 = r13.toString()     // Catch:{ Exception -> 0x00e6 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r2 = "resource /META-INF/services/org.xmlpull.v1.XmlPullParserFactory that contained '"
            r13.append(r2)
            r13.append(r12)
            r13.append(r0)
            java.lang.String r13 = r13.toString()
        L_0x005a:
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            java.util.Vector r2 = new java.util.Vector
            r2.<init>()
            r3 = 0
            r5 = r1
            r4 = r3
        L_0x0067:
            int r6 = r12.length()
            if (r4 >= r6) goto L_0x00c6
            r6 = 44
            int r6 = r12.indexOf(r6, r4)
            r7 = -1
            if (r6 != r7) goto L_0x007a
            int r6 = r12.length()
        L_0x007a:
            java.lang.String r4 = r12.substring(r4, r6)
            java.lang.Class r7 = java.lang.Class.forName(r4)     // Catch:{ Exception -> 0x0087 }
            java.lang.Object r8 = r7.newInstance()     // Catch:{ Exception -> 0x0088 }
            goto L_0x0089
        L_0x0087:
            r7 = r1
        L_0x0088:
            r8 = r1
        L_0x0089:
            if (r7 == 0) goto L_0x00c3
            boolean r9 = r8 instanceof org.xmlpull.p042v1.XmlPullParser
            r10 = 1
            if (r9 == 0) goto L_0x0095
            r0.addElement(r7)
            r9 = r10
            goto L_0x0096
        L_0x0095:
            r9 = r3
        L_0x0096:
            boolean r11 = r8 instanceof org.xmlpull.p042v1.XmlSerializer
            if (r11 == 0) goto L_0x009e
            r2.addElement(r7)
            r9 = r10
        L_0x009e:
            boolean r7 = r8 instanceof org.xmlpull.p042v1.XmlPullParserFactory
            if (r7 == 0) goto L_0x00a8
            if (r5 != 0) goto L_0x00a9
            r5 = r8
            org.xmlpull.v1.XmlPullParserFactory r5 = (org.xmlpull.p042v1.XmlPullParserFactory) r5
            goto L_0x00a9
        L_0x00a8:
            r10 = r9
        L_0x00a9:
            if (r10 == 0) goto L_0x00ac
            goto L_0x00c3
        L_0x00ac:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "incompatible class: "
            r12.append(r13)
            r12.append(r4)
            org.xmlpull.v1.XmlPullParserException r13 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r12 = r12.toString()
            r13.<init>(r12)
            throw r13
        L_0x00c3:
            int r4 = r6 + 1
            goto L_0x0067
        L_0x00c6:
            if (r5 != 0) goto L_0x00cd
            org.xmlpull.v1.XmlPullParserFactory r5 = new org.xmlpull.v1.XmlPullParserFactory
            r5.<init>()
        L_0x00cd:
            r5.parserClasses = r0
            r5.serializerClasses = r2
            r5.classNamesLocation = r13
            return r5
        L_0x00d4:
            r3 = 32
            if (r2 <= r3) goto L_0x0039
            char r2 = (char) r2
            r13.append(r2)     // Catch:{ Exception -> 0x00e6 }
            goto L_0x0039
        L_0x00de:
            org.xmlpull.v1.XmlPullParserException r12 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00e6 }
            java.lang.String r13 = "resource not found: /META-INF/services/org.xmlpull.v1.XmlPullParserFactory make sure that parser implementing XmlPull API is available"
            r12.<init>(r13)     // Catch:{ Exception -> 0x00e6 }
            throw r12     // Catch:{ Exception -> 0x00e6 }
        L_0x00e6:
            r12 = move-exception
            org.xmlpull.v1.XmlPullParserException r13 = new org.xmlpull.v1.XmlPullParserException
            r13.<init>(r1, r1, r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xmlpull.p042v1.XmlPullParserFactory.newInstance(java.lang.String, java.lang.Class):org.xmlpull.v1.XmlPullParserFactory");
    }
}

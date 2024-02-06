package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7915l;
import com.kofax.mobile.sdk.capture.model.FieldLocation;
import com.kofax.mobile.sdk.extract.p018id.DataField;
import com.kofax.mobile.sdk.p016b.C8295a;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.ef */
public class C8133ef implements C7915l {

    /* renamed from: Nr */
    private static final String f4151Nr = "//field[@isOutput='true' and @type='0']/@code";

    /* renamed from: Ns */
    private final C8295a f4152Ns;

    @HmlPinActivity
    public C8133ef(C8295a aVar) {
        this.f4152Ns = aVar;
    }

    /* renamed from: b */
    public List<DataField> mo54320b(String str, List<DataField> list) {
        if (list == null) {
            return null;
        }
        List<DataField> ar = m4315ar(str);
        for (DataField next : list) {
            int indexOf = ar.indexOf(next);
            if (indexOf >= 0) {
                ar.set(indexOf, next);
            }
        }
        return ar;
    }

    /* renamed from: ar */
    private List<DataField> m4315ar(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            NodeList as = m4316as(str);
            for (int i = 0; i < as.getLength(); i++) {
                arrayList.add(new DataField(((Attr) as.item(i)).getValue(), (String) null, 0.0d, FieldLocation.UNDEFINED));
            }
            return arrayList;
        } catch (Exception e) {
            e.printStackTrace();
            KmcRuntimeException kmcRuntimeException = new KmcRuntimeException(ErrorInfo.KMC_GN_INTERNAL_ERROR);
            kmcRuntimeException.getErrorInfo().setErrCause(e.toString());
            throw kmcRuntimeException;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* renamed from: as */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.w3c.dom.NodeList m4316as(java.lang.String r4) throws javax.xml.xpath.XPathExpressionException, java.io.IOException, javax.xml.parsers.ParserConfigurationException, org.xml.sax.SAXException {
        /*
            r3 = this;
            javax.xml.xpath.XPathFactory r0 = javax.xml.xpath.XPathFactory.newInstance()
            javax.xml.xpath.XPath r0 = r0.newXPath()
            java.lang.String r1 = "//field[@isOutput='true' and @type='0']/@code"
            javax.xml.xpath.XPathExpression r0 = r0.compile(r1)
            java.io.File r4 = r3.m4317at(r4)
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x0029 }
            r1.<init>(r4)     // Catch:{ all -> 0x0029 }
            org.w3c.dom.Document r4 = r3.m4314a(r1)     // Catch:{ all -> 0x0027 }
            javax.xml.namespace.QName r2 = javax.xml.xpath.XPathConstants.NODESET     // Catch:{ all -> 0x0027 }
            java.lang.Object r4 = r0.evaluate(r4, r2)     // Catch:{ all -> 0x0027 }
            org.w3c.dom.NodeList r4 = (org.w3c.dom.NodeList) r4     // Catch:{ all -> 0x0027 }
            r1.close()
            return r4
        L_0x0027:
            r4 = move-exception
            goto L_0x002b
        L_0x0029:
            r4 = move-exception
            r1 = 0
        L_0x002b:
            if (r1 == 0) goto L_0x0030
            r1.close()
        L_0x0030:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C8133ef.m4316as(java.lang.String):org.w3c.dom.NodeList");
    }

    /* renamed from: a */
    private Document m4314a(FileInputStream fileInputStream) throws ParserConfigurationException, IOException, SAXException {
        return DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(fileInputStream);
    }

    /* renamed from: at */
    private File m4317at(String str) {
        File G = this.f4152Ns.mo54758G(str);
        if (G != null && G.exists()) {
            return G;
        }
        throw new KmcRuntimeException(ErrorInfo.KMC_GN_FILE_NOT_FOUND);
    }
}

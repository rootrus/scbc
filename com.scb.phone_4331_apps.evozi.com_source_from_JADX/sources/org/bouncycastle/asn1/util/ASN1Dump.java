package org.bouncycastle.asn1.util;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1ApplicationSpecific;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1UTCTime;
import org.bouncycastle.asn1.BERApplicationSpecific;
import org.bouncycastle.asn1.BEROctetString;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.BERSet;
import org.bouncycastle.asn1.BERTaggedObject;
import org.bouncycastle.asn1.DERApplicationSpecific;
import org.bouncycastle.asn1.DERBMPString;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERExternal;
import org.bouncycastle.asn1.DERGraphicString;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERT61String;
import org.bouncycastle.asn1.DERUTF8String;
import org.bouncycastle.asn1.DERVideotexString;
import org.bouncycastle.asn1.DERVisibleString;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

public class ASN1Dump {
    private static final int SAMPLE_SIZE = 32;
    private static final String TAB = "    ";

    static void _dumpAsString(String str, boolean z, ASN1Primitive aSN1Primitive, StringBuffer stringBuffer) {
        String lineSeparator;
        String str2;
        StringBuilder sb;
        String str3;
        StringBuilder sb2;
        BigInteger bigInteger;
        String str4;
        String str5;
        StringBuilder sb3;
        int i;
        while (true) {
            lineSeparator = Strings.lineSeparator();
            if (aSN1Primitive instanceof ASN1Sequence) {
                Enumeration objects = ((ASN1Sequence) aSN1Primitive).getObjects();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(TAB);
                String obj = sb4.toString();
                stringBuffer.append(str);
                stringBuffer.append(aSN1Primitive instanceof BERSequence ? "BER Sequence" : aSN1Primitive instanceof DERSequence ? "DER Sequence" : "Sequence");
                while (true) {
                    stringBuffer.append(lineSeparator);
                    while (objects.hasMoreElements()) {
                        Object nextElement = objects.nextElement();
                        if (nextElement == null || nextElement.equals(DERNull.INSTANCE)) {
                            stringBuffer.append(obj);
                            stringBuffer.append("NULL");
                        } else {
                            _dumpAsString(obj, z, nextElement instanceof ASN1Primitive ? (ASN1Primitive) nextElement : ((ASN1Encodable) nextElement).toASN1Primitive(), stringBuffer);
                        }
                    }
                    return;
                }
            } else if (aSN1Primitive instanceof ASN1TaggedObject) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(TAB);
                String obj2 = sb5.toString();
                stringBuffer.append(str);
                stringBuffer.append(aSN1Primitive instanceof BERTaggedObject ? "BER Tagged [" : "Tagged [");
                ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Primitive;
                stringBuffer.append(Integer.toString(aSN1TaggedObject.getTagNo()));
                stringBuffer.append(']');
                if (!aSN1TaggedObject.isExplicit()) {
                    stringBuffer.append(" IMPLICIT ");
                }
                stringBuffer.append(lineSeparator);
                if (aSN1TaggedObject.isEmpty()) {
                    stringBuffer.append(obj2);
                    stringBuffer.append("EMPTY");
                    break;
                }
                aSN1Primitive = aSN1TaggedObject.getObject();
                str = obj2;
            } else if (aSN1Primitive instanceof ASN1Set) {
                Enumeration objects2 = ((ASN1Set) aSN1Primitive).getObjects();
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(TAB);
                String obj3 = sb6.toString();
                stringBuffer.append(str);
                stringBuffer.append(aSN1Primitive instanceof BERSet ? "BER Set" : "DER Set");
                while (true) {
                    stringBuffer.append(lineSeparator);
                    while (objects2.hasMoreElements()) {
                        Object nextElement2 = objects2.nextElement();
                        if (nextElement2 == null) {
                            stringBuffer.append(obj3);
                            stringBuffer.append("NULL");
                        } else {
                            _dumpAsString(obj3, z, nextElement2 instanceof ASN1Primitive ? (ASN1Primitive) nextElement2 : ((ASN1Encodable) nextElement2).toASN1Primitive(), stringBuffer);
                        }
                    }
                    return;
                }
            } else {
                if (aSN1Primitive instanceof ASN1OctetString) {
                    ASN1OctetString aSN1OctetString = (ASN1OctetString) aSN1Primitive;
                    if (aSN1Primitive instanceof BEROctetString) {
                        sb3 = new StringBuilder();
                        sb3.append(str);
                        sb3.append("BER Constructed Octet String");
                        sb3.append("[");
                        i = aSN1OctetString.getOctets().length;
                    } else {
                        sb3 = new StringBuilder();
                        sb3.append(str);
                        sb3.append("DER Octet String");
                        sb3.append("[");
                        i = aSN1OctetString.getOctets().length;
                    }
                    sb3.append(i);
                    sb3.append("] ");
                    stringBuffer.append(sb3.toString());
                    if (z) {
                        str2 = dumpBinaryDataAsString(str, aSN1OctetString.getOctets());
                    }
                } else {
                    if (aSN1Primitive instanceof ASN1ObjectIdentifier) {
                        sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append("ObjectIdentifier(");
                        sb2.append(((ASN1ObjectIdentifier) aSN1Primitive).getId());
                    } else if (aSN1Primitive instanceof ASN1Boolean) {
                        sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append("Boolean(");
                        sb2.append(((ASN1Boolean) aSN1Primitive).isTrue());
                    } else {
                        if (aSN1Primitive instanceof ASN1Integer) {
                            sb2 = new StringBuilder();
                            sb2.append(str);
                            sb2.append("Integer(");
                            bigInteger = ((ASN1Integer) aSN1Primitive).getValue();
                        } else if (aSN1Primitive instanceof DERBitString) {
                            DERBitString dERBitString = (DERBitString) aSN1Primitive;
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append(str);
                            sb7.append("DER Bit String");
                            sb7.append("[");
                            sb7.append(dERBitString.getBytes().length);
                            sb7.append(", ");
                            sb7.append(dERBitString.getPadBits());
                            sb7.append("] ");
                            stringBuffer.append(sb7.toString());
                            if (z) {
                                str2 = dumpBinaryDataAsString(str, dERBitString.getBytes());
                            }
                        } else {
                            if (aSN1Primitive instanceof DERIA5String) {
                                sb = new StringBuilder();
                                sb.append(str);
                                sb.append("IA5String(");
                                str4 = ((DERIA5String) aSN1Primitive).getString();
                            } else if (aSN1Primitive instanceof DERUTF8String) {
                                sb = new StringBuilder();
                                sb.append(str);
                                sb.append("UTF8String(");
                                str4 = ((DERUTF8String) aSN1Primitive).getString();
                            } else if (aSN1Primitive instanceof DERPrintableString) {
                                sb = new StringBuilder();
                                sb.append(str);
                                sb.append("PrintableString(");
                                str4 = ((DERPrintableString) aSN1Primitive).getString();
                            } else if (aSN1Primitive instanceof DERVisibleString) {
                                sb = new StringBuilder();
                                sb.append(str);
                                sb.append("VisibleString(");
                                str4 = ((DERVisibleString) aSN1Primitive).getString();
                            } else if (aSN1Primitive instanceof DERBMPString) {
                                sb = new StringBuilder();
                                sb.append(str);
                                sb.append("BMPString(");
                                str4 = ((DERBMPString) aSN1Primitive).getString();
                            } else if (aSN1Primitive instanceof DERT61String) {
                                sb = new StringBuilder();
                                sb.append(str);
                                sb.append("T61String(");
                                str4 = ((DERT61String) aSN1Primitive).getString();
                            } else if (aSN1Primitive instanceof DERGraphicString) {
                                sb = new StringBuilder();
                                sb.append(str);
                                sb.append("GraphicString(");
                                str4 = ((DERGraphicString) aSN1Primitive).getString();
                            } else if (aSN1Primitive instanceof DERVideotexString) {
                                sb = new StringBuilder();
                                sb.append(str);
                                sb.append("VideotexString(");
                                str4 = ((DERVideotexString) aSN1Primitive).getString();
                            } else if (aSN1Primitive instanceof ASN1UTCTime) {
                                sb = new StringBuilder();
                                sb.append(str);
                                sb.append("UTCTime(");
                                str4 = ((ASN1UTCTime) aSN1Primitive).getTime();
                            } else if (aSN1Primitive instanceof ASN1GeneralizedTime) {
                                sb = new StringBuilder();
                                sb.append(str);
                                sb.append("GeneralizedTime(");
                                str4 = ((ASN1GeneralizedTime) aSN1Primitive).getTime();
                            } else {
                                if (aSN1Primitive instanceof BERApplicationSpecific) {
                                    str5 = ASN1Encoding.BER;
                                } else if (aSN1Primitive instanceof DERApplicationSpecific) {
                                    str5 = ASN1Encoding.DER;
                                } else if (aSN1Primitive instanceof ASN1Enumerated) {
                                    sb2 = new StringBuilder();
                                    sb2.append(str);
                                    sb2.append("DER Enumerated(");
                                    bigInteger = ((ASN1Enumerated) aSN1Primitive).getValue();
                                } else if (aSN1Primitive instanceof DERExternal) {
                                    DERExternal dERExternal = (DERExternal) aSN1Primitive;
                                    StringBuilder sb8 = new StringBuilder();
                                    sb8.append(str);
                                    sb8.append("External ");
                                    sb8.append(lineSeparator);
                                    stringBuffer.append(sb8.toString());
                                    StringBuilder sb9 = new StringBuilder();
                                    sb9.append(str);
                                    sb9.append(TAB);
                                    String obj4 = sb9.toString();
                                    if (dERExternal.getDirectReference() != null) {
                                        StringBuilder sb10 = new StringBuilder();
                                        sb10.append(obj4);
                                        sb10.append("Direct Reference: ");
                                        sb10.append(dERExternal.getDirectReference().getId());
                                        sb10.append(lineSeparator);
                                        stringBuffer.append(sb10.toString());
                                    }
                                    if (dERExternal.getIndirectReference() != null) {
                                        StringBuilder sb11 = new StringBuilder();
                                        sb11.append(obj4);
                                        sb11.append("Indirect Reference: ");
                                        sb11.append(dERExternal.getIndirectReference().toString());
                                        sb11.append(lineSeparator);
                                        stringBuffer.append(sb11.toString());
                                    }
                                    if (dERExternal.getDataValueDescriptor() != null) {
                                        _dumpAsString(obj4, z, dERExternal.getDataValueDescriptor(), stringBuffer);
                                    }
                                    StringBuilder sb12 = new StringBuilder();
                                    sb12.append(obj4);
                                    sb12.append("Encoding: ");
                                    sb12.append(dERExternal.getEncoding());
                                    sb12.append(lineSeparator);
                                    stringBuffer.append(sb12.toString());
                                    _dumpAsString(obj4, z, dERExternal.getExternalContent(), stringBuffer);
                                    return;
                                } else {
                                    sb = new StringBuilder();
                                    sb.append(str);
                                    str3 = aSN1Primitive.toString();
                                    sb.append(str3);
                                    sb.append(lineSeparator);
                                    str2 = sb.toString();
                                }
                                str2 = outputApplicationSpecific(str5, str, z, aSN1Primitive, lineSeparator);
                            }
                            sb.append(str4);
                            str3 = ") ";
                            sb.append(str3);
                            sb.append(lineSeparator);
                            str2 = sb.toString();
                        }
                        sb2.append(bigInteger);
                    }
                    str3 = ")";
                    sb.append(str3);
                    sb.append(lineSeparator);
                    str2 = sb.toString();
                }
                stringBuffer.append(str2);
                return;
            }
        }
        stringBuffer.append(lineSeparator);
    }

    private static String calculateAscString(byte[] bArr, int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = i; i3 != i + i2; i3++) {
            if (bArr[i3] >= 32 && bArr[i3] <= 126) {
                stringBuffer.append((char) bArr[i3]);
            }
        }
        return stringBuffer.toString();
    }

    public static String dumpAsString(Object obj) {
        return dumpAsString(obj, false);
    }

    public static String dumpAsString(Object obj, boolean z) {
        ASN1Primitive aSN1Primitive;
        StringBuffer stringBuffer = new StringBuffer();
        if (obj instanceof ASN1Primitive) {
            aSN1Primitive = (ASN1Primitive) obj;
        } else if (obj instanceof ASN1Encodable) {
            aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("unknown object type ");
            sb.append(obj.toString());
            return sb.toString();
        }
        _dumpAsString("", z, aSN1Primitive, stringBuffer);
        return stringBuffer.toString();
    }

    private static String dumpBinaryDataAsString(String str, byte[] bArr) {
        String str2;
        String lineSeparator = Strings.lineSeparator();
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(TAB);
        String obj = sb.toString();
        stringBuffer.append(lineSeparator);
        for (int i = 0; i < bArr.length; i += 32) {
            int length = bArr.length;
            stringBuffer.append(obj);
            if (length - i > 32) {
                stringBuffer.append(Strings.fromByteArray(Hex.encode(bArr, i, 32)));
                stringBuffer.append(TAB);
                str2 = calculateAscString(bArr, i, 32);
            } else {
                stringBuffer.append(Strings.fromByteArray(Hex.encode(bArr, i, bArr.length - i)));
                for (int length2 = bArr.length - i; length2 != 32; length2++) {
                    stringBuffer.append("  ");
                }
                stringBuffer.append(TAB);
                str2 = calculateAscString(bArr, i, bArr.length - i);
            }
            stringBuffer.append(str2);
            stringBuffer.append(lineSeparator);
        }
        return stringBuffer.toString();
    }

    private static String outputApplicationSpecific(String str, String str2, boolean z, ASN1Primitive aSN1Primitive, String str3) {
        ASN1ApplicationSpecific instance = ASN1ApplicationSpecific.getInstance(aSN1Primitive);
        StringBuffer stringBuffer = new StringBuffer();
        if (instance.isConstructed()) {
            try {
                ASN1Sequence instance2 = ASN1Sequence.getInstance(instance.getObject(16));
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(str);
                sb.append(" ApplicationSpecific[");
                sb.append(instance.getApplicationTag());
                sb.append("]");
                sb.append(str3);
                stringBuffer.append(sb.toString());
                Enumeration objects = instance2.getObjects();
                while (objects.hasMoreElements()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2);
                    sb2.append(TAB);
                    _dumpAsString(sb2.toString(), z, (ASN1Primitive) objects.nextElement(), stringBuffer);
                }
            } catch (IOException e) {
                stringBuffer.append(e);
            }
            return stringBuffer.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str2);
        sb3.append(str);
        sb3.append(" ApplicationSpecific[");
        sb3.append(instance.getApplicationTag());
        sb3.append("] (");
        sb3.append(Strings.fromByteArray(Hex.encode(instance.getContents())));
        sb3.append(")");
        sb3.append(str3);
        return sb3.toString();
    }
}

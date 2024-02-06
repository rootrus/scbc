package org.bouncycastle.math.p099ec.tools;

import java.io.PrintStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.TreeSet;
import org.bouncycastle.asn1.p061x9.ECNamedCurveTable;
import org.bouncycastle.asn1.p061x9.X9ECParameters;
import org.bouncycastle.crypto.p093ec.CustomNamedCurves;
import org.bouncycastle.math.p099ec.ECAlgorithms;
import org.bouncycastle.math.p099ec.ECCurve;
import org.bouncycastle.math.p099ec.ECFieldElement;
import org.bouncycastle.util.Integers;

/* renamed from: org.bouncycastle.math.ec.tools.TraceOptimizer */
public class TraceOptimizer {
    private static final BigInteger ONE = BigInteger.valueOf(1);

    /* renamed from: R */
    private static final SecureRandom f6261R = new SecureRandom();

    private static int calculateTrace(ECFieldElement eCFieldElement) {
        int fieldSize = eCFieldElement.getFieldSize();
        ECFieldElement eCFieldElement2 = eCFieldElement;
        for (int i = 1; i < fieldSize; i++) {
            eCFieldElement2 = eCFieldElement2.square();
            eCFieldElement = eCFieldElement.add(eCFieldElement2);
        }
        BigInteger bigInteger = eCFieldElement.toBigInteger();
        if (bigInteger.bitLength() <= 1) {
            return bigInteger.intValue();
        }
        throw new IllegalStateException();
    }

    private static ArrayList enumToList(Enumeration enumeration) {
        ArrayList arrayList = new ArrayList();
        while (enumeration.hasMoreElements()) {
            arrayList.add(enumeration.nextElement());
        }
        return arrayList;
    }

    public static void implPrintNonZeroTraceBits(X9ECParameters x9ECParameters) {
        ECCurve curve = x9ECParameters.getCurve();
        int fieldSize = curve.getFieldSize();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < fieldSize; i++) {
            if (calculateTrace(curve.fromBigInteger(ONE.shiftLeft(i))) != 0) {
                arrayList.add(Integers.valueOf(i));
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder();
                sb.append(" ");
                sb.append(i);
                printStream.print(sb.toString());
            }
        }
        System.out.println();
        int i2 = 0;
        while (i2 < 1000) {
            BigInteger bigInteger = new BigInteger(fieldSize, f6261R);
            int calculateTrace = calculateTrace(curve.fromBigInteger(bigInteger));
            int i3 = 0;
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                if (bigInteger.testBit(((Integer) arrayList.get(i4)).intValue())) {
                    i3 ^= 1;
                }
            }
            if (calculateTrace == i3) {
                i2++;
            } else {
                throw new IllegalStateException("Optimized-trace sanity check failed");
            }
        }
    }

    public static void main(String[] strArr) {
        TreeSet<String> treeSet = new TreeSet<>(enumToList(ECNamedCurveTable.getNames()));
        treeSet.addAll(enumToList(CustomNamedCurves.getNames()));
        for (String str : treeSet) {
            X9ECParameters byName = CustomNamedCurves.getByName(str);
            if (byName == null) {
                byName = ECNamedCurveTable.getByName(str);
            }
            if (byName != null && ECAlgorithms.isF2mCurve(byName.getCurve())) {
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(":");
                printStream.print(sb.toString());
                implPrintNonZeroTraceBits(byName);
            }
        }
    }

    public static void printNonZeroTraceBits(X9ECParameters x9ECParameters) {
        if (ECAlgorithms.isF2mCurve(x9ECParameters.getCurve())) {
            implPrintNonZeroTraceBits(x9ECParameters);
            return;
        }
        throw new IllegalArgumentException("Trace only defined over characteristic-2 fields");
    }
}

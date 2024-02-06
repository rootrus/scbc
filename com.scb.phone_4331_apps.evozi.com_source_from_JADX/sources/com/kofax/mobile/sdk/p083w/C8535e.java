package com.kofax.mobile.sdk.p083w;

import bolts.CancellationToken;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7910e;
import com.kofax.mobile.sdk.extract.p018id.DataField;
import com.kofax.mobile.sdk.p073c.C8297a;
import com.kofax.mobile.sdk.p075e.C8340a;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.w.e */
public class C8535e extends C8500ae {

    /* renamed from: PA */
    private static final String f5203PA = "Austria (AUT)";

    /* renamed from: PB */
    private static final String f5204PB = "FirstName";

    /* renamed from: PC */
    private static final String f5205PC = "FullName";

    /* renamed from: PD */
    private static final String f5206PD = "LastName";

    /* renamed from: PE */
    private static final String f5207PE = "LastName1";

    /* renamed from: Pz */
    private static final String f5208Pz = "\\bArchitekt[. -]{0,2}Mag[. -]?|\\bArchitekt[. -]{0,2}Ing[. -]?|\\bArchitekt[. -]{0,2}DI[. -]?|\\bArchitekt[. -]?|\\bBgm[. -]{0,2}Prof[. -]?|\\bBgm[. -]{0,2}Mag[. -]?|\\bBgm[. -]{0,2}Ing[. -]?|\\bBgm[. -]{0,2}Dr[. -]?|\\bBgm[. -]{0,2}Dir[. -]?|\\bBgm[. -]{0,2}DI[. -]?|\\bBgm[. -]{0,2}DDr[. -]?|\\bBgm[. -]+|\\bBez[. -]{0,2}Rat[. -]?|\\bBakk[. -]{0,2}techn[. -]?|\\bBakk[. -]{0,2}rer[. -]{0,2}soc[. -]{0,2}oec[. -]?|\\bBakk[. -]{0,2}rer[. -]{0,2}nat[. -]?|\\bBakk[. -]{0,2}phil[. -]+|\\bBakk[. -]{0,2}art[. -]+|\\bBakk[. -]{0,2}Sport[. -]?|\\bBakk[. -]{0,2}Soz[. -]+|\\bBakk[. -]{0,2}Mag[. -]+|\\bBakk[. -]{0,2}MA[. -]+|\\bBakk[. -]{0,2}Komm[. -]+|\\bBakk[. -]{0,2}Biol[. -]+|\\bBakk[. -]{0,2}\\(FH\\)|\\bBakk[. -]+|\\bBSc[. -]+|\\bBM[. -]+|\\bB[. -]{0,2}S[. -]+|\\bB[. -]{0,2}B[. -]{0,2}A[. -]+|\\bB[. -]{0,2}A[. -]+|\\bDr[. -]{0,2}theol[. -]?|\\bDr[. -]{0,2}techn[. -]?|\\bDr[. -]{0,2}scient[. -]{0,2}med[. -]?|\\bDr[. -]{0,2}rer[. -]{0,2}soc[. -]{0,2}oec[. -]?|\\bDr[. -]{0,2}rer[. -]{0,2}nat[. -]?|\\bDr[. -]{0,2}phil[. -]+|\\bDr[. -]{0,2}nat[. -]{0,2}techn[. -]?|\\bDr[. -]{0,2}mont[. -]+|\\bDr[. -]{0,2}med[. -]{0,2}vet[. -]?|\\bDr[. -]{0,2}med[. -]{0,2}univ[. -]?|\\bDr[. -]{0,2}med[. -]{0,2}dent[. -]?|\\bDr[. -]{0,2}med[. -]+|\\bDr[. -]{0,2}math[. -]+|\\bDr[. -]{0,2}iur[. -]+|\\bDr[. -]+|\\bDkmf[. -]{0,2}Mag[. -]?|\\bDkmf[. -]{0,2}Ing[. -]?|\\bDkmf[. -]{0,2}Dr[. -]?|\\bDkmf[. -]{0,2}\\(FH\\)|\\bDkmf[. -]+|\\bDkffr[. -]?|\\bDir[. -]{0,2}i[. -]{0,2}R[. -]?|\\bDir[. -]{0,2}Rat[. -]+|\\bDir[. -]{0,2}Prof[. -]+|\\bDir[. -]{0,2}OSR[. -]+|\\bDir[. -]{0,2}Mag[. -]{0,2}Dr[. -]?|\\bDir[. -]{0,2}Mag[. -]+|\\bDir[. -]{0,2}Ing[. -]+|\\bDir[. -]{0,2}Dr[. -]+|\\bDir[. -]{0,2}Dkfm[. -]?|\\bDir[. -]{0,2}DI[. -]+|\\bDir[. -]+|\\bDipl[. -]{0,2}Vw[. -]+|\\bDipl[. -]{0,2}Tierarzt[. -]?|\\bDipl[. -]{0,2}Sr[. -]+|\\bDipl[. -]{0,2}Pfleger[. -]?|\\bDipl[. -]{0,2}Pel[. -]+|\\bDipl[. -]{0,2}Pad[. -]+|\\bDipl[. -]{0,2}Ok[. -]+|\\bDipl[. -]{0,2}Ing[. -]{0,2}\\(FH\\)|\\bDipl[. -]{0,2}Ing[. -]+|\\bDipl[. -]{0,2}Dolm[. -]+|\\bDipl[. -]{0,2}Des[. -]{0,2}\\(FH\\)|\\bDipl[. -]{0,2}Dec[. -]+|\\bDipl[. -]{0,2}Chem[. -]+|\\bDipl[. -]{0,2}Bw[. -]+|\\bDipl[. -]{0,2}Arch[. -]+|\\bDipl[. -]+|\\bDI[. -]{0,2}Mag[. -]{0,2}Dr[. -]+|\\bDI[. -]{0,2}Mag[. -]+|\\bDI[. -]{0,2}Dr[. -]+|\\bDI[. -]{0,2}Dir[. -]+|\\bDI[. -]{0,2}\\(FH\\)|\\bDI[. -]+|\\bDDr[. -]+|\\bDDI[. -]{0,2}Mag[. -]+|\\bDDI[. -]?|\\bDDDr[. -]?|\\bGemeinderat[. -]+|\\bGem[. -]{0,2}Dir[. -]{0,2}Dr[. -]?|\\bGem[. -]{0,2}Dir[. -]+|\\bHofrat[. -]{0,2}Prof[. -]?|\\bHofrat[. -]{0,2}Mag[. -]{0,2}Dr[. -]?|\\bHofrat[. -]{0,2}Mag[. -]?|\\bHofrat[. -]{0,2}Ing[. -]{0,2}Dr[. -]?|\\bHofrat[. -]{0,2}Ing[. -]?|\\bHofrat[. -]{0,2}Dr[. -]?|\\bHofrat[. -]{0,2}Doz[. -]{0,2}Dr[. -]?|\\bHofrat[. -]{0,2}Dir[. -]{0,2}Mag[. -]?|\\bHofrat[. -]{0,2}Dir[. -]?|\\bHofrat[. -]{0,2}DI[. -]?|\\bHofrat[. -]{0,2}DDr[. -]?|\\bHofrat[. -]{0,2}DDDr[. -]?|\\bHofrat[. -]?|\\bInspektor[. -]?|\\bIng[. -]{0,2}Reg[. -]{0,2}Rat[. -]?|\\bIng[. -]{0,2}Prof[. -]+|\\bIng[. -]{0,2}Mag[. -]{0,2}Dr[. -]?|\\bIng[. -]{0,2}Mag[. -]+|\\bIng[. -]{0,2}Ing[. -]+|\\bIng[. -]{0,2}Dr[. -]+|\\bIng[. -]{0,2}Dir[. -]+|\\bIng[. -]{0,2}DI[. -]{0,2}\\(FH\\)|\\bIng[. -]+|\\bKomm[. -]{0,2}Rat[. -]{0,2}Mag[. -]?|\\bKomm[. -]{0,2}Rat[. -]{0,2}Ing[. -]?|\\bKomm[. -]{0,2}Rat[. -]{0,2}Dr[. -]?|\\bKomm[. -]{0,2}Rat[. -]{0,2}Dir[. -]?|\\bKomm[. -]{0,2}Rat[. -]{0,2}DI[. -]?|\\bKomm[. -]{0,2}Rat[. -]+|\\bKomm[. -]+|\\bLandesrat[. -]{0,2}Dr[. -]?|\\bLandesrat[. -]?|\\bLL[. -]{0,2}M[. -]+|\\bMr[. -]+|\\bMin[. -]{0,2}Rat[. -]{0,2}Dr[. -]?|\\bMin[. -]{0,2}Rat[. -]{0,2}DI[. -]?|\\bMin[. -]{0,2}Rat[. -]+|\\bMed[. -]{0,2}Rat[. -]{0,2}Dr[. -]?|\\bMed[. -]{0,2}Rat[. -]{0,2}DI[. -]?|\\bMed[. -]{0,2}Rat[. -]+|\\bMag[. -]{0,2}theol[. -]?|\\bMag[. -]{0,2}rer[. -]{0,2}nat[. -]?|\\bMag[. -]{0,2}phil[. -]{0,2}fac[. -]{0,2}theol[. -]?|\\bMag[. -]{0,2}phil[. -]+|\\bMag[. -]{0,2}pharm[. -]+|\\bMag[. -]{0,2}med[. -]{0,2}vet[. -]?|\\bMag[. -]{0,2}jur[. -]+|\\bMag[. -]{0,2}iur[. -]{0,2}soc[. -]{0,2}oec[. -]?|\\bMag[. -]{0,2}iur[. -]+|\\bMag[. -]{0,2}des[. -]{0,2}ind[. -]?|\\bMag[. -]{0,2}art[. -]+|\\bMag[. -]{0,2}arch[. -]+|\\bMag[. -]{0,2}Sport[. -]?|\\bMag[. -]{0,2}Soz[. -]+|\\b(Mag[. -]{0,2})?Mag[. -]{0,2}rer[. -]{0,2}soc[. -]{0,2}oec[. -]?|\\bMag[. -]{0,2}MSc[. -]?|\\bMag[. -]{0,2}MBA[. -]?|\\bMag[. -]{0,2}Komm[. -]+|\\bMag[. -]{0,2}Ing[. -]+|\\bMag[. -]{0,2}Dr[. -]+|\\bMag[. -]{0,2}Di[. -]+|\\bMag[. -]{0,2}DDr[. -]?|\\bMag[. -]{0,2}DDI[. -]?|\\bMag[. -]{0,2}Biol[. -]?|\\bMag[. -]{0,2}Architekt[. -]?|\\bMag[. -]{0,2}\\(FH\\)|\\bMag[. -]+|\\bMSc[. -]+|\\bMPOS[. -]+|\\bMPH[. -]+|\\bMMag[. -]{0,2}Dr[. -]?|\\bMMag[. -]?|\\bMMMag[. -]{0,2}DDr[. -]?|\\bMIB[. -]+|\\bMAS[. -]+|\\bM[. -]{0,2}E[. -]{0,2}S[. -]+|\\bM[. -]{0,2}B[. -]{0,2}L[. -]+|\\bM[. -]{0,2}B[. -]{0,2}A[. -]+|\\bM[. -]{0,2}A[. -]+|\\bOberamtsrat[. -]{0,2}Dr[. -]+|\\bOberamtsrat[. -]?|\\bOStR[. -]{0,2}Prof[. -]?|\\bOStR[. -]{0,2}Mag[. -]?|\\bOStR[. -]{0,2}Dr[. -]?|\\bOStR[. -]{0,2}Dir[. -]?|\\bOStR[. -]+|\\bOSR[. -]{0,2}Prof[. -]+|\\bOSR[. -]{0,2}Dr[. -]+|\\bOSR[. -]{0,2}Dir[. -]+|\\bOSR[. -]{0,2}DI[. -]+|\\bOSR[. -]+|\\bORR[. -]{0,2}Dr[. -]+|\\bOMed[. -]{0,2}Rat[. -]{0,2}Dr[. -]?|\\bOMed[. -]{0,2}Rat[. -]?|\\bProkurist[. -]?|\\bProk[. -]{0,2}Mag[. -]{0,2}Dr[. -]?|\\bProk[. -]{0,2}Mag[. -]+|\\bProk[. -]{0,2}Ing[. -]+|\\bProk[. -]{0,2}Dr[. -]+|\\bProk[. -]{0,2}Dkfm[. -]+|\\bProk[. -]{0,2}DI[. -]+|\\bProfessor[. -]?|\\bProf[. -]{0,2}Mag[. -]{0,2}Dr[. -]?|\\bProf[. -]{0,2}Mag[. -]+|\\bProf[. -]{0,2}Ing[. -]+|\\bProf[. -]{0,2}Dr[. -]+|\\bProf[. -]{0,2}Dkfm[. -]?|\\bProf[. -]{0,2}Dir[. -]+|\\bProf[. -]{0,2}DI[. -]{0,2}Dr[. -]?|\\bProf[. -]{0,2}DI[. -]+|\\bProf[. -]{0,2}DDr[. -]?|\\bProf[. -]{0,2}DDDr[. -]?|\\bProf[. -]+|\\bPrimarius[. -]{0,2}Dr[. -]?|\\bPrimarius[. -]?|\\bPrimaria[. -]{0,2}Dr[. -]?|\\bPrimaria[. -]?|\\bPh[. -]{0,2}D[. -]+|\\bPfarrer[. -]{0,2}Prof[. -]?|\\bPfarrer[. -]{0,2}Mag[. -]?|\\bPfarrer[. -]{0,2}Dr[. -]?|\\bPfarrer[. -]?|\\bPater[. -]{0,2}OSB[. -]?|\\bPater[. -]{0,2}Mag[. -]?|\\bPater[. -]{0,2}Dr[. -]?|\\bPater[. -]+|\\bPastor[. -]?|\\bRektor[. -]{0,2}Mag[. -]{0,2}Dr[. -]?|\\bRektor[. -]{0,2}Mag[. -]?|\\bRektor[. -]{0,2}Dr[. -]?|\\bRektor[. -]{0,2}DI[. -]{0,2}Dr[. -]?|\\bRektor[. -]{0,2}DI[. -]?|\\bReg[. -]{0,2}Rat[. -]{0,2}Ing[. -]?|\\bReg[. -]{0,2}Rat[. -]{0,2}Dr[. -]?|\\bReg[. -]{0,2}Rat[. -]+|\\bStudienrat[. -]?|\\bUniv[. -]{0,2}Prof[. -]{0,2}Dr[. -]+|\\bUniv[. -]{0,2}Prof[. -]{0,2}DI[. -]{0,2}Dr[. -]+|\\bUniv[. -]{0,2}Prof[. -]?|\\bUniv[. -]{0,2}Doz[. -]{0,2}Dr[. -]+|\\bUniv[. -]{0,2}Doz[. -]?";

    /* renamed from: Lu */
    private final C7910e f5209Lu;

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo55143a(Object obj, CancellationToken cancellationToken) {
        super.mo55143a(obj, cancellationToken);
    }

    @HmlPinActivity
    public C8535e(C7910e eVar) {
        this.f5209Lu = eVar;
    }

    /* renamed from: a */
    public void mo55390a(C8340a aVar) {
        String c = m5291c(aVar.mo55129hu());
        if (c != null && c.startsWith(f5203PA)) {
            m5292f(f5204PB, aVar.mo55134hz());
            m5292f(f5205PC, aVar.mo55134hz());
            m5292f(f5206PD, aVar.mo55134hz());
            m5292f(f5207PE, aVar.mo55134hz());
        }
    }

    /* renamed from: f */
    private void m5292f(String str, List<DataField> list) {
        DataField g = m5293g(str, list);
        if (g != null) {
            String object = g.getObject();
            String D = m5290D(f5208Pz, object);
            if (!object.equals(D)) {
                list.remove(g);
                list.add(new DataField(g.getName(), D, g.getConfidence(), g.getLocation()));
            }
        }
    }

    /* renamed from: g */
    private DataField m5293g(String str, List<DataField> list) {
        if (list == null) {
            return null;
        }
        return this.f5209Lu.mo54315a(str, list);
    }

    /* renamed from: D */
    private static String m5290D(String str, String str2) {
        Matcher matcher = Pattern.compile(str, 2).matcher(str2);
        StringBuffer stringBuffer = new StringBuffer(str2.length());
        while (matcher.find()) {
            matcher.appendReplacement(stringBuffer, "");
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString().trim();
    }

    /* renamed from: c */
    private static String m5291c(C8297a aVar) {
        if (aVar == null) {
            return null;
        }
        return aVar.getClassId();
    }
}

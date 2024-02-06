package p040o;

import android.content.res.Resources;
import com.scb.phone.domain.errors.RetrofitException;
import p040o.AlertController$RecycleListView;
import p040o.ILocationSourceDelegate;
import p040o.writeUInt64NoTag;

/* renamed from: o.dE */
public final class C4241dE extends writeUInt64NoTag<getRegionName$MediaBrowserCompat$CustomActionResultReceiver> {
    final Resources IconCompatParcelizer;
    public String MediaBrowserCompat$ItemReceiver;
    private final newReaderSupplier MediaBrowserCompat$MediaItem;
    /* access modifiers changed from: private */
    public boolean MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */
    public final getIdType MediaMetadataCompat;
    public String read;
    public final checkKeyValue write;

    /* renamed from: o.dE$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        final /* synthetic */ C4241dE read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(C4241dE dEVar) {
            super(1);
            this.read = dEVar;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str;
            ILocationSourceDelegate.zza zza;
            Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "throwable");
            ILocationSourceDelegate iLocationSourceDelegate = ((RetrofitException) th).IconCompatParcelizer;
            if (iLocationSourceDelegate == null || (zza = iLocationSourceDelegate.write) == null) {
                str = null;
            } else {
                str = zza.IconCompatParcelizer;
            }
            if (str != null) {
                int hashCode = str.hashCode();
                boolean z = true;
                if (hashCode != 1567100) {
                    if (hashCode == 1567134 && str.equals("3045")) {
                        final String string = this.read.IconCompatParcelizer.getString(Iterables$3$MediaBrowserCompat$MediaItem.fatca_error_label_title);
                        onGetStartedClick.IconCompatParcelizer((Object) string, "resources.getString(R.st….fatca_error_label_title)");
                        final String string2 = this.read.IconCompatParcelizer.getString(Iterables$3$MediaBrowserCompat$MediaItem.auto_touchpoints_user_is_not_eligible_to_open_account);
                        onGetStartedClick.IconCompatParcelizer((Object) string2, "resources.getString(R.st…eligible_to_open_account)");
                        C4241dE dEVar = this.read;
                        writeUInt64NoTag.IconCompatParcelizer r2 = new writeUInt64NoTag.IconCompatParcelizer<getRegionName$MediaBrowserCompat$CustomActionResultReceiver>(this) {
                            private /* synthetic */ IconCompatParcelizer read;

                            {
                                this.read = r1;
                            }

                            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                                getRegionName$MediaBrowserCompat$CustomActionResultReceiver getregionname_mediabrowsercompat_customactionresultreceiver = (getRegionName$MediaBrowserCompat$CustomActionResultReceiver) obj;
                                getregionname_mediabrowsercompat_customactionresultreceiver.aj_();
                                getregionname_mediabrowsercompat_customactionresultreceiver.read(C4241dE.IconCompatParcelizer(this.read.read, string, string2, (Integer) null, (Integer) null, false), false);
                            }
                        };
                        if (dEVar.RatingCompat == null) {
                            z = false;
                        }
                        if (z) {
                            r2.IconCompatParcelizer(dEVar.RatingCompat);
                        }
                        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                    }
                } else if (str.equals("3032")) {
                    final String string3 = this.read.IconCompatParcelizer.getString(Iterables$3$MediaBrowserCompat$MediaItem.auto_touchpoints_national_id_not_found_title);
                    onGetStartedClick.IconCompatParcelizer((Object) string3, "resources.getString(R.st…ional_id_not_found_title)");
                    final String string4 = this.read.IconCompatParcelizer.getString(Iterables$3$MediaBrowserCompat$MediaItem.auto_touchpoints_national_id_not_found_description);
                    onGetStartedClick.IconCompatParcelizer((Object) string4, "resources.getString(R.st…id_not_found_description)");
                    C4241dE dEVar2 = this.read;
                    writeUInt64NoTag.IconCompatParcelizer r22 = new writeUInt64NoTag.IconCompatParcelizer<getRegionName$MediaBrowserCompat$CustomActionResultReceiver>(this) {
                        private /* synthetic */ IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;

                        {
                            this.MediaBrowserCompat$CustomActionResultReceiver = r1;
                        }

                        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                            getRegionName$MediaBrowserCompat$CustomActionResultReceiver getregionname_mediabrowsercompat_customactionresultreceiver = (getRegionName$MediaBrowserCompat$CustomActionResultReceiver) obj;
                            getregionname_mediabrowsercompat_customactionresultreceiver.aj_();
                            getregionname_mediabrowsercompat_customactionresultreceiver.read(C4241dE.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver.read, string3, string4, Integer.valueOf(Iterables$3$MediaBrowserCompat$ItemReceiver.ic_nid_not_found), 120, true), true);
                        }
                    };
                    if (dEVar2.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        r22.IconCompatParcelizer(dEVar2.RatingCompat);
                    }
                    return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                }
            }
            this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new Runnable(this) {
                private /* synthetic */ IconCompatParcelizer IconCompatParcelizer;

                {
                    this.IconCompatParcelizer = r1;
                }

                public final void run() {
                    C4241dE dEVar = this.IconCompatParcelizer.read;
                    writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C42445.write;
                    if (dEVar.RatingCompat != null) {
                        iconCompatParcelizer.IconCompatParcelizer(dEVar.RatingCompat);
                    }
                }
            }));
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.dE$write */
    public static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<setBuildingsEnabled, HmlVerifyPhoneValidateOtpActivity> {
        final /* synthetic */ C4241dE MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ String read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public write(C4241dE dEVar, String str) {
            super(1);
            this.MediaBrowserCompat$ItemReceiver = dEVar;
            this.read = str;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            setBuildingsEnabled setbuildingsenabled = (setBuildingsEnabled) obj;
            onGetStartedClick.write((Object) setbuildingsenabled, "touchPointUser");
            C4241dE.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver);
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) "0", (Object) setbuildingsenabled.write) || this.MediaBrowserCompat$ItemReceiver.MediaMetadataCompat.read()) {
                C4241dE.write(this.MediaBrowserCompat$ItemReceiver, this.read, setbuildingsenabled);
            } else {
                final String string = this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.getString(Iterables$3$MediaBrowserCompat$MediaItem.auto_touchpoints_liveness_check_title);
                onGetStartedClick.IconCompatParcelizer((Object) string, "resources.getString(R.st…nts_liveness_check_title)");
                final String string2 = this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.getString(Iterables$3$MediaBrowserCompat$MediaItem.auto_touchpoints_liveness_check_description);
                onGetStartedClick.IconCompatParcelizer((Object) string2, "resources.getString(R.st…veness_check_description)");
                C4241dE dEVar = this.MediaBrowserCompat$ItemReceiver;
                writeUInt64NoTag.IconCompatParcelizer r2 = new writeUInt64NoTag.IconCompatParcelizer<getRegionName$MediaBrowserCompat$CustomActionResultReceiver>(this) {
                    private /* synthetic */ write IconCompatParcelizer;

                    {
                        this.IconCompatParcelizer = r1;
                    }

                    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                        ((getRegionName$MediaBrowserCompat$CustomActionResultReceiver) obj).read(C4241dE.IconCompatParcelizer(this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver, string, string2, Integer.valueOf(Iterables$3$MediaBrowserCompat$ItemReceiver.ic_device_not_support), 120, false), false);
                    }
                };
                if (dEVar.RatingCompat != null) {
                    r2.IconCompatParcelizer(dEVar.RatingCompat);
                }
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C4241dE(checkKeyValue checkkeyvalue, TaskCompletionSource$MediaBrowserCompat$ItemReceiver taskCompletionSource$MediaBrowserCompat$ItemReceiver, getIdType getidtype, newReaderSupplier newreadersupplier, Resources resources, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) checkkeyvalue, "controller");
        onGetStartedClick.write((Object) taskCompletionSource$MediaBrowserCompat$ItemReceiver, "formatCitizenCase");
        onGetStartedClick.write((Object) getidtype, "iDeviceCompatibilityHelper");
        onGetStartedClick.write((Object) newreadersupplier, "touchPointInputCidDisplayMapper");
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        this.write = checkkeyvalue;
        this.MediaMetadataCompat = getidtype;
        this.MediaBrowserCompat$MediaItem = newreadersupplier;
        this.IconCompatParcelizer = resources;
    }

    public final void IconCompatParcelizer(String str, boolean z) {
        onGetStartedClick.write((Object) str, "citizenId");
        this.read = null;
        boolean z2 = false;
        boolean z3 = (str.length() > 0) && str.length() == 17;
        this.MediaBrowserCompat$SearchResultReceiver = z3;
        if (!z && z3) {
            this.read = AlertController$RecycleListView.read.MediaBrowserCompat$CustomActionResultReceiver(str);
        }
        writeUInt64NoTag.IconCompatParcelizer de_mediabrowsercompat_customactionresultreceiver = new dE$MediaBrowserCompat$CustomActionResultReceiver(this, z);
        if (this.RatingCompat != null) {
            z2 = true;
        }
        if (z2) {
            de_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public static final /* synthetic */ setFilename IconCompatParcelizer(C4241dE dEVar, String str, String str2, Integer num, Integer num2, boolean z) {
        setFilename setfilename = new setFilename();
        setfilename.MediaBrowserCompat$SearchResultReceiver = dEVar.IconCompatParcelizer.getString(Iterables$3$MediaBrowserCompat$MediaItem.ntb_ekyc_title);
        setfilename.MediaMetadataCompat = str;
        setfilename.IconCompatParcelizer = str2;
        setfilename.MediaBrowserCompat$CustomActionResultReceiver = dEVar.IconCompatParcelizer.getString(Iterables$3$MediaBrowserCompat$MediaItem.auto_touchpoints_find_scb_button);
        setfilename.read = z;
        setfilename.MediaBrowserCompat$ItemReceiver = false;
        if (num != null) {
            setfilename.MediaDescriptionCompat = num.intValue();
        }
        if (num2 != null) {
            setfilename.RatingCompat = num2.intValue();
        }
        return setfilename;
    }

    public static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(C4241dE dEVar) {
        if (dEVar.RatingCompat != null) {
            dEVar.RatingCompat.aj_();
        }
    }

    public static final /* synthetic */ void write(C4241dE dEVar, String str, setBuildingsEnabled setbuildingsenabled) {
        String str2;
        String str3;
        newReaderSupplier newreadersupplier = dEVar.MediaBrowserCompat$MediaItem;
        String str4 = dEVar.MediaBrowserCompat$ItemReceiver;
        if (str4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mobileNumber");
        }
        onGetStartedClick.write((Object) str, "cid");
        onGetStartedClick.write((Object) str4, "mobileNumber");
        onGetStartedClick.write((Object) setbuildingsenabled, "touchPointUser");
        setIndoorEnabled setindoorenabled = setbuildingsenabled.MediaBrowserCompat$CustomActionResultReceiver;
        C10839getFilename getfilename = null;
        if (setindoorenabled != null) {
            str2 = setindoorenabled.MediaBrowserCompat$ItemReceiver;
        } else {
            str2 = null;
        }
        setIndoorEnabled setindoorenabled2 = setbuildingsenabled.MediaBrowserCompat$CustomActionResultReceiver;
        if (setindoorenabled2 != null) {
            str3 = setindoorenabled2.write;
        } else {
            str3 = null;
        }
        String str5 = setbuildingsenabled.write;
        boolean z = false;
        if (!(str2 == null || str3 == null || str5 == null)) {
            if (str5.length() > 0) {
                String c_ = newreadersupplier.mo26549c_(str3);
                onGetStartedClick.IconCompatParcelizer((Object) c_, "transformAssetUrl(logoPath)");
                getfilename = new C10839getFilename(str, str4, str2, c_, str5);
            }
        }
        if (getfilename != null) {
            writeUInt64NoTag.IconCompatParcelizer de_mediabrowsercompat_itemreceiver = new dE$MediaBrowserCompat$ItemReceiver(getfilename);
            if (dEVar.RatingCompat != null) {
                z = true;
            }
            if (z) {
                de_mediabrowsercompat_itemreceiver.IconCompatParcelizer(dEVar.RatingCompat);
            }
        }
    }
}

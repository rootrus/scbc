package p040o;

import okhttp3.HttpUrl;

/* renamed from: o.FragmentBuilder_BindTouchPointWifiSettingsFragment$MediaBrowserCompat$MediaItem */
final class C6852xd2d69633 extends CheckEligibilityActivity implements DiscoverActivity<String, String, FragmentBuilder_BindVerifyIdentityFragment, String, String, FragmentBuilder_BindInvestmentFragment> {
    public static final C6852xd2d69633 IconCompatParcelizer = new C6852xd2d69633();

    C6852xd2d69633() {
        super(5);
    }

    public final /* synthetic */ Object read(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return write((String) obj, (String) obj2, (FragmentBuilder_BindVerifyIdentityFragment) obj3, (String) obj4, (String) obj5);
    }

    private static FragmentBuilder_BindInvestmentFragment write(String str, String str2, FragmentBuilder_BindVerifyIdentityFragment fragmentBuilder_BindVerifyIdentityFragment, String str3, String str4) {
        FragmentBuilder_BindInvestmentDetailsFragment fragmentBuilder_BindInvestmentDetailsFragment;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            return null;
        }
        CharSequence charSequence2 = str2;
        if (charSequence2 == null || charSequence2.length() == 0) {
            return null;
        }
        CharSequence charSequence3 = str3;
        if (charSequence3 == null || charSequence3.length() == 0) {
            return null;
        }
        CharSequence charSequence4 = str4;
        if ((charSequence4 == null || charSequence4.length() == 0) || fragmentBuilder_BindVerifyIdentityFragment == null || fragmentBuilder_BindVerifyIdentityFragment == FragmentBuilder_BindVerifyIdentityFragment.RUNTIME) {
            return null;
        }
        int i = FragmentBuilder_BindTransferFavouriteTargetFragment.read[fragmentBuilder_BindVerifyIdentityFragment.ordinal()];
        if (i == 1) {
            fragmentBuilder_BindInvestmentDetailsFragment = FragmentBuilder_BindInvestmentDetailsFragment.IN_THE_WORKS;
        } else if (i != 2) {
            fragmentBuilder_BindInvestmentDetailsFragment = FragmentBuilder_BindInvestmentDetailsFragment.IN_THE_WORKS;
        } else {
            fragmentBuilder_BindInvestmentDetailsFragment = FragmentBuilder_BindInvestmentDetailsFragment.LAUNCHPAD;
        }
        try {
            FragmentBuilder_BindInputDetailsFragment fragmentBuilder_BindInputDetailsFragment = new FragmentBuilder_BindInputDetailsFragment();
            fragmentBuilder_BindInputDetailsFragment.MediaBrowserCompat$ItemReceiver = str;
            fragmentBuilder_BindInputDetailsFragment.MediaBrowserCompat$CustomActionResultReceiver = str2;
            fragmentBuilder_BindInputDetailsFragment.write = fragmentBuilder_BindInvestmentDetailsFragment;
            fragmentBuilder_BindInputDetailsFragment.read = str3;
            fragmentBuilder_BindInputDetailsFragment.IconCompatParcelizer = str4;
            String str5 = fragmentBuilder_BindInputDetailsFragment.MediaBrowserCompat$ItemReceiver;
            if (str5 != null) {
                String str6 = fragmentBuilder_BindInputDetailsFragment.read;
                if (str6 != null) {
                    String str7 = fragmentBuilder_BindInputDetailsFragment.IconCompatParcelizer;
                    if (str7 != null) {
                        String str8 = fragmentBuilder_BindInputDetailsFragment.MediaBrowserCompat$CustomActionResultReceiver;
                        if (str8 != null) {
                            FragmentBuilder_BindInvestmentDetailsFragment fragmentBuilder_BindInvestmentDetailsFragment2 = fragmentBuilder_BindInputDetailsFragment.write;
                            if (fragmentBuilder_BindInvestmentDetailsFragment2 != null) {
                                if (str5.contains(".")) {
                                    str5 = str5.split("\\.")[0];
                                }
                                String lowerCase = str5.toLowerCase();
                                boolean z = !"na5".equals(lowerCase) && !"eu2".equals(lowerCase);
                                boolean equals = "onedemo".equals(lowerCase);
                                String str9 = "Interaction%20Studio";
                                if (z && (!equals)) {
                                    str9 = String.format("Thunderhead%%20%s", new Object[]{str5.toUpperCase()});
                                } else if (equals) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str9);
                                    sb.append("%20");
                                    sb.append(str5.toUpperCase());
                                    str9 = sb.toString();
                                }
                                return new FragmentBuilder_BindInvestmentFragment(HttpUrl.parse(String.format("https://mc.exacttarget.com/cloud/#app/%s/one/app/%%23/%s/test/monitor?tid=%s&spaceId=%s&snapshot=%s&autoRefresh&monitorMe=false&selectedSnapshotType=%s&panels=0:data_adapter:customerMetaData:default:,1:::default:,2:::default:&summaryPanelExpanded&ck=", new Object[]{str9, str6, str7, str6, str8, fragmentBuilder_BindInvestmentDetailsFragment2.toString()})));
                            }
                            throw new IllegalStateException("snapshotType == null");
                        }
                        throw new IllegalStateException("snapshot == null");
                    }
                    throw new IllegalStateException("tid == null");
                }
                throw new IllegalStateException("workspaceId == null");
            }
            throw new IllegalStateException("host == null");
        } catch (Exception unused) {
            return null;
        }
    }
}

package com.android.component.library.router;

/**
 * @author tangqi
 * @since 2018/11/24 23:50
 */
public class RouterScheme {
    /**
     * Module name
     */
    private static final String AROUTER_MODULE_A = "/a/";
    private static final String AROUTER_MODULE_B = "/b/";

    /**
     * Host name
     */
    public interface Host {
        String FEATURE_A = "featureA";

        String FEATURE_B = "featureB";
    }

    /**
     * Page name
     */
    public interface PAGE {
        String FEATURE_A = AROUTER_MODULE_A + Host.FEATURE_A;
        String FEATURE_B = AROUTER_MODULE_B + Host.FEATURE_B;
    }
}

package org.markdownwriterfx.util;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * Created by zeng on 2015-12-14.
 */
public class ResUtil {
    static ResourceBundle rb;
    public static String getString(String key){
        try {
            return ResourceBundle.getBundle("bundles.LangBundle").getString(key);
        }catch (MissingResourceException e){
            try {
                return ResourceBundle.getBundle("bundles.LangBundle", new Locale("en")).getString(key);
            }catch (MissingResourceException e1){
                return key;
            }
        }
    }
}

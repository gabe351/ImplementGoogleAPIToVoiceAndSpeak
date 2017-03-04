package com.gabrielrosadn.livecodding;

import static java.lang.Thread.sleep;

/**
 * Created by gabrielrosa on 02/03/17.
 */

public class TestUtils {

    public static void waitEspresso(long milles) {
        try {
            sleep(milles);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

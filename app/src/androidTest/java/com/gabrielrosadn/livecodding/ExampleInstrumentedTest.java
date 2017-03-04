package com.gabrielrosadn.livecodding;

import android.content.Context;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static com.gabrielrosadn.livecodding.TestUtils.waitEspresso;
import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Rule
    public ActivityTestRule<MainActivity>
            mActivity = new ActivityTestRule<>(MainActivity.class, true, false);
    @Before
    public void setup(){
        Intent i = new Intent();
        mActivity.launchActivity(i);
    }

    @Test
    public void useAppContext() throws Exception {
        onView(withId(R.id.textview1)).check(matches(isDisplayed()));
    }
}

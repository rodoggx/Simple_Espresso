package com.example.simplerecyclerview;

import android.support.test.espresso.contrib.RecyclerViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by evin on 4/29/16.
 */
@RunWith(AndroidJUnit4.class)
public class RecyclerTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testRecyclerClick() {
        onView(withId(R.id.a_main_recycler))
                .perform(RecyclerViewActions.scrollToPosition(2), RecyclerViewActions.actionOnItemAtPosition(2, click()));

        onView(withId(R.id.a_main_text))
                .check(matches(withText("Cruel!")));
    }
}

package ru.kkuzmichev.simpleappforespresso.ui;
import androidx.test.espresso.IdlingResource;
import androidx.test.espresso.idling.CountingIdlingResource;
public class EspressoIdlingResources {
    private static final String RESOURCE = "GLOBAL";
    public static CountingIdlingResource idlingResource = new CountingIdlingResource(RESOURCE);
    public static void increment() { idlingResource.increment();}
    public static void decrement() {
        if(!idlingResource.isIdleNow()) {
            idlingResource.decrement();
        }
    }
    public static IdlingResource getIdlingResources() { return idlingResource;}
}


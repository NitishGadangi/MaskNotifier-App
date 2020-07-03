package com.nitish.masknotifier;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.shashank.sony.fancywalkthroughlib.FancyWalkthroughActivity;
import com.shashank.sony.fancywalkthroughlib.FancyWalkthroughCard;

import java.util.ArrayList;
import java.util.List;

public class WalkThrough extends FancyWalkthroughActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_walk_through);

        FancyWalkthroughCard fancywalkthroughCard1 = new FancyWalkthroughCard("Welcome \uD83D\uDC4B", "Wearing a face mask will help prevent the spread of infection and prevent the individual from contracting any airborne infectious germs.",R.drawable.one);
        FancyWalkthroughCard fancywalkthroughCard2 = new FancyWalkthroughCard("Do you forget ?", "WHO advices everyone to wear mask, every time you move out to any public area. However, it is quite common to forget.",R.drawable.two);
        FancyWalkthroughCard fancywalkthroughCard3 = new FancyWalkthroughCard("This app will help you !", "This app will use Geo-Fencing to notify you to wear mask, every time you are moving out of your teritory.",R.drawable.three);

        fancywalkthroughCard1.setBackgroundColor(R.color.colorGreen);
        fancywalkthroughCard1.setIconLayoutParams(600,500,250,0,0,0);
        fancywalkthroughCard2.setBackgroundColor(R.color.colorGreen);
        fancywalkthroughCard2.setIconLayoutParams(600,500,250,0,0,0);
        fancywalkthroughCard3.setBackgroundColor(R.color.colorGreen);
        fancywalkthroughCard3.setIconLayoutParams(600,500,250,0,0,0);

        List<FancyWalkthroughCard> pages = new ArrayList<>();

        pages.add(fancywalkthroughCard1);
        pages.add(fancywalkthroughCard2);
        pages.add(fancywalkthroughCard3);


        for (FancyWalkthroughCard page : pages) {
            page.setTitleColor(R.color.black);
//            fancywalkthroughCard4.setBackgroundColor(R.color.white);
            page.setDescriptionColor(R.color.black);
        }

        setFinishButtonTitle("Set Geo-Fence");
        showNavigationControls(true);
        setColorBackground(R.color.white);
        //setImageBackground(R.drawable.restaurant);
        setInactiveIndicatorColor(R.color.grey_600);
        setActiveIndicatorColor(R.color.white);
        setOnboardPages(pages);

    }

    @Override
    public void onFinishButtonPressed() {
        startActivity(new Intent(getApplicationContext(),SetGeoFence.class));
    }
}
